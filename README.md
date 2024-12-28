OnlinePlayersPlugin

Overview

OnlinePlayersPlugin is a Minecraft server plugin that provides an HTTP API to query the list of online players and retrieve their avatars using Mojang's API. This plugin is ideal for server administrators who want to integrate player data into external tools or websites.

Features

Provides a simple HTTP API endpoint to query online players.

Returns player names and their corresponding avatar URLs in JSON format.

Uses Spark framework for the HTTP server.

Retrieves player avatars from Mojang's API and Crafatar.

API Endpoint

/players

Method: GET

Description: Returns a JSON array of online players with their names and avatar URLs.

Response Example:

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

Installation

Download the plugin JAR file from the Releases section.

Place the JAR file into the plugins folder of your Minecraft server.

Start or restart the server to activate the plugin.

Configuration

No additional configuration is required. The plugin runs on port 8001 by default.

Dependencies

Spark Framework: Used for the HTTP server.

Gson: Used for JSON handling.

Mojang API: To fetch player UUIDs.

Crafatar: To fetch player avatars.

Usage

Start your Minecraft server with the plugin installed.

Access the API endpoint at:



http://:8001/players

3. The endpoint will return a JSON list of currently online players.

---

## Development
### Building from Source
1. Clone the repository:
   ```bash
   git clone https://github.com/Oakflat/OnlinePlayersPlugin.git

Open the project in your IDE.

Build the project using your preferred build tool (e.g., Maven or Gradle).

Contributing

Contributions are welcome! Feel free to open issues or submit pull requests.

License

This project is licensed under the MIT License. See the LICENSE file for details.

Contact

For questions or support, contact lianheliping@gmail.com or open an issue in the GitHub repository.

