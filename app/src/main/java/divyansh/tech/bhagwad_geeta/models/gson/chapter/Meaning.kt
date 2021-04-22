package divyansh.tech.bhagwad_geeta.models.gson.chapter


import com.google.gson.annotations.SerializedName

data class Meaning(
    @SerializedName("en")
    val en: String, // Yoga through the Perfection of Renunciation and Surrender
    @SerializedName("hi")
    val hi: String // उपसंहार-संन्यास की सिद्धि
)