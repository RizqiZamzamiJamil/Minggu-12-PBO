package rizqi.polimorfisme.tugas;

public class JumpingZombie extends Zombie{
    public JumpingZombie(int health, int level){
        super(health, level);
    }

    @Override
    public void heal() {
        switch (level){
            case 1: health += (health*30/100); break;
            case 2: health += (health*40/100); break;
            case 3: health += (health*50/100); break;
        }
    }

    @Override
    public void destroyed() {
        health -= (health*1/10);
    }

    @Override
    public String getZombieInfo(){
        System.out.println("Jumping Zombie Data");
        return super.getZombieInfo();
    }
}
