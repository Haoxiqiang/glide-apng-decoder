package com.bumptech.glide.integration.apng.sample

import android.os.Bundle
import android.view.View
import android.widget.ImageView
import androidx.appcompat.app.AppCompatActivity
import androidx.appcompat.widget.AppCompatImageView
import com.bumptech.glide.Glide

class ImageTestActivity : AppCompatActivity() {

	override fun onCreate(savedInstanceState: Bundle?) {
		super.onCreate(savedInstanceState)
		setContentView(R.layout.activity_image_test)

		val image = findViewById<AppCompatImageView>(R.id.image)

		findViewById<View>(R.id.apng).setOnClickListener {
			setImage(image, R.raw.test)
		}
	}

	private fun setImage(image: ImageView, res: Int) {
		Glide.with(image)
			.asDrawable()
			.load(res)
			.into(image)
	}
}