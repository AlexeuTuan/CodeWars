package alekseytyan.codewars;

public class ColouredTriangles {
    public static char triangle(final String row) {
        StringBuilder cRow = new StringBuilder(row);
        StringBuilder nRow = new StringBuilder();


        while (cRow.length() > 1) {
            for (int i = 0; i < cRow.length() - 1; i++) {
                if(cRow.charAt(i) == cRow.charAt(i+1)) {
                    nRow.append(cRow.charAt(i));
                } else {
                    if(cRow.charAt(i) == 'R') {
                        if(cRow.charAt(i+1) == 'G') {
                            nRow.append('B');
                        } else {
                            nRow.append('G');
                        }
                    } else if(cRow.charAt(i) == 'G') {
                        if(cRow.charAt(i+1) == 'R') {
                            nRow.append('B');
                        } else {
                            nRow.append('R');
                        }
                    } else if(cRow.charAt(i) == 'B') {
                        if(cRow.charAt(i+1) == 'R') {
                            nRow.append('G');
                        } else {
                            nRow.append('R');
                        }
                    }
                }
            }
        }
        return '?';
    }
}