@isTest
private class OASSetOrderDeliveryTrackCodeRequestTest {
    @isTest
    private static void equalsSameInstance() {
        OASSetOrderDeliveryTrackCodeRequest setOrderDeliveryTrackCodeRequest1 = OASSetOrderDeliveryTrackCodeRequest.getExample();
        OASSetOrderDeliveryTrackCodeRequest setOrderDeliveryTrackCodeRequest2 = setOrderDeliveryTrackCodeRequest1;
        OASSetOrderDeliveryTrackCodeRequest setOrderDeliveryTrackCodeRequest3 = new OASSetOrderDeliveryTrackCodeRequest();
        OASSetOrderDeliveryTrackCodeRequest setOrderDeliveryTrackCodeRequest4 = setOrderDeliveryTrackCodeRequest3;

        System.assert(setOrderDeliveryTrackCodeRequest1.equals(setOrderDeliveryTrackCodeRequest2));
        System.assert(setOrderDeliveryTrackCodeRequest2.equals(setOrderDeliveryTrackCodeRequest1));
        System.assert(setOrderDeliveryTrackCodeRequest1.equals(setOrderDeliveryTrackCodeRequest1));
        System.assert(setOrderDeliveryTrackCodeRequest3.equals(setOrderDeliveryTrackCodeRequest4));
        System.assert(setOrderDeliveryTrackCodeRequest4.equals(setOrderDeliveryTrackCodeRequest3));
        System.assert(setOrderDeliveryTrackCodeRequest3.equals(setOrderDeliveryTrackCodeRequest3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASSetOrderDeliveryTrackCodeRequest setOrderDeliveryTrackCodeRequest1 = OASSetOrderDeliveryTrackCodeRequest.getExample();
        OASSetOrderDeliveryTrackCodeRequest setOrderDeliveryTrackCodeRequest2 = OASSetOrderDeliveryTrackCodeRequest.getExample();
        OASSetOrderDeliveryTrackCodeRequest setOrderDeliveryTrackCodeRequest3 = new OASSetOrderDeliveryTrackCodeRequest();
        OASSetOrderDeliveryTrackCodeRequest setOrderDeliveryTrackCodeRequest4 = new OASSetOrderDeliveryTrackCodeRequest();

        System.assert(setOrderDeliveryTrackCodeRequest1.equals(setOrderDeliveryTrackCodeRequest2));
        System.assert(setOrderDeliveryTrackCodeRequest2.equals(setOrderDeliveryTrackCodeRequest1));
        System.assert(setOrderDeliveryTrackCodeRequest3.equals(setOrderDeliveryTrackCodeRequest4));
        System.assert(setOrderDeliveryTrackCodeRequest4.equals(setOrderDeliveryTrackCodeRequest3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASSetOrderDeliveryTrackCodeRequest setOrderDeliveryTrackCodeRequest1 = OASSetOrderDeliveryTrackCodeRequest.getExample();
        OASSetOrderDeliveryTrackCodeRequest setOrderDeliveryTrackCodeRequest2 = new OASSetOrderDeliveryTrackCodeRequest();

        System.assertEquals(false, setOrderDeliveryTrackCodeRequest1.equals('foo'));
        System.assertEquals(false, setOrderDeliveryTrackCodeRequest2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASSetOrderDeliveryTrackCodeRequest setOrderDeliveryTrackCodeRequest1 = OASSetOrderDeliveryTrackCodeRequest.getExample();
        OASSetOrderDeliveryTrackCodeRequest setOrderDeliveryTrackCodeRequest2 = new OASSetOrderDeliveryTrackCodeRequest();
        OASSetOrderDeliveryTrackCodeRequest setOrderDeliveryTrackCodeRequest3;

        System.assertEquals(false, setOrderDeliveryTrackCodeRequest1.equals(setOrderDeliveryTrackCodeRequest3));
        System.assertEquals(false, setOrderDeliveryTrackCodeRequest2.equals(setOrderDeliveryTrackCodeRequest3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASSetOrderDeliveryTrackCodeRequest setOrderDeliveryTrackCodeRequest1 = OASSetOrderDeliveryTrackCodeRequest.getExample();
        OASSetOrderDeliveryTrackCodeRequest setOrderDeliveryTrackCodeRequest2 = new OASSetOrderDeliveryTrackCodeRequest();

        System.assertEquals(setOrderDeliveryTrackCodeRequest1.hashCode(), setOrderDeliveryTrackCodeRequest1.hashCode());
        System.assertEquals(setOrderDeliveryTrackCodeRequest2.hashCode(), setOrderDeliveryTrackCodeRequest2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASSetOrderDeliveryTrackCodeRequest setOrderDeliveryTrackCodeRequest1 = OASSetOrderDeliveryTrackCodeRequest.getExample();
        OASSetOrderDeliveryTrackCodeRequest setOrderDeliveryTrackCodeRequest2 = OASSetOrderDeliveryTrackCodeRequest.getExample();
        OASSetOrderDeliveryTrackCodeRequest setOrderDeliveryTrackCodeRequest3 = new OASSetOrderDeliveryTrackCodeRequest();
        OASSetOrderDeliveryTrackCodeRequest setOrderDeliveryTrackCodeRequest4 = new OASSetOrderDeliveryTrackCodeRequest();

        System.assert(setOrderDeliveryTrackCodeRequest1.equals(setOrderDeliveryTrackCodeRequest2));
        System.assert(setOrderDeliveryTrackCodeRequest3.equals(setOrderDeliveryTrackCodeRequest4));
        System.assertEquals(setOrderDeliveryTrackCodeRequest1.hashCode(), setOrderDeliveryTrackCodeRequest2.hashCode());
        System.assertEquals(setOrderDeliveryTrackCodeRequest3.hashCode(), setOrderDeliveryTrackCodeRequest4.hashCode());
    }
}
