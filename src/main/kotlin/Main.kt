fun main() {
var person1 = Person("Megan",18)
    person1.speak()
    var person2 = Person("Henry",10)
    person2.speak()

    var car1 = Vehicle("Toyota","rav4",2000)
    car1.start()

    var car2 = Car("BMW","venus",2025,"black")
    car2.start()

    var rectangle1 = Rectangle(3,5)
    println(rectangle1.areaRectangle())
    var rectangle2 = Rectangle(5, 12)
    println(rectangle2.areaRectangle())

var animal1 = Animal("Cow","Moooooooo")
    animal1.makeSound()

    var animal2 = Dog("German","woof!")
    println(animal2.makeSound())

}

//Create a class called Person with properties for name and age.
//Write a method called speak that prints "Hello, my name is {name} and I am {age} years old."
class Person(var name:String,var age:Int){
    fun speak(){
        println("Hello, my name is $name and I am $age years old")
    }
}
//Create a data class called User with properties for username and password.
//Write a method called validatePassword that checks if the password contains
//at least one uppercase letter, one lowercase letter, and one number.
//data class User(var username:String,var password:String)
//   fun validatePassword(password: String):User{
//       for (x in password){
//           if(x.isUpperCase() && x.isLowerCase() && x.isDigit()){
//           }
//
//           else{
//               println("Password incorrect")
//           }
//       }
//   }

//Create a class called Vehicle with properties for make, model, and year.
//Write a method called start that prints "The {make} {model} is starting up."
open class Vehicle(var make: String, var model:String,var year:Int){
     open fun start(){
        println("The $make $model is starting up")
    }
}

//Create a class called Car that extends Vehicle and adds a property for color.
//Override the start method to print "The {color} {make} {model} is starting up."
class Car(make: String,model: String,year: Int,var color:String):Vehicle(make,model,year){
override fun start (){
    println("The $color $make $model is starting up")
}
}
//Create a class called Rectangle with properties for width and height.
//Write a method called area that returns the area of the rectangle.
class Rectangle(var width:Int, var height:Int){
    fun areaRectangle(): Int {
        var area = width * height
    return area
    }
     }

////Create a data class called Point with properties for x and y.
////Write a method called distance that takes another Point as an argument and returns the Euclidean distance between the two points.
////
//data class Point(var x:Int,var y:Int)
//fun distance(x2:Int ,y2:Int):Int{
//    var d = Point(x ,y)


//Create a class called Animal with properties for species and sound.
//Write a method called makeSound that prints "{species} says {sound}."
open class Animal(var species:String,var sound:String){
    open fun makeSound(){
       println("$species says $sound")
    }
}

//Create a class called Dog that extends Animal and sets species to "dog" and sound to "woof".
//Override the makeSound method to print "{species} barks {sound}."
class Dog(species: String,sound: String):Animal(species , sound ){
    override fun makeSound() {
        println("$species barks $sound")
    }

}