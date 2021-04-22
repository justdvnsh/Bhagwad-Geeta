package divyansh.tech.bhagwad_geeta.models.gson.shlokas


import com.google.gson.annotations.SerializedName

data class Siva(
    @SerializedName("author")
    val author: String, // Swami Sivananda
    @SerializedName("ec")
    val ec: String, // 1.2 दृष्ट्वा having seen? तु indeed? पाण्डवानीकम् the army of the Pandavas? व्यूढम् drawn up in battlearray? दुर्योधनः Duryodhana? तदा then? आचार्यम् the teacher? उपसङ्गम्य having approached? राजा the king? वचनम् speech? अब्रवीत् said.No Commentary.
    @SerializedName("et")
    val et: String // 1.2. Sanjaya said  Having seen the army of the Pandavas drawn up in battle-array,King Duryodhana then approached his teacher (Drona) and spoke these words.
)