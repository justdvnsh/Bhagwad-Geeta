package divyansh.tech.bhagwad_geeta.models.gson.shlokas


import com.google.gson.annotations.SerializedName

data class Verses(
    @SerializedName("abhinav")
    val abhinav: Abhinav,
    @SerializedName("adi")
    val adi: Adi,
    @SerializedName("anand")
    val anand: Anand,
    @SerializedName("chapter")
    val chapter: Int, // 1
    @SerializedName("chinmay")
    val chinmay: Chinmay,
    @SerializedName("dhan")
    val dhan: Dhan,
    @SerializedName("gambir")
    val gambir: Gambir,
    @SerializedName("_id")
    val id: String, // BG1.2
    @SerializedName("jaya")
    val jaya: Jaya,
    @SerializedName("madhav")
    val madhav: Madhav,
    @SerializedName("ms")
    val ms: Ms,
    @SerializedName("neel")
    val neel: Neel,
    @SerializedName("purohit")
    val purohit: Purohit,
    @SerializedName("puru")
    val puru: Puru,
    @SerializedName("raman")
    val raman: Raman,
    @SerializedName("rams")
    val rams: Rams,
    @SerializedName("san")
    val san: San,
    @SerializedName("sankar")
    val sankar: Sankar,
    @SerializedName("siva")
    val siva: Siva,
    @SerializedName("slok")
    val slok: String, // सञ्जय उवाच |दृष्ट्वा तु पाण्डवानीकं व्यूढं दुर्योधनस्तदा |आचार्यमुपसंगम्य राजा वचनमब्रवीत् ||१-२||
    @SerializedName("srid")
    val srid: Srid,
    @SerializedName("tej")
    val tej: Tej,
    @SerializedName("transliteration")
    val transliteration: String, // sañjaya uvāca .dṛṣṭvā tu pāṇḍavānīkaṃ vyūḍhaṃ duryodhanastadā .ācāryamupasaṃgamya rājā vacanamabravīt ||1-2||
    @SerializedName("vallabh")
    val vallabh: Vallabh,
    @SerializedName("venkat")
    val venkat: Venkat,
    @SerializedName("verse")
    val verse: Int // 2
)