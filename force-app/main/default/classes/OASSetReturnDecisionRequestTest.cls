@isTest
private class OASSetReturnDecisionRequestTest {
    @isTest
    private static void equalsSameInstance() {
        OASSetReturnDecisionRequest setReturnDecisionRequest1 = OASSetReturnDecisionRequest.getExample();
        OASSetReturnDecisionRequest setReturnDecisionRequest2 = setReturnDecisionRequest1;
        OASSetReturnDecisionRequest setReturnDecisionRequest3 = new OASSetReturnDecisionRequest();
        OASSetReturnDecisionRequest setReturnDecisionRequest4 = setReturnDecisionRequest3;

        System.assert(setReturnDecisionRequest1.equals(setReturnDecisionRequest2));
        System.assert(setReturnDecisionRequest2.equals(setReturnDecisionRequest1));
        System.assert(setReturnDecisionRequest1.equals(setReturnDecisionRequest1));
        System.assert(setReturnDecisionRequest3.equals(setReturnDecisionRequest4));
        System.assert(setReturnDecisionRequest4.equals(setReturnDecisionRequest3));
        System.assert(setReturnDecisionRequest3.equals(setReturnDecisionRequest3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASSetReturnDecisionRequest setReturnDecisionRequest1 = OASSetReturnDecisionRequest.getExample();
        OASSetReturnDecisionRequest setReturnDecisionRequest2 = OASSetReturnDecisionRequest.getExample();
        OASSetReturnDecisionRequest setReturnDecisionRequest3 = new OASSetReturnDecisionRequest();
        OASSetReturnDecisionRequest setReturnDecisionRequest4 = new OASSetReturnDecisionRequest();

        System.assert(setReturnDecisionRequest1.equals(setReturnDecisionRequest2));
        System.assert(setReturnDecisionRequest2.equals(setReturnDecisionRequest1));
        System.assert(setReturnDecisionRequest3.equals(setReturnDecisionRequest4));
        System.assert(setReturnDecisionRequest4.equals(setReturnDecisionRequest3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASSetReturnDecisionRequest setReturnDecisionRequest1 = OASSetReturnDecisionRequest.getExample();
        OASSetReturnDecisionRequest setReturnDecisionRequest2 = new OASSetReturnDecisionRequest();

        System.assertEquals(false, setReturnDecisionRequest1.equals('foo'));
        System.assertEquals(false, setReturnDecisionRequest2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASSetReturnDecisionRequest setReturnDecisionRequest1 = OASSetReturnDecisionRequest.getExample();
        OASSetReturnDecisionRequest setReturnDecisionRequest2 = new OASSetReturnDecisionRequest();
        OASSetReturnDecisionRequest setReturnDecisionRequest3;

        System.assertEquals(false, setReturnDecisionRequest1.equals(setReturnDecisionRequest3));
        System.assertEquals(false, setReturnDecisionRequest2.equals(setReturnDecisionRequest3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASSetReturnDecisionRequest setReturnDecisionRequest1 = OASSetReturnDecisionRequest.getExample();
        OASSetReturnDecisionRequest setReturnDecisionRequest2 = new OASSetReturnDecisionRequest();

        System.assertEquals(setReturnDecisionRequest1.hashCode(), setReturnDecisionRequest1.hashCode());
        System.assertEquals(setReturnDecisionRequest2.hashCode(), setReturnDecisionRequest2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASSetReturnDecisionRequest setReturnDecisionRequest1 = OASSetReturnDecisionRequest.getExample();
        OASSetReturnDecisionRequest setReturnDecisionRequest2 = OASSetReturnDecisionRequest.getExample();
        OASSetReturnDecisionRequest setReturnDecisionRequest3 = new OASSetReturnDecisionRequest();
        OASSetReturnDecisionRequest setReturnDecisionRequest4 = new OASSetReturnDecisionRequest();

        System.assert(setReturnDecisionRequest1.equals(setReturnDecisionRequest2));
        System.assert(setReturnDecisionRequest3.equals(setReturnDecisionRequest4));
        System.assertEquals(setReturnDecisionRequest1.hashCode(), setReturnDecisionRequest2.hashCode());
        System.assertEquals(setReturnDecisionRequest3.hashCode(), setReturnDecisionRequest4.hashCode());
    }
}
