package taskweekchapter2;

public class University {
    public static class Department{
        private String name;

        public Department(String name){
            this.name = name;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }
    }

    public static void main(String[] args) {
        University.Department dept = new University.Department("Разработки");
        System.out.println("Название отделения " + dept.getName());
    }

}
