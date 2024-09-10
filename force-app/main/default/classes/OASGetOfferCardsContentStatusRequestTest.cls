@isTest
private class OASGetOfferCardsContentStatusRequestTest {
    @isTest
    private static void equalsSameInstance() {
        OASGetOfferCardsContentStatusRequest getOfferCardsContentStatusRequest1 = OASGetOfferCardsContentStatusRequest.getExample();
        OASGetOfferCardsContentStatusRequest getOfferCardsContentStatusRequest2 = getOfferCardsContentStatusRequest1;
        OASGetOfferCardsContentStatusRequest getOfferCardsContentStatusRequest3 = new OASGetOfferCardsContentStatusRequest();
        OASGetOfferCardsContentStatusRequest getOfferCardsContentStatusRequest4 = getOfferCardsContentStatusRequest3;

        System.assert(getOfferCardsContentStatusRequest1.equals(getOfferCardsContentStatusRequest2));
        System.assert(getOfferCardsContentStatusRequest2.equals(getOfferCardsContentStatusRequest1));
        System.assert(getOfferCardsContentStatusRequest1.equals(getOfferCardsContentStatusRequest1));
        System.assert(getOfferCardsContentStatusRequest3.equals(getOfferCardsContentStatusRequest4));
        System.assert(getOfferCardsContentStatusRequest4.equals(getOfferCardsContentStatusRequest3));
        System.assert(getOfferCardsContentStatusRequest3.equals(getOfferCardsContentStatusRequest3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASGetOfferCardsContentStatusRequest getOfferCardsContentStatusRequest1 = OASGetOfferCardsContentStatusRequest.getExample();
        OASGetOfferCardsContentStatusRequest getOfferCardsContentStatusRequest2 = OASGetOfferCardsContentStatusRequest.getExample();
        OASGetOfferCardsContentStatusRequest getOfferCardsContentStatusRequest3 = new OASGetOfferCardsContentStatusRequest();
        OASGetOfferCardsContentStatusRequest getOfferCardsContentStatusRequest4 = new OASGetOfferCardsContentStatusRequest();

        System.assert(getOfferCardsContentStatusRequest1.equals(getOfferCardsContentStatusRequest2));
        System.assert(getOfferCardsContentStatusRequest2.equals(getOfferCardsContentStatusRequest1));
        System.assert(getOfferCardsContentStatusRequest3.equals(getOfferCardsContentStatusRequest4));
        System.assert(getOfferCardsContentStatusRequest4.equals(getOfferCardsContentStatusRequest3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASGetOfferCardsContentStatusRequest getOfferCardsContentStatusRequest1 = OASGetOfferCardsContentStatusRequest.getExample();
        OASGetOfferCardsContentStatusRequest getOfferCardsContentStatusRequest2 = new OASGetOfferCardsContentStatusRequest();

        System.assertEquals(false, getOfferCardsContentStatusRequest1.equals('foo'));
        System.assertEquals(false, getOfferCardsContentStatusRequest2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASGetOfferCardsContentStatusRequest getOfferCardsContentStatusRequest1 = OASGetOfferCardsContentStatusRequest.getExample();
        OASGetOfferCardsContentStatusRequest getOfferCardsContentStatusRequest2 = new OASGetOfferCardsContentStatusRequest();
        OASGetOfferCardsContentStatusRequest getOfferCardsContentStatusRequest3;

        System.assertEquals(false, getOfferCardsContentStatusRequest1.equals(getOfferCardsContentStatusRequest3));
        System.assertEquals(false, getOfferCardsContentStatusRequest2.equals(getOfferCardsContentStatusRequest3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASGetOfferCardsContentStatusRequest getOfferCardsContentStatusRequest1 = OASGetOfferCardsContentStatusRequest.getExample();
        OASGetOfferCardsContentStatusRequest getOfferCardsContentStatusRequest2 = new OASGetOfferCardsContentStatusRequest();

        System.assertEquals(getOfferCardsContentStatusRequest1.hashCode(), getOfferCardsContentStatusRequest1.hashCode());
        System.assertEquals(getOfferCardsContentStatusRequest2.hashCode(), getOfferCardsContentStatusRequest2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASGetOfferCardsContentStatusRequest getOfferCardsContentStatusRequest1 = OASGetOfferCardsContentStatusRequest.getExample();
        OASGetOfferCardsContentStatusRequest getOfferCardsContentStatusRequest2 = OASGetOfferCardsContentStatusRequest.getExample();
        OASGetOfferCardsContentStatusRequest getOfferCardsContentStatusRequest3 = new OASGetOfferCardsContentStatusRequest();
        OASGetOfferCardsContentStatusRequest getOfferCardsContentStatusRequest4 = new OASGetOfferCardsContentStatusRequest();

        System.assert(getOfferCardsContentStatusRequest1.equals(getOfferCardsContentStatusRequest2));
        System.assert(getOfferCardsContentStatusRequest3.equals(getOfferCardsContentStatusRequest4));
        System.assertEquals(getOfferCardsContentStatusRequest1.hashCode(), getOfferCardsContentStatusRequest2.hashCode());
        System.assertEquals(getOfferCardsContentStatusRequest3.hashCode(), getOfferCardsContentStatusRequest4.hashCode());
    }

    @isTest
    private static void defaultValuesPopulated() {
        OASGetOfferCardsContentStatusRequest getOfferCardsContentStatusRequest = new OASGetOfferCardsContentStatusRequest();
        System.assertEquals(new List<String>(), getOfferCardsContentStatusRequest.offerIds);
        System.assertEquals(new List<OASOfferCardStatusType>(), getOfferCardsContentStatusRequest.cardStatuses);
        System.assertEquals(new List<Integer>(), getOfferCardsContentStatusRequest.categoryIds);
    }
}
