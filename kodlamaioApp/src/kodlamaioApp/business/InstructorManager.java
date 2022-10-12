package kodlamaioApp.business;

import kodlamaioApp.core.logging.Logger;
import kodlamaioApp.dataAccess.DataDao;

import kodlamaioApp.entities.Instructor;

public class InstructorManager {

	private DataDao dataDao;
	private Logger[] loggers;

	public InstructorManager(DataDao dataDao, Logger[] loggers) {

		this.dataDao = dataDao;
		this.loggers = loggers;
	}

	public void add(Instructor instructor) {
		dataDao.add(instructor);

		for (Logger logger : loggers) {
			logger.log(instructor.getFirstName());
		}

	}
}
