package com.rawkings.objectdetectionwithtensorflowmodel

import android.graphics.RectF

data class DetectionObject(
    val score: Float,
    val label: String,
    val boundingBox: RectF
)