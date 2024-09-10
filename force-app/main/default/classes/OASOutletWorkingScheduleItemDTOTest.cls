@isTest
private class OASOutletWorkingScheduleItemDTOTest {
    @isTest
    private static void equalsSameInstance() {
        OASOutletWorkingScheduleItemDTO outletWorkingScheduleItemDTO1 = OASOutletWorkingScheduleItemDTO.getExample();
        OASOutletWorkingScheduleItemDTO outletWorkingScheduleItemDTO2 = outletWorkingScheduleItemDTO1;
        OASOutletWorkingScheduleItemDTO outletWorkingScheduleItemDTO3 = new OASOutletWorkingScheduleItemDTO();
        OASOutletWorkingScheduleItemDTO outletWorkingScheduleItemDTO4 = outletWorkingScheduleItemDTO3;

        System.assert(outletWorkingScheduleItemDTO1.equals(outletWorkingScheduleItemDTO2));
        System.assert(outletWorkingScheduleItemDTO2.equals(outletWorkingScheduleItemDTO1));
        System.assert(outletWorkingScheduleItemDTO1.equals(outletWorkingScheduleItemDTO1));
        System.assert(outletWorkingScheduleItemDTO3.equals(outletWorkingScheduleItemDTO4));
        System.assert(outletWorkingScheduleItemDTO4.equals(outletWorkingScheduleItemDTO3));
        System.assert(outletWorkingScheduleItemDTO3.equals(outletWorkingScheduleItemDTO3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASOutletWorkingScheduleItemDTO outletWorkingScheduleItemDTO1 = OASOutletWorkingScheduleItemDTO.getExample();
        OASOutletWorkingScheduleItemDTO outletWorkingScheduleItemDTO2 = OASOutletWorkingScheduleItemDTO.getExample();
        OASOutletWorkingScheduleItemDTO outletWorkingScheduleItemDTO3 = new OASOutletWorkingScheduleItemDTO();
        OASOutletWorkingScheduleItemDTO outletWorkingScheduleItemDTO4 = new OASOutletWorkingScheduleItemDTO();

        System.assert(outletWorkingScheduleItemDTO1.equals(outletWorkingScheduleItemDTO2));
        System.assert(outletWorkingScheduleItemDTO2.equals(outletWorkingScheduleItemDTO1));
        System.assert(outletWorkingScheduleItemDTO3.equals(outletWorkingScheduleItemDTO4));
        System.assert(outletWorkingScheduleItemDTO4.equals(outletWorkingScheduleItemDTO3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASOutletWorkingScheduleItemDTO outletWorkingScheduleItemDTO1 = OASOutletWorkingScheduleItemDTO.getExample();
        OASOutletWorkingScheduleItemDTO outletWorkingScheduleItemDTO2 = new OASOutletWorkingScheduleItemDTO();

        System.assertEquals(false, outletWorkingScheduleItemDTO1.equals('foo'));
        System.assertEquals(false, outletWorkingScheduleItemDTO2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASOutletWorkingScheduleItemDTO outletWorkingScheduleItemDTO1 = OASOutletWorkingScheduleItemDTO.getExample();
        OASOutletWorkingScheduleItemDTO outletWorkingScheduleItemDTO2 = new OASOutletWorkingScheduleItemDTO();
        OASOutletWorkingScheduleItemDTO outletWorkingScheduleItemDTO3;

        System.assertEquals(false, outletWorkingScheduleItemDTO1.equals(outletWorkingScheduleItemDTO3));
        System.assertEquals(false, outletWorkingScheduleItemDTO2.equals(outletWorkingScheduleItemDTO3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASOutletWorkingScheduleItemDTO outletWorkingScheduleItemDTO1 = OASOutletWorkingScheduleItemDTO.getExample();
        OASOutletWorkingScheduleItemDTO outletWorkingScheduleItemDTO2 = new OASOutletWorkingScheduleItemDTO();

        System.assertEquals(outletWorkingScheduleItemDTO1.hashCode(), outletWorkingScheduleItemDTO1.hashCode());
        System.assertEquals(outletWorkingScheduleItemDTO2.hashCode(), outletWorkingScheduleItemDTO2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASOutletWorkingScheduleItemDTO outletWorkingScheduleItemDTO1 = OASOutletWorkingScheduleItemDTO.getExample();
        OASOutletWorkingScheduleItemDTO outletWorkingScheduleItemDTO2 = OASOutletWorkingScheduleItemDTO.getExample();
        OASOutletWorkingScheduleItemDTO outletWorkingScheduleItemDTO3 = new OASOutletWorkingScheduleItemDTO();
        OASOutletWorkingScheduleItemDTO outletWorkingScheduleItemDTO4 = new OASOutletWorkingScheduleItemDTO();

        System.assert(outletWorkingScheduleItemDTO1.equals(outletWorkingScheduleItemDTO2));
        System.assert(outletWorkingScheduleItemDTO3.equals(outletWorkingScheduleItemDTO4));
        System.assertEquals(outletWorkingScheduleItemDTO1.hashCode(), outletWorkingScheduleItemDTO2.hashCode());
        System.assertEquals(outletWorkingScheduleItemDTO3.hashCode(), outletWorkingScheduleItemDTO4.hashCode());
    }
}
