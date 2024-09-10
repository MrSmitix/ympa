@isTest
private class OASGetShipmentOrdersInfoResponseTest {
    @isTest
    private static void equalsSameInstance() {
        OASGetShipmentOrdersInfoResponse getShipmentOrdersInfoResponse1 = OASGetShipmentOrdersInfoResponse.getExample();
        OASGetShipmentOrdersInfoResponse getShipmentOrdersInfoResponse2 = getShipmentOrdersInfoResponse1;
        OASGetShipmentOrdersInfoResponse getShipmentOrdersInfoResponse3 = new OASGetShipmentOrdersInfoResponse();
        OASGetShipmentOrdersInfoResponse getShipmentOrdersInfoResponse4 = getShipmentOrdersInfoResponse3;

        System.assert(getShipmentOrdersInfoResponse1.equals(getShipmentOrdersInfoResponse2));
        System.assert(getShipmentOrdersInfoResponse2.equals(getShipmentOrdersInfoResponse1));
        System.assert(getShipmentOrdersInfoResponse1.equals(getShipmentOrdersInfoResponse1));
        System.assert(getShipmentOrdersInfoResponse3.equals(getShipmentOrdersInfoResponse4));
        System.assert(getShipmentOrdersInfoResponse4.equals(getShipmentOrdersInfoResponse3));
        System.assert(getShipmentOrdersInfoResponse3.equals(getShipmentOrdersInfoResponse3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASGetShipmentOrdersInfoResponse getShipmentOrdersInfoResponse1 = OASGetShipmentOrdersInfoResponse.getExample();
        OASGetShipmentOrdersInfoResponse getShipmentOrdersInfoResponse2 = OASGetShipmentOrdersInfoResponse.getExample();
        OASGetShipmentOrdersInfoResponse getShipmentOrdersInfoResponse3 = new OASGetShipmentOrdersInfoResponse();
        OASGetShipmentOrdersInfoResponse getShipmentOrdersInfoResponse4 = new OASGetShipmentOrdersInfoResponse();

        System.assert(getShipmentOrdersInfoResponse1.equals(getShipmentOrdersInfoResponse2));
        System.assert(getShipmentOrdersInfoResponse2.equals(getShipmentOrdersInfoResponse1));
        System.assert(getShipmentOrdersInfoResponse3.equals(getShipmentOrdersInfoResponse4));
        System.assert(getShipmentOrdersInfoResponse4.equals(getShipmentOrdersInfoResponse3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASGetShipmentOrdersInfoResponse getShipmentOrdersInfoResponse1 = OASGetShipmentOrdersInfoResponse.getExample();
        OASGetShipmentOrdersInfoResponse getShipmentOrdersInfoResponse2 = new OASGetShipmentOrdersInfoResponse();

        System.assertEquals(false, getShipmentOrdersInfoResponse1.equals('foo'));
        System.assertEquals(false, getShipmentOrdersInfoResponse2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASGetShipmentOrdersInfoResponse getShipmentOrdersInfoResponse1 = OASGetShipmentOrdersInfoResponse.getExample();
        OASGetShipmentOrdersInfoResponse getShipmentOrdersInfoResponse2 = new OASGetShipmentOrdersInfoResponse();
        OASGetShipmentOrdersInfoResponse getShipmentOrdersInfoResponse3;

        System.assertEquals(false, getShipmentOrdersInfoResponse1.equals(getShipmentOrdersInfoResponse3));
        System.assertEquals(false, getShipmentOrdersInfoResponse2.equals(getShipmentOrdersInfoResponse3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASGetShipmentOrdersInfoResponse getShipmentOrdersInfoResponse1 = OASGetShipmentOrdersInfoResponse.getExample();
        OASGetShipmentOrdersInfoResponse getShipmentOrdersInfoResponse2 = new OASGetShipmentOrdersInfoResponse();

        System.assertEquals(getShipmentOrdersInfoResponse1.hashCode(), getShipmentOrdersInfoResponse1.hashCode());
        System.assertEquals(getShipmentOrdersInfoResponse2.hashCode(), getShipmentOrdersInfoResponse2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASGetShipmentOrdersInfoResponse getShipmentOrdersInfoResponse1 = OASGetShipmentOrdersInfoResponse.getExample();
        OASGetShipmentOrdersInfoResponse getShipmentOrdersInfoResponse2 = OASGetShipmentOrdersInfoResponse.getExample();
        OASGetShipmentOrdersInfoResponse getShipmentOrdersInfoResponse3 = new OASGetShipmentOrdersInfoResponse();
        OASGetShipmentOrdersInfoResponse getShipmentOrdersInfoResponse4 = new OASGetShipmentOrdersInfoResponse();

        System.assert(getShipmentOrdersInfoResponse1.equals(getShipmentOrdersInfoResponse2));
        System.assert(getShipmentOrdersInfoResponse3.equals(getShipmentOrdersInfoResponse4));
        System.assertEquals(getShipmentOrdersInfoResponse1.hashCode(), getShipmentOrdersInfoResponse2.hashCode());
        System.assertEquals(getShipmentOrdersInfoResponse3.hashCode(), getShipmentOrdersInfoResponse4.hashCode());
    }
}
