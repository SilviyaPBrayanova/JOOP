package uni.sofia.fmi.master.tzi;

import java.util.Arrays;

import uni.sofia.fmi.master.tzi.matrix.IncompatibleDimentionsError;
import uni.sofia.fmi.master.tzi.matrix.Matrix;
import uni.sofia.fmi.master.tzi.polynoms.NegativeSquareRoot;
import uni.sofia.fmi.master.tzi.polynoms.TrinomialCalculator;
import uni.sofia.fmi.master.tzi.polynoms.ZeroCoeficient;

public class MatrixAndTrinomialsTester {

	public static void main(String[] args) {
		TrinomialCalculator tc = new TrinomialCalculator(0.0, 4, 4);
		try{
			tc.findZeros();
		}catch(ZeroCoeficient zc){
			zc.printStackTrace();
		}
		
		tc.setA(2);
		tc.setB(0);
		tc.setC(1);
		try{
			System.out.println(Arrays.toString(tc.findZeros()));
		}catch(NegativeSquareRoot nsr){
			nsr.printStackTrace();
		}
		
		tc.setA(2);
		tc.setB(1);
		tc.setC(-3);
		try{
			System.out.println(Arrays.toString(tc.findZeros()));
		}catch(ZeroCoeficient zc){
			zc.printStackTrace();
		}
		
		tc.setA(1);
		tc.setB(2);
		tc.setC(1);
		try{
			System.out.println(Arrays.toString(tc.findZeros()));
		}catch(ZeroCoeficient zc){
			zc.printStackTrace();
		}

		
		Matrix m1 = new Matrix(3,4);
		m1.setMatrixHolder(new int [][]{{1,2,3,4},
									   {2,3,4,5},
									   {3,4,5,6}});
		Matrix m2 = new Matrix(3, 4);
		m2.setMatrixHolder(new int [][]{{1,1,1,1},
			   							{1,1,1,1},
			   							{1,1,1,1}});	
		System.out.println(m1);
		System.out.println(m2);
		
		try {
			System.out.println(m1.sum(m2));
		} catch (IncompatibleDimentionsError e) {
			e.printStackTrace();
		}
		
		try {
			System.out.println(m1.prod(m2));
		} catch (IncompatibleDimentionsError e) {
			e.printStackTrace();
		}
		
		Matrix m3 = new Matrix(4, 5);
		m3.setMatrixHolder(new int [][]{{1,1,1,1,1},
										{1,1,1,1,1},
										{1,1,1,1,1},
										{1,1,1,1,1}});	
		
		try {
			System.out.println(m1.prod(m3));
		} catch (IncompatibleDimentionsError e) {
			e.printStackTrace();
		}
		
		m3.setMatrixHolder(new int [][]{{1,2,3,4,5},
										{2,3,4,5,6},
										{3,4,5,6,7},
										{4,5,6,7,8}});	

		try {
			System.out.println(m1.prod(m3));
		} catch (IncompatibleDimentionsError e) {
			e.printStackTrace();
		}
	}
}