package org.dialance.comicstoremobile

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform