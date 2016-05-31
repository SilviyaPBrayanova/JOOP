package uni.sofia.fmi.master.tzi.matrix;

public class Matrix {
	
	private int [][] matrixHolder;
	
	 public Matrix(int r, int c) {
		 matrixHolder = new int[r][c];
	 }

	public void prod(Matrix m) throws IncompatibleDimentionsError {
         if(this.columns() == m.rows()){
        	 Matrix result = new Matrix(this.rows(), this.columns());
             for(int i = 0 ; i < 5; i++){
                  for(int j = 0 ; j < 5; j++){
                       result.setValueOnPosition(this.getValueOnPosition(i,j)+
                                 m.getValueOnPosition(i,j)
                                 ,i,j);
                  }   
             }
         }
         throw new IncompatibleDimentionsError();
        
    }

    public int rows() {
         return matrixHolder.length;
    }

    public int columns() {
         return matrixHolder[0].length;
    }

    public void sum(Matrix m) throws IncompatibleDimentionsError {
         if(this.rows() == m.rows() && this.columns() == m.columns()){
        	 Matrix result = new Matrix(this.rows(), this.columns());
             for(int i = 0 ; i < 5; i++){
                  for(int j = 0 ; j < 5; j++){
                       result.setValueOnPosition(this.getValueOnPosition(i,j)+
                                 m.getValueOnPosition(i,j)
                                 ,i,j);
                  }   
             }
         }
         throw new IncompatibleDimentionsError();
    }

    public void setValueOnPosition(int x, int i, int j) {
    	matrixHolder[i][j] = x;
    }

    public int getValueOnPosition(int i, int j) {
        return matrixHolder[i][j];
    }
}
