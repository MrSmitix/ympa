@isTest
private class OASOrderCourierDTOTest {
    @isTest
    private static void equalsSameInstance() {
        OASOrderCourierDTO orderCourierDTO1 = OASOrderCourierDTO.getExample();
        OASOrderCourierDTO orderCourierDTO2 = orderCourierDTO1;
        OASOrderCourierDTO orderCourierDTO3 = new OASOrderCourierDTO();
        OASOrderCourierDTO orderCourierDTO4 = orderCourierDTO3;

        System.assert(orderCourierDTO1.equals(orderCourierDTO2));
        System.assert(orderCourierDTO2.equals(orderCourierDTO1));
        System.assert(orderCourierDTO1.equals(orderCourierDTO1));
        System.assert(orderCourierDTO3.equals(orderCourierDTO4));
        System.assert(orderCourierDTO4.equals(orderCourierDTO3));
        System.assert(orderCourierDTO3.equals(orderCourierDTO3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASOrderCourierDTO orderCourierDTO1 = OASOrderCourierDTO.getExample();
        OASOrderCourierDTO orderCourierDTO2 = OASOrderCourierDTO.getExample();
        OASOrderCourierDTO orderCourierDTO3 = new OASOrderCourierDTO();
        OASOrderCourierDTO orderCourierDTO4 = new OASOrderCourierDTO();

        System.assert(orderCourierDTO1.equals(orderCourierDTO2));
        System.assert(orderCourierDTO2.equals(orderCourierDTO1));
        System.assert(orderCourierDTO3.equals(orderCourierDTO4));
        System.assert(orderCourierDTO4.equals(orderCourierDTO3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASOrderCourierDTO orderCourierDTO1 = OASOrderCourierDTO.getExample();
        OASOrderCourierDTO orderCourierDTO2 = new OASOrderCourierDTO();

        System.assertEquals(false, orderCourierDTO1.equals('foo'));
        System.assertEquals(false, orderCourierDTO2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASOrderCourierDTO orderCourierDTO1 = OASOrderCourierDTO.getExample();
        OASOrderCourierDTO orderCourierDTO2 = new OASOrderCourierDTO();
        OASOrderCourierDTO orderCourierDTO3;

        System.assertEquals(false, orderCourierDTO1.equals(orderCourierDTO3));
        System.assertEquals(false, orderCourierDTO2.equals(orderCourierDTO3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASOrderCourierDTO orderCourierDTO1 = OASOrderCourierDTO.getExample();
        OASOrderCourierDTO orderCourierDTO2 = new OASOrderCourierDTO();

        System.assertEquals(orderCourierDTO1.hashCode(), orderCourierDTO1.hashCode());
        System.assertEquals(orderCourierDTO2.hashCode(), orderCourierDTO2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASOrderCourierDTO orderCourierDTO1 = OASOrderCourierDTO.getExample();
        OASOrderCourierDTO orderCourierDTO2 = OASOrderCourierDTO.getExample();
        OASOrderCourierDTO orderCourierDTO3 = new OASOrderCourierDTO();
        OASOrderCourierDTO orderCourierDTO4 = new OASOrderCourierDTO();

        System.assert(orderCourierDTO1.equals(orderCourierDTO2));
        System.assert(orderCourierDTO3.equals(orderCourierDTO4));
        System.assertEquals(orderCourierDTO1.hashCode(), orderCourierDTO2.hashCode());
        System.assertEquals(orderCourierDTO3.hashCode(), orderCourierDTO4.hashCode());
    }
}
