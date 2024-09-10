@isTest
private class OASTrackDTOTest {
    @isTest
    private static void equalsSameInstance() {
        OASTrackDTO trackDTO1 = OASTrackDTO.getExample();
        OASTrackDTO trackDTO2 = trackDTO1;
        OASTrackDTO trackDTO3 = new OASTrackDTO();
        OASTrackDTO trackDTO4 = trackDTO3;

        System.assert(trackDTO1.equals(trackDTO2));
        System.assert(trackDTO2.equals(trackDTO1));
        System.assert(trackDTO1.equals(trackDTO1));
        System.assert(trackDTO3.equals(trackDTO4));
        System.assert(trackDTO4.equals(trackDTO3));
        System.assert(trackDTO3.equals(trackDTO3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASTrackDTO trackDTO1 = OASTrackDTO.getExample();
        OASTrackDTO trackDTO2 = OASTrackDTO.getExample();
        OASTrackDTO trackDTO3 = new OASTrackDTO();
        OASTrackDTO trackDTO4 = new OASTrackDTO();

        System.assert(trackDTO1.equals(trackDTO2));
        System.assert(trackDTO2.equals(trackDTO1));
        System.assert(trackDTO3.equals(trackDTO4));
        System.assert(trackDTO4.equals(trackDTO3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASTrackDTO trackDTO1 = OASTrackDTO.getExample();
        OASTrackDTO trackDTO2 = new OASTrackDTO();

        System.assertEquals(false, trackDTO1.equals('foo'));
        System.assertEquals(false, trackDTO2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASTrackDTO trackDTO1 = OASTrackDTO.getExample();
        OASTrackDTO trackDTO2 = new OASTrackDTO();
        OASTrackDTO trackDTO3;

        System.assertEquals(false, trackDTO1.equals(trackDTO3));
        System.assertEquals(false, trackDTO2.equals(trackDTO3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASTrackDTO trackDTO1 = OASTrackDTO.getExample();
        OASTrackDTO trackDTO2 = new OASTrackDTO();

        System.assertEquals(trackDTO1.hashCode(), trackDTO1.hashCode());
        System.assertEquals(trackDTO2.hashCode(), trackDTO2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASTrackDTO trackDTO1 = OASTrackDTO.getExample();
        OASTrackDTO trackDTO2 = OASTrackDTO.getExample();
        OASTrackDTO trackDTO3 = new OASTrackDTO();
        OASTrackDTO trackDTO4 = new OASTrackDTO();

        System.assert(trackDTO1.equals(trackDTO2));
        System.assert(trackDTO3.equals(trackDTO4));
        System.assertEquals(trackDTO1.hashCode(), trackDTO2.hashCode());
        System.assertEquals(trackDTO3.hashCode(), trackDTO4.hashCode());
    }
}
