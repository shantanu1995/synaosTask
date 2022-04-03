package synaos.entities;

import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value = "org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor")
@StaticMetamodel(Celebrations.class)
public abstract class Celebrations_ {

	public static volatile SingularAttribute<Celebrations, Calendar> calendar;
	public static volatile SingularAttribute<Celebrations, String> colour;
	public static volatile SingularAttribute<Celebrations, Integer> id;
	public static volatile SingularAttribute<Celebrations, String> ranker;
	public static volatile SingularAttribute<Celebrations, String> title;
	public static volatile SingularAttribute<Celebrations, Double> rankNo;

	public static final String CALENDAR = "calendar";
	public static final String COLOUR = "colour";
	public static final String ID = "id";
	public static final String RANKER = "ranker";
	public static final String TITLE = "title";
	public static final String RANK_NO = "rankNo";

}

