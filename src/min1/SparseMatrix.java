package min1;

public class SparseMatrix {
	private int row;
	private int col;
	private int value;
	private int mat[][];

	public void setRow(int row) {
		this.row = row;
	}

	public void setCol(int col) {
		this.col = col;
	}

	public void setValue(int value) {
		this.value = value;
	}

	public SparseMatrix(int row, int col, int value) {
		this.row = row;
		this.col = col;
		this.value = value;
	}
	public SparseMatrix() {
	}

	public void transporse(int[][] b) {
		int m, n, v, i, j, p;
		m = mat[0][0];
		n = mat[0][0];
		v = mat[0][0];
		b[0][0] = n;
		b[0][1] = m;
		b[0][2] = v;
		if (v > 0) { // 0�� �ƴ� ���Ұ� �ִ� ��쿡�� ��ġ ���� ����
			p = 1;
			for (i = 0; i < n; i++) // ������ a�� ������ ��ġ �ݺ� ����
				for (j = 1; j <= v; j++) // 0�� �ƴ� ���� ���� ���ؼ��� �ݺ� ����
					if (mat[j][0] == i) { // ������ ���� ���ϴ� ���Ұ� ������ b[]�� ����
						b[p][0] = mat[j][1];
						b[p][1] = mat[j][0];
						b[p][2] = mat[j][2];
						p++;
					}
		}

	}

}