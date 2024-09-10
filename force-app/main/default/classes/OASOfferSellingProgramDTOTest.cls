@isTest
private class OASOfferSellingProgramDTOTest {
    @isTest
    private static void equalsSameInstance() {
        OASOfferSellingProgramDTO offerSellingProgramDTO1 = OASOfferSellingProgramDTO.getExample();
        OASOfferSellingProgramDTO offerSellingProgramDTO2 = offerSellingProgramDTO1;
        OASOfferSellingProgramDTO offerSellingProgramDTO3 = new OASOfferSellingProgramDTO();
        OASOfferSellingProgramDTO offerSellingProgramDTO4 = offerSellingProgramDTO3;

        System.assert(offerSellingProgramDTO1.equals(offerSellingProgramDTO2));
        System.assert(offerSellingProgramDTO2.equals(offerSellingProgramDTO1));
        System.assert(offerSellingProgramDTO1.equals(offerSellingProgramDTO1));
        System.assert(offerSellingProgramDTO3.equals(offerSellingProgramDTO4));
        System.assert(offerSellingProgramDTO4.equals(offerSellingProgramDTO3));
        System.assert(offerSellingProgramDTO3.equals(offerSellingProgramDTO3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASOfferSellingProgramDTO offerSellingProgramDTO1 = OASOfferSellingProgramDTO.getExample();
        OASOfferSellingProgramDTO offerSellingProgramDTO2 = OASOfferSellingProgramDTO.getExample();
        OASOfferSellingProgramDTO offerSellingProgramDTO3 = new OASOfferSellingProgramDTO();
        OASOfferSellingProgramDTO offerSellingProgramDTO4 = new OASOfferSellingProgramDTO();

        System.assert(offerSellingProgramDTO1.equals(offerSellingProgramDTO2));
        System.assert(offerSellingProgramDTO2.equals(offerSellingProgramDTO1));
        System.assert(offerSellingProgramDTO3.equals(offerSellingProgramDTO4));
        System.assert(offerSellingProgramDTO4.equals(offerSellingProgramDTO3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASOfferSellingProgramDTO offerSellingProgramDTO1 = OASOfferSellingProgramDTO.getExample();
        OASOfferSellingProgramDTO offerSellingProgramDTO2 = new OASOfferSellingProgramDTO();

        System.assertEquals(false, offerSellingProgramDTO1.equals('foo'));
        System.assertEquals(false, offerSellingProgramDTO2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASOfferSellingProgramDTO offerSellingProgramDTO1 = OASOfferSellingProgramDTO.getExample();
        OASOfferSellingProgramDTO offerSellingProgramDTO2 = new OASOfferSellingProgramDTO();
        OASOfferSellingProgramDTO offerSellingProgramDTO3;

        System.assertEquals(false, offerSellingProgramDTO1.equals(offerSellingProgramDTO3));
        System.assertEquals(false, offerSellingProgramDTO2.equals(offerSellingProgramDTO3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASOfferSellingProgramDTO offerSellingProgramDTO1 = OASOfferSellingProgramDTO.getExample();
        OASOfferSellingProgramDTO offerSellingProgramDTO2 = new OASOfferSellingProgramDTO();

        System.assertEquals(offerSellingProgramDTO1.hashCode(), offerSellingProgramDTO1.hashCode());
        System.assertEquals(offerSellingProgramDTO2.hashCode(), offerSellingProgramDTO2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASOfferSellingProgramDTO offerSellingProgramDTO1 = OASOfferSellingProgramDTO.getExample();
        OASOfferSellingProgramDTO offerSellingProgramDTO2 = OASOfferSellingProgramDTO.getExample();
        OASOfferSellingProgramDTO offerSellingProgramDTO3 = new OASOfferSellingProgramDTO();
        OASOfferSellingProgramDTO offerSellingProgramDTO4 = new OASOfferSellingProgramDTO();

        System.assert(offerSellingProgramDTO1.equals(offerSellingProgramDTO2));
        System.assert(offerSellingProgramDTO3.equals(offerSellingProgramDTO4));
        System.assertEquals(offerSellingProgramDTO1.hashCode(), offerSellingProgramDTO2.hashCode());
        System.assertEquals(offerSellingProgramDTO3.hashCode(), offerSellingProgramDTO4.hashCode());
    }
}
