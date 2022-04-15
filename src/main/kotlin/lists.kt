fun main(){
    returnIndices(listOf("Cheko","Mollen", "Paul", "Brian", "Clinton", "Jacob", "Faith", "Kariuki", "John", "James"))
    var y =averageHeight(listOf(22.4,34.2,76.4,12.9,89.1))
    println(y.sum())
    println(y.average())

    var a = Person("Sharon", 12, 64, 12.3)
    var b = Person("James", 17, 76, 12.9)
    var c = Person("Njiru", 35, 65,10.8)
    var person= listOf<Person>(a,b,c)
    var descendingAge = person.sortedByDescending { person ->  person.age}
    println(descendingAge)

    var d = Person("Joan",45,76,09.8)
    var e = Person("June",67,23,12.5)
    var t = listOf(person,d,e,)
    println(t)


    var z = Car("KAD 556F", 2409.9)
    var p = Car("JSAH 77",4080.8 )
    var q = Car("jnky 87", 2080.7)
    var x = Car("ona 345", 2000.6)
    var car = listOf<Car>(z,p,q,x)
    var g = averageMileage(car)
    println(g)
}
//1. Given a list of 10 strings, write a function that returns a list of the strings
//at even indices i.e index 2,4,6 etc (2 points)
fun returnIndices(names:List<String>):List<String>{
    names.forEachIndexed { index, name ->
        if (index % 2 ==0)
            println(name)
    }
    return names
}
//2. Given a list of people’s heights in metres. Write a function that returns
//the average height and the total height (2 points)

fun averageHeight(height:List<Double>):List<Double>{
    return height

}
//3. Given a list of Person objects, each with the attributes, name, age,
//height and weight. Sort the list in order of descending age (2 points)
data class Person ( var name:String, var age :Int, var height: Int, var weight: Double)

//4. Given a list similar to the one above, write a function in which you will
//create 2 more people objects and add them to the list at one go.
//(1 points)
fun addPeople(people:List<Person>):List<Person>{
    return  people
}

//5. Write a function that takes in a list of Car objects each with a
//registration and mileage attribute and returns the average mileage of
//all the vehicles in the list. (3 points)
data class Car (var registration:Any, var mileage:Double)
fun averageMileage(car: List<Car>):Double{
    var average = 0.0
    car.forEach { car->
        average+=car.mileage
    }
    return average/car.count()

}
