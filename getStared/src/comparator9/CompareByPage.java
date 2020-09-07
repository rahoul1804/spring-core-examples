package comparator9;

import java.util.Comparator;

class CompareByPage implements Comparator
{

	@Override
	public int compare(Object x, Object y) 
	{
	 
		return ((Book)x).page- ((Book)y).page;
	}
}
