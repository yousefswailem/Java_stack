class Wizard extends Human{
    
    protected int health = 50;
    protected int intelligence = 8;
    
    public void heal(Human human) {
        human.health+= this.intelligence;

        System.out.println("You health become:" + human.health + " after heal");
    }
    
    public void fireball(Human human){
        human.health-=(this.intelligence * 3 );
    }

}