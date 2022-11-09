import java.util.ArrayList;
class actividad{
  static ArrayList<String> script=new ArrayList<String>();
  static ArrayList<String> objetos_script=new ArrayList<String>();
  static ArrayList<Integer> objetos_index=new ArrayList<Integer>();
  public static void main_2 (String x) {
    System.out.println("class main{");
    System.out.println("  public static void Main (String[] args) {");
    System.out.println("\t"+x);
    System.out.println("  }");
    System.out.println("}");
    
  }  
}

class tipos_dato extends actividad {
  static boolean en_proceso = true;
  static boolean if_check = true;
  static ArrayList<Integer> forloop_index=new ArrayList<Integer>();
  static int codigo=0;
  static ArrayList<Integer> for_start=new ArrayList<Integer>();
  static ArrayList<String> enteros_codigo=new ArrayList<String>();
  static ArrayList<Integer> enteros_valores=new ArrayList<Integer>();
  static ArrayList<String> texto_codigo=new ArrayList<String>();
  static ArrayList<String> random_txt=new ArrayList<String>();
  static ArrayList<Integer> if_trash=new ArrayList<Integer>();
  static int num_int=0;
  static int id_for=0;
  static int index=0;
  static int num_txt=0;
  static int receptor=0;
  static int operador1=0;
  static int operador2=0;
  static int receptor_id;
  static String expresion;
  public static void activity_for (int x,int y,int z) {
    for_start.add(1);
    forloop_index.add(1);
    
    String lol ="  ";
    if (x==0){
      lol="";
    }
    if (x!=2){
      script.add(lol+"for(int i=0;i<"+y+";i++){");
      for_start.add(forloop_index.size());
      crear_ejercicio(1,0,0);
      script.add("}");
    }
    if (x!=1){
      for (int i=0;i!=y;i++){
        index=(int) for_start.get(z);
        crear_ejercicio(0,1,0);
      }  
    } 
    if (z!=0){
      z--;
    }else{
      if(x==0){
        index=0;
      } 
    }
  }
  public static void crear_ejercicio (int x,int y,int w){
    while(en_proceso){
      if (y!=1){
        codigo=(int) (Math.random()*6);
        if (x==1){
          forloop_index.add(codigo);
        }
      } else {
        codigo=(int) forloop_index.get(index);
        ++index;
      }
      
      switch(codigo){
        case 0:{
          en_proceso=false;
          
        }
        case 1:{
          if (y==1){
            codigo=(int) forloop_index.get(index);
            ++index;
            if (w!=1){ 
              ++id_for;
            }
            activity_for(2,codigo,id_for);
          } else {
            codigo=(int) (Math.random()*10);
            if (x==1){
              forloop_index.add(codigo);//forloop_index
              activity_for(1,codigo,0);
            } else {
              activity_for(0,codigo,0);
            }
          }
        
        }
        case 2:{
          if (x==1){
            break;
          }
          if (y==1){
            break;
          }
          crear_variable(0);
        
        }
        case 3:{
          //sumar
          if (enteros_codigo.size()==0){
            crear_variable(0);
          }
          if (enteros_codigo.size()!=0){ 
          codigo=(int)(Math.random());
          if (y==1){
            codigo=((int) forloop_index.get(index));
            index++;
          }
          if (x==1){
            forloop_index.add(codigo);

          }
          if (codigo==1){
            if (y==1){
              codigo=((int) forloop_index.get(index));
              index++;
            } else { 
              codigo=(int)(Math.random()*enteros_codigo.size());
              if (x==1){
              forloop_index.add(codigo);
              }
            }
            if (codigo==enteros_codigo.size()) {
              codigo=(int)(Math.random()*10);
              if (y==1){
                codigo=((int) forloop_index.get(index));
                index++;
              }
              if (x==1){
                forloop_index.add(codigo);
                
              }expresion ="="+codigo+" + ";
              operador1=codigo;
            } else {
                expresion="="+enteros_codigo.get(codigo)+" + ";
                operador1=enteros_valores.get(codigo);
            }
            if (y==1){
              codigo=((int) forloop_index.get(index));
              index++;
            } else { 
              codigo=(int)(Math.random()*enteros_codigo.size());
              if (x==1){
              forloop_index.add(codigo);
              }  
            }
            if (codigo!=0) {
              codigo--;
            }expresion =enteros_codigo.get(codigo)+expresion;
            receptor =enteros_valores.get(codigo);
            receptor_id =codigo;
            
            if (y==1){
              codigo=((int) forloop_index.get(index));
              index++;
            } else { 
                codigo=(int)(Math.random()*enteros_codigo.size());
                if (x==1){
                  forloop_index.add(codigo);

                }
              }
            if (codigo==enteros_codigo.size()) {
              codigo=(int)(Math.random()*10);
              if (y==1){
                codigo=((int) forloop_index.get(index));
                index++;
              }
              if (x==1){
                forloop_index.add(codigo);
                
              }expresion =expresion+codigo+";";
              operador2=codigo;
            } else {
                expresion=expresion+enteros_codigo.get(codigo)+";";
                operador2=enteros_valores.get(codigo);
            }
            receptor=operador1+operador2;
            enteros_valores.set(receptor_id,receptor);
            if (y!=1){
              script.add(expresion);
            }
          }
          }
        }
        case 4:{
          //multiplicar
          if (enteros_codigo.size()==0){
            crear_variable(0);
          }
          if (enteros_codigo.size()!=0){ 
          if (y==1){
              codigo=((int) forloop_index.get(index));
              index++;
            } else { 
              codigo=(int)(Math.random()*enteros_codigo.size());
              if (x==1){
              forloop_index.add(codigo);
              }
            }
            if (codigo==enteros_codigo.size()) {
              codigo=(int)(Math.random()*10);
              if (y==1){
                codigo=((int) forloop_index.get(index));
                index++;
              }
              if (x==1){
                forloop_index.add(codigo);
                
              }expresion ="="+codigo+" * ";
              operador1=codigo;
            } else {
                expresion="="+enteros_codigo.get(codigo)+" * ";
                operador1=enteros_valores.get(codigo);
            }
            if (y==1){
              codigo=((int) forloop_index.get(index));
              index++;
            } else { 
              codigo=(int)(Math.random()*enteros_codigo.size());
              if (x==1){
              forloop_index.add(codigo);
              }  
            }
            if (codigo!=0) {
              codigo--;
            }expresion =enteros_codigo.get(codigo)+expresion;
            receptor =enteros_valores.get(codigo);
            receptor_id =codigo;
            
            if (y==1){
              codigo=((int) forloop_index.get(index));
              index++;
            } else { 
                codigo=(int)(Math.random()*enteros_codigo.size());
                if (x==1){
                  forloop_index.add(codigo);

                }
              }
            if (codigo==enteros_codigo.size()) {
              codigo=(int)(Math.random()*10);
              if (y==1){
                codigo=((int) forloop_index.get(index));
                index++;
              }
              if (x==1){
                forloop_index.add(codigo);
                
              }expresion =expresion+codigo+";";
              operador2=codigo;
            } else {
                expresion=expresion+enteros_codigo.get(codigo)+";";
                operador2=enteros_valores.get(codigo);
            }
            receptor=operador1*operador2;
            enteros_valores.set(receptor_id,receptor);
            if (y!=1){
              script.add(expresion);
            }
          }
        }
        case 5:{
          //restar
          if (enteros_codigo.size()==0){
            crear_variable(0);
          }
          if (enteros_codigo.size()!=0){ 
          if (y==1){
              codigo=((int) forloop_index.get(index));
              index++;
            } else { 
              codigo=(int)(Math.random()*enteros_codigo.size());
              if (x==1){
              forloop_index.add(codigo);
              }
            }
            if (codigo==enteros_codigo.size()) {
              codigo=(int)(Math.random()*10);
              if (y==1){
                codigo=((int) forloop_index.get(index));
                index++;
              }
              if (x==1){
                forloop_index.add(codigo);
                
              }expresion ="="+codigo+" - ";
              operador1=codigo;
            } else {
                expresion="="+enteros_codigo.get(codigo)+" - ";
                operador1=enteros_valores.get(codigo);
            }
            if (y==1){
              codigo=((int) forloop_index.get(index));
              index++;
            } else { 
              codigo=(int)(Math.random()*enteros_codigo.size());
              if (x==1){
              forloop_index.add(codigo);
              }  
            }
            if (codigo!=0) {
              codigo--;
            }expresion =enteros_codigo.get(codigo)+expresion;
            receptor =enteros_valores.get(codigo);
            receptor_id =codigo;
            
            if (y==1){
              codigo=((int) forloop_index.get(index));
              index++;
            } else { 
                codigo=(int)(Math.random()*enteros_codigo.size());
                if (x==1){
                  forloop_index.add(codigo);

                }
              }
            if (codigo==enteros_codigo.size()) {
              codigo=(int)(Math.random()*10);
              if (y==1){
                codigo=((int) forloop_index.get(index));
                index++;
              }
              if (x==1){
                forloop_index.add(codigo);
                
              }expresion =expresion+codigo+";";
              operador2=codigo;
            } else {
                expresion=expresion+enteros_codigo.get(codigo)+";";
                operador2=enteros_valores.get(codigo);
            }
            receptor=operador1-operador2;
            enteros_valores.set(receptor_id,receptor);
            if (y!=1){
              script.add(expresion);
            }
          }
        }
        case 6:{
          if (enteros_codigo.size()==0){
            crear_variable(0);
          }
          if (enteros_codigo.size()!=0){ 
          if (y==1){
              codigo=((int) forloop_index.get(index));
              index++;
            } else { 
              codigo=(int)(Math.random()*enteros_codigo.size());
              if (x==1){
              forloop_index.add(codigo);
              }
            }
            if (codigo==enteros_codigo.size()) {
              codigo=(int)(Math.random()*10);
              if (y==1){
                codigo=((int) forloop_index.get(index));
                index++;
              }
              if (x==1){
                forloop_index.add(codigo);
                
              }expresion ="="+codigo+" / ";
              operador1=codigo;
            } else {
                expresion="="+enteros_codigo.get(codigo)+" / ";
                operador1=enteros_valores.get(codigo);
            }
            if (y==1){
              codigo=((int) forloop_index.get(index));
              index++;
            } else { 
              codigo=(int)(Math.random()*enteros_codigo.size());
              if (x==1){
              forloop_index.add(codigo);
              }  
            }
            if (codigo!=0) {
              codigo--;
            }expresion =enteros_codigo.get(codigo)+expresion;
            receptor =enteros_valores.get(codigo);
            receptor_id =codigo;
            
            if (y==1){
              codigo=((int) forloop_index.get(index));
              index++;
            } else { 
                codigo=(int)(Math.random()*enteros_codigo.size());
                while (enteros_valores.get(codigo)==0){
                  codigo=(int)(Math.random()*enteros_codigo.size());
                  if (codigo==enteros_codigo.size()){
                    break;
                  }
                }
                if (x==1){
                  forloop_index.add(codigo);

                }
              }
            if (codigo==enteros_codigo.size()) {
              codigo=(int)(Math.random()*10);
              if (codigo==0){
                codigo++;
              }
              if (y==1){
                codigo=((int) forloop_index.get(index));
                index++;
              }
              if (x==1){
                forloop_index.add(codigo);
                
              }expresion =expresion+codigo+";";
              operador2=codigo;
            } else {
                expresion=expresion+enteros_codigo.get(codigo)+";";
                operador2=enteros_valores.get(codigo);
            }
            receptor=operador1/operador2;
            enteros_valores.set(receptor_id,receptor);
            if (y!=1){ 
              script.add(expresion);
            }
          }
        }
        case 7:{
          if (y!=1){
            codigo=(int)(Math.random()*(enteros_valores.size()-1));
            if_trash.add(codigo);
            operador1=enteros_valores.get(codigo);
            codigo=(int)(Math.random()*(enteros_valores.size()-1));
            if_trash.add(codigo);
            operador2=enteros_valores.get(codigo);
            codigo=(int)(Math.random()*3);
            if_trash.add(codigo);
          }else{
            operador1=enteros_valores.get(if_trash.get(index-1));
            operador2=enteros_valores.get(if_trash.get(index-2));
            codigo=if_trash.get(index);
          }index++;
          if (codigo==0){
            if_check=operador1<operador2;
            if (if_check){ 
              if (y==1){
                crear_ejercicio(0,1,0);
              } else{
                expresion="if ("+enteros_codigo.get(index-1)+"<"+enteros_codigo.get(index-2)+"){";
                script.add(expresion);
                if (x==1){
                  crear_ejercicio(1,0,0);
                  
                }else{
                  crear_ejercicio(0,0,1);
                }script.add("}");
              }
            
            }else{
              if (y!=1){ 
                crear_ejercicio(1,0,0);
              }
              if (x==1){
                crear_ejercicio(1,0,0);
              }
                
            } 
          }
          if (y==1){
            codigo=((int) forloop_index.get(index));
            index++;
          } else { 
              codigo=(int)(Math.random()*4);
              if (x==1){
                forloop_index.add(codigo);
              }
            }
          
        }
      }
    }en_proceso=true;
  }
}
        
    
  }
  static void resultado (){
     for (int i = 0; i < script.size(); i++) {
      System.out.println(script.get(i));
    }
    for (int i = 0; i < enteros_codigo.size(); i++) {
      System.out.println(enteros_codigo.get(i)+"= "+enteros_valores.get(i));
      
    }
  }
  
}
class clases extends tipos_dato{
  
}