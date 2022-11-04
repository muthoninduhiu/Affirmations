package com.soni.affirmations.data

import com.soni.affirmations.R
import com.soni.affirmations.model.AffirmationsModel

class DataSource {
    fun loadAffirmations():List<AffirmationsModel>{
        return listOf<AffirmationsModel>(
            AffirmationsModel(R.string.affirmation1),
            AffirmationsModel(R.string.affirmation2),
            AffirmationsModel(R.string.affirmation3),
            AffirmationsModel(R.string.affirmation4),
            AffirmationsModel(R.string.affirmation5),
            AffirmationsModel(R.string.affirmation6),
            AffirmationsModel(R.string.affirmation7),
            AffirmationsModel(R.string.affirmation8),
            AffirmationsModel(R.string.affirmation9),
            AffirmationsModel(R.string.affirmation10),
            AffirmationsModel(R.string.affirmation11),
            AffirmationsModel(R.string.affirmation12),
            AffirmationsModel(R.string.affirmation13),
            AffirmationsModel(R.string.affirmation14),
            AffirmationsModel(R.string.affirmation15),
            AffirmationsModel(R.string.affirmation16),
            AffirmationsModel(R.string.affirmation17),
            AffirmationsModel(R.string.affirmation18),
            AffirmationsModel(R.string.affirmation19),
            AffirmationsModel(R.string.affirmation20)
        )
    }
}