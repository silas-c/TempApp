class Fahrenheit(temp: Double = 0.0) : Temperature(Temperature.Unit.F, temp) {
    override fun getTemp() = getTemp(Temperature.Unit.F)

    override fun getTempIn(unit: Temperature.Unit) = getTemp(unit)
}
