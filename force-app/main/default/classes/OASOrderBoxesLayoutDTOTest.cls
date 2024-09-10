@isTest
private class OASOrderBoxesLayoutDTOTest {
    @isTest
    private static void equalsSameInstance() {
        OASOrderBoxesLayoutDTO orderBoxesLayoutDTO1 = OASOrderBoxesLayoutDTO.getExample();
        OASOrderBoxesLayoutDTO orderBoxesLayoutDTO2 = orderBoxesLayoutDTO1;
        OASOrderBoxesLayoutDTO orderBoxesLayoutDTO3 = new OASOrderBoxesLayoutDTO();
        OASOrderBoxesLayoutDTO orderBoxesLayoutDTO4 = orderBoxesLayoutDTO3;

        System.assert(orderBoxesLayoutDTO1.equals(orderBoxesLayoutDTO2));
        System.assert(orderBoxesLayoutDTO2.equals(orderBoxesLayoutDTO1));
        System.assert(orderBoxesLayoutDTO1.equals(orderBoxesLayoutDTO1));
        System.assert(orderBoxesLayoutDTO3.equals(orderBoxesLayoutDTO4));
        System.assert(orderBoxesLayoutDTO4.equals(orderBoxesLayoutDTO3));
        System.assert(orderBoxesLayoutDTO3.equals(orderBoxesLayoutDTO3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASOrderBoxesLayoutDTO orderBoxesLayoutDTO1 = OASOrderBoxesLayoutDTO.getExample();
        OASOrderBoxesLayoutDTO orderBoxesLayoutDTO2 = OASOrderBoxesLayoutDTO.getExample();
        OASOrderBoxesLayoutDTO orderBoxesLayoutDTO3 = new OASOrderBoxesLayoutDTO();
        OASOrderBoxesLayoutDTO orderBoxesLayoutDTO4 = new OASOrderBoxesLayoutDTO();

        System.assert(orderBoxesLayoutDTO1.equals(orderBoxesLayoutDTO2));
        System.assert(orderBoxesLayoutDTO2.equals(orderBoxesLayoutDTO1));
        System.assert(orderBoxesLayoutDTO3.equals(orderBoxesLayoutDTO4));
        System.assert(orderBoxesLayoutDTO4.equals(orderBoxesLayoutDTO3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASOrderBoxesLayoutDTO orderBoxesLayoutDTO1 = OASOrderBoxesLayoutDTO.getExample();
        OASOrderBoxesLayoutDTO orderBoxesLayoutDTO2 = new OASOrderBoxesLayoutDTO();

        System.assertEquals(false, orderBoxesLayoutDTO1.equals('foo'));
        System.assertEquals(false, orderBoxesLayoutDTO2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASOrderBoxesLayoutDTO orderBoxesLayoutDTO1 = OASOrderBoxesLayoutDTO.getExample();
        OASOrderBoxesLayoutDTO orderBoxesLayoutDTO2 = new OASOrderBoxesLayoutDTO();
        OASOrderBoxesLayoutDTO orderBoxesLayoutDTO3;

        System.assertEquals(false, orderBoxesLayoutDTO1.equals(orderBoxesLayoutDTO3));
        System.assertEquals(false, orderBoxesLayoutDTO2.equals(orderBoxesLayoutDTO3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASOrderBoxesLayoutDTO orderBoxesLayoutDTO1 = OASOrderBoxesLayoutDTO.getExample();
        OASOrderBoxesLayoutDTO orderBoxesLayoutDTO2 = new OASOrderBoxesLayoutDTO();

        System.assertEquals(orderBoxesLayoutDTO1.hashCode(), orderBoxesLayoutDTO1.hashCode());
        System.assertEquals(orderBoxesLayoutDTO2.hashCode(), orderBoxesLayoutDTO2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASOrderBoxesLayoutDTO orderBoxesLayoutDTO1 = OASOrderBoxesLayoutDTO.getExample();
        OASOrderBoxesLayoutDTO orderBoxesLayoutDTO2 = OASOrderBoxesLayoutDTO.getExample();
        OASOrderBoxesLayoutDTO orderBoxesLayoutDTO3 = new OASOrderBoxesLayoutDTO();
        OASOrderBoxesLayoutDTO orderBoxesLayoutDTO4 = new OASOrderBoxesLayoutDTO();

        System.assert(orderBoxesLayoutDTO1.equals(orderBoxesLayoutDTO2));
        System.assert(orderBoxesLayoutDTO3.equals(orderBoxesLayoutDTO4));
        System.assertEquals(orderBoxesLayoutDTO1.hashCode(), orderBoxesLayoutDTO2.hashCode());
        System.assertEquals(orderBoxesLayoutDTO3.hashCode(), orderBoxesLayoutDTO4.hashCode());
    }

    @isTest
    private static void defaultValuesPopulated() {
        OASOrderBoxesLayoutDTO orderBoxesLayoutDTO = new OASOrderBoxesLayoutDTO();
        System.assertEquals(new List<OASEnrichedOrderBoxLayoutDTO>(), orderBoxesLayoutDTO.boxes);
    }
}
