package kodlamaioApp.dataAccess;

import kodlamaioApp.entities.Category;
import kodlamaioApp.entities.Course;
import kodlamaioApp.entities.Instructor;

public class HibernateDataDao implements DataDao {

	@Override
	public void add(Course course) {
		System.out.println("Kurs hibernate ile veritabanına eklendi");
		
	}

	@Override
	public void add(Category category) {
		System.out.println("Kategori hibernate ile veritabanına eklendi");
		
	}

	@Override
	public void add(Instructor instructor) {
		System.out.println("Eğitmen hibernate ile veritabanına eklendi");
		
	}

}
