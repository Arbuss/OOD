package adapter;

public class AdapterFromStrNumToCalc implements Adapter{

    @Override
    public int adaptation(String strNum){
        return Integer.parseInt(strNum);
    }
}
