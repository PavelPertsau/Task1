package lec_06_07_2016;

import java.util.Scanner;
public class MyMethods {
	MyMethods(){
		
	}
//--------------------------Методы ввода--------------------------------------
	int enterInt(Scanner sc,String mesage){
		int temp = 0;
		String str;
		do{
			System.out.println(mesage);
			try{
				sc.reset();
				str = sc.nextLine();
				sc.reset();
				temp = Integer.parseInt(str);
				System.out.println("Введено значение: "+temp);
				return temp;
			}
			catch(NumberFormatException e){
				System.out.println("Ошибка! Вы ввели символ или строку, введите число!");
				
			}
		}while(true);
	}
	
	String enterString(Scanner sc,String mesage){
		String str = null;
		System.out.println(mesage);
		sc.reset();
		str = sc.next();
		return str;
	}
//---------------------------------метод просмотра------------------------------	
	void viev(PhoneBook pb[],PhoneNumber pn[]){
		for(int i=0;i<pb.length;i++){
            if(pb[i]!=null && pn[i]!=null){
                pb[i].toStrin();
                pn[i].toStrin();
                System.out.println("adress PN:"+ pn[i]+ ",5 adress PB:"+ pb[i]);
                System.out.println("---------------------------"
       		                        + "------------------------------");
            }
            else {
            		System.out.println("NULL adress PN:"+ pn[i] + ", NULL adress PB:"+ pb[i]);
            	System.out.println("---------------------------"
       		                        + "------------------------------");
            		
                 }
            }
	}
//--------------------------------методы удаления----------------------------------------
	void delete(PhoneBook pb[],PhoneNumber pn[],int temp,int param){
		for(int i=0;i<pn.length;i++){
            if(pn[i]!=null && pb[i]!=null){
               switch(param){
               	   case 0: if(temp==pb[i].getId()){
                          		System.out.println("DELETED "+pb[i].getId());
                          		pb[i]= null ;
                          		pn[i]= null ;                 
                           } 
               	   break;
               	   case 1: if(temp==pn[i].getNumber()){
               		   			System.out.println("DELETED "+pn[i].getNumber());
               		   			pb[i]= null;
               		   			pn[i]= null;
               	            }
               	   break;
               	   default: break;
               }
            }
        }  
	}

    void delete(PhoneBook pb[],PhoneNumber pn[],String str,int param){
    	for(int i=0;i<pn.length;i++){ 
            if(pn[i]!=null && pb[i]!=null){
            	switch(param){
            	   case 0:  if(str.equals(pb[i].getFname())){
                       System.out.println("DELETED "+pb[i].getFname());
                       pb[i]= null;
                       pn[i]= null;
                       
                   }
            	   break;
            	   case 1: if(str.equals(pb[i].getSname())){
                       System.out.println("DELETED "+pb[i].getSname());
                       pb[i]= null;
                       pn[i]= null;
                       
                   }
            	   break;
            	   default: break;
            }
        }
	}
}
 
  //--------------------------------методы сортировки------------------------------------------
  void sortSName(PhoneBook pb[],PhoneNumber pn[]){
	  boolean flag;
	  do{
  		flag = false;
          for(int i=0;i<pb.length-1;i++){
              if(pb[i]!=null && pb[i+1]!=null){  
              	if(pb[i].getSname().compareTo(pb[i+1].getSname())>0){
              		flag = sortPointer(pb,pn,i);
          		}
              }else if(pb[i]== null && pb[i+1]!=null){
            	  flag = sortPointNull(pb,pn,i);
              }
          }
  	}while(flag);
  }
  //-------------------------------------------------------------------------------
  void sortFName(PhoneBook pb[],PhoneNumber pn[]){
	  boolean flag;
	  do{
  		flag = false;
          for(int i=0;i<pb.length-1;i++){
              if(pb[i]!=null && pb[i+1]!=null){  
              	if(pb[i].getFname().compareTo(pb[i+1].getFname())>0){
              		flag = sortPointer(pb,pn,i);
          		}
              }else if(pb[i]== null && pb[i+1]!=null){
            	  flag = sortPointNull(pb,pn,i);
              }
          }
  	}while(flag);
  }
  //-------------------------------------------------------------------------------
  void sortNumber(PhoneBook pb[],PhoneNumber pn[]){
	  boolean flag;
	  do{
  		flag = false;
          for(int i=0;i<pn.length-1;i++){
              if(pn[i]!=null && pn[i+1]!=null){  
              	if(pn[i].getNumber()> pn[i+1].getNumber()){
              		flag = sortPointer(pb,pn,i);
          		}
              }else if(pn[i]== null && pn[i+1]!=null){
            	  flag = sortPointNull(pb,pn,i);
              }
          }
  	}while(flag);
  }
  //-------------------------------------------------------------------------------
  void sortType(PhoneBook pb[],PhoneNumber pn[]){
	  boolean flag;
	  do{
  		flag = false;
          for(int i=0;i<pn.length-1;i++){
              if(pn[i]!=null && pn[i+1]!=null){  
              	if(pn[i].getType()> pn[i+1].getType()){
              		flag = sortPointer(pb,pn,i);
          		}
              }else if(pb[i]== null && pb[i+1]!=null){
            	  flag = sortPointNull(pb,pn,i);
              }
          }
  	}while(flag);
  }
  //-------------------------------------------------------------------------------
  void sortTags(PhoneBook pb[],PhoneNumber pn[]){
	  boolean flag;
	  do{
  		flag = false;
          for(int i=0;i<pb.length-1;i++){
              if(pb[i]!=null && pb[i+1]!=null){  
              	if(pb[i].getTags()>pb[i+1].getTags()){
              		flag = sortPointer(pb,pn,i);
          		}
              }else if(pb[i]== null && pb[i+1]!=null){
            	  flag = sortPointNull(pb,pn,i);
              }
          }
  	}while(flag);
  }
 //--------------------------------------------------------------------------
  boolean sortPointer(PhoneBook pb[],PhoneNumber pn[],int i){
	  PhoneBook a = pb[i];
      pb[i]=pb[i+1];
      pb[i+1]= a;
      PhoneNumber b = pn[i];
      pn[i]=pn[i+1];
      pn[i+1]= b;
      System.out.println("Сортировка завершена!");
	  return true;
  }
 //---------------------------------------------------------------------------
  boolean sortPointNull(PhoneBook pb[],PhoneNumber pn[],int i){
	  pb[i]= pb[i+1];
      pb[i+1]=null;
      pn[i]= pn[i+1];
      pn[i+1]=null;
      System.out.println("Сортировка пустых контактов завершена!");
      return true;
  }
}
