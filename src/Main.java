import java.util.*;


public class Main {
    public static void main(String[] args) {
       List<Student> students = new ArrayList<>();
       List<Teacher> teachers = new ArrayList<>();


        Student s1 = new Student("hally", "dude", 0001, 1);
        Student s2 = new Student("Betty", "Boop", 002, 1);
        Student s3 = new Student("Tom", "Boop", 003, 1);
        Student s4 = new Student("Kris", "Counter", 004, 1);
        Student s5 = new Student("Calvin", "Harris", 005, 1);
        Student s6 = new Student("Betty", "Toop", 006, 1);
        Student s7 = new Student("Christina", "Classy", 7, 1);
        Student s8 = new Student("Allison", "Green", 8, 1);
        Student s9 = new Student("Trevor", "Tiny", 9, 1);
        Student s10 = new Student("Jessup", "Plop", 010, 1);
        Student s11 = new Student("Garland", "Bean", 011, 1);
        Student s12 = new Student("Tom", "Bout", 012, 1);
        Student s13 = new Student("Alex", "James", 013, 1);
        Student s14 = new Student("Tally", "Stoh", 014, 1);
        Student s15 = new Student("Chris", "Tooperson", 015, 1);

        Teacher t1 = new Teacher("lady", "macbeth");
        Teacher t2 = new Teacher("moob", "peanut");
        Teacher t3 = new Teacher("carly", "cruize");



        students.add(s1);
        students.add(s2);
        students.add(s3);
        students.add(s4);
        students.add(s5);
        students.add(s6);
        students.add(s7);
        students.add(s8);
        students.add(s9);
        students.add(s10);
        students.add(s11);
        students.add(s12);
        students.add(s13);
        students.add(s14);
        students.add(s15);



        System.out.println(students);
        Set<Student> classOne = new HashSet<>();



        teachers.add(t1);
        teachers.add(t2);
        teachers.add(t3);
        classOne.add(s1);
        classOne.add(s2);
        classOne.add(s3);
        classOne.add(s4);

        Set<Student> classTwo = new HashSet<>();
        classTwo.add(s5);
        classTwo.add(s6);
        classTwo.add(s7);
        classTwo.add(s8);
        classTwo.add(s9);

        Set<Student> classThree = new HashSet<>();
        classThree.add(s10);
        classThree.add(s11);
        classThree.add(s12);
        classThree.add(s14);
        classThree.add(s15);

        HashMap<Teacher, Set> classesMap = new HashMap<>();
        classesMap.put(t1, classOne);
        classesMap.put(t2, classTwo);
        classesMap.put(t3, classThree);

        for (Teacher teacher : classesMap.keySet()) {
            System.out.println("the teacher is " + teacher.getFirstName() + " " + teacher.getLastName());
        }

        for(Set classMap : classesMap.values()) {
            System.out.println(classMap);
        }


//        for (Teacher teacher: teachers
//             ) {
//            System.out.println();
//            System.out.println();
//        }


    }
}
