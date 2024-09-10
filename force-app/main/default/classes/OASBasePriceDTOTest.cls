@isTest
private class OASBasePriceDTOTest {
    @isTest
    private static void equalsSameInstance() {
        OASBasePriceDTO basePriceDTO1 = OASBasePriceDTO.getExample();
        OASBasePriceDTO basePriceDTO2 = basePriceDTO1;
        OASBasePriceDTO basePriceDTO3 = new OASBasePriceDTO();
        OASBasePriceDTO basePriceDTO4 = basePriceDTO3;

        System.assert(basePriceDTO1.equals(basePriceDTO2));
        System.assert(basePriceDTO2.equals(basePriceDTO1));
        System.assert(basePriceDTO1.equals(basePriceDTO1));
        System.assert(basePriceDTO3.equals(basePriceDTO4));
        System.assert(basePriceDTO4.equals(basePriceDTO3));
        System.assert(basePriceDTO3.equals(basePriceDTO3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASBasePriceDTO basePriceDTO1 = OASBasePriceDTO.getExample();
        OASBasePriceDTO basePriceDTO2 = OASBasePriceDTO.getExample();
        OASBasePriceDTO basePriceDTO3 = new OASBasePriceDTO();
        OASBasePriceDTO basePriceDTO4 = new OASBasePriceDTO();

        System.assert(basePriceDTO1.equals(basePriceDTO2));
        System.assert(basePriceDTO2.equals(basePriceDTO1));
        System.assert(basePriceDTO3.equals(basePriceDTO4));
        System.assert(basePriceDTO4.equals(basePriceDTO3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASBasePriceDTO basePriceDTO1 = OASBasePriceDTO.getExample();
        OASBasePriceDTO basePriceDTO2 = new OASBasePriceDTO();

        System.assertEquals(false, basePriceDTO1.equals('foo'));
        System.assertEquals(false, basePriceDTO2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASBasePriceDTO basePriceDTO1 = OASBasePriceDTO.getExample();
        OASBasePriceDTO basePriceDTO2 = new OASBasePriceDTO();
        OASBasePriceDTO basePriceDTO3;

        System.assertEquals(false, basePriceDTO1.equals(basePriceDTO3));
        System.assertEquals(false, basePriceDTO2.equals(basePriceDTO3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASBasePriceDTO basePriceDTO1 = OASBasePriceDTO.getExample();
        OASBasePriceDTO basePriceDTO2 = new OASBasePriceDTO();

        System.assertEquals(basePriceDTO1.hashCode(), basePriceDTO1.hashCode());
        System.assertEquals(basePriceDTO2.hashCode(), basePriceDTO2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASBasePriceDTO basePriceDTO1 = OASBasePriceDTO.getExample();
        OASBasePriceDTO basePriceDTO2 = OASBasePriceDTO.getExample();
        OASBasePriceDTO basePriceDTO3 = new OASBasePriceDTO();
        OASBasePriceDTO basePriceDTO4 = new OASBasePriceDTO();

        System.assert(basePriceDTO1.equals(basePriceDTO2));
        System.assert(basePriceDTO3.equals(basePriceDTO4));
        System.assertEquals(basePriceDTO1.hashCode(), basePriceDTO2.hashCode());
        System.assertEquals(basePriceDTO3.hashCode(), basePriceDTO4.hashCode());
    }
}
