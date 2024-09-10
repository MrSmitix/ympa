@isTest
private class OASOrderPaymentMethodTypeTest {
    @isTest
    private static void allowableValues() {
        Set<OASOrderPaymentMethodType> expected = new Set<OASOrderPaymentMethodType>{
            OASOrderPaymentMethodType.CASH_ON_DELIVERY,
            OASOrderPaymentMethodType.CARD_ON_DELIVERY,
            OASOrderPaymentMethodType.BOUND_CARD_ON_DELIVERY,
            OASOrderPaymentMethodType.YANDEX,
            OASOrderPaymentMethodType.APPLE_PAY,
            OASOrderPaymentMethodType.EXTERNAL_CERTIFICATE,
            OASOrderPaymentMethodType.CREDIT,
            OASOrderPaymentMethodType.GOOGLE_PAY,
            OASOrderPaymentMethodType.TINKOFF_CREDIT,
            OASOrderPaymentMethodType.SBP,
            OASOrderPaymentMethodType.TINKOFF_INSTALLMENTS,
            OASOrderPaymentMethodType.B2B_ACCOUNT_PREPAYMENT,
            OASOrderPaymentMethodType.B2B_ACCOUNT_POSTPAYMENT,
            OASOrderPaymentMethodType.UNKNOWN
        };
        Set<OASOrderPaymentMethodType> actual  = new Set<OASOrderPaymentMethodType>(OASOrderPaymentMethodType.values());
        System.assertEquals(expected, actual);
    }
}
