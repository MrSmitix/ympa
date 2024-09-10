@isTest
private class OASOfferPriceByOfferIdsListResponseDTest {
    @isTest
    private static void equalsSameInstance() {
        OASOfferPriceByOfferIdsListResponseD offerPriceByOfferIdsListResponseDTO1 = OASOfferPriceByOfferIdsListResponseD.getExample();
        OASOfferPriceByOfferIdsListResponseD offerPriceByOfferIdsListResponseDTO2 = offerPriceByOfferIdsListResponseDTO1;
        OASOfferPriceByOfferIdsListResponseD offerPriceByOfferIdsListResponseDTO3 = new OASOfferPriceByOfferIdsListResponseD();
        OASOfferPriceByOfferIdsListResponseD offerPriceByOfferIdsListResponseDTO4 = offerPriceByOfferIdsListResponseDTO3;

        System.assert(offerPriceByOfferIdsListResponseDTO1.equals(offerPriceByOfferIdsListResponseDTO2));
        System.assert(offerPriceByOfferIdsListResponseDTO2.equals(offerPriceByOfferIdsListResponseDTO1));
        System.assert(offerPriceByOfferIdsListResponseDTO1.equals(offerPriceByOfferIdsListResponseDTO1));
        System.assert(offerPriceByOfferIdsListResponseDTO3.equals(offerPriceByOfferIdsListResponseDTO4));
        System.assert(offerPriceByOfferIdsListResponseDTO4.equals(offerPriceByOfferIdsListResponseDTO3));
        System.assert(offerPriceByOfferIdsListResponseDTO3.equals(offerPriceByOfferIdsListResponseDTO3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASOfferPriceByOfferIdsListResponseD offerPriceByOfferIdsListResponseDTO1 = OASOfferPriceByOfferIdsListResponseD.getExample();
        OASOfferPriceByOfferIdsListResponseD offerPriceByOfferIdsListResponseDTO2 = OASOfferPriceByOfferIdsListResponseD.getExample();
        OASOfferPriceByOfferIdsListResponseD offerPriceByOfferIdsListResponseDTO3 = new OASOfferPriceByOfferIdsListResponseD();
        OASOfferPriceByOfferIdsListResponseD offerPriceByOfferIdsListResponseDTO4 = new OASOfferPriceByOfferIdsListResponseD();

        System.assert(offerPriceByOfferIdsListResponseDTO1.equals(offerPriceByOfferIdsListResponseDTO2));
        System.assert(offerPriceByOfferIdsListResponseDTO2.equals(offerPriceByOfferIdsListResponseDTO1));
        System.assert(offerPriceByOfferIdsListResponseDTO3.equals(offerPriceByOfferIdsListResponseDTO4));
        System.assert(offerPriceByOfferIdsListResponseDTO4.equals(offerPriceByOfferIdsListResponseDTO3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASOfferPriceByOfferIdsListResponseD offerPriceByOfferIdsListResponseDTO1 = OASOfferPriceByOfferIdsListResponseD.getExample();
        OASOfferPriceByOfferIdsListResponseD offerPriceByOfferIdsListResponseDTO2 = new OASOfferPriceByOfferIdsListResponseD();

        System.assertEquals(false, offerPriceByOfferIdsListResponseDTO1.equals('foo'));
        System.assertEquals(false, offerPriceByOfferIdsListResponseDTO2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASOfferPriceByOfferIdsListResponseD offerPriceByOfferIdsListResponseDTO1 = OASOfferPriceByOfferIdsListResponseD.getExample();
        OASOfferPriceByOfferIdsListResponseD offerPriceByOfferIdsListResponseDTO2 = new OASOfferPriceByOfferIdsListResponseD();
        OASOfferPriceByOfferIdsListResponseD offerPriceByOfferIdsListResponseDTO3;

        System.assertEquals(false, offerPriceByOfferIdsListResponseDTO1.equals(offerPriceByOfferIdsListResponseDTO3));
        System.assertEquals(false, offerPriceByOfferIdsListResponseDTO2.equals(offerPriceByOfferIdsListResponseDTO3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASOfferPriceByOfferIdsListResponseD offerPriceByOfferIdsListResponseDTO1 = OASOfferPriceByOfferIdsListResponseD.getExample();
        OASOfferPriceByOfferIdsListResponseD offerPriceByOfferIdsListResponseDTO2 = new OASOfferPriceByOfferIdsListResponseD();

        System.assertEquals(offerPriceByOfferIdsListResponseDTO1.hashCode(), offerPriceByOfferIdsListResponseDTO1.hashCode());
        System.assertEquals(offerPriceByOfferIdsListResponseDTO2.hashCode(), offerPriceByOfferIdsListResponseDTO2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASOfferPriceByOfferIdsListResponseD offerPriceByOfferIdsListResponseDTO1 = OASOfferPriceByOfferIdsListResponseD.getExample();
        OASOfferPriceByOfferIdsListResponseD offerPriceByOfferIdsListResponseDTO2 = OASOfferPriceByOfferIdsListResponseD.getExample();
        OASOfferPriceByOfferIdsListResponseD offerPriceByOfferIdsListResponseDTO3 = new OASOfferPriceByOfferIdsListResponseD();
        OASOfferPriceByOfferIdsListResponseD offerPriceByOfferIdsListResponseDTO4 = new OASOfferPriceByOfferIdsListResponseD();

        System.assert(offerPriceByOfferIdsListResponseDTO1.equals(offerPriceByOfferIdsListResponseDTO2));
        System.assert(offerPriceByOfferIdsListResponseDTO3.equals(offerPriceByOfferIdsListResponseDTO4));
        System.assertEquals(offerPriceByOfferIdsListResponseDTO1.hashCode(), offerPriceByOfferIdsListResponseDTO2.hashCode());
        System.assertEquals(offerPriceByOfferIdsListResponseDTO3.hashCode(), offerPriceByOfferIdsListResponseDTO4.hashCode());
    }

    @isTest
    private static void defaultValuesPopulated() {
        OASOfferPriceByOfferIdsListResponseD offerPriceByOfferIdsListResponseDTO = new OASOfferPriceByOfferIdsListResponseD();
        System.assertEquals(new List<OASOfferPriceByOfferIdsResponseDTO>(), offerPriceByOfferIdsListResponseDTO.offers);
        System.assertEquals(null, offerPriceByOfferIdsListResponseDTO.paging);
    }
}
