package com.bloo.android

import android.app.Application
import com.bloo.android.nostr.RelayDirectory
import com.bloo.android.ui.theme.ThemePreferenceManager
import com.bloo.android.net.TorManager

/**
 * Main application class for bloo Android
 */
class BlooApplication : Application() {
    
    override fun onCreate() {
        super.onCreate()
        
        // Initialize Tor first so any early network goes over Tor
        try { TorManager.init(this) } catch (_: Exception) { }

        // Initialize relay directory (loads assets/nostr_relays.csv)
        RelayDirectory.initialize(this)

        // Initialize LocationNotesManager dependencies early so sheet subscriptions can start immediately
        try { com.bloo.android.nostr.LocationNotesInitializer.initialize(this) } catch (_: Exception) { }

        // Initialize favorites persistence early so MessageRouter/NostrTransport can use it on startup
        try {
            com.bloo.android.favorites.FavoritesPersistenceService.initialize(this)
        } catch (_: Exception) { }

        // Warm up Nostr identity to ensure npub is available for favorite notifications
        try {
            com.bloo.android.nostr.NostrIdentityBridge.getCurrentNostrIdentity(this)
        } catch (_: Exception) { }

        // Initialize theme preference
        ThemePreferenceManager.init(this)

        // Initialize debug preference manager (persists debug toggles)
        try { com.bloo.android.ui.debug.DebugPreferenceManager.init(this) } catch (_: Exception) { }

        // TorManager already initialized above
    }
}
