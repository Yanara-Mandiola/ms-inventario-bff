package cl.ferremas.ms.ms_inventario_bff;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients
public class MsInventarioBffApplication {

    public static void main(String[] args) {
        SpringApplication.run(MsInventarioBffApplication.class, args);
    }
}
