package lec_06_07_2016;

public class PhoneBook {
	private int    id;
	private String fname;
	private String sname;
	private int    tags;
	
	public static int TAG_FRIEND   = 1;
	public static int TAG_COLLEUG  = 2;
	public static int TAG_FAMILY   = 3;
	public static int TAG_MISTRESS = 4;
	public static int TAG_FOREIGN  = 5;
	public static String STAG_FRIEND   = "Друг";
	public static String STAG_COLLEUG  = "Коллега";
	public static String STAG_FAMILY   = "Семья";
	public static String STAG_MISTRESS = "Любовница";
	public static String STAG_FOREIGN  = "Другое";
	
	public PhoneBook(int id,String fname, String sname, int tags){
		this.id = id;
		this.fname = fname;
		this.sname = sname;
		if(tags == TAG_FRIEND) this.tags = TAG_FRIEND;
		else if(tags == TAG_COLLEUG) this.tags = TAG_COLLEUG;
		else if(tags == TAG_FAMILY) this.tags = TAG_FAMILY;
		else if(tags == TAG_MISTRESS) this.tags = TAG_MISTRESS;
		else if(tags == TAG_FOREIGN) this.tags = TAG_FOREIGN;
		else System.out.println("Ошибка,отредактируйте тэги! 1-друг,2-коллега,3-семья,4-любовница,5-другое");
		
	}
	
	void setId(int id){
		this.id=id;
	}
	void setFname(String fname){
		this.fname = fname;
	}
	void setSname(String sname){
		this.sname = sname;
	}
	void setTags(int tags){
		if(tags == TAG_FRIEND) this.tags = TAG_FRIEND;
		else if(tags == TAG_COLLEUG) this.tags = TAG_COLLEUG;
		else if(tags == TAG_FAMILY) this.tags = TAG_FAMILY;
		else if(tags == TAG_MISTRESS) this.tags = TAG_MISTRESS;
		else if(tags == TAG_FOREIGN) this.tags = TAG_FOREIGN;
		else System.out.println("Ошибка,отредактируйте тэги! 1-друг,2-коллега,3-семья,4-любовница,5-другое");
	}
	int getId(){
		return id;
	}
	String getFname(){
		return fname;
	}
	String getSname(){
		return sname;
	}
	int getTags(){
		return tags;
	}
        void toStrin(){
        	String str="";
        	if(tags == TAG_FRIEND) str = STAG_FRIEND;
    		else if(tags == TAG_COLLEUG) str = STAG_COLLEUG;
    		else if(tags == TAG_FAMILY) str = STAG_FAMILY;
    		else if(tags == TAG_MISTRESS) str = STAG_MISTRESS;
    		else if(tags == TAG_FOREIGN) str = STAG_FOREIGN;
            System.out.println("id: "+id+", FirstName: "+fname+", SecondName: "+sname+", Tags: "+str);
        }
}
