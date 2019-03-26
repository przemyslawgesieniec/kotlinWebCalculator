package pl.gesieniec.kotlinKalkulator.controller

import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Controller
import org.springframework.ui.Model
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.ModelAttribute
import org.springframework.web.bind.annotation.PostMapping
import pl.gesieniec.kotlinKalkulator.service.CalculationService


@Controller
class CalculatorController {

    @Autowired
    lateinit var calculationService: CalculationService

    @GetMapping("/")
    fun init(): String {
        return "index"
    }

    @PostMapping("/calculate")
    fun calculate(@ModelAttribute("result") result: String, model: Model): String {

        val calculatedValue = calculationService.calculate(result)
        print("my result: ")
        print(result)
        model.addAttribute("result", calculatedValue)
        return "index"
    }

}