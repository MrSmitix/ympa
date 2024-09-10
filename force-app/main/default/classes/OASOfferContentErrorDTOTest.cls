@isTest
private class OASOfferContentErrorDTOTest {
    @isTest
    private static void equalsSameInstance() {
        OASOfferContentErrorDTO offerContentErrorDTO1 = OASOfferContentErrorDTO.getExample();
        OASOfferContentErrorDTO offerContentErrorDTO2 = offerContentErrorDTO1;
        OASOfferContentErrorDTO offerContentErrorDTO3 = new OASOfferContentErrorDTO();
        OASOfferContentErrorDTO offerContentErrorDTO4 = offerContentErrorDTO3;

        System.assert(offerContentErrorDTO1.equals(offerContentErrorDTO2));
        System.assert(offerContentErrorDTO2.equals(offerContentErrorDTO1));
        System.assert(offerContentErrorDTO1.equals(offerContentErrorDTO1));
        System.assert(offerContentErrorDTO3.equals(offerContentErrorDTO4));
        System.assert(offerContentErrorDTO4.equals(offerContentErrorDTO3));
        System.assert(offerContentErrorDTO3.equals(offerContentErrorDTO3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASOfferContentErrorDTO offerContentErrorDTO1 = OASOfferContentErrorDTO.getExample();
        OASOfferContentErrorDTO offerContentErrorDTO2 = OASOfferContentErrorDTO.getExample();
        OASOfferContentErrorDTO offerContentErrorDTO3 = new OASOfferContentErrorDTO();
        OASOfferContentErrorDTO offerContentErrorDTO4 = new OASOfferContentErrorDTO();

        System.assert(offerContentErrorDTO1.equals(offerContentErrorDTO2));
        System.assert(offerContentErrorDTO2.equals(offerContentErrorDTO1));
        System.assert(offerContentErrorDTO3.equals(offerContentErrorDTO4));
        System.assert(offerContentErrorDTO4.equals(offerContentErrorDTO3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASOfferContentErrorDTO offerContentErrorDTO1 = OASOfferContentErrorDTO.getExample();
        OASOfferContentErrorDTO offerContentErrorDTO2 = new OASOfferContentErrorDTO();

        System.assertEquals(false, offerContentErrorDTO1.equals('foo'));
        System.assertEquals(false, offerContentErrorDTO2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASOfferContentErrorDTO offerContentErrorDTO1 = OASOfferContentErrorDTO.getExample();
        OASOfferContentErrorDTO offerContentErrorDTO2 = new OASOfferContentErrorDTO();
        OASOfferContentErrorDTO offerContentErrorDTO3;

        System.assertEquals(false, offerContentErrorDTO1.equals(offerContentErrorDTO3));
        System.assertEquals(false, offerContentErrorDTO2.equals(offerContentErrorDTO3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASOfferContentErrorDTO offerContentErrorDTO1 = OASOfferContentErrorDTO.getExample();
        OASOfferContentErrorDTO offerContentErrorDTO2 = new OASOfferContentErrorDTO();

        System.assertEquals(offerContentErrorDTO1.hashCode(), offerContentErrorDTO1.hashCode());
        System.assertEquals(offerContentErrorDTO2.hashCode(), offerContentErrorDTO2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASOfferContentErrorDTO offerContentErrorDTO1 = OASOfferContentErrorDTO.getExample();
        OASOfferContentErrorDTO offerContentErrorDTO2 = OASOfferContentErrorDTO.getExample();
        OASOfferContentErrorDTO offerContentErrorDTO3 = new OASOfferContentErrorDTO();
        OASOfferContentErrorDTO offerContentErrorDTO4 = new OASOfferContentErrorDTO();

        System.assert(offerContentErrorDTO1.equals(offerContentErrorDTO2));
        System.assert(offerContentErrorDTO3.equals(offerContentErrorDTO4));
        System.assertEquals(offerContentErrorDTO1.hashCode(), offerContentErrorDTO2.hashCode());
        System.assertEquals(offerContentErrorDTO3.hashCode(), offerContentErrorDTO4.hashCode());
    }
}
