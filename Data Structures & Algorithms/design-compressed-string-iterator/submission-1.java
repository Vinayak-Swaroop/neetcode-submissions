class StringIterator {
    private char current;
    private int remaining = 0;
    private String string;
    private int index = -1;
    public StringIterator(String compressedString) {
        this.string = compressedString;
        this.current = string.charAt(0);
        index = 1;
        String numberString = "";
        while (index < string.length()) {
            if (Character.isDigit(string.charAt(index))) {
                numberString += string.charAt(index);
                index++;
            } else
                break;
        }
        remaining = Integer.parseInt(numberString);
    }

    public char next() {
        if(index>=string.length())
            return ' ';
        if (remaining > 0) {
            remaining--;
            return current;
        }
        String numberString = "";
        current = string.charAt(index++);
        while (index < string.length()) {
            if (Character.isDigit(string.charAt(index))) {
                numberString += string.charAt(index);
                index++;
            } else
                break;
        }
        remaining = Integer.parseInt(numberString);
        remaining--;
        return current;
    }

    public boolean hasNext() {
        if (index >= string.length())
            return false;
        return true;
    }
}

/**
 * Your StringIterator object will be instantiated and called as such:
 * StringIterator obj = new StringIterator(compressedString);
 * char param_1 = obj.next();
 * boolean param_2 = obj.hasNext();
 */
