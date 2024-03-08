package com.example.wriquotesmultiplatform

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform