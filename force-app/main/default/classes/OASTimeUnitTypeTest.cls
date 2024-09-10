@isTest
private class OASTimeUnitTypeTest {
    @isTest
    private static void allowableValues() {
        Set<OASTimeUnitType> expected = new Set<OASTimeUnitType>{
            OASTimeUnitType.HOUR,
            OASTimeUnitType.DAY,
            OASTimeUnitType.WEEK,
            OASTimeUnitType.MONTH,
            OASTimeUnitType.YEAR
        };
        Set<OASTimeUnitType> actual  = new Set<OASTimeUnitType>(OASTimeUnitType.values());
        System.assertEquals(expected, actual);
    }
}
