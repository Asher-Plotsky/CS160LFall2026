package edu.sdsu.cs160l.assignment;

import edu.sdsu.cs160l.assignment.model.Student;

import java.util.ArrayList;
import java.util.List;

public class StudentMetricProcessor {
  private final List<Student> students;

  public StudentMetricProcessor(List<Student> students) {
    this.students = students;
  }

  /**
   * TODO (carries 1 point)
   *
   * @return a list of student whose gpa is 4.0
   */
  public List<Student> studentsWithPerfectGpa() {
      List<Student> studentsWithPerfectGpa = new ArrayList<>();
      for(Student student : students) {
          if(student.getGpa() == 4) {
              studentsWithPerfectGpa.add(student);
          }
      }
      return studentsWithPerfectGpa;
  }

  /**
   * TODO (carries 1 point)
   *
   * @return a list of student whose gpa is < 2.85
   */
  public List<Student> studentWithGpaBelow2point85() {
      List<Student> studentsWithGpaBelow2point85 = new ArrayList<>();
      for(Student student : students) {
          if(student.getGpa() < 2.85) {
              studentsWithGpaBelow2point85.add(student);
          }
      }
      return studentsWithGpaBelow2point85;
  }

  /**
   * TODO (carries 1 point)
   *
   * @return a list of all student names hint use map and s->s.getName()
   */
  public List<String> studentNames() {
      List<String> studentNames = new ArrayList<>();
      for(Student student : students) {
          studentNames.add(student.getName());
      }
      return studentNames;
  }

  /**
   * TODO (carries 1 point)
   *
   * @return a list of redIds for all students whose gpa >= 3.0 && gpa <=3.5
   */
  public List<Long> studentRedIdsWithScoreBetweenAndInclusiveOf3point0and3point5() {
      List<Long> redIdsWithScoreBetweenAndInclusiveOf3point0and3point5 = new ArrayList<>();
      for(Student student : students) {
          if(student.getGpa() >= 3 && student.getGpa() <= 3.5) {
              redIdsWithScoreBetweenAndInclusiveOf3point0and3point5.add(student.getRedId());
          }
      }
      return redIdsWithScoreBetweenAndInclusiveOf3point0and3point5;
  }

  /**
   * TODO (carries 1 point)
   *
   * @return a count of students whose gpa >=2.85 && gpa <=3.0, hit use the count method at end of stream instead of collect
   */
  public long countOfStudentsWithGpaBetweenAndInclusiveOf2point85and3point0() {
      long count = 0;
      for(Student student : students) {
          if(student.getGpa() >= 2.85 && student.getGpa() <= 3.0) {
              count += 1;
          }
      }
      return count;
  }
}
