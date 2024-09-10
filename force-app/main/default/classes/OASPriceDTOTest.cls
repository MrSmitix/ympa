@isTest
private class OASPriceDTOTest {
    @isTest
    private static void equalsSameInstance() {
        OASPriceDTO priceDTO1 = OASPriceDTO.getExample();
        OASPriceDTO priceDTO2 = priceDTO1;
        OASPriceDTO priceDTO3 = new OASPriceDTO();
        OASPriceDTO priceDTO4 = priceDTO3;

        System.assert(priceDTO1.equals(priceDTO2));
        System.assert(priceDTO2.equals(priceDTO1));
        System.assert(priceDTO1.equals(priceDTO1));
        System.assert(priceDTO3.equals(priceDTO4));
        System.assert(priceDTO4.equals(priceDTO3));
        System.assert(priceDTO3.equals(priceDTO3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASPriceDTO priceDTO1 = OASPriceDTO.getExample();
        OASPriceDTO priceDTO2 = OASPriceDTO.getExample();
        OASPriceDTO priceDTO3 = new OASPriceDTO();
        OASPriceDTO priceDTO4 = new OASPriceDTO();

        System.assert(priceDTO1.equals(priceDTO2));
        System.assert(priceDTO2.equals(priceDTO1));
        System.assert(priceDTO3.equals(priceDTO4));
        System.assert(priceDTO4.equals(priceDTO3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASPriceDTO priceDTO1 = OASPriceDTO.getExample();
        OASPriceDTO priceDTO2 = new OASPriceDTO();

        System.assertEquals(false, priceDTO1.equals('foo'));
        System.assertEquals(false, priceDTO2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASPriceDTO priceDTO1 = OASPriceDTO.getExample();
        OASPriceDTO priceDTO2 = new OASPriceDTO();
        OASPriceDTO priceDTO3;

        System.assertEquals(false, priceDTO1.equals(priceDTO3));
        System.assertEquals(false, priceDTO2.equals(priceDTO3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASPriceDTO priceDTO1 = OASPriceDTO.getExample();
        OASPriceDTO priceDTO2 = new OASPriceDTO();

        System.assertEquals(priceDTO1.hashCode(), priceDTO1.hashCode());
        System.assertEquals(priceDTO2.hashCode(), priceDTO2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASPriceDTO priceDTO1 = OASPriceDTO.getExample();
        OASPriceDTO priceDTO2 = OASPriceDTO.getExample();
        OASPriceDTO priceDTO3 = new OASPriceDTO();
        OASPriceDTO priceDTO4 = new OASPriceDTO();

        System.assert(priceDTO1.equals(priceDTO2));
        System.assert(priceDTO3.equals(priceDTO4));
        System.assertEquals(priceDTO1.hashCode(), priceDTO2.hashCode());
        System.assertEquals(priceDTO3.hashCode(), priceDTO4.hashCode());
    }
}
