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
		if (v > 0) { // 0이 아닌 원소가 있는 경우에만 전치 연산 수행
			p = 1;
			for (i = 0; i < n; i++) // 희소행렬 a의 열별로 전치 반복 수행
				for (j = 1; j <= v; j++) // 0이 아닌 원소 수에 대해서만 반복 수행
					if (mat[j][0] == i) { // 현재의 열에 속하는 원소가 있으면 b[]에 삽입
						b[p][0] = mat[j][1];
						b[p][1] = mat[j][0];
						b[p][2] = mat[j][2];
						p++;
					}
		}

	}

}