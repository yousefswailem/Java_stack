class Ninja extends Human{

    protected int stealth=10;

    public void steal(Human human){
        human.health-=this.stealth;
        this.stealth+=this.health;
    }
    public void runAway(){
        this.health-=10;
    }

}