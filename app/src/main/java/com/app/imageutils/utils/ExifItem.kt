package com.app.imageutils.utils

data class ExifItem(
    var minApi: Int = 0,
    var description: String? = null,
    var tag: String? = null,
    var value: String? = null,
    var present: Boolean = false,
    var isAllowed: Boolean = false
)