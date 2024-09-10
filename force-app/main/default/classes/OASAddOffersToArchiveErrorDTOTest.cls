@isTest
private class OASAddOffersToArchiveErrorDTOTest {
    @isTest
    private static void equalsSameInstance() {
        OASAddOffersToArchiveErrorDTO addOffersToArchiveErrorDTO1 = OASAddOffersToArchiveErrorDTO.getExample();
        OASAddOffersToArchiveErrorDTO addOffersToArchiveErrorDTO2 = addOffersToArchiveErrorDTO1;
        OASAddOffersToArchiveErrorDTO addOffersToArchiveErrorDTO3 = new OASAddOffersToArchiveErrorDTO();
        OASAddOffersToArchiveErrorDTO addOffersToArchiveErrorDTO4 = addOffersToArchiveErrorDTO3;

        System.assert(addOffersToArchiveErrorDTO1.equals(addOffersToArchiveErrorDTO2));
        System.assert(addOffersToArchiveErrorDTO2.equals(addOffersToArchiveErrorDTO1));
        System.assert(addOffersToArchiveErrorDTO1.equals(addOffersToArchiveErrorDTO1));
        System.assert(addOffersToArchiveErrorDTO3.equals(addOffersToArchiveErrorDTO4));
        System.assert(addOffersToArchiveErrorDTO4.equals(addOffersToArchiveErrorDTO3));
        System.assert(addOffersToArchiveErrorDTO3.equals(addOffersToArchiveErrorDTO3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASAddOffersToArchiveErrorDTO addOffersToArchiveErrorDTO1 = OASAddOffersToArchiveErrorDTO.getExample();
        OASAddOffersToArchiveErrorDTO addOffersToArchiveErrorDTO2 = OASAddOffersToArchiveErrorDTO.getExample();
        OASAddOffersToArchiveErrorDTO addOffersToArchiveErrorDTO3 = new OASAddOffersToArchiveErrorDTO();
        OASAddOffersToArchiveErrorDTO addOffersToArchiveErrorDTO4 = new OASAddOffersToArchiveErrorDTO();

        System.assert(addOffersToArchiveErrorDTO1.equals(addOffersToArchiveErrorDTO2));
        System.assert(addOffersToArchiveErrorDTO2.equals(addOffersToArchiveErrorDTO1));
        System.assert(addOffersToArchiveErrorDTO3.equals(addOffersToArchiveErrorDTO4));
        System.assert(addOffersToArchiveErrorDTO4.equals(addOffersToArchiveErrorDTO3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASAddOffersToArchiveErrorDTO addOffersToArchiveErrorDTO1 = OASAddOffersToArchiveErrorDTO.getExample();
        OASAddOffersToArchiveErrorDTO addOffersToArchiveErrorDTO2 = new OASAddOffersToArchiveErrorDTO();

        System.assertEquals(false, addOffersToArchiveErrorDTO1.equals('foo'));
        System.assertEquals(false, addOffersToArchiveErrorDTO2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASAddOffersToArchiveErrorDTO addOffersToArchiveErrorDTO1 = OASAddOffersToArchiveErrorDTO.getExample();
        OASAddOffersToArchiveErrorDTO addOffersToArchiveErrorDTO2 = new OASAddOffersToArchiveErrorDTO();
        OASAddOffersToArchiveErrorDTO addOffersToArchiveErrorDTO3;

        System.assertEquals(false, addOffersToArchiveErrorDTO1.equals(addOffersToArchiveErrorDTO3));
        System.assertEquals(false, addOffersToArchiveErrorDTO2.equals(addOffersToArchiveErrorDTO3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASAddOffersToArchiveErrorDTO addOffersToArchiveErrorDTO1 = OASAddOffersToArchiveErrorDTO.getExample();
        OASAddOffersToArchiveErrorDTO addOffersToArchiveErrorDTO2 = new OASAddOffersToArchiveErrorDTO();

        System.assertEquals(addOffersToArchiveErrorDTO1.hashCode(), addOffersToArchiveErrorDTO1.hashCode());
        System.assertEquals(addOffersToArchiveErrorDTO2.hashCode(), addOffersToArchiveErrorDTO2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASAddOffersToArchiveErrorDTO addOffersToArchiveErrorDTO1 = OASAddOffersToArchiveErrorDTO.getExample();
        OASAddOffersToArchiveErrorDTO addOffersToArchiveErrorDTO2 = OASAddOffersToArchiveErrorDTO.getExample();
        OASAddOffersToArchiveErrorDTO addOffersToArchiveErrorDTO3 = new OASAddOffersToArchiveErrorDTO();
        OASAddOffersToArchiveErrorDTO addOffersToArchiveErrorDTO4 = new OASAddOffersToArchiveErrorDTO();

        System.assert(addOffersToArchiveErrorDTO1.equals(addOffersToArchiveErrorDTO2));
        System.assert(addOffersToArchiveErrorDTO3.equals(addOffersToArchiveErrorDTO4));
        System.assertEquals(addOffersToArchiveErrorDTO1.hashCode(), addOffersToArchiveErrorDTO2.hashCode());
        System.assertEquals(addOffersToArchiveErrorDTO3.hashCode(), addOffersToArchiveErrorDTO4.hashCode());
    }
}
