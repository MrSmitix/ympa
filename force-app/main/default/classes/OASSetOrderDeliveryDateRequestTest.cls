@isTest
private class OASSetOrderDeliveryDateRequestTest {
    @isTest
    private static void equalsSameInstance() {
        OASSetOrderDeliveryDateRequest setOrderDeliveryDateRequest1 = OASSetOrderDeliveryDateRequest.getExample();
        OASSetOrderDeliveryDateRequest setOrderDeliveryDateRequest2 = setOrderDeliveryDateRequest1;
        OASSetOrderDeliveryDateRequest setOrderDeliveryDateRequest3 = new OASSetOrderDeliveryDateRequest();
        OASSetOrderDeliveryDateRequest setOrderDeliveryDateRequest4 = setOrderDeliveryDateRequest3;

        System.assert(setOrderDeliveryDateRequest1.equals(setOrderDeliveryDateRequest2));
        System.assert(setOrderDeliveryDateRequest2.equals(setOrderDeliveryDateRequest1));
        System.assert(setOrderDeliveryDateRequest1.equals(setOrderDeliveryDateRequest1));
        System.assert(setOrderDeliveryDateRequest3.equals(setOrderDeliveryDateRequest4));
        System.assert(setOrderDeliveryDateRequest4.equals(setOrderDeliveryDateRequest3));
        System.assert(setOrderDeliveryDateRequest3.equals(setOrderDeliveryDateRequest3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASSetOrderDeliveryDateRequest setOrderDeliveryDateRequest1 = OASSetOrderDeliveryDateRequest.getExample();
        OASSetOrderDeliveryDateRequest setOrderDeliveryDateRequest2 = OASSetOrderDeliveryDateRequest.getExample();
        OASSetOrderDeliveryDateRequest setOrderDeliveryDateRequest3 = new OASSetOrderDeliveryDateRequest();
        OASSetOrderDeliveryDateRequest setOrderDeliveryDateRequest4 = new OASSetOrderDeliveryDateRequest();

        System.assert(setOrderDeliveryDateRequest1.equals(setOrderDeliveryDateRequest2));
        System.assert(setOrderDeliveryDateRequest2.equals(setOrderDeliveryDateRequest1));
        System.assert(setOrderDeliveryDateRequest3.equals(setOrderDeliveryDateRequest4));
        System.assert(setOrderDeliveryDateRequest4.equals(setOrderDeliveryDateRequest3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASSetOrderDeliveryDateRequest setOrderDeliveryDateRequest1 = OASSetOrderDeliveryDateRequest.getExample();
        OASSetOrderDeliveryDateRequest setOrderDeliveryDateRequest2 = new OASSetOrderDeliveryDateRequest();

        System.assertEquals(false, setOrderDeliveryDateRequest1.equals('foo'));
        System.assertEquals(false, setOrderDeliveryDateRequest2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASSetOrderDeliveryDateRequest setOrderDeliveryDateRequest1 = OASSetOrderDeliveryDateRequest.getExample();
        OASSetOrderDeliveryDateRequest setOrderDeliveryDateRequest2 = new OASSetOrderDeliveryDateRequest();
        OASSetOrderDeliveryDateRequest setOrderDeliveryDateRequest3;

        System.assertEquals(false, setOrderDeliveryDateRequest1.equals(setOrderDeliveryDateRequest3));
        System.assertEquals(false, setOrderDeliveryDateRequest2.equals(setOrderDeliveryDateRequest3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASSetOrderDeliveryDateRequest setOrderDeliveryDateRequest1 = OASSetOrderDeliveryDateRequest.getExample();
        OASSetOrderDeliveryDateRequest setOrderDeliveryDateRequest2 = new OASSetOrderDeliveryDateRequest();

        System.assertEquals(setOrderDeliveryDateRequest1.hashCode(), setOrderDeliveryDateRequest1.hashCode());
        System.assertEquals(setOrderDeliveryDateRequest2.hashCode(), setOrderDeliveryDateRequest2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASSetOrderDeliveryDateRequest setOrderDeliveryDateRequest1 = OASSetOrderDeliveryDateRequest.getExample();
        OASSetOrderDeliveryDateRequest setOrderDeliveryDateRequest2 = OASSetOrderDeliveryDateRequest.getExample();
        OASSetOrderDeliveryDateRequest setOrderDeliveryDateRequest3 = new OASSetOrderDeliveryDateRequest();
        OASSetOrderDeliveryDateRequest setOrderDeliveryDateRequest4 = new OASSetOrderDeliveryDateRequest();

        System.assert(setOrderDeliveryDateRequest1.equals(setOrderDeliveryDateRequest2));
        System.assert(setOrderDeliveryDateRequest3.equals(setOrderDeliveryDateRequest4));
        System.assertEquals(setOrderDeliveryDateRequest1.hashCode(), setOrderDeliveryDateRequest2.hashCode());
        System.assertEquals(setOrderDeliveryDateRequest3.hashCode(), setOrderDeliveryDateRequest4.hashCode());
    }
}
