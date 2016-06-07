package net.floodlightcontroller.routing;

import java.util.Comparator;

import net.floodlightcontroller.routing.IRoutingService.PathOrderingCriteria;

public class PathManager implements Comparator<Route> {

	private PathOrderingCriteria criteria = PathOrderingCriteria.DEFAULT;

	@Override
	public int compare(Route o1, Route o2) {

		int result = 0;

		switch (criteria) {
		case DEFAULT:
			result = Integer.compare(o1.getPath().size(), o2.getPath().size());
			break;
		case DELAY:
			break;
		case BANDWIDTH_UTILIZATION:
			break;
		default:
			result = Integer.compare(o1.getPath().size(), o2.getPath().size());
			break;
		}

		return result;
	}

}
