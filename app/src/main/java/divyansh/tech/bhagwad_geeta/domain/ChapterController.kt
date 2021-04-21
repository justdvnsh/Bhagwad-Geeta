package divyansh.tech.bhagwad_geeta.domain

import com.airbnb.epoxy.TypedEpoxyController
import divyansh.tech.bhagwad_geeta.models.chapters.ChapterItem

class ChapterController: TypedEpoxyController<List<ChapterItem>>() {

    private lateinit var chapters: List<ChapterItem>


    override fun buildModels(data: List<ChapterItem>) {
        data.forEach {
            
        }
    }

    private fun addChapterItem(chapter: ChapterItem) {

    }
}