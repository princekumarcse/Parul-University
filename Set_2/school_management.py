# Class for Student
class Student:
    def __init__(self, name, roll_no):
        self.name = name
        self.roll_no = roll_no
        self.courses = []

    def enroll(self, course):
        self.courses.append(course)
        print(self.name, "enrolled in", course.course_name)

    def display(self):
        print("\nStudent Name:", self.name)
        print("Roll No:", self.roll_no)
        print("Courses:", [c.course_name for c in self.courses])


# Class for Teacher
class Teacher:
    def __init__(self, name, subject):
        self.name = name
        self.subject = subject

    def display(self):
        print("\nTeacher Name:", self.name)
        print("Subject:", self.subject)


# Class for Course
class Course:
    def __init__(self, course_name, teacher):
        self.course_name = course_name
        self.teacher = teacher

    def display(self):
        print("\nCourse Name:", self.course_name)
        print("Teacher:", self.teacher.name)


# Creating Teacher Objects
t1 = Teacher("Mr. Sharma", "Python")
t2 = Teacher("Ms. Riya", "Math")

# Creating Course Objects
c1 = Course("Python Programming", t1)
c2 = Course("Mathematics", t2)

# Creating Student Objects
s1 = Student("Aman", 101)
s2 = Student("Priya", 102)

# Enrolling Students
s1.enroll(c1)
s1.enroll(c2)
s2.enroll(c1)

# Displaying Details
s1.display()
s2.display()
c1.display()
c2.display()
t1.display()
t2.display()