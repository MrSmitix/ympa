@isTest
private class OASFulfillmentWarehousesDTOTest {
    @isTest
    private static void equalsSameInstance() {
        OASFulfillmentWarehousesDTO fulfillmentWarehousesDTO1 = OASFulfillmentWarehousesDTO.getExample();
        OASFulfillmentWarehousesDTO fulfillmentWarehousesDTO2 = fulfillmentWarehousesDTO1;
        OASFulfillmentWarehousesDTO fulfillmentWarehousesDTO3 = new OASFulfillmentWarehousesDTO();
        OASFulfillmentWarehousesDTO fulfillmentWarehousesDTO4 = fulfillmentWarehousesDTO3;

        System.assert(fulfillmentWarehousesDTO1.equals(fulfillmentWarehousesDTO2));
        System.assert(fulfillmentWarehousesDTO2.equals(fulfillmentWarehousesDTO1));
        System.assert(fulfillmentWarehousesDTO1.equals(fulfillmentWarehousesDTO1));
        System.assert(fulfillmentWarehousesDTO3.equals(fulfillmentWarehousesDTO4));
        System.assert(fulfillmentWarehousesDTO4.equals(fulfillmentWarehousesDTO3));
        System.assert(fulfillmentWarehousesDTO3.equals(fulfillmentWarehousesDTO3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASFulfillmentWarehousesDTO fulfillmentWarehousesDTO1 = OASFulfillmentWarehousesDTO.getExample();
        OASFulfillmentWarehousesDTO fulfillmentWarehousesDTO2 = OASFulfillmentWarehousesDTO.getExample();
        OASFulfillmentWarehousesDTO fulfillmentWarehousesDTO3 = new OASFulfillmentWarehousesDTO();
        OASFulfillmentWarehousesDTO fulfillmentWarehousesDTO4 = new OASFulfillmentWarehousesDTO();

        System.assert(fulfillmentWarehousesDTO1.equals(fulfillmentWarehousesDTO2));
        System.assert(fulfillmentWarehousesDTO2.equals(fulfillmentWarehousesDTO1));
        System.assert(fulfillmentWarehousesDTO3.equals(fulfillmentWarehousesDTO4));
        System.assert(fulfillmentWarehousesDTO4.equals(fulfillmentWarehousesDTO3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASFulfillmentWarehousesDTO fulfillmentWarehousesDTO1 = OASFulfillmentWarehousesDTO.getExample();
        OASFulfillmentWarehousesDTO fulfillmentWarehousesDTO2 = new OASFulfillmentWarehousesDTO();

        System.assertEquals(false, fulfillmentWarehousesDTO1.equals('foo'));
        System.assertEquals(false, fulfillmentWarehousesDTO2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASFulfillmentWarehousesDTO fulfillmentWarehousesDTO1 = OASFulfillmentWarehousesDTO.getExample();
        OASFulfillmentWarehousesDTO fulfillmentWarehousesDTO2 = new OASFulfillmentWarehousesDTO();
        OASFulfillmentWarehousesDTO fulfillmentWarehousesDTO3;

        System.assertEquals(false, fulfillmentWarehousesDTO1.equals(fulfillmentWarehousesDTO3));
        System.assertEquals(false, fulfillmentWarehousesDTO2.equals(fulfillmentWarehousesDTO3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASFulfillmentWarehousesDTO fulfillmentWarehousesDTO1 = OASFulfillmentWarehousesDTO.getExample();
        OASFulfillmentWarehousesDTO fulfillmentWarehousesDTO2 = new OASFulfillmentWarehousesDTO();

        System.assertEquals(fulfillmentWarehousesDTO1.hashCode(), fulfillmentWarehousesDTO1.hashCode());
        System.assertEquals(fulfillmentWarehousesDTO2.hashCode(), fulfillmentWarehousesDTO2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASFulfillmentWarehousesDTO fulfillmentWarehousesDTO1 = OASFulfillmentWarehousesDTO.getExample();
        OASFulfillmentWarehousesDTO fulfillmentWarehousesDTO2 = OASFulfillmentWarehousesDTO.getExample();
        OASFulfillmentWarehousesDTO fulfillmentWarehousesDTO3 = new OASFulfillmentWarehousesDTO();
        OASFulfillmentWarehousesDTO fulfillmentWarehousesDTO4 = new OASFulfillmentWarehousesDTO();

        System.assert(fulfillmentWarehousesDTO1.equals(fulfillmentWarehousesDTO2));
        System.assert(fulfillmentWarehousesDTO3.equals(fulfillmentWarehousesDTO4));
        System.assertEquals(fulfillmentWarehousesDTO1.hashCode(), fulfillmentWarehousesDTO2.hashCode());
        System.assertEquals(fulfillmentWarehousesDTO3.hashCode(), fulfillmentWarehousesDTO4.hashCode());
    }

    @isTest
    private static void defaultValuesPopulated() {
        OASFulfillmentWarehousesDTO fulfillmentWarehousesDTO = new OASFulfillmentWarehousesDTO();
        System.assertEquals(new List<OASFulfillmentWarehouseDTO>(), fulfillmentWarehousesDTO.warehouses);
    }
}
