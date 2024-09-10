@isTest
private class OASPriceSuggestOfferDTOTest {
    @isTest
    private static void equalsSameInstance() {
        OASPriceSuggestOfferDTO priceSuggestOfferDTO1 = OASPriceSuggestOfferDTO.getExample();
        OASPriceSuggestOfferDTO priceSuggestOfferDTO2 = priceSuggestOfferDTO1;
        OASPriceSuggestOfferDTO priceSuggestOfferDTO3 = new OASPriceSuggestOfferDTO();
        OASPriceSuggestOfferDTO priceSuggestOfferDTO4 = priceSuggestOfferDTO3;

        System.assert(priceSuggestOfferDTO1.equals(priceSuggestOfferDTO2));
        System.assert(priceSuggestOfferDTO2.equals(priceSuggestOfferDTO1));
        System.assert(priceSuggestOfferDTO1.equals(priceSuggestOfferDTO1));
        System.assert(priceSuggestOfferDTO3.equals(priceSuggestOfferDTO4));
        System.assert(priceSuggestOfferDTO4.equals(priceSuggestOfferDTO3));
        System.assert(priceSuggestOfferDTO3.equals(priceSuggestOfferDTO3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASPriceSuggestOfferDTO priceSuggestOfferDTO1 = OASPriceSuggestOfferDTO.getExample();
        OASPriceSuggestOfferDTO priceSuggestOfferDTO2 = OASPriceSuggestOfferDTO.getExample();
        OASPriceSuggestOfferDTO priceSuggestOfferDTO3 = new OASPriceSuggestOfferDTO();
        OASPriceSuggestOfferDTO priceSuggestOfferDTO4 = new OASPriceSuggestOfferDTO();

        System.assert(priceSuggestOfferDTO1.equals(priceSuggestOfferDTO2));
        System.assert(priceSuggestOfferDTO2.equals(priceSuggestOfferDTO1));
        System.assert(priceSuggestOfferDTO3.equals(priceSuggestOfferDTO4));
        System.assert(priceSuggestOfferDTO4.equals(priceSuggestOfferDTO3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASPriceSuggestOfferDTO priceSuggestOfferDTO1 = OASPriceSuggestOfferDTO.getExample();
        OASPriceSuggestOfferDTO priceSuggestOfferDTO2 = new OASPriceSuggestOfferDTO();

        System.assertEquals(false, priceSuggestOfferDTO1.equals('foo'));
        System.assertEquals(false, priceSuggestOfferDTO2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASPriceSuggestOfferDTO priceSuggestOfferDTO1 = OASPriceSuggestOfferDTO.getExample();
        OASPriceSuggestOfferDTO priceSuggestOfferDTO2 = new OASPriceSuggestOfferDTO();
        OASPriceSuggestOfferDTO priceSuggestOfferDTO3;

        System.assertEquals(false, priceSuggestOfferDTO1.equals(priceSuggestOfferDTO3));
        System.assertEquals(false, priceSuggestOfferDTO2.equals(priceSuggestOfferDTO3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASPriceSuggestOfferDTO priceSuggestOfferDTO1 = OASPriceSuggestOfferDTO.getExample();
        OASPriceSuggestOfferDTO priceSuggestOfferDTO2 = new OASPriceSuggestOfferDTO();

        System.assertEquals(priceSuggestOfferDTO1.hashCode(), priceSuggestOfferDTO1.hashCode());
        System.assertEquals(priceSuggestOfferDTO2.hashCode(), priceSuggestOfferDTO2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASPriceSuggestOfferDTO priceSuggestOfferDTO1 = OASPriceSuggestOfferDTO.getExample();
        OASPriceSuggestOfferDTO priceSuggestOfferDTO2 = OASPriceSuggestOfferDTO.getExample();
        OASPriceSuggestOfferDTO priceSuggestOfferDTO3 = new OASPriceSuggestOfferDTO();
        OASPriceSuggestOfferDTO priceSuggestOfferDTO4 = new OASPriceSuggestOfferDTO();

        System.assert(priceSuggestOfferDTO1.equals(priceSuggestOfferDTO2));
        System.assert(priceSuggestOfferDTO3.equals(priceSuggestOfferDTO4));
        System.assertEquals(priceSuggestOfferDTO1.hashCode(), priceSuggestOfferDTO2.hashCode());
        System.assertEquals(priceSuggestOfferDTO3.hashCode(), priceSuggestOfferDTO4.hashCode());
    }

    @isTest
    private static void defaultValuesPopulated() {
        OASPriceSuggestOfferDTO priceSuggestOfferDTO = new OASPriceSuggestOfferDTO();
        System.assertEquals(new List<OASPriceSuggestDTO>(), priceSuggestOfferDTO.priceSuggestion);
        System.assertEquals(null, priceSuggestOfferDTO.marketSku);
        System.assertEquals(null, priceSuggestOfferDTO.offerId);
    }
}
