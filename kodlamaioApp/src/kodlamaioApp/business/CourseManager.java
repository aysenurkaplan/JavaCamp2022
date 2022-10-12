package kodlamaioApp.business;

import java.util.List;

import kodlamaioApp.core.logging.Logger;
import kodlamaioApp.dataAccess.DataDao;
import kodlamaioApp.entities.Course;

public class CourseManager {
	private List<Course> courses;
	private DataDao dataDao;
	private Logger[] loggers;

	public CourseManager(List<Course> courses, DataDao dataDao, Logger[] loggers) {
		this.courses = courses;
		this.dataDao = dataDao;
		this.loggers = loggers;
	}

	public void add(Course course) throws Exception {
		if (course.getCoursePrice() < 0) {
			throw new Exception("Kursun fiyatı 0 dan küçük olamaz");
		}
		for (Course courses : courses) {
			if (courses.getCourseName() == course.getCourseName()) {
				throw new Exception("Kurs isimleri aynı olamaz");
			}

		}
		dataDao.add(course);

		for (Logger logger : loggers) {
			logger.log(course.getCourseName());
		}

	}
}
