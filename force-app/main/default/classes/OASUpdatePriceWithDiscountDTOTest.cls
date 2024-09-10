@isTest
private class OASUpdatePriceWithDiscountDTOTest {
    @isTest
    private static void equalsSameInstance() {
        OASUpdatePriceWithDiscountDTO updatePriceWithDiscountDTO1 = OASUpdatePriceWithDiscountDTO.getExample();
        OASUpdatePriceWithDiscountDTO updatePriceWithDiscountDTO2 = updatePriceWithDiscountDTO1;
        OASUpdatePriceWithDiscountDTO updatePriceWithDiscountDTO3 = new OASUpdatePriceWithDiscountDTO();
        OASUpdatePriceWithDiscountDTO updatePriceWithDiscountDTO4 = updatePriceWithDiscountDTO3;

        System.assert(updatePriceWithDiscountDTO1.equals(updatePriceWithDiscountDTO2));
        System.assert(updatePriceWithDiscountDTO2.equals(updatePriceWithDiscountDTO1));
        System.assert(updatePriceWithDiscountDTO1.equals(updatePriceWithDiscountDTO1));
        System.assert(updatePriceWithDiscountDTO3.equals(updatePriceWithDiscountDTO4));
        System.assert(updatePriceWithDiscountDTO4.equals(updatePriceWithDiscountDTO3));
        System.assert(updatePriceWithDiscountDTO3.equals(updatePriceWithDiscountDTO3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASUpdatePriceWithDiscountDTO updatePriceWithDiscountDTO1 = OASUpdatePriceWithDiscountDTO.getExample();
        OASUpdatePriceWithDiscountDTO updatePriceWithDiscountDTO2 = OASUpdatePriceWithDiscountDTO.getExample();
        OASUpdatePriceWithDiscountDTO updatePriceWithDiscountDTO3 = new OASUpdatePriceWithDiscountDTO();
        OASUpdatePriceWithDiscountDTO updatePriceWithDiscountDTO4 = new OASUpdatePriceWithDiscountDTO();

        System.assert(updatePriceWithDiscountDTO1.equals(updatePriceWithDiscountDTO2));
        System.assert(updatePriceWithDiscountDTO2.equals(updatePriceWithDiscountDTO1));
        System.assert(updatePriceWithDiscountDTO3.equals(updatePriceWithDiscountDTO4));
        System.assert(updatePriceWithDiscountDTO4.equals(updatePriceWithDiscountDTO3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASUpdatePriceWithDiscountDTO updatePriceWithDiscountDTO1 = OASUpdatePriceWithDiscountDTO.getExample();
        OASUpdatePriceWithDiscountDTO updatePriceWithDiscountDTO2 = new OASUpdatePriceWithDiscountDTO();

        System.assertEquals(false, updatePriceWithDiscountDTO1.equals('foo'));
        System.assertEquals(false, updatePriceWithDiscountDTO2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASUpdatePriceWithDiscountDTO updatePriceWithDiscountDTO1 = OASUpdatePriceWithDiscountDTO.getExample();
        OASUpdatePriceWithDiscountDTO updatePriceWithDiscountDTO2 = new OASUpdatePriceWithDiscountDTO();
        OASUpdatePriceWithDiscountDTO updatePriceWithDiscountDTO3;

        System.assertEquals(false, updatePriceWithDiscountDTO1.equals(updatePriceWithDiscountDTO3));
        System.assertEquals(false, updatePriceWithDiscountDTO2.equals(updatePriceWithDiscountDTO3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASUpdatePriceWithDiscountDTO updatePriceWithDiscountDTO1 = OASUpdatePriceWithDiscountDTO.getExample();
        OASUpdatePriceWithDiscountDTO updatePriceWithDiscountDTO2 = new OASUpdatePriceWithDiscountDTO();

        System.assertEquals(updatePriceWithDiscountDTO1.hashCode(), updatePriceWithDiscountDTO1.hashCode());
        System.assertEquals(updatePriceWithDiscountDTO2.hashCode(), updatePriceWithDiscountDTO2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASUpdatePriceWithDiscountDTO updatePriceWithDiscountDTO1 = OASUpdatePriceWithDiscountDTO.getExample();
        OASUpdatePriceWithDiscountDTO updatePriceWithDiscountDTO2 = OASUpdatePriceWithDiscountDTO.getExample();
        OASUpdatePriceWithDiscountDTO updatePriceWithDiscountDTO3 = new OASUpdatePriceWithDiscountDTO();
        OASUpdatePriceWithDiscountDTO updatePriceWithDiscountDTO4 = new OASUpdatePriceWithDiscountDTO();

        System.assert(updatePriceWithDiscountDTO1.equals(updatePriceWithDiscountDTO2));
        System.assert(updatePriceWithDiscountDTO3.equals(updatePriceWithDiscountDTO4));
        System.assertEquals(updatePriceWithDiscountDTO1.hashCode(), updatePriceWithDiscountDTO2.hashCode());
        System.assertEquals(updatePriceWithDiscountDTO3.hashCode(), updatePriceWithDiscountDTO4.hashCode());
    }
}
