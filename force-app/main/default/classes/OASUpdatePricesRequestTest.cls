@isTest
private class OASUpdatePricesRequestTest {
    @isTest
    private static void equalsSameInstance() {
        OASUpdatePricesRequest updatePricesRequest1 = OASUpdatePricesRequest.getExample();
        OASUpdatePricesRequest updatePricesRequest2 = updatePricesRequest1;
        OASUpdatePricesRequest updatePricesRequest3 = new OASUpdatePricesRequest();
        OASUpdatePricesRequest updatePricesRequest4 = updatePricesRequest3;

        System.assert(updatePricesRequest1.equals(updatePricesRequest2));
        System.assert(updatePricesRequest2.equals(updatePricesRequest1));
        System.assert(updatePricesRequest1.equals(updatePricesRequest1));
        System.assert(updatePricesRequest3.equals(updatePricesRequest4));
        System.assert(updatePricesRequest4.equals(updatePricesRequest3));
        System.assert(updatePricesRequest3.equals(updatePricesRequest3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASUpdatePricesRequest updatePricesRequest1 = OASUpdatePricesRequest.getExample();
        OASUpdatePricesRequest updatePricesRequest2 = OASUpdatePricesRequest.getExample();
        OASUpdatePricesRequest updatePricesRequest3 = new OASUpdatePricesRequest();
        OASUpdatePricesRequest updatePricesRequest4 = new OASUpdatePricesRequest();

        System.assert(updatePricesRequest1.equals(updatePricesRequest2));
        System.assert(updatePricesRequest2.equals(updatePricesRequest1));
        System.assert(updatePricesRequest3.equals(updatePricesRequest4));
        System.assert(updatePricesRequest4.equals(updatePricesRequest3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASUpdatePricesRequest updatePricesRequest1 = OASUpdatePricesRequest.getExample();
        OASUpdatePricesRequest updatePricesRequest2 = new OASUpdatePricesRequest();

        System.assertEquals(false, updatePricesRequest1.equals('foo'));
        System.assertEquals(false, updatePricesRequest2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASUpdatePricesRequest updatePricesRequest1 = OASUpdatePricesRequest.getExample();
        OASUpdatePricesRequest updatePricesRequest2 = new OASUpdatePricesRequest();
        OASUpdatePricesRequest updatePricesRequest3;

        System.assertEquals(false, updatePricesRequest1.equals(updatePricesRequest3));
        System.assertEquals(false, updatePricesRequest2.equals(updatePricesRequest3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASUpdatePricesRequest updatePricesRequest1 = OASUpdatePricesRequest.getExample();
        OASUpdatePricesRequest updatePricesRequest2 = new OASUpdatePricesRequest();

        System.assertEquals(updatePricesRequest1.hashCode(), updatePricesRequest1.hashCode());
        System.assertEquals(updatePricesRequest2.hashCode(), updatePricesRequest2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASUpdatePricesRequest updatePricesRequest1 = OASUpdatePricesRequest.getExample();
        OASUpdatePricesRequest updatePricesRequest2 = OASUpdatePricesRequest.getExample();
        OASUpdatePricesRequest updatePricesRequest3 = new OASUpdatePricesRequest();
        OASUpdatePricesRequest updatePricesRequest4 = new OASUpdatePricesRequest();

        System.assert(updatePricesRequest1.equals(updatePricesRequest2));
        System.assert(updatePricesRequest3.equals(updatePricesRequest4));
        System.assertEquals(updatePricesRequest1.hashCode(), updatePricesRequest2.hashCode());
        System.assertEquals(updatePricesRequest3.hashCode(), updatePricesRequest4.hashCode());
    }

    @isTest
    private static void defaultValuesPopulated() {
        OASUpdatePricesRequest updatePricesRequest = new OASUpdatePricesRequest();
        System.assertEquals(new List<OASOfferPriceDTO>(), updatePricesRequest.offers);
    }
}
