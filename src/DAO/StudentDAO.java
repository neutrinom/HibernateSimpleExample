package DAO;

import java.sql.SQLException;
import java.util.List;

import logic.Student;

public interface StudentDAO {
    public void addStudent(Student student) throws SQLException;   //�������� ��������
    public void updateStudent(Student student) throws SQLException;//�������� ��������
    public Student getStudentById(Long id) throws SQLException;    //�������� �������� �� id
    public List getAllStudents() throws SQLException;              //�������� ���� ���������
    public void deleteStudent(Student student) throws SQLException;//������� ��������
}