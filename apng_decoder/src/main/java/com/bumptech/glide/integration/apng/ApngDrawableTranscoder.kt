package com.bumptech.glide.integration.apng

import android.graphics.Bitmap
import android.util.DisplayMetrics
import com.bumptech.glide.integration.apng.decoder.Apng
import com.bumptech.glide.integration.apng.decoder.ApngDrawable
import com.bumptech.glide.integration.apng.decoder.ApngState
import com.bumptech.glide.load.Options
import com.bumptech.glide.load.engine.Resource
import com.bumptech.glide.load.resource.SimpleResource
import com.bumptech.glide.load.resource.transcode.ResourceTranscoder

/**
 * Convert the [Apng]'s internal representation to an Android-compatible one ([ApngDrawable]).
 */
class ApngDrawableTranscoder : ResourceTranscoder<Apng, ApngDrawable> {

    override fun transcode(
        toTranscode: Resource<Apng>,
        options: Options
    ): Resource<ApngDrawable> {
        val apng = toTranscode.get()
        val width = apng.width
        val height = apng.height
        val density: Int = if (width < 1 && height < 1) {
            DisplayMetrics.DENSITY_DEFAULT
        } else {
            Bitmap.DENSITY_NONE
        }
        val apngState = ApngState(
            apng,
            width,
            height,
            density
        )
        val drawable = apngState.newDrawable() as ApngDrawable
        return SimpleResource(drawable)
    }
}
