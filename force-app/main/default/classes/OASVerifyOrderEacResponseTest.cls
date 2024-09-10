@isTest
private class OASVerifyOrderEacResponseTest {
    @isTest
    private static void equalsSameInstance() {
        OASVerifyOrderEacResponse verifyOrderEacResponse1 = OASVerifyOrderEacResponse.getExample();
        OASVerifyOrderEacResponse verifyOrderEacResponse2 = verifyOrderEacResponse1;
        OASVerifyOrderEacResponse verifyOrderEacResponse3 = new OASVerifyOrderEacResponse();
        OASVerifyOrderEacResponse verifyOrderEacResponse4 = verifyOrderEacResponse3;

        System.assert(verifyOrderEacResponse1.equals(verifyOrderEacResponse2));
        System.assert(verifyOrderEacResponse2.equals(verifyOrderEacResponse1));
        System.assert(verifyOrderEacResponse1.equals(verifyOrderEacResponse1));
        System.assert(verifyOrderEacResponse3.equals(verifyOrderEacResponse4));
        System.assert(verifyOrderEacResponse4.equals(verifyOrderEacResponse3));
        System.assert(verifyOrderEacResponse3.equals(verifyOrderEacResponse3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASVerifyOrderEacResponse verifyOrderEacResponse1 = OASVerifyOrderEacResponse.getExample();
        OASVerifyOrderEacResponse verifyOrderEacResponse2 = OASVerifyOrderEacResponse.getExample();
        OASVerifyOrderEacResponse verifyOrderEacResponse3 = new OASVerifyOrderEacResponse();
        OASVerifyOrderEacResponse verifyOrderEacResponse4 = new OASVerifyOrderEacResponse();

        System.assert(verifyOrderEacResponse1.equals(verifyOrderEacResponse2));
        System.assert(verifyOrderEacResponse2.equals(verifyOrderEacResponse1));
        System.assert(verifyOrderEacResponse3.equals(verifyOrderEacResponse4));
        System.assert(verifyOrderEacResponse4.equals(verifyOrderEacResponse3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASVerifyOrderEacResponse verifyOrderEacResponse1 = OASVerifyOrderEacResponse.getExample();
        OASVerifyOrderEacResponse verifyOrderEacResponse2 = new OASVerifyOrderEacResponse();

        System.assertEquals(false, verifyOrderEacResponse1.equals('foo'));
        System.assertEquals(false, verifyOrderEacResponse2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASVerifyOrderEacResponse verifyOrderEacResponse1 = OASVerifyOrderEacResponse.getExample();
        OASVerifyOrderEacResponse verifyOrderEacResponse2 = new OASVerifyOrderEacResponse();
        OASVerifyOrderEacResponse verifyOrderEacResponse3;

        System.assertEquals(false, verifyOrderEacResponse1.equals(verifyOrderEacResponse3));
        System.assertEquals(false, verifyOrderEacResponse2.equals(verifyOrderEacResponse3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASVerifyOrderEacResponse verifyOrderEacResponse1 = OASVerifyOrderEacResponse.getExample();
        OASVerifyOrderEacResponse verifyOrderEacResponse2 = new OASVerifyOrderEacResponse();

        System.assertEquals(verifyOrderEacResponse1.hashCode(), verifyOrderEacResponse1.hashCode());
        System.assertEquals(verifyOrderEacResponse2.hashCode(), verifyOrderEacResponse2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASVerifyOrderEacResponse verifyOrderEacResponse1 = OASVerifyOrderEacResponse.getExample();
        OASVerifyOrderEacResponse verifyOrderEacResponse2 = OASVerifyOrderEacResponse.getExample();
        OASVerifyOrderEacResponse verifyOrderEacResponse3 = new OASVerifyOrderEacResponse();
        OASVerifyOrderEacResponse verifyOrderEacResponse4 = new OASVerifyOrderEacResponse();

        System.assert(verifyOrderEacResponse1.equals(verifyOrderEacResponse2));
        System.assert(verifyOrderEacResponse3.equals(verifyOrderEacResponse4));
        System.assertEquals(verifyOrderEacResponse1.hashCode(), verifyOrderEacResponse2.hashCode());
        System.assertEquals(verifyOrderEacResponse3.hashCode(), verifyOrderEacResponse4.hashCode());
    }
}
