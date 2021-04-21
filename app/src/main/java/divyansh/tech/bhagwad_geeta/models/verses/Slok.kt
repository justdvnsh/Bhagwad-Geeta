package divyansh.tech.bhagwad_geeta.models.verses


import com.squareup.moshi.Json

data class Slok(
    @Json(name = "abhinav")
    val abhinav: Abhinav,
    @Json(name = "adi")
    val adi: Adi,
    @Json(name = "anand")
    val anand: Anand,
    @Json(name = "chapter")
    val chapter: Int, // 1
    @Json(name = "chinmay")
    val chinmay: Chinmay,
    @Json(name = "dhan")
    val dhan: Dhan,
    @Json(name = "gambir")
    val gambir: Gambir,
    @Json(name = "_id")
    val id: String, // BG1.2
    @Json(name = "jaya")
    val jaya: Jaya,
    @Json(name = "madhav")
    val madhav: Madhav,
    @Json(name = "ms")
    val ms: Ms,
    @Json(name = "neel")
    val neel: Neel,
    @Json(name = "purohit")
    val purohit: Purohit,
    @Json(name = "puru")
    val puru: Puru,
    @Json(name = "raman")
    val raman: Raman,
    @Json(name = "rams")
    val rams: Rams,
    @Json(name = "san")
    val san: San,
    @Json(name = "sankar")
    val sankar: Sankar,
    @Json(name = "siva")
    val siva: Siva,
    @Json(name = "slok")
    val slok: String, // सञ्जय उवाच |दृष्ट्वा तु पाण्डवानीकं व्यूढं दुर्योधनस्तदा |आचार्यमुपसंगम्य राजा वचनमब्रवीत् ||१-२||
    @Json(name = "srid")
    val srid: Srid,
    @Json(name = "tej")
    val tej: Tej,
    @Json(name = "transliteration")
    val transliteration: String, // sañjaya uvāca .dṛṣṭvā tu pāṇḍavānīkaṃ vyūḍhaṃ duryodhanastadā .ācāryamupasaṃgamya rājā vacanamabravīt ||1-2||
    @Json(name = "vallabh")
    val vallabh: Vallabh,
    @Json(name = "venkat")
    val venkat: Venkat,
    @Json(name = "verse")
    val verse: Int // 2
)