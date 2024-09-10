@isTest
private class OASSetOrderBoxLayoutResponseTest {
    @isTest
    private static void equalsSameInstance() {
        OASSetOrderBoxLayoutResponse setOrderBoxLayoutResponse1 = OASSetOrderBoxLayoutResponse.getExample();
        OASSetOrderBoxLayoutResponse setOrderBoxLayoutResponse2 = setOrderBoxLayoutResponse1;
        OASSetOrderBoxLayoutResponse setOrderBoxLayoutResponse3 = new OASSetOrderBoxLayoutResponse();
        OASSetOrderBoxLayoutResponse setOrderBoxLayoutResponse4 = setOrderBoxLayoutResponse3;

        System.assert(setOrderBoxLayoutResponse1.equals(setOrderBoxLayoutResponse2));
        System.assert(setOrderBoxLayoutResponse2.equals(setOrderBoxLayoutResponse1));
        System.assert(setOrderBoxLayoutResponse1.equals(setOrderBoxLayoutResponse1));
        System.assert(setOrderBoxLayoutResponse3.equals(setOrderBoxLayoutResponse4));
        System.assert(setOrderBoxLayoutResponse4.equals(setOrderBoxLayoutResponse3));
        System.assert(setOrderBoxLayoutResponse3.equals(setOrderBoxLayoutResponse3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASSetOrderBoxLayoutResponse setOrderBoxLayoutResponse1 = OASSetOrderBoxLayoutResponse.getExample();
        OASSetOrderBoxLayoutResponse setOrderBoxLayoutResponse2 = OASSetOrderBoxLayoutResponse.getExample();
        OASSetOrderBoxLayoutResponse setOrderBoxLayoutResponse3 = new OASSetOrderBoxLayoutResponse();
        OASSetOrderBoxLayoutResponse setOrderBoxLayoutResponse4 = new OASSetOrderBoxLayoutResponse();

        System.assert(setOrderBoxLayoutResponse1.equals(setOrderBoxLayoutResponse2));
        System.assert(setOrderBoxLayoutResponse2.equals(setOrderBoxLayoutResponse1));
        System.assert(setOrderBoxLayoutResponse3.equals(setOrderBoxLayoutResponse4));
        System.assert(setOrderBoxLayoutResponse4.equals(setOrderBoxLayoutResponse3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASSetOrderBoxLayoutResponse setOrderBoxLayoutResponse1 = OASSetOrderBoxLayoutResponse.getExample();
        OASSetOrderBoxLayoutResponse setOrderBoxLayoutResponse2 = new OASSetOrderBoxLayoutResponse();

        System.assertEquals(false, setOrderBoxLayoutResponse1.equals('foo'));
        System.assertEquals(false, setOrderBoxLayoutResponse2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASSetOrderBoxLayoutResponse setOrderBoxLayoutResponse1 = OASSetOrderBoxLayoutResponse.getExample();
        OASSetOrderBoxLayoutResponse setOrderBoxLayoutResponse2 = new OASSetOrderBoxLayoutResponse();
        OASSetOrderBoxLayoutResponse setOrderBoxLayoutResponse3;

        System.assertEquals(false, setOrderBoxLayoutResponse1.equals(setOrderBoxLayoutResponse3));
        System.assertEquals(false, setOrderBoxLayoutResponse2.equals(setOrderBoxLayoutResponse3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASSetOrderBoxLayoutResponse setOrderBoxLayoutResponse1 = OASSetOrderBoxLayoutResponse.getExample();
        OASSetOrderBoxLayoutResponse setOrderBoxLayoutResponse2 = new OASSetOrderBoxLayoutResponse();

        System.assertEquals(setOrderBoxLayoutResponse1.hashCode(), setOrderBoxLayoutResponse1.hashCode());
        System.assertEquals(setOrderBoxLayoutResponse2.hashCode(), setOrderBoxLayoutResponse2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASSetOrderBoxLayoutResponse setOrderBoxLayoutResponse1 = OASSetOrderBoxLayoutResponse.getExample();
        OASSetOrderBoxLayoutResponse setOrderBoxLayoutResponse2 = OASSetOrderBoxLayoutResponse.getExample();
        OASSetOrderBoxLayoutResponse setOrderBoxLayoutResponse3 = new OASSetOrderBoxLayoutResponse();
        OASSetOrderBoxLayoutResponse setOrderBoxLayoutResponse4 = new OASSetOrderBoxLayoutResponse();

        System.assert(setOrderBoxLayoutResponse1.equals(setOrderBoxLayoutResponse2));
        System.assert(setOrderBoxLayoutResponse3.equals(setOrderBoxLayoutResponse4));
        System.assertEquals(setOrderBoxLayoutResponse1.hashCode(), setOrderBoxLayoutResponse2.hashCode());
        System.assertEquals(setOrderBoxLayoutResponse3.hashCode(), setOrderBoxLayoutResponse4.hashCode());
    }
}
