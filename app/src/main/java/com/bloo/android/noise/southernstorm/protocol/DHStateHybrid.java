package com.bloo.android.noise.southernstorm.protocol;

/**
 * Additional API for DH objects that need special handling for
 * hybrid operations.
 */
public interface DHStateHybrid extends DHState {

	/**
	 * Generates a new random keypair relative to the parameters
	 * in another object.
	 * 
	 * @param remote The remote party in this communication to obtain parameters.
	 * 
	 * @throws IllegalStateException The other or remote DH object does not have
	 * the same type as this object.
	 */
	void generateKeyPair(DHState remote);

	/**
	 * Copies the key values from another DH object of the same type.
	 * 
	 * @param other The other DH object to copy from
	 * @param remote The remote party in this communication to obtain parameters.
	 * 
	 * @throws IllegalStateException The other or remote DH object does not have
	 * the same type as this object.
	 */
	void copyFrom(DHState other, DHState remote);
	
	/**
	 * Specifies the local peer object prior to setting a public key
	 * on a remote object.
	 * 
	 * @param local The local peer object.
	 */
	void specifyPeer(DHState local);
}
