package divyansh.tech.bhagwad_geeta.data.models.Verses


import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

data class Tej(
    @Json(name = "author")
    val author: String, // Swami Tejomayananda
    @Json(name = "ht")
    val ht: String // ।।1.2।।संजय ने कहा -- पाण्डव-सैन्य की व्यूह रचना देखकर राजा दुर्योधन ने आचार्य द्रोण के पास जाकर ये वचन कहे।
)