@isTest
private class OASPartnerShipmentWarehouseDTOTest {
    @isTest
    private static void equalsSameInstance() {
        OASPartnerShipmentWarehouseDTO partnerShipmentWarehouseDTO1 = OASPartnerShipmentWarehouseDTO.getExample();
        OASPartnerShipmentWarehouseDTO partnerShipmentWarehouseDTO2 = partnerShipmentWarehouseDTO1;
        OASPartnerShipmentWarehouseDTO partnerShipmentWarehouseDTO3 = new OASPartnerShipmentWarehouseDTO();
        OASPartnerShipmentWarehouseDTO partnerShipmentWarehouseDTO4 = partnerShipmentWarehouseDTO3;

        System.assert(partnerShipmentWarehouseDTO1.equals(partnerShipmentWarehouseDTO2));
        System.assert(partnerShipmentWarehouseDTO2.equals(partnerShipmentWarehouseDTO1));
        System.assert(partnerShipmentWarehouseDTO1.equals(partnerShipmentWarehouseDTO1));
        System.assert(partnerShipmentWarehouseDTO3.equals(partnerShipmentWarehouseDTO4));
        System.assert(partnerShipmentWarehouseDTO4.equals(partnerShipmentWarehouseDTO3));
        System.assert(partnerShipmentWarehouseDTO3.equals(partnerShipmentWarehouseDTO3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASPartnerShipmentWarehouseDTO partnerShipmentWarehouseDTO1 = OASPartnerShipmentWarehouseDTO.getExample();
        OASPartnerShipmentWarehouseDTO partnerShipmentWarehouseDTO2 = OASPartnerShipmentWarehouseDTO.getExample();
        OASPartnerShipmentWarehouseDTO partnerShipmentWarehouseDTO3 = new OASPartnerShipmentWarehouseDTO();
        OASPartnerShipmentWarehouseDTO partnerShipmentWarehouseDTO4 = new OASPartnerShipmentWarehouseDTO();

        System.assert(partnerShipmentWarehouseDTO1.equals(partnerShipmentWarehouseDTO2));
        System.assert(partnerShipmentWarehouseDTO2.equals(partnerShipmentWarehouseDTO1));
        System.assert(partnerShipmentWarehouseDTO3.equals(partnerShipmentWarehouseDTO4));
        System.assert(partnerShipmentWarehouseDTO4.equals(partnerShipmentWarehouseDTO3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASPartnerShipmentWarehouseDTO partnerShipmentWarehouseDTO1 = OASPartnerShipmentWarehouseDTO.getExample();
        OASPartnerShipmentWarehouseDTO partnerShipmentWarehouseDTO2 = new OASPartnerShipmentWarehouseDTO();

        System.assertEquals(false, partnerShipmentWarehouseDTO1.equals('foo'));
        System.assertEquals(false, partnerShipmentWarehouseDTO2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASPartnerShipmentWarehouseDTO partnerShipmentWarehouseDTO1 = OASPartnerShipmentWarehouseDTO.getExample();
        OASPartnerShipmentWarehouseDTO partnerShipmentWarehouseDTO2 = new OASPartnerShipmentWarehouseDTO();
        OASPartnerShipmentWarehouseDTO partnerShipmentWarehouseDTO3;

        System.assertEquals(false, partnerShipmentWarehouseDTO1.equals(partnerShipmentWarehouseDTO3));
        System.assertEquals(false, partnerShipmentWarehouseDTO2.equals(partnerShipmentWarehouseDTO3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASPartnerShipmentWarehouseDTO partnerShipmentWarehouseDTO1 = OASPartnerShipmentWarehouseDTO.getExample();
        OASPartnerShipmentWarehouseDTO partnerShipmentWarehouseDTO2 = new OASPartnerShipmentWarehouseDTO();

        System.assertEquals(partnerShipmentWarehouseDTO1.hashCode(), partnerShipmentWarehouseDTO1.hashCode());
        System.assertEquals(partnerShipmentWarehouseDTO2.hashCode(), partnerShipmentWarehouseDTO2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASPartnerShipmentWarehouseDTO partnerShipmentWarehouseDTO1 = OASPartnerShipmentWarehouseDTO.getExample();
        OASPartnerShipmentWarehouseDTO partnerShipmentWarehouseDTO2 = OASPartnerShipmentWarehouseDTO.getExample();
        OASPartnerShipmentWarehouseDTO partnerShipmentWarehouseDTO3 = new OASPartnerShipmentWarehouseDTO();
        OASPartnerShipmentWarehouseDTO partnerShipmentWarehouseDTO4 = new OASPartnerShipmentWarehouseDTO();

        System.assert(partnerShipmentWarehouseDTO1.equals(partnerShipmentWarehouseDTO2));
        System.assert(partnerShipmentWarehouseDTO3.equals(partnerShipmentWarehouseDTO4));
        System.assertEquals(partnerShipmentWarehouseDTO1.hashCode(), partnerShipmentWarehouseDTO2.hashCode());
        System.assertEquals(partnerShipmentWarehouseDTO3.hashCode(), partnerShipmentWarehouseDTO4.hashCode());
    }
}
