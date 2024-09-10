@isTest
private class OASOfferConditionDTOTest {
    @isTest
    private static void equalsSameInstance() {
        OASOfferConditionDTO offerConditionDTO1 = OASOfferConditionDTO.getExample();
        OASOfferConditionDTO offerConditionDTO2 = offerConditionDTO1;
        OASOfferConditionDTO offerConditionDTO3 = new OASOfferConditionDTO();
        OASOfferConditionDTO offerConditionDTO4 = offerConditionDTO3;

        System.assert(offerConditionDTO1.equals(offerConditionDTO2));
        System.assert(offerConditionDTO2.equals(offerConditionDTO1));
        System.assert(offerConditionDTO1.equals(offerConditionDTO1));
        System.assert(offerConditionDTO3.equals(offerConditionDTO4));
        System.assert(offerConditionDTO4.equals(offerConditionDTO3));
        System.assert(offerConditionDTO3.equals(offerConditionDTO3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASOfferConditionDTO offerConditionDTO1 = OASOfferConditionDTO.getExample();
        OASOfferConditionDTO offerConditionDTO2 = OASOfferConditionDTO.getExample();
        OASOfferConditionDTO offerConditionDTO3 = new OASOfferConditionDTO();
        OASOfferConditionDTO offerConditionDTO4 = new OASOfferConditionDTO();

        System.assert(offerConditionDTO1.equals(offerConditionDTO2));
        System.assert(offerConditionDTO2.equals(offerConditionDTO1));
        System.assert(offerConditionDTO3.equals(offerConditionDTO4));
        System.assert(offerConditionDTO4.equals(offerConditionDTO3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASOfferConditionDTO offerConditionDTO1 = OASOfferConditionDTO.getExample();
        OASOfferConditionDTO offerConditionDTO2 = new OASOfferConditionDTO();

        System.assertEquals(false, offerConditionDTO1.equals('foo'));
        System.assertEquals(false, offerConditionDTO2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASOfferConditionDTO offerConditionDTO1 = OASOfferConditionDTO.getExample();
        OASOfferConditionDTO offerConditionDTO2 = new OASOfferConditionDTO();
        OASOfferConditionDTO offerConditionDTO3;

        System.assertEquals(false, offerConditionDTO1.equals(offerConditionDTO3));
        System.assertEquals(false, offerConditionDTO2.equals(offerConditionDTO3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASOfferConditionDTO offerConditionDTO1 = OASOfferConditionDTO.getExample();
        OASOfferConditionDTO offerConditionDTO2 = new OASOfferConditionDTO();

        System.assertEquals(offerConditionDTO1.hashCode(), offerConditionDTO1.hashCode());
        System.assertEquals(offerConditionDTO2.hashCode(), offerConditionDTO2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASOfferConditionDTO offerConditionDTO1 = OASOfferConditionDTO.getExample();
        OASOfferConditionDTO offerConditionDTO2 = OASOfferConditionDTO.getExample();
        OASOfferConditionDTO offerConditionDTO3 = new OASOfferConditionDTO();
        OASOfferConditionDTO offerConditionDTO4 = new OASOfferConditionDTO();

        System.assert(offerConditionDTO1.equals(offerConditionDTO2));
        System.assert(offerConditionDTO3.equals(offerConditionDTO4));
        System.assertEquals(offerConditionDTO1.hashCode(), offerConditionDTO2.hashCode());
        System.assertEquals(offerConditionDTO3.hashCode(), offerConditionDTO4.hashCode());
    }
}
