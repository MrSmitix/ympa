@isTest
private class OASOfferCardsContentStatusDTOTest {
    @isTest
    private static void equalsSameInstance() {
        OASOfferCardsContentStatusDTO offerCardsContentStatusDTO1 = OASOfferCardsContentStatusDTO.getExample();
        OASOfferCardsContentStatusDTO offerCardsContentStatusDTO2 = offerCardsContentStatusDTO1;
        OASOfferCardsContentStatusDTO offerCardsContentStatusDTO3 = new OASOfferCardsContentStatusDTO();
        OASOfferCardsContentStatusDTO offerCardsContentStatusDTO4 = offerCardsContentStatusDTO3;

        System.assert(offerCardsContentStatusDTO1.equals(offerCardsContentStatusDTO2));
        System.assert(offerCardsContentStatusDTO2.equals(offerCardsContentStatusDTO1));
        System.assert(offerCardsContentStatusDTO1.equals(offerCardsContentStatusDTO1));
        System.assert(offerCardsContentStatusDTO3.equals(offerCardsContentStatusDTO4));
        System.assert(offerCardsContentStatusDTO4.equals(offerCardsContentStatusDTO3));
        System.assert(offerCardsContentStatusDTO3.equals(offerCardsContentStatusDTO3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASOfferCardsContentStatusDTO offerCardsContentStatusDTO1 = OASOfferCardsContentStatusDTO.getExample();
        OASOfferCardsContentStatusDTO offerCardsContentStatusDTO2 = OASOfferCardsContentStatusDTO.getExample();
        OASOfferCardsContentStatusDTO offerCardsContentStatusDTO3 = new OASOfferCardsContentStatusDTO();
        OASOfferCardsContentStatusDTO offerCardsContentStatusDTO4 = new OASOfferCardsContentStatusDTO();

        System.assert(offerCardsContentStatusDTO1.equals(offerCardsContentStatusDTO2));
        System.assert(offerCardsContentStatusDTO2.equals(offerCardsContentStatusDTO1));
        System.assert(offerCardsContentStatusDTO3.equals(offerCardsContentStatusDTO4));
        System.assert(offerCardsContentStatusDTO4.equals(offerCardsContentStatusDTO3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASOfferCardsContentStatusDTO offerCardsContentStatusDTO1 = OASOfferCardsContentStatusDTO.getExample();
        OASOfferCardsContentStatusDTO offerCardsContentStatusDTO2 = new OASOfferCardsContentStatusDTO();

        System.assertEquals(false, offerCardsContentStatusDTO1.equals('foo'));
        System.assertEquals(false, offerCardsContentStatusDTO2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASOfferCardsContentStatusDTO offerCardsContentStatusDTO1 = OASOfferCardsContentStatusDTO.getExample();
        OASOfferCardsContentStatusDTO offerCardsContentStatusDTO2 = new OASOfferCardsContentStatusDTO();
        OASOfferCardsContentStatusDTO offerCardsContentStatusDTO3;

        System.assertEquals(false, offerCardsContentStatusDTO1.equals(offerCardsContentStatusDTO3));
        System.assertEquals(false, offerCardsContentStatusDTO2.equals(offerCardsContentStatusDTO3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASOfferCardsContentStatusDTO offerCardsContentStatusDTO1 = OASOfferCardsContentStatusDTO.getExample();
        OASOfferCardsContentStatusDTO offerCardsContentStatusDTO2 = new OASOfferCardsContentStatusDTO();

        System.assertEquals(offerCardsContentStatusDTO1.hashCode(), offerCardsContentStatusDTO1.hashCode());
        System.assertEquals(offerCardsContentStatusDTO2.hashCode(), offerCardsContentStatusDTO2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASOfferCardsContentStatusDTO offerCardsContentStatusDTO1 = OASOfferCardsContentStatusDTO.getExample();
        OASOfferCardsContentStatusDTO offerCardsContentStatusDTO2 = OASOfferCardsContentStatusDTO.getExample();
        OASOfferCardsContentStatusDTO offerCardsContentStatusDTO3 = new OASOfferCardsContentStatusDTO();
        OASOfferCardsContentStatusDTO offerCardsContentStatusDTO4 = new OASOfferCardsContentStatusDTO();

        System.assert(offerCardsContentStatusDTO1.equals(offerCardsContentStatusDTO2));
        System.assert(offerCardsContentStatusDTO3.equals(offerCardsContentStatusDTO4));
        System.assertEquals(offerCardsContentStatusDTO1.hashCode(), offerCardsContentStatusDTO2.hashCode());
        System.assertEquals(offerCardsContentStatusDTO3.hashCode(), offerCardsContentStatusDTO4.hashCode());
    }

    @isTest
    private static void defaultValuesPopulated() {
        OASOfferCardsContentStatusDTO offerCardsContentStatusDTO = new OASOfferCardsContentStatusDTO();
        System.assertEquals(new List<OASOfferCardDTO>(), offerCardsContentStatusDTO.offerCards);
        System.assertEquals(null, offerCardsContentStatusDTO.paging);
    }
}
