@isTest
private class OASParameterValueOptionDTOTest {
    @isTest
    private static void equalsSameInstance() {
        OASParameterValueOptionDTO parameterValueOptionDTO1 = OASParameterValueOptionDTO.getExample();
        OASParameterValueOptionDTO parameterValueOptionDTO2 = parameterValueOptionDTO1;
        OASParameterValueOptionDTO parameterValueOptionDTO3 = new OASParameterValueOptionDTO();
        OASParameterValueOptionDTO parameterValueOptionDTO4 = parameterValueOptionDTO3;

        System.assert(parameterValueOptionDTO1.equals(parameterValueOptionDTO2));
        System.assert(parameterValueOptionDTO2.equals(parameterValueOptionDTO1));
        System.assert(parameterValueOptionDTO1.equals(parameterValueOptionDTO1));
        System.assert(parameterValueOptionDTO3.equals(parameterValueOptionDTO4));
        System.assert(parameterValueOptionDTO4.equals(parameterValueOptionDTO3));
        System.assert(parameterValueOptionDTO3.equals(parameterValueOptionDTO3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASParameterValueOptionDTO parameterValueOptionDTO1 = OASParameterValueOptionDTO.getExample();
        OASParameterValueOptionDTO parameterValueOptionDTO2 = OASParameterValueOptionDTO.getExample();
        OASParameterValueOptionDTO parameterValueOptionDTO3 = new OASParameterValueOptionDTO();
        OASParameterValueOptionDTO parameterValueOptionDTO4 = new OASParameterValueOptionDTO();

        System.assert(parameterValueOptionDTO1.equals(parameterValueOptionDTO2));
        System.assert(parameterValueOptionDTO2.equals(parameterValueOptionDTO1));
        System.assert(parameterValueOptionDTO3.equals(parameterValueOptionDTO4));
        System.assert(parameterValueOptionDTO4.equals(parameterValueOptionDTO3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASParameterValueOptionDTO parameterValueOptionDTO1 = OASParameterValueOptionDTO.getExample();
        OASParameterValueOptionDTO parameterValueOptionDTO2 = new OASParameterValueOptionDTO();

        System.assertEquals(false, parameterValueOptionDTO1.equals('foo'));
        System.assertEquals(false, parameterValueOptionDTO2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASParameterValueOptionDTO parameterValueOptionDTO1 = OASParameterValueOptionDTO.getExample();
        OASParameterValueOptionDTO parameterValueOptionDTO2 = new OASParameterValueOptionDTO();
        OASParameterValueOptionDTO parameterValueOptionDTO3;

        System.assertEquals(false, parameterValueOptionDTO1.equals(parameterValueOptionDTO3));
        System.assertEquals(false, parameterValueOptionDTO2.equals(parameterValueOptionDTO3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASParameterValueOptionDTO parameterValueOptionDTO1 = OASParameterValueOptionDTO.getExample();
        OASParameterValueOptionDTO parameterValueOptionDTO2 = new OASParameterValueOptionDTO();

        System.assertEquals(parameterValueOptionDTO1.hashCode(), parameterValueOptionDTO1.hashCode());
        System.assertEquals(parameterValueOptionDTO2.hashCode(), parameterValueOptionDTO2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASParameterValueOptionDTO parameterValueOptionDTO1 = OASParameterValueOptionDTO.getExample();
        OASParameterValueOptionDTO parameterValueOptionDTO2 = OASParameterValueOptionDTO.getExample();
        OASParameterValueOptionDTO parameterValueOptionDTO3 = new OASParameterValueOptionDTO();
        OASParameterValueOptionDTO parameterValueOptionDTO4 = new OASParameterValueOptionDTO();

        System.assert(parameterValueOptionDTO1.equals(parameterValueOptionDTO2));
        System.assert(parameterValueOptionDTO3.equals(parameterValueOptionDTO4));
        System.assertEquals(parameterValueOptionDTO1.hashCode(), parameterValueOptionDTO2.hashCode());
        System.assertEquals(parameterValueOptionDTO3.hashCode(), parameterValueOptionDTO4.hashCode());
    }
}
