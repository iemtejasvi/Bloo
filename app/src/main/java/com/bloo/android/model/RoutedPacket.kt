package com.bloo.android.model

import com.bloo.android.protocol.BlooPacket

/**
 * Represents a routed packet with additional metadata
 * Used for processing and routing packets in the mesh network
 */
data class RoutedPacket(
    val packet: BlooPacket,
    val peerID: String? = null,           // Who sent it (parsed from packet.senderID)
    val relayAddress: String? = null,     // Address it came from (for avoiding loopback)
    val transferId: String? = null        // Optional stable transfer ID for progress tracking
)
