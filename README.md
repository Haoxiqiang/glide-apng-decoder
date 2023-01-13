# glide-apng-decoder

An apng decoder wrapper for glide.

drawable code from [line's apng-drawable](https://github.com/line/apng-drawable)

### How To Use

```kotlin
// apng support.
registry
	.prepend(
		InputStream::class.java,
		Apng::class.java,
		ApngInputStreamDecoder()
	)

registry.register(
	Apng::class.java,
	ApngDrawable::class.java,
	ApngDrawableTranscoder()
)

```

### DEV

```bash
// upgrade libpng use download_libpng_and_apply_apng_patch which from line's apng-drawable.
./download_libpng_and_apply_apng_patch.sh 1.6.39
```