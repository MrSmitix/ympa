@isTest
private class OASPutSkuBidsRequestTest {
    @isTest
    private static void equalsSameInstance() {
        OASPutSkuBidsRequest putSkuBidsRequest1 = OASPutSkuBidsRequest.getExample();
        OASPutSkuBidsRequest putSkuBidsRequest2 = putSkuBidsRequest1;
        OASPutSkuBidsRequest putSkuBidsRequest3 = new OASPutSkuBidsRequest();
        OASPutSkuBidsRequest putSkuBidsRequest4 = putSkuBidsRequest3;

        System.assert(putSkuBidsRequest1.equals(putSkuBidsRequest2));
        System.assert(putSkuBidsRequest2.equals(putSkuBidsRequest1));
        System.assert(putSkuBidsRequest1.equals(putSkuBidsRequest1));
        System.assert(putSkuBidsRequest3.equals(putSkuBidsRequest4));
        System.assert(putSkuBidsRequest4.equals(putSkuBidsRequest3));
        System.assert(putSkuBidsRequest3.equals(putSkuBidsRequest3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASPutSkuBidsRequest putSkuBidsRequest1 = OASPutSkuBidsRequest.getExample();
        OASPutSkuBidsRequest putSkuBidsRequest2 = OASPutSkuBidsRequest.getExample();
        OASPutSkuBidsRequest putSkuBidsRequest3 = new OASPutSkuBidsRequest();
        OASPutSkuBidsRequest putSkuBidsRequest4 = new OASPutSkuBidsRequest();

        System.assert(putSkuBidsRequest1.equals(putSkuBidsRequest2));
        System.assert(putSkuBidsRequest2.equals(putSkuBidsRequest1));
        System.assert(putSkuBidsRequest3.equals(putSkuBidsRequest4));
        System.assert(putSkuBidsRequest4.equals(putSkuBidsRequest3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASPutSkuBidsRequest putSkuBidsRequest1 = OASPutSkuBidsRequest.getExample();
        OASPutSkuBidsRequest putSkuBidsRequest2 = new OASPutSkuBidsRequest();

        System.assertEquals(false, putSkuBidsRequest1.equals('foo'));
        System.assertEquals(false, putSkuBidsRequest2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASPutSkuBidsRequest putSkuBidsRequest1 = OASPutSkuBidsRequest.getExample();
        OASPutSkuBidsRequest putSkuBidsRequest2 = new OASPutSkuBidsRequest();
        OASPutSkuBidsRequest putSkuBidsRequest3;

        System.assertEquals(false, putSkuBidsRequest1.equals(putSkuBidsRequest3));
        System.assertEquals(false, putSkuBidsRequest2.equals(putSkuBidsRequest3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASPutSkuBidsRequest putSkuBidsRequest1 = OASPutSkuBidsRequest.getExample();
        OASPutSkuBidsRequest putSkuBidsRequest2 = new OASPutSkuBidsRequest();

        System.assertEquals(putSkuBidsRequest1.hashCode(), putSkuBidsRequest1.hashCode());
        System.assertEquals(putSkuBidsRequest2.hashCode(), putSkuBidsRequest2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASPutSkuBidsRequest putSkuBidsRequest1 = OASPutSkuBidsRequest.getExample();
        OASPutSkuBidsRequest putSkuBidsRequest2 = OASPutSkuBidsRequest.getExample();
        OASPutSkuBidsRequest putSkuBidsRequest3 = new OASPutSkuBidsRequest();
        OASPutSkuBidsRequest putSkuBidsRequest4 = new OASPutSkuBidsRequest();

        System.assert(putSkuBidsRequest1.equals(putSkuBidsRequest2));
        System.assert(putSkuBidsRequest3.equals(putSkuBidsRequest4));
        System.assertEquals(putSkuBidsRequest1.hashCode(), putSkuBidsRequest2.hashCode());
        System.assertEquals(putSkuBidsRequest3.hashCode(), putSkuBidsRequest4.hashCode());
    }

    @isTest
    private static void defaultValuesPopulated() {
        OASPutSkuBidsRequest putSkuBidsRequest = new OASPutSkuBidsRequest();
        System.assertEquals(new List<OASSkuBidItemDTO>(), putSkuBidsRequest.bids);
    }
}
