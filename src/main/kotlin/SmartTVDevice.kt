class SmartTvDevice(deviceName: String, deviceCategory: String) :
    SmartDevice(name = deviceName, category = deviceCategory) {

 /*   var speakerVolume = 2
        set(value) {
            if (value in 0..100) {
                field = value
            }
        }*/
    var channelNumber = 1
        set(value) {
            if (value in 0..200) {
                field = value
            }
        }


    fun increaseSpeakerVolume() {
        speakerVolume++
        println("Aumentando o volume $speakerVolume.")
    }

    fun nextChannel() {
        channelNumber++
        println("Alyerando canal $channelNumber.")
    }
}

class SmartLightDevice(name: String, category: String) :
    SmartDevice(name = name, category = category) {

    var brightnessLevel = 0

    override fun turnOn() {
        super.turnOn()
        deviceStatus = "Ligadao"
        brightnessLevel = 2
        println("$name o brilho em: $brightnessLevel.")
    }

    override fun turnOff() {
        deviceStatus = "desligado"
        brightnessLevel = 0
        println("Luzes desligadas")
    }

    fun increaseBrightness() {
        brightnessLevel++
    }
}



class SmartHome(val smartTvDevice: SmartTvDevice) {

    fun turnOnTv() {
        smartTvDevice.turnOn()
    }

    fun turnOffTv() {
        smartTvDevice.turnOff()
    }

    fun increaseTvVolume() {
        smartTvDevice.increaseSpeakerVolume()
    }

    fun changeTvChannelToNext() {
        smartTvDevice.nextChannel()
    }
}