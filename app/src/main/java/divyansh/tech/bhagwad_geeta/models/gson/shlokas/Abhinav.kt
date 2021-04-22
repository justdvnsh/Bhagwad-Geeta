package divyansh.tech.bhagwad_geeta.models.gson.shlokas


import com.google.gson.annotations.SerializedName

data class Abhinav(
    @SerializedName("author")
    val author: String, // Sri Abhinav Gupta
    @SerializedName("et")
    val et: String, // 1.2 – 1.9  Why this exhaustive counting? The reality of things is this:
    @SerializedName("sc")
    val sc: String // ।।1.2  1.9।।किं वा अनेन बहुपरिगणनेन (K omits बहु  )। इदं तावद्वस्तुतत्त्वम् इत्याह  ।
)