@isTest
private class OASAddOffersToArchiveDTOTest {
    @isTest
    private static void equalsSameInstance() {
        OASAddOffersToArchiveDTO addOffersToArchiveDTO1 = OASAddOffersToArchiveDTO.getExample();
        OASAddOffersToArchiveDTO addOffersToArchiveDTO2 = addOffersToArchiveDTO1;
        OASAddOffersToArchiveDTO addOffersToArchiveDTO3 = new OASAddOffersToArchiveDTO();
        OASAddOffersToArchiveDTO addOffersToArchiveDTO4 = addOffersToArchiveDTO3;

        System.assert(addOffersToArchiveDTO1.equals(addOffersToArchiveDTO2));
        System.assert(addOffersToArchiveDTO2.equals(addOffersToArchiveDTO1));
        System.assert(addOffersToArchiveDTO1.equals(addOffersToArchiveDTO1));
        System.assert(addOffersToArchiveDTO3.equals(addOffersToArchiveDTO4));
        System.assert(addOffersToArchiveDTO4.equals(addOffersToArchiveDTO3));
        System.assert(addOffersToArchiveDTO3.equals(addOffersToArchiveDTO3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASAddOffersToArchiveDTO addOffersToArchiveDTO1 = OASAddOffersToArchiveDTO.getExample();
        OASAddOffersToArchiveDTO addOffersToArchiveDTO2 = OASAddOffersToArchiveDTO.getExample();
        OASAddOffersToArchiveDTO addOffersToArchiveDTO3 = new OASAddOffersToArchiveDTO();
        OASAddOffersToArchiveDTO addOffersToArchiveDTO4 = new OASAddOffersToArchiveDTO();

        System.assert(addOffersToArchiveDTO1.equals(addOffersToArchiveDTO2));
        System.assert(addOffersToArchiveDTO2.equals(addOffersToArchiveDTO1));
        System.assert(addOffersToArchiveDTO3.equals(addOffersToArchiveDTO4));
        System.assert(addOffersToArchiveDTO4.equals(addOffersToArchiveDTO3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASAddOffersToArchiveDTO addOffersToArchiveDTO1 = OASAddOffersToArchiveDTO.getExample();
        OASAddOffersToArchiveDTO addOffersToArchiveDTO2 = new OASAddOffersToArchiveDTO();

        System.assertEquals(false, addOffersToArchiveDTO1.equals('foo'));
        System.assertEquals(false, addOffersToArchiveDTO2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASAddOffersToArchiveDTO addOffersToArchiveDTO1 = OASAddOffersToArchiveDTO.getExample();
        OASAddOffersToArchiveDTO addOffersToArchiveDTO2 = new OASAddOffersToArchiveDTO();
        OASAddOffersToArchiveDTO addOffersToArchiveDTO3;

        System.assertEquals(false, addOffersToArchiveDTO1.equals(addOffersToArchiveDTO3));
        System.assertEquals(false, addOffersToArchiveDTO2.equals(addOffersToArchiveDTO3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASAddOffersToArchiveDTO addOffersToArchiveDTO1 = OASAddOffersToArchiveDTO.getExample();
        OASAddOffersToArchiveDTO addOffersToArchiveDTO2 = new OASAddOffersToArchiveDTO();

        System.assertEquals(addOffersToArchiveDTO1.hashCode(), addOffersToArchiveDTO1.hashCode());
        System.assertEquals(addOffersToArchiveDTO2.hashCode(), addOffersToArchiveDTO2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASAddOffersToArchiveDTO addOffersToArchiveDTO1 = OASAddOffersToArchiveDTO.getExample();
        OASAddOffersToArchiveDTO addOffersToArchiveDTO2 = OASAddOffersToArchiveDTO.getExample();
        OASAddOffersToArchiveDTO addOffersToArchiveDTO3 = new OASAddOffersToArchiveDTO();
        OASAddOffersToArchiveDTO addOffersToArchiveDTO4 = new OASAddOffersToArchiveDTO();

        System.assert(addOffersToArchiveDTO1.equals(addOffersToArchiveDTO2));
        System.assert(addOffersToArchiveDTO3.equals(addOffersToArchiveDTO4));
        System.assertEquals(addOffersToArchiveDTO1.hashCode(), addOffersToArchiveDTO2.hashCode());
        System.assertEquals(addOffersToArchiveDTO3.hashCode(), addOffersToArchiveDTO4.hashCode());
    }

    @isTest
    private static void defaultValuesPopulated() {
        OASAddOffersToArchiveDTO addOffersToArchiveDTO = new OASAddOffersToArchiveDTO();
        System.assertEquals(new List<OASAddOffersToArchiveErrorDTO>(), addOffersToArchiveDTO.notArchivedOffers);
    }
}
