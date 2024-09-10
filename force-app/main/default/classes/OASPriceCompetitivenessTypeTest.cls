@isTest
private class OASPriceCompetitivenessTypeTest {
    @isTest
    private static void allowableValues() {
        Set<OASPriceCompetitivenessType> expected = new Set<OASPriceCompetitivenessType>{
            OASPriceCompetitivenessType.OPTIMAL,
            OASPriceCompetitivenessType.AVERAGE,
            OASPriceCompetitivenessType.LOW
        };
        Set<OASPriceCompetitivenessType> actual  = new Set<OASPriceCompetitivenessType>(OASPriceCompetitivenessType.values());
        System.assertEquals(expected, actual);
    }
}
