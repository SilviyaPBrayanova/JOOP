package uni.sofia.fmi.master.tzi.matrix;

import java.util.Arrays;

public class Matrix {

	private int[][] matrixHolder;

	public Matrix(int r, int c) {
		matrixHolder = new int[r][c];
	}

	public void setMatrixHolder(int[][] matrixHolder){
		this.matrixHolder = matrixHolder;
	}
	
	public int rows() {
		return matrixHolder.length;
	}

	public int columns() {
		return matrixHolder[0].length;
	}
	
	public Matrix prod(Matrix m) throws IncompatibleDimentionsError {
		if (this.columns() == m.rows()) {
			Matrix result = new Matrix(this.rows(), m.columns());
			for (int i = 0; i < this.rows(); i++) {
				for (int j = 0; j < m.columns(); j++) {
					result.setValueOnPosition(vectorProduct(this.getRow(i),m.getColumn(j)), i, j);
				}
			}
			return result;
		}
		throw new IncompatibleDimentionsError();
	}

	public Matrix sum(Matrix m) throws IncompatibleDimentionsError {
		if (this.rows() == m.rows() && this.columns() == m.columns()) {
			Matrix result = new Matrix(this.rows(), this.columns());
			for (int i = 0; i < this.rows(); i++) {
				for (int j = 0; j < this.columns(); j++) {
					result.setValueOnPosition(this.getValueOnPosition(i, j) + m.getValueOnPosition(i, j), i, j);
				}
			}
			return result;
		}
		throw new IncompatibleDimentionsError();
	}

	public void setValueOnPosition(int x, int i, int j) {
		matrixHolder[i][j] = x;
	}

	public int getValueOnPosition(int i, int j) {
		return matrixHolder[i][j];
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < this.rows(); i++) {
			for (int j = 0; j < this.columns(); j++) {
				sb.append(matrixHolder[i][j]);
				sb.append(", ");
			}
			sb.deleteCharAt(sb.length() - 2);
			sb.append("\n");
		}
		sb.deleteCharAt(sb.length() - 1);
		return "Matrix [matrixHolder=\n" + sb.toString() + "]";
	}
	
	private int vectorProduct(int[] row, int[] column) throws IncompatibleDimentionsError {
		if(row.length != column.length){
			throw new IncompatibleDimentionsError();
		}
		
		int result = 0;
		for(int i = 0 ; i < row.length ; i++){
			result += row[i]*column[i];
		}
		return result;
	}

	private int[] getColumn(int j) {
		int[] result = new int[matrixHolder.length];
		for(int i = 0 ; i < matrixHolder.length ; i++){
			result[i] = matrixHolder[i][j];
		}
		return result;
	}

	private int[] getRow(int i) {
		return matrixHolder[i];
	}
}
