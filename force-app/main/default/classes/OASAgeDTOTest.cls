@isTest
private class OASAgeDTOTest {
    @isTest
    private static void equalsSameInstance() {
        OASAgeDTO ageDTO1 = OASAgeDTO.getExample();
        OASAgeDTO ageDTO2 = ageDTO1;
        OASAgeDTO ageDTO3 = new OASAgeDTO();
        OASAgeDTO ageDTO4 = ageDTO3;

        System.assert(ageDTO1.equals(ageDTO2));
        System.assert(ageDTO2.equals(ageDTO1));
        System.assert(ageDTO1.equals(ageDTO1));
        System.assert(ageDTO3.equals(ageDTO4));
        System.assert(ageDTO4.equals(ageDTO3));
        System.assert(ageDTO3.equals(ageDTO3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASAgeDTO ageDTO1 = OASAgeDTO.getExample();
        OASAgeDTO ageDTO2 = OASAgeDTO.getExample();
        OASAgeDTO ageDTO3 = new OASAgeDTO();
        OASAgeDTO ageDTO4 = new OASAgeDTO();

        System.assert(ageDTO1.equals(ageDTO2));
        System.assert(ageDTO2.equals(ageDTO1));
        System.assert(ageDTO3.equals(ageDTO4));
        System.assert(ageDTO4.equals(ageDTO3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASAgeDTO ageDTO1 = OASAgeDTO.getExample();
        OASAgeDTO ageDTO2 = new OASAgeDTO();

        System.assertEquals(false, ageDTO1.equals('foo'));
        System.assertEquals(false, ageDTO2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASAgeDTO ageDTO1 = OASAgeDTO.getExample();
        OASAgeDTO ageDTO2 = new OASAgeDTO();
        OASAgeDTO ageDTO3;

        System.assertEquals(false, ageDTO1.equals(ageDTO3));
        System.assertEquals(false, ageDTO2.equals(ageDTO3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASAgeDTO ageDTO1 = OASAgeDTO.getExample();
        OASAgeDTO ageDTO2 = new OASAgeDTO();

        System.assertEquals(ageDTO1.hashCode(), ageDTO1.hashCode());
        System.assertEquals(ageDTO2.hashCode(), ageDTO2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASAgeDTO ageDTO1 = OASAgeDTO.getExample();
        OASAgeDTO ageDTO2 = OASAgeDTO.getExample();
        OASAgeDTO ageDTO3 = new OASAgeDTO();
        OASAgeDTO ageDTO4 = new OASAgeDTO();

        System.assert(ageDTO1.equals(ageDTO2));
        System.assert(ageDTO3.equals(ageDTO4));
        System.assertEquals(ageDTO1.hashCode(), ageDTO2.hashCode());
        System.assertEquals(ageDTO3.hashCode(), ageDTO4.hashCode());
    }
}
