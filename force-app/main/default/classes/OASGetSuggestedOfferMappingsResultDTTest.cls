@isTest
private class OASGetSuggestedOfferMappingsResultDTTest {
    @isTest
    private static void equalsSameInstance() {
        OASGetSuggestedOfferMappingsResultDT getSuggestedOfferMappingsResultDTO1 = OASGetSuggestedOfferMappingsResultDT.getExample();
        OASGetSuggestedOfferMappingsResultDT getSuggestedOfferMappingsResultDTO2 = getSuggestedOfferMappingsResultDTO1;
        OASGetSuggestedOfferMappingsResultDT getSuggestedOfferMappingsResultDTO3 = new OASGetSuggestedOfferMappingsResultDT();
        OASGetSuggestedOfferMappingsResultDT getSuggestedOfferMappingsResultDTO4 = getSuggestedOfferMappingsResultDTO3;

        System.assert(getSuggestedOfferMappingsResultDTO1.equals(getSuggestedOfferMappingsResultDTO2));
        System.assert(getSuggestedOfferMappingsResultDTO2.equals(getSuggestedOfferMappingsResultDTO1));
        System.assert(getSuggestedOfferMappingsResultDTO1.equals(getSuggestedOfferMappingsResultDTO1));
        System.assert(getSuggestedOfferMappingsResultDTO3.equals(getSuggestedOfferMappingsResultDTO4));
        System.assert(getSuggestedOfferMappingsResultDTO4.equals(getSuggestedOfferMappingsResultDTO3));
        System.assert(getSuggestedOfferMappingsResultDTO3.equals(getSuggestedOfferMappingsResultDTO3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASGetSuggestedOfferMappingsResultDT getSuggestedOfferMappingsResultDTO1 = OASGetSuggestedOfferMappingsResultDT.getExample();
        OASGetSuggestedOfferMappingsResultDT getSuggestedOfferMappingsResultDTO2 = OASGetSuggestedOfferMappingsResultDT.getExample();
        OASGetSuggestedOfferMappingsResultDT getSuggestedOfferMappingsResultDTO3 = new OASGetSuggestedOfferMappingsResultDT();
        OASGetSuggestedOfferMappingsResultDT getSuggestedOfferMappingsResultDTO4 = new OASGetSuggestedOfferMappingsResultDT();

        System.assert(getSuggestedOfferMappingsResultDTO1.equals(getSuggestedOfferMappingsResultDTO2));
        System.assert(getSuggestedOfferMappingsResultDTO2.equals(getSuggestedOfferMappingsResultDTO1));
        System.assert(getSuggestedOfferMappingsResultDTO3.equals(getSuggestedOfferMappingsResultDTO4));
        System.assert(getSuggestedOfferMappingsResultDTO4.equals(getSuggestedOfferMappingsResultDTO3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASGetSuggestedOfferMappingsResultDT getSuggestedOfferMappingsResultDTO1 = OASGetSuggestedOfferMappingsResultDT.getExample();
        OASGetSuggestedOfferMappingsResultDT getSuggestedOfferMappingsResultDTO2 = new OASGetSuggestedOfferMappingsResultDT();

        System.assertEquals(false, getSuggestedOfferMappingsResultDTO1.equals('foo'));
        System.assertEquals(false, getSuggestedOfferMappingsResultDTO2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASGetSuggestedOfferMappingsResultDT getSuggestedOfferMappingsResultDTO1 = OASGetSuggestedOfferMappingsResultDT.getExample();
        OASGetSuggestedOfferMappingsResultDT getSuggestedOfferMappingsResultDTO2 = new OASGetSuggestedOfferMappingsResultDT();
        OASGetSuggestedOfferMappingsResultDT getSuggestedOfferMappingsResultDTO3;

        System.assertEquals(false, getSuggestedOfferMappingsResultDTO1.equals(getSuggestedOfferMappingsResultDTO3));
        System.assertEquals(false, getSuggestedOfferMappingsResultDTO2.equals(getSuggestedOfferMappingsResultDTO3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASGetSuggestedOfferMappingsResultDT getSuggestedOfferMappingsResultDTO1 = OASGetSuggestedOfferMappingsResultDT.getExample();
        OASGetSuggestedOfferMappingsResultDT getSuggestedOfferMappingsResultDTO2 = new OASGetSuggestedOfferMappingsResultDT();

        System.assertEquals(getSuggestedOfferMappingsResultDTO1.hashCode(), getSuggestedOfferMappingsResultDTO1.hashCode());
        System.assertEquals(getSuggestedOfferMappingsResultDTO2.hashCode(), getSuggestedOfferMappingsResultDTO2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASGetSuggestedOfferMappingsResultDT getSuggestedOfferMappingsResultDTO1 = OASGetSuggestedOfferMappingsResultDT.getExample();
        OASGetSuggestedOfferMappingsResultDT getSuggestedOfferMappingsResultDTO2 = OASGetSuggestedOfferMappingsResultDT.getExample();
        OASGetSuggestedOfferMappingsResultDT getSuggestedOfferMappingsResultDTO3 = new OASGetSuggestedOfferMappingsResultDT();
        OASGetSuggestedOfferMappingsResultDT getSuggestedOfferMappingsResultDTO4 = new OASGetSuggestedOfferMappingsResultDT();

        System.assert(getSuggestedOfferMappingsResultDTO1.equals(getSuggestedOfferMappingsResultDTO2));
        System.assert(getSuggestedOfferMappingsResultDTO3.equals(getSuggestedOfferMappingsResultDTO4));
        System.assertEquals(getSuggestedOfferMappingsResultDTO1.hashCode(), getSuggestedOfferMappingsResultDTO2.hashCode());
        System.assertEquals(getSuggestedOfferMappingsResultDTO3.hashCode(), getSuggestedOfferMappingsResultDTO4.hashCode());
    }

    @isTest
    private static void defaultValuesPopulated() {
        OASGetSuggestedOfferMappingsResultDT getSuggestedOfferMappingsResultDTO = new OASGetSuggestedOfferMappingsResultDT();
        System.assertEquals(new List<OASSuggestedOfferMappingDTO>(), getSuggestedOfferMappingsResultDTO.offers);
    }
}
