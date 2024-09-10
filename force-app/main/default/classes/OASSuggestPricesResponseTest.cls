@isTest
private class OASSuggestPricesResponseTest {
    @isTest
    private static void equalsSameInstance() {
        OASSuggestPricesResponse suggestPricesResponse1 = OASSuggestPricesResponse.getExample();
        OASSuggestPricesResponse suggestPricesResponse2 = suggestPricesResponse1;
        OASSuggestPricesResponse suggestPricesResponse3 = new OASSuggestPricesResponse();
        OASSuggestPricesResponse suggestPricesResponse4 = suggestPricesResponse3;

        System.assert(suggestPricesResponse1.equals(suggestPricesResponse2));
        System.assert(suggestPricesResponse2.equals(suggestPricesResponse1));
        System.assert(suggestPricesResponse1.equals(suggestPricesResponse1));
        System.assert(suggestPricesResponse3.equals(suggestPricesResponse4));
        System.assert(suggestPricesResponse4.equals(suggestPricesResponse3));
        System.assert(suggestPricesResponse3.equals(suggestPricesResponse3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASSuggestPricesResponse suggestPricesResponse1 = OASSuggestPricesResponse.getExample();
        OASSuggestPricesResponse suggestPricesResponse2 = OASSuggestPricesResponse.getExample();
        OASSuggestPricesResponse suggestPricesResponse3 = new OASSuggestPricesResponse();
        OASSuggestPricesResponse suggestPricesResponse4 = new OASSuggestPricesResponse();

        System.assert(suggestPricesResponse1.equals(suggestPricesResponse2));
        System.assert(suggestPricesResponse2.equals(suggestPricesResponse1));
        System.assert(suggestPricesResponse3.equals(suggestPricesResponse4));
        System.assert(suggestPricesResponse4.equals(suggestPricesResponse3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASSuggestPricesResponse suggestPricesResponse1 = OASSuggestPricesResponse.getExample();
        OASSuggestPricesResponse suggestPricesResponse2 = new OASSuggestPricesResponse();

        System.assertEquals(false, suggestPricesResponse1.equals('foo'));
        System.assertEquals(false, suggestPricesResponse2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASSuggestPricesResponse suggestPricesResponse1 = OASSuggestPricesResponse.getExample();
        OASSuggestPricesResponse suggestPricesResponse2 = new OASSuggestPricesResponse();
        OASSuggestPricesResponse suggestPricesResponse3;

        System.assertEquals(false, suggestPricesResponse1.equals(suggestPricesResponse3));
        System.assertEquals(false, suggestPricesResponse2.equals(suggestPricesResponse3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASSuggestPricesResponse suggestPricesResponse1 = OASSuggestPricesResponse.getExample();
        OASSuggestPricesResponse suggestPricesResponse2 = new OASSuggestPricesResponse();

        System.assertEquals(suggestPricesResponse1.hashCode(), suggestPricesResponse1.hashCode());
        System.assertEquals(suggestPricesResponse2.hashCode(), suggestPricesResponse2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASSuggestPricesResponse suggestPricesResponse1 = OASSuggestPricesResponse.getExample();
        OASSuggestPricesResponse suggestPricesResponse2 = OASSuggestPricesResponse.getExample();
        OASSuggestPricesResponse suggestPricesResponse3 = new OASSuggestPricesResponse();
        OASSuggestPricesResponse suggestPricesResponse4 = new OASSuggestPricesResponse();

        System.assert(suggestPricesResponse1.equals(suggestPricesResponse2));
        System.assert(suggestPricesResponse3.equals(suggestPricesResponse4));
        System.assertEquals(suggestPricesResponse1.hashCode(), suggestPricesResponse2.hashCode());
        System.assertEquals(suggestPricesResponse3.hashCode(), suggestPricesResponse4.hashCode());
    }
}
