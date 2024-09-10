@isTest
private class OASSortOrderTypeTest {
    @isTest
    private static void allowableValues() {
        Set<OASSortOrderType> expected = new Set<OASSortOrderType>{
            OASSortOrderType.ASC,
            OASSortOrderType.DESC
        };
        Set<OASSortOrderType> actual  = new Set<OASSortOrderType>(OASSortOrderType.values());
        System.assertEquals(expected, actual);
    }
}
