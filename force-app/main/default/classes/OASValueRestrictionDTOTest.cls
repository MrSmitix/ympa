@isTest
private class OASValueRestrictionDTOTest {
    @isTest
    private static void equalsSameInstance() {
        OASValueRestrictionDTO valueRestrictionDTO1 = OASValueRestrictionDTO.getExample();
        OASValueRestrictionDTO valueRestrictionDTO2 = valueRestrictionDTO1;
        OASValueRestrictionDTO valueRestrictionDTO3 = new OASValueRestrictionDTO();
        OASValueRestrictionDTO valueRestrictionDTO4 = valueRestrictionDTO3;

        System.assert(valueRestrictionDTO1.equals(valueRestrictionDTO2));
        System.assert(valueRestrictionDTO2.equals(valueRestrictionDTO1));
        System.assert(valueRestrictionDTO1.equals(valueRestrictionDTO1));
        System.assert(valueRestrictionDTO3.equals(valueRestrictionDTO4));
        System.assert(valueRestrictionDTO4.equals(valueRestrictionDTO3));
        System.assert(valueRestrictionDTO3.equals(valueRestrictionDTO3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASValueRestrictionDTO valueRestrictionDTO1 = OASValueRestrictionDTO.getExample();
        OASValueRestrictionDTO valueRestrictionDTO2 = OASValueRestrictionDTO.getExample();
        OASValueRestrictionDTO valueRestrictionDTO3 = new OASValueRestrictionDTO();
        OASValueRestrictionDTO valueRestrictionDTO4 = new OASValueRestrictionDTO();

        System.assert(valueRestrictionDTO1.equals(valueRestrictionDTO2));
        System.assert(valueRestrictionDTO2.equals(valueRestrictionDTO1));
        System.assert(valueRestrictionDTO3.equals(valueRestrictionDTO4));
        System.assert(valueRestrictionDTO4.equals(valueRestrictionDTO3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASValueRestrictionDTO valueRestrictionDTO1 = OASValueRestrictionDTO.getExample();
        OASValueRestrictionDTO valueRestrictionDTO2 = new OASValueRestrictionDTO();

        System.assertEquals(false, valueRestrictionDTO1.equals('foo'));
        System.assertEquals(false, valueRestrictionDTO2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASValueRestrictionDTO valueRestrictionDTO1 = OASValueRestrictionDTO.getExample();
        OASValueRestrictionDTO valueRestrictionDTO2 = new OASValueRestrictionDTO();
        OASValueRestrictionDTO valueRestrictionDTO3;

        System.assertEquals(false, valueRestrictionDTO1.equals(valueRestrictionDTO3));
        System.assertEquals(false, valueRestrictionDTO2.equals(valueRestrictionDTO3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASValueRestrictionDTO valueRestrictionDTO1 = OASValueRestrictionDTO.getExample();
        OASValueRestrictionDTO valueRestrictionDTO2 = new OASValueRestrictionDTO();

        System.assertEquals(valueRestrictionDTO1.hashCode(), valueRestrictionDTO1.hashCode());
        System.assertEquals(valueRestrictionDTO2.hashCode(), valueRestrictionDTO2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASValueRestrictionDTO valueRestrictionDTO1 = OASValueRestrictionDTO.getExample();
        OASValueRestrictionDTO valueRestrictionDTO2 = OASValueRestrictionDTO.getExample();
        OASValueRestrictionDTO valueRestrictionDTO3 = new OASValueRestrictionDTO();
        OASValueRestrictionDTO valueRestrictionDTO4 = new OASValueRestrictionDTO();

        System.assert(valueRestrictionDTO1.equals(valueRestrictionDTO2));
        System.assert(valueRestrictionDTO3.equals(valueRestrictionDTO4));
        System.assertEquals(valueRestrictionDTO1.hashCode(), valueRestrictionDTO2.hashCode());
        System.assertEquals(valueRestrictionDTO3.hashCode(), valueRestrictionDTO4.hashCode());
    }

    @isTest
    private static void defaultValuesPopulated() {
        OASValueRestrictionDTO valueRestrictionDTO = new OASValueRestrictionDTO();
        System.assertEquals(new List<OASOptionValuesLimitedDTO>(), valueRestrictionDTO.limitedValues);
        System.assertEquals(null, valueRestrictionDTO.limitingParameterId);
    }
}
