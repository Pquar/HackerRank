package Stream.Api.Interface;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class PrediteT {
    public static void main(String[] args) {
    List<String> palavras = Arrays.asList("abc","et","cab","ze");


    //
    Predicate<String> maisDeDoisCataracters = palavra-> palavra.length()>2;

    //
    palavras.stream()
            .filter(
                    new Predicate<String>() {
                        @Override
                        public boolean test(String p) {
                            return p.length()>2;
                        }
                        //ou p -> p.length()>2
                    }
            )
            .forEach(System.out::println);
    }
}
