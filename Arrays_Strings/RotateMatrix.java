public class RotateMatrix{
    public static void rotate(int[][] m) {
	/*
	  let's think about how we are going to do it
	  1. we'll rotate matrix layer by layer counter clock wise
	  for instance

	  1  2  3  4
	  5  6  7  8
	  9  10 11 12
	  13 14 15 16
	  |
	  V
	  4 8 12 16
	  3 7 11 15
	  2 6 10 14
	  1 5  9 13
	*/
	int size  = m.length;
	int steps = size - 1;
	//if size is odd the center tile doesn't move
	int layer_number = size / 2; 
	for(int i = 0; i<layer_number; i++) {
	    RotateMatrix.rotate_layer_ccw(m, i, steps);
	    steps -= 2;
	}
    }
    //helper function to rotate counter_clock_wise 
    private static void rotate_layer_ccw(int[][] matrix, int layer, int steps) {
	int current_i = layer, current_j = layer;
	//	System.out.printf("matrix length %d\n",matrix.length);
	int total_steps = steps * ((matrix.length - 2*layer)*2+
				   (((matrix.length - 2*layer)-2)*2));
	System.out.printf("layer %d  steps %d total_steps %d\n",
			  layer, steps,total_steps);
	while(total_steps-- != 0) {
	    int dir = get_direction(matrix,layer, current_i, current_j);
	    int temp = 0;
	    //do the move
	    switch(dir){
	    case 1: //DOWN
		temp = matrix[current_i][current_j];
		matrix[current_i][current_j]=matrix[current_i+1][current_j];
		matrix[current_i++][current_j] = temp;
		break;
	    case 2: //RIGHT
		temp = matrix[current_i][current_j];
		matrix[current_i][current_j]=matrix[current_i][current_j+1];
		matrix[current_i][current_j++] = temp;
		break;
	    case 3: //UP
		temp = matrix[current_i][current_j];
		matrix[current_i][current_j]=matrix[current_i-1][current_j];
		matrix[current_i--][current_j] = temp;
		break;
	    case 4: //LEFT
		temp = matrix[current_i][current_j];
		matrix[current_i][current_j]=matrix[current_i][current_j-1];
		matrix[current_i][current_j--] = temp;
		break;
	    default:System.out.printf("failure to get right direction %d\n",dir);
	    }
	}
    }

    //helper function to  get a direction of movement
    //starting index is needed to indicate the layer that we are at
    private static int get_direction(int[][] matrix, int layer, int x, int y) {
	int cur_m_size = matrix.length - 2*layer;
	int res = -1;
System.out.printf("cur layer %d, x %d y %d cur_m_size %d\t",layer,x,y,cur_m_size);
	//DOWN return 1
	if (y == layer && x < cur_m_size-1) res = 1;
	//RIGHT return 2
	if (x == cur_m_size-1 && y < cur_m_size-1) res = 2;
	//UP return 3
	if (x > 0 && y == cur_m_size-1) res = 3;
	//LEFT return 4
	if (x == 0 && y>0) res = 4;
	System.out.printf("res %d\n",res);	
	
	return res;
    }
    public static void main(String[] args) {
	int[][] m = {{1,2,3,4},{5,6,7,8}, {9,10,11,12}, {13,14,15,16}};
	for(int i = 0; i < m.length; i++) {
	    for(int j = 0; j < m.length; j++){
		System.out.print(m[i][j]);
	    }
	    System.out.println();
	}
	RotateMatrix.rotate(m);
	for(int i = 0; i < m.length; i++) {
	    for(int j = 0; j < m.length; j++){
		System.out.print(m[i][j]+"  ");
	    }
	    System.out.println();
	}
    }
}
