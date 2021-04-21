package divyansh.tech.bhagwad_geeta.data.models.Verses


import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

data class Siva(
    @Json(name = "author")
    val author: String, // Swami Sivananda
    @Json(name = "ec")
    val ec: String, // 1.2 दृष्ट्वा having seen? तु indeed? पाण्डवानीकम् the army of the Pandavas? व्यूढम् drawn up in battlearray? दुर्योधनः Duryodhana? तदा then? आचार्यम् the teacher? उपसङ्गम्य having approached? राजा the king? वचनम् speech? अब्रवीत् said.No Commentary.
    @Json(name = "et")
    val et: String // 1.2. Sanjaya said  Having seen the army of the Pandavas drawn up in battle-array,King Duryodhana then approached his teacher (Drona) and spoke these words.
)