package kodlamaioApp;

import kodlamaioApp.business.CategoryManager;
import kodlamaioApp.business.CourseManager;
import kodlamaioApp.dataAccess.HibernateDataDao;
import kodlamaioApp.dataAccess.JdbcDataDao;
import kodlamaioApp.entities.Category;
import kodlamaioApp.entities.Course;
import kodlamaioApp.core.logging.DatabaseLogger;
import kodlamaioApp.core.logging.FileLogger;
import kodlamaioApp.core.logging.MailLogger;
import kodlamaioApp.core.logging.Logger;

import java.util.ArrayList;
import java.util.List;

public class Main {

	public static void main(String[] args) throws Exception {

		Course course1 = new Course(1, "Java", 100);
		Course course2 = new Course(2, "C#", 200);
		Course course3 = new Course(3, "Phyton", 300);
		Logger[] loggers = {new DatabaseLogger(), new FileLogger(),new MailLogger()};

		List<Course> courses = new ArrayList<>();
		courses.add(course1);
		courses.add(course2);
		courses.add(course3);
		CourseManager coursemanager = new CourseManager(courses, new JdbcDataDao(),loggers);
		coursemanager.add(course3);

		Category category1 = new Category("Yazılım");
		Category category2 = new Category("Donanım");
		List<Category> categories = new ArrayList<>();
		categories.add(category1);
		categories.add(category2);

		CategoryManager categoryManager = new CategoryManager(categories, new HibernateDataDao(),loggers);
		categoryManager.add(category1);
		categoryManager.add(category2);

	}

}
