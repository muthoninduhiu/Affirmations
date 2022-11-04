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
            AffirmationsModel(R.string.affirmation10)
        )
    }
}