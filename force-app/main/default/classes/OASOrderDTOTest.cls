@isTest
private class OASOrderDTOTest {
    @isTest
    private static void equalsSameInstance() {
        OASOrderDTO orderDTO1 = OASOrderDTO.getExample();
        OASOrderDTO orderDTO2 = orderDTO1;
        OASOrderDTO orderDTO3 = new OASOrderDTO();
        OASOrderDTO orderDTO4 = orderDTO3;

        System.assert(orderDTO1.equals(orderDTO2));
        System.assert(orderDTO2.equals(orderDTO1));
        System.assert(orderDTO1.equals(orderDTO1));
        System.assert(orderDTO3.equals(orderDTO4));
        System.assert(orderDTO4.equals(orderDTO3));
        System.assert(orderDTO3.equals(orderDTO3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASOrderDTO orderDTO1 = OASOrderDTO.getExample();
        OASOrderDTO orderDTO2 = OASOrderDTO.getExample();
        OASOrderDTO orderDTO3 = new OASOrderDTO();
        OASOrderDTO orderDTO4 = new OASOrderDTO();

        System.assert(orderDTO1.equals(orderDTO2));
        System.assert(orderDTO2.equals(orderDTO1));
        System.assert(orderDTO3.equals(orderDTO4));
        System.assert(orderDTO4.equals(orderDTO3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASOrderDTO orderDTO1 = OASOrderDTO.getExample();
        OASOrderDTO orderDTO2 = new OASOrderDTO();

        System.assertEquals(false, orderDTO1.equals('foo'));
        System.assertEquals(false, orderDTO2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASOrderDTO orderDTO1 = OASOrderDTO.getExample();
        OASOrderDTO orderDTO2 = new OASOrderDTO();
        OASOrderDTO orderDTO3;

        System.assertEquals(false, orderDTO1.equals(orderDTO3));
        System.assertEquals(false, orderDTO2.equals(orderDTO3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASOrderDTO orderDTO1 = OASOrderDTO.getExample();
        OASOrderDTO orderDTO2 = new OASOrderDTO();

        System.assertEquals(orderDTO1.hashCode(), orderDTO1.hashCode());
        System.assertEquals(orderDTO2.hashCode(), orderDTO2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASOrderDTO orderDTO1 = OASOrderDTO.getExample();
        OASOrderDTO orderDTO2 = OASOrderDTO.getExample();
        OASOrderDTO orderDTO3 = new OASOrderDTO();
        OASOrderDTO orderDTO4 = new OASOrderDTO();

        System.assert(orderDTO1.equals(orderDTO2));
        System.assert(orderDTO3.equals(orderDTO4));
        System.assertEquals(orderDTO1.hashCode(), orderDTO2.hashCode());
        System.assertEquals(orderDTO3.hashCode(), orderDTO4.hashCode());
    }

    @isTest
    private static void maintainRenamedProperties() {
        OASOrderDTO orderDTO = new OASOrderDTO();
        Map<String, String> x-property-mappings = orderDTO.getx-property-mappings();
        System.assertEquals('r_currency', x-property-mappings.get('currency'));
    }

    @isTest
    private static void defaultValuesPopulated() {
        OASOrderDTO orderDTO = new OASOrderDTO();
        System.assertEquals(new List<OASOrderItemDTO>(), orderDTO.items);
        System.assertEquals(new List<OASOrderSubsidyDTO>(), orderDTO.subsidies);
        System.assertEquals(null, orderDTO.id);
        System.assertEquals(null, orderDTO.status);
        System.assertEquals(null, orderDTO.substatus);
        System.assertEquals(null, orderDTO.creationDate);
        System.assertEquals(null, orderDTO.updatedAt);
        System.assertEquals(null, orderDTO.r_currency);
        System.assertEquals(null, orderDTO.itemsTotal);
        System.assertEquals(null, orderDTO.deliveryTotal);
        System.assertEquals(null, orderDTO.buyerItemsTotal);
        System.assertEquals(null, orderDTO.buyerTotal);
        System.assertEquals(null, orderDTO.buyerItemsTotalBeforeDiscount);
        System.assertEquals(null, orderDTO.buyerTotalBeforeDiscount);
        System.assertEquals(null, orderDTO.paymentType);
        System.assertEquals(null, orderDTO.paymentMethod);
        System.assertEquals(null, orderDTO.fake);
        System.assertEquals(null, orderDTO.delivery);
        System.assertEquals(null, orderDTO.buyer);
        System.assertEquals(null, orderDTO.notes);
        System.assertEquals(null, orderDTO.taxSystem);
        System.assertEquals(null, orderDTO.cancelRequested);
        System.assertEquals(null, orderDTO.expiryDate);
    }
}
