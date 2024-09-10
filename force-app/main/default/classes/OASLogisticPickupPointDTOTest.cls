@isTest
private class OASLogisticPickupPointDTOTest {
    @isTest
    private static void equalsSameInstance() {
        OASLogisticPickupPointDTO logisticPickupPointDTO1 = OASLogisticPickupPointDTO.getExample();
        OASLogisticPickupPointDTO logisticPickupPointDTO2 = logisticPickupPointDTO1;
        OASLogisticPickupPointDTO logisticPickupPointDTO3 = new OASLogisticPickupPointDTO();
        OASLogisticPickupPointDTO logisticPickupPointDTO4 = logisticPickupPointDTO3;

        System.assert(logisticPickupPointDTO1.equals(logisticPickupPointDTO2));
        System.assert(logisticPickupPointDTO2.equals(logisticPickupPointDTO1));
        System.assert(logisticPickupPointDTO1.equals(logisticPickupPointDTO1));
        System.assert(logisticPickupPointDTO3.equals(logisticPickupPointDTO4));
        System.assert(logisticPickupPointDTO4.equals(logisticPickupPointDTO3));
        System.assert(logisticPickupPointDTO3.equals(logisticPickupPointDTO3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASLogisticPickupPointDTO logisticPickupPointDTO1 = OASLogisticPickupPointDTO.getExample();
        OASLogisticPickupPointDTO logisticPickupPointDTO2 = OASLogisticPickupPointDTO.getExample();
        OASLogisticPickupPointDTO logisticPickupPointDTO3 = new OASLogisticPickupPointDTO();
        OASLogisticPickupPointDTO logisticPickupPointDTO4 = new OASLogisticPickupPointDTO();

        System.assert(logisticPickupPointDTO1.equals(logisticPickupPointDTO2));
        System.assert(logisticPickupPointDTO2.equals(logisticPickupPointDTO1));
        System.assert(logisticPickupPointDTO3.equals(logisticPickupPointDTO4));
        System.assert(logisticPickupPointDTO4.equals(logisticPickupPointDTO3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASLogisticPickupPointDTO logisticPickupPointDTO1 = OASLogisticPickupPointDTO.getExample();
        OASLogisticPickupPointDTO logisticPickupPointDTO2 = new OASLogisticPickupPointDTO();

        System.assertEquals(false, logisticPickupPointDTO1.equals('foo'));
        System.assertEquals(false, logisticPickupPointDTO2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASLogisticPickupPointDTO logisticPickupPointDTO1 = OASLogisticPickupPointDTO.getExample();
        OASLogisticPickupPointDTO logisticPickupPointDTO2 = new OASLogisticPickupPointDTO();
        OASLogisticPickupPointDTO logisticPickupPointDTO3;

        System.assertEquals(false, logisticPickupPointDTO1.equals(logisticPickupPointDTO3));
        System.assertEquals(false, logisticPickupPointDTO2.equals(logisticPickupPointDTO3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASLogisticPickupPointDTO logisticPickupPointDTO1 = OASLogisticPickupPointDTO.getExample();
        OASLogisticPickupPointDTO logisticPickupPointDTO2 = new OASLogisticPickupPointDTO();

        System.assertEquals(logisticPickupPointDTO1.hashCode(), logisticPickupPointDTO1.hashCode());
        System.assertEquals(logisticPickupPointDTO2.hashCode(), logisticPickupPointDTO2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASLogisticPickupPointDTO logisticPickupPointDTO1 = OASLogisticPickupPointDTO.getExample();
        OASLogisticPickupPointDTO logisticPickupPointDTO2 = OASLogisticPickupPointDTO.getExample();
        OASLogisticPickupPointDTO logisticPickupPointDTO3 = new OASLogisticPickupPointDTO();
        OASLogisticPickupPointDTO logisticPickupPointDTO4 = new OASLogisticPickupPointDTO();

        System.assert(logisticPickupPointDTO1.equals(logisticPickupPointDTO2));
        System.assert(logisticPickupPointDTO3.equals(logisticPickupPointDTO4));
        System.assertEquals(logisticPickupPointDTO1.hashCode(), logisticPickupPointDTO2.hashCode());
        System.assertEquals(logisticPickupPointDTO3.hashCode(), logisticPickupPointDTO4.hashCode());
    }
}
