public class Successors {
    public static Position findPosition(int target, int[][] array2d) {
        for (int i = 0; i < array2d.length; i++) {
            for (int j = 0; j < array2d[i].length; j++) {
                if (array2d[i][j] == target) {
                    return new Position(i, j);
                }
            }
        }
        return null;
    }

    public static Position[][] getSuccessorArray(int[][] array2d) {
        Position[][] arr = new Position[array2d.length][];
        for (int i = 0; i < array2d.length; i++) {
            arr[i] = new Position[array2d[i].length];
            for (int j = 0; j < array2d[i].length; j++) {
                arr[i][j] = findPosition(array2d[i][j] + 1, array2d);
            }
        }
        return arr;
    }
}