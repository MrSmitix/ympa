@isTest
private class OASTimePeriodDTOTest {
    @isTest
    private static void equalsSameInstance() {
        OASTimePeriodDTO timePeriodDTO1 = OASTimePeriodDTO.getExample();
        OASTimePeriodDTO timePeriodDTO2 = timePeriodDTO1;
        OASTimePeriodDTO timePeriodDTO3 = new OASTimePeriodDTO();
        OASTimePeriodDTO timePeriodDTO4 = timePeriodDTO3;

        System.assert(timePeriodDTO1.equals(timePeriodDTO2));
        System.assert(timePeriodDTO2.equals(timePeriodDTO1));
        System.assert(timePeriodDTO1.equals(timePeriodDTO1));
        System.assert(timePeriodDTO3.equals(timePeriodDTO4));
        System.assert(timePeriodDTO4.equals(timePeriodDTO3));
        System.assert(timePeriodDTO3.equals(timePeriodDTO3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASTimePeriodDTO timePeriodDTO1 = OASTimePeriodDTO.getExample();
        OASTimePeriodDTO timePeriodDTO2 = OASTimePeriodDTO.getExample();
        OASTimePeriodDTO timePeriodDTO3 = new OASTimePeriodDTO();
        OASTimePeriodDTO timePeriodDTO4 = new OASTimePeriodDTO();

        System.assert(timePeriodDTO1.equals(timePeriodDTO2));
        System.assert(timePeriodDTO2.equals(timePeriodDTO1));
        System.assert(timePeriodDTO3.equals(timePeriodDTO4));
        System.assert(timePeriodDTO4.equals(timePeriodDTO3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASTimePeriodDTO timePeriodDTO1 = OASTimePeriodDTO.getExample();
        OASTimePeriodDTO timePeriodDTO2 = new OASTimePeriodDTO();

        System.assertEquals(false, timePeriodDTO1.equals('foo'));
        System.assertEquals(false, timePeriodDTO2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASTimePeriodDTO timePeriodDTO1 = OASTimePeriodDTO.getExample();
        OASTimePeriodDTO timePeriodDTO2 = new OASTimePeriodDTO();
        OASTimePeriodDTO timePeriodDTO3;

        System.assertEquals(false, timePeriodDTO1.equals(timePeriodDTO3));
        System.assertEquals(false, timePeriodDTO2.equals(timePeriodDTO3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASTimePeriodDTO timePeriodDTO1 = OASTimePeriodDTO.getExample();
        OASTimePeriodDTO timePeriodDTO2 = new OASTimePeriodDTO();

        System.assertEquals(timePeriodDTO1.hashCode(), timePeriodDTO1.hashCode());
        System.assertEquals(timePeriodDTO2.hashCode(), timePeriodDTO2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASTimePeriodDTO timePeriodDTO1 = OASTimePeriodDTO.getExample();
        OASTimePeriodDTO timePeriodDTO2 = OASTimePeriodDTO.getExample();
        OASTimePeriodDTO timePeriodDTO3 = new OASTimePeriodDTO();
        OASTimePeriodDTO timePeriodDTO4 = new OASTimePeriodDTO();

        System.assert(timePeriodDTO1.equals(timePeriodDTO2));
        System.assert(timePeriodDTO3.equals(timePeriodDTO4));
        System.assertEquals(timePeriodDTO1.hashCode(), timePeriodDTO2.hashCode());
        System.assertEquals(timePeriodDTO3.hashCode(), timePeriodDTO4.hashCode());
    }
}
