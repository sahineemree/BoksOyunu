public class Match {
    Fighter f1;
    Fighter f2;
    int minWeight;
    int maxWeight;

    Match(Fighter f1, Fighter f2, int minWeight, int maxWeight){

        this.f1=f1;
        this.f2=f2;
        this.minWeight=minWeight;
        this.maxWeight=maxWeight;

    }
    boolean isCheck(){

        return ((this.f1.weight >= minWeight && this.f1.weight <= maxWeight) && (this.f2.weight >= minWeight && this.f2.weight <= maxWeight));

    }
    void run (){
        if(isCheck()) {

                while (this.f1.health > 0 && this.f2.health > 0) {

                    System.out.println("===== YENİ ROUND =====");

                    this.f2.health = this.f1.hit(this.f2);
                    if (isWin()) {
                        break;
                    }
                    this.f1.health = this.f2.hit(this.f1);
                    if (isWin()) {
                        break;
                    }
                    System.out.println(this.f1.name + " oyuncusunun sağlığı : " + this.f1.health);
                    System.out.println(this.f2.name + " oyuncusunun sağlığı : " + this.f2.health);

                }
        }
        else {
            System.out.println("Sporcuların sikletleri uyuşmuyor !");
        }
    }
    boolean isWin (){
        if (this.f1.health==0){
            System.out.println(this.f2.name + " adlı oyuncu kazandı !!");
            return true ;
        }

        else if (this.f2.health==0) {
            System.out.println(this.f1.name + " adlı oyuncu kazandı !!");
            return true;
        }
        return false;
    }
}
