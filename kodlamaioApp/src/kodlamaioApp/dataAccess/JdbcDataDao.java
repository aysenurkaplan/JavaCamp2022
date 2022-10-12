package kodlamaioApp.dataAccess;

import kodlamaioApp.entities.Category;
import kodlamaioApp.entities.Course;
import kodlamaioApp.entities.Instructor;

public class JdbcDataDao implements DataDao {

	@Override
	public void add(Course course) {
		System.out.println("Kurs Jdbc ile veritabanına eklendi");
		
	}

	@Override
	public void add(Category category) {
		System.out.println("Kategori Jdbc ile veritabanına eklendi");
		
	}

	@Override
	public void add(Instructor instructor) {
		System.out.println("Eğitmen Jdbc ile veritabanına eklendi");
		
	}

}
