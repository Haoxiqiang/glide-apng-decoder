package com.bumptech.glide.integration.apng;


import androidx.annotation.NonNull;
import com.bumptech.glide.integration.apng.decoder.Apng;
import com.bumptech.glide.load.Options;
import com.bumptech.glide.load.ResourceDecoder;
import com.bumptech.glide.load.engine.Resource;
import com.bumptech.glide.load.resource.SimpleResource;
import java.io.IOException;
import java.io.InputStream;

/** Decodes an Apng internal representation from an {@link java.io.InputStream}. */
public class ApngInputStreamDecoder implements ResourceDecoder<InputStream, Apng> {

    @Override
    public boolean handles(@NonNull InputStream source, @NonNull Options options) {
        try {
            return Apng.Companion.isApng(source);
        } catch (Throwable e) {
            e.printStackTrace();
            return false;
        }
    }

    public Resource<Apng> decode(
            @NonNull InputStream source, int width, int height, @NonNull Options options)
            throws IOException {
        try {
            Apng apng = Apng.Companion.decode(source);
            return new SimpleResource<>(apng);
        } catch (Throwable e) {
            throw new IOException("Cannot load APNG from stream", e);
        }
    }
}
