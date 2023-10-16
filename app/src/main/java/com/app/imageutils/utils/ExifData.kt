package com.app.imageutils.utils

import android.media.ExifInterface
import android.os.Build
import org.json.JSONObject

class ExifData {



    var exifItems: ArrayList<ExifItem>? =ArrayList();


   fun addExifData(exifInterface:ExifInterface ){

       val sdk = Build.VERSION.SDK_INT

       addTagData(exifInterface,5,ExifConstant.FLASH,ExifInterface.TAG_FLASH)
       addTagData(exifInterface,5,ExifConstant.IMAGE_LENGTH,ExifInterface.TAG_IMAGE_LENGTH)
       addTagData(exifInterface,5,ExifConstant.IMAGE_WIDTH,ExifInterface.TAG_IMAGE_WIDTH)
       addTagData(exifInterface,5,ExifConstant.MAKE,ExifInterface.TAG_MAKE)
       addTagData(exifInterface,5,ExifConstant.MODEL,ExifInterface.TAG_MODEL)
       addTagData(exifInterface,5,ExifConstant.GPS_LONGITUDE,ExifInterface.TAG_GPS_LONGITUDE)
       addTagData(exifInterface,5,ExifConstant.GPS_LATITUDE,ExifInterface.TAG_GPS_LATITUDE)
       addTagData(exifInterface,5,ExifConstant.ORIENTATION,ExifInterface.TAG_ORIENTATION)
       addTagData(exifInterface,8,ExifConstant.FOCAL_LENGTH,ExifInterface.TAG_FOCAL_LENGTH)
       addTagData(exifInterface,8,ExifConstant.GPS_TIMESTAMP,ExifInterface.TAG_GPS_TIMESTAMP)
       addTagData(exifInterface,8,ExifConstant.GPS_DATESTAMP,ExifInterface.TAG_GPS_DATESTAMP)
       addTagData(exifInterface,9,ExifConstant.GPS_ALTITUDE,ExifInterface.TAG_GPS_ALTITUDE)
       addTagData(exifInterface,9,ExifConstant.GPS_DEST_LATITUDE_REF,ExifInterface.TAG_GPS_DEST_LATITUDE_REF)
       addTagData(exifInterface,9,ExifConstant.GPS_ALTITUDE_REF,ExifInterface.TAG_GPS_ALTITUDE_REF)

       addTagData(exifInterface,11,ExifConstant.EXPOSURE_TIME,ExifInterface.TAG_EXPOSURE_TIME)



       if (sdk>=14){
           addTagData(exifInterface,14,ExifConstant.DATETIME,ExifInterface.TAG_DATETIME)
       }

       if (sdk>=23) {
           addTagData(exifInterface, 23, ExifConstant.SUBSEC_TIME, ExifInterface.TAG_SUBSEC_TIME)
       }


       if (sdk >= 24) {
           addTagData(exifInterface, 24, ExifConstant.APERTURE_VALUE, ExifInterface.TAG_APERTURE_VALUE)
           addTagData(exifInterface, 24, ExifConstant.MAX_APERTURE_VALUE, ExifInterface.TAG_MAX_APERTURE_VALUE)
           addTagData(exifInterface, 24, ExifConstant.ARTIST, ExifInterface.TAG_ARTIST)
           addTagData(exifInterface, 24,ExifConstant.BITS_PER_SAMPLE,ExifInterface.TAG_BITS_PER_SAMPLE)
           addTagData(exifInterface, 24,ExifConstant.BRIGHTNESS_VALUE,ExifInterface.TAG_BRIGHTNESS_VALUE)
           addTagData(exifInterface, 24, ExifConstant.CFA_PATTERN, ExifInterface.TAG_CFA_PATTERN)
           addTagData(exifInterface, 24, ExifConstant.COLOR_SPACE, ExifInterface.TAG_COLOR_SPACE)
           addTagData(exifInterface, 24, ExifConstant.COMPONENTS_CONFIGURATION, ExifInterface.TAG_COMPONENTS_CONFIGURATION)
           addTagData(exifInterface, 24, ExifConstant.COMPRESSED_BITS_PER_PIXEL, ExifInterface.TAG_COMPRESSED_BITS_PER_PIXEL)
           addTagData(exifInterface, 24, ExifConstant.COMPRESSION, ExifInterface.TAG_COMPRESSION)
           addTagData(exifInterface, 24, ExifConstant.CONTRAST, ExifInterface.TAG_CONTRAST)
           addTagData(exifInterface, 24, ExifConstant.COPYRIGHT, ExifInterface.TAG_COPYRIGHT)
           addTagData(exifInterface, 24, ExifConstant.CUSTOM_RENDERED, ExifInterface.TAG_CUSTOM_RENDERED)
           addTagData(exifInterface,24,ExifConstant.DATETIME_DIGITIZED,ExifInterface.TAG_DATETIME_DIGITIZED)
           addTagData(exifInterface,24,ExifConstant.DATETIME_ORIGINAL,ExifInterface.TAG_DATETIME_ORIGINAL)
           addTagData(exifInterface,24,ExifConstant.DEFAULT_CROP_SIZE,ExifInterface.TAG_DEFAULT_CROP_SIZE)
           addTagData(exifInterface,24,ExifConstant.DEVICE_SETTING_DESCRIPTION,ExifInterface.TAG_DEVICE_SETTING_DESCRIPTION)
           addTagData(exifInterface,24,ExifConstant.DIGITAL_ZOOM_RATIO,ExifInterface.TAG_DIGITAL_ZOOM_RATIO)

           addTagData(exifInterface,24,ExifConstant.EXIF_VERSION,ExifInterface.TAG_EXIF_VERSION)
           addTagData(exifInterface,24,ExifConstant.EXPOSURE_BIAS_VALUE,ExifInterface.TAG_EXPOSURE_BIAS_VALUE)
           addTagData(exifInterface,24,ExifConstant.EXPOSURE_INDEX,ExifInterface.TAG_EXPOSURE_INDEX)
           addTagData(exifInterface,24,ExifConstant.EXPOSURE_MODE,ExifInterface.TAG_EXPOSURE_MODE)
           addTagData(exifInterface,24,ExifConstant.EXPOSURE_PROGRAM,ExifInterface.TAG_EXPOSURE_PROGRAM)
           addTagData(exifInterface,24,ExifConstant.FILE_SOURCE,ExifInterface.TAG_FILE_SOURCE)
           addTagData(exifInterface,24,ExifConstant.FLASH_ENERGY,ExifInterface.TAG_FLASH_ENERGY)
           addTagData(exifInterface,24,ExifConstant.FLASHPIX_VERSION,ExifInterface.TAG_FLASHPIX_VERSION)
           addTagData(exifInterface, 24, ExifConstant.FOCAL_LENGTH_IN_35MM_FILM, ExifInterface.TAG_FOCAL_LENGTH_IN_35MM_FILM)
           addTagData(exifInterface, 24,ExifConstant.FOCAL_PLANE_RESOLUTION_UNIT, ExifInterface.TAG_FOCAL_PLANE_RESOLUTION_UNIT)
           addTagData(exifInterface, 24, ExifConstant.FOCAL_PLANE_X_RESOLUTION, ExifInterface.TAG_FOCAL_PLANE_X_RESOLUTION)
           addTagData(exifInterface, 24, ExifConstant.FOCAL_PLANE_Y_RESOLUTION, ExifInterface.TAG_FOCAL_PLANE_Y_RESOLUTION)
           addTagData(exifInterface, 24, ExifConstant.F_NUMBER, ExifInterface.TAG_F_NUMBER)
           addTagData(exifInterface, 24, ExifConstant.GAIN_CONTROL, ExifInterface.TAG_GAIN_CONTROL)
           addTagData(exifInterface, 24, ExifConstant.GPS_AREA_INFORMATION, ExifInterface.TAG_GPS_AREA_INFORMATION)
           addTagData(exifInterface, 24, ExifConstant.GPS_DEST_BEARING, ExifInterface.TAG_GPS_DEST_BEARING)
           addTagData(exifInterface, 24,ExifConstant.GPS_DEST_BEARING_REF, ExifInterface.TAG_GPS_DEST_BEARING_REF)
           addTagData(exifInterface, 24,ExifConstant.GPS_DEST_DISTANCE,ExifInterface.TAG_GPS_DEST_DISTANCE)
           addTagData(exifInterface, 24,ExifConstant.GPS_DEST_DISTANCE_REF, ExifInterface.TAG_GPS_DEST_DISTANCE_REF)
           addTagData(exifInterface, 24,ExifConstant.GPS_DEST_LATITUDE, ExifInterface.TAG_GPS_DEST_LATITUDE)
           addTagData(exifInterface, 24, ExifConstant.GPS_DEST_LATITUDE_REF, ExifInterface.TAG_GPS_DEST_LATITUDE_REF)
           addTagData(exifInterface, 24, ExifConstant.GPS_DEST_LONGITUDE, ExifInterface.TAG_GPS_DEST_LONGITUDE)
           addTagData(exifInterface, 24, ExifConstant.GPS_DEST_LONGITUDE_REF, ExifInterface.TAG_GPS_DEST_LONGITUDE_REF)
           addTagData(exifInterface, 24, ExifConstant.GPS_IMG_DIRECTION, ExifInterface.TAG_GPS_IMG_DIRECTION)
           addTagData(exifInterface, 24,ExifConstant.GPS_IMG_DIRECTION_REF, ExifInterface.TAG_GPS_IMG_DIRECTION_REF)
           addTagData(exifInterface, 24, ExifConstant.GPS_DIFFERENTIAL, ExifInterface.TAG_GPS_DIFFERENTIAL)
           addTagData(exifInterface, 24, ExifConstant.GPS_MEASURE_MODE, ExifInterface.TAG_GPS_MEASURE_MODE)
           addTagData(exifInterface, 24, ExifConstant.GPS_MAP_DATUM, ExifInterface.TAG_GPS_MAP_DATUM)
           addTagData(exifInterface, 24,ExifConstant.GPS_SATELLITES, ExifInterface.TAG_GPS_SATELLITES)
           addTagData(exifInterface, 24,ExifConstant.GPS_SPEED, ExifInterface.TAG_GPS_SPEED)
           addTagData(exifInterface, 24,ExifConstant.GPS_SPEED_REF, ExifInterface.TAG_GPS_SPEED_REF)
           addTagData(exifInterface, 24, ExifConstant.GPS_STATUS, ExifInterface.TAG_GPS_STATUS)
           addTagData(exifInterface,24,ExifConstant.GPS_TRACK,ExifInterface.TAG_GPS_TRACK)
           addTagData(exifInterface,24,ExifConstant.GPS_TRACK_REF,ExifInterface.TAG_GPS_TRACK_REF)
           addTagData(exifInterface,24,ExifConstant.GPS_VERSION_ID,ExifInterface.TAG_GPS_VERSION_ID)
           addTagData(exifInterface,24,ExifConstant.IMAGE_DESCRIPTION,ExifInterface.TAG_IMAGE_DESCRIPTION)
           addTagData(exifInterface, 24,ExifConstant.IMAGE_UNIQUE_ID, ExifInterface.TAG_IMAGE_UNIQUE_ID)
           addTagData(exifInterface, 24, ExifConstant.ISO_SPEED_RATINGS, ExifInterface.TAG_ISO_SPEED_RATINGS)
           addTagData(exifInterface, 24, ExifConstant.JPEG_INTERCHANGE_FORMAT, ExifInterface.TAG_JPEG_INTERCHANGE_FORMAT)
           addTagData(exifInterface, 24,ExifConstant.JPEG_INTERCHANGE_FORMAT_LENGTH, ExifInterface.TAG_JPEG_INTERCHANGE_FORMAT_LENGTH)
           addTagData(exifInterface, 24, ExifConstant.LIGHT_SOURCE, ExifInterface.TAG_LIGHT_SOURCE)
           addTagData(exifInterface, 24, ExifConstant.MAKER_NOTE, ExifInterface.TAG_MAKER_NOTE)
           addTagData(exifInterface, 24, ExifConstant.MAX_APERTURE_VALUE, ExifInterface.TAG_MAX_APERTURE_VALUE)
           addTagData(exifInterface, 24, ExifConstant.METERING_MODE, ExifInterface.TAG_METERING_MODE)
           addTagData(exifInterface, 24, ExifConstant.OECF, ExifInterface.TAG_OECF)
           addTagData(exifInterface,24,ExifConstant.PHOTOMETRIC_INTERPRETATION,ExifInterface.TAG_PHOTOMETRIC_INTERPRETATION)
           addTagData(exifInterface,24,ExifConstant.PIXEL_X_DIMENSION,ExifInterface.TAG_PIXEL_X_DIMENSION)
           addTagData(exifInterface,24,ExifConstant.PIXEL_Y_DIMENSION,ExifInterface.TAG_PIXEL_Y_DIMENSION)
           addTagData(exifInterface,24,ExifConstant.PLANAR_CONFIGURATION,ExifInterface.TAG_PLANAR_CONFIGURATION)
           addTagData(exifInterface,24,ExifConstant.PRIMARY_CHROMATICITIES,ExifInterface.TAG_PRIMARY_CHROMATICITIES)
           addTagData(exifInterface,24,ExifConstant.REFERENCE_BLACK_WHITE,ExifInterface.TAG_REFERENCE_BLACK_WHITE)
           addTagData(exifInterface,24,ExifConstant.RELATED_SOUND_FILE,ExifInterface.TAG_RELATED_SOUND_FILE)
           addTagData(exifInterface,24,ExifConstant.RESOLUTION_UNIT,ExifInterface.TAG_RESOLUTION_UNIT)
           addTagData(exifInterface,24,ExifConstant.ROWS_PER_STRIP,ExifInterface.TAG_ROWS_PER_STRIP)
           addTagData(exifInterface,24,ExifConstant.SAMPLES_PER_PIXEL,ExifInterface.TAG_SAMPLES_PER_PIXEL)
           addTagData(exifInterface,24,ExifConstant.SATURATION,ExifInterface.TAG_SATURATION)
           addTagData(exifInterface,24,ExifConstant.SCENE_CAPTURE_TYPE,ExifInterface.TAG_SCENE_CAPTURE_TYPE)
           addTagData(exifInterface,24,ExifConstant.SCENE_TYPE,ExifInterface.TAG_SCENE_TYPE)
           addTagData(exifInterface,24,ExifConstant.SENSING_METHOD,ExifInterface.TAG_SENSING_METHOD)
           addTagData(exifInterface,24,ExifConstant.SHARPNESS,ExifInterface.TAG_SHARPNESS)
           addTagData(exifInterface,24,ExifConstant.SHUTTER_SPEED_VALUE,ExifInterface.TAG_SHUTTER_SPEED_VALUE)
           addTagData(exifInterface,24,ExifConstant.SOFTWARE,ExifInterface.TAG_SOFTWARE)
           addTagData(exifInterface,24,ExifConstant.SPATIAL_FREQUENCY_RESPONSE,ExifInterface.TAG_SPATIAL_FREQUENCY_RESPONSE)
           addTagData(exifInterface,24,ExifConstant.SPECTRAL_SENSITIVITY,ExifInterface.TAG_SPECTRAL_SENSITIVITY)
           addTagData(exifInterface,24,ExifConstant.STRIP_BYTE_COUNTS,ExifInterface.TAG_STRIP_BYTE_COUNTS)
           addTagData(exifInterface,24,ExifConstant.STRIP_OFFSETS,ExifInterface.TAG_STRIP_OFFSETS)
           addTagData(exifInterface,26,ExifConstant.SUBFILE_TYPE,ExifInterface.TAG_SUBFILE_TYPE)
           addTagData(exifInterface, 24, ExifConstant.SUBJECT_AREA, ExifInterface.TAG_SUBJECT_AREA)
           addTagData(exifInterface, 24, ExifConstant.SUBJECT_DISTANCE, ExifInterface.TAG_SUBJECT_DISTANCE)
           addTagData(exifInterface, 24, ExifConstant.SUBJECT_DISTANCE_RANGE, ExifInterface.TAG_SUBJECT_DISTANCE_RANGE)
           addTagData(exifInterface, 24,ExifConstant.SUBJECT_LOCATION, ExifInterface.TAG_SUBJECT_LOCATION)
           addTagData(exifInterface, 24, ExifConstant.SUBSEC_TIME_DIGITIZED, ExifInterface.TAG_SUBSEC_TIME_DIGITIZED)
           addTagData(exifInterface, 24,ExifConstant.SUBSEC_TIME_ORIGINAL, ExifInterface.TAG_SUBSEC_TIME_ORIGINAL)
           addTagData(exifInterface, 24, ExifConstant.TRANSFER_FUNCTION, ExifInterface.TAG_TRANSFER_FUNCTION)
           addTagData(exifInterface, 24,ExifConstant.USER_COMMENT, ExifInterface.TAG_USER_COMMENT)
           addTagData(exifInterface, 24, ExifConstant.WHITE_POINT, ExifInterface.TAG_WHITE_POINT)
           addTagData(exifInterface, 24, ExifConstant.X_RESOLUTION, ExifInterface.TAG_X_RESOLUTION)
           addTagData(exifInterface, 24, ExifConstant.Y_CB_CR_COEFFICIENTS, ExifInterface.TAG_Y_CB_CR_COEFFICIENTS)
           addTagData(exifInterface, 24, ExifConstant.Y_CB_CR_POSITIONING, ExifInterface.TAG_Y_CB_CR_POSITIONING)
           addTagData(exifInterface, 24, ExifConstant.Y_CB_CR_SUB_SAMPLING, ExifInterface.TAG_Y_CB_CR_SUB_SAMPLING)
           addTagData(exifInterface, 24, ExifConstant.Y_RESOLUTION, ExifInterface.TAG_Y_RESOLUTION)
       }

       if (sdk>=26){
           addTagData(exifInterface,26,ExifConstant.DNG_VERSION,ExifInterface.TAG_DNG_VERSION)
           addTagData(exifInterface, 26, ExifConstant.NEW_SUBFILE_TYPE, ExifInterface.TAG_NEW_SUBFILE_TYPE)

       }

       if (android.os.Build.VERSION.SDK_INT>=29){
           addTagData(exifInterface,29,ExifConstant.XMP,ExifInterface.TAG_XMP)
       }


   }

    private fun addTagData(
        exifInterface: ExifInterface,
        minApi: Int,
        description: String,
        tag: String,
    ) {
        val exifItem = ExifItem()
        exifItem.tag = tag
        val attribute = exifInterface.getAttribute(tag)
        exifItem.present = attribute != null
        exifItem.value = attribute
        exifItem.minApi = minApi
        exifItem.description = description
        if (exifItems == null) {
            exifItems = ArrayList()
        }
        exifItems!!.add(exifItem)
    }


    fun getListString(): String {
        val stringBuilder = StringBuilder()
        for (i in exifItems?.indices!!) {
            val (_, description, _, value, present) = exifItems!![i]
            if (present) {
                stringBuilder.append(description + ": " + value + System.lineSeparator())
            }
        }
        return stringBuilder.toString()
    }

    fun getImageMetaData(): String {
        val jsonObject = JSONObject()

        for (i in exifItems?.indices!!) {
            val (minApi, description, _, value, present) = exifItems!![i]

            if (present) {
                jsonObject.put(description, value)
            }
        }
        return jsonObject.toString()
    }

}