fun main() {
    fun checkTemp(actual: Double, expected: Double) {
        check(kotlin.math.abs(actual - expected) < 0.000001) {
            "Expected $expected, but got $actual"
        }
    }

    val celsius = Celsius(100.0)
    checkTemp(celsius.getTemp(), 100.0)
    checkTemp(celsius.getTempIn(Temperature.Unit.F), 212.0)
    checkTemp(celsius.getTempIn(Temperature.Unit.K), 373.15)

    val fahrenheit = Fahrenheit(32.0)
    checkTemp(fahrenheit.getTemp(), 32.0)
    checkTemp(fahrenheit.getTempIn(Temperature.Unit.C), 0.0)
    checkTemp(fahrenheit.getTempIn(Temperature.Unit.K), 273.15)

    val kelvin = Kelvin(273.15)
    checkTemp(kelvin.getTemp(), 273.15)
    checkTemp(kelvin.getTempIn(Temperature.Unit.C), 0.0)
    checkTemp(kelvin.getTempIn(Temperature.Unit.F), 32.0)

    kelvin.setTemp(373.15)
    checkTemp(kelvin.getTempIn(Temperature.Unit.C), 100.0)

    println("All temperature tests passed")
}