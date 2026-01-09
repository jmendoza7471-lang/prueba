import java.util.*;
import java.io.*;

/**
 * Clase de ejemplo con varios issues para probar Codacy
 * Esta clase contiene problemas de estilo, seguridad y buenas prácticas
 */
public class CodacyTestExample {
    
    // Problema: Constante pública mutable
    public static List<String> USERS = new ArrayList<>();
    
    // Problema: Campo no utilizado
    private int unusedField = 10;
    
    // Problema: Nombre de variable poco descriptivo
    private String a;
    
    /**
     * Método con múltiples problemas para detectar
     */
    public void processData(String input) {
        // Problema: Uso de System.out en lugar de logger
        System.out.println("Procesando: " + input);
        
        // Problema: Captura genérica de excepción
        try {
            int number = Integer.parseInt(input);
            calculate(number);
        } catch (Exception e) {
            e.printStackTrace();
        }
        
        // Problema: Comparación de strings con ==
        if (input == "TEST") {
            System.out.println("Es test");
        }
        
        // Problema: Recursión infinita potencial
        recursiveMethod(5);
        
        // Problema: Uso de tipo raw
        List list = new ArrayList();
        list.add("item");
        
        // Problema: Operación redundante
        boolean flag = true;
        if (flag == true) {
            System.out.println("Flag es verdadero");
        }
        
        // Problema: Declaración de variable innecesaria
        int result = 0;
        result = 5 * 3;
        System.out.println(result);
    }
    
    /**
     * Método con problema de complejidad ciclomática alta
     */
    public void highCyclomaticComplexity(int value) {
        if (value > 0) {
            if (value < 10) {
                if (value % 2 == 0) {
                    System.out.println("Par positivo menor a 10");
                } else {
                    System.out.println("Impar positivo menor a 10");
                }
            } else if (value < 20) {
                if (value % 3 == 0) {
                    System.out.println("Divisible por 3 entre 10-20");
                }
            }
        } else if (value < 0) {
            if (value > -10) {
                System.out.println("Negativo mayor a -10");
            }
        } else {
            System.out.println("Cero");
        }
        
        switch(value) {
            case 1: System.out.println("Uno"); break;
            case 2: System.out.println("Dos"); break;
            case 3: System.out.println("Tres"); break;
            default: System.out.println("Otro");
        }
    }
    
    // Problema: Recursión sin condición de parada clara
    private void recursiveMethod(int count) {
        if (count > 0) {
            System.out.println(count);
            recursiveMethod(count - 1);
        }
        // Falta caso base explícito para count <= 0
    }
    
    // Problema: Método largo
    private void calculate(int value) {
        // Simulación de método demasiado largo
        int step1 = value + 1;
        int step2 = step1 * 2;
        int step3 = step2 - 5;
        int step4 = step3 / 2;
        int step5 = step4 % 3;
        int step6 = step5 * 10;
        int step7 = step6 + 100;
        int step8 = step7 - 50;
        int step9 = step8 * 2;
        int step10 = step9 / 5;
        System.out.println("Resultado: " + step10);
        
        // Más operaciones...
        for (int i = 0; i < 10; i++) {
            System.out.println("Iteración: " + i);
        }
        
        // Código duplicado (otro issue que detectará Codacy)
        for (int i = 0; i < 10; i++) {
            System.out.println("Iteración: " + i);
        }
    }
    
    // Problema: Método que lanza excepción genérica
    public void riskyMethod() throws Exception {
        // Lanza excepción genérica
        throw new Exception("Error genérico");
    }
    
    // Problema: Posible recurso no cerrado
    public void readFile(String filename) {
        try {
            BufferedReader br = new BufferedReader(new FileReader(filename));
            String line;
            while ((line = br.readLine()) != null) {
                System.out.println(line);
            }
            // Problema: Falta cerrar el recurso br
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    
    /**
     * Método main para ejecutar la clase
     */
    public static void main(String[] args) {
        CodacyTestExample example = new CodacyTestExample();
        
        // Problema: Uso de argumentos sin validar
        if (args.length > 0) {
            example.processData(args[0]);
        }
        
        // Problema: Magic number
        int timeout = 30000; // 30 segundos
        
        // Problema: código muerto (nunca se ejecuta)
        if (false) {
            System.out.println("Este código nunca se ejecuta");
        }
    }
}

// Problema: Clase con demasiados métodos (debería estar en archivo separado)
class UtilityClass {
    public void method1() {}
    public void method2() {}
    public void method3() {}
    public void method4() {}
    public void method5() {}
    public void method6() {}
    public void method7() {}
    public void method8() {}
    public void method9() {}
    public void method10() {}
    public void method11() {}
    public void method12() {}
    public void method13() {}
    public void method14() {}
    public void method15() {}
}