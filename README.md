# OnlinePlayersPlugin

## 🌟 Overview
**OnlinePlayersPlugin** is a Minecraft server plugin that provides an HTTP API to query the list of online players and retrieve their avatars using Mojang's API. This plugin is ideal for server administrators who want to integrate player data into external tools or websites.

---

## 🚀 Features
- **Simple HTTP API**: Query online players and retrieve their names and avatar URLs.
- **JSON Response**: Returns player information in standard JSON format.
- **Avatar Integration**: Uses Mojang and Crafatar APIs for player avatars.
- **Lightweight HTTP Server**: Powered by Spark framework.

---

## 📖 API Endpoint
### `/players`
- **Method**: `GET`
- **Description**: Fetches a JSON array of online players with their names and avatar URLs.
- **Response Example**:
  ```json
  [
    {
      "name": "Player1",
      "avatarUrl": "https://crafatar.com/avatars/<UUID>?size=64"
    },
    {
      "name": "Player2",
      "avatarUrl": "https://crafatar.com/avatars/<UUID>?size=64"
    }
  ]
  ```

---

## 🛠️ Installation
1. **Download the Plugin**: Get the JAR file from the [Releases](#).
2. **Add to Plugins Folder**: Place the JAR file into your Minecraft server's `plugins` directory.
3. **Restart the Server**: Start or restart your server to activate the plugin.

---

## ⚙️ Configuration
- No additional configuration required.
- The plugin runs on port `8001` by default.

---

## 📋 Dependencies
- [Spark Framework](https://sparkjava.com/): For the HTTP server.
- [Gson](https://github.com/google/gson): For JSON handling.
- [Mojang API](https://mojang.com/): To fetch player UUIDs.
- [Crafatar](https://crafatar.com/): To fetch player avatars.

---

## 📡 Usage
1. **Run Your Server**: Start your Minecraft server with the plugin installed.
2. **Access the API**: Visit:
   ```
   http://<server-ip>:8001/players
   ```
3. **View JSON Response**: The endpoint will return a list of currently online players.

---

## 👨‍💻 Development
### Building from Source
1. Clone the repository:
   ```bash
   git clone https://github.com/Oakflat/OnlinePlayersPlugin-oakflat.git
   ```
2. Open the project in your IDE.
3. Build the project using your preferred build tool (e.g., Maven or Gradle).

### Contributing
Contributions are welcome! Feel free to open issues or submit pull requests to improve this plugin.

---

## 📜 License
This project is licensed under the **MIT License**. See the `LICENSE` file for details.

---

## 📧 Contact
For questions or support, contact:
- **Email**: lianheliping@gmail.com
- **GitHub Issues**: Open an issue in the [repository](https://github.com/Oakflat/OnlinePlayersPlugin-oakflat).

---

_🎮 Enjoy managing your Minecraft server with ease!_

