import java.util.*;
import java.util.stream.*;
import java.lang.reflect.*;


public class UseCaseTracker {
    public static void
    trackUseCases(List<Integer> useCases, Class<?> cl) {

        for (Method name: Arrays.asList(cl.getDeclaredMethods()) ) {
            System.out.println("方法名"+name);
        }
        for(Method m : cl.getDeclaredMethods()) {
            UseCase uc = m.getAnnotation(UseCase.class);
            if(uc != null) {
                System.out.println("ID is " + uc.id() + ", " + uc.description());
                useCases.remove(Integer.valueOf(uc.id()));
            }
        }
        System.out.println(useCases);
        useCases.forEach(i -> System.out.println("Missing use case " + i));
    }
    public static void main(String[] args) {
        List<Integer> useCases = IntStream.range(47, 51)
                .boxed().collect(Collectors.toList());
        System.out.println(useCases);
        trackUseCases(useCases, PasswordUtils.class);
    }
}