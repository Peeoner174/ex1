
import java.util.ArrayList;



public class Main2 {


    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        if (calculator.calc("2 + 2") != 4) throw new RuntimeException();
        if (calculator.calc("2 - 2") != 0) throw new RuntimeException();
        if (calculator.calc("2 * 2") != 4) throw new RuntimeException();
        if (calculator.calc("2 / 2") != 1) throw new RuntimeException();
    }
  
}

class Calculator 
{
ArrayList<Integer> iterationNumb= new ArrayList<>();

  
  int calc(String Str)   
    {if(Str.indexOf('+')!=-1)
          {for (String iterationString : Str.split("[\\s+\\+\\-\\*\\/]+", 2)) 
              {iterationNumb.add(Integer.parseInt(iterationString));
              }
          return iterationNumb.get(0)+iterationNumb.get(1);
          }
    else if(Str.indexOf('-')!=-1)
          {for (String iterationString : Str.split("[\\s+\\+\\-\\*\\/]+", 2)) 
              {iterationNumb.add(Integer.parseInt(iterationString));
              }
          return iterationNumb.get(0)-iterationNumb.get(1);
          }
    else if(Str.indexOf('*')!=-1)
          {for (String iterationString : Str.split("[\\s+\\+\\-\\*\\/]+", 2)) 
              {iterationNumb.add(Integer.parseInt(iterationString));
              }
          return iterationNumb.get(0)*iterationNumb.get(1);
          }
    else if(Str.indexOf('/')!=-1)
          {for (String iterationString : Str.split("[\\s+\\+\\-\\*\\/]+", 2)) 
              {iterationNumb.add(Integer.parseInt(iterationString));
              }
          return iterationNumb.get(0)/iterationNumb.get(1);
          }
      
    else throw new IllegalArgumentException("Ошибка конвертирования строки в выражение");
     };
}   
