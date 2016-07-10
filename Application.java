package lec_06_07_2016;


import java.util.Scanner;


public class Application {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		final int EXIT        = 0;
		final int INSERT      = 1;
		final int DELETE      = 2;
		final int EDIT        = 3;
        final int SORT        = 4;
        final int VIEV        = 5;
        final int PARAM_ID 	  = 0;
        final int PARAM_NUMB  = 1;
        final int PARAM_FNAME = 0;
        final int PARAM_SNAME = 1;
        final int ARR_SIZE    = 10;
		int id = 1;
		int menu;
            	
		PhoneBook   pb[] = new PhoneBook[ARR_SIZE];
		PhoneNumber pn[] = new PhoneNumber[ARR_SIZE];
		MyMethods   my   = new MyMethods();
	    Scanner     sc   = new Scanner(System.in);
	    Scanner     scs  = new Scanner(System.in);
			do{							
				menu = my.enterInt(sc,"Введите 0-для выхода, 1- для добавления, "
						            + "2- удаления, 3- редактирования, "
						            + "4- сортировки, 5-просмотра телефонной книги");
				switch(menu){
				case INSERT:	    
				    System.out.println("Меню добавления записи "); 
                    for(int i=0;i<pn.length;i++){
                        if(pn[i]== null && pb[i]== null){		   
                        	int  number = my.enterInt(sc,"Введите номер "+ id + "-го контакта"); 
                        	int type;
                        	do{
                        		type = my.enterInt(sc,"Введите тип (домашний- 1, рабочий - 2, "
                        			                + "личный - 3) "+ id + "-го контакта");	
                        		if(type <=0 || type >3) 
                        			System.out.println("Ошибка! Значения должны быть: "
                        				                + " домашний- 1, рабочий - 2, "
                        			                    + "личный - 3) ");
                        	}while(type <=0 || type >3);
                        	String fname = my.enterString(scs,"Введите Имя "+ id + "-го контакта");                      	
                        	String sname = my.enterString(scs,"Введите Фамилию "+ id + "-го контакта");
                        	int tags;
                        	do{
                        		tags = my.enterInt(sc,"Введите тэг (1-друг, 2-коллега, 3-семья, "
                        			                + "4-любовница, 5-другое)"+ id + "-го контакта");
                        		if(tags<=0 || tags>5)
                        			System.out.println("Ошибка! Значения должны быть: "
            				                            + "1-друг, 2-коллега, 3-семья, "
                        			                    + "4-любовница, 5-другое) ");
                        	}while(tags<=0 || tags>5);
                        	pn[i] = new PhoneNumber(type,number);
                        	pb[i] = new PhoneBook(id, fname, sname, tags);				
                        	id++;
                            break;
                        }
                       		
				     }
                break;
				case DELETE:  
					System.out.println("Меню удаления");
                    int delete = my.enterInt(sc,"Enter 1 - id, 2 - FirstName, 3 - SecondName, 4 - PhoneNumber ");
                    switch(delete){
                       case 1: 
                          int temp = my.enterInt(sc,"Enter id");
                          my.delete(pb, pn, temp, PARAM_ID);
                       break;
                       case 2:
                          String fname = my.enterString(scs,"Enter FirstName");
                          my.delete(pb, pn, fname, PARAM_FNAME);
                       break;
                       case 3:
                          String sname = my.enterString(scs,"Enter SecondName");
                          my.delete(pb, pn, sname,  PARAM_SNAME);
                       break;
                       case 4:
                          int numb = my.enterInt(sc,"Enter PhoneNumber");
                          my.delete(pb, pn, numb, PARAM_NUMB);
                       break;
                       default: break;
                   }
                break;                                        
				case EDIT:
					System.out.println("Меню редактирования");
                    int tempid = my.enterInt(sc,"Введите id контакта");
                       for(int i=0; i<pb.length;i++){
                          if(pb[i]!=null && pn[i]!=null && pb[i].getId()== tempid){
                              int edit = my.enterInt(sc,"Enter 1-FName,2-SName,3-PHumber,4-Type,5-Tags");
                              switch(edit){
                                 case 1: 
                                    String fname = my.enterString(scs,"Enter Fname"); 
                                    pb[i].setFname(fname);
                                 break;
                                 case 2:
                                    String sname = my.enterString(scs,"Enter Sname"); 
                                    pb[i].setSname(sname);
                                 break;
                                 case 3:
                                    int phnumber = my.enterInt(sc,"Enter PNumber"); 
                                    pn[i].setNumber(phnumber);
                                 break;
                                 case 4:
                                    int type = my.enterInt(sc,"Enter Type");
                                    pn[i].setType(type);
                                 break;
                                 case 5:
                                    int tag = my.enterInt(sc,"Enter Tags");
                                    pb[i].setTags(tag);
                                 break;
                                 default : break;
                             }
                         }
                     }                               
                break;           
				case SORT:              
					System.out.println("Меню сортировки");
                    int sort = my.enterInt(sc,"Введите число для сортировки по: 1-FirstName "
                    		                + "2-SecondName 3-pfoneNumb 4-type 5-tags");
                    switch(sort){
                       case 1:
                          my.sortFName(pb, pn);
                       break;
                       case 2:
                          my.sortFName(pb, pn);
                       break;
                       case 3:
                          my.sortNumber(pb, pn);
                       break;
                       case 4:
                          my.sortType(pb, pn);
                       break;
                       case 5:
                          my.sortTags(pb, pn);
                       break;
                       default: break;
                    }
                break;                                     
				case VIEV:
					System.out.println("Меню просмотра");
					my.viev(pb, pn); 
			    break;
			    default: break;
                }
				
			}while(menu!= EXIT);
			System.out.println("Выход из программы. Программа завершена!");
			sc.close();
			scs.close();
			sc = null;	
			scs = null;
	}
}

