@isTest
private class OASOrderBoxLayoutDTOTest {
    @isTest
    private static void equalsSameInstance() {
        OASOrderBoxLayoutDTO orderBoxLayoutDTO1 = OASOrderBoxLayoutDTO.getExample();
        OASOrderBoxLayoutDTO orderBoxLayoutDTO2 = orderBoxLayoutDTO1;
        OASOrderBoxLayoutDTO orderBoxLayoutDTO3 = new OASOrderBoxLayoutDTO();
        OASOrderBoxLayoutDTO orderBoxLayoutDTO4 = orderBoxLayoutDTO3;

        System.assert(orderBoxLayoutDTO1.equals(orderBoxLayoutDTO2));
        System.assert(orderBoxLayoutDTO2.equals(orderBoxLayoutDTO1));
        System.assert(orderBoxLayoutDTO1.equals(orderBoxLayoutDTO1));
        System.assert(orderBoxLayoutDTO3.equals(orderBoxLayoutDTO4));
        System.assert(orderBoxLayoutDTO4.equals(orderBoxLayoutDTO3));
        System.assert(orderBoxLayoutDTO3.equals(orderBoxLayoutDTO3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASOrderBoxLayoutDTO orderBoxLayoutDTO1 = OASOrderBoxLayoutDTO.getExample();
        OASOrderBoxLayoutDTO orderBoxLayoutDTO2 = OASOrderBoxLayoutDTO.getExample();
        OASOrderBoxLayoutDTO orderBoxLayoutDTO3 = new OASOrderBoxLayoutDTO();
        OASOrderBoxLayoutDTO orderBoxLayoutDTO4 = new OASOrderBoxLayoutDTO();

        System.assert(orderBoxLayoutDTO1.equals(orderBoxLayoutDTO2));
        System.assert(orderBoxLayoutDTO2.equals(orderBoxLayoutDTO1));
        System.assert(orderBoxLayoutDTO3.equals(orderBoxLayoutDTO4));
        System.assert(orderBoxLayoutDTO4.equals(orderBoxLayoutDTO3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASOrderBoxLayoutDTO orderBoxLayoutDTO1 = OASOrderBoxLayoutDTO.getExample();
        OASOrderBoxLayoutDTO orderBoxLayoutDTO2 = new OASOrderBoxLayoutDTO();

        System.assertEquals(false, orderBoxLayoutDTO1.equals('foo'));
        System.assertEquals(false, orderBoxLayoutDTO2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASOrderBoxLayoutDTO orderBoxLayoutDTO1 = OASOrderBoxLayoutDTO.getExample();
        OASOrderBoxLayoutDTO orderBoxLayoutDTO2 = new OASOrderBoxLayoutDTO();
        OASOrderBoxLayoutDTO orderBoxLayoutDTO3;

        System.assertEquals(false, orderBoxLayoutDTO1.equals(orderBoxLayoutDTO3));
        System.assertEquals(false, orderBoxLayoutDTO2.equals(orderBoxLayoutDTO3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASOrderBoxLayoutDTO orderBoxLayoutDTO1 = OASOrderBoxLayoutDTO.getExample();
        OASOrderBoxLayoutDTO orderBoxLayoutDTO2 = new OASOrderBoxLayoutDTO();

        System.assertEquals(orderBoxLayoutDTO1.hashCode(), orderBoxLayoutDTO1.hashCode());
        System.assertEquals(orderBoxLayoutDTO2.hashCode(), orderBoxLayoutDTO2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASOrderBoxLayoutDTO orderBoxLayoutDTO1 = OASOrderBoxLayoutDTO.getExample();
        OASOrderBoxLayoutDTO orderBoxLayoutDTO2 = OASOrderBoxLayoutDTO.getExample();
        OASOrderBoxLayoutDTO orderBoxLayoutDTO3 = new OASOrderBoxLayoutDTO();
        OASOrderBoxLayoutDTO orderBoxLayoutDTO4 = new OASOrderBoxLayoutDTO();

        System.assert(orderBoxLayoutDTO1.equals(orderBoxLayoutDTO2));
        System.assert(orderBoxLayoutDTO3.equals(orderBoxLayoutDTO4));
        System.assertEquals(orderBoxLayoutDTO1.hashCode(), orderBoxLayoutDTO2.hashCode());
        System.assertEquals(orderBoxLayoutDTO3.hashCode(), orderBoxLayoutDTO4.hashCode());
    }

    @isTest
    private static void defaultValuesPopulated() {
        OASOrderBoxLayoutDTO orderBoxLayoutDTO = new OASOrderBoxLayoutDTO();
        System.assertEquals(new List<OASOrderBoxLayoutItemDTO>(), orderBoxLayoutDTO.items);
    }
}
