enum class DayPart {
    MORNING,
    AFTERNOON,
    EVENING

}

data class Event(
    val title : String,
    val description : String?,
    val daypart : DayPart,
    val duration : Int
)

fun main() {
    val event1 = Event( "Study Kotlin","Commit to studying Kotlin at least 15 minutes per day:", DayPart.EVENING,15)
    println(event1)
}