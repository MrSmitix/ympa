@isTest
private class OASGpsDTOTest {
    @isTest
    private static void equalsSameInstance() {
        OASGpsDTO gpsDTO1 = OASGpsDTO.getExample();
        OASGpsDTO gpsDTO2 = gpsDTO1;
        OASGpsDTO gpsDTO3 = new OASGpsDTO();
        OASGpsDTO gpsDTO4 = gpsDTO3;

        System.assert(gpsDTO1.equals(gpsDTO2));
        System.assert(gpsDTO2.equals(gpsDTO1));
        System.assert(gpsDTO1.equals(gpsDTO1));
        System.assert(gpsDTO3.equals(gpsDTO4));
        System.assert(gpsDTO4.equals(gpsDTO3));
        System.assert(gpsDTO3.equals(gpsDTO3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASGpsDTO gpsDTO1 = OASGpsDTO.getExample();
        OASGpsDTO gpsDTO2 = OASGpsDTO.getExample();
        OASGpsDTO gpsDTO3 = new OASGpsDTO();
        OASGpsDTO gpsDTO4 = new OASGpsDTO();

        System.assert(gpsDTO1.equals(gpsDTO2));
        System.assert(gpsDTO2.equals(gpsDTO1));
        System.assert(gpsDTO3.equals(gpsDTO4));
        System.assert(gpsDTO4.equals(gpsDTO3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASGpsDTO gpsDTO1 = OASGpsDTO.getExample();
        OASGpsDTO gpsDTO2 = new OASGpsDTO();

        System.assertEquals(false, gpsDTO1.equals('foo'));
        System.assertEquals(false, gpsDTO2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASGpsDTO gpsDTO1 = OASGpsDTO.getExample();
        OASGpsDTO gpsDTO2 = new OASGpsDTO();
        OASGpsDTO gpsDTO3;

        System.assertEquals(false, gpsDTO1.equals(gpsDTO3));
        System.assertEquals(false, gpsDTO2.equals(gpsDTO3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASGpsDTO gpsDTO1 = OASGpsDTO.getExample();
        OASGpsDTO gpsDTO2 = new OASGpsDTO();

        System.assertEquals(gpsDTO1.hashCode(), gpsDTO1.hashCode());
        System.assertEquals(gpsDTO2.hashCode(), gpsDTO2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASGpsDTO gpsDTO1 = OASGpsDTO.getExample();
        OASGpsDTO gpsDTO2 = OASGpsDTO.getExample();
        OASGpsDTO gpsDTO3 = new OASGpsDTO();
        OASGpsDTO gpsDTO4 = new OASGpsDTO();

        System.assert(gpsDTO1.equals(gpsDTO2));
        System.assert(gpsDTO3.equals(gpsDTO4));
        System.assertEquals(gpsDTO1.hashCode(), gpsDTO2.hashCode());
        System.assertEquals(gpsDTO3.hashCode(), gpsDTO4.hashCode());
    }
}
