@isTest
private class OASTariffDTOTest {
    @isTest
    private static void equalsSameInstance() {
        OASTariffDTO tariffDTO1 = OASTariffDTO.getExample();
        OASTariffDTO tariffDTO2 = tariffDTO1;
        OASTariffDTO tariffDTO3 = new OASTariffDTO();
        OASTariffDTO tariffDTO4 = tariffDTO3;

        System.assert(tariffDTO1.equals(tariffDTO2));
        System.assert(tariffDTO2.equals(tariffDTO1));
        System.assert(tariffDTO1.equals(tariffDTO1));
        System.assert(tariffDTO3.equals(tariffDTO4));
        System.assert(tariffDTO4.equals(tariffDTO3));
        System.assert(tariffDTO3.equals(tariffDTO3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASTariffDTO tariffDTO1 = OASTariffDTO.getExample();
        OASTariffDTO tariffDTO2 = OASTariffDTO.getExample();
        OASTariffDTO tariffDTO3 = new OASTariffDTO();
        OASTariffDTO tariffDTO4 = new OASTariffDTO();

        System.assert(tariffDTO1.equals(tariffDTO2));
        System.assert(tariffDTO2.equals(tariffDTO1));
        System.assert(tariffDTO3.equals(tariffDTO4));
        System.assert(tariffDTO4.equals(tariffDTO3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASTariffDTO tariffDTO1 = OASTariffDTO.getExample();
        OASTariffDTO tariffDTO2 = new OASTariffDTO();

        System.assertEquals(false, tariffDTO1.equals('foo'));
        System.assertEquals(false, tariffDTO2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASTariffDTO tariffDTO1 = OASTariffDTO.getExample();
        OASTariffDTO tariffDTO2 = new OASTariffDTO();
        OASTariffDTO tariffDTO3;

        System.assertEquals(false, tariffDTO1.equals(tariffDTO3));
        System.assertEquals(false, tariffDTO2.equals(tariffDTO3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASTariffDTO tariffDTO1 = OASTariffDTO.getExample();
        OASTariffDTO tariffDTO2 = new OASTariffDTO();

        System.assertEquals(tariffDTO1.hashCode(), tariffDTO1.hashCode());
        System.assertEquals(tariffDTO2.hashCode(), tariffDTO2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASTariffDTO tariffDTO1 = OASTariffDTO.getExample();
        OASTariffDTO tariffDTO2 = OASTariffDTO.getExample();
        OASTariffDTO tariffDTO3 = new OASTariffDTO();
        OASTariffDTO tariffDTO4 = new OASTariffDTO();

        System.assert(tariffDTO1.equals(tariffDTO2));
        System.assert(tariffDTO3.equals(tariffDTO4));
        System.assertEquals(tariffDTO1.hashCode(), tariffDTO2.hashCode());
        System.assertEquals(tariffDTO3.hashCode(), tariffDTO4.hashCode());
    }

    @isTest
    private static void defaultValuesPopulated() {
        OASTariffDTO tariffDTO = new OASTariffDTO();
        System.assertEquals(new List<OASTariffParameterDTO>(), tariffDTO.parameters);
        System.assertEquals(null, tariffDTO.type);
        System.assertEquals(null, tariffDTO.percent);
        System.assertEquals(null, tariffDTO.amount);
    }
}
