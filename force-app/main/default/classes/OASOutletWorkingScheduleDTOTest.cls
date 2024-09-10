@isTest
private class OASOutletWorkingScheduleDTOTest {
    @isTest
    private static void equalsSameInstance() {
        OASOutletWorkingScheduleDTO outletWorkingScheduleDTO1 = OASOutletWorkingScheduleDTO.getExample();
        OASOutletWorkingScheduleDTO outletWorkingScheduleDTO2 = outletWorkingScheduleDTO1;
        OASOutletWorkingScheduleDTO outletWorkingScheduleDTO3 = new OASOutletWorkingScheduleDTO();
        OASOutletWorkingScheduleDTO outletWorkingScheduleDTO4 = outletWorkingScheduleDTO3;

        System.assert(outletWorkingScheduleDTO1.equals(outletWorkingScheduleDTO2));
        System.assert(outletWorkingScheduleDTO2.equals(outletWorkingScheduleDTO1));
        System.assert(outletWorkingScheduleDTO1.equals(outletWorkingScheduleDTO1));
        System.assert(outletWorkingScheduleDTO3.equals(outletWorkingScheduleDTO4));
        System.assert(outletWorkingScheduleDTO4.equals(outletWorkingScheduleDTO3));
        System.assert(outletWorkingScheduleDTO3.equals(outletWorkingScheduleDTO3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASOutletWorkingScheduleDTO outletWorkingScheduleDTO1 = OASOutletWorkingScheduleDTO.getExample();
        OASOutletWorkingScheduleDTO outletWorkingScheduleDTO2 = OASOutletWorkingScheduleDTO.getExample();
        OASOutletWorkingScheduleDTO outletWorkingScheduleDTO3 = new OASOutletWorkingScheduleDTO();
        OASOutletWorkingScheduleDTO outletWorkingScheduleDTO4 = new OASOutletWorkingScheduleDTO();

        System.assert(outletWorkingScheduleDTO1.equals(outletWorkingScheduleDTO2));
        System.assert(outletWorkingScheduleDTO2.equals(outletWorkingScheduleDTO1));
        System.assert(outletWorkingScheduleDTO3.equals(outletWorkingScheduleDTO4));
        System.assert(outletWorkingScheduleDTO4.equals(outletWorkingScheduleDTO3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASOutletWorkingScheduleDTO outletWorkingScheduleDTO1 = OASOutletWorkingScheduleDTO.getExample();
        OASOutletWorkingScheduleDTO outletWorkingScheduleDTO2 = new OASOutletWorkingScheduleDTO();

        System.assertEquals(false, outletWorkingScheduleDTO1.equals('foo'));
        System.assertEquals(false, outletWorkingScheduleDTO2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASOutletWorkingScheduleDTO outletWorkingScheduleDTO1 = OASOutletWorkingScheduleDTO.getExample();
        OASOutletWorkingScheduleDTO outletWorkingScheduleDTO2 = new OASOutletWorkingScheduleDTO();
        OASOutletWorkingScheduleDTO outletWorkingScheduleDTO3;

        System.assertEquals(false, outletWorkingScheduleDTO1.equals(outletWorkingScheduleDTO3));
        System.assertEquals(false, outletWorkingScheduleDTO2.equals(outletWorkingScheduleDTO3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASOutletWorkingScheduleDTO outletWorkingScheduleDTO1 = OASOutletWorkingScheduleDTO.getExample();
        OASOutletWorkingScheduleDTO outletWorkingScheduleDTO2 = new OASOutletWorkingScheduleDTO();

        System.assertEquals(outletWorkingScheduleDTO1.hashCode(), outletWorkingScheduleDTO1.hashCode());
        System.assertEquals(outletWorkingScheduleDTO2.hashCode(), outletWorkingScheduleDTO2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASOutletWorkingScheduleDTO outletWorkingScheduleDTO1 = OASOutletWorkingScheduleDTO.getExample();
        OASOutletWorkingScheduleDTO outletWorkingScheduleDTO2 = OASOutletWorkingScheduleDTO.getExample();
        OASOutletWorkingScheduleDTO outletWorkingScheduleDTO3 = new OASOutletWorkingScheduleDTO();
        OASOutletWorkingScheduleDTO outletWorkingScheduleDTO4 = new OASOutletWorkingScheduleDTO();

        System.assert(outletWorkingScheduleDTO1.equals(outletWorkingScheduleDTO2));
        System.assert(outletWorkingScheduleDTO3.equals(outletWorkingScheduleDTO4));
        System.assertEquals(outletWorkingScheduleDTO1.hashCode(), outletWorkingScheduleDTO2.hashCode());
        System.assertEquals(outletWorkingScheduleDTO3.hashCode(), outletWorkingScheduleDTO4.hashCode());
    }

    @isTest
    private static void defaultValuesPopulated() {
        OASOutletWorkingScheduleDTO outletWorkingScheduleDTO = new OASOutletWorkingScheduleDTO();
        System.assertEquals(new List<OASOutletWorkingScheduleItemDTO>(), outletWorkingScheduleDTO.scheduleItems);
        System.assertEquals(null, outletWorkingScheduleDTO.workInHoliday);
    }
}
