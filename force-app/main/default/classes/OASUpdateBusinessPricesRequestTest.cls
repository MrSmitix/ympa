@isTest
private class OASUpdateBusinessPricesRequestTest {
    @isTest
    private static void equalsSameInstance() {
        OASUpdateBusinessPricesRequest updateBusinessPricesRequest1 = OASUpdateBusinessPricesRequest.getExample();
        OASUpdateBusinessPricesRequest updateBusinessPricesRequest2 = updateBusinessPricesRequest1;
        OASUpdateBusinessPricesRequest updateBusinessPricesRequest3 = new OASUpdateBusinessPricesRequest();
        OASUpdateBusinessPricesRequest updateBusinessPricesRequest4 = updateBusinessPricesRequest3;

        System.assert(updateBusinessPricesRequest1.equals(updateBusinessPricesRequest2));
        System.assert(updateBusinessPricesRequest2.equals(updateBusinessPricesRequest1));
        System.assert(updateBusinessPricesRequest1.equals(updateBusinessPricesRequest1));
        System.assert(updateBusinessPricesRequest3.equals(updateBusinessPricesRequest4));
        System.assert(updateBusinessPricesRequest4.equals(updateBusinessPricesRequest3));
        System.assert(updateBusinessPricesRequest3.equals(updateBusinessPricesRequest3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASUpdateBusinessPricesRequest updateBusinessPricesRequest1 = OASUpdateBusinessPricesRequest.getExample();
        OASUpdateBusinessPricesRequest updateBusinessPricesRequest2 = OASUpdateBusinessPricesRequest.getExample();
        OASUpdateBusinessPricesRequest updateBusinessPricesRequest3 = new OASUpdateBusinessPricesRequest();
        OASUpdateBusinessPricesRequest updateBusinessPricesRequest4 = new OASUpdateBusinessPricesRequest();

        System.assert(updateBusinessPricesRequest1.equals(updateBusinessPricesRequest2));
        System.assert(updateBusinessPricesRequest2.equals(updateBusinessPricesRequest1));
        System.assert(updateBusinessPricesRequest3.equals(updateBusinessPricesRequest4));
        System.assert(updateBusinessPricesRequest4.equals(updateBusinessPricesRequest3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASUpdateBusinessPricesRequest updateBusinessPricesRequest1 = OASUpdateBusinessPricesRequest.getExample();
        OASUpdateBusinessPricesRequest updateBusinessPricesRequest2 = new OASUpdateBusinessPricesRequest();

        System.assertEquals(false, updateBusinessPricesRequest1.equals('foo'));
        System.assertEquals(false, updateBusinessPricesRequest2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASUpdateBusinessPricesRequest updateBusinessPricesRequest1 = OASUpdateBusinessPricesRequest.getExample();
        OASUpdateBusinessPricesRequest updateBusinessPricesRequest2 = new OASUpdateBusinessPricesRequest();
        OASUpdateBusinessPricesRequest updateBusinessPricesRequest3;

        System.assertEquals(false, updateBusinessPricesRequest1.equals(updateBusinessPricesRequest3));
        System.assertEquals(false, updateBusinessPricesRequest2.equals(updateBusinessPricesRequest3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASUpdateBusinessPricesRequest updateBusinessPricesRequest1 = OASUpdateBusinessPricesRequest.getExample();
        OASUpdateBusinessPricesRequest updateBusinessPricesRequest2 = new OASUpdateBusinessPricesRequest();

        System.assertEquals(updateBusinessPricesRequest1.hashCode(), updateBusinessPricesRequest1.hashCode());
        System.assertEquals(updateBusinessPricesRequest2.hashCode(), updateBusinessPricesRequest2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASUpdateBusinessPricesRequest updateBusinessPricesRequest1 = OASUpdateBusinessPricesRequest.getExample();
        OASUpdateBusinessPricesRequest updateBusinessPricesRequest2 = OASUpdateBusinessPricesRequest.getExample();
        OASUpdateBusinessPricesRequest updateBusinessPricesRequest3 = new OASUpdateBusinessPricesRequest();
        OASUpdateBusinessPricesRequest updateBusinessPricesRequest4 = new OASUpdateBusinessPricesRequest();

        System.assert(updateBusinessPricesRequest1.equals(updateBusinessPricesRequest2));
        System.assert(updateBusinessPricesRequest3.equals(updateBusinessPricesRequest4));
        System.assertEquals(updateBusinessPricesRequest1.hashCode(), updateBusinessPricesRequest2.hashCode());
        System.assertEquals(updateBusinessPricesRequest3.hashCode(), updateBusinessPricesRequest4.hashCode());
    }

    @isTest
    private static void defaultValuesPopulated() {
        OASUpdateBusinessPricesRequest updateBusinessPricesRequest = new OASUpdateBusinessPricesRequest();
        System.assertEquals(new List<OASUpdateBusinessOfferPriceDTO>(), updateBusinessPricesRequest.offers);
    }
}
