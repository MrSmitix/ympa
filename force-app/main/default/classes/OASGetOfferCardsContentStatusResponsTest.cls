@isTest
private class OASGetOfferCardsContentStatusResponsTest {
    @isTest
    private static void equalsSameInstance() {
        OASGetOfferCardsContentStatusRespons getOfferCardsContentStatusResponse1 = OASGetOfferCardsContentStatusRespons.getExample();
        OASGetOfferCardsContentStatusRespons getOfferCardsContentStatusResponse2 = getOfferCardsContentStatusResponse1;
        OASGetOfferCardsContentStatusRespons getOfferCardsContentStatusResponse3 = new OASGetOfferCardsContentStatusRespons();
        OASGetOfferCardsContentStatusRespons getOfferCardsContentStatusResponse4 = getOfferCardsContentStatusResponse3;

        System.assert(getOfferCardsContentStatusResponse1.equals(getOfferCardsContentStatusResponse2));
        System.assert(getOfferCardsContentStatusResponse2.equals(getOfferCardsContentStatusResponse1));
        System.assert(getOfferCardsContentStatusResponse1.equals(getOfferCardsContentStatusResponse1));
        System.assert(getOfferCardsContentStatusResponse3.equals(getOfferCardsContentStatusResponse4));
        System.assert(getOfferCardsContentStatusResponse4.equals(getOfferCardsContentStatusResponse3));
        System.assert(getOfferCardsContentStatusResponse3.equals(getOfferCardsContentStatusResponse3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASGetOfferCardsContentStatusRespons getOfferCardsContentStatusResponse1 = OASGetOfferCardsContentStatusRespons.getExample();
        OASGetOfferCardsContentStatusRespons getOfferCardsContentStatusResponse2 = OASGetOfferCardsContentStatusRespons.getExample();
        OASGetOfferCardsContentStatusRespons getOfferCardsContentStatusResponse3 = new OASGetOfferCardsContentStatusRespons();
        OASGetOfferCardsContentStatusRespons getOfferCardsContentStatusResponse4 = new OASGetOfferCardsContentStatusRespons();

        System.assert(getOfferCardsContentStatusResponse1.equals(getOfferCardsContentStatusResponse2));
        System.assert(getOfferCardsContentStatusResponse2.equals(getOfferCardsContentStatusResponse1));
        System.assert(getOfferCardsContentStatusResponse3.equals(getOfferCardsContentStatusResponse4));
        System.assert(getOfferCardsContentStatusResponse4.equals(getOfferCardsContentStatusResponse3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASGetOfferCardsContentStatusRespons getOfferCardsContentStatusResponse1 = OASGetOfferCardsContentStatusRespons.getExample();
        OASGetOfferCardsContentStatusRespons getOfferCardsContentStatusResponse2 = new OASGetOfferCardsContentStatusRespons();

        System.assertEquals(false, getOfferCardsContentStatusResponse1.equals('foo'));
        System.assertEquals(false, getOfferCardsContentStatusResponse2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASGetOfferCardsContentStatusRespons getOfferCardsContentStatusResponse1 = OASGetOfferCardsContentStatusRespons.getExample();
        OASGetOfferCardsContentStatusRespons getOfferCardsContentStatusResponse2 = new OASGetOfferCardsContentStatusRespons();
        OASGetOfferCardsContentStatusRespons getOfferCardsContentStatusResponse3;

        System.assertEquals(false, getOfferCardsContentStatusResponse1.equals(getOfferCardsContentStatusResponse3));
        System.assertEquals(false, getOfferCardsContentStatusResponse2.equals(getOfferCardsContentStatusResponse3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASGetOfferCardsContentStatusRespons getOfferCardsContentStatusResponse1 = OASGetOfferCardsContentStatusRespons.getExample();
        OASGetOfferCardsContentStatusRespons getOfferCardsContentStatusResponse2 = new OASGetOfferCardsContentStatusRespons();

        System.assertEquals(getOfferCardsContentStatusResponse1.hashCode(), getOfferCardsContentStatusResponse1.hashCode());
        System.assertEquals(getOfferCardsContentStatusResponse2.hashCode(), getOfferCardsContentStatusResponse2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASGetOfferCardsContentStatusRespons getOfferCardsContentStatusResponse1 = OASGetOfferCardsContentStatusRespons.getExample();
        OASGetOfferCardsContentStatusRespons getOfferCardsContentStatusResponse2 = OASGetOfferCardsContentStatusRespons.getExample();
        OASGetOfferCardsContentStatusRespons getOfferCardsContentStatusResponse3 = new OASGetOfferCardsContentStatusRespons();
        OASGetOfferCardsContentStatusRespons getOfferCardsContentStatusResponse4 = new OASGetOfferCardsContentStatusRespons();

        System.assert(getOfferCardsContentStatusResponse1.equals(getOfferCardsContentStatusResponse2));
        System.assert(getOfferCardsContentStatusResponse3.equals(getOfferCardsContentStatusResponse4));
        System.assertEquals(getOfferCardsContentStatusResponse1.hashCode(), getOfferCardsContentStatusResponse2.hashCode());
        System.assertEquals(getOfferCardsContentStatusResponse3.hashCode(), getOfferCardsContentStatusResponse4.hashCode());
    }
}
