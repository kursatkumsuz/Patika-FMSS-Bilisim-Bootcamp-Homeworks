package com.kursatkumsuz.patikaweek3odev2.constants

import com.kursatkumsuz.patikaweek3odev2.R
import com.kursatkumsuz.patikaweek3odev2.model.PostModel

object PostConstants {
    /**
     * @return ArrayList that contains PostModel
     */
    fun getPost() : ArrayList<PostModel> {
        val postList = ArrayList<PostModel>()

        val post1 = PostModel("History of Chess" , R.drawable.image_one)
        val post2 = PostModel("Why go back to the Moon" , R.drawable.image_two)
        val post3 = PostModel("Global Warming" , R.drawable.image_threee)
        val post4 = PostModel("Nasal COVID-19 vaccines" , R.drawable.image_four)

        postList.add(post1)
        postList.add(post2)
        postList.add(post3)
        postList.add(post4)

        return postList
    }
}