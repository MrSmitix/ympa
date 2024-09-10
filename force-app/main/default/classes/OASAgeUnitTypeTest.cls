@isTest
private class OASAgeUnitTypeTest {
    @isTest
    private static void allowableValues() {
        Set<OASAgeUnitType> expected = new Set<OASAgeUnitType>{
            OASAgeUnitType.YEAR,
            OASAgeUnitType.MONTH
        };
        Set<OASAgeUnitType> actual  = new Set<OASAgeUnitType>(OASAgeUnitType.values());
        System.assertEquals(expected, actual);
    }
}
