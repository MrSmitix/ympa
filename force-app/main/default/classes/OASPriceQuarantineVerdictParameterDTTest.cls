@isTest
private class OASPriceQuarantineVerdictParameterDTTest {
    @isTest
    private static void equalsSameInstance() {
        OASPriceQuarantineVerdictParameterDT priceQuarantineVerdictParameterDTO1 = OASPriceQuarantineVerdictParameterDT.getExample();
        OASPriceQuarantineVerdictParameterDT priceQuarantineVerdictParameterDTO2 = priceQuarantineVerdictParameterDTO1;
        OASPriceQuarantineVerdictParameterDT priceQuarantineVerdictParameterDTO3 = new OASPriceQuarantineVerdictParameterDT();
        OASPriceQuarantineVerdictParameterDT priceQuarantineVerdictParameterDTO4 = priceQuarantineVerdictParameterDTO3;

        System.assert(priceQuarantineVerdictParameterDTO1.equals(priceQuarantineVerdictParameterDTO2));
        System.assert(priceQuarantineVerdictParameterDTO2.equals(priceQuarantineVerdictParameterDTO1));
        System.assert(priceQuarantineVerdictParameterDTO1.equals(priceQuarantineVerdictParameterDTO1));
        System.assert(priceQuarantineVerdictParameterDTO3.equals(priceQuarantineVerdictParameterDTO4));
        System.assert(priceQuarantineVerdictParameterDTO4.equals(priceQuarantineVerdictParameterDTO3));
        System.assert(priceQuarantineVerdictParameterDTO3.equals(priceQuarantineVerdictParameterDTO3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASPriceQuarantineVerdictParameterDT priceQuarantineVerdictParameterDTO1 = OASPriceQuarantineVerdictParameterDT.getExample();
        OASPriceQuarantineVerdictParameterDT priceQuarantineVerdictParameterDTO2 = OASPriceQuarantineVerdictParameterDT.getExample();
        OASPriceQuarantineVerdictParameterDT priceQuarantineVerdictParameterDTO3 = new OASPriceQuarantineVerdictParameterDT();
        OASPriceQuarantineVerdictParameterDT priceQuarantineVerdictParameterDTO4 = new OASPriceQuarantineVerdictParameterDT();

        System.assert(priceQuarantineVerdictParameterDTO1.equals(priceQuarantineVerdictParameterDTO2));
        System.assert(priceQuarantineVerdictParameterDTO2.equals(priceQuarantineVerdictParameterDTO1));
        System.assert(priceQuarantineVerdictParameterDTO3.equals(priceQuarantineVerdictParameterDTO4));
        System.assert(priceQuarantineVerdictParameterDTO4.equals(priceQuarantineVerdictParameterDTO3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASPriceQuarantineVerdictParameterDT priceQuarantineVerdictParameterDTO1 = OASPriceQuarantineVerdictParameterDT.getExample();
        OASPriceQuarantineVerdictParameterDT priceQuarantineVerdictParameterDTO2 = new OASPriceQuarantineVerdictParameterDT();

        System.assertEquals(false, priceQuarantineVerdictParameterDTO1.equals('foo'));
        System.assertEquals(false, priceQuarantineVerdictParameterDTO2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASPriceQuarantineVerdictParameterDT priceQuarantineVerdictParameterDTO1 = OASPriceQuarantineVerdictParameterDT.getExample();
        OASPriceQuarantineVerdictParameterDT priceQuarantineVerdictParameterDTO2 = new OASPriceQuarantineVerdictParameterDT();
        OASPriceQuarantineVerdictParameterDT priceQuarantineVerdictParameterDTO3;

        System.assertEquals(false, priceQuarantineVerdictParameterDTO1.equals(priceQuarantineVerdictParameterDTO3));
        System.assertEquals(false, priceQuarantineVerdictParameterDTO2.equals(priceQuarantineVerdictParameterDTO3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASPriceQuarantineVerdictParameterDT priceQuarantineVerdictParameterDTO1 = OASPriceQuarantineVerdictParameterDT.getExample();
        OASPriceQuarantineVerdictParameterDT priceQuarantineVerdictParameterDTO2 = new OASPriceQuarantineVerdictParameterDT();

        System.assertEquals(priceQuarantineVerdictParameterDTO1.hashCode(), priceQuarantineVerdictParameterDTO1.hashCode());
        System.assertEquals(priceQuarantineVerdictParameterDTO2.hashCode(), priceQuarantineVerdictParameterDTO2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASPriceQuarantineVerdictParameterDT priceQuarantineVerdictParameterDTO1 = OASPriceQuarantineVerdictParameterDT.getExample();
        OASPriceQuarantineVerdictParameterDT priceQuarantineVerdictParameterDTO2 = OASPriceQuarantineVerdictParameterDT.getExample();
        OASPriceQuarantineVerdictParameterDT priceQuarantineVerdictParameterDTO3 = new OASPriceQuarantineVerdictParameterDT();
        OASPriceQuarantineVerdictParameterDT priceQuarantineVerdictParameterDTO4 = new OASPriceQuarantineVerdictParameterDT();

        System.assert(priceQuarantineVerdictParameterDTO1.equals(priceQuarantineVerdictParameterDTO2));
        System.assert(priceQuarantineVerdictParameterDTO3.equals(priceQuarantineVerdictParameterDTO4));
        System.assertEquals(priceQuarantineVerdictParameterDTO1.hashCode(), priceQuarantineVerdictParameterDTO2.hashCode());
        System.assertEquals(priceQuarantineVerdictParameterDTO3.hashCode(), priceQuarantineVerdictParameterDTO4.hashCode());
    }
}
