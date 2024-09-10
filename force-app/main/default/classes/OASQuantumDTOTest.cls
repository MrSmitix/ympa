@isTest
private class OASQuantumDTOTest {
    @isTest
    private static void equalsSameInstance() {
        OASQuantumDTO quantumDTO1 = OASQuantumDTO.getExample();
        OASQuantumDTO quantumDTO2 = quantumDTO1;
        OASQuantumDTO quantumDTO3 = new OASQuantumDTO();
        OASQuantumDTO quantumDTO4 = quantumDTO3;

        System.assert(quantumDTO1.equals(quantumDTO2));
        System.assert(quantumDTO2.equals(quantumDTO1));
        System.assert(quantumDTO1.equals(quantumDTO1));
        System.assert(quantumDTO3.equals(quantumDTO4));
        System.assert(quantumDTO4.equals(quantumDTO3));
        System.assert(quantumDTO3.equals(quantumDTO3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASQuantumDTO quantumDTO1 = OASQuantumDTO.getExample();
        OASQuantumDTO quantumDTO2 = OASQuantumDTO.getExample();
        OASQuantumDTO quantumDTO3 = new OASQuantumDTO();
        OASQuantumDTO quantumDTO4 = new OASQuantumDTO();

        System.assert(quantumDTO1.equals(quantumDTO2));
        System.assert(quantumDTO2.equals(quantumDTO1));
        System.assert(quantumDTO3.equals(quantumDTO4));
        System.assert(quantumDTO4.equals(quantumDTO3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASQuantumDTO quantumDTO1 = OASQuantumDTO.getExample();
        OASQuantumDTO quantumDTO2 = new OASQuantumDTO();

        System.assertEquals(false, quantumDTO1.equals('foo'));
        System.assertEquals(false, quantumDTO2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASQuantumDTO quantumDTO1 = OASQuantumDTO.getExample();
        OASQuantumDTO quantumDTO2 = new OASQuantumDTO();
        OASQuantumDTO quantumDTO3;

        System.assertEquals(false, quantumDTO1.equals(quantumDTO3));
        System.assertEquals(false, quantumDTO2.equals(quantumDTO3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASQuantumDTO quantumDTO1 = OASQuantumDTO.getExample();
        OASQuantumDTO quantumDTO2 = new OASQuantumDTO();

        System.assertEquals(quantumDTO1.hashCode(), quantumDTO1.hashCode());
        System.assertEquals(quantumDTO2.hashCode(), quantumDTO2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASQuantumDTO quantumDTO1 = OASQuantumDTO.getExample();
        OASQuantumDTO quantumDTO2 = OASQuantumDTO.getExample();
        OASQuantumDTO quantumDTO3 = new OASQuantumDTO();
        OASQuantumDTO quantumDTO4 = new OASQuantumDTO();

        System.assert(quantumDTO1.equals(quantumDTO2));
        System.assert(quantumDTO3.equals(quantumDTO4));
        System.assertEquals(quantumDTO1.hashCode(), quantumDTO2.hashCode());
        System.assertEquals(quantumDTO3.hashCode(), quantumDTO4.hashCode());
    }
}
