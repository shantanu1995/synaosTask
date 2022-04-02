package synaos.entities;

import java.time.LocalDate;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value = "org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor")
@StaticMetamodel(Calendar.class)
public abstract class Calendar_ {

	public static volatile SingularAttribute<Calendar, LocalDate> date;
	public static volatile SingularAttribute<Calendar, String> weekday;
	public static volatile SingularAttribute<Calendar, String> season;
	public static volatile SingularAttribute<Calendar, Integer> seasonWeek;
	public static volatile SingularAttribute<Calendar, Integer> id;
	public static volatile ListAttribute<Calendar, Celebrations> celebrationsList;

	public static final String DATE = "date";
	public static final String WEEKDAY = "weekday";
	public static final String SEASON = "season";
	public static final String SEASON_WEEK = "seasonWeek";
	public static final String ID = "id";
	public static final String CELEBRATIONS_LIST = "celebrationsList";

}

