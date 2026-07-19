# Student Grade Management System

A simple Java console application to manage students' grades.

## 📋 Description

This program manages grades for **5 students**, each enrolled in **3 subjects**. It allows entering student data, viewing it in different formats, searching, and calculating statistics — all through a console menu.

## ✨ Features

### Core Requirements
- Enter names and grades for 5 students (3 subjects each)
- **Input validation**: grades must be between 0 and 100, otherwise the user is prompted to re-enter
- Interactive menu:
  1. Show all students' names
  2. Show all students' grades (with letter grades) per subject
  3. Search for a student by name
  4. Count passed students

### Bonus Features
- Display the average grade for each subject
- Display the highest grade in each subject (with the student's name)
- Convert numeric grades to letter grades:

  | Grade Range | Letter |
  |-------------|--------|
  | 85 - 100    | A      |
  | 75 - 84     | B      |
  | 65 - 74     | C      |
  | 50 - 64     | D      |
  | 0 - 49      | F      |

## 🛠️ Requirements

- Java JDK 17+ (uses `switch` expressions)

## ▶️ How to Run

```bash
javac Main.java
java Main
```

## 🖥️ Sample Menu

```
1. Show All Students names.
2. Show all Students grades and letter in each subject.
3. Search Student by name.
4. Count Passed Students
5. Display average for each subject.
6. Display highest grade in each subject.
0. Exit
```
