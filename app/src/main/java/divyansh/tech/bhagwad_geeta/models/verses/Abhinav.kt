package divyansh.tech.bhagwad_geeta.models.verses


import com.squareup.moshi.Json

data class Abhinav(
    @Json(name = "author")
    val author: String, // Sri Abhinav Gupta
    @Json(name = "et")
    val et: String, // 1.2 – 1.9  Why this exhaustive counting? The reality of things is this:
    @Json(name = "sc")
    val sc: String // ।।1.2  1.9।।किं वा अनेन बहुपरिगणनेन (K omits बहु  )। इदं तावद्वस्तुतत्त्वम् इत्याह  ।
)