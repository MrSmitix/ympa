@isTest
private class OASAcceptOrderCancellationRequestTest {
    @isTest
    private static void equalsSameInstance() {
        OASAcceptOrderCancellationRequest acceptOrderCancellationRequest1 = OASAcceptOrderCancellationRequest.getExample();
        OASAcceptOrderCancellationRequest acceptOrderCancellationRequest2 = acceptOrderCancellationRequest1;
        OASAcceptOrderCancellationRequest acceptOrderCancellationRequest3 = new OASAcceptOrderCancellationRequest();
        OASAcceptOrderCancellationRequest acceptOrderCancellationRequest4 = acceptOrderCancellationRequest3;

        System.assert(acceptOrderCancellationRequest1.equals(acceptOrderCancellationRequest2));
        System.assert(acceptOrderCancellationRequest2.equals(acceptOrderCancellationRequest1));
        System.assert(acceptOrderCancellationRequest1.equals(acceptOrderCancellationRequest1));
        System.assert(acceptOrderCancellationRequest3.equals(acceptOrderCancellationRequest4));
        System.assert(acceptOrderCancellationRequest4.equals(acceptOrderCancellationRequest3));
        System.assert(acceptOrderCancellationRequest3.equals(acceptOrderCancellationRequest3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASAcceptOrderCancellationRequest acceptOrderCancellationRequest1 = OASAcceptOrderCancellationRequest.getExample();
        OASAcceptOrderCancellationRequest acceptOrderCancellationRequest2 = OASAcceptOrderCancellationRequest.getExample();
        OASAcceptOrderCancellationRequest acceptOrderCancellationRequest3 = new OASAcceptOrderCancellationRequest();
        OASAcceptOrderCancellationRequest acceptOrderCancellationRequest4 = new OASAcceptOrderCancellationRequest();

        System.assert(acceptOrderCancellationRequest1.equals(acceptOrderCancellationRequest2));
        System.assert(acceptOrderCancellationRequest2.equals(acceptOrderCancellationRequest1));
        System.assert(acceptOrderCancellationRequest3.equals(acceptOrderCancellationRequest4));
        System.assert(acceptOrderCancellationRequest4.equals(acceptOrderCancellationRequest3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASAcceptOrderCancellationRequest acceptOrderCancellationRequest1 = OASAcceptOrderCancellationRequest.getExample();
        OASAcceptOrderCancellationRequest acceptOrderCancellationRequest2 = new OASAcceptOrderCancellationRequest();

        System.assertEquals(false, acceptOrderCancellationRequest1.equals('foo'));
        System.assertEquals(false, acceptOrderCancellationRequest2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASAcceptOrderCancellationRequest acceptOrderCancellationRequest1 = OASAcceptOrderCancellationRequest.getExample();
        OASAcceptOrderCancellationRequest acceptOrderCancellationRequest2 = new OASAcceptOrderCancellationRequest();
        OASAcceptOrderCancellationRequest acceptOrderCancellationRequest3;

        System.assertEquals(false, acceptOrderCancellationRequest1.equals(acceptOrderCancellationRequest3));
        System.assertEquals(false, acceptOrderCancellationRequest2.equals(acceptOrderCancellationRequest3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASAcceptOrderCancellationRequest acceptOrderCancellationRequest1 = OASAcceptOrderCancellationRequest.getExample();
        OASAcceptOrderCancellationRequest acceptOrderCancellationRequest2 = new OASAcceptOrderCancellationRequest();

        System.assertEquals(acceptOrderCancellationRequest1.hashCode(), acceptOrderCancellationRequest1.hashCode());
        System.assertEquals(acceptOrderCancellationRequest2.hashCode(), acceptOrderCancellationRequest2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASAcceptOrderCancellationRequest acceptOrderCancellationRequest1 = OASAcceptOrderCancellationRequest.getExample();
        OASAcceptOrderCancellationRequest acceptOrderCancellationRequest2 = OASAcceptOrderCancellationRequest.getExample();
        OASAcceptOrderCancellationRequest acceptOrderCancellationRequest3 = new OASAcceptOrderCancellationRequest();
        OASAcceptOrderCancellationRequest acceptOrderCancellationRequest4 = new OASAcceptOrderCancellationRequest();

        System.assert(acceptOrderCancellationRequest1.equals(acceptOrderCancellationRequest2));
        System.assert(acceptOrderCancellationRequest3.equals(acceptOrderCancellationRequest4));
        System.assertEquals(acceptOrderCancellationRequest1.hashCode(), acceptOrderCancellationRequest2.hashCode());
        System.assertEquals(acceptOrderCancellationRequest3.hashCode(), acceptOrderCancellationRequest4.hashCode());
    }
}
