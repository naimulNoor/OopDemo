public class Player1 {
    private String name; //private string veriable declear called as "name"
    private String weapon;
    private int health;

    public Player1(String name, String weapon, int health) {
        this.name = name;
        this.health = health;
        if (health < 0 || health > 100) {
            this.health = 100;
        } else this.health = health;
    }

    public void damageByGun1() {
        this.health -= 30;
        if (this.health <= 0) {
            this.health = 0;
        }
        System.out.println("Got hit by gun 1. Health is reduce by 30" + ". New health is " + this.health);
        if (this.health == 0) {
            System.out.println(getName() + " Is dead");
        }

    }


    public void damageByGun2() {
        this.health -= 50;
        if (this.health <= 0) {
            this.health = 0;
        }
        System.out.println("Got hit by gun 1. Health is reduce by 50" + ". New health is " + this.health);
        if (this.health == 0) {
            System.out.println(getName() + " Is dead");
        }
    }

    public void heal() {
        if (this.health <= 0) System.out.println("Player is dead. Heal not possible");
        else {
            this.health = 100;
            System.out.println("Health is " + this.health);
        }
    }


    public String getName() {
        return name;
    }

    public String getWeapon() {
        return weapon;
    }

    public int getHealth() {
        return health;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setWeapon(String weapon) {
        this.weapon = weapon;
    }

    public void setHealth(int health) {
        this.health = health;
    }


}
