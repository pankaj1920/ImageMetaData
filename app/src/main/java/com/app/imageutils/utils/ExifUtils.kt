package com.app.imageutils.utils

import android.content.Context
import android.media.ExifInterface
import android.net.Uri



fun convertToDegree(dmsString: String): Float {
   val dmsParts = dmsString.split(",", " ")

   val degrees = parseDMSPart(dmsParts[0])
   val minutes = parseDMSPart(dmsParts[1])
   val seconds = parseDMSPart(dmsParts[2])
   return (degrees + (minutes / 60) + (seconds / 3600))
}

fun parseDMSPart(part: String): Float {
   val (numerator, denominator) = part.split("/").map { it.toDouble() }
   return (numerator / denominator).toFloat()
}
