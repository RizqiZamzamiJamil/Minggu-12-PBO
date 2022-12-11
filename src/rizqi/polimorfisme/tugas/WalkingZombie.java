package rizqi.polimorfisme.tugas;

public class WalkingZombie extends Zombie{
    public WalkingZombie(int health, int level){
        super(health, level);
    }

    public void heal(){
        switch (level){
            case 1: health += (health*20/100); break;
            case 2: health += (health*30/100); break;
            case 3: health += (health*40/100); break;
        }
    }

    public void destroyed(){
        health -= (health*2/10);
    }

    @Override
    public String getZombieInfo(){
        System.out.println("Walking Zombie Data");
        return super.getZombieInfo();
    }
}
