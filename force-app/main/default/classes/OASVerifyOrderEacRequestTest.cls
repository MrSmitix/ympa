@isTest
private class OASVerifyOrderEacRequestTest {
    @isTest
    private static void equalsSameInstance() {
        OASVerifyOrderEacRequest verifyOrderEacRequest1 = OASVerifyOrderEacRequest.getExample();
        OASVerifyOrderEacRequest verifyOrderEacRequest2 = verifyOrderEacRequest1;
        OASVerifyOrderEacRequest verifyOrderEacRequest3 = new OASVerifyOrderEacRequest();
        OASVerifyOrderEacRequest verifyOrderEacRequest4 = verifyOrderEacRequest3;

        System.assert(verifyOrderEacRequest1.equals(verifyOrderEacRequest2));
        System.assert(verifyOrderEacRequest2.equals(verifyOrderEacRequest1));
        System.assert(verifyOrderEacRequest1.equals(verifyOrderEacRequest1));
        System.assert(verifyOrderEacRequest3.equals(verifyOrderEacRequest4));
        System.assert(verifyOrderEacRequest4.equals(verifyOrderEacRequest3));
        System.assert(verifyOrderEacRequest3.equals(verifyOrderEacRequest3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASVerifyOrderEacRequest verifyOrderEacRequest1 = OASVerifyOrderEacRequest.getExample();
        OASVerifyOrderEacRequest verifyOrderEacRequest2 = OASVerifyOrderEacRequest.getExample();
        OASVerifyOrderEacRequest verifyOrderEacRequest3 = new OASVerifyOrderEacRequest();
        OASVerifyOrderEacRequest verifyOrderEacRequest4 = new OASVerifyOrderEacRequest();

        System.assert(verifyOrderEacRequest1.equals(verifyOrderEacRequest2));
        System.assert(verifyOrderEacRequest2.equals(verifyOrderEacRequest1));
        System.assert(verifyOrderEacRequest3.equals(verifyOrderEacRequest4));
        System.assert(verifyOrderEacRequest4.equals(verifyOrderEacRequest3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASVerifyOrderEacRequest verifyOrderEacRequest1 = OASVerifyOrderEacRequest.getExample();
        OASVerifyOrderEacRequest verifyOrderEacRequest2 = new OASVerifyOrderEacRequest();

        System.assertEquals(false, verifyOrderEacRequest1.equals('foo'));
        System.assertEquals(false, verifyOrderEacRequest2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASVerifyOrderEacRequest verifyOrderEacRequest1 = OASVerifyOrderEacRequest.getExample();
        OASVerifyOrderEacRequest verifyOrderEacRequest2 = new OASVerifyOrderEacRequest();
        OASVerifyOrderEacRequest verifyOrderEacRequest3;

        System.assertEquals(false, verifyOrderEacRequest1.equals(verifyOrderEacRequest3));
        System.assertEquals(false, verifyOrderEacRequest2.equals(verifyOrderEacRequest3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASVerifyOrderEacRequest verifyOrderEacRequest1 = OASVerifyOrderEacRequest.getExample();
        OASVerifyOrderEacRequest verifyOrderEacRequest2 = new OASVerifyOrderEacRequest();

        System.assertEquals(verifyOrderEacRequest1.hashCode(), verifyOrderEacRequest1.hashCode());
        System.assertEquals(verifyOrderEacRequest2.hashCode(), verifyOrderEacRequest2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASVerifyOrderEacRequest verifyOrderEacRequest1 = OASVerifyOrderEacRequest.getExample();
        OASVerifyOrderEacRequest verifyOrderEacRequest2 = OASVerifyOrderEacRequest.getExample();
        OASVerifyOrderEacRequest verifyOrderEacRequest3 = new OASVerifyOrderEacRequest();
        OASVerifyOrderEacRequest verifyOrderEacRequest4 = new OASVerifyOrderEacRequest();

        System.assert(verifyOrderEacRequest1.equals(verifyOrderEacRequest2));
        System.assert(verifyOrderEacRequest3.equals(verifyOrderEacRequest4));
        System.assertEquals(verifyOrderEacRequest1.hashCode(), verifyOrderEacRequest2.hashCode());
        System.assertEquals(verifyOrderEacRequest3.hashCode(), verifyOrderEacRequest4.hashCode());
    }
}
