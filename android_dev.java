import java.lang.*;
import java.util.*;
/*
Write the code to resolve this problem:
You are given a square map of size. Each cell of the
map has a value denoting its depth. We will call a
cell of the map a cavity if and only if this cell
is not on the border of the map and each cell
adjacent to it has strictly smaller depth. Two cells
are adjacent if they have a common side (edge).
You need to find all the cavities on the map and
depict them with the uppercase character X. Input
FormatThe first line contains an integer, denoting
the size of the map. Each of the following lines
contains positive digits without spaces. Each digit
(1-9) denotes the depth of the appropriate area.
Constraints Output FormatOutput lines, denoting the
resulting map. Each cavity should be replaced with
character X.

Sample Input  41112191218921234.
Sample Output 11121X1218X21234.

Explanation: The two cells with the depth of 9
fulfill all the conditions of the Cavity definition
and have been replaced by X
 */
public class android_dev{
    class Point{
	int x,y;
	
	Point(int x, int y) {
	    this.x = x;
	    this.y = y;
	}
    }
    ArrayList<Point> results = new ArrayList<>();
    // each cell has a depth just a number
    // cell is a cavity iff
    //       1..it is not on the border
    //       2..each adjacent cell has smaller depth
    // find all cavities on the map and mark them as X
    public void find_cavity(int[][] m) {
	for (int i=0; i < m.length; i++){
	    for (int j=0; j < m.length; j++){
		if (notOnEdge(i,j,m.length))
		    if(deepest_among_neighbors(i,j,m)) {
			//System.out.println(i+ "adding this to the results "+ j);
			results.add(new Point(i,j));
		    }
	    }
	}
    }
    private boolean notOnEdge(int i, int j,int size) {
	return ((i > 0) && (j > 0) && (i < size-1) && (j < size-1));
    }

    private boolean deepest_among_neighbors(int i, int j, int[][] mx) {
	return (
		(mx[i][j] > mx[i+1][j]) &&
		(mx[i][j] > mx[i-1][j]) &&
		(mx[i][j] > mx[i][j+1]) &&
		(mx[i][j] > mx[i][j-1])
		);	    
    }
    

    public static void main(String[] args) {
	android_dev test = new android_dev();
	int size = args[0].charAt(0) - '0';
	//System.out.println(size);
	int index = 1;
	int[][] map = new int[size][size];
	for (int i=0; i < size; i++){
	    for (int j=0; j < size; j++){
		map[i][j] = args[0].charAt(index++) - '0';
	    }
	}
	test.find_cavity(map);
	for (Point p : test.results) {
	    map[p.x][p.y] = -1;
	}
	StringBuilder sb = new StringBuilder();
	for (int i=0; i < size; i++){
	    for (int j=0; j < size; j++){
		if(map[i][j] == -1)  sb.append("X");
		else sb.append(map[i][j]);
		//System.out.print(map[i][j]);
	    }
	    //System.out.println();
	}
	System.out.println(sb.toString());
    }
}
