@isTest
private class OASOfferDTOTest {
    @isTest
    private static void equalsSameInstance() {
        OASOfferDTO offerDTO1 = OASOfferDTO.getExample();
        OASOfferDTO offerDTO2 = offerDTO1;
        OASOfferDTO offerDTO3 = new OASOfferDTO();
        OASOfferDTO offerDTO4 = offerDTO3;

        System.assert(offerDTO1.equals(offerDTO2));
        System.assert(offerDTO2.equals(offerDTO1));
        System.assert(offerDTO1.equals(offerDTO1));
        System.assert(offerDTO3.equals(offerDTO4));
        System.assert(offerDTO4.equals(offerDTO3));
        System.assert(offerDTO3.equals(offerDTO3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASOfferDTO offerDTO1 = OASOfferDTO.getExample();
        OASOfferDTO offerDTO2 = OASOfferDTO.getExample();
        OASOfferDTO offerDTO3 = new OASOfferDTO();
        OASOfferDTO offerDTO4 = new OASOfferDTO();

        System.assert(offerDTO1.equals(offerDTO2));
        System.assert(offerDTO2.equals(offerDTO1));
        System.assert(offerDTO3.equals(offerDTO4));
        System.assert(offerDTO4.equals(offerDTO3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASOfferDTO offerDTO1 = OASOfferDTO.getExample();
        OASOfferDTO offerDTO2 = new OASOfferDTO();

        System.assertEquals(false, offerDTO1.equals('foo'));
        System.assertEquals(false, offerDTO2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASOfferDTO offerDTO1 = OASOfferDTO.getExample();
        OASOfferDTO offerDTO2 = new OASOfferDTO();
        OASOfferDTO offerDTO3;

        System.assertEquals(false, offerDTO1.equals(offerDTO3));
        System.assertEquals(false, offerDTO2.equals(offerDTO3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASOfferDTO offerDTO1 = OASOfferDTO.getExample();
        OASOfferDTO offerDTO2 = new OASOfferDTO();

        System.assertEquals(offerDTO1.hashCode(), offerDTO1.hashCode());
        System.assertEquals(offerDTO2.hashCode(), offerDTO2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASOfferDTO offerDTO1 = OASOfferDTO.getExample();
        OASOfferDTO offerDTO2 = OASOfferDTO.getExample();
        OASOfferDTO offerDTO3 = new OASOfferDTO();
        OASOfferDTO offerDTO4 = new OASOfferDTO();

        System.assert(offerDTO1.equals(offerDTO2));
        System.assert(offerDTO3.equals(offerDTO4));
        System.assertEquals(offerDTO1.hashCode(), offerDTO2.hashCode());
        System.assertEquals(offerDTO3.hashCode(), offerDTO4.hashCode());
    }

    @isTest
    private static void maintainRenamedProperties() {
        OASOfferDTO offerDTO = new OASOfferDTO();
        Map<String, String> x-property-mappings = offerDTO.getx-property-mappings();
        System.assertEquals('r_currency', x-property-mappings.get('currency'));
    }
}
