package divyansh.tech.bhagwad_geeta.models.gson.shlokas


import com.google.gson.annotations.SerializedName

data class Tej(
    @SerializedName("author")
    val author: String, // Swami Tejomayananda
    @SerializedName("ht")
    val ht: String // ।।1.2।।संजय ने कहा -- पाण्डव-सैन्य की व्यूह रचना देखकर राजा दुर्योधन ने आचार्य द्रोण के पास जाकर ये वचन कहे।
)