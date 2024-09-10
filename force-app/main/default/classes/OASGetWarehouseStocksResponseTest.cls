@isTest
private class OASGetWarehouseStocksResponseTest {
    @isTest
    private static void equalsSameInstance() {
        OASGetWarehouseStocksResponse getWarehouseStocksResponse1 = OASGetWarehouseStocksResponse.getExample();
        OASGetWarehouseStocksResponse getWarehouseStocksResponse2 = getWarehouseStocksResponse1;
        OASGetWarehouseStocksResponse getWarehouseStocksResponse3 = new OASGetWarehouseStocksResponse();
        OASGetWarehouseStocksResponse getWarehouseStocksResponse4 = getWarehouseStocksResponse3;

        System.assert(getWarehouseStocksResponse1.equals(getWarehouseStocksResponse2));
        System.assert(getWarehouseStocksResponse2.equals(getWarehouseStocksResponse1));
        System.assert(getWarehouseStocksResponse1.equals(getWarehouseStocksResponse1));
        System.assert(getWarehouseStocksResponse3.equals(getWarehouseStocksResponse4));
        System.assert(getWarehouseStocksResponse4.equals(getWarehouseStocksResponse3));
        System.assert(getWarehouseStocksResponse3.equals(getWarehouseStocksResponse3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASGetWarehouseStocksResponse getWarehouseStocksResponse1 = OASGetWarehouseStocksResponse.getExample();
        OASGetWarehouseStocksResponse getWarehouseStocksResponse2 = OASGetWarehouseStocksResponse.getExample();
        OASGetWarehouseStocksResponse getWarehouseStocksResponse3 = new OASGetWarehouseStocksResponse();
        OASGetWarehouseStocksResponse getWarehouseStocksResponse4 = new OASGetWarehouseStocksResponse();

        System.assert(getWarehouseStocksResponse1.equals(getWarehouseStocksResponse2));
        System.assert(getWarehouseStocksResponse2.equals(getWarehouseStocksResponse1));
        System.assert(getWarehouseStocksResponse3.equals(getWarehouseStocksResponse4));
        System.assert(getWarehouseStocksResponse4.equals(getWarehouseStocksResponse3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASGetWarehouseStocksResponse getWarehouseStocksResponse1 = OASGetWarehouseStocksResponse.getExample();
        OASGetWarehouseStocksResponse getWarehouseStocksResponse2 = new OASGetWarehouseStocksResponse();

        System.assertEquals(false, getWarehouseStocksResponse1.equals('foo'));
        System.assertEquals(false, getWarehouseStocksResponse2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASGetWarehouseStocksResponse getWarehouseStocksResponse1 = OASGetWarehouseStocksResponse.getExample();
        OASGetWarehouseStocksResponse getWarehouseStocksResponse2 = new OASGetWarehouseStocksResponse();
        OASGetWarehouseStocksResponse getWarehouseStocksResponse3;

        System.assertEquals(false, getWarehouseStocksResponse1.equals(getWarehouseStocksResponse3));
        System.assertEquals(false, getWarehouseStocksResponse2.equals(getWarehouseStocksResponse3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASGetWarehouseStocksResponse getWarehouseStocksResponse1 = OASGetWarehouseStocksResponse.getExample();
        OASGetWarehouseStocksResponse getWarehouseStocksResponse2 = new OASGetWarehouseStocksResponse();

        System.assertEquals(getWarehouseStocksResponse1.hashCode(), getWarehouseStocksResponse1.hashCode());
        System.assertEquals(getWarehouseStocksResponse2.hashCode(), getWarehouseStocksResponse2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASGetWarehouseStocksResponse getWarehouseStocksResponse1 = OASGetWarehouseStocksResponse.getExample();
        OASGetWarehouseStocksResponse getWarehouseStocksResponse2 = OASGetWarehouseStocksResponse.getExample();
        OASGetWarehouseStocksResponse getWarehouseStocksResponse3 = new OASGetWarehouseStocksResponse();
        OASGetWarehouseStocksResponse getWarehouseStocksResponse4 = new OASGetWarehouseStocksResponse();

        System.assert(getWarehouseStocksResponse1.equals(getWarehouseStocksResponse2));
        System.assert(getWarehouseStocksResponse3.equals(getWarehouseStocksResponse4));
        System.assertEquals(getWarehouseStocksResponse1.hashCode(), getWarehouseStocksResponse2.hashCode());
        System.assertEquals(getWarehouseStocksResponse3.hashCode(), getWarehouseStocksResponse4.hashCode());
    }
}
