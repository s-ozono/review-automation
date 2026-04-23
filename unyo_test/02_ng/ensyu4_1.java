public class StrongBox<T> {

	// 仮型引数Tを使わずObjectで保持してしまう
	private Object item;

	// 仮型引数Tを受け取るが、そのままObjectに代入
	public void put(T item) {
		this.item = item;
	}

	// 戻り値をTにしているがキャストが必要になってしまう
	public T get() {
		return (T) this.item;
	}
}