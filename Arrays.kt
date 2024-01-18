fun main() {
    val numsList: ArrayList<Int> = ArrayList()

    numsList.add(1)
    numsList.add(10)
    numsList.add(100)
    numsList.add(456)
    numsList.add(420)
    numsList[2] = 506
    numsList.removeAt(0)
    for (num in numsList) {
        println(num)
    }

    
}