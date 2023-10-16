package com.app.imageutils

import android.annotation.SuppressLint
import android.app.Activity
import android.app.AlertDialog
import android.content.Intent
import android.graphics.Bitmap
import android.media.ExifInterface
import android.net.Uri
import android.os.Build
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.ImageView
import androidx.activity.result.contract.ActivityResultContracts
import androidx.annotation.RequiresApi
import androidx.appcompat.app.AppCompatActivity
import com.app.imageutils.utils.ExifData
import com.app.imageutils.utils.convertToDegree
import org.json.JSONObject
import java.io.File
import java.lang.Exception

class MainActivity : AppCompatActivity() {

    lateinit var exifInterface: ExifInterface

    lateinit var imageFile: File
    lateinit var tempfile: File
    lateinit var ivImage: ImageView
    lateinit var imageUri: Uri
    var mediaUri: Uri? = null
    private var bitmap_image: Bitmap? = null


    val getCommentMedia =
        registerForActivityResult(ActivityResultContracts.StartActivityForResult()) { result ->

            if (result.resultCode == Activity.RESULT_OK) {
                imageUri = result.data?.data!!
                ivImage.setImageURI(imageUri)

            }
        }


    @RequiresApi(Build.VERSION_CODES.Q)
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val imageDetail: Button = findViewById(R.id.detailBtn)
        val browseImage: Button = findViewById(R.id.browseImage)
        ivImage = findViewById(R.id.ivImage)

        imageDetail.setOnClickListener {
            showExifDialog()
        }

        browseImage.setOnClickListener {
            val photoPickerIntent = Intent(Intent.ACTION_GET_CONTENT)

            photoPickerIntent.addFlags(
                Intent.FLAG_GRANT_READ_URI_PERMISSION or
                        Intent.FLAG_GRANT_WRITE_URI_PERMISSION or
                        Intent.FLAG_GRANT_PERSISTABLE_URI_PERMISSION or
                        Intent.FLAG_GRANT_PREFIX_URI_PERMISSION
            )
            photoPickerIntent.putExtra(Intent.EXTRA_LOCAL_ONLY, true)
            photoPickerIntent.type = "image/*"
            photoPickerIntent.action = Intent.ACTION_PICK
            getCommentMedia.launch(photoPickerIntent)
        }
    }


    fun showExifDialog() {


        exifInterface = ExifInterface(contentResolver.openInputStream(imageUri)!!)
        val exifData = ExifData()
        exifData.addExifData(exifInterface)
        getLat(exifData.getImageMetaData())
        Log.e("MetaData ", exifData.getImageMetaData())
        val builder = AlertDialog.Builder(this)
        builder.setTitle("Image Detail")
        builder.setCancelable(true)
        builder.setMessage(exifData.getListString())
        builder.setNeutralButton(
            "OK"
        ) { dialogInterface, i -> dialogInterface.dismiss() }
        val alertDialog = builder.create()
        alertDialog.show()
    }

    private fun getLat(metaData:String) {
        try {
            val jsonObject = JSONObject(metaData)
            var imageLatDMS = ""
            var imageLongDMS = ""
            if (jsonObject.has("GPSLatitude"))
                imageLatDMS = jsonObject.getString("GPSLatitude")
            if (jsonObject.has("GPSLongitude"))
                imageLongDMS = jsonObject.getString("GPSLongitude")

            Log.e("ImageLatLongDMS","$imageLatDMS => $imageLongDMS")
            Log.e("ImageLatLong","${convertToDegree(imageLatDMS)} => ${convertToDegree(imageLongDMS)}")
        }catch (e:Exception){
            Log.e("Error ",e.localizedMessage)
        }
    }


}