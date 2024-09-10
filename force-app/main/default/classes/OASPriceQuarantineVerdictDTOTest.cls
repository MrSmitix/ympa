@isTest
private class OASPriceQuarantineVerdictDTOTest {
    @isTest
    private static void equalsSameInstance() {
        OASPriceQuarantineVerdictDTO priceQuarantineVerdictDTO1 = OASPriceQuarantineVerdictDTO.getExample();
        OASPriceQuarantineVerdictDTO priceQuarantineVerdictDTO2 = priceQuarantineVerdictDTO1;
        OASPriceQuarantineVerdictDTO priceQuarantineVerdictDTO3 = new OASPriceQuarantineVerdictDTO();
        OASPriceQuarantineVerdictDTO priceQuarantineVerdictDTO4 = priceQuarantineVerdictDTO3;

        System.assert(priceQuarantineVerdictDTO1.equals(priceQuarantineVerdictDTO2));
        System.assert(priceQuarantineVerdictDTO2.equals(priceQuarantineVerdictDTO1));
        System.assert(priceQuarantineVerdictDTO1.equals(priceQuarantineVerdictDTO1));
        System.assert(priceQuarantineVerdictDTO3.equals(priceQuarantineVerdictDTO4));
        System.assert(priceQuarantineVerdictDTO4.equals(priceQuarantineVerdictDTO3));
        System.assert(priceQuarantineVerdictDTO3.equals(priceQuarantineVerdictDTO3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASPriceQuarantineVerdictDTO priceQuarantineVerdictDTO1 = OASPriceQuarantineVerdictDTO.getExample();
        OASPriceQuarantineVerdictDTO priceQuarantineVerdictDTO2 = OASPriceQuarantineVerdictDTO.getExample();
        OASPriceQuarantineVerdictDTO priceQuarantineVerdictDTO3 = new OASPriceQuarantineVerdictDTO();
        OASPriceQuarantineVerdictDTO priceQuarantineVerdictDTO4 = new OASPriceQuarantineVerdictDTO();

        System.assert(priceQuarantineVerdictDTO1.equals(priceQuarantineVerdictDTO2));
        System.assert(priceQuarantineVerdictDTO2.equals(priceQuarantineVerdictDTO1));
        System.assert(priceQuarantineVerdictDTO3.equals(priceQuarantineVerdictDTO4));
        System.assert(priceQuarantineVerdictDTO4.equals(priceQuarantineVerdictDTO3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASPriceQuarantineVerdictDTO priceQuarantineVerdictDTO1 = OASPriceQuarantineVerdictDTO.getExample();
        OASPriceQuarantineVerdictDTO priceQuarantineVerdictDTO2 = new OASPriceQuarantineVerdictDTO();

        System.assertEquals(false, priceQuarantineVerdictDTO1.equals('foo'));
        System.assertEquals(false, priceQuarantineVerdictDTO2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASPriceQuarantineVerdictDTO priceQuarantineVerdictDTO1 = OASPriceQuarantineVerdictDTO.getExample();
        OASPriceQuarantineVerdictDTO priceQuarantineVerdictDTO2 = new OASPriceQuarantineVerdictDTO();
        OASPriceQuarantineVerdictDTO priceQuarantineVerdictDTO3;

        System.assertEquals(false, priceQuarantineVerdictDTO1.equals(priceQuarantineVerdictDTO3));
        System.assertEquals(false, priceQuarantineVerdictDTO2.equals(priceQuarantineVerdictDTO3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASPriceQuarantineVerdictDTO priceQuarantineVerdictDTO1 = OASPriceQuarantineVerdictDTO.getExample();
        OASPriceQuarantineVerdictDTO priceQuarantineVerdictDTO2 = new OASPriceQuarantineVerdictDTO();

        System.assertEquals(priceQuarantineVerdictDTO1.hashCode(), priceQuarantineVerdictDTO1.hashCode());
        System.assertEquals(priceQuarantineVerdictDTO2.hashCode(), priceQuarantineVerdictDTO2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASPriceQuarantineVerdictDTO priceQuarantineVerdictDTO1 = OASPriceQuarantineVerdictDTO.getExample();
        OASPriceQuarantineVerdictDTO priceQuarantineVerdictDTO2 = OASPriceQuarantineVerdictDTO.getExample();
        OASPriceQuarantineVerdictDTO priceQuarantineVerdictDTO3 = new OASPriceQuarantineVerdictDTO();
        OASPriceQuarantineVerdictDTO priceQuarantineVerdictDTO4 = new OASPriceQuarantineVerdictDTO();

        System.assert(priceQuarantineVerdictDTO1.equals(priceQuarantineVerdictDTO2));
        System.assert(priceQuarantineVerdictDTO3.equals(priceQuarantineVerdictDTO4));
        System.assertEquals(priceQuarantineVerdictDTO1.hashCode(), priceQuarantineVerdictDTO2.hashCode());
        System.assertEquals(priceQuarantineVerdictDTO3.hashCode(), priceQuarantineVerdictDTO4.hashCode());
    }

    @isTest
    private static void defaultValuesPopulated() {
        OASPriceQuarantineVerdictDTO priceQuarantineVerdictDTO = new OASPriceQuarantineVerdictDTO();
        System.assertEquals(new List<OASPriceQuarantineVerdictParameterDT>(), priceQuarantineVerdictDTO.params);
        System.assertEquals(null, priceQuarantineVerdictDTO.type);
    }
}
