@isTest
private class OASGetShipmentResponseTest {
    @isTest
    private static void equalsSameInstance() {
        OASGetShipmentResponse getShipmentResponse1 = OASGetShipmentResponse.getExample();
        OASGetShipmentResponse getShipmentResponse2 = getShipmentResponse1;
        OASGetShipmentResponse getShipmentResponse3 = new OASGetShipmentResponse();
        OASGetShipmentResponse getShipmentResponse4 = getShipmentResponse3;

        System.assert(getShipmentResponse1.equals(getShipmentResponse2));
        System.assert(getShipmentResponse2.equals(getShipmentResponse1));
        System.assert(getShipmentResponse1.equals(getShipmentResponse1));
        System.assert(getShipmentResponse3.equals(getShipmentResponse4));
        System.assert(getShipmentResponse4.equals(getShipmentResponse3));
        System.assert(getShipmentResponse3.equals(getShipmentResponse3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASGetShipmentResponse getShipmentResponse1 = OASGetShipmentResponse.getExample();
        OASGetShipmentResponse getShipmentResponse2 = OASGetShipmentResponse.getExample();
        OASGetShipmentResponse getShipmentResponse3 = new OASGetShipmentResponse();
        OASGetShipmentResponse getShipmentResponse4 = new OASGetShipmentResponse();

        System.assert(getShipmentResponse1.equals(getShipmentResponse2));
        System.assert(getShipmentResponse2.equals(getShipmentResponse1));
        System.assert(getShipmentResponse3.equals(getShipmentResponse4));
        System.assert(getShipmentResponse4.equals(getShipmentResponse3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASGetShipmentResponse getShipmentResponse1 = OASGetShipmentResponse.getExample();
        OASGetShipmentResponse getShipmentResponse2 = new OASGetShipmentResponse();

        System.assertEquals(false, getShipmentResponse1.equals('foo'));
        System.assertEquals(false, getShipmentResponse2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASGetShipmentResponse getShipmentResponse1 = OASGetShipmentResponse.getExample();
        OASGetShipmentResponse getShipmentResponse2 = new OASGetShipmentResponse();
        OASGetShipmentResponse getShipmentResponse3;

        System.assertEquals(false, getShipmentResponse1.equals(getShipmentResponse3));
        System.assertEquals(false, getShipmentResponse2.equals(getShipmentResponse3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASGetShipmentResponse getShipmentResponse1 = OASGetShipmentResponse.getExample();
        OASGetShipmentResponse getShipmentResponse2 = new OASGetShipmentResponse();

        System.assertEquals(getShipmentResponse1.hashCode(), getShipmentResponse1.hashCode());
        System.assertEquals(getShipmentResponse2.hashCode(), getShipmentResponse2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASGetShipmentResponse getShipmentResponse1 = OASGetShipmentResponse.getExample();
        OASGetShipmentResponse getShipmentResponse2 = OASGetShipmentResponse.getExample();
        OASGetShipmentResponse getShipmentResponse3 = new OASGetShipmentResponse();
        OASGetShipmentResponse getShipmentResponse4 = new OASGetShipmentResponse();

        System.assert(getShipmentResponse1.equals(getShipmentResponse2));
        System.assert(getShipmentResponse3.equals(getShipmentResponse4));
        System.assertEquals(getShipmentResponse1.hashCode(), getShipmentResponse2.hashCode());
        System.assertEquals(getShipmentResponse3.hashCode(), getShipmentResponse4.hashCode());
    }
}
