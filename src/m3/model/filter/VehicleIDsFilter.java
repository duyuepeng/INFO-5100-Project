package m3.model.filter;

import m3.mock.Vehicle;
import m3.model.checker.Checker;

import java.util.List;

public class VehicleIDsFilter extends ListFilter<Integer> {
	public VehicleIDsFilter(Checker<Integer> checker) {
		super(checker);
	}

    public VehicleIDsFilter(List<Integer> list, Checker<Integer> checker) {
        super(list, checker);
    }

    @Override
    public Integer getVehicleValue(Vehicle vehicle) {
        return vehicle.getId();
    }

    public String toString() {
    
    	String s = super.getList().toString().substring(1, super.getList().toString().length() - 1);
    	System.out.println(super.getList().toString());
    	return s;
    }
    
	@Override
	public Integer getValueFromString(String string) throws InputException {
		char[] ch = string.toCharArray();
		for (int j = 0; j < ch.length; j++) {
			if (Character.isLetter(ch[j])) {
				throw new InputException("VehicleIDs cannot contain any letter.");
			}
		}
		return Integer.valueOf(string);
	}
}
