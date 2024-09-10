@isTest
private class OASGetDeliveryServicesResponseTest {
    @isTest
    private static void equalsSameInstance() {
        OASGetDeliveryServicesResponse getDeliveryServicesResponse1 = OASGetDeliveryServicesResponse.getExample();
        OASGetDeliveryServicesResponse getDeliveryServicesResponse2 = getDeliveryServicesResponse1;
        OASGetDeliveryServicesResponse getDeliveryServicesResponse3 = new OASGetDeliveryServicesResponse();
        OASGetDeliveryServicesResponse getDeliveryServicesResponse4 = getDeliveryServicesResponse3;

        System.assert(getDeliveryServicesResponse1.equals(getDeliveryServicesResponse2));
        System.assert(getDeliveryServicesResponse2.equals(getDeliveryServicesResponse1));
        System.assert(getDeliveryServicesResponse1.equals(getDeliveryServicesResponse1));
        System.assert(getDeliveryServicesResponse3.equals(getDeliveryServicesResponse4));
        System.assert(getDeliveryServicesResponse4.equals(getDeliveryServicesResponse3));
        System.assert(getDeliveryServicesResponse3.equals(getDeliveryServicesResponse3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASGetDeliveryServicesResponse getDeliveryServicesResponse1 = OASGetDeliveryServicesResponse.getExample();
        OASGetDeliveryServicesResponse getDeliveryServicesResponse2 = OASGetDeliveryServicesResponse.getExample();
        OASGetDeliveryServicesResponse getDeliveryServicesResponse3 = new OASGetDeliveryServicesResponse();
        OASGetDeliveryServicesResponse getDeliveryServicesResponse4 = new OASGetDeliveryServicesResponse();

        System.assert(getDeliveryServicesResponse1.equals(getDeliveryServicesResponse2));
        System.assert(getDeliveryServicesResponse2.equals(getDeliveryServicesResponse1));
        System.assert(getDeliveryServicesResponse3.equals(getDeliveryServicesResponse4));
        System.assert(getDeliveryServicesResponse4.equals(getDeliveryServicesResponse3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASGetDeliveryServicesResponse getDeliveryServicesResponse1 = OASGetDeliveryServicesResponse.getExample();
        OASGetDeliveryServicesResponse getDeliveryServicesResponse2 = new OASGetDeliveryServicesResponse();

        System.assertEquals(false, getDeliveryServicesResponse1.equals('foo'));
        System.assertEquals(false, getDeliveryServicesResponse2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASGetDeliveryServicesResponse getDeliveryServicesResponse1 = OASGetDeliveryServicesResponse.getExample();
        OASGetDeliveryServicesResponse getDeliveryServicesResponse2 = new OASGetDeliveryServicesResponse();
        OASGetDeliveryServicesResponse getDeliveryServicesResponse3;

        System.assertEquals(false, getDeliveryServicesResponse1.equals(getDeliveryServicesResponse3));
        System.assertEquals(false, getDeliveryServicesResponse2.equals(getDeliveryServicesResponse3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASGetDeliveryServicesResponse getDeliveryServicesResponse1 = OASGetDeliveryServicesResponse.getExample();
        OASGetDeliveryServicesResponse getDeliveryServicesResponse2 = new OASGetDeliveryServicesResponse();

        System.assertEquals(getDeliveryServicesResponse1.hashCode(), getDeliveryServicesResponse1.hashCode());
        System.assertEquals(getDeliveryServicesResponse2.hashCode(), getDeliveryServicesResponse2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASGetDeliveryServicesResponse getDeliveryServicesResponse1 = OASGetDeliveryServicesResponse.getExample();
        OASGetDeliveryServicesResponse getDeliveryServicesResponse2 = OASGetDeliveryServicesResponse.getExample();
        OASGetDeliveryServicesResponse getDeliveryServicesResponse3 = new OASGetDeliveryServicesResponse();
        OASGetDeliveryServicesResponse getDeliveryServicesResponse4 = new OASGetDeliveryServicesResponse();

        System.assert(getDeliveryServicesResponse1.equals(getDeliveryServicesResponse2));
        System.assert(getDeliveryServicesResponse3.equals(getDeliveryServicesResponse4));
        System.assertEquals(getDeliveryServicesResponse1.hashCode(), getDeliveryServicesResponse2.hashCode());
        System.assertEquals(getDeliveryServicesResponse3.hashCode(), getDeliveryServicesResponse4.hashCode());
    }
}
