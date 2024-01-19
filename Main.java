import java.util.*;

enum NumberRepresentation {
    ZERO("0","zero"),
    ONE("one", "1", "１", "一", "일"),
    TWO("two", "2", "２", "二", "이"),
    THREE("three", "3", "３", "三", "삼");

    private final List<String> representations;

    NumberRepresentation(String... representations) {
        this.representations = List.of(representations);
    }

    public static NumberRepresentation find(String input) {
        for (NumberRepresentation value : values()) {
            if (value.representations.contains(input.toLowerCase())) {
                return value;
            }
        }
        return null;
    }
}

class User {
    private final String name;
    private final String email;
    private final int age;

    public User(String name, String email, int age) {
        this.name = name;
        this.email = email;
        this.age = age;
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", email='" + email + '\'' +
                ", age=" + age +
                '}';
    }
}

public class Main {
    public static boolean task1(boolean darkModeSelected) {
        return !darkModeSelected;
    }

    public static User task2(Map<Integer, String> inpList) {
        String cName = inpList.get(0);
        String cEmail = inpList.get(1);
        String cAge = inpList.get(4);
        return new User(cName, cEmail, Integer.parseInt(cAge));
    }

    public static List<Integer> task3(List<String> results) {
        List<Integer> arr = new ArrayList<>();
        for (String res : results) {
            NumberRepresentation number = NumberRepresentation.find(res);
            if (res != null){
                arr.add(number.ordinal());
            }
        }
        return arr;
    }

    public static void main(String[] args) {
        System.out.println(task1(true));
        System.out.println(task1(false));
        System.out.println(task3(Arrays.asList("one", "two", "three")));
        System.out.println(task3(Arrays.asList("일", "1", "一")));
        Map<Integer, String> data = new HashMap<>();
        data.put(0,"Oles");
        data.put(4, "31");
        data.put(1, "dobosevych@ucu.edu.ua");
        data.put(3, "1991-03-14");
        data.put(5, "UCU");
        System.out.println(task2(data));
    }
}
