package org.example.Online;

import org.bukkit.Bukkit;
import org.bukkit.entity.Player;
import org.bukkit.plugin.java.JavaPlugin;
import spark.Spark;

import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import com.google.gson.Gson;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;

public class OnlinePlayersPlugin extends JavaPlugin {

    @Override
    public void onEnable() {
        getLogger().info("OnlinePlayersPlugin 已启动");

        // 启动 HTTP 服务
        startHttpServer();
    }

    @Override
    public void onDisable() {
        getLogger().info("OnlinePlayersPlugin 已停止");

        // 停止 HTTP 服务
        Spark.stop();
    }

    private void startHttpServer() {
        Spark.port(8001); // 设git --version
        //设置 HTTP 服务端口

        // 定义一个路由获取在线玩家信息
        Spark.get("/players", (req, res) -> {
            res.type("application/json");
            return getOnlinePlayersJson();
        });
    }

    private String getOnlinePlayersJson() {
        // 使用 Gson 库生成标准 JSON
        List<Map<String, String>> players = Bukkit.getOnlinePlayers().stream()
                .map(player -> {
                    Map<String, String> playerInfo = new HashMap<>();
                    playerInfo.put("name", player.getName());
                    playerInfo.put("avatarUrl", getAvatarUrl(player.getName()));
                    return playerInfo;
                })
                .collect(Collectors.toList());

        return new Gson().toJson(players); // 返回标准 JSON 格式
    }

    private String getAvatarUrl(String playerName) {
        try {
            // 调用 Mojang API 获取 UUID
            URL url = new URL("https://api.mojang.com/users/profiles/minecraft/" + playerName);
            HttpURLConnection conn = (HttpURLConnection) url.openConnection();
            conn.setRequestMethod("GET");
            conn.setConnectTimeout(5000);
            conn.setReadTimeout(5000);

            if (conn.getResponseCode() == 200) {
                JsonObject json = JsonParser.parseReader(new InputStreamReader(conn.getInputStream())).getAsJsonObject();
                String uuid = json.get("id").getAsString();
                // 构造头像 URL
                return "https://crafatar.com/avatars/" + uuid + "?size=64";
            }
        } catch (Exception e) {
            getLogger().warning("获取玩家头像失败: " + e.getMessage());
        }
        // 返回默认头像 URL
        return "https://crafatar.com/avatars/steve?size=64";
    }
}
