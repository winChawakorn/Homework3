import java.util.List;

/**
 * A class containing unique method.
 * 
 * @author Chawakorn Suphepre
 * @version 2017.04.07
 *
 */
public class Recursion {
	/**
	 * Remove duplicate consecutive items from a list, changing the list
	 * parameter. For example, if list = { a, b, b, b, c, b, c, c} then after
	 * calling unique the list will contain {a, b, c, b, c}. Only consecutive
	 * duplicates are removed. Objects are compared using their own equals
	 * method.
	 * 
	 * @param list
	 *            of any kind of object. The elements are not null.
	 * @return reference to the list parameter with consecutive duplicates
	 *         removed.
	 */
	public static List unique(List list) {
		if (list.size() <= 1)
			return list;
		if (list.get(0).equals(list.get(1))) {
			list.remove(1);
			unique(list);
		} else {
			unique(list.subList(1, list.size()));
		}
		return list;
	}
}
