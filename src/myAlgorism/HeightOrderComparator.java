package myAlgorism;

import java.util.Comparator;

public class HeightOrderComparator implements Comparator<PhysicalData>{
public int compare(PhysicalData d1, PhysicalData d2) {
	return (d1.height > d2.height) ? 1 :
		(d1.height < d2.height) ? -1 : 0;
}
}
