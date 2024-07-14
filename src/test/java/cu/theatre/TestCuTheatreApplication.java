package cu.theatre;

import org.springframework.boot.SpringApplication;

public class TestCuTheatreApplication {

    public static void main(String[] args) {
        SpringApplication.from(CuTheatreApplication::main).with(TestcontainersConfiguration.class).run(args);
    }

}
