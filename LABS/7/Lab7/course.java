class Course {

    private static final int INITIAL_SIZE = 3;

    private String courseName;

    private String[] students = new String[INITIAL_SIZE];

    private int numberOfStudents;
    public Course(String courseName) {

        this.courseName = courseName;

    }

    public void addStudent(String student) {

        if (numberOfStudents >= students.length)

            students = grow(students);

        students[numberOfStudents] = student;

        numberOfStudents++;

    }
    public String[] getStudents() {

        return students;

    }
    public int getNumberOfStudents() {

        return numberOfStudents;

    }  

    public String getCourseName() {

        return courseName;

    }  

    public void dropStudent(String student) {

      for (int i = 0; i < numberOfStudents; i++)

            if (students[i].equals(student)) {

                while (i < numberOfStudents) {

                    students[i] = students[i+1];

                    i++;

                }

                numberOfStudents--;

                return;

            }

    }

    public void clear() {

        numberOfStudents = 0;

    }

    public String listStudents() {

        String list = numberOfStudents == 0 ? "no students enrolled" : "";

        for (int i = 0; i < numberOfStudents; i++)

            list += String.format("%2d: %s\n", i+1, students[i]);

        return list;

    }

    private String[] grow(String[] oldArray) {  // set new size 

        int newSize = oldArray.length >= INITIAL_SIZE ? oldArray.length * 2 : INITIAL_SIZE;

        String[] newArray = new String[newSize];

        System.arraycopy(oldArray, 0, newArray, 0, oldArray.length);

        return newArray;

    }
    public String toString() {

        return String.format("Course name: %s; enrollment: %d/%d", courseName, numberOfStudents, students.length);

    }

}