@isTest
private class OASExtensionShipmentDTOTest {
    @isTest
    private static void equalsSameInstance() {
        OASExtensionShipmentDTO extensionShipmentDTO1 = OASExtensionShipmentDTO.getExample();
        OASExtensionShipmentDTO extensionShipmentDTO2 = extensionShipmentDTO1;
        OASExtensionShipmentDTO extensionShipmentDTO3 = new OASExtensionShipmentDTO();
        OASExtensionShipmentDTO extensionShipmentDTO4 = extensionShipmentDTO3;

        System.assert(extensionShipmentDTO1.equals(extensionShipmentDTO2));
        System.assert(extensionShipmentDTO2.equals(extensionShipmentDTO1));
        System.assert(extensionShipmentDTO1.equals(extensionShipmentDTO1));
        System.assert(extensionShipmentDTO3.equals(extensionShipmentDTO4));
        System.assert(extensionShipmentDTO4.equals(extensionShipmentDTO3));
        System.assert(extensionShipmentDTO3.equals(extensionShipmentDTO3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASExtensionShipmentDTO extensionShipmentDTO1 = OASExtensionShipmentDTO.getExample();
        OASExtensionShipmentDTO extensionShipmentDTO2 = OASExtensionShipmentDTO.getExample();
        OASExtensionShipmentDTO extensionShipmentDTO3 = new OASExtensionShipmentDTO();
        OASExtensionShipmentDTO extensionShipmentDTO4 = new OASExtensionShipmentDTO();

        System.assert(extensionShipmentDTO1.equals(extensionShipmentDTO2));
        System.assert(extensionShipmentDTO2.equals(extensionShipmentDTO1));
        System.assert(extensionShipmentDTO3.equals(extensionShipmentDTO4));
        System.assert(extensionShipmentDTO4.equals(extensionShipmentDTO3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASExtensionShipmentDTO extensionShipmentDTO1 = OASExtensionShipmentDTO.getExample();
        OASExtensionShipmentDTO extensionShipmentDTO2 = new OASExtensionShipmentDTO();

        System.assertEquals(false, extensionShipmentDTO1.equals('foo'));
        System.assertEquals(false, extensionShipmentDTO2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASExtensionShipmentDTO extensionShipmentDTO1 = OASExtensionShipmentDTO.getExample();
        OASExtensionShipmentDTO extensionShipmentDTO2 = new OASExtensionShipmentDTO();
        OASExtensionShipmentDTO extensionShipmentDTO3;

        System.assertEquals(false, extensionShipmentDTO1.equals(extensionShipmentDTO3));
        System.assertEquals(false, extensionShipmentDTO2.equals(extensionShipmentDTO3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASExtensionShipmentDTO extensionShipmentDTO1 = OASExtensionShipmentDTO.getExample();
        OASExtensionShipmentDTO extensionShipmentDTO2 = new OASExtensionShipmentDTO();

        System.assertEquals(extensionShipmentDTO1.hashCode(), extensionShipmentDTO1.hashCode());
        System.assertEquals(extensionShipmentDTO2.hashCode(), extensionShipmentDTO2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASExtensionShipmentDTO extensionShipmentDTO1 = OASExtensionShipmentDTO.getExample();
        OASExtensionShipmentDTO extensionShipmentDTO2 = OASExtensionShipmentDTO.getExample();
        OASExtensionShipmentDTO extensionShipmentDTO3 = new OASExtensionShipmentDTO();
        OASExtensionShipmentDTO extensionShipmentDTO4 = new OASExtensionShipmentDTO();

        System.assert(extensionShipmentDTO1.equals(extensionShipmentDTO2));
        System.assert(extensionShipmentDTO3.equals(extensionShipmentDTO4));
        System.assertEquals(extensionShipmentDTO1.hashCode(), extensionShipmentDTO2.hashCode());
        System.assertEquals(extensionShipmentDTO3.hashCode(), extensionShipmentDTO4.hashCode());
    }

    @isTest
    private static void defaultValuesPopulated() {
        OASExtensionShipmentDTO extensionShipmentDTO = new OASExtensionShipmentDTO();
        System.assertEquals(new List<OASShipmentActionType>(), extensionShipmentDTO.availableActions);
        System.assertEquals(null, extensionShipmentDTO.currentStatus);
    }
}
