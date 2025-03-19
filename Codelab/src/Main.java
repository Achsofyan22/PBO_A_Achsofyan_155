// Superclass GameCharacter
class GameCharacter {
    private String name; // Nama karakter
    private int health; // Jumlah kesehatan karakter

    // Constructor untuk inisialisasi nama dan kesehatan
    public GameCharacter(String name, int health) {
        this.name = name;
        this.health = health;
    }

    // Getter untuk mendapatkan nama karakter
    public String getName() {
        return name;
    }

    // Getter untuk mendapatkan kesehatan karakter
    public int getHealth() {
        return health;
    }

    // Setter untuk mengubah nilai kesehatan karakter
    public void setHealth(int health) {
        this.health = health;
    }

    // Method attack yang akan dioverride oleh subclass
    public void attack(GameCharacter target) {
        System.out.println(name + " attacks " + target.getName() + "!");
    }
}

// Subclass Hero yang mewarisi GameCharacter
class Hero extends GameCharacter {
    // Constructor Hero yang menggunakan super() untuk memanggil constructor parent
    public Hero(String name, int health) {
        super(name, health);
    }

    // Override method attack untuk Hero
    @Override
    public void attack(GameCharacter target) {
        System.out.println(getName() + " attacks " + target.getName() + " using a sword!");
        target.setHealth(target.getHealth() - 20); // Mengurangi 20 health dari target
        System.out.println(target.getName() + "'s health: " + target.getHealth());
    }
}

// Subclass Enemy yang mewarisi GameCharacter
class Enemy extends GameCharacter {
    // Constructor Enemy yang menggunakan super() untuk memanggil constructor parent
    public Enemy(String name, int health) {
        super(name, health);
    }

    // Override method attack untuk Enemy
    @Override
    public void attack(GameCharacter target) {
        System.out.println(getName() + " attacks " + target.getName() + " using magic!");
        target.setHealth(target.getHealth() - 15); // Mengurangi 15 health dari target
        System.out.println(target.getName() + "'s health: " + target.getHealth());
    }
}

// Main class untuk menjalankan program
public class Main {
    public static void main(String[] args) {
        // Membuat objek karakter
        GameCharacter generalCharacter = new GameCharacter("General Character", 100);
        Hero hero = new Hero("Brimstone", 150);
        Enemy enemy = new Enemy("Viper", 200);

        // Menampilkan kesehatan awal dari Hero dan Enemy
        System.out.println("Initial Health:");
        System.out.println(hero.getName() + "'s health: " + hero.getHealth());
        System.out.println(enemy.getName() + "'s health: " + enemy.getHealth());

        // Simulasi pertarungan
        hero.attack(enemy); // Hero menyerang Enemy
        enemy.attack(hero); // Enemy menyerang Hero
    }
}