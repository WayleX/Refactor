import java.util.*;

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
        int number = -1;
        for (String res : results) {
            if (res.toLowerCase().contains("three") || res.contains("3") || res.contains("３")
                    || res.contains("三") || res.contains("삼")) {
                number = 3;
            } else if (res.toLowerCase().contains("two") || res.contains("2") ||
                    res.contains("２") || res.contains("二") || res.contains("이")) {
                number = 2;
            } else if (res.toLowerCase().contains("one") || res.contains("1") ||
                    res.contains("１") || res.contains("一") || res.contains("일")) {
                number = 1;
            }
            arr.add(number);
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
