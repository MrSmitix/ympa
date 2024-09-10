@isTest
private class OASUpdateOfferMappingResultDTOTest {
    @isTest
    private static void equalsSameInstance() {
        OASUpdateOfferMappingResultDTO updateOfferMappingResultDTO1 = OASUpdateOfferMappingResultDTO.getExample();
        OASUpdateOfferMappingResultDTO updateOfferMappingResultDTO2 = updateOfferMappingResultDTO1;
        OASUpdateOfferMappingResultDTO updateOfferMappingResultDTO3 = new OASUpdateOfferMappingResultDTO();
        OASUpdateOfferMappingResultDTO updateOfferMappingResultDTO4 = updateOfferMappingResultDTO3;

        System.assert(updateOfferMappingResultDTO1.equals(updateOfferMappingResultDTO2));
        System.assert(updateOfferMappingResultDTO2.equals(updateOfferMappingResultDTO1));
        System.assert(updateOfferMappingResultDTO1.equals(updateOfferMappingResultDTO1));
        System.assert(updateOfferMappingResultDTO3.equals(updateOfferMappingResultDTO4));
        System.assert(updateOfferMappingResultDTO4.equals(updateOfferMappingResultDTO3));
        System.assert(updateOfferMappingResultDTO3.equals(updateOfferMappingResultDTO3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASUpdateOfferMappingResultDTO updateOfferMappingResultDTO1 = OASUpdateOfferMappingResultDTO.getExample();
        OASUpdateOfferMappingResultDTO updateOfferMappingResultDTO2 = OASUpdateOfferMappingResultDTO.getExample();
        OASUpdateOfferMappingResultDTO updateOfferMappingResultDTO3 = new OASUpdateOfferMappingResultDTO();
        OASUpdateOfferMappingResultDTO updateOfferMappingResultDTO4 = new OASUpdateOfferMappingResultDTO();

        System.assert(updateOfferMappingResultDTO1.equals(updateOfferMappingResultDTO2));
        System.assert(updateOfferMappingResultDTO2.equals(updateOfferMappingResultDTO1));
        System.assert(updateOfferMappingResultDTO3.equals(updateOfferMappingResultDTO4));
        System.assert(updateOfferMappingResultDTO4.equals(updateOfferMappingResultDTO3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASUpdateOfferMappingResultDTO updateOfferMappingResultDTO1 = OASUpdateOfferMappingResultDTO.getExample();
        OASUpdateOfferMappingResultDTO updateOfferMappingResultDTO2 = new OASUpdateOfferMappingResultDTO();

        System.assertEquals(false, updateOfferMappingResultDTO1.equals('foo'));
        System.assertEquals(false, updateOfferMappingResultDTO2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASUpdateOfferMappingResultDTO updateOfferMappingResultDTO1 = OASUpdateOfferMappingResultDTO.getExample();
        OASUpdateOfferMappingResultDTO updateOfferMappingResultDTO2 = new OASUpdateOfferMappingResultDTO();
        OASUpdateOfferMappingResultDTO updateOfferMappingResultDTO3;

        System.assertEquals(false, updateOfferMappingResultDTO1.equals(updateOfferMappingResultDTO3));
        System.assertEquals(false, updateOfferMappingResultDTO2.equals(updateOfferMappingResultDTO3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASUpdateOfferMappingResultDTO updateOfferMappingResultDTO1 = OASUpdateOfferMappingResultDTO.getExample();
        OASUpdateOfferMappingResultDTO updateOfferMappingResultDTO2 = new OASUpdateOfferMappingResultDTO();

        System.assertEquals(updateOfferMappingResultDTO1.hashCode(), updateOfferMappingResultDTO1.hashCode());
        System.assertEquals(updateOfferMappingResultDTO2.hashCode(), updateOfferMappingResultDTO2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASUpdateOfferMappingResultDTO updateOfferMappingResultDTO1 = OASUpdateOfferMappingResultDTO.getExample();
        OASUpdateOfferMappingResultDTO updateOfferMappingResultDTO2 = OASUpdateOfferMappingResultDTO.getExample();
        OASUpdateOfferMappingResultDTO updateOfferMappingResultDTO3 = new OASUpdateOfferMappingResultDTO();
        OASUpdateOfferMappingResultDTO updateOfferMappingResultDTO4 = new OASUpdateOfferMappingResultDTO();

        System.assert(updateOfferMappingResultDTO1.equals(updateOfferMappingResultDTO2));
        System.assert(updateOfferMappingResultDTO3.equals(updateOfferMappingResultDTO4));
        System.assertEquals(updateOfferMappingResultDTO1.hashCode(), updateOfferMappingResultDTO2.hashCode());
        System.assertEquals(updateOfferMappingResultDTO3.hashCode(), updateOfferMappingResultDTO4.hashCode());
    }

    @isTest
    private static void defaultValuesPopulated() {
        OASUpdateOfferMappingResultDTO updateOfferMappingResultDTO = new OASUpdateOfferMappingResultDTO();
        System.assertEquals(new List<OASOfferMappingErrorDTO>(), updateOfferMappingResultDTO.errors);
        System.assertEquals(new List<OASOfferMappingErrorDTO>(), updateOfferMappingResultDTO.warnings);
        System.assertEquals(null, updateOfferMappingResultDTO.offerId);
    }
}
