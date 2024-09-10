@isTest
private class OASSearchShipmentsResponseTest {
    @isTest
    private static void equalsSameInstance() {
        OASSearchShipmentsResponse searchShipmentsResponse1 = OASSearchShipmentsResponse.getExample();
        OASSearchShipmentsResponse searchShipmentsResponse2 = searchShipmentsResponse1;
        OASSearchShipmentsResponse searchShipmentsResponse3 = new OASSearchShipmentsResponse();
        OASSearchShipmentsResponse searchShipmentsResponse4 = searchShipmentsResponse3;

        System.assert(searchShipmentsResponse1.equals(searchShipmentsResponse2));
        System.assert(searchShipmentsResponse2.equals(searchShipmentsResponse1));
        System.assert(searchShipmentsResponse1.equals(searchShipmentsResponse1));
        System.assert(searchShipmentsResponse3.equals(searchShipmentsResponse4));
        System.assert(searchShipmentsResponse4.equals(searchShipmentsResponse3));
        System.assert(searchShipmentsResponse3.equals(searchShipmentsResponse3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASSearchShipmentsResponse searchShipmentsResponse1 = OASSearchShipmentsResponse.getExample();
        OASSearchShipmentsResponse searchShipmentsResponse2 = OASSearchShipmentsResponse.getExample();
        OASSearchShipmentsResponse searchShipmentsResponse3 = new OASSearchShipmentsResponse();
        OASSearchShipmentsResponse searchShipmentsResponse4 = new OASSearchShipmentsResponse();

        System.assert(searchShipmentsResponse1.equals(searchShipmentsResponse2));
        System.assert(searchShipmentsResponse2.equals(searchShipmentsResponse1));
        System.assert(searchShipmentsResponse3.equals(searchShipmentsResponse4));
        System.assert(searchShipmentsResponse4.equals(searchShipmentsResponse3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASSearchShipmentsResponse searchShipmentsResponse1 = OASSearchShipmentsResponse.getExample();
        OASSearchShipmentsResponse searchShipmentsResponse2 = new OASSearchShipmentsResponse();

        System.assertEquals(false, searchShipmentsResponse1.equals('foo'));
        System.assertEquals(false, searchShipmentsResponse2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASSearchShipmentsResponse searchShipmentsResponse1 = OASSearchShipmentsResponse.getExample();
        OASSearchShipmentsResponse searchShipmentsResponse2 = new OASSearchShipmentsResponse();
        OASSearchShipmentsResponse searchShipmentsResponse3;

        System.assertEquals(false, searchShipmentsResponse1.equals(searchShipmentsResponse3));
        System.assertEquals(false, searchShipmentsResponse2.equals(searchShipmentsResponse3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASSearchShipmentsResponse searchShipmentsResponse1 = OASSearchShipmentsResponse.getExample();
        OASSearchShipmentsResponse searchShipmentsResponse2 = new OASSearchShipmentsResponse();

        System.assertEquals(searchShipmentsResponse1.hashCode(), searchShipmentsResponse1.hashCode());
        System.assertEquals(searchShipmentsResponse2.hashCode(), searchShipmentsResponse2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASSearchShipmentsResponse searchShipmentsResponse1 = OASSearchShipmentsResponse.getExample();
        OASSearchShipmentsResponse searchShipmentsResponse2 = OASSearchShipmentsResponse.getExample();
        OASSearchShipmentsResponse searchShipmentsResponse3 = new OASSearchShipmentsResponse();
        OASSearchShipmentsResponse searchShipmentsResponse4 = new OASSearchShipmentsResponse();

        System.assert(searchShipmentsResponse1.equals(searchShipmentsResponse2));
        System.assert(searchShipmentsResponse3.equals(searchShipmentsResponse4));
        System.assertEquals(searchShipmentsResponse1.hashCode(), searchShipmentsResponse2.hashCode());
        System.assertEquals(searchShipmentsResponse3.hashCode(), searchShipmentsResponse4.hashCode());
    }
}
