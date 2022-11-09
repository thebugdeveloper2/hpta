import java.util.ArrayList;
class tipos_dato { 
  static ArrayList<String> script=new ArrayList<String>();
  static boolean en_proceso=true;
  static int id_for=0;
  static int index=0;
  static int receptor;
  static int num_int=0;
  static String expresion;
  static int operador1_id,operador2_id,receptor_id;
  static ArrayList<String> enteros_codigo=new ArrayList<String>();
  static ArrayList<Integer> enteros_valores=new ArrayList<Integer>();
  static ArrayList<Integer> forloop_index=new ArrayList<Integer>();
  static int codigo=0;
  static ArrayList<Integer> for_start=new ArrayList<Integer>();
  public static void activity_for (int x,int y,int z) {

    String lol ="";
    if (x!=0){
      for (int f=0;f!=z;f++){ 
        lol="  "+lol;
      }
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
              forloop_index.add(codigo);
              ++id_for;//forloop_index
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
          if (y!=1){
            operador1_id=(int) (Math.random()*(enteros_codigo.size()-1));
            operador2_id=(int) (Math.random()*(enteros_codigo.size()-1));
            receptor_id=(int) (Math.random()*(enteros_codigo.size()-1));
            if (x==1){
              forloop_index.add(operador1_id);
              forloop_index.add(operador2_id);
              forloop_index.add(receptor_id);
            }
          }else {
            operador1_id=forloop_index.get(index);
            index++;
            operador2_id=forloop_index.get(index);
            index++;
            receptor_id=forloop_index.get(index);
            index++;
          }
          if (y!=1){
            expresion=enteros_codigo.get(receptor_id)+"="+enteros_codigo.get(operador1_id)+"+"+enteros_codigo.get(operador2_id)+";";
            script.add(expresion);
          } 
          if (x!=1){
            receptor= enteros_valores.get(operador1_id)+enteros_valores.get(operador2_id);
            enteros_valores.set(receptor_id,receptor);
          }  
        }
      }
    }
  }
  static void crear_variable (int x){
    num_int++;
    codigo=(int)(Math.random()*10);
    enteros_codigo.add("entero"+num_int);
    enteros_valores.add(codigo);
    script.add("int entero"+num_int+"= "+codigo+";");
  }
  static void operacion (int x, int y, int z){
    if (enteros_codigo.size()==0){
      crear_variable(0);
    }
    if (y!=1){
      operador1_id=(int) (Math.random()*(enteros_codigo.size()-1));
      operador2_id=(int) (Math.random()*(enteros_codigo.size()-1));
      receptor_id=(int) (Math.random()*(enteros_codigo.size()-1));
      if (x==1){
        forloop_index.add(operador1_id);
        forloop_index.add(operador2_id);
        forloop_index.add(receptor_id);
      }
    }else {
      operador1_id=forloop_index.get(index);
      index++;
      operador2_id=forloop_index.get(index);
      index++;
      receptor_id=forloop_index.get(index);
      index++;
      }
    if (y!=1){
      expresion=enteros_codigo.get(receptor_id)+"="+enteros_codigo.get(operador1_id)+"+"+enteros_codigo.get(operador2_id)+";";
      script.add(expresion);
    } 
    if (x!=1){
      receptor= enteros_valores.get(operador1_id)+enteros_valores.get(operador2_id);
      enteros_valores.set(receptor_id,receptor);
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