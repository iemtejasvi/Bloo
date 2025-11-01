<p align="center">
    <img src="docs/assets/bloo-icon.png" alt="Bloo icon" width="220">
</p>

> [!NOTE]
> Bloo is an evolving community project. Audit the source and evaluate your threat model before adopting it for sensitive missions.

# Bloo for Android

Bloo delivers resilient messaging without depending on cellular towers or the public internet. Devices create a spontaneous mesh over Bluetooth LE, relaying encrypted chats, file transfers, and announcements. When a data connection is available, Bloo can optionally lean on Nostr relays to bridge distant peers through geolocation channels.

The Android app is maintained by **Tejasvi Sharma** and remains protocol-aligned with the open-source iOS implementation so mixed-device groups can converse without friction.

## Quick Links

| Resource | URL |
| --- | --- |
| Project home | <https://github.com/iemtejasvi/Bloo> |
| Issue tracker | <https://github.com/iemtejasvi/Bloo/issues> |
| Discussions | <https://github.com/iemtejasvi/Bloo/discussions> |
| Releases / APK downloads | <https://github.com/iemtejasvi/Bloo/releases> |

## Highlights

- **Mesh-first connectivity** – Auto-discovers nearby devices and forms multi-hop routes.
- **End-to-end privacy** – Noise-based encryption protects DMs and passworded channels.
- **Geohash communities** – Join location-scoped rooms through optional Nostr relays.
- **Emergency data wipe** – Triple-tap the title to instantly purge on-device secrets.
- **Compose UI** – Built with the latest Android design patterns, light and dark themes.
- **Power-aware scanning** – Dynamically adapts Bluetooth duties to match battery state.

## Getting Started

### Install from Releases
1. Grab the newest APK from the [Releases](https://github.com/iemtejasvi/Bloo/releases) page.
2. Allow installs from your browser or file manager if Android prompts for permission.
3. Launch Bloo and grant the requested Bluetooth, location, and notification permissions so peers can see you.

### Build It Yourself

```bash
git clone https://github.com/iemtejasvi/Bloo.git
cd Bloo
./gradlew assembleDebug
adb install -r app/build/outputs/apk/debug/app-debug.apk
```

Run `./gradlew assembleRelease` to produce a release bundle or APK, then sign it with your own keys before sideloading or publishing.

## Developer Toolkit

- Android Studio Ladybug (2024.2.1) or newer recommended
- Android SDK 26+
- Kotlin 1.9+
- Uses the Gradle Wrapper (no global Gradle install required)

Common commands:

| Task | Command |
| --- | --- |
| Build debug variant | `./gradlew assembleDebug` |
| Install on a device | `./gradlew installDebug` |
| Unit tests | `./gradlew test` |
| Lint | `./gradlew lint` |
| Release bundle | `./gradlew bundleRelease` |

## Architecture Overview

- **BlooApplication** wires up Tor integration, dependency graph, and background services at launch.
- **BluetoothMeshService** orchestrates scanning, connections, packet routing, and store-and-forward.
- **BlooMessage/BlooPacket** model the binary protocol shared with other platforms.
- **NoiseEncryptionService** encapsulates Noise handshakes for private payloads.
- **GossipSyncManager** coordinates announcement gossip, deduplication, and queue persistence.
- **Compose-based UI** provides chat, sidebar, geohash picker, and media experiences.

Dive into the [`docs/`](docs/) directory for protocol notes, routing strategies, and subsystem deep dives.

## Security & Privacy

- No central servers: everything flows peer-to-peer unless you opt into relays.
- Default volatility: chats live in memory unless a channel owner enforces retention.
- Tor integration: Bloo can tunnel relay traffic through Tor for greater anonymity.
- Cover traffic: randomized delays and padding make passive analysis harder.

## Contributing

Feedback, bug reports, and pull requests are welcome. When opening PRs, describe the motivation, summarize changes, and list the tests you ran. Security disclosures should go directly to **Tejasvi Sharma** instead of public issues.

## License

Bloo is available under the MIT License — see [LICENSE.md](LICENSE.md) for the grant.

---

Made with ❤️ by Tejasvi Sharma.
