@isTest
private class OASConfirmPricesRequestTest {
    @isTest
    private static void equalsSameInstance() {
        OASConfirmPricesRequest confirmPricesRequest1 = OASConfirmPricesRequest.getExample();
        OASConfirmPricesRequest confirmPricesRequest2 = confirmPricesRequest1;
        OASConfirmPricesRequest confirmPricesRequest3 = new OASConfirmPricesRequest();
        OASConfirmPricesRequest confirmPricesRequest4 = confirmPricesRequest3;

        System.assert(confirmPricesRequest1.equals(confirmPricesRequest2));
        System.assert(confirmPricesRequest2.equals(confirmPricesRequest1));
        System.assert(confirmPricesRequest1.equals(confirmPricesRequest1));
        System.assert(confirmPricesRequest3.equals(confirmPricesRequest4));
        System.assert(confirmPricesRequest4.equals(confirmPricesRequest3));
        System.assert(confirmPricesRequest3.equals(confirmPricesRequest3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASConfirmPricesRequest confirmPricesRequest1 = OASConfirmPricesRequest.getExample();
        OASConfirmPricesRequest confirmPricesRequest2 = OASConfirmPricesRequest.getExample();
        OASConfirmPricesRequest confirmPricesRequest3 = new OASConfirmPricesRequest();
        OASConfirmPricesRequest confirmPricesRequest4 = new OASConfirmPricesRequest();

        System.assert(confirmPricesRequest1.equals(confirmPricesRequest2));
        System.assert(confirmPricesRequest2.equals(confirmPricesRequest1));
        System.assert(confirmPricesRequest3.equals(confirmPricesRequest4));
        System.assert(confirmPricesRequest4.equals(confirmPricesRequest3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASConfirmPricesRequest confirmPricesRequest1 = OASConfirmPricesRequest.getExample();
        OASConfirmPricesRequest confirmPricesRequest2 = new OASConfirmPricesRequest();

        System.assertEquals(false, confirmPricesRequest1.equals('foo'));
        System.assertEquals(false, confirmPricesRequest2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASConfirmPricesRequest confirmPricesRequest1 = OASConfirmPricesRequest.getExample();
        OASConfirmPricesRequest confirmPricesRequest2 = new OASConfirmPricesRequest();
        OASConfirmPricesRequest confirmPricesRequest3;

        System.assertEquals(false, confirmPricesRequest1.equals(confirmPricesRequest3));
        System.assertEquals(false, confirmPricesRequest2.equals(confirmPricesRequest3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASConfirmPricesRequest confirmPricesRequest1 = OASConfirmPricesRequest.getExample();
        OASConfirmPricesRequest confirmPricesRequest2 = new OASConfirmPricesRequest();

        System.assertEquals(confirmPricesRequest1.hashCode(), confirmPricesRequest1.hashCode());
        System.assertEquals(confirmPricesRequest2.hashCode(), confirmPricesRequest2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASConfirmPricesRequest confirmPricesRequest1 = OASConfirmPricesRequest.getExample();
        OASConfirmPricesRequest confirmPricesRequest2 = OASConfirmPricesRequest.getExample();
        OASConfirmPricesRequest confirmPricesRequest3 = new OASConfirmPricesRequest();
        OASConfirmPricesRequest confirmPricesRequest4 = new OASConfirmPricesRequest();

        System.assert(confirmPricesRequest1.equals(confirmPricesRequest2));
        System.assert(confirmPricesRequest3.equals(confirmPricesRequest4));
        System.assertEquals(confirmPricesRequest1.hashCode(), confirmPricesRequest2.hashCode());
        System.assertEquals(confirmPricesRequest3.hashCode(), confirmPricesRequest4.hashCode());
    }

    @isTest
    private static void defaultValuesPopulated() {
        OASConfirmPricesRequest confirmPricesRequest = new OASConfirmPricesRequest();
        System.assertEquals(new List<String>(), confirmPricesRequest.offerIds);
    }
}
