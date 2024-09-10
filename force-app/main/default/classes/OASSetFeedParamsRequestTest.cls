@isTest
private class OASSetFeedParamsRequestTest {
    @isTest
    private static void equalsSameInstance() {
        OASSetFeedParamsRequest setFeedParamsRequest1 = OASSetFeedParamsRequest.getExample();
        OASSetFeedParamsRequest setFeedParamsRequest2 = setFeedParamsRequest1;
        OASSetFeedParamsRequest setFeedParamsRequest3 = new OASSetFeedParamsRequest();
        OASSetFeedParamsRequest setFeedParamsRequest4 = setFeedParamsRequest3;

        System.assert(setFeedParamsRequest1.equals(setFeedParamsRequest2));
        System.assert(setFeedParamsRequest2.equals(setFeedParamsRequest1));
        System.assert(setFeedParamsRequest1.equals(setFeedParamsRequest1));
        System.assert(setFeedParamsRequest3.equals(setFeedParamsRequest4));
        System.assert(setFeedParamsRequest4.equals(setFeedParamsRequest3));
        System.assert(setFeedParamsRequest3.equals(setFeedParamsRequest3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASSetFeedParamsRequest setFeedParamsRequest1 = OASSetFeedParamsRequest.getExample();
        OASSetFeedParamsRequest setFeedParamsRequest2 = OASSetFeedParamsRequest.getExample();
        OASSetFeedParamsRequest setFeedParamsRequest3 = new OASSetFeedParamsRequest();
        OASSetFeedParamsRequest setFeedParamsRequest4 = new OASSetFeedParamsRequest();

        System.assert(setFeedParamsRequest1.equals(setFeedParamsRequest2));
        System.assert(setFeedParamsRequest2.equals(setFeedParamsRequest1));
        System.assert(setFeedParamsRequest3.equals(setFeedParamsRequest4));
        System.assert(setFeedParamsRequest4.equals(setFeedParamsRequest3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASSetFeedParamsRequest setFeedParamsRequest1 = OASSetFeedParamsRequest.getExample();
        OASSetFeedParamsRequest setFeedParamsRequest2 = new OASSetFeedParamsRequest();

        System.assertEquals(false, setFeedParamsRequest1.equals('foo'));
        System.assertEquals(false, setFeedParamsRequest2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASSetFeedParamsRequest setFeedParamsRequest1 = OASSetFeedParamsRequest.getExample();
        OASSetFeedParamsRequest setFeedParamsRequest2 = new OASSetFeedParamsRequest();
        OASSetFeedParamsRequest setFeedParamsRequest3;

        System.assertEquals(false, setFeedParamsRequest1.equals(setFeedParamsRequest3));
        System.assertEquals(false, setFeedParamsRequest2.equals(setFeedParamsRequest3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASSetFeedParamsRequest setFeedParamsRequest1 = OASSetFeedParamsRequest.getExample();
        OASSetFeedParamsRequest setFeedParamsRequest2 = new OASSetFeedParamsRequest();

        System.assertEquals(setFeedParamsRequest1.hashCode(), setFeedParamsRequest1.hashCode());
        System.assertEquals(setFeedParamsRequest2.hashCode(), setFeedParamsRequest2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASSetFeedParamsRequest setFeedParamsRequest1 = OASSetFeedParamsRequest.getExample();
        OASSetFeedParamsRequest setFeedParamsRequest2 = OASSetFeedParamsRequest.getExample();
        OASSetFeedParamsRequest setFeedParamsRequest3 = new OASSetFeedParamsRequest();
        OASSetFeedParamsRequest setFeedParamsRequest4 = new OASSetFeedParamsRequest();

        System.assert(setFeedParamsRequest1.equals(setFeedParamsRequest2));
        System.assert(setFeedParamsRequest3.equals(setFeedParamsRequest4));
        System.assertEquals(setFeedParamsRequest1.hashCode(), setFeedParamsRequest2.hashCode());
        System.assertEquals(setFeedParamsRequest3.hashCode(), setFeedParamsRequest4.hashCode());
    }

    @isTest
    private static void defaultValuesPopulated() {
        OASSetFeedParamsRequest setFeedParamsRequest = new OASSetFeedParamsRequest();
        System.assertEquals(new List<OASFeedParameterDTO>(), setFeedParamsRequest.parameters);
    }
}
