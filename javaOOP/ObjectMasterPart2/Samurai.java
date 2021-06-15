class Samurai extends Human{
    private static int count =0;
    private static int health =200;
    
    public Samurai() {
        this.health = Samurai.health;
        Samurai.count+=1;
    }
    public void int deathBlow(Human human) {
        human.health-=human.health;
        this.health-=(this.health/2);
        Samurai.count+=1;
    }
    public void int meditate(){
        this.health+=Samurai.health;
        Samurai.count+=1;
    }
    public static int howMany(){
        return Samurai.count;
        System.out.println(count);
    }
} 