public class StrongBox<T> {

	// ジェネリクスで指定された型のインスタンスを格納するフィールド
	private T item;

	// 引数で受け取ったインスタンスを金庫に保存する
	public void put(T item) {
		this.item = item;
	}

	// 金庫に保存されているインスタンスを取得する
	public T get() {
		return this.item;
	}
}