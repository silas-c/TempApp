class Celsius(temp: Double = 0.0) : Temperature(Temperature.Unit.C, temp) {
    override fun getTemp() = getTemp(Temperature.Unit.C)

    override fun getTempIn(unit: Temperature.Unit) = getTemp(unit)
}
