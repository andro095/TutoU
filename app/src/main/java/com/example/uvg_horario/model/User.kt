package com.example.uvg_horario.model

public class User (val uid:String, var name: String, var lastname:String, var email:String,var ucode:String , val usr: String){
    fun getFullName() = "$name $lastname"
}