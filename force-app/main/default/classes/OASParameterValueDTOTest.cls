@isTest
private class OASParameterValueDTOTest {
    @isTest
    private static void equalsSameInstance() {
        OASParameterValueDTO parameterValueDTO1 = OASParameterValueDTO.getExample();
        OASParameterValueDTO parameterValueDTO2 = parameterValueDTO1;
        OASParameterValueDTO parameterValueDTO3 = new OASParameterValueDTO();
        OASParameterValueDTO parameterValueDTO4 = parameterValueDTO3;

        System.assert(parameterValueDTO1.equals(parameterValueDTO2));
        System.assert(parameterValueDTO2.equals(parameterValueDTO1));
        System.assert(parameterValueDTO1.equals(parameterValueDTO1));
        System.assert(parameterValueDTO3.equals(parameterValueDTO4));
        System.assert(parameterValueDTO4.equals(parameterValueDTO3));
        System.assert(parameterValueDTO3.equals(parameterValueDTO3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASParameterValueDTO parameterValueDTO1 = OASParameterValueDTO.getExample();
        OASParameterValueDTO parameterValueDTO2 = OASParameterValueDTO.getExample();
        OASParameterValueDTO parameterValueDTO3 = new OASParameterValueDTO();
        OASParameterValueDTO parameterValueDTO4 = new OASParameterValueDTO();

        System.assert(parameterValueDTO1.equals(parameterValueDTO2));
        System.assert(parameterValueDTO2.equals(parameterValueDTO1));
        System.assert(parameterValueDTO3.equals(parameterValueDTO4));
        System.assert(parameterValueDTO4.equals(parameterValueDTO3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASParameterValueDTO parameterValueDTO1 = OASParameterValueDTO.getExample();
        OASParameterValueDTO parameterValueDTO2 = new OASParameterValueDTO();

        System.assertEquals(false, parameterValueDTO1.equals('foo'));
        System.assertEquals(false, parameterValueDTO2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASParameterValueDTO parameterValueDTO1 = OASParameterValueDTO.getExample();
        OASParameterValueDTO parameterValueDTO2 = new OASParameterValueDTO();
        OASParameterValueDTO parameterValueDTO3;

        System.assertEquals(false, parameterValueDTO1.equals(parameterValueDTO3));
        System.assertEquals(false, parameterValueDTO2.equals(parameterValueDTO3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASParameterValueDTO parameterValueDTO1 = OASParameterValueDTO.getExample();
        OASParameterValueDTO parameterValueDTO2 = new OASParameterValueDTO();

        System.assertEquals(parameterValueDTO1.hashCode(), parameterValueDTO1.hashCode());
        System.assertEquals(parameterValueDTO2.hashCode(), parameterValueDTO2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASParameterValueDTO parameterValueDTO1 = OASParameterValueDTO.getExample();
        OASParameterValueDTO parameterValueDTO2 = OASParameterValueDTO.getExample();
        OASParameterValueDTO parameterValueDTO3 = new OASParameterValueDTO();
        OASParameterValueDTO parameterValueDTO4 = new OASParameterValueDTO();

        System.assert(parameterValueDTO1.equals(parameterValueDTO2));
        System.assert(parameterValueDTO3.equals(parameterValueDTO4));
        System.assertEquals(parameterValueDTO1.hashCode(), parameterValueDTO2.hashCode());
        System.assertEquals(parameterValueDTO3.hashCode(), parameterValueDTO4.hashCode());
    }
}
