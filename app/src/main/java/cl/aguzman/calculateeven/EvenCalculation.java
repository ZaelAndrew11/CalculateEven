package cl.aguzman.calculateeven;

public class EvenCalculation {

    private EvenCallback callback;

    public EvenCalculation(EvenCallback callback) {
        this.callback = callback;
    }

    public void evenCalculation(String value){
        int num = Integer.parseInt(value);
        if(num%2 == 0){
            callback.evenResult(value);
        }else{
            callback.blankInput();
        }
    }
}
