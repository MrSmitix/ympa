@isTest
private class OASGetOfferMappingsResultDTOTest {
    @isTest
    private static void equalsSameInstance() {
        OASGetOfferMappingsResultDTO getOfferMappingsResultDTO1 = OASGetOfferMappingsResultDTO.getExample();
        OASGetOfferMappingsResultDTO getOfferMappingsResultDTO2 = getOfferMappingsResultDTO1;
        OASGetOfferMappingsResultDTO getOfferMappingsResultDTO3 = new OASGetOfferMappingsResultDTO();
        OASGetOfferMappingsResultDTO getOfferMappingsResultDTO4 = getOfferMappingsResultDTO3;

        System.assert(getOfferMappingsResultDTO1.equals(getOfferMappingsResultDTO2));
        System.assert(getOfferMappingsResultDTO2.equals(getOfferMappingsResultDTO1));
        System.assert(getOfferMappingsResultDTO1.equals(getOfferMappingsResultDTO1));
        System.assert(getOfferMappingsResultDTO3.equals(getOfferMappingsResultDTO4));
        System.assert(getOfferMappingsResultDTO4.equals(getOfferMappingsResultDTO3));
        System.assert(getOfferMappingsResultDTO3.equals(getOfferMappingsResultDTO3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASGetOfferMappingsResultDTO getOfferMappingsResultDTO1 = OASGetOfferMappingsResultDTO.getExample();
        OASGetOfferMappingsResultDTO getOfferMappingsResultDTO2 = OASGetOfferMappingsResultDTO.getExample();
        OASGetOfferMappingsResultDTO getOfferMappingsResultDTO3 = new OASGetOfferMappingsResultDTO();
        OASGetOfferMappingsResultDTO getOfferMappingsResultDTO4 = new OASGetOfferMappingsResultDTO();

        System.assert(getOfferMappingsResultDTO1.equals(getOfferMappingsResultDTO2));
        System.assert(getOfferMappingsResultDTO2.equals(getOfferMappingsResultDTO1));
        System.assert(getOfferMappingsResultDTO3.equals(getOfferMappingsResultDTO4));
        System.assert(getOfferMappingsResultDTO4.equals(getOfferMappingsResultDTO3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASGetOfferMappingsResultDTO getOfferMappingsResultDTO1 = OASGetOfferMappingsResultDTO.getExample();
        OASGetOfferMappingsResultDTO getOfferMappingsResultDTO2 = new OASGetOfferMappingsResultDTO();

        System.assertEquals(false, getOfferMappingsResultDTO1.equals('foo'));
        System.assertEquals(false, getOfferMappingsResultDTO2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASGetOfferMappingsResultDTO getOfferMappingsResultDTO1 = OASGetOfferMappingsResultDTO.getExample();
        OASGetOfferMappingsResultDTO getOfferMappingsResultDTO2 = new OASGetOfferMappingsResultDTO();
        OASGetOfferMappingsResultDTO getOfferMappingsResultDTO3;

        System.assertEquals(false, getOfferMappingsResultDTO1.equals(getOfferMappingsResultDTO3));
        System.assertEquals(false, getOfferMappingsResultDTO2.equals(getOfferMappingsResultDTO3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASGetOfferMappingsResultDTO getOfferMappingsResultDTO1 = OASGetOfferMappingsResultDTO.getExample();
        OASGetOfferMappingsResultDTO getOfferMappingsResultDTO2 = new OASGetOfferMappingsResultDTO();

        System.assertEquals(getOfferMappingsResultDTO1.hashCode(), getOfferMappingsResultDTO1.hashCode());
        System.assertEquals(getOfferMappingsResultDTO2.hashCode(), getOfferMappingsResultDTO2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASGetOfferMappingsResultDTO getOfferMappingsResultDTO1 = OASGetOfferMappingsResultDTO.getExample();
        OASGetOfferMappingsResultDTO getOfferMappingsResultDTO2 = OASGetOfferMappingsResultDTO.getExample();
        OASGetOfferMappingsResultDTO getOfferMappingsResultDTO3 = new OASGetOfferMappingsResultDTO();
        OASGetOfferMappingsResultDTO getOfferMappingsResultDTO4 = new OASGetOfferMappingsResultDTO();

        System.assert(getOfferMappingsResultDTO1.equals(getOfferMappingsResultDTO2));
        System.assert(getOfferMappingsResultDTO3.equals(getOfferMappingsResultDTO4));
        System.assertEquals(getOfferMappingsResultDTO1.hashCode(), getOfferMappingsResultDTO2.hashCode());
        System.assertEquals(getOfferMappingsResultDTO3.hashCode(), getOfferMappingsResultDTO4.hashCode());
    }

    @isTest
    private static void defaultValuesPopulated() {
        OASGetOfferMappingsResultDTO getOfferMappingsResultDTO = new OASGetOfferMappingsResultDTO();
        System.assertEquals(new List<OASGetOfferMappingDTO>(), getOfferMappingsResultDTO.offerMappings);
        System.assertEquals(null, getOfferMappingsResultDTO.paging);
    }
}
