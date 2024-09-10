@isTest
private class OASPriceSuggestDTOTest {
    @isTest
    private static void equalsSameInstance() {
        OASPriceSuggestDTO priceSuggestDTO1 = OASPriceSuggestDTO.getExample();
        OASPriceSuggestDTO priceSuggestDTO2 = priceSuggestDTO1;
        OASPriceSuggestDTO priceSuggestDTO3 = new OASPriceSuggestDTO();
        OASPriceSuggestDTO priceSuggestDTO4 = priceSuggestDTO3;

        System.assert(priceSuggestDTO1.equals(priceSuggestDTO2));
        System.assert(priceSuggestDTO2.equals(priceSuggestDTO1));
        System.assert(priceSuggestDTO1.equals(priceSuggestDTO1));
        System.assert(priceSuggestDTO3.equals(priceSuggestDTO4));
        System.assert(priceSuggestDTO4.equals(priceSuggestDTO3));
        System.assert(priceSuggestDTO3.equals(priceSuggestDTO3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASPriceSuggestDTO priceSuggestDTO1 = OASPriceSuggestDTO.getExample();
        OASPriceSuggestDTO priceSuggestDTO2 = OASPriceSuggestDTO.getExample();
        OASPriceSuggestDTO priceSuggestDTO3 = new OASPriceSuggestDTO();
        OASPriceSuggestDTO priceSuggestDTO4 = new OASPriceSuggestDTO();

        System.assert(priceSuggestDTO1.equals(priceSuggestDTO2));
        System.assert(priceSuggestDTO2.equals(priceSuggestDTO1));
        System.assert(priceSuggestDTO3.equals(priceSuggestDTO4));
        System.assert(priceSuggestDTO4.equals(priceSuggestDTO3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASPriceSuggestDTO priceSuggestDTO1 = OASPriceSuggestDTO.getExample();
        OASPriceSuggestDTO priceSuggestDTO2 = new OASPriceSuggestDTO();

        System.assertEquals(false, priceSuggestDTO1.equals('foo'));
        System.assertEquals(false, priceSuggestDTO2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASPriceSuggestDTO priceSuggestDTO1 = OASPriceSuggestDTO.getExample();
        OASPriceSuggestDTO priceSuggestDTO2 = new OASPriceSuggestDTO();
        OASPriceSuggestDTO priceSuggestDTO3;

        System.assertEquals(false, priceSuggestDTO1.equals(priceSuggestDTO3));
        System.assertEquals(false, priceSuggestDTO2.equals(priceSuggestDTO3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASPriceSuggestDTO priceSuggestDTO1 = OASPriceSuggestDTO.getExample();
        OASPriceSuggestDTO priceSuggestDTO2 = new OASPriceSuggestDTO();

        System.assertEquals(priceSuggestDTO1.hashCode(), priceSuggestDTO1.hashCode());
        System.assertEquals(priceSuggestDTO2.hashCode(), priceSuggestDTO2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASPriceSuggestDTO priceSuggestDTO1 = OASPriceSuggestDTO.getExample();
        OASPriceSuggestDTO priceSuggestDTO2 = OASPriceSuggestDTO.getExample();
        OASPriceSuggestDTO priceSuggestDTO3 = new OASPriceSuggestDTO();
        OASPriceSuggestDTO priceSuggestDTO4 = new OASPriceSuggestDTO();

        System.assert(priceSuggestDTO1.equals(priceSuggestDTO2));
        System.assert(priceSuggestDTO3.equals(priceSuggestDTO4));
        System.assertEquals(priceSuggestDTO1.hashCode(), priceSuggestDTO2.hashCode());
        System.assertEquals(priceSuggestDTO3.hashCode(), priceSuggestDTO4.hashCode());
    }
}
