@isTest
private class OASOrderTrackDTOTest {
    @isTest
    private static void equalsSameInstance() {
        OASOrderTrackDTO orderTrackDTO1 = OASOrderTrackDTO.getExample();
        OASOrderTrackDTO orderTrackDTO2 = orderTrackDTO1;
        OASOrderTrackDTO orderTrackDTO3 = new OASOrderTrackDTO();
        OASOrderTrackDTO orderTrackDTO4 = orderTrackDTO3;

        System.assert(orderTrackDTO1.equals(orderTrackDTO2));
        System.assert(orderTrackDTO2.equals(orderTrackDTO1));
        System.assert(orderTrackDTO1.equals(orderTrackDTO1));
        System.assert(orderTrackDTO3.equals(orderTrackDTO4));
        System.assert(orderTrackDTO4.equals(orderTrackDTO3));
        System.assert(orderTrackDTO3.equals(orderTrackDTO3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASOrderTrackDTO orderTrackDTO1 = OASOrderTrackDTO.getExample();
        OASOrderTrackDTO orderTrackDTO2 = OASOrderTrackDTO.getExample();
        OASOrderTrackDTO orderTrackDTO3 = new OASOrderTrackDTO();
        OASOrderTrackDTO orderTrackDTO4 = new OASOrderTrackDTO();

        System.assert(orderTrackDTO1.equals(orderTrackDTO2));
        System.assert(orderTrackDTO2.equals(orderTrackDTO1));
        System.assert(orderTrackDTO3.equals(orderTrackDTO4));
        System.assert(orderTrackDTO4.equals(orderTrackDTO3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASOrderTrackDTO orderTrackDTO1 = OASOrderTrackDTO.getExample();
        OASOrderTrackDTO orderTrackDTO2 = new OASOrderTrackDTO();

        System.assertEquals(false, orderTrackDTO1.equals('foo'));
        System.assertEquals(false, orderTrackDTO2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASOrderTrackDTO orderTrackDTO1 = OASOrderTrackDTO.getExample();
        OASOrderTrackDTO orderTrackDTO2 = new OASOrderTrackDTO();
        OASOrderTrackDTO orderTrackDTO3;

        System.assertEquals(false, orderTrackDTO1.equals(orderTrackDTO3));
        System.assertEquals(false, orderTrackDTO2.equals(orderTrackDTO3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASOrderTrackDTO orderTrackDTO1 = OASOrderTrackDTO.getExample();
        OASOrderTrackDTO orderTrackDTO2 = new OASOrderTrackDTO();

        System.assertEquals(orderTrackDTO1.hashCode(), orderTrackDTO1.hashCode());
        System.assertEquals(orderTrackDTO2.hashCode(), orderTrackDTO2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASOrderTrackDTO orderTrackDTO1 = OASOrderTrackDTO.getExample();
        OASOrderTrackDTO orderTrackDTO2 = OASOrderTrackDTO.getExample();
        OASOrderTrackDTO orderTrackDTO3 = new OASOrderTrackDTO();
        OASOrderTrackDTO orderTrackDTO4 = new OASOrderTrackDTO();

        System.assert(orderTrackDTO1.equals(orderTrackDTO2));
        System.assert(orderTrackDTO3.equals(orderTrackDTO4));
        System.assertEquals(orderTrackDTO1.hashCode(), orderTrackDTO2.hashCode());
        System.assertEquals(orderTrackDTO3.hashCode(), orderTrackDTO4.hashCode());
    }
}
