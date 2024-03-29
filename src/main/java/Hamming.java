class Hamming {
	private final int distance;

	Hamming(String leftStrand, String rightStrand) {
		checkStrandLength(leftStrand, rightStrand);
		int res = 0;
		for (int i = 0; i < leftStrand.length(); i++) {
			if (leftStrand.charAt(i) != rightStrand.charAt(i)) {
				res++;
			}
		}
		distance = res;
	}

	int getHammingDistance() {
		return distance;
	}

	void checkStrandLength(String leftStrand, String rightStrand) throws IllegalArgumentException {
		if (leftStrand.length() != rightStrand.length()) {
			throw new IllegalArgumentException("leftStrand and rightStrand must be of equal length.");
		}
	}
}
