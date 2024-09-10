@isTest
private class OASShipmentPalletLabelPageFormatTypeTest {
    @isTest
    private static void allowableValues() {
        Set<OASShipmentPalletLabelPageFormatType> expected = new Set<OASShipmentPalletLabelPageFormatType>{
            OASShipmentPalletLabelPageFormatType.A4,
            OASShipmentPalletLabelPageFormatType.A8
        };
        Set<OASShipmentPalletLabelPageFormatType> actual  = new Set<OASShipmentPalletLabelPageFormatType>(OASShipmentPalletLabelPageFormatType.values());
        System.assertEquals(expected, actual);
    }
}
