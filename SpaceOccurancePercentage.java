public class SpaceOccurancePercentage {
    public static void main(String[] args) {
        String text = "waasdasada sadsaddasd asdasdafas askamdaknsdanas asaidiasdija asijdiajdisja d" + "3330";
        int spaceCount = 0;
        int textTotalLength = text.length();
        for (int i = 0; i < textTotalLength; i++) {
            if (text.charAt(i) == ' ') {
                System.out.println("Space found at position " + i);
                spaceCount++;
            }
        }
        System.out.println("Space count is " + spaceCount);

        double spacePercentage = (double) spaceCount / textTotalLength * 100;
        System.out.format("Space percentage is %.2f ", spacePercentage);
    }
}
