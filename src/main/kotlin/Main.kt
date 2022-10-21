fun main(args: Array<String>) {
    //val ivan = Human("Ivan")
    val oleg = Person("Oleg")
    oleg.toSay()
    oleg.toDo()
    oleg.toDo(333)

    val bmw = Car()
    bmw.move()
    bmw.stop()

    val mv: Movable
}
abstract class Human(val name: String) {
    abstract fun toSay()
}
class Person(name: String): Human(name) {
    override fun toSay() {
        println("Hello $name")
    }
    fun toDo() {

    }
    fun toDo(x: Int) {

    }
}
interface Movable{
    val speed: Int
    fun move()
    fun stop() {
        println("Stop")
    }
}

class Car: Movable {
    override val speed: Int = 60
    override fun move() {
        println("Car moving...speed is $speed")
    }
}
class Aircraft : Movable{

    override var speed = 600
    override fun move(){
        println("Самолет летит со скоростью $speed км/ч")
    }
    override fun stop(){
        println("Приземление")
    }
}
interface Info{
    val model: String
        get() = "Undefined"
    val number: String
}
class ECar(override val model: String, override var number: String) : Movable, Info{

    override var speed = 60
    override fun move(){
        println("Машина едет со скоростью $speed км/ч")
    }
}
open class Video {
    open fun play() { println("Play video") }
}

interface AudioPlayable {
    fun play() { println("Play audio") }
}

open class Test1 {

}
open class Test2 {

}
interface Interface1 {
    fun ttt()
}
interface Interface2 {
    fun ddd()
    fun ppp() {

    }
}
class Test11: Test1(),  Interface1, Interface2 {
    override fun ttt() {
        TODO("Not yet implemented")
    }

    override fun ddd() {
        println("ddd")
    }

    override fun ppp() {
        println("ppp")
    }

}

class MediaPlayer() : Video(), AudioPlayable {
    // Функцию play обязательно надо переопределить
    override fun play() {
        super<Video>.play()         // вызываем Video.play()
        super<AudioPlayable>.play() // вызываем AudioPlayable.play()
    }
}