package org.example.common

fun swap(arr: CharArray,i: Int,j: Int){
    arr[i] = arr[j].also { arr[j] = arr[i] }
}

fun Int.isEven() = this % 2 == 0

