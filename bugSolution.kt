fun main() {
    val list = mutableListOf(1, 2, 3, 4, 5)
    val newList = list.filter { it <= 2 }
    println(list) // Output: [1, 2, 3, 4, 5]
    println(newList) // Output: [1, 2]

    val set = mutableSetOf(1, 2, 3, 4, 5)
    val newSet = set.filter { it <= 2 }.toSet()
    println(set) // Output: [1, 2, 3, 4, 5]
    println(newSet) // Output: [1, 2]

    val map = mutableMapOf(1 to "one", 2 to "two", 3 to "three", 4 to "four", 5 to "five")
    val newMap = map.filter { it.key <= 2 }
    println(map) // Output: {1=one, 2=two, 3=three, 4=four, 5=five}
    println(newMap) // Output: {1=one, 2=two}

    //To modify original collections use following:
    list.clear(); list.addAll(newList)
    set.clear(); set.addAll(newSet)
    map.clear(); map.putAll(newMap)
} 