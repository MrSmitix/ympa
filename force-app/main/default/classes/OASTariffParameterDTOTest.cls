@isTest
private class OASTariffParameterDTOTest {
    @isTest
    private static void equalsSameInstance() {
        OASTariffParameterDTO tariffParameterDTO1 = OASTariffParameterDTO.getExample();
        OASTariffParameterDTO tariffParameterDTO2 = tariffParameterDTO1;
        OASTariffParameterDTO tariffParameterDTO3 = new OASTariffParameterDTO();
        OASTariffParameterDTO tariffParameterDTO4 = tariffParameterDTO3;

        System.assert(tariffParameterDTO1.equals(tariffParameterDTO2));
        System.assert(tariffParameterDTO2.equals(tariffParameterDTO1));
        System.assert(tariffParameterDTO1.equals(tariffParameterDTO1));
        System.assert(tariffParameterDTO3.equals(tariffParameterDTO4));
        System.assert(tariffParameterDTO4.equals(tariffParameterDTO3));
        System.assert(tariffParameterDTO3.equals(tariffParameterDTO3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASTariffParameterDTO tariffParameterDTO1 = OASTariffParameterDTO.getExample();
        OASTariffParameterDTO tariffParameterDTO2 = OASTariffParameterDTO.getExample();
        OASTariffParameterDTO tariffParameterDTO3 = new OASTariffParameterDTO();
        OASTariffParameterDTO tariffParameterDTO4 = new OASTariffParameterDTO();

        System.assert(tariffParameterDTO1.equals(tariffParameterDTO2));
        System.assert(tariffParameterDTO2.equals(tariffParameterDTO1));
        System.assert(tariffParameterDTO3.equals(tariffParameterDTO4));
        System.assert(tariffParameterDTO4.equals(tariffParameterDTO3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASTariffParameterDTO tariffParameterDTO1 = OASTariffParameterDTO.getExample();
        OASTariffParameterDTO tariffParameterDTO2 = new OASTariffParameterDTO();

        System.assertEquals(false, tariffParameterDTO1.equals('foo'));
        System.assertEquals(false, tariffParameterDTO2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASTariffParameterDTO tariffParameterDTO1 = OASTariffParameterDTO.getExample();
        OASTariffParameterDTO tariffParameterDTO2 = new OASTariffParameterDTO();
        OASTariffParameterDTO tariffParameterDTO3;

        System.assertEquals(false, tariffParameterDTO1.equals(tariffParameterDTO3));
        System.assertEquals(false, tariffParameterDTO2.equals(tariffParameterDTO3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASTariffParameterDTO tariffParameterDTO1 = OASTariffParameterDTO.getExample();
        OASTariffParameterDTO tariffParameterDTO2 = new OASTariffParameterDTO();

        System.assertEquals(tariffParameterDTO1.hashCode(), tariffParameterDTO1.hashCode());
        System.assertEquals(tariffParameterDTO2.hashCode(), tariffParameterDTO2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASTariffParameterDTO tariffParameterDTO1 = OASTariffParameterDTO.getExample();
        OASTariffParameterDTO tariffParameterDTO2 = OASTariffParameterDTO.getExample();
        OASTariffParameterDTO tariffParameterDTO3 = new OASTariffParameterDTO();
        OASTariffParameterDTO tariffParameterDTO4 = new OASTariffParameterDTO();

        System.assert(tariffParameterDTO1.equals(tariffParameterDTO2));
        System.assert(tariffParameterDTO3.equals(tariffParameterDTO4));
        System.assertEquals(tariffParameterDTO1.hashCode(), tariffParameterDTO2.hashCode());
        System.assertEquals(tariffParameterDTO3.hashCode(), tariffParameterDTO4.hashCode());
    }
}
