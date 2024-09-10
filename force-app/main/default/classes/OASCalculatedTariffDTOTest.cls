@isTest
private class OASCalculatedTariffDTOTest {
    @isTest
    private static void equalsSameInstance() {
        OASCalculatedTariffDTO calculatedTariffDTO1 = OASCalculatedTariffDTO.getExample();
        OASCalculatedTariffDTO calculatedTariffDTO2 = calculatedTariffDTO1;
        OASCalculatedTariffDTO calculatedTariffDTO3 = new OASCalculatedTariffDTO();
        OASCalculatedTariffDTO calculatedTariffDTO4 = calculatedTariffDTO3;

        System.assert(calculatedTariffDTO1.equals(calculatedTariffDTO2));
        System.assert(calculatedTariffDTO2.equals(calculatedTariffDTO1));
        System.assert(calculatedTariffDTO1.equals(calculatedTariffDTO1));
        System.assert(calculatedTariffDTO3.equals(calculatedTariffDTO4));
        System.assert(calculatedTariffDTO4.equals(calculatedTariffDTO3));
        System.assert(calculatedTariffDTO3.equals(calculatedTariffDTO3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASCalculatedTariffDTO calculatedTariffDTO1 = OASCalculatedTariffDTO.getExample();
        OASCalculatedTariffDTO calculatedTariffDTO2 = OASCalculatedTariffDTO.getExample();
        OASCalculatedTariffDTO calculatedTariffDTO3 = new OASCalculatedTariffDTO();
        OASCalculatedTariffDTO calculatedTariffDTO4 = new OASCalculatedTariffDTO();

        System.assert(calculatedTariffDTO1.equals(calculatedTariffDTO2));
        System.assert(calculatedTariffDTO2.equals(calculatedTariffDTO1));
        System.assert(calculatedTariffDTO3.equals(calculatedTariffDTO4));
        System.assert(calculatedTariffDTO4.equals(calculatedTariffDTO3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASCalculatedTariffDTO calculatedTariffDTO1 = OASCalculatedTariffDTO.getExample();
        OASCalculatedTariffDTO calculatedTariffDTO2 = new OASCalculatedTariffDTO();

        System.assertEquals(false, calculatedTariffDTO1.equals('foo'));
        System.assertEquals(false, calculatedTariffDTO2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASCalculatedTariffDTO calculatedTariffDTO1 = OASCalculatedTariffDTO.getExample();
        OASCalculatedTariffDTO calculatedTariffDTO2 = new OASCalculatedTariffDTO();
        OASCalculatedTariffDTO calculatedTariffDTO3;

        System.assertEquals(false, calculatedTariffDTO1.equals(calculatedTariffDTO3));
        System.assertEquals(false, calculatedTariffDTO2.equals(calculatedTariffDTO3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASCalculatedTariffDTO calculatedTariffDTO1 = OASCalculatedTariffDTO.getExample();
        OASCalculatedTariffDTO calculatedTariffDTO2 = new OASCalculatedTariffDTO();

        System.assertEquals(calculatedTariffDTO1.hashCode(), calculatedTariffDTO1.hashCode());
        System.assertEquals(calculatedTariffDTO2.hashCode(), calculatedTariffDTO2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASCalculatedTariffDTO calculatedTariffDTO1 = OASCalculatedTariffDTO.getExample();
        OASCalculatedTariffDTO calculatedTariffDTO2 = OASCalculatedTariffDTO.getExample();
        OASCalculatedTariffDTO calculatedTariffDTO3 = new OASCalculatedTariffDTO();
        OASCalculatedTariffDTO calculatedTariffDTO4 = new OASCalculatedTariffDTO();

        System.assert(calculatedTariffDTO1.equals(calculatedTariffDTO2));
        System.assert(calculatedTariffDTO3.equals(calculatedTariffDTO4));
        System.assertEquals(calculatedTariffDTO1.hashCode(), calculatedTariffDTO2.hashCode());
        System.assertEquals(calculatedTariffDTO3.hashCode(), calculatedTariffDTO4.hashCode());
    }

    @isTest
    private static void defaultValuesPopulated() {
        OASCalculatedTariffDTO calculatedTariffDTO = new OASCalculatedTariffDTO();
        System.assertEquals(new List<OASTariffParameterDTO>(), calculatedTariffDTO.parameters);
        System.assertEquals(null, calculatedTariffDTO.type);
        System.assertEquals(null, calculatedTariffDTO.amount);
    }
}
