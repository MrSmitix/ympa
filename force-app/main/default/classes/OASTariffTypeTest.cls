@isTest
private class OASTariffTypeTest {
    @isTest
    private static void allowableValues() {
        Set<OASTariffType> expected = new Set<OASTariffType>{
            OASTariffType.AGENCY_COMMISSION,
            OASTariffType.PAYMENT_TRANSFER,
            OASTariffType.STORAGE,
            OASTariffType.WITHDRAW,
            OASTariffType.SURPLUS,
            OASTariffType.FEE,
            OASTariffType.DELIVERY_TO_CUSTOMER,
            OASTariffType.CROSSREGIONAL_DELIVERY,
            OASTariffType.CROSSREGIONAL_DELIVERY_RETURN,
            OASTariffType.DISPOSAL,
            OASTariffType.SORTING_CENTER_STORAGE,
            OASTariffType.EXPRESS_DELIVERY,
            OASTariffType.FF_XDOC_SUPPLY_BOX,
            OASTariffType.FF_XDOC_SUPPLY_PALLET,
            OASTariffType.SORTING,
            OASTariffType.MIDDLE_MILE,
            OASTariffType.RETURN_PROCESSING,
            OASTariffType.EXPRESS_CANCELLED_BY_PARTNER,
            OASTariffType.DELIVERY_TO_CUSTOMER_RETURN,
            OASTariffType.CROSSBORDER_DELIVERY,
            OASTariffType.INTAKE_SORTING_BULKY_CARGO,
            OASTariffType.INTAKE_SORTING_SMALL_GOODS,
            OASTariffType.INTAKE_SORTING_DAILY,
            OASTariffType.FF_STORAGE_BILLING,
            OASTariffType.CANCELLED_ORDER_FEE_QI,
            OASTariffType.LATE_ORDER_EXECUTION_FEE_QI
        };
        Set<OASTariffType> actual  = new Set<OASTariffType>(OASTariffType.values());
        System.assertEquals(expected, actual);
    }
}
