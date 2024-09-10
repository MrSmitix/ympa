@isTest
private class OASMaxSaleQuantumDTOTest {
    @isTest
    private static void equalsSameInstance() {
        OASMaxSaleQuantumDTO maxSaleQuantumDTO1 = OASMaxSaleQuantumDTO.getExample();
        OASMaxSaleQuantumDTO maxSaleQuantumDTO2 = maxSaleQuantumDTO1;
        OASMaxSaleQuantumDTO maxSaleQuantumDTO3 = new OASMaxSaleQuantumDTO();
        OASMaxSaleQuantumDTO maxSaleQuantumDTO4 = maxSaleQuantumDTO3;

        System.assert(maxSaleQuantumDTO1.equals(maxSaleQuantumDTO2));
        System.assert(maxSaleQuantumDTO2.equals(maxSaleQuantumDTO1));
        System.assert(maxSaleQuantumDTO1.equals(maxSaleQuantumDTO1));
        System.assert(maxSaleQuantumDTO3.equals(maxSaleQuantumDTO4));
        System.assert(maxSaleQuantumDTO4.equals(maxSaleQuantumDTO3));
        System.assert(maxSaleQuantumDTO3.equals(maxSaleQuantumDTO3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASMaxSaleQuantumDTO maxSaleQuantumDTO1 = OASMaxSaleQuantumDTO.getExample();
        OASMaxSaleQuantumDTO maxSaleQuantumDTO2 = OASMaxSaleQuantumDTO.getExample();
        OASMaxSaleQuantumDTO maxSaleQuantumDTO3 = new OASMaxSaleQuantumDTO();
        OASMaxSaleQuantumDTO maxSaleQuantumDTO4 = new OASMaxSaleQuantumDTO();

        System.assert(maxSaleQuantumDTO1.equals(maxSaleQuantumDTO2));
        System.assert(maxSaleQuantumDTO2.equals(maxSaleQuantumDTO1));
        System.assert(maxSaleQuantumDTO3.equals(maxSaleQuantumDTO4));
        System.assert(maxSaleQuantumDTO4.equals(maxSaleQuantumDTO3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASMaxSaleQuantumDTO maxSaleQuantumDTO1 = OASMaxSaleQuantumDTO.getExample();
        OASMaxSaleQuantumDTO maxSaleQuantumDTO2 = new OASMaxSaleQuantumDTO();

        System.assertEquals(false, maxSaleQuantumDTO1.equals('foo'));
        System.assertEquals(false, maxSaleQuantumDTO2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASMaxSaleQuantumDTO maxSaleQuantumDTO1 = OASMaxSaleQuantumDTO.getExample();
        OASMaxSaleQuantumDTO maxSaleQuantumDTO2 = new OASMaxSaleQuantumDTO();
        OASMaxSaleQuantumDTO maxSaleQuantumDTO3;

        System.assertEquals(false, maxSaleQuantumDTO1.equals(maxSaleQuantumDTO3));
        System.assertEquals(false, maxSaleQuantumDTO2.equals(maxSaleQuantumDTO3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASMaxSaleQuantumDTO maxSaleQuantumDTO1 = OASMaxSaleQuantumDTO.getExample();
        OASMaxSaleQuantumDTO maxSaleQuantumDTO2 = new OASMaxSaleQuantumDTO();

        System.assertEquals(maxSaleQuantumDTO1.hashCode(), maxSaleQuantumDTO1.hashCode());
        System.assertEquals(maxSaleQuantumDTO2.hashCode(), maxSaleQuantumDTO2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASMaxSaleQuantumDTO maxSaleQuantumDTO1 = OASMaxSaleQuantumDTO.getExample();
        OASMaxSaleQuantumDTO maxSaleQuantumDTO2 = OASMaxSaleQuantumDTO.getExample();
        OASMaxSaleQuantumDTO maxSaleQuantumDTO3 = new OASMaxSaleQuantumDTO();
        OASMaxSaleQuantumDTO maxSaleQuantumDTO4 = new OASMaxSaleQuantumDTO();

        System.assert(maxSaleQuantumDTO1.equals(maxSaleQuantumDTO2));
        System.assert(maxSaleQuantumDTO3.equals(maxSaleQuantumDTO4));
        System.assertEquals(maxSaleQuantumDTO1.hashCode(), maxSaleQuantumDTO2.hashCode());
        System.assertEquals(maxSaleQuantumDTO3.hashCode(), maxSaleQuantumDTO4.hashCode());
    }
}
