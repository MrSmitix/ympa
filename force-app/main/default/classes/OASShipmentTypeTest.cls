@isTest
private class OASShipmentTypeTest {
    @isTest
    private static void allowableValues() {
        Set<OASShipmentType> expected = new Set<OASShipmentType>{
            OASShipmentType.IMPORT,
            OASShipmentType.WITHDRAW
        };
        Set<OASShipmentType> actual  = new Set<OASShipmentType>(OASShipmentType.values());
        System.assertEquals(expected, actual);
    }
}
