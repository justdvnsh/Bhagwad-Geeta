package divyansh.tech.bhagwad_geeta.models.gson.shlokas


import com.google.gson.annotations.SerializedName

data class Madhav(
    @SerializedName("author")
    val author: String, // Sri Madhavacharya
    @SerializedName("sc")
    val sc: String // ।।1.2।।Sri Madhvacharya  did not comment on this sloka. The commentary starts from 2.11.
)