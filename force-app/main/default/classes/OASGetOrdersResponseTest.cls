@isTest
private class OASGetOrdersResponseTest {
    @isTest
    private static void equalsSameInstance() {
        OASGetOrdersResponse getOrdersResponse1 = OASGetOrdersResponse.getExample();
        OASGetOrdersResponse getOrdersResponse2 = getOrdersResponse1;
        OASGetOrdersResponse getOrdersResponse3 = new OASGetOrdersResponse();
        OASGetOrdersResponse getOrdersResponse4 = getOrdersResponse3;

        System.assert(getOrdersResponse1.equals(getOrdersResponse2));
        System.assert(getOrdersResponse2.equals(getOrdersResponse1));
        System.assert(getOrdersResponse1.equals(getOrdersResponse1));
        System.assert(getOrdersResponse3.equals(getOrdersResponse4));
        System.assert(getOrdersResponse4.equals(getOrdersResponse3));
        System.assert(getOrdersResponse3.equals(getOrdersResponse3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASGetOrdersResponse getOrdersResponse1 = OASGetOrdersResponse.getExample();
        OASGetOrdersResponse getOrdersResponse2 = OASGetOrdersResponse.getExample();
        OASGetOrdersResponse getOrdersResponse3 = new OASGetOrdersResponse();
        OASGetOrdersResponse getOrdersResponse4 = new OASGetOrdersResponse();

        System.assert(getOrdersResponse1.equals(getOrdersResponse2));
        System.assert(getOrdersResponse2.equals(getOrdersResponse1));
        System.assert(getOrdersResponse3.equals(getOrdersResponse4));
        System.assert(getOrdersResponse4.equals(getOrdersResponse3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASGetOrdersResponse getOrdersResponse1 = OASGetOrdersResponse.getExample();
        OASGetOrdersResponse getOrdersResponse2 = new OASGetOrdersResponse();

        System.assertEquals(false, getOrdersResponse1.equals('foo'));
        System.assertEquals(false, getOrdersResponse2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASGetOrdersResponse getOrdersResponse1 = OASGetOrdersResponse.getExample();
        OASGetOrdersResponse getOrdersResponse2 = new OASGetOrdersResponse();
        OASGetOrdersResponse getOrdersResponse3;

        System.assertEquals(false, getOrdersResponse1.equals(getOrdersResponse3));
        System.assertEquals(false, getOrdersResponse2.equals(getOrdersResponse3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASGetOrdersResponse getOrdersResponse1 = OASGetOrdersResponse.getExample();
        OASGetOrdersResponse getOrdersResponse2 = new OASGetOrdersResponse();

        System.assertEquals(getOrdersResponse1.hashCode(), getOrdersResponse1.hashCode());
        System.assertEquals(getOrdersResponse2.hashCode(), getOrdersResponse2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASGetOrdersResponse getOrdersResponse1 = OASGetOrdersResponse.getExample();
        OASGetOrdersResponse getOrdersResponse2 = OASGetOrdersResponse.getExample();
        OASGetOrdersResponse getOrdersResponse3 = new OASGetOrdersResponse();
        OASGetOrdersResponse getOrdersResponse4 = new OASGetOrdersResponse();

        System.assert(getOrdersResponse1.equals(getOrdersResponse2));
        System.assert(getOrdersResponse3.equals(getOrdersResponse4));
        System.assertEquals(getOrdersResponse1.hashCode(), getOrdersResponse2.hashCode());
        System.assertEquals(getOrdersResponse3.hashCode(), getOrdersResponse4.hashCode());
    }

    @isTest
    private static void defaultValuesPopulated() {
        OASGetOrdersResponse getOrdersResponse = new OASGetOrdersResponse();
        System.assertEquals(new List<OASOrderDTO>(), getOrdersResponse.orders);
        System.assertEquals(null, getOrdersResponse.pager);
        System.assertEquals(null, getOrdersResponse.paging);
    }
}
