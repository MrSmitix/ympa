@isTest
private class OASOrderBoxLayoutItemDTOTest {
    @isTest
    private static void equalsSameInstance() {
        OASOrderBoxLayoutItemDTO orderBoxLayoutItemDTO1 = OASOrderBoxLayoutItemDTO.getExample();
        OASOrderBoxLayoutItemDTO orderBoxLayoutItemDTO2 = orderBoxLayoutItemDTO1;
        OASOrderBoxLayoutItemDTO orderBoxLayoutItemDTO3 = new OASOrderBoxLayoutItemDTO();
        OASOrderBoxLayoutItemDTO orderBoxLayoutItemDTO4 = orderBoxLayoutItemDTO3;

        System.assert(orderBoxLayoutItemDTO1.equals(orderBoxLayoutItemDTO2));
        System.assert(orderBoxLayoutItemDTO2.equals(orderBoxLayoutItemDTO1));
        System.assert(orderBoxLayoutItemDTO1.equals(orderBoxLayoutItemDTO1));
        System.assert(orderBoxLayoutItemDTO3.equals(orderBoxLayoutItemDTO4));
        System.assert(orderBoxLayoutItemDTO4.equals(orderBoxLayoutItemDTO3));
        System.assert(orderBoxLayoutItemDTO3.equals(orderBoxLayoutItemDTO3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASOrderBoxLayoutItemDTO orderBoxLayoutItemDTO1 = OASOrderBoxLayoutItemDTO.getExample();
        OASOrderBoxLayoutItemDTO orderBoxLayoutItemDTO2 = OASOrderBoxLayoutItemDTO.getExample();
        OASOrderBoxLayoutItemDTO orderBoxLayoutItemDTO3 = new OASOrderBoxLayoutItemDTO();
        OASOrderBoxLayoutItemDTO orderBoxLayoutItemDTO4 = new OASOrderBoxLayoutItemDTO();

        System.assert(orderBoxLayoutItemDTO1.equals(orderBoxLayoutItemDTO2));
        System.assert(orderBoxLayoutItemDTO2.equals(orderBoxLayoutItemDTO1));
        System.assert(orderBoxLayoutItemDTO3.equals(orderBoxLayoutItemDTO4));
        System.assert(orderBoxLayoutItemDTO4.equals(orderBoxLayoutItemDTO3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASOrderBoxLayoutItemDTO orderBoxLayoutItemDTO1 = OASOrderBoxLayoutItemDTO.getExample();
        OASOrderBoxLayoutItemDTO orderBoxLayoutItemDTO2 = new OASOrderBoxLayoutItemDTO();

        System.assertEquals(false, orderBoxLayoutItemDTO1.equals('foo'));
        System.assertEquals(false, orderBoxLayoutItemDTO2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASOrderBoxLayoutItemDTO orderBoxLayoutItemDTO1 = OASOrderBoxLayoutItemDTO.getExample();
        OASOrderBoxLayoutItemDTO orderBoxLayoutItemDTO2 = new OASOrderBoxLayoutItemDTO();
        OASOrderBoxLayoutItemDTO orderBoxLayoutItemDTO3;

        System.assertEquals(false, orderBoxLayoutItemDTO1.equals(orderBoxLayoutItemDTO3));
        System.assertEquals(false, orderBoxLayoutItemDTO2.equals(orderBoxLayoutItemDTO3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASOrderBoxLayoutItemDTO orderBoxLayoutItemDTO1 = OASOrderBoxLayoutItemDTO.getExample();
        OASOrderBoxLayoutItemDTO orderBoxLayoutItemDTO2 = new OASOrderBoxLayoutItemDTO();

        System.assertEquals(orderBoxLayoutItemDTO1.hashCode(), orderBoxLayoutItemDTO1.hashCode());
        System.assertEquals(orderBoxLayoutItemDTO2.hashCode(), orderBoxLayoutItemDTO2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASOrderBoxLayoutItemDTO orderBoxLayoutItemDTO1 = OASOrderBoxLayoutItemDTO.getExample();
        OASOrderBoxLayoutItemDTO orderBoxLayoutItemDTO2 = OASOrderBoxLayoutItemDTO.getExample();
        OASOrderBoxLayoutItemDTO orderBoxLayoutItemDTO3 = new OASOrderBoxLayoutItemDTO();
        OASOrderBoxLayoutItemDTO orderBoxLayoutItemDTO4 = new OASOrderBoxLayoutItemDTO();

        System.assert(orderBoxLayoutItemDTO1.equals(orderBoxLayoutItemDTO2));
        System.assert(orderBoxLayoutItemDTO3.equals(orderBoxLayoutItemDTO4));
        System.assertEquals(orderBoxLayoutItemDTO1.hashCode(), orderBoxLayoutItemDTO2.hashCode());
        System.assertEquals(orderBoxLayoutItemDTO3.hashCode(), orderBoxLayoutItemDTO4.hashCode());
    }

    @isTest
    private static void defaultValuesPopulated() {
        OASOrderBoxLayoutItemDTO orderBoxLayoutItemDTO = new OASOrderBoxLayoutItemDTO();
        System.assertEquals(new List<OASBriefOrderItemInstanceDTO>(), orderBoxLayoutItemDTO.instances);
        System.assertEquals(null, orderBoxLayoutItemDTO.id);
        System.assertEquals(null, orderBoxLayoutItemDTO.fullCount);
        System.assertEquals(null, orderBoxLayoutItemDTO.partialCount);
    }
}
