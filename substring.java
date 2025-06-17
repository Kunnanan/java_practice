

class substring
{

    public static void main(String[] args) {
        String mainString = "abracadabra";
        String subString = "abra";

        int count = countOccurrencesManually(mainString, subString);

        System.out.println("The main string is: '" + mainString + "'");
        System.out.println("The substring is: '" + subString + "'");
        System.out.println("The substring '" + subString + "' appears " + count + " times.");
    }

    public static int countOccurrencesManually(String mainString, String subString) {
        if (mainString == null || subString == null || mainString.isEmpty() || subString.isEmpty()) {
            return 0;
        }

        if (subString.length() > mainString.length()) {
            return 0;
        }

        int count = 0;
        for (int i = 0; i <= mainString.length() - subString.length(); i++) {
            String chunk = mainString.substring(i, i + subString.length());
            if (chunk.equals(subString)) {
                count++;
            }
        }
        return count;
    }
}