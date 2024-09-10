@isTest
private class OASSetOrderShipmentBoxesRequestTest {
    @isTest
    private static void equalsSameInstance() {
        OASSetOrderShipmentBoxesRequest setOrderShipmentBoxesRequest1 = OASSetOrderShipmentBoxesRequest.getExample();
        OASSetOrderShipmentBoxesRequest setOrderShipmentBoxesRequest2 = setOrderShipmentBoxesRequest1;
        OASSetOrderShipmentBoxesRequest setOrderShipmentBoxesRequest3 = new OASSetOrderShipmentBoxesRequest();
        OASSetOrderShipmentBoxesRequest setOrderShipmentBoxesRequest4 = setOrderShipmentBoxesRequest3;

        System.assert(setOrderShipmentBoxesRequest1.equals(setOrderShipmentBoxesRequest2));
        System.assert(setOrderShipmentBoxesRequest2.equals(setOrderShipmentBoxesRequest1));
        System.assert(setOrderShipmentBoxesRequest1.equals(setOrderShipmentBoxesRequest1));
        System.assert(setOrderShipmentBoxesRequest3.equals(setOrderShipmentBoxesRequest4));
        System.assert(setOrderShipmentBoxesRequest4.equals(setOrderShipmentBoxesRequest3));
        System.assert(setOrderShipmentBoxesRequest3.equals(setOrderShipmentBoxesRequest3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASSetOrderShipmentBoxesRequest setOrderShipmentBoxesRequest1 = OASSetOrderShipmentBoxesRequest.getExample();
        OASSetOrderShipmentBoxesRequest setOrderShipmentBoxesRequest2 = OASSetOrderShipmentBoxesRequest.getExample();
        OASSetOrderShipmentBoxesRequest setOrderShipmentBoxesRequest3 = new OASSetOrderShipmentBoxesRequest();
        OASSetOrderShipmentBoxesRequest setOrderShipmentBoxesRequest4 = new OASSetOrderShipmentBoxesRequest();

        System.assert(setOrderShipmentBoxesRequest1.equals(setOrderShipmentBoxesRequest2));
        System.assert(setOrderShipmentBoxesRequest2.equals(setOrderShipmentBoxesRequest1));
        System.assert(setOrderShipmentBoxesRequest3.equals(setOrderShipmentBoxesRequest4));
        System.assert(setOrderShipmentBoxesRequest4.equals(setOrderShipmentBoxesRequest3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASSetOrderShipmentBoxesRequest setOrderShipmentBoxesRequest1 = OASSetOrderShipmentBoxesRequest.getExample();
        OASSetOrderShipmentBoxesRequest setOrderShipmentBoxesRequest2 = new OASSetOrderShipmentBoxesRequest();

        System.assertEquals(false, setOrderShipmentBoxesRequest1.equals('foo'));
        System.assertEquals(false, setOrderShipmentBoxesRequest2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASSetOrderShipmentBoxesRequest setOrderShipmentBoxesRequest1 = OASSetOrderShipmentBoxesRequest.getExample();
        OASSetOrderShipmentBoxesRequest setOrderShipmentBoxesRequest2 = new OASSetOrderShipmentBoxesRequest();
        OASSetOrderShipmentBoxesRequest setOrderShipmentBoxesRequest3;

        System.assertEquals(false, setOrderShipmentBoxesRequest1.equals(setOrderShipmentBoxesRequest3));
        System.assertEquals(false, setOrderShipmentBoxesRequest2.equals(setOrderShipmentBoxesRequest3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASSetOrderShipmentBoxesRequest setOrderShipmentBoxesRequest1 = OASSetOrderShipmentBoxesRequest.getExample();
        OASSetOrderShipmentBoxesRequest setOrderShipmentBoxesRequest2 = new OASSetOrderShipmentBoxesRequest();

        System.assertEquals(setOrderShipmentBoxesRequest1.hashCode(), setOrderShipmentBoxesRequest1.hashCode());
        System.assertEquals(setOrderShipmentBoxesRequest2.hashCode(), setOrderShipmentBoxesRequest2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASSetOrderShipmentBoxesRequest setOrderShipmentBoxesRequest1 = OASSetOrderShipmentBoxesRequest.getExample();
        OASSetOrderShipmentBoxesRequest setOrderShipmentBoxesRequest2 = OASSetOrderShipmentBoxesRequest.getExample();
        OASSetOrderShipmentBoxesRequest setOrderShipmentBoxesRequest3 = new OASSetOrderShipmentBoxesRequest();
        OASSetOrderShipmentBoxesRequest setOrderShipmentBoxesRequest4 = new OASSetOrderShipmentBoxesRequest();

        System.assert(setOrderShipmentBoxesRequest1.equals(setOrderShipmentBoxesRequest2));
        System.assert(setOrderShipmentBoxesRequest3.equals(setOrderShipmentBoxesRequest4));
        System.assertEquals(setOrderShipmentBoxesRequest1.hashCode(), setOrderShipmentBoxesRequest2.hashCode());
        System.assertEquals(setOrderShipmentBoxesRequest3.hashCode(), setOrderShipmentBoxesRequest4.hashCode());
    }

    @isTest
    private static void defaultValuesPopulated() {
        OASSetOrderShipmentBoxesRequest setOrderShipmentBoxesRequest = new OASSetOrderShipmentBoxesRequest();
        System.assertEquals(new List<OASParcelBoxDTO>(), setOrderShipmentBoxesRequest.boxes);
    }
}
