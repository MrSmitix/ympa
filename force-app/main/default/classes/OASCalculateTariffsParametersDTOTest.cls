@isTest
private class OASCalculateTariffsParametersDTOTest {
    @isTest
    private static void equalsSameInstance() {
        OASCalculateTariffsParametersDTO calculateTariffsParametersDTO1 = OASCalculateTariffsParametersDTO.getExample();
        OASCalculateTariffsParametersDTO calculateTariffsParametersDTO2 = calculateTariffsParametersDTO1;
        OASCalculateTariffsParametersDTO calculateTariffsParametersDTO3 = new OASCalculateTariffsParametersDTO();
        OASCalculateTariffsParametersDTO calculateTariffsParametersDTO4 = calculateTariffsParametersDTO3;

        System.assert(calculateTariffsParametersDTO1.equals(calculateTariffsParametersDTO2));
        System.assert(calculateTariffsParametersDTO2.equals(calculateTariffsParametersDTO1));
        System.assert(calculateTariffsParametersDTO1.equals(calculateTariffsParametersDTO1));
        System.assert(calculateTariffsParametersDTO3.equals(calculateTariffsParametersDTO4));
        System.assert(calculateTariffsParametersDTO4.equals(calculateTariffsParametersDTO3));
        System.assert(calculateTariffsParametersDTO3.equals(calculateTariffsParametersDTO3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASCalculateTariffsParametersDTO calculateTariffsParametersDTO1 = OASCalculateTariffsParametersDTO.getExample();
        OASCalculateTariffsParametersDTO calculateTariffsParametersDTO2 = OASCalculateTariffsParametersDTO.getExample();
        OASCalculateTariffsParametersDTO calculateTariffsParametersDTO3 = new OASCalculateTariffsParametersDTO();
        OASCalculateTariffsParametersDTO calculateTariffsParametersDTO4 = new OASCalculateTariffsParametersDTO();

        System.assert(calculateTariffsParametersDTO1.equals(calculateTariffsParametersDTO2));
        System.assert(calculateTariffsParametersDTO2.equals(calculateTariffsParametersDTO1));
        System.assert(calculateTariffsParametersDTO3.equals(calculateTariffsParametersDTO4));
        System.assert(calculateTariffsParametersDTO4.equals(calculateTariffsParametersDTO3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASCalculateTariffsParametersDTO calculateTariffsParametersDTO1 = OASCalculateTariffsParametersDTO.getExample();
        OASCalculateTariffsParametersDTO calculateTariffsParametersDTO2 = new OASCalculateTariffsParametersDTO();

        System.assertEquals(false, calculateTariffsParametersDTO1.equals('foo'));
        System.assertEquals(false, calculateTariffsParametersDTO2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASCalculateTariffsParametersDTO calculateTariffsParametersDTO1 = OASCalculateTariffsParametersDTO.getExample();
        OASCalculateTariffsParametersDTO calculateTariffsParametersDTO2 = new OASCalculateTariffsParametersDTO();
        OASCalculateTariffsParametersDTO calculateTariffsParametersDTO3;

        System.assertEquals(false, calculateTariffsParametersDTO1.equals(calculateTariffsParametersDTO3));
        System.assertEquals(false, calculateTariffsParametersDTO2.equals(calculateTariffsParametersDTO3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASCalculateTariffsParametersDTO calculateTariffsParametersDTO1 = OASCalculateTariffsParametersDTO.getExample();
        OASCalculateTariffsParametersDTO calculateTariffsParametersDTO2 = new OASCalculateTariffsParametersDTO();

        System.assertEquals(calculateTariffsParametersDTO1.hashCode(), calculateTariffsParametersDTO1.hashCode());
        System.assertEquals(calculateTariffsParametersDTO2.hashCode(), calculateTariffsParametersDTO2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASCalculateTariffsParametersDTO calculateTariffsParametersDTO1 = OASCalculateTariffsParametersDTO.getExample();
        OASCalculateTariffsParametersDTO calculateTariffsParametersDTO2 = OASCalculateTariffsParametersDTO.getExample();
        OASCalculateTariffsParametersDTO calculateTariffsParametersDTO3 = new OASCalculateTariffsParametersDTO();
        OASCalculateTariffsParametersDTO calculateTariffsParametersDTO4 = new OASCalculateTariffsParametersDTO();

        System.assert(calculateTariffsParametersDTO1.equals(calculateTariffsParametersDTO2));
        System.assert(calculateTariffsParametersDTO3.equals(calculateTariffsParametersDTO4));
        System.assertEquals(calculateTariffsParametersDTO1.hashCode(), calculateTariffsParametersDTO2.hashCode());
        System.assertEquals(calculateTariffsParametersDTO3.hashCode(), calculateTariffsParametersDTO4.hashCode());
    }
}
