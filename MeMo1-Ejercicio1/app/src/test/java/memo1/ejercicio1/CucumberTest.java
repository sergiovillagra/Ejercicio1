package memo1.ejercicio1;

import org.junit.runner.RunWith;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
  features = "src/test/resources/memo1/ejercicio1",  // Ruta de tus archivos .feature
  plugin = {
    "pretty",  // Para ver los resultados en consola de manera legible
    "html:build/reports/cucumber/cucumber-html-report.html",  // Reporte en HTML
    "json:build/reports/cucumber/cucumber-report.json",  // Reporte en JSON
    "junit:build/reports/cucumber/cucumber-results.xml"  // Reporte en formato JUnit (XML)
  }
)
public class CucumberTest {}
