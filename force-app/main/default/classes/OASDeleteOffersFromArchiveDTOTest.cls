@isTest
private class OASDeleteOffersFromArchiveDTOTest {
    @isTest
    private static void equalsSameInstance() {
        OASDeleteOffersFromArchiveDTO deleteOffersFromArchiveDTO1 = OASDeleteOffersFromArchiveDTO.getExample();
        OASDeleteOffersFromArchiveDTO deleteOffersFromArchiveDTO2 = deleteOffersFromArchiveDTO1;
        OASDeleteOffersFromArchiveDTO deleteOffersFromArchiveDTO3 = new OASDeleteOffersFromArchiveDTO();
        OASDeleteOffersFromArchiveDTO deleteOffersFromArchiveDTO4 = deleteOffersFromArchiveDTO3;

        System.assert(deleteOffersFromArchiveDTO1.equals(deleteOffersFromArchiveDTO2));
        System.assert(deleteOffersFromArchiveDTO2.equals(deleteOffersFromArchiveDTO1));
        System.assert(deleteOffersFromArchiveDTO1.equals(deleteOffersFromArchiveDTO1));
        System.assert(deleteOffersFromArchiveDTO3.equals(deleteOffersFromArchiveDTO4));
        System.assert(deleteOffersFromArchiveDTO4.equals(deleteOffersFromArchiveDTO3));
        System.assert(deleteOffersFromArchiveDTO3.equals(deleteOffersFromArchiveDTO3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASDeleteOffersFromArchiveDTO deleteOffersFromArchiveDTO1 = OASDeleteOffersFromArchiveDTO.getExample();
        OASDeleteOffersFromArchiveDTO deleteOffersFromArchiveDTO2 = OASDeleteOffersFromArchiveDTO.getExample();
        OASDeleteOffersFromArchiveDTO deleteOffersFromArchiveDTO3 = new OASDeleteOffersFromArchiveDTO();
        OASDeleteOffersFromArchiveDTO deleteOffersFromArchiveDTO4 = new OASDeleteOffersFromArchiveDTO();

        System.assert(deleteOffersFromArchiveDTO1.equals(deleteOffersFromArchiveDTO2));
        System.assert(deleteOffersFromArchiveDTO2.equals(deleteOffersFromArchiveDTO1));
        System.assert(deleteOffersFromArchiveDTO3.equals(deleteOffersFromArchiveDTO4));
        System.assert(deleteOffersFromArchiveDTO4.equals(deleteOffersFromArchiveDTO3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASDeleteOffersFromArchiveDTO deleteOffersFromArchiveDTO1 = OASDeleteOffersFromArchiveDTO.getExample();
        OASDeleteOffersFromArchiveDTO deleteOffersFromArchiveDTO2 = new OASDeleteOffersFromArchiveDTO();

        System.assertEquals(false, deleteOffersFromArchiveDTO1.equals('foo'));
        System.assertEquals(false, deleteOffersFromArchiveDTO2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASDeleteOffersFromArchiveDTO deleteOffersFromArchiveDTO1 = OASDeleteOffersFromArchiveDTO.getExample();
        OASDeleteOffersFromArchiveDTO deleteOffersFromArchiveDTO2 = new OASDeleteOffersFromArchiveDTO();
        OASDeleteOffersFromArchiveDTO deleteOffersFromArchiveDTO3;

        System.assertEquals(false, deleteOffersFromArchiveDTO1.equals(deleteOffersFromArchiveDTO3));
        System.assertEquals(false, deleteOffersFromArchiveDTO2.equals(deleteOffersFromArchiveDTO3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASDeleteOffersFromArchiveDTO deleteOffersFromArchiveDTO1 = OASDeleteOffersFromArchiveDTO.getExample();
        OASDeleteOffersFromArchiveDTO deleteOffersFromArchiveDTO2 = new OASDeleteOffersFromArchiveDTO();

        System.assertEquals(deleteOffersFromArchiveDTO1.hashCode(), deleteOffersFromArchiveDTO1.hashCode());
        System.assertEquals(deleteOffersFromArchiveDTO2.hashCode(), deleteOffersFromArchiveDTO2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASDeleteOffersFromArchiveDTO deleteOffersFromArchiveDTO1 = OASDeleteOffersFromArchiveDTO.getExample();
        OASDeleteOffersFromArchiveDTO deleteOffersFromArchiveDTO2 = OASDeleteOffersFromArchiveDTO.getExample();
        OASDeleteOffersFromArchiveDTO deleteOffersFromArchiveDTO3 = new OASDeleteOffersFromArchiveDTO();
        OASDeleteOffersFromArchiveDTO deleteOffersFromArchiveDTO4 = new OASDeleteOffersFromArchiveDTO();

        System.assert(deleteOffersFromArchiveDTO1.equals(deleteOffersFromArchiveDTO2));
        System.assert(deleteOffersFromArchiveDTO3.equals(deleteOffersFromArchiveDTO4));
        System.assertEquals(deleteOffersFromArchiveDTO1.hashCode(), deleteOffersFromArchiveDTO2.hashCode());
        System.assertEquals(deleteOffersFromArchiveDTO3.hashCode(), deleteOffersFromArchiveDTO4.hashCode());
    }

    @isTest
    private static void defaultValuesPopulated() {
        OASDeleteOffersFromArchiveDTO deleteOffersFromArchiveDTO = new OASDeleteOffersFromArchiveDTO();
        System.assertEquals(new List<String>(), deleteOffersFromArchiveDTO.notUnarchivedOfferIds);
    }
}
