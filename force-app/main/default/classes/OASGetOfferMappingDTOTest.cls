@isTest
private class OASGetOfferMappingDTOTest {
    @isTest
    private static void equalsSameInstance() {
        OASGetOfferMappingDTO getOfferMappingDTO1 = OASGetOfferMappingDTO.getExample();
        OASGetOfferMappingDTO getOfferMappingDTO2 = getOfferMappingDTO1;
        OASGetOfferMappingDTO getOfferMappingDTO3 = new OASGetOfferMappingDTO();
        OASGetOfferMappingDTO getOfferMappingDTO4 = getOfferMappingDTO3;

        System.assert(getOfferMappingDTO1.equals(getOfferMappingDTO2));
        System.assert(getOfferMappingDTO2.equals(getOfferMappingDTO1));
        System.assert(getOfferMappingDTO1.equals(getOfferMappingDTO1));
        System.assert(getOfferMappingDTO3.equals(getOfferMappingDTO4));
        System.assert(getOfferMappingDTO4.equals(getOfferMappingDTO3));
        System.assert(getOfferMappingDTO3.equals(getOfferMappingDTO3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASGetOfferMappingDTO getOfferMappingDTO1 = OASGetOfferMappingDTO.getExample();
        OASGetOfferMappingDTO getOfferMappingDTO2 = OASGetOfferMappingDTO.getExample();
        OASGetOfferMappingDTO getOfferMappingDTO3 = new OASGetOfferMappingDTO();
        OASGetOfferMappingDTO getOfferMappingDTO4 = new OASGetOfferMappingDTO();

        System.assert(getOfferMappingDTO1.equals(getOfferMappingDTO2));
        System.assert(getOfferMappingDTO2.equals(getOfferMappingDTO1));
        System.assert(getOfferMappingDTO3.equals(getOfferMappingDTO4));
        System.assert(getOfferMappingDTO4.equals(getOfferMappingDTO3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASGetOfferMappingDTO getOfferMappingDTO1 = OASGetOfferMappingDTO.getExample();
        OASGetOfferMappingDTO getOfferMappingDTO2 = new OASGetOfferMappingDTO();

        System.assertEquals(false, getOfferMappingDTO1.equals('foo'));
        System.assertEquals(false, getOfferMappingDTO2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASGetOfferMappingDTO getOfferMappingDTO1 = OASGetOfferMappingDTO.getExample();
        OASGetOfferMappingDTO getOfferMappingDTO2 = new OASGetOfferMappingDTO();
        OASGetOfferMappingDTO getOfferMappingDTO3;

        System.assertEquals(false, getOfferMappingDTO1.equals(getOfferMappingDTO3));
        System.assertEquals(false, getOfferMappingDTO2.equals(getOfferMappingDTO3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASGetOfferMappingDTO getOfferMappingDTO1 = OASGetOfferMappingDTO.getExample();
        OASGetOfferMappingDTO getOfferMappingDTO2 = new OASGetOfferMappingDTO();

        System.assertEquals(getOfferMappingDTO1.hashCode(), getOfferMappingDTO1.hashCode());
        System.assertEquals(getOfferMappingDTO2.hashCode(), getOfferMappingDTO2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASGetOfferMappingDTO getOfferMappingDTO1 = OASGetOfferMappingDTO.getExample();
        OASGetOfferMappingDTO getOfferMappingDTO2 = OASGetOfferMappingDTO.getExample();
        OASGetOfferMappingDTO getOfferMappingDTO3 = new OASGetOfferMappingDTO();
        OASGetOfferMappingDTO getOfferMappingDTO4 = new OASGetOfferMappingDTO();

        System.assert(getOfferMappingDTO1.equals(getOfferMappingDTO2));
        System.assert(getOfferMappingDTO3.equals(getOfferMappingDTO4));
        System.assertEquals(getOfferMappingDTO1.hashCode(), getOfferMappingDTO2.hashCode());
        System.assertEquals(getOfferMappingDTO3.hashCode(), getOfferMappingDTO4.hashCode());
    }
}
