@isTest
private class OASOrderItemSubsidyDTOTest {
    @isTest
    private static void equalsSameInstance() {
        OASOrderItemSubsidyDTO orderItemSubsidyDTO1 = OASOrderItemSubsidyDTO.getExample();
        OASOrderItemSubsidyDTO orderItemSubsidyDTO2 = orderItemSubsidyDTO1;
        OASOrderItemSubsidyDTO orderItemSubsidyDTO3 = new OASOrderItemSubsidyDTO();
        OASOrderItemSubsidyDTO orderItemSubsidyDTO4 = orderItemSubsidyDTO3;

        System.assert(orderItemSubsidyDTO1.equals(orderItemSubsidyDTO2));
        System.assert(orderItemSubsidyDTO2.equals(orderItemSubsidyDTO1));
        System.assert(orderItemSubsidyDTO1.equals(orderItemSubsidyDTO1));
        System.assert(orderItemSubsidyDTO3.equals(orderItemSubsidyDTO4));
        System.assert(orderItemSubsidyDTO4.equals(orderItemSubsidyDTO3));
        System.assert(orderItemSubsidyDTO3.equals(orderItemSubsidyDTO3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASOrderItemSubsidyDTO orderItemSubsidyDTO1 = OASOrderItemSubsidyDTO.getExample();
        OASOrderItemSubsidyDTO orderItemSubsidyDTO2 = OASOrderItemSubsidyDTO.getExample();
        OASOrderItemSubsidyDTO orderItemSubsidyDTO3 = new OASOrderItemSubsidyDTO();
        OASOrderItemSubsidyDTO orderItemSubsidyDTO4 = new OASOrderItemSubsidyDTO();

        System.assert(orderItemSubsidyDTO1.equals(orderItemSubsidyDTO2));
        System.assert(orderItemSubsidyDTO2.equals(orderItemSubsidyDTO1));
        System.assert(orderItemSubsidyDTO3.equals(orderItemSubsidyDTO4));
        System.assert(orderItemSubsidyDTO4.equals(orderItemSubsidyDTO3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASOrderItemSubsidyDTO orderItemSubsidyDTO1 = OASOrderItemSubsidyDTO.getExample();
        OASOrderItemSubsidyDTO orderItemSubsidyDTO2 = new OASOrderItemSubsidyDTO();

        System.assertEquals(false, orderItemSubsidyDTO1.equals('foo'));
        System.assertEquals(false, orderItemSubsidyDTO2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASOrderItemSubsidyDTO orderItemSubsidyDTO1 = OASOrderItemSubsidyDTO.getExample();
        OASOrderItemSubsidyDTO orderItemSubsidyDTO2 = new OASOrderItemSubsidyDTO();
        OASOrderItemSubsidyDTO orderItemSubsidyDTO3;

        System.assertEquals(false, orderItemSubsidyDTO1.equals(orderItemSubsidyDTO3));
        System.assertEquals(false, orderItemSubsidyDTO2.equals(orderItemSubsidyDTO3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASOrderItemSubsidyDTO orderItemSubsidyDTO1 = OASOrderItemSubsidyDTO.getExample();
        OASOrderItemSubsidyDTO orderItemSubsidyDTO2 = new OASOrderItemSubsidyDTO();

        System.assertEquals(orderItemSubsidyDTO1.hashCode(), orderItemSubsidyDTO1.hashCode());
        System.assertEquals(orderItemSubsidyDTO2.hashCode(), orderItemSubsidyDTO2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASOrderItemSubsidyDTO orderItemSubsidyDTO1 = OASOrderItemSubsidyDTO.getExample();
        OASOrderItemSubsidyDTO orderItemSubsidyDTO2 = OASOrderItemSubsidyDTO.getExample();
        OASOrderItemSubsidyDTO orderItemSubsidyDTO3 = new OASOrderItemSubsidyDTO();
        OASOrderItemSubsidyDTO orderItemSubsidyDTO4 = new OASOrderItemSubsidyDTO();

        System.assert(orderItemSubsidyDTO1.equals(orderItemSubsidyDTO2));
        System.assert(orderItemSubsidyDTO3.equals(orderItemSubsidyDTO4));
        System.assertEquals(orderItemSubsidyDTO1.hashCode(), orderItemSubsidyDTO2.hashCode());
        System.assertEquals(orderItemSubsidyDTO3.hashCode(), orderItemSubsidyDTO4.hashCode());
    }
}
