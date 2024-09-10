@isTest
private class OASGetPriceWithDiscountDTOTest {
    @isTest
    private static void equalsSameInstance() {
        OASGetPriceWithDiscountDTO getPriceWithDiscountDTO1 = OASGetPriceWithDiscountDTO.getExample();
        OASGetPriceWithDiscountDTO getPriceWithDiscountDTO2 = getPriceWithDiscountDTO1;
        OASGetPriceWithDiscountDTO getPriceWithDiscountDTO3 = new OASGetPriceWithDiscountDTO();
        OASGetPriceWithDiscountDTO getPriceWithDiscountDTO4 = getPriceWithDiscountDTO3;

        System.assert(getPriceWithDiscountDTO1.equals(getPriceWithDiscountDTO2));
        System.assert(getPriceWithDiscountDTO2.equals(getPriceWithDiscountDTO1));
        System.assert(getPriceWithDiscountDTO1.equals(getPriceWithDiscountDTO1));
        System.assert(getPriceWithDiscountDTO3.equals(getPriceWithDiscountDTO4));
        System.assert(getPriceWithDiscountDTO4.equals(getPriceWithDiscountDTO3));
        System.assert(getPriceWithDiscountDTO3.equals(getPriceWithDiscountDTO3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASGetPriceWithDiscountDTO getPriceWithDiscountDTO1 = OASGetPriceWithDiscountDTO.getExample();
        OASGetPriceWithDiscountDTO getPriceWithDiscountDTO2 = OASGetPriceWithDiscountDTO.getExample();
        OASGetPriceWithDiscountDTO getPriceWithDiscountDTO3 = new OASGetPriceWithDiscountDTO();
        OASGetPriceWithDiscountDTO getPriceWithDiscountDTO4 = new OASGetPriceWithDiscountDTO();

        System.assert(getPriceWithDiscountDTO1.equals(getPriceWithDiscountDTO2));
        System.assert(getPriceWithDiscountDTO2.equals(getPriceWithDiscountDTO1));
        System.assert(getPriceWithDiscountDTO3.equals(getPriceWithDiscountDTO4));
        System.assert(getPriceWithDiscountDTO4.equals(getPriceWithDiscountDTO3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASGetPriceWithDiscountDTO getPriceWithDiscountDTO1 = OASGetPriceWithDiscountDTO.getExample();
        OASGetPriceWithDiscountDTO getPriceWithDiscountDTO2 = new OASGetPriceWithDiscountDTO();

        System.assertEquals(false, getPriceWithDiscountDTO1.equals('foo'));
        System.assertEquals(false, getPriceWithDiscountDTO2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASGetPriceWithDiscountDTO getPriceWithDiscountDTO1 = OASGetPriceWithDiscountDTO.getExample();
        OASGetPriceWithDiscountDTO getPriceWithDiscountDTO2 = new OASGetPriceWithDiscountDTO();
        OASGetPriceWithDiscountDTO getPriceWithDiscountDTO3;

        System.assertEquals(false, getPriceWithDiscountDTO1.equals(getPriceWithDiscountDTO3));
        System.assertEquals(false, getPriceWithDiscountDTO2.equals(getPriceWithDiscountDTO3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASGetPriceWithDiscountDTO getPriceWithDiscountDTO1 = OASGetPriceWithDiscountDTO.getExample();
        OASGetPriceWithDiscountDTO getPriceWithDiscountDTO2 = new OASGetPriceWithDiscountDTO();

        System.assertEquals(getPriceWithDiscountDTO1.hashCode(), getPriceWithDiscountDTO1.hashCode());
        System.assertEquals(getPriceWithDiscountDTO2.hashCode(), getPriceWithDiscountDTO2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASGetPriceWithDiscountDTO getPriceWithDiscountDTO1 = OASGetPriceWithDiscountDTO.getExample();
        OASGetPriceWithDiscountDTO getPriceWithDiscountDTO2 = OASGetPriceWithDiscountDTO.getExample();
        OASGetPriceWithDiscountDTO getPriceWithDiscountDTO3 = new OASGetPriceWithDiscountDTO();
        OASGetPriceWithDiscountDTO getPriceWithDiscountDTO4 = new OASGetPriceWithDiscountDTO();

        System.assert(getPriceWithDiscountDTO1.equals(getPriceWithDiscountDTO2));
        System.assert(getPriceWithDiscountDTO3.equals(getPriceWithDiscountDTO4));
        System.assertEquals(getPriceWithDiscountDTO1.hashCode(), getPriceWithDiscountDTO2.hashCode());
        System.assertEquals(getPriceWithDiscountDTO3.hashCode(), getPriceWithDiscountDTO4.hashCode());
    }
}
