package com.example.demo.rest;//
import java.util.List;//
import com.example.demo.model.Duenio;//
import com.example.demo.service.DuenioService;//
import org.springframework.beans.factory.annotation.Autowired;//
import org.springframework.http.ResponseEntity;//
import org.springframework.web.bind.annotation.GetMapping;//
import org.springframework.web.bind.annotation.RequestMapping;//
import org.springframework.web.bind.annotation.RestController;//


@RestController
@RequestMapping("/duenio")
public class DuenioRest {

    @Autowired
    private DuenioService duenioService;

    @GetMapping
    private ResponseEntity<List<Duenio>> getAllDuenio(){
        return ResponseEntity.ok(duenioService.findAll());
    }
}
