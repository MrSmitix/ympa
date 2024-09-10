@isTest
private class OASOrderLabelDTOTest {
    @isTest
    private static void equalsSameInstance() {
        OASOrderLabelDTO orderLabelDTO1 = OASOrderLabelDTO.getExample();
        OASOrderLabelDTO orderLabelDTO2 = orderLabelDTO1;
        OASOrderLabelDTO orderLabelDTO3 = new OASOrderLabelDTO();
        OASOrderLabelDTO orderLabelDTO4 = orderLabelDTO3;

        System.assert(orderLabelDTO1.equals(orderLabelDTO2));
        System.assert(orderLabelDTO2.equals(orderLabelDTO1));
        System.assert(orderLabelDTO1.equals(orderLabelDTO1));
        System.assert(orderLabelDTO3.equals(orderLabelDTO4));
        System.assert(orderLabelDTO4.equals(orderLabelDTO3));
        System.assert(orderLabelDTO3.equals(orderLabelDTO3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASOrderLabelDTO orderLabelDTO1 = OASOrderLabelDTO.getExample();
        OASOrderLabelDTO orderLabelDTO2 = OASOrderLabelDTO.getExample();
        OASOrderLabelDTO orderLabelDTO3 = new OASOrderLabelDTO();
        OASOrderLabelDTO orderLabelDTO4 = new OASOrderLabelDTO();

        System.assert(orderLabelDTO1.equals(orderLabelDTO2));
        System.assert(orderLabelDTO2.equals(orderLabelDTO1));
        System.assert(orderLabelDTO3.equals(orderLabelDTO4));
        System.assert(orderLabelDTO4.equals(orderLabelDTO3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASOrderLabelDTO orderLabelDTO1 = OASOrderLabelDTO.getExample();
        OASOrderLabelDTO orderLabelDTO2 = new OASOrderLabelDTO();

        System.assertEquals(false, orderLabelDTO1.equals('foo'));
        System.assertEquals(false, orderLabelDTO2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASOrderLabelDTO orderLabelDTO1 = OASOrderLabelDTO.getExample();
        OASOrderLabelDTO orderLabelDTO2 = new OASOrderLabelDTO();
        OASOrderLabelDTO orderLabelDTO3;

        System.assertEquals(false, orderLabelDTO1.equals(orderLabelDTO3));
        System.assertEquals(false, orderLabelDTO2.equals(orderLabelDTO3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASOrderLabelDTO orderLabelDTO1 = OASOrderLabelDTO.getExample();
        OASOrderLabelDTO orderLabelDTO2 = new OASOrderLabelDTO();

        System.assertEquals(orderLabelDTO1.hashCode(), orderLabelDTO1.hashCode());
        System.assertEquals(orderLabelDTO2.hashCode(), orderLabelDTO2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASOrderLabelDTO orderLabelDTO1 = OASOrderLabelDTO.getExample();
        OASOrderLabelDTO orderLabelDTO2 = OASOrderLabelDTO.getExample();
        OASOrderLabelDTO orderLabelDTO3 = new OASOrderLabelDTO();
        OASOrderLabelDTO orderLabelDTO4 = new OASOrderLabelDTO();

        System.assert(orderLabelDTO1.equals(orderLabelDTO2));
        System.assert(orderLabelDTO3.equals(orderLabelDTO4));
        System.assertEquals(orderLabelDTO1.hashCode(), orderLabelDTO2.hashCode());
        System.assertEquals(orderLabelDTO3.hashCode(), orderLabelDTO4.hashCode());
    }

    @isTest
    private static void defaultValuesPopulated() {
        OASOrderLabelDTO orderLabelDTO = new OASOrderLabelDTO();
        System.assertEquals(new List<OASParcelBoxLabelDTO>(), orderLabelDTO.parcelBoxLabels);
        System.assertEquals(null, orderLabelDTO.orderId);
        System.assertEquals(null, orderLabelDTO.placesNumber);
        System.assertEquals(null, orderLabelDTO.url);
    }
}
