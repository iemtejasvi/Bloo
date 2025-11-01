<p align="center">
    <img src="https://github.com/user-attachments/assets/188c42f8-d249-4a72-b27a-e2b4f10a00a8" alt="Bloo Android Logo" width="320">
</p>

> [!WARNING]
> Bloo has not yet undergone an external security review. Do not rely on it for sensitive communications until you have independently evaluated the security posture.

# Bloo for Android

Bloo is a secure, decentralized, peer-to-peer messaging app that uses Bluetooth mesh networking to keep you connected even when the internet is unavailable. No accounts, phone numbers, or servers are required—just encrypted communication between nearby devices. Geohash channels extend Bloo with an optional internet relay, letting you reach other people in your area when connectivity is available.

The Android app is maintained by **Tejasvi Sharma** and stays protocol-compatible with the original open-source iOS implementation so Android and iOS users can communicate seamlessly.

## Repository & Support

- **Source Code**: <https://github.com/iemtejasvi/Bloo>
- **Issues & Feature Requests**: <https://github.com/iemtejasvi/Bloo/issues>
- **Discussions**: <https://github.com/iemtejasvi/Bloo/discussions>

## Installation

Binaries are published on the [GitHub Releases page](https://github.com/iemtejasvi/Bloo/releases). Each release provides:

1. **Universal APK** for side-loading
2. **SHA256 checksums** for verification

### Manual Install

1. **Download** the latest `apk` from the releases page.
2. **Enable unknown sources** on your device (Settings → Security → Install unknown apps).
3. **Install & launch** the downloaded package. Bloo will immediately start discovering peers and relays.

### Build From Source

```bash
git clone https://github.com/iemtejasvi/Bloo.git
cd Bloo
./gradlew assembleDebug
adb install -r app/build/outputs/apk/debug/app-debug.apk
```

For release builds run `./gradlew assembleRelease` and sign the resulting APK/AAB with your release keys.

## License

Bloo is licensed under the MIT License. See [LICENSE.md](LICENSE.md) for the full text.

```
Copyright (c) Tejasvi Sharma

Permission is hereby granted, free of charge, to any person obtaining a copy
of this software and associated documentation files (the "Software"), to deal
in the Software without restriction, including without limitation the rights
to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
copies of the Software, and to permit persons to whom the Software is
furnished to do so, subject to the following conditions:

The above copyright notice and this permission notice shall be included in all
copies or substantial portions of the Software.

THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE
SOFTWARE.
```

## Features

- 🔗 **Cross-platform** — Fully interoperable with the iOS implementation
- 📡 **Decentralized mesh** — Automatic discovery and multi-hop relays over Bluetooth LE
- 🔐 **End-to-end encryption** — X25519 + AES-256-GCM for private messages, Argon2id-secured channels
- 🛰️ **Geohash channels** — Meet people nearby using optional internet relays
- 🧹 **Emergency wipe** — Triple-tap the logo to wipe all locally stored data
- 🌓 **Material Design 3 UI** — Compose-based interface with dark and light themes
- ⚡ **Power aware** — Adaptive scanning modes to maximise battery life

## Developer Environment

- **Android Studio**: Ladybug (2024.2.1) or newer recommended
- **Android SDK**: API 26 or later (builds target latest stable API)
- **Kotlin**: 1.9+
- **Gradle**: Uses Gradle Wrapper (no local install required)

### Common Tasks

| Task | Command |
| --- | --- |
| Build debug APK | `./gradlew assembleDebug` |
| Install debug build | `./gradlew installDebug` |
| Run unit tests | `./gradlew test` |
| Lint | `./gradlew lint` |
| Bundle release | `./gradlew bundleRelease` |

## Architecture Highlights

- **BlooApplication** — Initializes Tor, mesh services, and preferences
- **BluetoothMeshService** — Handles BLE discovery, connections, and packet routing
- **BlooMessage & BlooPacket** — Binary protocol models shared with iOS
- **NoiseEncryptionService** — Wraps Noise framework for encrypted payloads
- **GossipSyncManager** — Synchronises announcement gossip and store-and-forward queues
- **Compose UI** — Modern, reactive interface with dedicated screens for mesh, geohash, and private chats

Refer to the [`docs/`](docs/) folder for deep dives into routing, gossip sync, device management, and file transfer internals.

## Privacy & Security

- **No central servers** — All communication happens directly between peers or via community relays
- **Ephemeral defaults** — Messages reside only in volatile storage unless retention is explicitly enabled
- **Tor support** — Optional integration routes internet traffic through Tor for enhanced privacy
- **Cover traffic** — Randomised delays and padding make traffic analysis more difficult

## Contributing

Contributions are welcome! Please:

1. Fork the repository and create feature branches from `main`.
2. Ensure code passes lint and tests (`./gradlew lint test`).
3. Follow Kotlin & Compose style used in the project.
4. Submit a PR describing the motivation, high-level changes, and testing performed.

For security-sensitive issues, email Tejasvi Sharma privately instead of using public issue trackers.

## Acknowledgements

Bloo builds upon the original Bloo protocol and its open-source community. Huge thanks to the pioneers who made decentralized mesh messaging possible.

---

Made with ❤️ by Tejasvi Sharma.
