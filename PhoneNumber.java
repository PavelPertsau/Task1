package lec_06_07_2016;

public class PhoneNumber {
	private int type;
	private int number;
	public static int TYPE_WORK = 1;
	public static int TYPE_HOME = 2;
	public static int TYPE_PERSONAL = 3;
	public static String STYPE_WORK = "Рабочий";
	public static String STYPE_HOME = "Домашний";
	public static String STYPE_PERSONAL = "Личный";
	
	
	public PhoneNumber(int type,int number){

		if(type==TYPE_WORK)          this.type = TYPE_WORK;
		else if(type==TYPE_HOME)     this.type = TYPE_HOME;
		else if(type==TYPE_PERSONAL) this.type = TYPE_PERSONAL;
		else System.out.println("Ошибка, отредактируйте тип! 1-Рабочий,2-Домашний,3-Личный");
		this.number = number;
	}
	
	void setType(int type){
		if(type==TYPE_WORK)          this.type = TYPE_WORK;
		else if(type==TYPE_HOME)     this.type = TYPE_HOME;
		else if(type==TYPE_PERSONAL) this.type = TYPE_PERSONAL;
		else System.out.println("Ошибка, отредактируйте тип! 1-Рабочий,2-Домашний,3-Личный");
	}
	void setNumber(int number){
		this.number = number;
	}
	int getType(){
		return type;
	}
	int getNumber(){
		return number;
	}
        void toStrin(){
        	String strin ="";
        	if(type==TYPE_WORK) strin = STYPE_WORK;        
    		else if(type==TYPE_HOME) strin = STYPE_HOME;  
    		else if(type==TYPE_PERSONAL) strin = STYPE_PERSONAL;
    		else strin ="";
            System.out.println("Type: "+ strin +", PhoneNumber: "+number);
        }
}
