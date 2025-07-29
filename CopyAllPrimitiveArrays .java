class CopyAllPrimitiveArrays {
    public static void main(String[] args) {
        // Byte Array
        byte[] byteArray = new byte[3];
        for (int i = 0; i < byteArray.length; i++) {
            byteArray[i] = (byte)(i + 1);
        }
        byte[] copyByteArray = new byte[byteArray.length];
        for (int i = 0; i < byteArray.length; i++) {
            copyByteArray[i] = byteArray[i];
        }
        System.out.println("Copied Byte Array:");
        for (int i = 0; i < copyByteArray.length; i++) {
            System.out.println(copyByteArray[i]);
        }

        // Short Array
        short[] shortArray = new short[3];
        for (int i = 0; i < shortArray.length; i++) {
            shortArray[i] = (short)(i + 100);
        }
        short[] copyShortArray = new short[shortArray.length];
        for (int i = 0; i < shortArray.length; i++) {
            copyShortArray[i] = shortArray[i];
        }
        System.out.println("Copied Short Array:");
        for (int i = 0; i < copyShortArray.length; i++) {
            System.out.println(copyShortArray[i]);
        }

        // Int Array
        int[] intArray = new int[3];
        for (int i = 0; i < intArray.length; i++) {
            intArray[i] = i * 10;
        }
        int[] copyIntArray = new int[intArray.length];
        for (int i = 0; i < intArray.length; i++) {
            copyIntArray[i] = intArray[i];
        }
        System.out.println("Copied Int Array:");
        for (int i = 0; i < copyIntArray.length; i++) {
            System.out.println(copyIntArray[i]);
        }

        // Long Array
        long[] longArray = new long[3];
        for (int i = 0; i < longArray.length; i++) {
            longArray[i] = i + 1000L;
        }
        long[] copyLongArray = new long[longArray.length];
        for (int i = 0; i < longArray.length; i++) {
            copyLongArray[i] = longArray[i];
        }
        System.out.println("Copied Long Array:");
        for (int i = 0; i < copyLongArray.length; i++) {
            System.out.println(copyLongArray[i]);
        }

        // Float Array
        float[] floatArray = new float[3];
        for (int i = 0; i < floatArray.length; i++) {
            floatArray[i] = i + 0.5f;
        }
        float[] copyFloatArray = new float[floatArray.length];
        for (int i = 0; i < floatArray.length; i++) {
            copyFloatArray[i] = floatArray[i];
        }
        System.out.println("Copied Float Array:");
        for (int i = 0; i < copyFloatArray.length; i++) {
            System.out.println(copyFloatArray[i]);
        }

        // Double Array
        double[] doubleArray = new double[3];
        for (int i = 0; i < doubleArray.length; i++) {
            doubleArray[i] = i + 0.99;
        }
        double[] copyDoubleArray = new double[doubleArray.length];
        for (int i = 0; i < doubleArray.length; i++) {
            copyDoubleArray[i] = doubleArray[i];
        }
        System.out.println("Copied Double Array:");
        for (int i = 0; i < copyDoubleArray.length; i++) {
            System.out.println(copyDoubleArray[i]);
        }

        // Char Array
        char[] charArray = new char[3];
        for (int i = 0; i < charArray.length; i++) {
            charArray[i] = (char)('A' + i);
        }
        char[] copyCharArray = new char[charArray.length];
        for (int i = 0; i < charArray.length; i++) {
            copyCharArray[i] = charArray[i];
        }
        System.out.println("Copied Char Array:");
        for (int i = 0; i < copyCharArray.length; i++) {
            System.out.println(copyCharArray[i]);
        }

        // Boolean Array
        boolean[] boolArray = new boolean[3];
        boolArray[0] = true;
        boolArray[1] = false;
        boolArray[2] = true;

        boolean[] copyBoolArray = new boolean[boolArray.length];
        for (int i = 0; i < boolArray.length; i++) {
            copyBoolArray[i] = boolArray[i];
        }
        System.out.println("Copied Boolean Array:");
        for (int i = 0; i < copyBoolArray.length; i++) {
            System.out.println(copyBoolArray[i]);
        }
    }
}
