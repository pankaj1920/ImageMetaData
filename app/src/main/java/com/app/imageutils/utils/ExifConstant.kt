package com.app.imageutils.utils


object ExifConstant {

    private const val TAG = "ExifInterface"
    const val ARTIST = "Artist"
    const val BITS_PER_SAMPLE = "BitsPerSample"
    const val COMPRESSION = "Compression"
    const val COPYRIGHT = "Copyright"
    const val DATETIME = "DateTime"
    const val IMAGE_DESCRIPTION = "ImageDescription"
    const val IMAGE_LENGTH = "ImageLength"
    const val IMAGE_WIDTH = "ImageWidth"
    const val JPEG_INTERCHANGE_FORMAT = "JPEGInterchangeFormat"
    const val JPEG_INTERCHANGE_FORMAT_LENGTH = "JPEGInterchangeFormatLength"
    const val MAKE = "Make"
    const val MODEL = "Model"
    const val ORIENTATION = "Orientation"
    const val PHOTOMETRIC_INTERPRETATION = "PhotometricInterpretation"
    const val PLANAR_CONFIGURATION = "PlanarConfiguration"
    const val PRIMARY_CHROMATICITIES = "PrimaryChromaticities"
    const val REFERENCE_BLACK_WHITE = "ReferenceBlackWhite"
    const val RESOLUTION_UNIT = "ResolutionUnit"
    const val ROWS_PER_STRIP = "RowsPerStrip"
    const val SAMPLES_PER_PIXEL = "SamplesPerPixel"
    const val SOFTWARE = "Software"
    const val STRIP_BYTE_COUNTS = "StripByteCounts"
    const val STRIP_OFFSETS = "StripOffsets"
    const val TRANSFER_FUNCTION = "TransferFunction"
    const val WHITE_POINT = "WhitePoint"
    const val X_RESOLUTION = "XResolution"
    const val Y_CB_CR_COEFFICIENTS = "YCbCrCoefficients"
    const val Y_CB_CR_POSITIONING = "YCbCrPositioning"
    const val Y_CB_CR_SUB_SAMPLING = "YCbCrSubSampling"
    const val Y_RESOLUTION = "YResolution"
    const val APERTURE_VALUE = "ApertureValue"
    const val BRIGHTNESS_VALUE = "BrightnessValue"
    const val CFA_PATTERN = "CFAPattern"
    const val COLOR_SPACE = "ColorSpace"
    const val COMPONENTS_CONFIGURATION = "ComponentsConfiguration"
    const val COMPRESSED_BITS_PER_PIXEL = "CompressedBitsPerPixel"
    const val CONTRAST = "Contrast"
    const val CUSTOM_RENDERED = "CustomRendered"
    const val DATETIME_DIGITIZED = "DateTimeDigitized"
    const val DATETIME_ORIGINAL = "DateTimeOriginal"
    const val DEVICE_SETTING_DESCRIPTION = "DeviceSettingDescription"
    const val DIGITAL_ZOOM_RATIO = "DigitalZoomRatio"
    const val EXIF_VERSION = "ExifVersion"
    const val EXPOSURE_BIAS_VALUE = "ExposureBiasValue"
    const val EXPOSURE_INDEX = "ExposureIndex"
    const val EXPOSURE_MODE = "ExposureMode"
    const val EXPOSURE_PROGRAM = "ExposureProgram"
    const val EXPOSURE_TIME = "ExposureTime"
    const val F_NUMBER = "FNumber"
    const val FILE_SOURCE = "FileSource"
    const val FLASH = "Flash"
    const val FLASH_ENERGY = "FlashEnergy"
    const val FLASHPIX_VERSION = "FlashpixVersion"
    const val FOCAL_LENGTH = "FocalLength"
    const val FOCAL_LENGTH_IN_35MM_FILM = "FocalLengthIn35mmFilm"
    const val FOCAL_PLANE_RESOLUTION_UNIT = "FocalPlaneResolutionUnit"
    const val FOCAL_PLANE_X_RESOLUTION = "FocalPlaneXResolution"
    const val FOCAL_PLANE_Y_RESOLUTION = "FocalPlaneYResolution"
    const val GAIN_CONTROL = "GainControl"
    const val ISO_SPEED_RATINGS = "ISOSpeedRatings"

    const val IMAGE_UNIQUE_ID = "ImageUniqueID"
    const val LIGHT_SOURCE = "LightSource"
    const val MAKER_NOTE = "MakerNote"
    const val MAX_APERTURE_VALUE = "MaxApertureValue"
    const val METERING_MODE = "MeteringMode"
    const val NEW_SUBFILE_TYPE = "NewSubfileType"
    const val OECF = "OECF"
    const val OFFSET_TIME = "OffsetTime"
    const val OFFSET_TIME_ORIGINAL = "OffsetTimeOriginal"
    const val OFFSET_TIME_DIGITIZED = "OffsetTimeDigitized"
    const val PIXEL_X_DIMENSION = "PixelXDimension"
    const val PIXEL_Y_DIMENSION = "PixelYDimension"
    const val RELATED_SOUND_FILE = "RelatedSoundFile"
    const val SATURATION = "Saturation"
    const val SCENE_CAPTURE_TYPE = "SceneCaptureType"
    const val SCENE_TYPE = "SceneType"
    const val SENSING_METHOD = "SensingMethod"
    const val SHARPNESS = "Sharpness"
    const val SHUTTER_SPEED_VALUE = "ShutterSpeedValue"
    const val SPATIAL_FREQUENCY_RESPONSE = "SpatialFrequencyResponse"
    const val SPECTRAL_SENSITIVITY = "SpectralSensitivity"
    const val SUBFILE_TYPE = "SubfileType"
    const val SUBSEC_TIME = "SubSecTime"
    const val SUBSEC_TIME_DIGITIZED = "SubSecTimeDigitized"
    const val SUBSEC_TIME_ORIGINAL = "SubSecTimeOriginal"
    const val SUBJECT_AREA = "SubjectArea"
    const val SUBJECT_DISTANCE = "SubjectDistance"
    const val SUBJECT_DISTANCE_RANGE = "SubjectDistanceRange"
    const val SUBJECT_LOCATION = "SubjectLocation"
    const val USER_COMMENT = "UserComment"
    const val WHITE_BALANCE = "WhiteBalance"
    const val GPS_ALTITUDE = "GPSAltitude"
    const val GPS_ALTITUDE_REF = "GPSAltitudeRef"
    const val GPS_AREA_INFORMATION = "GPSAreaInformation"
    const val GPS_DOP = "GPSDOP"
    const val GPS_DATESTAMP = "GPSDateStamp"
    const val GPS_DEST_BEARING = "GPSDestBearing"
    const val GPS_DEST_BEARING_REF = "GPSDestBearingRef"
    const val GPS_DEST_DISTANCE = "GPSDestDistance"
    const val GPS_DEST_DISTANCE_REF = "GPSDestDistanceRef"
    const val GPS_DEST_LATITUDE = "GPSDestLatitude"
    const val GPS_DEST_LATITUDE_REF = "GPSDestLatitudeRef"
    const val GPS_DEST_LONGITUDE = "GPSDestLongitude"
    const val GPS_DEST_LONGITUDE_REF = "GPSDestLongitudeRef"
    const val GPS_DIFFERENTIAL = "GPSDifferential"
    const val GPS_IMG_DIRECTION = "GPSImgDirection"
    const val GPS_IMG_DIRECTION_REF = "GPSImgDirectionRef"
    const val GPS_LATITUDE = "GPSLatitude"
    const val GPS_LATITUDE_REF = "GPSLatitudeRef"
    const val GPS_LONGITUDE = "GPSLongitude"
    const val GPS_LONGITUDE_REF = "GPSLongitudeRef"
    const val GPS_MAP_DATUM = "GPSMapDatum"
    const val GPS_MEASURE_MODE = "GPSMeasureMode"
    const val GPS_PROCESSING_METHOD = "GPSProcessingMethod"
    const val GPS_SATELLITES = "GPSSatellites"
    const val GPS_SPEED = "GPSSpeed"
    const val GPS_SPEED_REF = "GPSSpeedRef"
    const val GPS_STATUS = "GPSStatus"
    const val GPS_TIMESTAMP = "GPSTimeStamp"
    const val GPS_TRACK = "GPSTrack"
    const val GPS_TRACK_REF = "GPSTrackRef"
    const val GPS_VERSION_ID = "GPSVersionID"
    const val INTEROPERABILITY_INDEX = "InteroperabilityIndex"
    const val THUMBNAIL_IMAGE_LENGTH = "ThumbnailImageLength"
    const val THUMBNAIL_IMAGE_WIDTH = "ThumbnailImageWidth"
    const val THUMBNAIL_ORIENTATION = "ThumbnailOrientation"
    const val DNG_VERSION = "DNGVersion"
    const val DEFAULT_CROP_SIZE = "DefaultCropSize"
    const val ORF_THUMBNAIL_IMAGE = "ThumbnailImage"
    const val ORF_PREVIEW_IMAGE_START = "PreviewImageStart"
    const val ORF_PREVIEW_IMAGE_LENGTH = "PreviewImageLength"
    const val ORF_ASPECT_FRAME = "AspectFrame"
    const val RW2_SENSOR_BOTTOM_BORDER = "SensorBottomBorder"
    const val RW2_SENSOR_LEFT_BORDER = "SensorLeftBorder"
    const val RW2_SENSOR_RIGHT_BORDER = "SensorRightBorder"
    const val RW2_SENSOR_TOP_BORDER = "SensorTopBorder"
    const val RW2_ISO = "ISO"
    const val RW2_JPG_FROM_RAW = "JpgFromRaw"
    const val XMP = "Xmp"
    private const val EXIF_IFD_POINTER = "ExifIFDPointer"
    private const val GPS_INFO_IFD_POINTER = "GPSInfoIFDPointer"
    private const val INTEROPERABILITY_IFD_POINTER = "InteroperabilityIFDPointer"
    private const val SUB_IFD_POINTER = "SubIFDPointer"
    private const val ORF_CAMERA_SETTINGS_IFD_POINTER = "CameraSettingsIFDPointer"
    private const val ORF_IMAGE_PROCESSING_IFD_POINTER = "ImageProcessingIFDPointer"
    private const val HAS_THUMBNAIL = "HasThumbnail"
    private const val THUMBNAIL_OFFSET = "ThumbnailOffset"
    private const val THUMBNAIL_LENGTH = "ThumbnailLength"
    private const val THUMBNAIL_DATA = "ThumbnailData"
}