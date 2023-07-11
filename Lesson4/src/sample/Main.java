package sample;

public class Main {
    public static void main(String[] args) {
        Student newStudent11 = new Student("Alexey", "Sidorov", Gender.Male, 13, "group1");
        Student newStudent12 = new Student("Maria", "Petrova", Gender.Female, 12, "group1");
        Student newStudent13 = new Student("Ivan", "Ivanovich", Gender.Male, 11, "group1");
        Student newStudent14 = new Student("Anton", "Antonovich", Gender.Female, 10, "group1");

        Student newStudent21 = new Student("Anton", "Antonovich", Gender.Female, 10, "group2");
        Student newStudent22 = new Student("Ivan", "Ivanovich", Gender.Male, 11, "group2");
        Student newStudent23 = new Student("Maria", "Petrova", Gender.Female, 12, "group2");
        Student newStudent24 = new Student("Alexey", "Sidorov", Gender.Male, 13, "group2");

        Group group1 = new Group();
        group1.setGroupName("group1");
        try {
            group1.addStudent(newStudent11);
            group1.addStudent(newStudent12);
            group1.addStudent(newStudent13);
            group1.addStudent(newStudent14);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        Group group2 = new Group();
        group2.setGroupName("group2");
        try {
            group2.addStudent(newStudent21);
            group2.addStudent(newStudent22);
            group2.addStudent(newStudent23);
            group2.addStudent(newStudent24);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        System.out.println(group1.toString());
        System.out.println(group2.toString());

        StudentKeyboardInput studentKeyboardInput = new StudentKeyboardInput();
        Student newStudent = studentKeyboardInput.addStudent();

        try {
            group1.addStudent(newStudent);
            group2.addStudent(newStudent);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        System.out.println(group1.toString());
        System.out.println(group2.toString());



        CSVStringConverter csvStringConverter = new CSVStringConverter();
        String newStr = csvStringConverter.toStringRepresentation(newStudent);
        System.out.println(newStr);
        Student newCSVstudent = csvStringConverter.fromStringRepresentation(newStr);
        System.out.println(newCSVstudent.toString());
    }
}