// AUTOGENERATED FILE - DO NOT MODIFY!
// This file generated by Djinni from open_pgp.djinni

package ch.protonmail.android.utils.nativelib;

import androidx.annotation.NonNull;

public final class SrpProofs {

    /*package*/ final byte[] mClientEphemeral;

    /*package*/ final byte[] mClientProof;

    /*package*/ final byte[] mExpectedServerProof;

    public SrpProofs(@NonNull byte[] clientEphemeral, @NonNull byte[] clientProof,
                     @NonNull byte[] expectedServerProof) {
        this.mClientEphemeral = clientEphemeral;
        this.mClientProof = clientProof;
        this.mExpectedServerProof = expectedServerProof;
    }

    @NonNull
    public byte[] getClientEphemeral() {
        return mClientEphemeral;
    }

    @NonNull
    public byte[] getClientProof() {
        return mClientProof;
    }

    @NonNull
    public byte[] getExpectedServerProof() {
        return mExpectedServerProof;
    }

    @Override
    public String toString() {
        return "SrpProofs{" + "mClientEphemeral=" + mClientEphemeral + "," + "mClientProof=" + mClientProof
            + "," + "mExpectedServerProof=" + mExpectedServerProof + "}";
    }

}
