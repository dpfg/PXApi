package name.aliaksandrch.px.beans;

public enum Category {
	UNCATEGORIZED("Uncategorized", 0),
	ABSTRACT("Abstract",10),
	ANIMALS("Animals",11),
	BLACK_AND_WHITE("Black and White",5),
	CELEBRITIES("Celebrities",1),
	CITY_AND_ARCHITECTURE("City and Architecture",9),
	COMMERCIAL("Commercial",15),
	CONCERT("Concert",16),
	FAMILY("Family",20),
	FASHION("Fashion",14),
	FILM("Film",2),
	FINE_ART("Fine Art",24),
	FOOD("Food",23),
	JOURNALISM("Journalism",3),
	LANDSCAPES("Landscapes",8),
	MACRO("Macro",12),
	NATURE("Nature",18),
	NUDE("Nude",4),
	PEOPLE("People",7),
	PERFORMING_ARTS("Performing Arts",19),
	SPORT("Sport",17),
	STILL_LIFE("Still Life",6),
	STREET("Street",21),
	TRANSPORTATION("Transporation",26),
	TRAVEL("Travel",13),
	UNDERWATER("Underwater",22),
	URBAN_EXPLORATION("Urban Exploration",27),
	WEDDING("Wedding",25);
	
	private int id;
	private String name;
	
	private Category(String name, int id){
		this.id = id;
		this.name = name;
	}
	
	public int getId(){
		return this.id;
	}

	@Override
	public String toString() {
		return name;
	}
	
	

	
}

