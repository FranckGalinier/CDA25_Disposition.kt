package com.example.disposition.data

import com.example.disposition.R
import com.example.disposition.model.DrawableStringPair

class Datasource {
    fun bodyData() : List<DrawableStringPair>{
        return listOf(
            DrawableStringPair(R.drawable.ab1_inversions, R.string.ab1_inversions),
            DrawableStringPair(R.drawable.ab2_quick_yoga, R.string.ab2_quick_yoga),
            DrawableStringPair(R.drawable.ab3_stretching, R.string.ab3_stretching),
            DrawableStringPair(R.drawable.ab4_tabata, R.string.ab4_tabata),
            DrawableStringPair(R.drawable.ab5_hiit, R.string.ab5_hiit),
            DrawableStringPair(R.drawable.ab6_pre_natal_yoga, R.string.ab6_pre_natal_yoga)
        )
    }

    fun collectionData(): List<DrawableStringPair> = listOf(
        R.drawable.fc1_short_mantras to R.string.fc1_short_mantras,
        R.drawable.fc2_nature_meditations to R.string.fc2_nature_meditations,
        R.drawable.fc3_stress_and_anxiety to R.string.fc3_stress_and_anxiety,
        R.drawable.fc4_self_massage to R.string.fc4_self_massage,
        R.drawable.fc5_overwhelmed to R.string.fc5_overwhelmed,
        R.drawable.fc6_nightly_wind_down to R.string.fc6_nightly_wind_down
    ).map{DrawableStringPair(it.first, it.second) }

}