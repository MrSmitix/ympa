@isTest
private class OASSetOrderBoxLayoutRequestTest {
    @isTest
    private static void equalsSameInstance() {
        OASSetOrderBoxLayoutRequest setOrderBoxLayoutRequest1 = OASSetOrderBoxLayoutRequest.getExample();
        OASSetOrderBoxLayoutRequest setOrderBoxLayoutRequest2 = setOrderBoxLayoutRequest1;
        OASSetOrderBoxLayoutRequest setOrderBoxLayoutRequest3 = new OASSetOrderBoxLayoutRequest();
        OASSetOrderBoxLayoutRequest setOrderBoxLayoutRequest4 = setOrderBoxLayoutRequest3;

        System.assert(setOrderBoxLayoutRequest1.equals(setOrderBoxLayoutRequest2));
        System.assert(setOrderBoxLayoutRequest2.equals(setOrderBoxLayoutRequest1));
        System.assert(setOrderBoxLayoutRequest1.equals(setOrderBoxLayoutRequest1));
        System.assert(setOrderBoxLayoutRequest3.equals(setOrderBoxLayoutRequest4));
        System.assert(setOrderBoxLayoutRequest4.equals(setOrderBoxLayoutRequest3));
        System.assert(setOrderBoxLayoutRequest3.equals(setOrderBoxLayoutRequest3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASSetOrderBoxLayoutRequest setOrderBoxLayoutRequest1 = OASSetOrderBoxLayoutRequest.getExample();
        OASSetOrderBoxLayoutRequest setOrderBoxLayoutRequest2 = OASSetOrderBoxLayoutRequest.getExample();
        OASSetOrderBoxLayoutRequest setOrderBoxLayoutRequest3 = new OASSetOrderBoxLayoutRequest();
        OASSetOrderBoxLayoutRequest setOrderBoxLayoutRequest4 = new OASSetOrderBoxLayoutRequest();

        System.assert(setOrderBoxLayoutRequest1.equals(setOrderBoxLayoutRequest2));
        System.assert(setOrderBoxLayoutRequest2.equals(setOrderBoxLayoutRequest1));
        System.assert(setOrderBoxLayoutRequest3.equals(setOrderBoxLayoutRequest4));
        System.assert(setOrderBoxLayoutRequest4.equals(setOrderBoxLayoutRequest3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASSetOrderBoxLayoutRequest setOrderBoxLayoutRequest1 = OASSetOrderBoxLayoutRequest.getExample();
        OASSetOrderBoxLayoutRequest setOrderBoxLayoutRequest2 = new OASSetOrderBoxLayoutRequest();

        System.assertEquals(false, setOrderBoxLayoutRequest1.equals('foo'));
        System.assertEquals(false, setOrderBoxLayoutRequest2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASSetOrderBoxLayoutRequest setOrderBoxLayoutRequest1 = OASSetOrderBoxLayoutRequest.getExample();
        OASSetOrderBoxLayoutRequest setOrderBoxLayoutRequest2 = new OASSetOrderBoxLayoutRequest();
        OASSetOrderBoxLayoutRequest setOrderBoxLayoutRequest3;

        System.assertEquals(false, setOrderBoxLayoutRequest1.equals(setOrderBoxLayoutRequest3));
        System.assertEquals(false, setOrderBoxLayoutRequest2.equals(setOrderBoxLayoutRequest3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASSetOrderBoxLayoutRequest setOrderBoxLayoutRequest1 = OASSetOrderBoxLayoutRequest.getExample();
        OASSetOrderBoxLayoutRequest setOrderBoxLayoutRequest2 = new OASSetOrderBoxLayoutRequest();

        System.assertEquals(setOrderBoxLayoutRequest1.hashCode(), setOrderBoxLayoutRequest1.hashCode());
        System.assertEquals(setOrderBoxLayoutRequest2.hashCode(), setOrderBoxLayoutRequest2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASSetOrderBoxLayoutRequest setOrderBoxLayoutRequest1 = OASSetOrderBoxLayoutRequest.getExample();
        OASSetOrderBoxLayoutRequest setOrderBoxLayoutRequest2 = OASSetOrderBoxLayoutRequest.getExample();
        OASSetOrderBoxLayoutRequest setOrderBoxLayoutRequest3 = new OASSetOrderBoxLayoutRequest();
        OASSetOrderBoxLayoutRequest setOrderBoxLayoutRequest4 = new OASSetOrderBoxLayoutRequest();

        System.assert(setOrderBoxLayoutRequest1.equals(setOrderBoxLayoutRequest2));
        System.assert(setOrderBoxLayoutRequest3.equals(setOrderBoxLayoutRequest4));
        System.assertEquals(setOrderBoxLayoutRequest1.hashCode(), setOrderBoxLayoutRequest2.hashCode());
        System.assertEquals(setOrderBoxLayoutRequest3.hashCode(), setOrderBoxLayoutRequest4.hashCode());
    }

    @isTest
    private static void defaultValuesPopulated() {
        OASSetOrderBoxLayoutRequest setOrderBoxLayoutRequest = new OASSetOrderBoxLayoutRequest();
        System.assertEquals(new List<OASOrderBoxLayoutDTO>(), setOrderBoxLayoutRequest.boxes);
        System.assertEquals(false, setOrderBoxLayoutRequest.allowRemove);
    }
}
