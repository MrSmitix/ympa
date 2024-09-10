@isTest
private class OASGetGoodsFeedbackResponseTest {
    @isTest
    private static void equalsSameInstance() {
        OASGetGoodsFeedbackResponse getGoodsFeedbackResponse1 = OASGetGoodsFeedbackResponse.getExample();
        OASGetGoodsFeedbackResponse getGoodsFeedbackResponse2 = getGoodsFeedbackResponse1;
        OASGetGoodsFeedbackResponse getGoodsFeedbackResponse3 = new OASGetGoodsFeedbackResponse();
        OASGetGoodsFeedbackResponse getGoodsFeedbackResponse4 = getGoodsFeedbackResponse3;

        System.assert(getGoodsFeedbackResponse1.equals(getGoodsFeedbackResponse2));
        System.assert(getGoodsFeedbackResponse2.equals(getGoodsFeedbackResponse1));
        System.assert(getGoodsFeedbackResponse1.equals(getGoodsFeedbackResponse1));
        System.assert(getGoodsFeedbackResponse3.equals(getGoodsFeedbackResponse4));
        System.assert(getGoodsFeedbackResponse4.equals(getGoodsFeedbackResponse3));
        System.assert(getGoodsFeedbackResponse3.equals(getGoodsFeedbackResponse3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASGetGoodsFeedbackResponse getGoodsFeedbackResponse1 = OASGetGoodsFeedbackResponse.getExample();
        OASGetGoodsFeedbackResponse getGoodsFeedbackResponse2 = OASGetGoodsFeedbackResponse.getExample();
        OASGetGoodsFeedbackResponse getGoodsFeedbackResponse3 = new OASGetGoodsFeedbackResponse();
        OASGetGoodsFeedbackResponse getGoodsFeedbackResponse4 = new OASGetGoodsFeedbackResponse();

        System.assert(getGoodsFeedbackResponse1.equals(getGoodsFeedbackResponse2));
        System.assert(getGoodsFeedbackResponse2.equals(getGoodsFeedbackResponse1));
        System.assert(getGoodsFeedbackResponse3.equals(getGoodsFeedbackResponse4));
        System.assert(getGoodsFeedbackResponse4.equals(getGoodsFeedbackResponse3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASGetGoodsFeedbackResponse getGoodsFeedbackResponse1 = OASGetGoodsFeedbackResponse.getExample();
        OASGetGoodsFeedbackResponse getGoodsFeedbackResponse2 = new OASGetGoodsFeedbackResponse();

        System.assertEquals(false, getGoodsFeedbackResponse1.equals('foo'));
        System.assertEquals(false, getGoodsFeedbackResponse2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASGetGoodsFeedbackResponse getGoodsFeedbackResponse1 = OASGetGoodsFeedbackResponse.getExample();
        OASGetGoodsFeedbackResponse getGoodsFeedbackResponse2 = new OASGetGoodsFeedbackResponse();
        OASGetGoodsFeedbackResponse getGoodsFeedbackResponse3;

        System.assertEquals(false, getGoodsFeedbackResponse1.equals(getGoodsFeedbackResponse3));
        System.assertEquals(false, getGoodsFeedbackResponse2.equals(getGoodsFeedbackResponse3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASGetGoodsFeedbackResponse getGoodsFeedbackResponse1 = OASGetGoodsFeedbackResponse.getExample();
        OASGetGoodsFeedbackResponse getGoodsFeedbackResponse2 = new OASGetGoodsFeedbackResponse();

        System.assertEquals(getGoodsFeedbackResponse1.hashCode(), getGoodsFeedbackResponse1.hashCode());
        System.assertEquals(getGoodsFeedbackResponse2.hashCode(), getGoodsFeedbackResponse2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASGetGoodsFeedbackResponse getGoodsFeedbackResponse1 = OASGetGoodsFeedbackResponse.getExample();
        OASGetGoodsFeedbackResponse getGoodsFeedbackResponse2 = OASGetGoodsFeedbackResponse.getExample();
        OASGetGoodsFeedbackResponse getGoodsFeedbackResponse3 = new OASGetGoodsFeedbackResponse();
        OASGetGoodsFeedbackResponse getGoodsFeedbackResponse4 = new OASGetGoodsFeedbackResponse();

        System.assert(getGoodsFeedbackResponse1.equals(getGoodsFeedbackResponse2));
        System.assert(getGoodsFeedbackResponse3.equals(getGoodsFeedbackResponse4));
        System.assertEquals(getGoodsFeedbackResponse1.hashCode(), getGoodsFeedbackResponse2.hashCode());
        System.assertEquals(getGoodsFeedbackResponse3.hashCode(), getGoodsFeedbackResponse4.hashCode());
    }
}
