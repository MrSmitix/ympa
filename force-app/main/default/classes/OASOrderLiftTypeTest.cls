@isTest
private class OASOrderLiftTypeTest {
    @isTest
    private static void allowableValues() {
        Set<OASOrderLiftType> expected = new Set<OASOrderLiftType>{
            OASOrderLiftType.NOT_NEEDED,
            OASOrderLiftType.MANUAL,
            OASOrderLiftType.ELEVATOR,
            OASOrderLiftType.CARGO_ELEVATOR,
            OASOrderLiftType.FREE,
            OASOrderLiftType.UNKNOWN
        };
        Set<OASOrderLiftType> actual  = new Set<OASOrderLiftType>(OASOrderLiftType.values());
        System.assertEquals(expected, actual);
    }
}
