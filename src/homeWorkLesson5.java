public class homeWorkLesson5 {
    public static void main(String[] args) {
        Employee[] employeesArray = new Employee[5];
        employeesArray[0] = new Employee("Иванов Иван Иванович", "Аналитик", "ivanov@yandex.ru", "+79189567843", 100000, 25);
        employeesArray[1] = new Employee("Сидоров Василий Петрович", "Java разрабочик", "sidorov@mail.ru", "+79384567209", 150000, 41);
        employeesArray[2] = new Employee("Степанов Андрей Иванович", "Специалист по тестированию", "andrey.s@google.ru", "+79185687392", 70000, 23);
        employeesArray[3] = new Employee("Еременко Владислав Игоревич", "IOS разработчик", "vado123@yandex.ru", "+79568248233", 120000, 27);
        employeesArray[4] = new Employee("Серов Игорь Николаевич", "Android разработчик", "ivanov@yandex.ru", "+79189567843", 160000, 45);

        overTheAgeOf40(employeesArray);
    }

    public static void overTheAgeOf40(Employee[] employees) {
        for (int i = 0; i < employees.length; i++) {
            if (employees[i].age > 40) {
                employees[i].information();
                System.out.println("---------------------------------------");
            }
        }
    }
}
