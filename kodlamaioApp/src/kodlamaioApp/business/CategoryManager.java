package kodlamaioApp.business;

import java.util.List;

import kodlamaioApp.core.logging.Logger;
import kodlamaioApp.dataAccess.DataDao;
import kodlamaioApp.entities.Category;

public class CategoryManager {
	private List<Category> categories;
	private DataDao dataDao;
	private Logger[] loggers;

	public CategoryManager(List<Category> categories, DataDao dataDao,Logger[] loggers) {
		this.categories = categories;
		this.dataDao = dataDao;
		this.loggers = loggers;
	}

	public void add(Category category) throws Exception {
		for (Category categories : categories) {
			if (categories.getCategoryName().equals(category.getCategoryName())) {
				throw new Exception("Kategori ismi aynı olamaz");
			}

		}
		dataDao.add(category);
		
		for(Logger logger : loggers) {
			logger.log(category.getCategoryName());
		}
	}

}
