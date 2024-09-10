@isTest
private class OASOfferErrorDTOTest {
    @isTest
    private static void equalsSameInstance() {
        OASOfferErrorDTO offerErrorDTO1 = OASOfferErrorDTO.getExample();
        OASOfferErrorDTO offerErrorDTO2 = offerErrorDTO1;
        OASOfferErrorDTO offerErrorDTO3 = new OASOfferErrorDTO();
        OASOfferErrorDTO offerErrorDTO4 = offerErrorDTO3;

        System.assert(offerErrorDTO1.equals(offerErrorDTO2));
        System.assert(offerErrorDTO2.equals(offerErrorDTO1));
        System.assert(offerErrorDTO1.equals(offerErrorDTO1));
        System.assert(offerErrorDTO3.equals(offerErrorDTO4));
        System.assert(offerErrorDTO4.equals(offerErrorDTO3));
        System.assert(offerErrorDTO3.equals(offerErrorDTO3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASOfferErrorDTO offerErrorDTO1 = OASOfferErrorDTO.getExample();
        OASOfferErrorDTO offerErrorDTO2 = OASOfferErrorDTO.getExample();
        OASOfferErrorDTO offerErrorDTO3 = new OASOfferErrorDTO();
        OASOfferErrorDTO offerErrorDTO4 = new OASOfferErrorDTO();

        System.assert(offerErrorDTO1.equals(offerErrorDTO2));
        System.assert(offerErrorDTO2.equals(offerErrorDTO1));
        System.assert(offerErrorDTO3.equals(offerErrorDTO4));
        System.assert(offerErrorDTO4.equals(offerErrorDTO3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASOfferErrorDTO offerErrorDTO1 = OASOfferErrorDTO.getExample();
        OASOfferErrorDTO offerErrorDTO2 = new OASOfferErrorDTO();

        System.assertEquals(false, offerErrorDTO1.equals('foo'));
        System.assertEquals(false, offerErrorDTO2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASOfferErrorDTO offerErrorDTO1 = OASOfferErrorDTO.getExample();
        OASOfferErrorDTO offerErrorDTO2 = new OASOfferErrorDTO();
        OASOfferErrorDTO offerErrorDTO3;

        System.assertEquals(false, offerErrorDTO1.equals(offerErrorDTO3));
        System.assertEquals(false, offerErrorDTO2.equals(offerErrorDTO3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASOfferErrorDTO offerErrorDTO1 = OASOfferErrorDTO.getExample();
        OASOfferErrorDTO offerErrorDTO2 = new OASOfferErrorDTO();

        System.assertEquals(offerErrorDTO1.hashCode(), offerErrorDTO1.hashCode());
        System.assertEquals(offerErrorDTO2.hashCode(), offerErrorDTO2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASOfferErrorDTO offerErrorDTO1 = OASOfferErrorDTO.getExample();
        OASOfferErrorDTO offerErrorDTO2 = OASOfferErrorDTO.getExample();
        OASOfferErrorDTO offerErrorDTO3 = new OASOfferErrorDTO();
        OASOfferErrorDTO offerErrorDTO4 = new OASOfferErrorDTO();

        System.assert(offerErrorDTO1.equals(offerErrorDTO2));
        System.assert(offerErrorDTO3.equals(offerErrorDTO4));
        System.assertEquals(offerErrorDTO1.hashCode(), offerErrorDTO2.hashCode());
        System.assertEquals(offerErrorDTO3.hashCode(), offerErrorDTO4.hashCode());
    }
}
