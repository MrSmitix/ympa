@isTest
private class OASCalculatedTariffTypeTest {
    @isTest
    private static void allowableValues() {
        Set<OASCalculatedTariffType> expected = new Set<OASCalculatedTariffType>{
            OASCalculatedTariffType.AGENCY_COMMISSION,
            OASCalculatedTariffType.PAYMENT_TRANSFER,
            OASCalculatedTariffType.FEE,
            OASCalculatedTariffType.DELIVERY_TO_CUSTOMER,
            OASCalculatedTariffType.CROSSREGIONAL_DELIVERY,
            OASCalculatedTariffType.EXPRESS_DELIVERY,
            OASCalculatedTariffType.SORTING,
            OASCalculatedTariffType.MIDDLE_MILE
        };
        Set<OASCalculatedTariffType> actual  = new Set<OASCalculatedTariffType>(OASCalculatedTariffType.values());
        System.assertEquals(expected, actual);
    }
}
