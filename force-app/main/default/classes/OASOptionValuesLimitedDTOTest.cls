@isTest
private class OASOptionValuesLimitedDTOTest {
    @isTest
    private static void equalsSameInstance() {
        OASOptionValuesLimitedDTO optionValuesLimitedDTO1 = OASOptionValuesLimitedDTO.getExample();
        OASOptionValuesLimitedDTO optionValuesLimitedDTO2 = optionValuesLimitedDTO1;
        OASOptionValuesLimitedDTO optionValuesLimitedDTO3 = new OASOptionValuesLimitedDTO();
        OASOptionValuesLimitedDTO optionValuesLimitedDTO4 = optionValuesLimitedDTO3;

        System.assert(optionValuesLimitedDTO1.equals(optionValuesLimitedDTO2));
        System.assert(optionValuesLimitedDTO2.equals(optionValuesLimitedDTO1));
        System.assert(optionValuesLimitedDTO1.equals(optionValuesLimitedDTO1));
        System.assert(optionValuesLimitedDTO3.equals(optionValuesLimitedDTO4));
        System.assert(optionValuesLimitedDTO4.equals(optionValuesLimitedDTO3));
        System.assert(optionValuesLimitedDTO3.equals(optionValuesLimitedDTO3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASOptionValuesLimitedDTO optionValuesLimitedDTO1 = OASOptionValuesLimitedDTO.getExample();
        OASOptionValuesLimitedDTO optionValuesLimitedDTO2 = OASOptionValuesLimitedDTO.getExample();
        OASOptionValuesLimitedDTO optionValuesLimitedDTO3 = new OASOptionValuesLimitedDTO();
        OASOptionValuesLimitedDTO optionValuesLimitedDTO4 = new OASOptionValuesLimitedDTO();

        System.assert(optionValuesLimitedDTO1.equals(optionValuesLimitedDTO2));
        System.assert(optionValuesLimitedDTO2.equals(optionValuesLimitedDTO1));
        System.assert(optionValuesLimitedDTO3.equals(optionValuesLimitedDTO4));
        System.assert(optionValuesLimitedDTO4.equals(optionValuesLimitedDTO3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASOptionValuesLimitedDTO optionValuesLimitedDTO1 = OASOptionValuesLimitedDTO.getExample();
        OASOptionValuesLimitedDTO optionValuesLimitedDTO2 = new OASOptionValuesLimitedDTO();

        System.assertEquals(false, optionValuesLimitedDTO1.equals('foo'));
        System.assertEquals(false, optionValuesLimitedDTO2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASOptionValuesLimitedDTO optionValuesLimitedDTO1 = OASOptionValuesLimitedDTO.getExample();
        OASOptionValuesLimitedDTO optionValuesLimitedDTO2 = new OASOptionValuesLimitedDTO();
        OASOptionValuesLimitedDTO optionValuesLimitedDTO3;

        System.assertEquals(false, optionValuesLimitedDTO1.equals(optionValuesLimitedDTO3));
        System.assertEquals(false, optionValuesLimitedDTO2.equals(optionValuesLimitedDTO3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASOptionValuesLimitedDTO optionValuesLimitedDTO1 = OASOptionValuesLimitedDTO.getExample();
        OASOptionValuesLimitedDTO optionValuesLimitedDTO2 = new OASOptionValuesLimitedDTO();

        System.assertEquals(optionValuesLimitedDTO1.hashCode(), optionValuesLimitedDTO1.hashCode());
        System.assertEquals(optionValuesLimitedDTO2.hashCode(), optionValuesLimitedDTO2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASOptionValuesLimitedDTO optionValuesLimitedDTO1 = OASOptionValuesLimitedDTO.getExample();
        OASOptionValuesLimitedDTO optionValuesLimitedDTO2 = OASOptionValuesLimitedDTO.getExample();
        OASOptionValuesLimitedDTO optionValuesLimitedDTO3 = new OASOptionValuesLimitedDTO();
        OASOptionValuesLimitedDTO optionValuesLimitedDTO4 = new OASOptionValuesLimitedDTO();

        System.assert(optionValuesLimitedDTO1.equals(optionValuesLimitedDTO2));
        System.assert(optionValuesLimitedDTO3.equals(optionValuesLimitedDTO4));
        System.assertEquals(optionValuesLimitedDTO1.hashCode(), optionValuesLimitedDTO2.hashCode());
        System.assertEquals(optionValuesLimitedDTO3.hashCode(), optionValuesLimitedDTO4.hashCode());
    }

    @isTest
    private static void defaultValuesPopulated() {
        OASOptionValuesLimitedDTO optionValuesLimitedDTO = new OASOptionValuesLimitedDTO();
        System.assertEquals(new List<Long>(), optionValuesLimitedDTO.optionValueIds);
        System.assertEquals(null, optionValuesLimitedDTO.limitingOptionValueId);
    }
}
