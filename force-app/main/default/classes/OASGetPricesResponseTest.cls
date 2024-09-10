@isTest
private class OASGetPricesResponseTest {
    @isTest
    private static void equalsSameInstance() {
        OASGetPricesResponse getPricesResponse1 = OASGetPricesResponse.getExample();
        OASGetPricesResponse getPricesResponse2 = getPricesResponse1;
        OASGetPricesResponse getPricesResponse3 = new OASGetPricesResponse();
        OASGetPricesResponse getPricesResponse4 = getPricesResponse3;

        System.assert(getPricesResponse1.equals(getPricesResponse2));
        System.assert(getPricesResponse2.equals(getPricesResponse1));
        System.assert(getPricesResponse1.equals(getPricesResponse1));
        System.assert(getPricesResponse3.equals(getPricesResponse4));
        System.assert(getPricesResponse4.equals(getPricesResponse3));
        System.assert(getPricesResponse3.equals(getPricesResponse3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASGetPricesResponse getPricesResponse1 = OASGetPricesResponse.getExample();
        OASGetPricesResponse getPricesResponse2 = OASGetPricesResponse.getExample();
        OASGetPricesResponse getPricesResponse3 = new OASGetPricesResponse();
        OASGetPricesResponse getPricesResponse4 = new OASGetPricesResponse();

        System.assert(getPricesResponse1.equals(getPricesResponse2));
        System.assert(getPricesResponse2.equals(getPricesResponse1));
        System.assert(getPricesResponse3.equals(getPricesResponse4));
        System.assert(getPricesResponse4.equals(getPricesResponse3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASGetPricesResponse getPricesResponse1 = OASGetPricesResponse.getExample();
        OASGetPricesResponse getPricesResponse2 = new OASGetPricesResponse();

        System.assertEquals(false, getPricesResponse1.equals('foo'));
        System.assertEquals(false, getPricesResponse2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASGetPricesResponse getPricesResponse1 = OASGetPricesResponse.getExample();
        OASGetPricesResponse getPricesResponse2 = new OASGetPricesResponse();
        OASGetPricesResponse getPricesResponse3;

        System.assertEquals(false, getPricesResponse1.equals(getPricesResponse3));
        System.assertEquals(false, getPricesResponse2.equals(getPricesResponse3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASGetPricesResponse getPricesResponse1 = OASGetPricesResponse.getExample();
        OASGetPricesResponse getPricesResponse2 = new OASGetPricesResponse();

        System.assertEquals(getPricesResponse1.hashCode(), getPricesResponse1.hashCode());
        System.assertEquals(getPricesResponse2.hashCode(), getPricesResponse2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASGetPricesResponse getPricesResponse1 = OASGetPricesResponse.getExample();
        OASGetPricesResponse getPricesResponse2 = OASGetPricesResponse.getExample();
        OASGetPricesResponse getPricesResponse3 = new OASGetPricesResponse();
        OASGetPricesResponse getPricesResponse4 = new OASGetPricesResponse();

        System.assert(getPricesResponse1.equals(getPricesResponse2));
        System.assert(getPricesResponse3.equals(getPricesResponse4));
        System.assertEquals(getPricesResponse1.hashCode(), getPricesResponse2.hashCode());
        System.assertEquals(getPricesResponse3.hashCode(), getPricesResponse4.hashCode());
    }
}
