# Add project specific ProGuard rules here.
# You can control the set of applied configuration files using the
# proguardFiles setting in build.gradle.
-keep class com.bloo.android.protocol.** { *; }
-keep class com.bloo.android.crypto.** { *; }
-dontwarn org.bouncycastle.**
-keep class org.bouncycastle.** { *; }

# Keep SecureIdentityStateManager from being obfuscated to prevent reflection issues
-keep class com.bloo.android.identity.SecureIdentityStateManager {
    private android.content.SharedPreferences prefs;
    *;
}

# Keep all classes that might use reflection
-keep class com.bloo.android.favorites.** { *; }
-keep class com.bloo.android.nostr.** { *; }
-keep class com.bloo.android.identity.** { *; }

# Arti (Tor) ProGuard rules
-keep class info.guardianproject.arti.** { *; }
-keep class org.torproject.jni.** { *; }
-keepnames class org.torproject.jni.**
-dontwarn info.guardianproject.arti.**
-dontwarn org.torproject.jni.**
