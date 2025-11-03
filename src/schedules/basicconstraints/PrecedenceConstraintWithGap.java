package schedules.basicconstraints;
import schedules.activities.Activity;

public class PrecedenceConstraintWithGap extends PrecedenceConstraint{
    public Activity firstAct; 
    public Activity secondAct;
    int minDelay;
    int maxDelay;

    public PrecedenceConstraintWithGap(Activity firstAct, Activity secondAct, int minDelay, int maxDelay){
        super(firstAct, secondAct);
        this.minDelay = minDelay;
        this.maxDelay = maxDelay;
    }

    @Override 
    public boolean isSatisfied(int timeAct1, int timeAct2){
       if((getFirst().getDuration() + timeAct1 + minDelay >= timeAct2) && (getFirst().getDuration() + timeAct1 + minDelay <= timeAct2)){
        return true;
       }

       else{
        return false;
       }

    }
}