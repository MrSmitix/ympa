@isTest
private class OASSetShipmentPalletsCountRequestTest {
    @isTest
    private static void equalsSameInstance() {
        OASSetShipmentPalletsCountRequest setShipmentPalletsCountRequest1 = OASSetShipmentPalletsCountRequest.getExample();
        OASSetShipmentPalletsCountRequest setShipmentPalletsCountRequest2 = setShipmentPalletsCountRequest1;
        OASSetShipmentPalletsCountRequest setShipmentPalletsCountRequest3 = new OASSetShipmentPalletsCountRequest();
        OASSetShipmentPalletsCountRequest setShipmentPalletsCountRequest4 = setShipmentPalletsCountRequest3;

        System.assert(setShipmentPalletsCountRequest1.equals(setShipmentPalletsCountRequest2));
        System.assert(setShipmentPalletsCountRequest2.equals(setShipmentPalletsCountRequest1));
        System.assert(setShipmentPalletsCountRequest1.equals(setShipmentPalletsCountRequest1));
        System.assert(setShipmentPalletsCountRequest3.equals(setShipmentPalletsCountRequest4));
        System.assert(setShipmentPalletsCountRequest4.equals(setShipmentPalletsCountRequest3));
        System.assert(setShipmentPalletsCountRequest3.equals(setShipmentPalletsCountRequest3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASSetShipmentPalletsCountRequest setShipmentPalletsCountRequest1 = OASSetShipmentPalletsCountRequest.getExample();
        OASSetShipmentPalletsCountRequest setShipmentPalletsCountRequest2 = OASSetShipmentPalletsCountRequest.getExample();
        OASSetShipmentPalletsCountRequest setShipmentPalletsCountRequest3 = new OASSetShipmentPalletsCountRequest();
        OASSetShipmentPalletsCountRequest setShipmentPalletsCountRequest4 = new OASSetShipmentPalletsCountRequest();

        System.assert(setShipmentPalletsCountRequest1.equals(setShipmentPalletsCountRequest2));
        System.assert(setShipmentPalletsCountRequest2.equals(setShipmentPalletsCountRequest1));
        System.assert(setShipmentPalletsCountRequest3.equals(setShipmentPalletsCountRequest4));
        System.assert(setShipmentPalletsCountRequest4.equals(setShipmentPalletsCountRequest3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASSetShipmentPalletsCountRequest setShipmentPalletsCountRequest1 = OASSetShipmentPalletsCountRequest.getExample();
        OASSetShipmentPalletsCountRequest setShipmentPalletsCountRequest2 = new OASSetShipmentPalletsCountRequest();

        System.assertEquals(false, setShipmentPalletsCountRequest1.equals('foo'));
        System.assertEquals(false, setShipmentPalletsCountRequest2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASSetShipmentPalletsCountRequest setShipmentPalletsCountRequest1 = OASSetShipmentPalletsCountRequest.getExample();
        OASSetShipmentPalletsCountRequest setShipmentPalletsCountRequest2 = new OASSetShipmentPalletsCountRequest();
        OASSetShipmentPalletsCountRequest setShipmentPalletsCountRequest3;

        System.assertEquals(false, setShipmentPalletsCountRequest1.equals(setShipmentPalletsCountRequest3));
        System.assertEquals(false, setShipmentPalletsCountRequest2.equals(setShipmentPalletsCountRequest3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASSetShipmentPalletsCountRequest setShipmentPalletsCountRequest1 = OASSetShipmentPalletsCountRequest.getExample();
        OASSetShipmentPalletsCountRequest setShipmentPalletsCountRequest2 = new OASSetShipmentPalletsCountRequest();

        System.assertEquals(setShipmentPalletsCountRequest1.hashCode(), setShipmentPalletsCountRequest1.hashCode());
        System.assertEquals(setShipmentPalletsCountRequest2.hashCode(), setShipmentPalletsCountRequest2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASSetShipmentPalletsCountRequest setShipmentPalletsCountRequest1 = OASSetShipmentPalletsCountRequest.getExample();
        OASSetShipmentPalletsCountRequest setShipmentPalletsCountRequest2 = OASSetShipmentPalletsCountRequest.getExample();
        OASSetShipmentPalletsCountRequest setShipmentPalletsCountRequest3 = new OASSetShipmentPalletsCountRequest();
        OASSetShipmentPalletsCountRequest setShipmentPalletsCountRequest4 = new OASSetShipmentPalletsCountRequest();

        System.assert(setShipmentPalletsCountRequest1.equals(setShipmentPalletsCountRequest2));
        System.assert(setShipmentPalletsCountRequest3.equals(setShipmentPalletsCountRequest4));
        System.assertEquals(setShipmentPalletsCountRequest1.hashCode(), setShipmentPalletsCountRequest2.hashCode());
        System.assertEquals(setShipmentPalletsCountRequest3.hashCode(), setShipmentPalletsCountRequest4.hashCode());
    }
}
