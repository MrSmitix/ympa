@isTest
private class OASDeleteOffersDTOTest {
    @isTest
    private static void equalsSameInstance() {
        OASDeleteOffersDTO deleteOffersDTO1 = OASDeleteOffersDTO.getExample();
        OASDeleteOffersDTO deleteOffersDTO2 = deleteOffersDTO1;
        OASDeleteOffersDTO deleteOffersDTO3 = new OASDeleteOffersDTO();
        OASDeleteOffersDTO deleteOffersDTO4 = deleteOffersDTO3;

        System.assert(deleteOffersDTO1.equals(deleteOffersDTO2));
        System.assert(deleteOffersDTO2.equals(deleteOffersDTO1));
        System.assert(deleteOffersDTO1.equals(deleteOffersDTO1));
        System.assert(deleteOffersDTO3.equals(deleteOffersDTO4));
        System.assert(deleteOffersDTO4.equals(deleteOffersDTO3));
        System.assert(deleteOffersDTO3.equals(deleteOffersDTO3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASDeleteOffersDTO deleteOffersDTO1 = OASDeleteOffersDTO.getExample();
        OASDeleteOffersDTO deleteOffersDTO2 = OASDeleteOffersDTO.getExample();
        OASDeleteOffersDTO deleteOffersDTO3 = new OASDeleteOffersDTO();
        OASDeleteOffersDTO deleteOffersDTO4 = new OASDeleteOffersDTO();

        System.assert(deleteOffersDTO1.equals(deleteOffersDTO2));
        System.assert(deleteOffersDTO2.equals(deleteOffersDTO1));
        System.assert(deleteOffersDTO3.equals(deleteOffersDTO4));
        System.assert(deleteOffersDTO4.equals(deleteOffersDTO3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASDeleteOffersDTO deleteOffersDTO1 = OASDeleteOffersDTO.getExample();
        OASDeleteOffersDTO deleteOffersDTO2 = new OASDeleteOffersDTO();

        System.assertEquals(false, deleteOffersDTO1.equals('foo'));
        System.assertEquals(false, deleteOffersDTO2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASDeleteOffersDTO deleteOffersDTO1 = OASDeleteOffersDTO.getExample();
        OASDeleteOffersDTO deleteOffersDTO2 = new OASDeleteOffersDTO();
        OASDeleteOffersDTO deleteOffersDTO3;

        System.assertEquals(false, deleteOffersDTO1.equals(deleteOffersDTO3));
        System.assertEquals(false, deleteOffersDTO2.equals(deleteOffersDTO3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASDeleteOffersDTO deleteOffersDTO1 = OASDeleteOffersDTO.getExample();
        OASDeleteOffersDTO deleteOffersDTO2 = new OASDeleteOffersDTO();

        System.assertEquals(deleteOffersDTO1.hashCode(), deleteOffersDTO1.hashCode());
        System.assertEquals(deleteOffersDTO2.hashCode(), deleteOffersDTO2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASDeleteOffersDTO deleteOffersDTO1 = OASDeleteOffersDTO.getExample();
        OASDeleteOffersDTO deleteOffersDTO2 = OASDeleteOffersDTO.getExample();
        OASDeleteOffersDTO deleteOffersDTO3 = new OASDeleteOffersDTO();
        OASDeleteOffersDTO deleteOffersDTO4 = new OASDeleteOffersDTO();

        System.assert(deleteOffersDTO1.equals(deleteOffersDTO2));
        System.assert(deleteOffersDTO3.equals(deleteOffersDTO4));
        System.assertEquals(deleteOffersDTO1.hashCode(), deleteOffersDTO2.hashCode());
        System.assertEquals(deleteOffersDTO3.hashCode(), deleteOffersDTO4.hashCode());
    }

    @isTest
    private static void defaultValuesPopulated() {
        OASDeleteOffersDTO deleteOffersDTO = new OASDeleteOffersDTO();
        System.assertEquals(new List<String>(), deleteOffersDTO.notDeletedOfferIds);
    }
}
