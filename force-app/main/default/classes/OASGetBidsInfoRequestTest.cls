@isTest
private class OASGetBidsInfoRequestTest {
    @isTest
    private static void equalsSameInstance() {
        OASGetBidsInfoRequest getBidsInfoRequest1 = OASGetBidsInfoRequest.getExample();
        OASGetBidsInfoRequest getBidsInfoRequest2 = getBidsInfoRequest1;
        OASGetBidsInfoRequest getBidsInfoRequest3 = new OASGetBidsInfoRequest();
        OASGetBidsInfoRequest getBidsInfoRequest4 = getBidsInfoRequest3;

        System.assert(getBidsInfoRequest1.equals(getBidsInfoRequest2));
        System.assert(getBidsInfoRequest2.equals(getBidsInfoRequest1));
        System.assert(getBidsInfoRequest1.equals(getBidsInfoRequest1));
        System.assert(getBidsInfoRequest3.equals(getBidsInfoRequest4));
        System.assert(getBidsInfoRequest4.equals(getBidsInfoRequest3));
        System.assert(getBidsInfoRequest3.equals(getBidsInfoRequest3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASGetBidsInfoRequest getBidsInfoRequest1 = OASGetBidsInfoRequest.getExample();
        OASGetBidsInfoRequest getBidsInfoRequest2 = OASGetBidsInfoRequest.getExample();
        OASGetBidsInfoRequest getBidsInfoRequest3 = new OASGetBidsInfoRequest();
        OASGetBidsInfoRequest getBidsInfoRequest4 = new OASGetBidsInfoRequest();

        System.assert(getBidsInfoRequest1.equals(getBidsInfoRequest2));
        System.assert(getBidsInfoRequest2.equals(getBidsInfoRequest1));
        System.assert(getBidsInfoRequest3.equals(getBidsInfoRequest4));
        System.assert(getBidsInfoRequest4.equals(getBidsInfoRequest3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASGetBidsInfoRequest getBidsInfoRequest1 = OASGetBidsInfoRequest.getExample();
        OASGetBidsInfoRequest getBidsInfoRequest2 = new OASGetBidsInfoRequest();

        System.assertEquals(false, getBidsInfoRequest1.equals('foo'));
        System.assertEquals(false, getBidsInfoRequest2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASGetBidsInfoRequest getBidsInfoRequest1 = OASGetBidsInfoRequest.getExample();
        OASGetBidsInfoRequest getBidsInfoRequest2 = new OASGetBidsInfoRequest();
        OASGetBidsInfoRequest getBidsInfoRequest3;

        System.assertEquals(false, getBidsInfoRequest1.equals(getBidsInfoRequest3));
        System.assertEquals(false, getBidsInfoRequest2.equals(getBidsInfoRequest3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASGetBidsInfoRequest getBidsInfoRequest1 = OASGetBidsInfoRequest.getExample();
        OASGetBidsInfoRequest getBidsInfoRequest2 = new OASGetBidsInfoRequest();

        System.assertEquals(getBidsInfoRequest1.hashCode(), getBidsInfoRequest1.hashCode());
        System.assertEquals(getBidsInfoRequest2.hashCode(), getBidsInfoRequest2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASGetBidsInfoRequest getBidsInfoRequest1 = OASGetBidsInfoRequest.getExample();
        OASGetBidsInfoRequest getBidsInfoRequest2 = OASGetBidsInfoRequest.getExample();
        OASGetBidsInfoRequest getBidsInfoRequest3 = new OASGetBidsInfoRequest();
        OASGetBidsInfoRequest getBidsInfoRequest4 = new OASGetBidsInfoRequest();

        System.assert(getBidsInfoRequest1.equals(getBidsInfoRequest2));
        System.assert(getBidsInfoRequest3.equals(getBidsInfoRequest4));
        System.assertEquals(getBidsInfoRequest1.hashCode(), getBidsInfoRequest2.hashCode());
        System.assertEquals(getBidsInfoRequest3.hashCode(), getBidsInfoRequest4.hashCode());
    }

    @isTest
    private static void defaultValuesPopulated() {
        OASGetBidsInfoRequest getBidsInfoRequest = new OASGetBidsInfoRequest();
        System.assertEquals(new List<String>(), getBidsInfoRequest.skus);
    }
}
