package com.example.kinniku.firebase

import android.util.Log
import com.google.firebase.database.DataSnapshot
import com.google.firebase.database.DatabaseError
import com.google.firebase.database.DatabaseReference
import com.google.firebase.database.ValueEventListener
import com.google.firebase.database.ktx.getValue
import com.google.firebase.firestore.FirebaseFirestore
import java.time.MonthDay

abstract class ReadAndWriteSnippets {
    private val database : FirebaseFirestore get() = FirebaseFirestore.getInstance()

    private fun addPostEventListener(postReference: DatabaseReference) {
        // [START post_value_event_listener]
        val postListener = object : ValueEventListener {
            override fun onDataChange(dataSnapshot: DataSnapshot) {
                val post = dataSnapshot.getValue<MonthDay>()
                Log.i("FireStore", post.toString())
            }

            override fun onCancelled(databaseError: DatabaseError) {

            }
        }
        postReference.addValueEventListener(postListener)
    }
}