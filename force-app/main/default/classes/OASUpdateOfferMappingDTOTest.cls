@isTest
private class OASUpdateOfferMappingDTOTest {
    @isTest
    private static void equalsSameInstance() {
        OASUpdateOfferMappingDTO updateOfferMappingDTO1 = OASUpdateOfferMappingDTO.getExample();
        OASUpdateOfferMappingDTO updateOfferMappingDTO2 = updateOfferMappingDTO1;
        OASUpdateOfferMappingDTO updateOfferMappingDTO3 = new OASUpdateOfferMappingDTO();
        OASUpdateOfferMappingDTO updateOfferMappingDTO4 = updateOfferMappingDTO3;

        System.assert(updateOfferMappingDTO1.equals(updateOfferMappingDTO2));
        System.assert(updateOfferMappingDTO2.equals(updateOfferMappingDTO1));
        System.assert(updateOfferMappingDTO1.equals(updateOfferMappingDTO1));
        System.assert(updateOfferMappingDTO3.equals(updateOfferMappingDTO4));
        System.assert(updateOfferMappingDTO4.equals(updateOfferMappingDTO3));
        System.assert(updateOfferMappingDTO3.equals(updateOfferMappingDTO3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASUpdateOfferMappingDTO updateOfferMappingDTO1 = OASUpdateOfferMappingDTO.getExample();
        OASUpdateOfferMappingDTO updateOfferMappingDTO2 = OASUpdateOfferMappingDTO.getExample();
        OASUpdateOfferMappingDTO updateOfferMappingDTO3 = new OASUpdateOfferMappingDTO();
        OASUpdateOfferMappingDTO updateOfferMappingDTO4 = new OASUpdateOfferMappingDTO();

        System.assert(updateOfferMappingDTO1.equals(updateOfferMappingDTO2));
        System.assert(updateOfferMappingDTO2.equals(updateOfferMappingDTO1));
        System.assert(updateOfferMappingDTO3.equals(updateOfferMappingDTO4));
        System.assert(updateOfferMappingDTO4.equals(updateOfferMappingDTO3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASUpdateOfferMappingDTO updateOfferMappingDTO1 = OASUpdateOfferMappingDTO.getExample();
        OASUpdateOfferMappingDTO updateOfferMappingDTO2 = new OASUpdateOfferMappingDTO();

        System.assertEquals(false, updateOfferMappingDTO1.equals('foo'));
        System.assertEquals(false, updateOfferMappingDTO2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASUpdateOfferMappingDTO updateOfferMappingDTO1 = OASUpdateOfferMappingDTO.getExample();
        OASUpdateOfferMappingDTO updateOfferMappingDTO2 = new OASUpdateOfferMappingDTO();
        OASUpdateOfferMappingDTO updateOfferMappingDTO3;

        System.assertEquals(false, updateOfferMappingDTO1.equals(updateOfferMappingDTO3));
        System.assertEquals(false, updateOfferMappingDTO2.equals(updateOfferMappingDTO3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASUpdateOfferMappingDTO updateOfferMappingDTO1 = OASUpdateOfferMappingDTO.getExample();
        OASUpdateOfferMappingDTO updateOfferMappingDTO2 = new OASUpdateOfferMappingDTO();

        System.assertEquals(updateOfferMappingDTO1.hashCode(), updateOfferMappingDTO1.hashCode());
        System.assertEquals(updateOfferMappingDTO2.hashCode(), updateOfferMappingDTO2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASUpdateOfferMappingDTO updateOfferMappingDTO1 = OASUpdateOfferMappingDTO.getExample();
        OASUpdateOfferMappingDTO updateOfferMappingDTO2 = OASUpdateOfferMappingDTO.getExample();
        OASUpdateOfferMappingDTO updateOfferMappingDTO3 = new OASUpdateOfferMappingDTO();
        OASUpdateOfferMappingDTO updateOfferMappingDTO4 = new OASUpdateOfferMappingDTO();

        System.assert(updateOfferMappingDTO1.equals(updateOfferMappingDTO2));
        System.assert(updateOfferMappingDTO3.equals(updateOfferMappingDTO4));
        System.assertEquals(updateOfferMappingDTO1.hashCode(), updateOfferMappingDTO2.hashCode());
        System.assertEquals(updateOfferMappingDTO3.hashCode(), updateOfferMappingDTO4.hashCode());
    }
}
