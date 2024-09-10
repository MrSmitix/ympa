@isTest
private class OASUpdateTimeDTOTest {
    @isTest
    private static void equalsSameInstance() {
        OASUpdateTimeDTO updateTimeDTO1 = OASUpdateTimeDTO.getExample();
        OASUpdateTimeDTO updateTimeDTO2 = updateTimeDTO1;
        OASUpdateTimeDTO updateTimeDTO3 = new OASUpdateTimeDTO();
        OASUpdateTimeDTO updateTimeDTO4 = updateTimeDTO3;

        System.assert(updateTimeDTO1.equals(updateTimeDTO2));
        System.assert(updateTimeDTO2.equals(updateTimeDTO1));
        System.assert(updateTimeDTO1.equals(updateTimeDTO1));
        System.assert(updateTimeDTO3.equals(updateTimeDTO4));
        System.assert(updateTimeDTO4.equals(updateTimeDTO3));
        System.assert(updateTimeDTO3.equals(updateTimeDTO3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASUpdateTimeDTO updateTimeDTO1 = OASUpdateTimeDTO.getExample();
        OASUpdateTimeDTO updateTimeDTO2 = OASUpdateTimeDTO.getExample();
        OASUpdateTimeDTO updateTimeDTO3 = new OASUpdateTimeDTO();
        OASUpdateTimeDTO updateTimeDTO4 = new OASUpdateTimeDTO();

        System.assert(updateTimeDTO1.equals(updateTimeDTO2));
        System.assert(updateTimeDTO2.equals(updateTimeDTO1));
        System.assert(updateTimeDTO3.equals(updateTimeDTO4));
        System.assert(updateTimeDTO4.equals(updateTimeDTO3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASUpdateTimeDTO updateTimeDTO1 = OASUpdateTimeDTO.getExample();
        OASUpdateTimeDTO updateTimeDTO2 = new OASUpdateTimeDTO();

        System.assertEquals(false, updateTimeDTO1.equals('foo'));
        System.assertEquals(false, updateTimeDTO2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASUpdateTimeDTO updateTimeDTO1 = OASUpdateTimeDTO.getExample();
        OASUpdateTimeDTO updateTimeDTO2 = new OASUpdateTimeDTO();
        OASUpdateTimeDTO updateTimeDTO3;

        System.assertEquals(false, updateTimeDTO1.equals(updateTimeDTO3));
        System.assertEquals(false, updateTimeDTO2.equals(updateTimeDTO3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASUpdateTimeDTO updateTimeDTO1 = OASUpdateTimeDTO.getExample();
        OASUpdateTimeDTO updateTimeDTO2 = new OASUpdateTimeDTO();

        System.assertEquals(updateTimeDTO1.hashCode(), updateTimeDTO1.hashCode());
        System.assertEquals(updateTimeDTO2.hashCode(), updateTimeDTO2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASUpdateTimeDTO updateTimeDTO1 = OASUpdateTimeDTO.getExample();
        OASUpdateTimeDTO updateTimeDTO2 = OASUpdateTimeDTO.getExample();
        OASUpdateTimeDTO updateTimeDTO3 = new OASUpdateTimeDTO();
        OASUpdateTimeDTO updateTimeDTO4 = new OASUpdateTimeDTO();

        System.assert(updateTimeDTO1.equals(updateTimeDTO2));
        System.assert(updateTimeDTO3.equals(updateTimeDTO4));
        System.assertEquals(updateTimeDTO1.hashCode(), updateTimeDTO2.hashCode());
        System.assertEquals(updateTimeDTO3.hashCode(), updateTimeDTO4.hashCode());
    }
}
