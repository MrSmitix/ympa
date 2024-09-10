@isTest
private class OASOfferManualDTOTest {
    @isTest
    private static void equalsSameInstance() {
        OASOfferManualDTO offerManualDTO1 = OASOfferManualDTO.getExample();
        OASOfferManualDTO offerManualDTO2 = offerManualDTO1;
        OASOfferManualDTO offerManualDTO3 = new OASOfferManualDTO();
        OASOfferManualDTO offerManualDTO4 = offerManualDTO3;

        System.assert(offerManualDTO1.equals(offerManualDTO2));
        System.assert(offerManualDTO2.equals(offerManualDTO1));
        System.assert(offerManualDTO1.equals(offerManualDTO1));
        System.assert(offerManualDTO3.equals(offerManualDTO4));
        System.assert(offerManualDTO4.equals(offerManualDTO3));
        System.assert(offerManualDTO3.equals(offerManualDTO3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASOfferManualDTO offerManualDTO1 = OASOfferManualDTO.getExample();
        OASOfferManualDTO offerManualDTO2 = OASOfferManualDTO.getExample();
        OASOfferManualDTO offerManualDTO3 = new OASOfferManualDTO();
        OASOfferManualDTO offerManualDTO4 = new OASOfferManualDTO();

        System.assert(offerManualDTO1.equals(offerManualDTO2));
        System.assert(offerManualDTO2.equals(offerManualDTO1));
        System.assert(offerManualDTO3.equals(offerManualDTO4));
        System.assert(offerManualDTO4.equals(offerManualDTO3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASOfferManualDTO offerManualDTO1 = OASOfferManualDTO.getExample();
        OASOfferManualDTO offerManualDTO2 = new OASOfferManualDTO();

        System.assertEquals(false, offerManualDTO1.equals('foo'));
        System.assertEquals(false, offerManualDTO2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASOfferManualDTO offerManualDTO1 = OASOfferManualDTO.getExample();
        OASOfferManualDTO offerManualDTO2 = new OASOfferManualDTO();
        OASOfferManualDTO offerManualDTO3;

        System.assertEquals(false, offerManualDTO1.equals(offerManualDTO3));
        System.assertEquals(false, offerManualDTO2.equals(offerManualDTO3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASOfferManualDTO offerManualDTO1 = OASOfferManualDTO.getExample();
        OASOfferManualDTO offerManualDTO2 = new OASOfferManualDTO();

        System.assertEquals(offerManualDTO1.hashCode(), offerManualDTO1.hashCode());
        System.assertEquals(offerManualDTO2.hashCode(), offerManualDTO2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASOfferManualDTO offerManualDTO1 = OASOfferManualDTO.getExample();
        OASOfferManualDTO offerManualDTO2 = OASOfferManualDTO.getExample();
        OASOfferManualDTO offerManualDTO3 = new OASOfferManualDTO();
        OASOfferManualDTO offerManualDTO4 = new OASOfferManualDTO();

        System.assert(offerManualDTO1.equals(offerManualDTO2));
        System.assert(offerManualDTO3.equals(offerManualDTO4));
        System.assertEquals(offerManualDTO1.hashCode(), offerManualDTO2.hashCode());
        System.assertEquals(offerManualDTO3.hashCode(), offerManualDTO4.hashCode());
    }
}
