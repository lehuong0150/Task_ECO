/*
    3. Collection (Danh sách dữ liệu)
    List (Danh sách)
    Set (Tập hợp không trùng lặp)
    Map (Dạng key-value)
    Các hàm quan trọng trong Collection
    map(), filter(), reduce(), forEach(), first(), last(), sort(),  ...

 */
fun main(){
    demoList()
    demoSet()
    demoMap()
    demoOtherFunctions()
}

fun demoList(){
    // Immutable List
    val immutableList = listOf("Apple", "Banana", "Cherry")
    println("Immutable List: $immutableList")

    // Mutable List
    var mutableList = mutableListOf("Dog", "Cat", "Rabbit")
    mutableList.add("Hamster")
    println("Mutable List after add: $mutableList")

    //first and last element
    println("First element: ${mutableList.first()}")
    println("Last element: ${mutableList.last()}")

    //sort va in-place sort
    mutableList.sort()
    println("Sorted List: $mutableList")
    mutableList.sortDescending()
    println("Sorted Descending List: $mutableList")

    //filter
    val filteredList = mutableList.filter { it.startsWith("C") }
    println("Filtered List : $filteredList")

    //reduce
    val reducedString = mutableList.reduce { acc, s -> "$acc, $s" }
    println("Reduced String: $reducedString")

    //forEach
    print("Elements in List: ")
    mutableList.forEach { print("$it ") }

    //check contains
    println("\nList contains 'Cat': ${mutableList.contains("Cat")}")

    //remove element
    mutableList.remove("Dog")
    println("List after remove 'Dog': $mutableList")

    println()
}

fun demoSet(){
    // Immutable Set
    val immutableSet = setOf("Red", "Green", "Blue", "Red")
    println("\nImmutable Set (no duplicates): $immutableSet")

    // Mutable Set
    val mutableSet = mutableSetOf(1,2,5,8,9,1,2,10)
    mutableSet.add(21)
    println("Mutable Set after add: $mutableSet")

    //first and last element
    println("First element: ${mutableSet.first()}")
    println("Last element: ${mutableSet.last()}")

    //sort va in-place sort
    val sortedSet = mutableSet.sorted()
    println("Sorted Set: $sortedSet")

    //filter
    val filteredSet = mutableSet.filter { it > 5 }
    println("Filtered Set : $filteredSet")

    //reduce
    val reducedString = mutableSet.reduce { acc, i -> acc + i }
    println("Reduced String: $reducedString")

    //forEach
    print("Elements in Set: ")
    mutableSet.forEach { print("$it ") }

    //check contains
    println("\nSet contains 10: ${mutableSet.contains(10)}")

    //remove element
    mutableSet.remove(2)
    println("Set after remove 2: $mutableSet")

    //min and max
    println("Min element: ${mutableSet.minOrNull()}")
    println("Max element: ${mutableSet.maxOrNull()}")

    //sum and average
    println("Sum of elements: ${mutableSet.sum()}")
    println("Average of elements: ${mutableSet.average()}")


    //clear set
    mutableSet.clear()
    println("Set after clear: $mutableSet")

    println()
}

// Map (key-value pairs)
fun demoMap(){
    // Immutable Map
    val immutableMap = mapOf(1 to "One", 2 to "Two", 3 to "Three")
    println("\nImmutable Map: $immutableMap")

    // Mutable Map
    val mutableMap = mutableMapOf("A" to 1, "B" to 2, "C" to 3)
    mutableMap["D"] = 4
    println("Mutable Map after add: $mutableMap")

    // Accessing values
    println("Value for key 'B': ${mutableMap["B"]}")

    //first and last element (based on keys)
    println("First element: ${mutableMap.entries.first()}")
    println("Last element: ${mutableMap.entries.last()}")

    //sort va in-place sort (based on keys)
    val sortedMap = mutableMap.toSortedMap()
    println("Sorted Map by keys: $sortedMap")

    //filter
    val filteredMap = mutableMap.filter { it.value > 2 }
    println("Filtered Map : $filteredMap")

    //forEach
    print("Elements in Map: ")
    mutableMap.forEach { (key, value) -> print("$key=$value ") }

    //check contains
    println("\nMap contains key 'C': ${mutableMap.containsKey("C")}")

}

fun demoOtherFunctions(){
    val list = mutableListOf(6,9,3,1,5,8,2,7,4)

    //sum and fitter
    val sumResult = list.filter { it > 5 }.sum()
    println("\nSum of elements > 5: $sumResult")

    //map
    val combinedResult = list.filter { it % 2 == 0 }.map { it * 2 }.sorted()
    println("Combined Result (even, *2, sorted): $combinedResult")

    //reduce and find
    val reduceResult = list.filter { it > 5 }.reduce { acc, i -> acc + i }
    println("Reduce Result (sum of elements > 5): $reduceResult")

    //any
    if (list.any { it > 5 }){
        println("Co it nhat 1 phan tu lon hon 5")
    } else {
        println("Khong co phan tu nao lon hon 5")
    }

    // all
    if (list.all { it > 0 }){
        println("Tat ca phan tu deu lon hon 0")
    } else {
        println("Co it nhat 1 phan tu khong lon hon 0")
    }

    // count
    val countResult = list.count { it > 5 }
    println("Co $countResult phan tu lon hon 5")

    // fold
    val foldResult = list.fold(0) { acc, i -> acc + i }
    println("Tong cac phan tu trong list: $foldResult")
    // foldRight
    val foldRightResult = list.foldRight(0) { i, acc -> acc + i }
    println("Tong cac phan tu trong list (foldRight): $foldRightResult")

    // find
    val findResult = list.find { it > 5 }
    println("Phan tu dau tien lon hon 5: $findResult")
    // findLast
    val findLastResult = list.findLast { it > 5 }
    println("Phan tu cuoi cung lon hon 5: $findLastResult")

    // flatMap
    val flatMapResult = list.flatMap { listOf(it, it * 2) }
    println("List sau khi flatMap: $flatMapResult")

    // groupBy
    val groupByResult = list.groupBy { if (it % 2 == 0) "Even" else "Odd" }
    println("List sau khi groupBy: $groupByResult")

    // partition
    val (even, odd) = list.partition { it % 2 == 0 }
    println("Even: $even")
    println("Odd: $odd")

    // slice
//    val sliceResult = list.slice(2,4,5).fold(0) { acc, i -> acc + i }
//    println("Tong List sau khi slice(2,4,5): $sliceResult")

    // subList
    val subListResult = list.subList(2, 5).minOrNull()
    println("Min cua List sau khi subList(2,5): $subListResult")

    // take
    val takeResult = list.take(3).sorted()
    println("List sau khi take(3): $takeResult")
//    val takeLastResult = list.takeLast(while (it > 5))
//    println("List sau khi takeLast : $takeLastResult")

    // drop and dropLast
    val dropResult = list.drop(3)
    println("List sau khi drop(3): $dropResult")
//    val dropLastResult = list.dropLast(while (it > 5))
//    println("List sau khi dropLast : $dropLastResult")

    // union
    val list2 = listOf(5,6,7,8,9,10)
    val unionResult = list.union(list2)
    println("List sau khi union: $unionResult")

    // intersect
    val intersectResult = list.intersect(list2)
    println("List sau khi intersect: $intersectResult")

    // distinct
    val listWithDuplicates = listOf(1,2,2,3,4,4,5)
    val distinctResult = listWithDuplicates.distinct()
    println("List sau khi distinct: $distinctResult")

    // chunked
    val chunkedResult = list.chunked(3)
    println("List sau khi chunked(3): $chunkedResult")

    // zip
    val zipResult = list.zip(list2)
    println("List sau khi zip: $zipResult")

}
