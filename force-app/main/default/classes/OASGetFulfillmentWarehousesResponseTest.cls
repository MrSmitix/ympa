@isTest
private class OASGetFulfillmentWarehousesResponseTest {
    @isTest
    private static void equalsSameInstance() {
        OASGetFulfillmentWarehousesResponse getFulfillmentWarehousesResponse1 = OASGetFulfillmentWarehousesResponse.getExample();
        OASGetFulfillmentWarehousesResponse getFulfillmentWarehousesResponse2 = getFulfillmentWarehousesResponse1;
        OASGetFulfillmentWarehousesResponse getFulfillmentWarehousesResponse3 = new OASGetFulfillmentWarehousesResponse();
        OASGetFulfillmentWarehousesResponse getFulfillmentWarehousesResponse4 = getFulfillmentWarehousesResponse3;

        System.assert(getFulfillmentWarehousesResponse1.equals(getFulfillmentWarehousesResponse2));
        System.assert(getFulfillmentWarehousesResponse2.equals(getFulfillmentWarehousesResponse1));
        System.assert(getFulfillmentWarehousesResponse1.equals(getFulfillmentWarehousesResponse1));
        System.assert(getFulfillmentWarehousesResponse3.equals(getFulfillmentWarehousesResponse4));
        System.assert(getFulfillmentWarehousesResponse4.equals(getFulfillmentWarehousesResponse3));
        System.assert(getFulfillmentWarehousesResponse3.equals(getFulfillmentWarehousesResponse3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASGetFulfillmentWarehousesResponse getFulfillmentWarehousesResponse1 = OASGetFulfillmentWarehousesResponse.getExample();
        OASGetFulfillmentWarehousesResponse getFulfillmentWarehousesResponse2 = OASGetFulfillmentWarehousesResponse.getExample();
        OASGetFulfillmentWarehousesResponse getFulfillmentWarehousesResponse3 = new OASGetFulfillmentWarehousesResponse();
        OASGetFulfillmentWarehousesResponse getFulfillmentWarehousesResponse4 = new OASGetFulfillmentWarehousesResponse();

        System.assert(getFulfillmentWarehousesResponse1.equals(getFulfillmentWarehousesResponse2));
        System.assert(getFulfillmentWarehousesResponse2.equals(getFulfillmentWarehousesResponse1));
        System.assert(getFulfillmentWarehousesResponse3.equals(getFulfillmentWarehousesResponse4));
        System.assert(getFulfillmentWarehousesResponse4.equals(getFulfillmentWarehousesResponse3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASGetFulfillmentWarehousesResponse getFulfillmentWarehousesResponse1 = OASGetFulfillmentWarehousesResponse.getExample();
        OASGetFulfillmentWarehousesResponse getFulfillmentWarehousesResponse2 = new OASGetFulfillmentWarehousesResponse();

        System.assertEquals(false, getFulfillmentWarehousesResponse1.equals('foo'));
        System.assertEquals(false, getFulfillmentWarehousesResponse2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASGetFulfillmentWarehousesResponse getFulfillmentWarehousesResponse1 = OASGetFulfillmentWarehousesResponse.getExample();
        OASGetFulfillmentWarehousesResponse getFulfillmentWarehousesResponse2 = new OASGetFulfillmentWarehousesResponse();
        OASGetFulfillmentWarehousesResponse getFulfillmentWarehousesResponse3;

        System.assertEquals(false, getFulfillmentWarehousesResponse1.equals(getFulfillmentWarehousesResponse3));
        System.assertEquals(false, getFulfillmentWarehousesResponse2.equals(getFulfillmentWarehousesResponse3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASGetFulfillmentWarehousesResponse getFulfillmentWarehousesResponse1 = OASGetFulfillmentWarehousesResponse.getExample();
        OASGetFulfillmentWarehousesResponse getFulfillmentWarehousesResponse2 = new OASGetFulfillmentWarehousesResponse();

        System.assertEquals(getFulfillmentWarehousesResponse1.hashCode(), getFulfillmentWarehousesResponse1.hashCode());
        System.assertEquals(getFulfillmentWarehousesResponse2.hashCode(), getFulfillmentWarehousesResponse2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASGetFulfillmentWarehousesResponse getFulfillmentWarehousesResponse1 = OASGetFulfillmentWarehousesResponse.getExample();
        OASGetFulfillmentWarehousesResponse getFulfillmentWarehousesResponse2 = OASGetFulfillmentWarehousesResponse.getExample();
        OASGetFulfillmentWarehousesResponse getFulfillmentWarehousesResponse3 = new OASGetFulfillmentWarehousesResponse();
        OASGetFulfillmentWarehousesResponse getFulfillmentWarehousesResponse4 = new OASGetFulfillmentWarehousesResponse();

        System.assert(getFulfillmentWarehousesResponse1.equals(getFulfillmentWarehousesResponse2));
        System.assert(getFulfillmentWarehousesResponse3.equals(getFulfillmentWarehousesResponse4));
        System.assertEquals(getFulfillmentWarehousesResponse1.hashCode(), getFulfillmentWarehousesResponse2.hashCode());
        System.assertEquals(getFulfillmentWarehousesResponse3.hashCode(), getFulfillmentWarehousesResponse4.hashCode());
    }
}
