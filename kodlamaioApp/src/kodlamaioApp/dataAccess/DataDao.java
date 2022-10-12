package kodlamaioApp.dataAccess;

import kodlamaioApp.entities.Course;
import kodlamaioApp.entities.Category;
import kodlamaioApp.entities.Instructor;

public interface DataDao {
  public void add(Course course);
  public void add(Category category);
  public void add(Instructor instructor);
  
}
