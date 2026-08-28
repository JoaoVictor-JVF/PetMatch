package petmatch;

import java.util.*;

public class BaseAnimais {
    public static List<Animal> getAnimais() {
        List<Animal> animais = new ArrayList<>();

        animais.add(new Animal("Golden Retriever", 4, 4, 5, 5, 2, 2, 3, 4, 3));
        animais.add(new Animal("Labrador Retriever", 5, 4, 5, 5, 2, 2, 3, 4, 3));
        animais.add(new Animal("Border Collie", 5, 5, 5, 5, 2, 1, 5, 4, 5));
        animais.add(new Animal("Shih Tzu", 3, 2, 2, 4, 2, 3, 4, 3, 3));
        animais.add(new Animal("Pug", 2, 2, 2, 4, 3, 3, 4, 3, 3));
        animais.add(new Animal("Dachshund", 3, 2, 3, 4, 3, 2, 3, 3, 4));
        animais.add(new Animal("Bulldog Francês", 2, 2, 2, 4, 3, 3, 4, 4, 3));
        animais.add(new Animal("Poodle", 4, 3, 4, 5, 3, 2, 4, 4, 4));
        animais.add(new Animal("Gato adulto tranquilo", 2, 1, 1, 3, 5, 5, 2, 3, 1));
        animais.add(new Animal("Gato adulto ativo", 4, 2, 3, 4, 4, 4, 2, 3, 2));
        animais.add(new Animal("Gato filhote", 4, 2, 3, 5, 2, 1, 4, 3, 3));

        return animais;
    }
}
