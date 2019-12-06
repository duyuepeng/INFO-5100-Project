package m3.model.filter;

import m3.mock.Vehicle;
import m3.model.checker.Checker;

public abstract class ValueFilter<T> extends Filter<T> {
    private T value;


    public ValueFilter(String string, Checker<T> checker) {
        super(checker);
        this.setValue(string);
    }
    
    protected abstract void setValue(String string);

    @Override
    public boolean isApplicable(Vehicle vehicle) {
        return this.checker.check(this.getVehicleValue(vehicle), this.value);
    }
}
