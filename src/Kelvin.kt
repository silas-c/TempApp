class Kelvin(temp: Double = 0.0) : Temperature(Temperature.Unit.K, temp) {
    override fun getTemp() = getTemp(Temperature.Unit.K)

    override fun getTempIn(unit: Temperature.Unit) = getTemp(unit)
}
