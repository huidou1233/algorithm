public class IsNumeric {
    boolean isNumeric(char[] str){
        if(str == null || str.length == 0) {
            return false;
        }
        int[] index = new int[1];
        index[0] = 0; //记录当前字符位置
        boolean isNumeric = isInteger(str, index);
        if (index[0] < str.length && str[index[0]] == '.') {
            index[0]++;
            isNumeric = isUnsignedInteger(str, index) || isNumeric;
        }
        if (index[0] < str.length && str[index[0]] == 'e' || str[index[0]] == 'E') {
            index[0]++;
            isNumeric = isInteger(str, index) && isNumeric;
        }

        if (isNumeric && index[0] == str.length) {
            return true;
        }
        return false;
    }

    private boolean isInteger(char[] str, int[] index) {
        if(index[0] < str.length && (str[index[0]] == '+' || str[index[0]] == '-'))
            index[0]++;
        return isUnsignedInteger(str, index);
    }

    private boolean isUnsignedInteger(char[] str, int[] index) {
        int start = index[0];
        while (index[0] < str.length && (str[index[0]] - '0' <= 9 && str[index[0]] - '0' >= 0)) {
            index[0]++;
        }
        if (index[0] > start)
            return true;
        return false;
    }
}
