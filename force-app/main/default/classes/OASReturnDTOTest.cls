@isTest
private class OASReturnDTOTest {
    @isTest
    private static void equalsSameInstance() {
        OASReturnDTO returnDTO1 = OASReturnDTO.getExample();
        OASReturnDTO returnDTO2 = returnDTO1;
        OASReturnDTO returnDTO3 = new OASReturnDTO();
        OASReturnDTO returnDTO4 = returnDTO3;

        System.assert(returnDTO1.equals(returnDTO2));
        System.assert(returnDTO2.equals(returnDTO1));
        System.assert(returnDTO1.equals(returnDTO1));
        System.assert(returnDTO3.equals(returnDTO4));
        System.assert(returnDTO4.equals(returnDTO3));
        System.assert(returnDTO3.equals(returnDTO3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASReturnDTO returnDTO1 = OASReturnDTO.getExample();
        OASReturnDTO returnDTO2 = OASReturnDTO.getExample();
        OASReturnDTO returnDTO3 = new OASReturnDTO();
        OASReturnDTO returnDTO4 = new OASReturnDTO();

        System.assert(returnDTO1.equals(returnDTO2));
        System.assert(returnDTO2.equals(returnDTO1));
        System.assert(returnDTO3.equals(returnDTO4));
        System.assert(returnDTO4.equals(returnDTO3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASReturnDTO returnDTO1 = OASReturnDTO.getExample();
        OASReturnDTO returnDTO2 = new OASReturnDTO();

        System.assertEquals(false, returnDTO1.equals('foo'));
        System.assertEquals(false, returnDTO2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASReturnDTO returnDTO1 = OASReturnDTO.getExample();
        OASReturnDTO returnDTO2 = new OASReturnDTO();
        OASReturnDTO returnDTO3;

        System.assertEquals(false, returnDTO1.equals(returnDTO3));
        System.assertEquals(false, returnDTO2.equals(returnDTO3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASReturnDTO returnDTO1 = OASReturnDTO.getExample();
        OASReturnDTO returnDTO2 = new OASReturnDTO();

        System.assertEquals(returnDTO1.hashCode(), returnDTO1.hashCode());
        System.assertEquals(returnDTO2.hashCode(), returnDTO2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASReturnDTO returnDTO1 = OASReturnDTO.getExample();
        OASReturnDTO returnDTO2 = OASReturnDTO.getExample();
        OASReturnDTO returnDTO3 = new OASReturnDTO();
        OASReturnDTO returnDTO4 = new OASReturnDTO();

        System.assert(returnDTO1.equals(returnDTO2));
        System.assert(returnDTO3.equals(returnDTO4));
        System.assertEquals(returnDTO1.hashCode(), returnDTO2.hashCode());
        System.assertEquals(returnDTO3.hashCode(), returnDTO4.hashCode());
    }

    @isTest
    private static void defaultValuesPopulated() {
        OASReturnDTO returnDTO = new OASReturnDTO();
        System.assertEquals(new List<OASReturnItemDTO>(), returnDTO.items);
        System.assertEquals(null, returnDTO.id);
        System.assertEquals(null, returnDTO.orderId);
        System.assertEquals(null, returnDTO.creationDate);
        System.assertEquals(null, returnDTO.updateDate);
        System.assertEquals(null, returnDTO.refundStatus);
        System.assertEquals(null, returnDTO.logisticPickupPoint);
        System.assertEquals(null, returnDTO.shipmentRecipientType);
        System.assertEquals(null, returnDTO.shipmentStatus);
        System.assertEquals(null, returnDTO.refundAmount);
        System.assertEquals(null, returnDTO.returnType);
        System.assertEquals(null, returnDTO.fastReturn);
    }
}
