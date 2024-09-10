@isTest
private class OASGetPriceWithVatDTOTest {
    @isTest
    private static void equalsSameInstance() {
        OASGetPriceWithVatDTO getPriceWithVatDTO1 = OASGetPriceWithVatDTO.getExample();
        OASGetPriceWithVatDTO getPriceWithVatDTO2 = getPriceWithVatDTO1;
        OASGetPriceWithVatDTO getPriceWithVatDTO3 = new OASGetPriceWithVatDTO();
        OASGetPriceWithVatDTO getPriceWithVatDTO4 = getPriceWithVatDTO3;

        System.assert(getPriceWithVatDTO1.equals(getPriceWithVatDTO2));
        System.assert(getPriceWithVatDTO2.equals(getPriceWithVatDTO1));
        System.assert(getPriceWithVatDTO1.equals(getPriceWithVatDTO1));
        System.assert(getPriceWithVatDTO3.equals(getPriceWithVatDTO4));
        System.assert(getPriceWithVatDTO4.equals(getPriceWithVatDTO3));
        System.assert(getPriceWithVatDTO3.equals(getPriceWithVatDTO3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASGetPriceWithVatDTO getPriceWithVatDTO1 = OASGetPriceWithVatDTO.getExample();
        OASGetPriceWithVatDTO getPriceWithVatDTO2 = OASGetPriceWithVatDTO.getExample();
        OASGetPriceWithVatDTO getPriceWithVatDTO3 = new OASGetPriceWithVatDTO();
        OASGetPriceWithVatDTO getPriceWithVatDTO4 = new OASGetPriceWithVatDTO();

        System.assert(getPriceWithVatDTO1.equals(getPriceWithVatDTO2));
        System.assert(getPriceWithVatDTO2.equals(getPriceWithVatDTO1));
        System.assert(getPriceWithVatDTO3.equals(getPriceWithVatDTO4));
        System.assert(getPriceWithVatDTO4.equals(getPriceWithVatDTO3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASGetPriceWithVatDTO getPriceWithVatDTO1 = OASGetPriceWithVatDTO.getExample();
        OASGetPriceWithVatDTO getPriceWithVatDTO2 = new OASGetPriceWithVatDTO();

        System.assertEquals(false, getPriceWithVatDTO1.equals('foo'));
        System.assertEquals(false, getPriceWithVatDTO2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASGetPriceWithVatDTO getPriceWithVatDTO1 = OASGetPriceWithVatDTO.getExample();
        OASGetPriceWithVatDTO getPriceWithVatDTO2 = new OASGetPriceWithVatDTO();
        OASGetPriceWithVatDTO getPriceWithVatDTO3;

        System.assertEquals(false, getPriceWithVatDTO1.equals(getPriceWithVatDTO3));
        System.assertEquals(false, getPriceWithVatDTO2.equals(getPriceWithVatDTO3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASGetPriceWithVatDTO getPriceWithVatDTO1 = OASGetPriceWithVatDTO.getExample();
        OASGetPriceWithVatDTO getPriceWithVatDTO2 = new OASGetPriceWithVatDTO();

        System.assertEquals(getPriceWithVatDTO1.hashCode(), getPriceWithVatDTO1.hashCode());
        System.assertEquals(getPriceWithVatDTO2.hashCode(), getPriceWithVatDTO2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASGetPriceWithVatDTO getPriceWithVatDTO1 = OASGetPriceWithVatDTO.getExample();
        OASGetPriceWithVatDTO getPriceWithVatDTO2 = OASGetPriceWithVatDTO.getExample();
        OASGetPriceWithVatDTO getPriceWithVatDTO3 = new OASGetPriceWithVatDTO();
        OASGetPriceWithVatDTO getPriceWithVatDTO4 = new OASGetPriceWithVatDTO();

        System.assert(getPriceWithVatDTO1.equals(getPriceWithVatDTO2));
        System.assert(getPriceWithVatDTO3.equals(getPriceWithVatDTO4));
        System.assertEquals(getPriceWithVatDTO1.hashCode(), getPriceWithVatDTO2.hashCode());
        System.assertEquals(getPriceWithVatDTO3.hashCode(), getPriceWithVatDTO4.hashCode());
    }
}
