@isTest
private class OASParameterValueConstraintsDTOTest {
    @isTest
    private static void equalsSameInstance() {
        OASParameterValueConstraintsDTO parameterValueConstraintsDTO1 = OASParameterValueConstraintsDTO.getExample();
        OASParameterValueConstraintsDTO parameterValueConstraintsDTO2 = parameterValueConstraintsDTO1;
        OASParameterValueConstraintsDTO parameterValueConstraintsDTO3 = new OASParameterValueConstraintsDTO();
        OASParameterValueConstraintsDTO parameterValueConstraintsDTO4 = parameterValueConstraintsDTO3;

        System.assert(parameterValueConstraintsDTO1.equals(parameterValueConstraintsDTO2));
        System.assert(parameterValueConstraintsDTO2.equals(parameterValueConstraintsDTO1));
        System.assert(parameterValueConstraintsDTO1.equals(parameterValueConstraintsDTO1));
        System.assert(parameterValueConstraintsDTO3.equals(parameterValueConstraintsDTO4));
        System.assert(parameterValueConstraintsDTO4.equals(parameterValueConstraintsDTO3));
        System.assert(parameterValueConstraintsDTO3.equals(parameterValueConstraintsDTO3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASParameterValueConstraintsDTO parameterValueConstraintsDTO1 = OASParameterValueConstraintsDTO.getExample();
        OASParameterValueConstraintsDTO parameterValueConstraintsDTO2 = OASParameterValueConstraintsDTO.getExample();
        OASParameterValueConstraintsDTO parameterValueConstraintsDTO3 = new OASParameterValueConstraintsDTO();
        OASParameterValueConstraintsDTO parameterValueConstraintsDTO4 = new OASParameterValueConstraintsDTO();

        System.assert(parameterValueConstraintsDTO1.equals(parameterValueConstraintsDTO2));
        System.assert(parameterValueConstraintsDTO2.equals(parameterValueConstraintsDTO1));
        System.assert(parameterValueConstraintsDTO3.equals(parameterValueConstraintsDTO4));
        System.assert(parameterValueConstraintsDTO4.equals(parameterValueConstraintsDTO3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASParameterValueConstraintsDTO parameterValueConstraintsDTO1 = OASParameterValueConstraintsDTO.getExample();
        OASParameterValueConstraintsDTO parameterValueConstraintsDTO2 = new OASParameterValueConstraintsDTO();

        System.assertEquals(false, parameterValueConstraintsDTO1.equals('foo'));
        System.assertEquals(false, parameterValueConstraintsDTO2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASParameterValueConstraintsDTO parameterValueConstraintsDTO1 = OASParameterValueConstraintsDTO.getExample();
        OASParameterValueConstraintsDTO parameterValueConstraintsDTO2 = new OASParameterValueConstraintsDTO();
        OASParameterValueConstraintsDTO parameterValueConstraintsDTO3;

        System.assertEquals(false, parameterValueConstraintsDTO1.equals(parameterValueConstraintsDTO3));
        System.assertEquals(false, parameterValueConstraintsDTO2.equals(parameterValueConstraintsDTO3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASParameterValueConstraintsDTO parameterValueConstraintsDTO1 = OASParameterValueConstraintsDTO.getExample();
        OASParameterValueConstraintsDTO parameterValueConstraintsDTO2 = new OASParameterValueConstraintsDTO();

        System.assertEquals(parameterValueConstraintsDTO1.hashCode(), parameterValueConstraintsDTO1.hashCode());
        System.assertEquals(parameterValueConstraintsDTO2.hashCode(), parameterValueConstraintsDTO2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASParameterValueConstraintsDTO parameterValueConstraintsDTO1 = OASParameterValueConstraintsDTO.getExample();
        OASParameterValueConstraintsDTO parameterValueConstraintsDTO2 = OASParameterValueConstraintsDTO.getExample();
        OASParameterValueConstraintsDTO parameterValueConstraintsDTO3 = new OASParameterValueConstraintsDTO();
        OASParameterValueConstraintsDTO parameterValueConstraintsDTO4 = new OASParameterValueConstraintsDTO();

        System.assert(parameterValueConstraintsDTO1.equals(parameterValueConstraintsDTO2));
        System.assert(parameterValueConstraintsDTO3.equals(parameterValueConstraintsDTO4));
        System.assertEquals(parameterValueConstraintsDTO1.hashCode(), parameterValueConstraintsDTO2.hashCode());
        System.assertEquals(parameterValueConstraintsDTO3.hashCode(), parameterValueConstraintsDTO4.hashCode());
    }
}
