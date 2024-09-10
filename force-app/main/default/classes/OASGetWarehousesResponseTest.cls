@isTest
private class OASGetWarehousesResponseTest {
    @isTest
    private static void equalsSameInstance() {
        OASGetWarehousesResponse getWarehousesResponse1 = OASGetWarehousesResponse.getExample();
        OASGetWarehousesResponse getWarehousesResponse2 = getWarehousesResponse1;
        OASGetWarehousesResponse getWarehousesResponse3 = new OASGetWarehousesResponse();
        OASGetWarehousesResponse getWarehousesResponse4 = getWarehousesResponse3;

        System.assert(getWarehousesResponse1.equals(getWarehousesResponse2));
        System.assert(getWarehousesResponse2.equals(getWarehousesResponse1));
        System.assert(getWarehousesResponse1.equals(getWarehousesResponse1));
        System.assert(getWarehousesResponse3.equals(getWarehousesResponse4));
        System.assert(getWarehousesResponse4.equals(getWarehousesResponse3));
        System.assert(getWarehousesResponse3.equals(getWarehousesResponse3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASGetWarehousesResponse getWarehousesResponse1 = OASGetWarehousesResponse.getExample();
        OASGetWarehousesResponse getWarehousesResponse2 = OASGetWarehousesResponse.getExample();
        OASGetWarehousesResponse getWarehousesResponse3 = new OASGetWarehousesResponse();
        OASGetWarehousesResponse getWarehousesResponse4 = new OASGetWarehousesResponse();

        System.assert(getWarehousesResponse1.equals(getWarehousesResponse2));
        System.assert(getWarehousesResponse2.equals(getWarehousesResponse1));
        System.assert(getWarehousesResponse3.equals(getWarehousesResponse4));
        System.assert(getWarehousesResponse4.equals(getWarehousesResponse3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASGetWarehousesResponse getWarehousesResponse1 = OASGetWarehousesResponse.getExample();
        OASGetWarehousesResponse getWarehousesResponse2 = new OASGetWarehousesResponse();

        System.assertEquals(false, getWarehousesResponse1.equals('foo'));
        System.assertEquals(false, getWarehousesResponse2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASGetWarehousesResponse getWarehousesResponse1 = OASGetWarehousesResponse.getExample();
        OASGetWarehousesResponse getWarehousesResponse2 = new OASGetWarehousesResponse();
        OASGetWarehousesResponse getWarehousesResponse3;

        System.assertEquals(false, getWarehousesResponse1.equals(getWarehousesResponse3));
        System.assertEquals(false, getWarehousesResponse2.equals(getWarehousesResponse3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASGetWarehousesResponse getWarehousesResponse1 = OASGetWarehousesResponse.getExample();
        OASGetWarehousesResponse getWarehousesResponse2 = new OASGetWarehousesResponse();

        System.assertEquals(getWarehousesResponse1.hashCode(), getWarehousesResponse1.hashCode());
        System.assertEquals(getWarehousesResponse2.hashCode(), getWarehousesResponse2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASGetWarehousesResponse getWarehousesResponse1 = OASGetWarehousesResponse.getExample();
        OASGetWarehousesResponse getWarehousesResponse2 = OASGetWarehousesResponse.getExample();
        OASGetWarehousesResponse getWarehousesResponse3 = new OASGetWarehousesResponse();
        OASGetWarehousesResponse getWarehousesResponse4 = new OASGetWarehousesResponse();

        System.assert(getWarehousesResponse1.equals(getWarehousesResponse2));
        System.assert(getWarehousesResponse3.equals(getWarehousesResponse4));
        System.assertEquals(getWarehousesResponse1.hashCode(), getWarehousesResponse2.hashCode());
        System.assertEquals(getWarehousesResponse3.hashCode(), getWarehousesResponse4.hashCode());
    }
}
