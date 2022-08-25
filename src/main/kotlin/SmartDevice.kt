open class SmartDevice (val name: String, val category: String)  {
//mostrar var e val
   // val name = "Android TV"
  //  val category = "Entertainment"
    var deviceStatus = "online"


    constructor(name: String, category: String, statusCode: Int) : this(name, category) {
        deviceStatus = when (statusCode) {
            0 -> "offline"
            1 -> "online"
            else -> "unknown"
        }
    }

    open fun turnOn(){
        println("Ligado.")
    }

    open fun turnOff(){
        println("Desligado.")
    }

    var speakerVolume =0
        set(value) {
            if (value in 0..100) {
                field = value
            }
        }
}

fun main(){

    val fone =  SmartDevice(name = "Android TV", category = "Entertainment")
    fone.turnOn()
    println("Dospositivo ${fone.name}")

    var fone2 =   SmartDevice(name = "Smart", category = "Entertainment")
   // fone2.name="Smart"
    println("Dospositivo ${fone2.name}")
    fone2.turnOff()
    fone.speakerVolume=1000
    println(fone.speakerVolume)

    val tv = SmartTvDevice("Teste","Jogatina")
    println("TV ${tv.name} e ${tv.channelNumber}")
    tv.increaseSpeakerVolume()
    tv.nextChannel()
    println("TV ${tv.name} e ${tv.channelNumber}")

    val lamp= SmartLightDevice("Alexa", "Teste")
    lamp

}