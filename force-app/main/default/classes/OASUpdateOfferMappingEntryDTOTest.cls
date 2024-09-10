@isTest
private class OASUpdateOfferMappingEntryDTOTest {
    @isTest
    private static void equalsSameInstance() {
        OASUpdateOfferMappingEntryDTO updateOfferMappingEntryDTO1 = OASUpdateOfferMappingEntryDTO.getExample();
        OASUpdateOfferMappingEntryDTO updateOfferMappingEntryDTO2 = updateOfferMappingEntryDTO1;
        OASUpdateOfferMappingEntryDTO updateOfferMappingEntryDTO3 = new OASUpdateOfferMappingEntryDTO();
        OASUpdateOfferMappingEntryDTO updateOfferMappingEntryDTO4 = updateOfferMappingEntryDTO3;

        System.assert(updateOfferMappingEntryDTO1.equals(updateOfferMappingEntryDTO2));
        System.assert(updateOfferMappingEntryDTO2.equals(updateOfferMappingEntryDTO1));
        System.assert(updateOfferMappingEntryDTO1.equals(updateOfferMappingEntryDTO1));
        System.assert(updateOfferMappingEntryDTO3.equals(updateOfferMappingEntryDTO4));
        System.assert(updateOfferMappingEntryDTO4.equals(updateOfferMappingEntryDTO3));
        System.assert(updateOfferMappingEntryDTO3.equals(updateOfferMappingEntryDTO3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASUpdateOfferMappingEntryDTO updateOfferMappingEntryDTO1 = OASUpdateOfferMappingEntryDTO.getExample();
        OASUpdateOfferMappingEntryDTO updateOfferMappingEntryDTO2 = OASUpdateOfferMappingEntryDTO.getExample();
        OASUpdateOfferMappingEntryDTO updateOfferMappingEntryDTO3 = new OASUpdateOfferMappingEntryDTO();
        OASUpdateOfferMappingEntryDTO updateOfferMappingEntryDTO4 = new OASUpdateOfferMappingEntryDTO();

        System.assert(updateOfferMappingEntryDTO1.equals(updateOfferMappingEntryDTO2));
        System.assert(updateOfferMappingEntryDTO2.equals(updateOfferMappingEntryDTO1));
        System.assert(updateOfferMappingEntryDTO3.equals(updateOfferMappingEntryDTO4));
        System.assert(updateOfferMappingEntryDTO4.equals(updateOfferMappingEntryDTO3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASUpdateOfferMappingEntryDTO updateOfferMappingEntryDTO1 = OASUpdateOfferMappingEntryDTO.getExample();
        OASUpdateOfferMappingEntryDTO updateOfferMappingEntryDTO2 = new OASUpdateOfferMappingEntryDTO();

        System.assertEquals(false, updateOfferMappingEntryDTO1.equals('foo'));
        System.assertEquals(false, updateOfferMappingEntryDTO2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASUpdateOfferMappingEntryDTO updateOfferMappingEntryDTO1 = OASUpdateOfferMappingEntryDTO.getExample();
        OASUpdateOfferMappingEntryDTO updateOfferMappingEntryDTO2 = new OASUpdateOfferMappingEntryDTO();
        OASUpdateOfferMappingEntryDTO updateOfferMappingEntryDTO3;

        System.assertEquals(false, updateOfferMappingEntryDTO1.equals(updateOfferMappingEntryDTO3));
        System.assertEquals(false, updateOfferMappingEntryDTO2.equals(updateOfferMappingEntryDTO3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASUpdateOfferMappingEntryDTO updateOfferMappingEntryDTO1 = OASUpdateOfferMappingEntryDTO.getExample();
        OASUpdateOfferMappingEntryDTO updateOfferMappingEntryDTO2 = new OASUpdateOfferMappingEntryDTO();

        System.assertEquals(updateOfferMappingEntryDTO1.hashCode(), updateOfferMappingEntryDTO1.hashCode());
        System.assertEquals(updateOfferMappingEntryDTO2.hashCode(), updateOfferMappingEntryDTO2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASUpdateOfferMappingEntryDTO updateOfferMappingEntryDTO1 = OASUpdateOfferMappingEntryDTO.getExample();
        OASUpdateOfferMappingEntryDTO updateOfferMappingEntryDTO2 = OASUpdateOfferMappingEntryDTO.getExample();
        OASUpdateOfferMappingEntryDTO updateOfferMappingEntryDTO3 = new OASUpdateOfferMappingEntryDTO();
        OASUpdateOfferMappingEntryDTO updateOfferMappingEntryDTO4 = new OASUpdateOfferMappingEntryDTO();

        System.assert(updateOfferMappingEntryDTO1.equals(updateOfferMappingEntryDTO2));
        System.assert(updateOfferMappingEntryDTO3.equals(updateOfferMappingEntryDTO4));
        System.assertEquals(updateOfferMappingEntryDTO1.hashCode(), updateOfferMappingEntryDTO2.hashCode());
        System.assertEquals(updateOfferMappingEntryDTO3.hashCode(), updateOfferMappingEntryDTO4.hashCode());
    }
}
