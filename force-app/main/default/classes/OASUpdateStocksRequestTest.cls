@isTest
private class OASUpdateStocksRequestTest {
    @isTest
    private static void equalsSameInstance() {
        OASUpdateStocksRequest updateStocksRequest1 = OASUpdateStocksRequest.getExample();
        OASUpdateStocksRequest updateStocksRequest2 = updateStocksRequest1;
        OASUpdateStocksRequest updateStocksRequest3 = new OASUpdateStocksRequest();
        OASUpdateStocksRequest updateStocksRequest4 = updateStocksRequest3;

        System.assert(updateStocksRequest1.equals(updateStocksRequest2));
        System.assert(updateStocksRequest2.equals(updateStocksRequest1));
        System.assert(updateStocksRequest1.equals(updateStocksRequest1));
        System.assert(updateStocksRequest3.equals(updateStocksRequest4));
        System.assert(updateStocksRequest4.equals(updateStocksRequest3));
        System.assert(updateStocksRequest3.equals(updateStocksRequest3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASUpdateStocksRequest updateStocksRequest1 = OASUpdateStocksRequest.getExample();
        OASUpdateStocksRequest updateStocksRequest2 = OASUpdateStocksRequest.getExample();
        OASUpdateStocksRequest updateStocksRequest3 = new OASUpdateStocksRequest();
        OASUpdateStocksRequest updateStocksRequest4 = new OASUpdateStocksRequest();

        System.assert(updateStocksRequest1.equals(updateStocksRequest2));
        System.assert(updateStocksRequest2.equals(updateStocksRequest1));
        System.assert(updateStocksRequest3.equals(updateStocksRequest4));
        System.assert(updateStocksRequest4.equals(updateStocksRequest3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASUpdateStocksRequest updateStocksRequest1 = OASUpdateStocksRequest.getExample();
        OASUpdateStocksRequest updateStocksRequest2 = new OASUpdateStocksRequest();

        System.assertEquals(false, updateStocksRequest1.equals('foo'));
        System.assertEquals(false, updateStocksRequest2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASUpdateStocksRequest updateStocksRequest1 = OASUpdateStocksRequest.getExample();
        OASUpdateStocksRequest updateStocksRequest2 = new OASUpdateStocksRequest();
        OASUpdateStocksRequest updateStocksRequest3;

        System.assertEquals(false, updateStocksRequest1.equals(updateStocksRequest3));
        System.assertEquals(false, updateStocksRequest2.equals(updateStocksRequest3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASUpdateStocksRequest updateStocksRequest1 = OASUpdateStocksRequest.getExample();
        OASUpdateStocksRequest updateStocksRequest2 = new OASUpdateStocksRequest();

        System.assertEquals(updateStocksRequest1.hashCode(), updateStocksRequest1.hashCode());
        System.assertEquals(updateStocksRequest2.hashCode(), updateStocksRequest2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASUpdateStocksRequest updateStocksRequest1 = OASUpdateStocksRequest.getExample();
        OASUpdateStocksRequest updateStocksRequest2 = OASUpdateStocksRequest.getExample();
        OASUpdateStocksRequest updateStocksRequest3 = new OASUpdateStocksRequest();
        OASUpdateStocksRequest updateStocksRequest4 = new OASUpdateStocksRequest();

        System.assert(updateStocksRequest1.equals(updateStocksRequest2));
        System.assert(updateStocksRequest3.equals(updateStocksRequest4));
        System.assertEquals(updateStocksRequest1.hashCode(), updateStocksRequest2.hashCode());
        System.assertEquals(updateStocksRequest3.hashCode(), updateStocksRequest4.hashCode());
    }

    @isTest
    private static void defaultValuesPopulated() {
        OASUpdateStocksRequest updateStocksRequest = new OASUpdateStocksRequest();
        System.assertEquals(new List<OASUpdateStockDTO>(), updateStocksRequest.skus);
    }
}
