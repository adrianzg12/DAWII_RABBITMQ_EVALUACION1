package pe.edu.cibertec.RabbitMQEvaluacionDAWII.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import pe.edu.cibertec.RabbitMQEvaluacionDAWII.enespera.producer.RabbitMQProducer;

@RequiredArgsConstructor
@RestController
public class RabbitMQController {

    private final RabbitMQProducer rabbitMQProducer;

    @GetMapping("/enviarmsg")
    public String enviarMensaje(@RequestParam String mensaje) {
        rabbitMQProducer.enviarMensaje(mensaje);
        return "Mensaje sobre el inventario: Stock " + mensaje;
    }
}
