@isTest
private class OASOfferContentDTOTest {
    @isTest
    private static void equalsSameInstance() {
        OASOfferContentDTO offerContentDTO1 = OASOfferContentDTO.getExample();
        OASOfferContentDTO offerContentDTO2 = offerContentDTO1;
        OASOfferContentDTO offerContentDTO3 = new OASOfferContentDTO();
        OASOfferContentDTO offerContentDTO4 = offerContentDTO3;

        System.assert(offerContentDTO1.equals(offerContentDTO2));
        System.assert(offerContentDTO2.equals(offerContentDTO1));
        System.assert(offerContentDTO1.equals(offerContentDTO1));
        System.assert(offerContentDTO3.equals(offerContentDTO4));
        System.assert(offerContentDTO4.equals(offerContentDTO3));
        System.assert(offerContentDTO3.equals(offerContentDTO3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASOfferContentDTO offerContentDTO1 = OASOfferContentDTO.getExample();
        OASOfferContentDTO offerContentDTO2 = OASOfferContentDTO.getExample();
        OASOfferContentDTO offerContentDTO3 = new OASOfferContentDTO();
        OASOfferContentDTO offerContentDTO4 = new OASOfferContentDTO();

        System.assert(offerContentDTO1.equals(offerContentDTO2));
        System.assert(offerContentDTO2.equals(offerContentDTO1));
        System.assert(offerContentDTO3.equals(offerContentDTO4));
        System.assert(offerContentDTO4.equals(offerContentDTO3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASOfferContentDTO offerContentDTO1 = OASOfferContentDTO.getExample();
        OASOfferContentDTO offerContentDTO2 = new OASOfferContentDTO();

        System.assertEquals(false, offerContentDTO1.equals('foo'));
        System.assertEquals(false, offerContentDTO2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASOfferContentDTO offerContentDTO1 = OASOfferContentDTO.getExample();
        OASOfferContentDTO offerContentDTO2 = new OASOfferContentDTO();
        OASOfferContentDTO offerContentDTO3;

        System.assertEquals(false, offerContentDTO1.equals(offerContentDTO3));
        System.assertEquals(false, offerContentDTO2.equals(offerContentDTO3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASOfferContentDTO offerContentDTO1 = OASOfferContentDTO.getExample();
        OASOfferContentDTO offerContentDTO2 = new OASOfferContentDTO();

        System.assertEquals(offerContentDTO1.hashCode(), offerContentDTO1.hashCode());
        System.assertEquals(offerContentDTO2.hashCode(), offerContentDTO2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASOfferContentDTO offerContentDTO1 = OASOfferContentDTO.getExample();
        OASOfferContentDTO offerContentDTO2 = OASOfferContentDTO.getExample();
        OASOfferContentDTO offerContentDTO3 = new OASOfferContentDTO();
        OASOfferContentDTO offerContentDTO4 = new OASOfferContentDTO();

        System.assert(offerContentDTO1.equals(offerContentDTO2));
        System.assert(offerContentDTO3.equals(offerContentDTO4));
        System.assertEquals(offerContentDTO1.hashCode(), offerContentDTO2.hashCode());
        System.assertEquals(offerContentDTO3.hashCode(), offerContentDTO4.hashCode());
    }

    @isTest
    private static void defaultValuesPopulated() {
        OASOfferContentDTO offerContentDTO = new OASOfferContentDTO();
        System.assertEquals(new List<OASParameterValueDTO>(), offerContentDTO.parameterValues);
        System.assertEquals(null, offerContentDTO.offerId);
        System.assertEquals(null, offerContentDTO.categoryId);
    }
}
