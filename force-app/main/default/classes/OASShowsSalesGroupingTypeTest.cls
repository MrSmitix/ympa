@isTest
private class OASShowsSalesGroupingTypeTest {
    @isTest
    private static void allowableValues() {
        Set<OASShowsSalesGroupingType> expected = new Set<OASShowsSalesGroupingType>{
            OASShowsSalesGroupingType.CATEGORIES,
            OASShowsSalesGroupingType.OFFERS
        };
        Set<OASShowsSalesGroupingType> actual  = new Set<OASShowsSalesGroupingType>(OASShowsSalesGroupingType.values());
        System.assertEquals(expected, actual);
    }
}
