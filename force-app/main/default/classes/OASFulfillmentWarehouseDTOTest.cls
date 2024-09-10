@isTest
private class OASFulfillmentWarehouseDTOTest {
    @isTest
    private static void equalsSameInstance() {
        OASFulfillmentWarehouseDTO fulfillmentWarehouseDTO1 = OASFulfillmentWarehouseDTO.getExample();
        OASFulfillmentWarehouseDTO fulfillmentWarehouseDTO2 = fulfillmentWarehouseDTO1;
        OASFulfillmentWarehouseDTO fulfillmentWarehouseDTO3 = new OASFulfillmentWarehouseDTO();
        OASFulfillmentWarehouseDTO fulfillmentWarehouseDTO4 = fulfillmentWarehouseDTO3;

        System.assert(fulfillmentWarehouseDTO1.equals(fulfillmentWarehouseDTO2));
        System.assert(fulfillmentWarehouseDTO2.equals(fulfillmentWarehouseDTO1));
        System.assert(fulfillmentWarehouseDTO1.equals(fulfillmentWarehouseDTO1));
        System.assert(fulfillmentWarehouseDTO3.equals(fulfillmentWarehouseDTO4));
        System.assert(fulfillmentWarehouseDTO4.equals(fulfillmentWarehouseDTO3));
        System.assert(fulfillmentWarehouseDTO3.equals(fulfillmentWarehouseDTO3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASFulfillmentWarehouseDTO fulfillmentWarehouseDTO1 = OASFulfillmentWarehouseDTO.getExample();
        OASFulfillmentWarehouseDTO fulfillmentWarehouseDTO2 = OASFulfillmentWarehouseDTO.getExample();
        OASFulfillmentWarehouseDTO fulfillmentWarehouseDTO3 = new OASFulfillmentWarehouseDTO();
        OASFulfillmentWarehouseDTO fulfillmentWarehouseDTO4 = new OASFulfillmentWarehouseDTO();

        System.assert(fulfillmentWarehouseDTO1.equals(fulfillmentWarehouseDTO2));
        System.assert(fulfillmentWarehouseDTO2.equals(fulfillmentWarehouseDTO1));
        System.assert(fulfillmentWarehouseDTO3.equals(fulfillmentWarehouseDTO4));
        System.assert(fulfillmentWarehouseDTO4.equals(fulfillmentWarehouseDTO3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASFulfillmentWarehouseDTO fulfillmentWarehouseDTO1 = OASFulfillmentWarehouseDTO.getExample();
        OASFulfillmentWarehouseDTO fulfillmentWarehouseDTO2 = new OASFulfillmentWarehouseDTO();

        System.assertEquals(false, fulfillmentWarehouseDTO1.equals('foo'));
        System.assertEquals(false, fulfillmentWarehouseDTO2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASFulfillmentWarehouseDTO fulfillmentWarehouseDTO1 = OASFulfillmentWarehouseDTO.getExample();
        OASFulfillmentWarehouseDTO fulfillmentWarehouseDTO2 = new OASFulfillmentWarehouseDTO();
        OASFulfillmentWarehouseDTO fulfillmentWarehouseDTO3;

        System.assertEquals(false, fulfillmentWarehouseDTO1.equals(fulfillmentWarehouseDTO3));
        System.assertEquals(false, fulfillmentWarehouseDTO2.equals(fulfillmentWarehouseDTO3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASFulfillmentWarehouseDTO fulfillmentWarehouseDTO1 = OASFulfillmentWarehouseDTO.getExample();
        OASFulfillmentWarehouseDTO fulfillmentWarehouseDTO2 = new OASFulfillmentWarehouseDTO();

        System.assertEquals(fulfillmentWarehouseDTO1.hashCode(), fulfillmentWarehouseDTO1.hashCode());
        System.assertEquals(fulfillmentWarehouseDTO2.hashCode(), fulfillmentWarehouseDTO2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASFulfillmentWarehouseDTO fulfillmentWarehouseDTO1 = OASFulfillmentWarehouseDTO.getExample();
        OASFulfillmentWarehouseDTO fulfillmentWarehouseDTO2 = OASFulfillmentWarehouseDTO.getExample();
        OASFulfillmentWarehouseDTO fulfillmentWarehouseDTO3 = new OASFulfillmentWarehouseDTO();
        OASFulfillmentWarehouseDTO fulfillmentWarehouseDTO4 = new OASFulfillmentWarehouseDTO();

        System.assert(fulfillmentWarehouseDTO1.equals(fulfillmentWarehouseDTO2));
        System.assert(fulfillmentWarehouseDTO3.equals(fulfillmentWarehouseDTO4));
        System.assertEquals(fulfillmentWarehouseDTO1.hashCode(), fulfillmentWarehouseDTO2.hashCode());
        System.assertEquals(fulfillmentWarehouseDTO3.hashCode(), fulfillmentWarehouseDTO4.hashCode());
    }
}
