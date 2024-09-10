@isTest
private class OASConfirmShipmentRequestTest {
    @isTest
    private static void equalsSameInstance() {
        OASConfirmShipmentRequest confirmShipmentRequest1 = OASConfirmShipmentRequest.getExample();
        OASConfirmShipmentRequest confirmShipmentRequest2 = confirmShipmentRequest1;
        OASConfirmShipmentRequest confirmShipmentRequest3 = new OASConfirmShipmentRequest();
        OASConfirmShipmentRequest confirmShipmentRequest4 = confirmShipmentRequest3;

        System.assert(confirmShipmentRequest1.equals(confirmShipmentRequest2));
        System.assert(confirmShipmentRequest2.equals(confirmShipmentRequest1));
        System.assert(confirmShipmentRequest1.equals(confirmShipmentRequest1));
        System.assert(confirmShipmentRequest3.equals(confirmShipmentRequest4));
        System.assert(confirmShipmentRequest4.equals(confirmShipmentRequest3));
        System.assert(confirmShipmentRequest3.equals(confirmShipmentRequest3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASConfirmShipmentRequest confirmShipmentRequest1 = OASConfirmShipmentRequest.getExample();
        OASConfirmShipmentRequest confirmShipmentRequest2 = OASConfirmShipmentRequest.getExample();
        OASConfirmShipmentRequest confirmShipmentRequest3 = new OASConfirmShipmentRequest();
        OASConfirmShipmentRequest confirmShipmentRequest4 = new OASConfirmShipmentRequest();

        System.assert(confirmShipmentRequest1.equals(confirmShipmentRequest2));
        System.assert(confirmShipmentRequest2.equals(confirmShipmentRequest1));
        System.assert(confirmShipmentRequest3.equals(confirmShipmentRequest4));
        System.assert(confirmShipmentRequest4.equals(confirmShipmentRequest3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASConfirmShipmentRequest confirmShipmentRequest1 = OASConfirmShipmentRequest.getExample();
        OASConfirmShipmentRequest confirmShipmentRequest2 = new OASConfirmShipmentRequest();

        System.assertEquals(false, confirmShipmentRequest1.equals('foo'));
        System.assertEquals(false, confirmShipmentRequest2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASConfirmShipmentRequest confirmShipmentRequest1 = OASConfirmShipmentRequest.getExample();
        OASConfirmShipmentRequest confirmShipmentRequest2 = new OASConfirmShipmentRequest();
        OASConfirmShipmentRequest confirmShipmentRequest3;

        System.assertEquals(false, confirmShipmentRequest1.equals(confirmShipmentRequest3));
        System.assertEquals(false, confirmShipmentRequest2.equals(confirmShipmentRequest3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASConfirmShipmentRequest confirmShipmentRequest1 = OASConfirmShipmentRequest.getExample();
        OASConfirmShipmentRequest confirmShipmentRequest2 = new OASConfirmShipmentRequest();

        System.assertEquals(confirmShipmentRequest1.hashCode(), confirmShipmentRequest1.hashCode());
        System.assertEquals(confirmShipmentRequest2.hashCode(), confirmShipmentRequest2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASConfirmShipmentRequest confirmShipmentRequest1 = OASConfirmShipmentRequest.getExample();
        OASConfirmShipmentRequest confirmShipmentRequest2 = OASConfirmShipmentRequest.getExample();
        OASConfirmShipmentRequest confirmShipmentRequest3 = new OASConfirmShipmentRequest();
        OASConfirmShipmentRequest confirmShipmentRequest4 = new OASConfirmShipmentRequest();

        System.assert(confirmShipmentRequest1.equals(confirmShipmentRequest2));
        System.assert(confirmShipmentRequest3.equals(confirmShipmentRequest4));
        System.assertEquals(confirmShipmentRequest1.hashCode(), confirmShipmentRequest2.hashCode());
        System.assertEquals(confirmShipmentRequest3.hashCode(), confirmShipmentRequest4.hashCode());
    }
}
