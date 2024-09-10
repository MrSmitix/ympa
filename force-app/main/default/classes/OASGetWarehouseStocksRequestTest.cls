@isTest
private class OASGetWarehouseStocksRequestTest {
    @isTest
    private static void equalsSameInstance() {
        OASGetWarehouseStocksRequest getWarehouseStocksRequest1 = OASGetWarehouseStocksRequest.getExample();
        OASGetWarehouseStocksRequest getWarehouseStocksRequest2 = getWarehouseStocksRequest1;
        OASGetWarehouseStocksRequest getWarehouseStocksRequest3 = new OASGetWarehouseStocksRequest();
        OASGetWarehouseStocksRequest getWarehouseStocksRequest4 = getWarehouseStocksRequest3;

        System.assert(getWarehouseStocksRequest1.equals(getWarehouseStocksRequest2));
        System.assert(getWarehouseStocksRequest2.equals(getWarehouseStocksRequest1));
        System.assert(getWarehouseStocksRequest1.equals(getWarehouseStocksRequest1));
        System.assert(getWarehouseStocksRequest3.equals(getWarehouseStocksRequest4));
        System.assert(getWarehouseStocksRequest4.equals(getWarehouseStocksRequest3));
        System.assert(getWarehouseStocksRequest3.equals(getWarehouseStocksRequest3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASGetWarehouseStocksRequest getWarehouseStocksRequest1 = OASGetWarehouseStocksRequest.getExample();
        OASGetWarehouseStocksRequest getWarehouseStocksRequest2 = OASGetWarehouseStocksRequest.getExample();
        OASGetWarehouseStocksRequest getWarehouseStocksRequest3 = new OASGetWarehouseStocksRequest();
        OASGetWarehouseStocksRequest getWarehouseStocksRequest4 = new OASGetWarehouseStocksRequest();

        System.assert(getWarehouseStocksRequest1.equals(getWarehouseStocksRequest2));
        System.assert(getWarehouseStocksRequest2.equals(getWarehouseStocksRequest1));
        System.assert(getWarehouseStocksRequest3.equals(getWarehouseStocksRequest4));
        System.assert(getWarehouseStocksRequest4.equals(getWarehouseStocksRequest3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASGetWarehouseStocksRequest getWarehouseStocksRequest1 = OASGetWarehouseStocksRequest.getExample();
        OASGetWarehouseStocksRequest getWarehouseStocksRequest2 = new OASGetWarehouseStocksRequest();

        System.assertEquals(false, getWarehouseStocksRequest1.equals('foo'));
        System.assertEquals(false, getWarehouseStocksRequest2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASGetWarehouseStocksRequest getWarehouseStocksRequest1 = OASGetWarehouseStocksRequest.getExample();
        OASGetWarehouseStocksRequest getWarehouseStocksRequest2 = new OASGetWarehouseStocksRequest();
        OASGetWarehouseStocksRequest getWarehouseStocksRequest3;

        System.assertEquals(false, getWarehouseStocksRequest1.equals(getWarehouseStocksRequest3));
        System.assertEquals(false, getWarehouseStocksRequest2.equals(getWarehouseStocksRequest3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASGetWarehouseStocksRequest getWarehouseStocksRequest1 = OASGetWarehouseStocksRequest.getExample();
        OASGetWarehouseStocksRequest getWarehouseStocksRequest2 = new OASGetWarehouseStocksRequest();

        System.assertEquals(getWarehouseStocksRequest1.hashCode(), getWarehouseStocksRequest1.hashCode());
        System.assertEquals(getWarehouseStocksRequest2.hashCode(), getWarehouseStocksRequest2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASGetWarehouseStocksRequest getWarehouseStocksRequest1 = OASGetWarehouseStocksRequest.getExample();
        OASGetWarehouseStocksRequest getWarehouseStocksRequest2 = OASGetWarehouseStocksRequest.getExample();
        OASGetWarehouseStocksRequest getWarehouseStocksRequest3 = new OASGetWarehouseStocksRequest();
        OASGetWarehouseStocksRequest getWarehouseStocksRequest4 = new OASGetWarehouseStocksRequest();

        System.assert(getWarehouseStocksRequest1.equals(getWarehouseStocksRequest2));
        System.assert(getWarehouseStocksRequest3.equals(getWarehouseStocksRequest4));
        System.assertEquals(getWarehouseStocksRequest1.hashCode(), getWarehouseStocksRequest2.hashCode());
        System.assertEquals(getWarehouseStocksRequest3.hashCode(), getWarehouseStocksRequest4.hashCode());
    }

    @isTest
    private static void defaultValuesPopulated() {
        OASGetWarehouseStocksRequest getWarehouseStocksRequest = new OASGetWarehouseStocksRequest();
        System.assertEquals(false, getWarehouseStocksRequest.withTurnover);
        System.assertEquals(new List<String>(), getWarehouseStocksRequest.offerIds);
        System.assertEquals(null, getWarehouseStocksRequest.archived);
    }
}
