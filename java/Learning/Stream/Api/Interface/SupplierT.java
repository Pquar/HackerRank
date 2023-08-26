package Stream.Api.Interface;

import java.util.List;
import java.util.function.Supplier;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class SupplierT {
    public static void main(String[] args) {

        Supplier<String> nomeSupplier = () -> "Ola!";

        List<String> letras = Stream.generate(
                () -> {
                            return "Ola3";
                        }
                        //ou () -> "ola3"
                )
                .limit(3)
                .collect(Collectors.toList());

        //methodo Reference ::
        System.out.println(nomeSupplier);
        letras.forEach(System.out::println);
    }
}
