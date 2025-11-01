# Bloo Android Privacy Policy

_Last Updated: 1 November 2025_

Bloo for Android (the “Service”) is maintained by **Tejasvi Sharma** and distributed under the MIT License. This policy describes how the Service handles your data and what choices you have.

## Guiding Principles

- **No central servers** – Bloo is peer-to-peer; there is no hosted backend collecting your data.
- **No account creation** – You never provide phone numbers, email addresses, or passwords.
- **Open source transparency** – Anyone can audit the code at <https://github.com/iemtejasvi/Bloo>.

## Information Stored on Your Device

All long-lived data remains on your device:

1. **Identity keys** – Generated on first launch and stored locally so you can recognise trusted peers. You can regenerate them at any time.
2. **Nicknames** – The name you choose is saved on-device and shared only with peers you chat with.
3. **Message history** – Stored locally when a channel owner enables retention. You may clear it manually or via the emergency wipe.
4. **Favorites & settings** – Preferences such as favourite peers, theme, and permission states remain on your device.

## Temporary Runtime Data

While the app is running, Bloo may temporarily keep:

- Active peer connection details
- Routing metadata required to deliver packets
- Cached messages awaiting offline peers (released within 12 hours)

This information is cleared when the app closes or the cache window expires.

## Optional Relays & Internet Use

Bluetooth mesh messaging functions entirely offline. If you enable geohash channels or Tor support, traffic can route through volunteer relays. Those relays are independent third parties with their own policies—review them before opting in.

## Permissions Explained

| Permission | Purpose |
| --- | --- |
| **Bluetooth** | Required to discover and connect with nearby Bloo peers. |
| **Location** | Android mandates location access for Bluetooth LE scanning. Bloo never records or transmits your GPS coordinates. |
| **Notifications** | Shows incoming messages and nearby peer alerts entirely on-device. |
| **Microphone (optional)** | Requested only when you choose to record a voice note. |

## Encryption & Security

- Private direct messages use X25519 key exchange with AES-256-GCM encryption.
- Channel chats can be protected with Argon2id-derived shared keys when owners set passwords.
- Keys and sensitive metadata live in Android’s encrypted storage. Use the emergency wipe (triple-tap the Bloo logo) to purge them instantly.

## Data Retention & Deletion

All Bloo data is stored locally. You can delete it by:

1. Using the in-app emergency wipe gesture (triple-tap the logo).
2. Clearing Bloo’s storage via Android settings.
3. Uninstalling the application.

Bloo does not create remote backups unless you export data manually.

## Children’s Privacy

The Service is not directed at children under 13 and does not knowingly collect data about minors.

## Changes to This Policy

Material updates will be announced in release notes and committed to the repository. Review the Git history to track revisions.

## Contact

For privacy questions, disclosures, or security reports, open an issue or discussion at <https://github.com/iemtejasvi/Bloo> or reach Tejasvi Sharma directly through the repository profile.

---

Made with privacy in mind by Tejasvi Sharma.