@isTest
private class OASSuggestPricesRequestTest {
    @isTest
    private static void equalsSameInstance() {
        OASSuggestPricesRequest suggestPricesRequest1 = OASSuggestPricesRequest.getExample();
        OASSuggestPricesRequest suggestPricesRequest2 = suggestPricesRequest1;
        OASSuggestPricesRequest suggestPricesRequest3 = new OASSuggestPricesRequest();
        OASSuggestPricesRequest suggestPricesRequest4 = suggestPricesRequest3;

        System.assert(suggestPricesRequest1.equals(suggestPricesRequest2));
        System.assert(suggestPricesRequest2.equals(suggestPricesRequest1));
        System.assert(suggestPricesRequest1.equals(suggestPricesRequest1));
        System.assert(suggestPricesRequest3.equals(suggestPricesRequest4));
        System.assert(suggestPricesRequest4.equals(suggestPricesRequest3));
        System.assert(suggestPricesRequest3.equals(suggestPricesRequest3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASSuggestPricesRequest suggestPricesRequest1 = OASSuggestPricesRequest.getExample();
        OASSuggestPricesRequest suggestPricesRequest2 = OASSuggestPricesRequest.getExample();
        OASSuggestPricesRequest suggestPricesRequest3 = new OASSuggestPricesRequest();
        OASSuggestPricesRequest suggestPricesRequest4 = new OASSuggestPricesRequest();

        System.assert(suggestPricesRequest1.equals(suggestPricesRequest2));
        System.assert(suggestPricesRequest2.equals(suggestPricesRequest1));
        System.assert(suggestPricesRequest3.equals(suggestPricesRequest4));
        System.assert(suggestPricesRequest4.equals(suggestPricesRequest3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASSuggestPricesRequest suggestPricesRequest1 = OASSuggestPricesRequest.getExample();
        OASSuggestPricesRequest suggestPricesRequest2 = new OASSuggestPricesRequest();

        System.assertEquals(false, suggestPricesRequest1.equals('foo'));
        System.assertEquals(false, suggestPricesRequest2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASSuggestPricesRequest suggestPricesRequest1 = OASSuggestPricesRequest.getExample();
        OASSuggestPricesRequest suggestPricesRequest2 = new OASSuggestPricesRequest();
        OASSuggestPricesRequest suggestPricesRequest3;

        System.assertEquals(false, suggestPricesRequest1.equals(suggestPricesRequest3));
        System.assertEquals(false, suggestPricesRequest2.equals(suggestPricesRequest3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASSuggestPricesRequest suggestPricesRequest1 = OASSuggestPricesRequest.getExample();
        OASSuggestPricesRequest suggestPricesRequest2 = new OASSuggestPricesRequest();

        System.assertEquals(suggestPricesRequest1.hashCode(), suggestPricesRequest1.hashCode());
        System.assertEquals(suggestPricesRequest2.hashCode(), suggestPricesRequest2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASSuggestPricesRequest suggestPricesRequest1 = OASSuggestPricesRequest.getExample();
        OASSuggestPricesRequest suggestPricesRequest2 = OASSuggestPricesRequest.getExample();
        OASSuggestPricesRequest suggestPricesRequest3 = new OASSuggestPricesRequest();
        OASSuggestPricesRequest suggestPricesRequest4 = new OASSuggestPricesRequest();

        System.assert(suggestPricesRequest1.equals(suggestPricesRequest2));
        System.assert(suggestPricesRequest3.equals(suggestPricesRequest4));
        System.assertEquals(suggestPricesRequest1.hashCode(), suggestPricesRequest2.hashCode());
        System.assertEquals(suggestPricesRequest3.hashCode(), suggestPricesRequest4.hashCode());
    }

    @isTest
    private static void defaultValuesPopulated() {
        OASSuggestPricesRequest suggestPricesRequest = new OASSuggestPricesRequest();
        System.assertEquals(new List<OASSuggestOfferPriceDTO>(), suggestPricesRequest.offers);
    }
}
