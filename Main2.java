//Был дописан класс Calculator, который выполняет преобразование простого математического выражения из строкового типа в числовое
//и вычисляет результат. Использование обобщённого списка делает возможным лёгкую модернизации метода calc, для работы с  
//выражениями любой длины, а также, для работы с выражениями, содержащими несколько типов данных(например сделав его тип подклассом
//класса Number). Кроме того в данной ситуации пользоваться им просто удобнее.
//В методе calc сначала происходит поиск арифметического знака(+. -. * или /) в переданной строке, потом метод split разделяет эту 
//строку на две, в каждой из которых содержится только число в строковом виде. Метод parseInt преобразует эти строки в тип Integer и 
//они заносятся в список. return возвращает результат соответствующей арифметической операции над этими числами. Если переданная строка 
//не соответствует условию, метод calc выкидывает исключение -"Ошибка конвертирования строки в выражение"
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
