package irrgarten;

public class TestP1 {
  
    public static void main(String[] args) {
        
        // Probando Enumerados
        
        System.out.println("\n=== Probando Enumerados ===\n");
        
        Directions direction = Directions.LEFT;
        Orientation orientation = Orientation.VERTICAL;
        GameCharacter character = GameCharacter.PLAYER;
        
        System.out.println("    Direction: " + direction);
        System.out.println("    Orientation: " + orientation);
        System.out.println("    GameCharacter: " + character);
        
        // Probando la clase Weapon
        
        System.out.println("\n=== Probando la clase Weapon ===\n");
        Weapon weapon1 = new Weapon(2.0f, 3); // Creamos el arma 1
        Weapon weapon2 = new Weapon(3.0f, 3); // Creamos el arma 2
        
        System.out.println("    Estado de weapon1: " + weapon1); // Estado del arma 1
        System.out.println("    Estado de weapon2: " + weapon2); // Estado del arma 2
        
        System.out.println("    Primer ataque  con weapon1: " + weapon1.attack()); // Primer ataque con weapon1
        System.out.println("    Segundo ataque con weapon1: " + weapon1.attack()); // Segundo ataque con weapon1
        System.out.println("    Tercer ataque  con weapon1: " + weapon1.attack()); // Tercer ataque con weapon1
        System.out.println("    Estado de weapon1 sin usos: " + weapon1);          // Estado de weapon1 tras agogtar usos
        System.out.println("    weapon1 queda descartada?: " + weapon1.discard()); // Queda descartada weapon1?
        
        // Probando la clase Shield
        
        System.out.println("\n=== Probando la clase Shield ===\n");
        Shield shield1 = new Shield(2.0f, 3); // Creamos el escudo 1
        Shield shield2 = new Shield(3.0f, 3); // Creamos el escudo 2
        
        System.out.println("    Estado de shield1: " + shield1); // Estado del escudo 1
        System.out.println("    Estado de shield2: " + shield2); // Estado del escudo 2
        
        System.out.println("    Primera defensa con shield1: " + shield1.protect()); // Primera defensa con shield1
        System.out.println("    Segunda defensa con shield1: " + shield1.protect()); // Segunda defensa con shield1
        System.out.println("    Tercera defensa con shield1: " + shield1.protect()); // Tercera defensa con shield1
        System.out.println("    Estado de shield1 sin defensas: " + shield1);       // Estado de shield1 tras agogtar usos
        System.out.println("    shield1 queda descartada?: " + shield1.discard());  // Queda descartada shield1?
        
        
        // Probando la Clase Dice
        
        System.out.println("\n=== Probando la Clase Dice ===\n");
        
        System.out.println("=== Probamos 100 veces cada método ===\n");
        
        System.out.println("Probando randomPos: posicion aleatoria entre o y 9");
        
        boolean correcto = true;
        
        for (int i = 0; i < 100; i++){
            int resultado = Dice.randomPos(10);
            
            if(resultado < 0 || resultado >= 10){
                correcto = false;
            }
        }
        
        System.out.println("randomPos() correcto?: " + correcto);
    }
}