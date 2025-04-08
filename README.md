# mingManhunt

A highly customizable Minecraft Manhunt plugin with innovative mechanics, quick world regeneration, and advanced configuration features.

---

## 📚 What I Learned

While developing **mingManhunt**, I learned:

- How to design an algorithm to spawn players naturally within a specific radius around another player.
- Full control over regenerating worlds on-the-fly without restarting the server.
- How to link custom worlds using portals with the help of APIs.

---

## 🛠️ Features

- ⚡ Instantly regenerate the world with a single command, no server restart needed.
- 🔧 Easily configurable game settings via a user-friendly interface.
- ⏸️ Game can be paused and resumed — pausing freezes all players and halts world progression. Automatically pauses if a runner disconnects.

---

## 🔧 Configurable Settings

- Toggle distance display for hunters
- Modify explosive damage (Beds in Nether, Anchors in Overworld)
- Enable/disable "Near Spawn" respawn mode for hunters
- Enable/disable Friendly Fire between team members
- Enable private team chat: prefix messages with `!` to broadcast to all
- Configure mob loot rates for important mobs:
  - Blaze Rod drop rate (Blazes)
  - Ender Pearl drop rate (Endermen)
  - Bartering luck with Piglins

---

## 🎯 Objective

Two teams: **Runners** and **Hunters**.

- **Runners** must finish Minecraft by defeating the Ender Dragon.
- **Hunters** must stop them by tracking and killing them before they complete the game.

Runners progress through key structures and dimensions, while hunters chase them relentlessly.

---

## 💬 Commands

| Command            | Description                                                  |
|--------------------|--------------------------------------------------------------|
| `/start`           | Start the game                                               |
| `/pause`           | Pause the game (freezes players and world)                  |
| `/resume`          | Resume a paused game                                         |
| `/regen`           | Regenerate the world after a game                            |
| `/settings`        | Open the configuration interface                            |
| `/runner`          | Join the Runners team                                        |
| `/hunter`          | Join the Hunters team                                        |
| `/spectator`       | Become a spectator                                           |

*Note: Commands like `/start`, `/pause`, `/resume`, `/regen`, and `/settings` require OP permissions.*

---

## ✅ Compatibility

- Minecraft 1.13+
- Paper / Spigot-based servers

---

## 📂 Installation

1. Download the latest `.jar` from the [Releases](https://github.com/mingolino/mingManhunt/releases).
2. Place it in your server’s `/plugins` folder.
3. Restart or reload your server.
4. Configure as needed using `/settings`.

---

## 🤝 Contribute

Have suggestions or want to help improve the plugin?
- Submit an [issue](https://github.com/mingolino/mingManhunt/issues)
- Open a pull request!

---

## 📄 License

This plugin is licensed under the **Creative Commons Attribution-NonCommercial-NoDerivatives 4.0 International (CC BY-NC-ND 4.0)**.

You are free to:
- Share — copy and redistribute the material in any medium or format

Under the following terms:
- **Attribution** — You must give appropriate credit.
- **NonCommercial** — You may not use the material for commercial purposes.
- **NoDerivatives** — If you remix, transform, or build upon the material, you may not distribute the modified material.

For more details, see the full license text in the LICENSE file.
