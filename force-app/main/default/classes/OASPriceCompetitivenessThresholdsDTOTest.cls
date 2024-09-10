@isTest
private class OASPriceCompetitivenessThresholdsDTOTest {
    @isTest
    private static void equalsSameInstance() {
        OASPriceCompetitivenessThresholdsDTO priceCompetitivenessThresholdsDTO1 = OASPriceCompetitivenessThresholdsDTO.getExample();
        OASPriceCompetitivenessThresholdsDTO priceCompetitivenessThresholdsDTO2 = priceCompetitivenessThresholdsDTO1;
        OASPriceCompetitivenessThresholdsDTO priceCompetitivenessThresholdsDTO3 = new OASPriceCompetitivenessThresholdsDTO();
        OASPriceCompetitivenessThresholdsDTO priceCompetitivenessThresholdsDTO4 = priceCompetitivenessThresholdsDTO3;

        System.assert(priceCompetitivenessThresholdsDTO1.equals(priceCompetitivenessThresholdsDTO2));
        System.assert(priceCompetitivenessThresholdsDTO2.equals(priceCompetitivenessThresholdsDTO1));
        System.assert(priceCompetitivenessThresholdsDTO1.equals(priceCompetitivenessThresholdsDTO1));
        System.assert(priceCompetitivenessThresholdsDTO3.equals(priceCompetitivenessThresholdsDTO4));
        System.assert(priceCompetitivenessThresholdsDTO4.equals(priceCompetitivenessThresholdsDTO3));
        System.assert(priceCompetitivenessThresholdsDTO3.equals(priceCompetitivenessThresholdsDTO3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASPriceCompetitivenessThresholdsDTO priceCompetitivenessThresholdsDTO1 = OASPriceCompetitivenessThresholdsDTO.getExample();
        OASPriceCompetitivenessThresholdsDTO priceCompetitivenessThresholdsDTO2 = OASPriceCompetitivenessThresholdsDTO.getExample();
        OASPriceCompetitivenessThresholdsDTO priceCompetitivenessThresholdsDTO3 = new OASPriceCompetitivenessThresholdsDTO();
        OASPriceCompetitivenessThresholdsDTO priceCompetitivenessThresholdsDTO4 = new OASPriceCompetitivenessThresholdsDTO();

        System.assert(priceCompetitivenessThresholdsDTO1.equals(priceCompetitivenessThresholdsDTO2));
        System.assert(priceCompetitivenessThresholdsDTO2.equals(priceCompetitivenessThresholdsDTO1));
        System.assert(priceCompetitivenessThresholdsDTO3.equals(priceCompetitivenessThresholdsDTO4));
        System.assert(priceCompetitivenessThresholdsDTO4.equals(priceCompetitivenessThresholdsDTO3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASPriceCompetitivenessThresholdsDTO priceCompetitivenessThresholdsDTO1 = OASPriceCompetitivenessThresholdsDTO.getExample();
        OASPriceCompetitivenessThresholdsDTO priceCompetitivenessThresholdsDTO2 = new OASPriceCompetitivenessThresholdsDTO();

        System.assertEquals(false, priceCompetitivenessThresholdsDTO1.equals('foo'));
        System.assertEquals(false, priceCompetitivenessThresholdsDTO2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASPriceCompetitivenessThresholdsDTO priceCompetitivenessThresholdsDTO1 = OASPriceCompetitivenessThresholdsDTO.getExample();
        OASPriceCompetitivenessThresholdsDTO priceCompetitivenessThresholdsDTO2 = new OASPriceCompetitivenessThresholdsDTO();
        OASPriceCompetitivenessThresholdsDTO priceCompetitivenessThresholdsDTO3;

        System.assertEquals(false, priceCompetitivenessThresholdsDTO1.equals(priceCompetitivenessThresholdsDTO3));
        System.assertEquals(false, priceCompetitivenessThresholdsDTO2.equals(priceCompetitivenessThresholdsDTO3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASPriceCompetitivenessThresholdsDTO priceCompetitivenessThresholdsDTO1 = OASPriceCompetitivenessThresholdsDTO.getExample();
        OASPriceCompetitivenessThresholdsDTO priceCompetitivenessThresholdsDTO2 = new OASPriceCompetitivenessThresholdsDTO();

        System.assertEquals(priceCompetitivenessThresholdsDTO1.hashCode(), priceCompetitivenessThresholdsDTO1.hashCode());
        System.assertEquals(priceCompetitivenessThresholdsDTO2.hashCode(), priceCompetitivenessThresholdsDTO2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASPriceCompetitivenessThresholdsDTO priceCompetitivenessThresholdsDTO1 = OASPriceCompetitivenessThresholdsDTO.getExample();
        OASPriceCompetitivenessThresholdsDTO priceCompetitivenessThresholdsDTO2 = OASPriceCompetitivenessThresholdsDTO.getExample();
        OASPriceCompetitivenessThresholdsDTO priceCompetitivenessThresholdsDTO3 = new OASPriceCompetitivenessThresholdsDTO();
        OASPriceCompetitivenessThresholdsDTO priceCompetitivenessThresholdsDTO4 = new OASPriceCompetitivenessThresholdsDTO();

        System.assert(priceCompetitivenessThresholdsDTO1.equals(priceCompetitivenessThresholdsDTO2));
        System.assert(priceCompetitivenessThresholdsDTO3.equals(priceCompetitivenessThresholdsDTO4));
        System.assertEquals(priceCompetitivenessThresholdsDTO1.hashCode(), priceCompetitivenessThresholdsDTO2.hashCode());
        System.assertEquals(priceCompetitivenessThresholdsDTO3.hashCode(), priceCompetitivenessThresholdsDTO4.hashCode());
    }
}
