package com.kursatkumsuz.patikaweek6homework

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import kotlinx.coroutines.*

class MainActivity : AppCompatActivity() {

    private var count = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //infinite loop
        while (true) {
            //coroutine Scope
            CoroutineScope(Dispatchers.IO).launch {
                val answer = networkCall()
                //change coroutine context
                withContext(Dispatchers.Main) {
                    Log.v("Network Answer:", answer)
                }
            }
            //increase value of count
            count++
            //print count
            println("Count: $count")
        }
    }

    /**
     * @return String
     */
    suspend fun networkCall(): String {
        delay(2000L)
        return "Network Answer"
    }
}