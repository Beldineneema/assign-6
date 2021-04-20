fun main() {
    var banker= Banker("celine", 22)
    banker.eat()
    banker.sleep()
    banker.talk("I work at Equity bank")
    banker.depositMoney(listOf(1000, 2000,4000,5000))
    var farmer= Farmer("Dom", 32)
    farmer.cultivate()
    var doctor= Doctor("Chek", 44)
    doctor.talk("I am a physian, I treat diseases")
    banker.eat()
    doctor.eat()

}
open class People(name:String, age:Int){
     fun talk(words: String){
         println(words)
     }
    open fun eat(){
         println("yummy")
     }
     fun sleep(){
         println("zzzz")
     }

 }
 class Banker(name: String, age: Int):People( name,age){
     fun depositMoney (notes :List<Int>){
         var sum = 0
         notes.forEach{note->
             sum+=note
         }
         println(sum)
     }
 }
 class Farmer(name: String, age: Int):People(name,age) {
     fun cultivate() {
         println("dig dig dig")
     }
 }
 class Doctor(name: String, age: Int):People(name,age){
 fun treatPatients(patient:String, disease:String){
     println("Treat $patient for $disease")
 }

     override fun eat() {
         super.eat()
         println("tasty")
     }

     }





