@isTest
private class OASGetOrderLabelsDataResponseTest {
    @isTest
    private static void equalsSameInstance() {
        OASGetOrderLabelsDataResponse getOrderLabelsDataResponse1 = OASGetOrderLabelsDataResponse.getExample();
        OASGetOrderLabelsDataResponse getOrderLabelsDataResponse2 = getOrderLabelsDataResponse1;
        OASGetOrderLabelsDataResponse getOrderLabelsDataResponse3 = new OASGetOrderLabelsDataResponse();
        OASGetOrderLabelsDataResponse getOrderLabelsDataResponse4 = getOrderLabelsDataResponse3;

        System.assert(getOrderLabelsDataResponse1.equals(getOrderLabelsDataResponse2));
        System.assert(getOrderLabelsDataResponse2.equals(getOrderLabelsDataResponse1));
        System.assert(getOrderLabelsDataResponse1.equals(getOrderLabelsDataResponse1));
        System.assert(getOrderLabelsDataResponse3.equals(getOrderLabelsDataResponse4));
        System.assert(getOrderLabelsDataResponse4.equals(getOrderLabelsDataResponse3));
        System.assert(getOrderLabelsDataResponse3.equals(getOrderLabelsDataResponse3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASGetOrderLabelsDataResponse getOrderLabelsDataResponse1 = OASGetOrderLabelsDataResponse.getExample();
        OASGetOrderLabelsDataResponse getOrderLabelsDataResponse2 = OASGetOrderLabelsDataResponse.getExample();
        OASGetOrderLabelsDataResponse getOrderLabelsDataResponse3 = new OASGetOrderLabelsDataResponse();
        OASGetOrderLabelsDataResponse getOrderLabelsDataResponse4 = new OASGetOrderLabelsDataResponse();

        System.assert(getOrderLabelsDataResponse1.equals(getOrderLabelsDataResponse2));
        System.assert(getOrderLabelsDataResponse2.equals(getOrderLabelsDataResponse1));
        System.assert(getOrderLabelsDataResponse3.equals(getOrderLabelsDataResponse4));
        System.assert(getOrderLabelsDataResponse4.equals(getOrderLabelsDataResponse3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASGetOrderLabelsDataResponse getOrderLabelsDataResponse1 = OASGetOrderLabelsDataResponse.getExample();
        OASGetOrderLabelsDataResponse getOrderLabelsDataResponse2 = new OASGetOrderLabelsDataResponse();

        System.assertEquals(false, getOrderLabelsDataResponse1.equals('foo'));
        System.assertEquals(false, getOrderLabelsDataResponse2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASGetOrderLabelsDataResponse getOrderLabelsDataResponse1 = OASGetOrderLabelsDataResponse.getExample();
        OASGetOrderLabelsDataResponse getOrderLabelsDataResponse2 = new OASGetOrderLabelsDataResponse();
        OASGetOrderLabelsDataResponse getOrderLabelsDataResponse3;

        System.assertEquals(false, getOrderLabelsDataResponse1.equals(getOrderLabelsDataResponse3));
        System.assertEquals(false, getOrderLabelsDataResponse2.equals(getOrderLabelsDataResponse3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASGetOrderLabelsDataResponse getOrderLabelsDataResponse1 = OASGetOrderLabelsDataResponse.getExample();
        OASGetOrderLabelsDataResponse getOrderLabelsDataResponse2 = new OASGetOrderLabelsDataResponse();

        System.assertEquals(getOrderLabelsDataResponse1.hashCode(), getOrderLabelsDataResponse1.hashCode());
        System.assertEquals(getOrderLabelsDataResponse2.hashCode(), getOrderLabelsDataResponse2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASGetOrderLabelsDataResponse getOrderLabelsDataResponse1 = OASGetOrderLabelsDataResponse.getExample();
        OASGetOrderLabelsDataResponse getOrderLabelsDataResponse2 = OASGetOrderLabelsDataResponse.getExample();
        OASGetOrderLabelsDataResponse getOrderLabelsDataResponse3 = new OASGetOrderLabelsDataResponse();
        OASGetOrderLabelsDataResponse getOrderLabelsDataResponse4 = new OASGetOrderLabelsDataResponse();

        System.assert(getOrderLabelsDataResponse1.equals(getOrderLabelsDataResponse2));
        System.assert(getOrderLabelsDataResponse3.equals(getOrderLabelsDataResponse4));
        System.assertEquals(getOrderLabelsDataResponse1.hashCode(), getOrderLabelsDataResponse2.hashCode());
        System.assertEquals(getOrderLabelsDataResponse3.hashCode(), getOrderLabelsDataResponse4.hashCode());
    }
}
