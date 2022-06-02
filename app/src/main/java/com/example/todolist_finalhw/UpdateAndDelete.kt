package com.example.todolist_finalhw

interface UpdateAndDelete{


    fun modifyItem(itemUID: String,isDone: Boolean)
    fun onItemDelete(itemUID: String)
}