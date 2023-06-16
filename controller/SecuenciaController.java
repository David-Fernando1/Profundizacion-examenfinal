package co.edu.poli.Examenfinal.controller;

import co.edu.poli.Examenfinal.helpers.Response;
import co.edu.poli.Examenfinal.helpers.ResponseBuild;
import co.edu.poli.Examenfinal.persistence.entity.Secuencia;
import co.edu.poli.Examenfinal.services.SecuenciaService;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/adn")
@RequiredArgsConstructor
public class SecuenciaController {

    private final SecuenciaService secuenciaService;
    private final ResponseBuild builder;

    @PostMapping
    public Response save(@Valid @RequestBody Secuencia secuencia, BindingResult result){
        if (result.hasErrors()){
            return builder.failed(this.formatMessage(result));
        }
        secuenciaService.save(secuencia);
        return builder.success(secuencia);
    }

    private List<Map<String, String>> formatMessage(BindingResult result) {
        List<Map<String, String>> errors = result.getFieldErrors().stream()
                .map(error -> {
                    Map<String, String> err = new HashMap<>();
                    err.put(error.getField(), error.getDefaultMessage());
                    return err;
                }).collect(Collectors.toList());
        return errors;
    }
}
