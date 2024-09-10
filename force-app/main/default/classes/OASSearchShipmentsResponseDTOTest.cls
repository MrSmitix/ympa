@isTest
private class OASSearchShipmentsResponseDTOTest {
    @isTest
    private static void equalsSameInstance() {
        OASSearchShipmentsResponseDTO searchShipmentsResponseDTO1 = OASSearchShipmentsResponseDTO.getExample();
        OASSearchShipmentsResponseDTO searchShipmentsResponseDTO2 = searchShipmentsResponseDTO1;
        OASSearchShipmentsResponseDTO searchShipmentsResponseDTO3 = new OASSearchShipmentsResponseDTO();
        OASSearchShipmentsResponseDTO searchShipmentsResponseDTO4 = searchShipmentsResponseDTO3;

        System.assert(searchShipmentsResponseDTO1.equals(searchShipmentsResponseDTO2));
        System.assert(searchShipmentsResponseDTO2.equals(searchShipmentsResponseDTO1));
        System.assert(searchShipmentsResponseDTO1.equals(searchShipmentsResponseDTO1));
        System.assert(searchShipmentsResponseDTO3.equals(searchShipmentsResponseDTO4));
        System.assert(searchShipmentsResponseDTO4.equals(searchShipmentsResponseDTO3));
        System.assert(searchShipmentsResponseDTO3.equals(searchShipmentsResponseDTO3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASSearchShipmentsResponseDTO searchShipmentsResponseDTO1 = OASSearchShipmentsResponseDTO.getExample();
        OASSearchShipmentsResponseDTO searchShipmentsResponseDTO2 = OASSearchShipmentsResponseDTO.getExample();
        OASSearchShipmentsResponseDTO searchShipmentsResponseDTO3 = new OASSearchShipmentsResponseDTO();
        OASSearchShipmentsResponseDTO searchShipmentsResponseDTO4 = new OASSearchShipmentsResponseDTO();

        System.assert(searchShipmentsResponseDTO1.equals(searchShipmentsResponseDTO2));
        System.assert(searchShipmentsResponseDTO2.equals(searchShipmentsResponseDTO1));
        System.assert(searchShipmentsResponseDTO3.equals(searchShipmentsResponseDTO4));
        System.assert(searchShipmentsResponseDTO4.equals(searchShipmentsResponseDTO3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASSearchShipmentsResponseDTO searchShipmentsResponseDTO1 = OASSearchShipmentsResponseDTO.getExample();
        OASSearchShipmentsResponseDTO searchShipmentsResponseDTO2 = new OASSearchShipmentsResponseDTO();

        System.assertEquals(false, searchShipmentsResponseDTO1.equals('foo'));
        System.assertEquals(false, searchShipmentsResponseDTO2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASSearchShipmentsResponseDTO searchShipmentsResponseDTO1 = OASSearchShipmentsResponseDTO.getExample();
        OASSearchShipmentsResponseDTO searchShipmentsResponseDTO2 = new OASSearchShipmentsResponseDTO();
        OASSearchShipmentsResponseDTO searchShipmentsResponseDTO3;

        System.assertEquals(false, searchShipmentsResponseDTO1.equals(searchShipmentsResponseDTO3));
        System.assertEquals(false, searchShipmentsResponseDTO2.equals(searchShipmentsResponseDTO3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASSearchShipmentsResponseDTO searchShipmentsResponseDTO1 = OASSearchShipmentsResponseDTO.getExample();
        OASSearchShipmentsResponseDTO searchShipmentsResponseDTO2 = new OASSearchShipmentsResponseDTO();

        System.assertEquals(searchShipmentsResponseDTO1.hashCode(), searchShipmentsResponseDTO1.hashCode());
        System.assertEquals(searchShipmentsResponseDTO2.hashCode(), searchShipmentsResponseDTO2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASSearchShipmentsResponseDTO searchShipmentsResponseDTO1 = OASSearchShipmentsResponseDTO.getExample();
        OASSearchShipmentsResponseDTO searchShipmentsResponseDTO2 = OASSearchShipmentsResponseDTO.getExample();
        OASSearchShipmentsResponseDTO searchShipmentsResponseDTO3 = new OASSearchShipmentsResponseDTO();
        OASSearchShipmentsResponseDTO searchShipmentsResponseDTO4 = new OASSearchShipmentsResponseDTO();

        System.assert(searchShipmentsResponseDTO1.equals(searchShipmentsResponseDTO2));
        System.assert(searchShipmentsResponseDTO3.equals(searchShipmentsResponseDTO4));
        System.assertEquals(searchShipmentsResponseDTO1.hashCode(), searchShipmentsResponseDTO2.hashCode());
        System.assertEquals(searchShipmentsResponseDTO3.hashCode(), searchShipmentsResponseDTO4.hashCode());
    }

    @isTest
    private static void defaultValuesPopulated() {
        OASSearchShipmentsResponseDTO searchShipmentsResponseDTO = new OASSearchShipmentsResponseDTO();
        System.assertEquals(new List<OASShipmentInfoDTO>(), searchShipmentsResponseDTO.shipments);
        System.assertEquals(null, searchShipmentsResponseDTO.paging);
    }
}
