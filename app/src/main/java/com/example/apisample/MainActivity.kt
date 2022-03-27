package com.example.apisample

import android.os.Bundle
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import com.example.apisample.model.ApiModel
import com.example.apisample.service.RetrofitServiceBuilder
import javax.security.auth.callback.Callback

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var statusCode=findViewById<TextView>(R.id.statuscode)
        val errorTitle=findViewById<TextView>(R.id.errortitle)
        val userMessage=findViewById<TextView>(R.id.usermsg)


    val destinationService= RetrofitServiceBuilder.buildService(ApiModel::class.java)
        val requestCall= destinationService.getSomething()
        requestCall.enqueue(object: Callback<List<ApiModel>>{

        })






    }
}