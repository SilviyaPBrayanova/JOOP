package uni.sofia.fmi.master.tzi.computers;

public interface Computable {
	public void startup();
	public void shutdown();
	public void compute(String operation, int[] opInput);
}
