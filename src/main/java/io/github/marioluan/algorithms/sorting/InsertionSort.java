package io.github.marioluan.algorithms.sorting;

/**
 * In-place, stable implementation of insertion sort algorithm. <br>
 * 
 * <strong>Time complexity:</strong> O(N^2) <br>
 * <strong>Space complexity:</strong> O(1) <br>
 * References:
 * <ul>
 * <li><a>https://www.coursera.org/learn/algorithms-part1</a>.</li>
 * <li><a>https://en.wikipedia.org/wiki/File:Insertion-sort-example-300px.gif</a></li>
 * </ul>
 * 
 * @author marioluan
 *
 */
public class InsertionSort {

	/**
	 * Sort the elements from array a between lo and hi indices.
	 * 
	 * @param a
	 * @param lo
	 * @param hi
	 */
	@SuppressWarnings("rawtypes")
	public static void sort(Comparable[] a, int lo, int hi) {
		for (int i = lo; i < hi + 1; i++)
			for (int j = i; j > lo && less(a[j], a[j - 1]); j--)
				swap(a, j, j - 1);
	}

	/**
	 * Check whether {@link Comparable a} is lesser than {@link Comparable b}.
	 * 
	 * @param a
	 * @param b
	 * @return returns whether a is lesser than b
	 */
	@SuppressWarnings({ "rawtypes", "unchecked" })
	private static boolean less(Comparable a, Comparable b) {
		return a.compareTo(b) < 0;
	}

	/**
	 * Swap item in position i by item in position j from array {@link a}.
	 * 
	 * @param a
	 * @param i
	 * @param j
	 */
	@SuppressWarnings("rawtypes")
	private static void swap(Comparable[] a, int i, int j) {
		Comparable copy = a[i];
		a[i] = a[j];
		a[j] = copy;
	}
}