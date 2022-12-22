class Solution1 {
    public String intToRoman(int num) {
        StringBuilder romanNumeral = new StringBuilder();

        while (num >= 1000) {
            romanNumeral.append("M");
            num -= 1000;
        }

        if (num >= 900) {
            romanNumeral.append("CM");
            num -= 900;
        }

        else if (num >= 500) {
            romanNumeral.append("D");
            num -= 500;
        }

        else if (num >= 400) {
            romanNumeral.append("CD");
            num -=400;
        }

        while (num >= 100) {
            romanNumeral.append("C");
            num -= 100;
        }

        if (num >= 90) {
            romanNumeral.append("XC");
            num -= 90;
        }
        
        else if (num >= 50) {
            romanNumeral.append("L");
            num -= 50;
        }

        else if (num >= 40) {
            romanNumeral.append("XL");
            num -=40;
        }

        while (num >= 10) {
            romanNumeral.append("X");
            num -= 10;
        }

        if (num >= 9) {
            romanNumeral.append("IX");
            num -= 9;
        }
        
        else if (num >= 5) {
            romanNumeral.append("V");
            num -= 5;
        }

        else if (num >= 4) {
            romanNumeral.append("IV");
            num -=4;
        }
        
        while (num >= 1) {
            romanNumeral.append("I");
            num -= 1;
        }

        return romanNumeral.toString();
    }
}