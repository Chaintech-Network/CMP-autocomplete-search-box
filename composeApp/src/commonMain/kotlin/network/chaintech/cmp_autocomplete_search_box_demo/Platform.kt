package network.chaintech.cmp_autocomplete_search_box_demo

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform