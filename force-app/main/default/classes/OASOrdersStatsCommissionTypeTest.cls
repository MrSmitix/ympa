@isTest
private class OASOrdersStatsCommissionTypeTest {
    @isTest
    private static void allowableValues() {
        Set<OASOrdersStatsCommissionType> expected = new Set<OASOrdersStatsCommissionType>{
            OASOrdersStatsCommissionType.FEE,
            OASOrdersStatsCommissionType.FULFILLMENT,
            OASOrdersStatsCommissionType.LOYALTY_PARTICIPATION_FEE,
            OASOrdersStatsCommissionType.AUCTION_PROMOTION,
            OASOrdersStatsCommissionType.INSTALLMENT,
            OASOrdersStatsCommissionType.DELIVERY_TO_CUSTOMER,
            OASOrdersStatsCommissionType.EXPRESS_DELIVERY_TO_CUSTOMER,
            OASOrdersStatsCommissionType.AGENCY,
            OASOrdersStatsCommissionType.PAYMENT_TRANSFER,
            OASOrdersStatsCommissionType.RETURNED_ORDERS_STORAGE,
            OASOrdersStatsCommissionType.SORTING,
            OASOrdersStatsCommissionType.INTAKE_SORTING,
            OASOrdersStatsCommissionType.RETURN_PROCESSING,
            OASOrdersStatsCommissionType.ILLIQUID_GOODS_SALE
        };
        Set<OASOrdersStatsCommissionType> actual  = new Set<OASOrdersStatsCommissionType>(OASOrdersStatsCommissionType.values());
        System.assertEquals(expected, actual);
    }
}
