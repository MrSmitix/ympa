@isTest
private class OASSetOrderShipmentBoxesResponseTest {
    @isTest
    private static void equalsSameInstance() {
        OASSetOrderShipmentBoxesResponse setOrderShipmentBoxesResponse1 = OASSetOrderShipmentBoxesResponse.getExample();
        OASSetOrderShipmentBoxesResponse setOrderShipmentBoxesResponse2 = setOrderShipmentBoxesResponse1;
        OASSetOrderShipmentBoxesResponse setOrderShipmentBoxesResponse3 = new OASSetOrderShipmentBoxesResponse();
        OASSetOrderShipmentBoxesResponse setOrderShipmentBoxesResponse4 = setOrderShipmentBoxesResponse3;

        System.assert(setOrderShipmentBoxesResponse1.equals(setOrderShipmentBoxesResponse2));
        System.assert(setOrderShipmentBoxesResponse2.equals(setOrderShipmentBoxesResponse1));
        System.assert(setOrderShipmentBoxesResponse1.equals(setOrderShipmentBoxesResponse1));
        System.assert(setOrderShipmentBoxesResponse3.equals(setOrderShipmentBoxesResponse4));
        System.assert(setOrderShipmentBoxesResponse4.equals(setOrderShipmentBoxesResponse3));
        System.assert(setOrderShipmentBoxesResponse3.equals(setOrderShipmentBoxesResponse3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASSetOrderShipmentBoxesResponse setOrderShipmentBoxesResponse1 = OASSetOrderShipmentBoxesResponse.getExample();
        OASSetOrderShipmentBoxesResponse setOrderShipmentBoxesResponse2 = OASSetOrderShipmentBoxesResponse.getExample();
        OASSetOrderShipmentBoxesResponse setOrderShipmentBoxesResponse3 = new OASSetOrderShipmentBoxesResponse();
        OASSetOrderShipmentBoxesResponse setOrderShipmentBoxesResponse4 = new OASSetOrderShipmentBoxesResponse();

        System.assert(setOrderShipmentBoxesResponse1.equals(setOrderShipmentBoxesResponse2));
        System.assert(setOrderShipmentBoxesResponse2.equals(setOrderShipmentBoxesResponse1));
        System.assert(setOrderShipmentBoxesResponse3.equals(setOrderShipmentBoxesResponse4));
        System.assert(setOrderShipmentBoxesResponse4.equals(setOrderShipmentBoxesResponse3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASSetOrderShipmentBoxesResponse setOrderShipmentBoxesResponse1 = OASSetOrderShipmentBoxesResponse.getExample();
        OASSetOrderShipmentBoxesResponse setOrderShipmentBoxesResponse2 = new OASSetOrderShipmentBoxesResponse();

        System.assertEquals(false, setOrderShipmentBoxesResponse1.equals('foo'));
        System.assertEquals(false, setOrderShipmentBoxesResponse2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASSetOrderShipmentBoxesResponse setOrderShipmentBoxesResponse1 = OASSetOrderShipmentBoxesResponse.getExample();
        OASSetOrderShipmentBoxesResponse setOrderShipmentBoxesResponse2 = new OASSetOrderShipmentBoxesResponse();
        OASSetOrderShipmentBoxesResponse setOrderShipmentBoxesResponse3;

        System.assertEquals(false, setOrderShipmentBoxesResponse1.equals(setOrderShipmentBoxesResponse3));
        System.assertEquals(false, setOrderShipmentBoxesResponse2.equals(setOrderShipmentBoxesResponse3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASSetOrderShipmentBoxesResponse setOrderShipmentBoxesResponse1 = OASSetOrderShipmentBoxesResponse.getExample();
        OASSetOrderShipmentBoxesResponse setOrderShipmentBoxesResponse2 = new OASSetOrderShipmentBoxesResponse();

        System.assertEquals(setOrderShipmentBoxesResponse1.hashCode(), setOrderShipmentBoxesResponse1.hashCode());
        System.assertEquals(setOrderShipmentBoxesResponse2.hashCode(), setOrderShipmentBoxesResponse2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASSetOrderShipmentBoxesResponse setOrderShipmentBoxesResponse1 = OASSetOrderShipmentBoxesResponse.getExample();
        OASSetOrderShipmentBoxesResponse setOrderShipmentBoxesResponse2 = OASSetOrderShipmentBoxesResponse.getExample();
        OASSetOrderShipmentBoxesResponse setOrderShipmentBoxesResponse3 = new OASSetOrderShipmentBoxesResponse();
        OASSetOrderShipmentBoxesResponse setOrderShipmentBoxesResponse4 = new OASSetOrderShipmentBoxesResponse();

        System.assert(setOrderShipmentBoxesResponse1.equals(setOrderShipmentBoxesResponse2));
        System.assert(setOrderShipmentBoxesResponse3.equals(setOrderShipmentBoxesResponse4));
        System.assertEquals(setOrderShipmentBoxesResponse1.hashCode(), setOrderShipmentBoxesResponse2.hashCode());
        System.assertEquals(setOrderShipmentBoxesResponse3.hashCode(), setOrderShipmentBoxesResponse4.hashCode());
    }
}
