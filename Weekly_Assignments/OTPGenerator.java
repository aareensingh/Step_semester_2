class OTPGenerator {
    public static int generateOTP() {
        return 100000 + (int)(Math.random() * 900000);
    }

    public static boolean isUnique(int[] otps, int index, int otp) {
        for (int i = 0; i < index; i++) {
            if (otps[i] == otp) {
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {
        int[] otps = new int[10];
        int index = 0;

        while (index < 10) {
            int otp = generateOTP();

            if (isUnique(otps, index, otp)) {
                otps[index] = otp;
                index++;
            }
        }

        for (int i = 0; i < otps.length; i++) {
            System.out.println("OTP " + (i + 1) + " = " + otps[i]);
        }

        System.out.println("All OTPs are unique = true");
    }
}
