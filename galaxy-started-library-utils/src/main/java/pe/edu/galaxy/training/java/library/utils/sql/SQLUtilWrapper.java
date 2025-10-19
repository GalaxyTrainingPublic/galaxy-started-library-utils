package pe.edu.galaxy.training.java.library.utils.sql;

import static java.util.Objects.isNull;

public class SQLUtilWrapper {

	public String getLike(String str, PositionEnum postion) {
		return  SQLUtil.getLike(str,postion);
	}
}
