
public class Pair1<T, U> {

	private T left;
	private U right;

	public Pair1(T left, U right) {
		super();
		this.left = left;
		this.right = right;
	}

	public T getLeft() {
		return left;
	}

	public void setLeft(T left) {
		this.left = left;
	}

	public U getRight() {
		return right;
	}

	public void setRight(U right) {
		this.right = right;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((left == null) ? 0 : left.hashCode());
		result = prime * result + ((right == null) ? 0 : right.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}
		if (obj == null) {
			return false;
		}
		if (getClass() != obj.getClass()) {
			return false;
		}
		Pair1<T, U> other = (Pair1<T, U>) obj;
		if (left == null) {
			if (other.left != null) {
				return false;
			}
		} else if (!left.equals(other.left)) {
			return false;
		}
		if (right == null) {
			if (other.right != null) {
				return false;
			}
		} else if (!right.equals(other.right)) {
			return false;
		}
		return true;
	}

	@Override
	public String toString() {
		return "Pair: [left=" + left + ", right=" + right + "]";
	}

	public static void main(String[] args) {

		String t = "e";
		Integer u = 1;
		Pair1<String, Integer> p = new Pair1<String, Integer>(t, u);

		t = p.getLeft();
		u = p.getRight();

		System.out.println(p);

	}

}
