package com.example.myscreens.data

import android.app.ProgressDialog
import android.content.Context
import android.widget.Toast
import androidx.navigation.NavHostController
import com.example.myscreens.navigation.LOGIN1_URL
import com.example.myscreens.navigation.LOGIN2_URL
import com.example.myscreens.navigation.STUDENTS_URL
import com.example.myscreens.navigation.TEACHERS_URL
import com.google.firebase.auth.FirebaseAuth
import com.google.firebase.database.FirebaseDatabase
import com.google.firebase.firestore.auth.User

class AuthViewModel(var navController:NavHostController, var context:Context) {
    val mAuth:FirebaseAuth
    val progress:ProgressDialog

    init {
        mAuth = FirebaseAuth.getInstance()
        progress = ProgressDialog(context)
        progress.setTitle("Loading")
        progress.setMessage("Please wait...")
    }
    fun signup(name:String, email:String, password:String){
        progress.show()
        mAuth.createUserWithEmailAndPassword(email, password).addOnCompleteListener {
            var userId = mAuth.currentUser!!.uid
            var userProfile = com.example.myscreens.models.User(name, email, password, userId)
            // Create a reference table called Users inside of the Firebase database
            var usersRef = FirebaseDatabase.getInstance().getReference()
                                    .child("Users/$userId")
            usersRef.setValue(userProfile).addOnCompleteListener {
                progress.dismiss()
                if (it.isSuccessful){
                    Toast.makeText(this.context, "Success", Toast.LENGTH_SHORT).show()
                    navController.navigate(LOGIN1_URL)
                }else{
                    Toast.makeText(this.context, "Error", Toast.LENGTH_SHORT).show()
                }
            }
        }
    }
    fun signup1(name:String, email:String, password:String){
        progress.show()
        mAuth.createUserWithEmailAndPassword(email, password).addOnCompleteListener {
            var userId = mAuth.currentUser!!.uid
            var userProfile = com.example.myscreens.models.User(name, email, password, userId)
            // Create a reference table called Users inside of the Firebase database
            var usersRef = FirebaseDatabase.getInstance().getReference()
                .child("Users/$userId")
            usersRef.setValue(userProfile).addOnCompleteListener {
                progress.dismiss()
                if (it.isSuccessful){
                    Toast.makeText(this.context, "Success", Toast.LENGTH_SHORT).show()
                    navController.navigate(LOGIN2_URL)
                }else{
                    Toast.makeText(this.context, "Error", Toast.LENGTH_SHORT).show()
                }
            }
        }
    }

    fun login(email: String, password: String){
        progress.show()
        mAuth.signInWithEmailAndPassword(email, password).addOnCompleteListener {
            progress.dismiss()
            if (it.isSuccessful){
                Toast.makeText(this.context, "Success", Toast.LENGTH_SHORT).show()
                navController.navigate(STUDENTS_URL)
            }else{
                Toast.makeText(this.context, "Error", Toast.LENGTH_SHORT).show()
            }
        }
    }
    fun login1(email: String, password: String){
        progress.show()
        mAuth.signInWithEmailAndPassword(email, password).addOnCompleteListener {
            progress.dismiss()
            if (it.isSuccessful){
                Toast.makeText(this.context, "Success", Toast.LENGTH_SHORT).show()
                navController.navigate(TEACHERS_URL)
            }else{
                Toast.makeText(this.context, "Error", Toast.LENGTH_SHORT).show()
            }
        }
    }

    fun logout(){
        mAuth.signOut()
        navController.navigate(LOGIN1_URL)
    }
    fun logout1(){
        mAuth.signOut()
        navController.navigate(LOGIN2_URL)
    }

    fun isLoggedIn(): Boolean = mAuth.currentUser != null
}