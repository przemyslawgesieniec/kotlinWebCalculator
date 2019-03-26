package pl.gesieniec.kotlinKalkulator.service

import org.springframework.stereotype.Service

@Service
class CalculationService {

    fun calculate(result: String): Double {

        println(result)
        return 34.0
    }
}