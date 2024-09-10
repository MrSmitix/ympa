@isTest
private class OASGetPriceDTOTest {
    @isTest
    private static void equalsSameInstance() {
        OASGetPriceDTO getPriceDTO1 = OASGetPriceDTO.getExample();
        OASGetPriceDTO getPriceDTO2 = getPriceDTO1;
        OASGetPriceDTO getPriceDTO3 = new OASGetPriceDTO();
        OASGetPriceDTO getPriceDTO4 = getPriceDTO3;

        System.assert(getPriceDTO1.equals(getPriceDTO2));
        System.assert(getPriceDTO2.equals(getPriceDTO1));
        System.assert(getPriceDTO1.equals(getPriceDTO1));
        System.assert(getPriceDTO3.equals(getPriceDTO4));
        System.assert(getPriceDTO4.equals(getPriceDTO3));
        System.assert(getPriceDTO3.equals(getPriceDTO3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASGetPriceDTO getPriceDTO1 = OASGetPriceDTO.getExample();
        OASGetPriceDTO getPriceDTO2 = OASGetPriceDTO.getExample();
        OASGetPriceDTO getPriceDTO3 = new OASGetPriceDTO();
        OASGetPriceDTO getPriceDTO4 = new OASGetPriceDTO();

        System.assert(getPriceDTO1.equals(getPriceDTO2));
        System.assert(getPriceDTO2.equals(getPriceDTO1));
        System.assert(getPriceDTO3.equals(getPriceDTO4));
        System.assert(getPriceDTO4.equals(getPriceDTO3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASGetPriceDTO getPriceDTO1 = OASGetPriceDTO.getExample();
        OASGetPriceDTO getPriceDTO2 = new OASGetPriceDTO();

        System.assertEquals(false, getPriceDTO1.equals('foo'));
        System.assertEquals(false, getPriceDTO2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASGetPriceDTO getPriceDTO1 = OASGetPriceDTO.getExample();
        OASGetPriceDTO getPriceDTO2 = new OASGetPriceDTO();
        OASGetPriceDTO getPriceDTO3;

        System.assertEquals(false, getPriceDTO1.equals(getPriceDTO3));
        System.assertEquals(false, getPriceDTO2.equals(getPriceDTO3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASGetPriceDTO getPriceDTO1 = OASGetPriceDTO.getExample();
        OASGetPriceDTO getPriceDTO2 = new OASGetPriceDTO();

        System.assertEquals(getPriceDTO1.hashCode(), getPriceDTO1.hashCode());
        System.assertEquals(getPriceDTO2.hashCode(), getPriceDTO2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASGetPriceDTO getPriceDTO1 = OASGetPriceDTO.getExample();
        OASGetPriceDTO getPriceDTO2 = OASGetPriceDTO.getExample();
        OASGetPriceDTO getPriceDTO3 = new OASGetPriceDTO();
        OASGetPriceDTO getPriceDTO4 = new OASGetPriceDTO();

        System.assert(getPriceDTO1.equals(getPriceDTO2));
        System.assert(getPriceDTO3.equals(getPriceDTO4));
        System.assertEquals(getPriceDTO1.hashCode(), getPriceDTO2.hashCode());
        System.assertEquals(getPriceDTO3.hashCode(), getPriceDTO4.hashCode());
    }
}
