/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package studentinformationsystems;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
/**
 *
 * @author easterPC
 */
public class StudentDAO {
     public void addStudent(Student student) {

        String sql = "INSERT INTO students(first_name, last_name, age, email) VALUES (?, ?, ?, ?)";

        try {
            Connection conn = DBconnection.getConnection();
            PreparedStatement ps = conn.prepareStatement(sql);

            ps.setString(1, student.getFirstName());
            ps.setString(2, student.getLastName());
            ps.setInt(3, student.getAge());
            ps.setString(4, student.getEmail());

            ps.executeUpdate();

            System.out.println("Student added successfully!");

        } catch (Exception e) {
            e.printStackTrace();
        }
    }


    // READ (SELECT)
    public ArrayList<Student> getAllStudents() {

        ArrayList<Student> students = new ArrayList<>();
        String sql = "SELECT * FROM students";

        try {
            Connection conn = DBconnection.getConnection();
            PreparedStatement ps = conn.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();

            while (rs.next()) {

                Student student = new Student();

                student.setStudentId(rs.getInt("student_id"));
                student.setFirstName(rs.getString("first_name"));
                student.setLastName(rs.getString("last_name"));
                student.setAge(rs.getInt("age"));
                student.setEmail(rs.getString("email"));

                students.add(student);
            }

        } catch (Exception e) {
            e.printStackTrace();
        }

        return students;
    }


    // UPDATE
    public void updateStudent(Student student) {

        String sql = "UPDATE students SET first_name=?, last_name=?, age=?, email=? WHERE student_id=?";

        try {
            Connection conn = DBconnection.getConnection();
            PreparedStatement ps = conn.prepareStatement(sql);

            ps.setString(1, student.getFirstName());
            ps.setString(2, student.getLastName());
            ps.setInt(3, student.getAge());
            ps.setString(4, student.getEmail());
            ps.setInt(5, student.getStudentId());

            ps.executeUpdate();

            System.out.println("Student updated successfully!");

        } catch (Exception e) {
            e.printStackTrace();
        }
    }


    // DELETE
    public void deleteStudent(int studentId) {

        String sql = "DELETE FROM students WHERE student_id=?";

        try {
            Connection conn = DBconnection.getConnection();
            PreparedStatement ps = conn.prepareStatement(sql);

            ps.setInt(1, studentId);

            ps.executeUpdate();

            System.out.println("Student deleted successfully!");

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
