@isTest
private class OASOrderItemDTOTest {
    @isTest
    private static void equalsSameInstance() {
        OASOrderItemDTO orderItemDTO1 = OASOrderItemDTO.getExample();
        OASOrderItemDTO orderItemDTO2 = orderItemDTO1;
        OASOrderItemDTO orderItemDTO3 = new OASOrderItemDTO();
        OASOrderItemDTO orderItemDTO4 = orderItemDTO3;

        System.assert(orderItemDTO1.equals(orderItemDTO2));
        System.assert(orderItemDTO2.equals(orderItemDTO1));
        System.assert(orderItemDTO1.equals(orderItemDTO1));
        System.assert(orderItemDTO3.equals(orderItemDTO4));
        System.assert(orderItemDTO4.equals(orderItemDTO3));
        System.assert(orderItemDTO3.equals(orderItemDTO3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASOrderItemDTO orderItemDTO1 = OASOrderItemDTO.getExample();
        OASOrderItemDTO orderItemDTO2 = OASOrderItemDTO.getExample();
        OASOrderItemDTO orderItemDTO3 = new OASOrderItemDTO();
        OASOrderItemDTO orderItemDTO4 = new OASOrderItemDTO();

        System.assert(orderItemDTO1.equals(orderItemDTO2));
        System.assert(orderItemDTO2.equals(orderItemDTO1));
        System.assert(orderItemDTO3.equals(orderItemDTO4));
        System.assert(orderItemDTO4.equals(orderItemDTO3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASOrderItemDTO orderItemDTO1 = OASOrderItemDTO.getExample();
        OASOrderItemDTO orderItemDTO2 = new OASOrderItemDTO();

        System.assertEquals(false, orderItemDTO1.equals('foo'));
        System.assertEquals(false, orderItemDTO2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASOrderItemDTO orderItemDTO1 = OASOrderItemDTO.getExample();
        OASOrderItemDTO orderItemDTO2 = new OASOrderItemDTO();
        OASOrderItemDTO orderItemDTO3;

        System.assertEquals(false, orderItemDTO1.equals(orderItemDTO3));
        System.assertEquals(false, orderItemDTO2.equals(orderItemDTO3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASOrderItemDTO orderItemDTO1 = OASOrderItemDTO.getExample();
        OASOrderItemDTO orderItemDTO2 = new OASOrderItemDTO();

        System.assertEquals(orderItemDTO1.hashCode(), orderItemDTO1.hashCode());
        System.assertEquals(orderItemDTO2.hashCode(), orderItemDTO2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASOrderItemDTO orderItemDTO1 = OASOrderItemDTO.getExample();
        OASOrderItemDTO orderItemDTO2 = OASOrderItemDTO.getExample();
        OASOrderItemDTO orderItemDTO3 = new OASOrderItemDTO();
        OASOrderItemDTO orderItemDTO4 = new OASOrderItemDTO();

        System.assert(orderItemDTO1.equals(orderItemDTO2));
        System.assert(orderItemDTO3.equals(orderItemDTO4));
        System.assertEquals(orderItemDTO1.hashCode(), orderItemDTO2.hashCode());
        System.assertEquals(orderItemDTO3.hashCode(), orderItemDTO4.hashCode());
    }

    @isTest
    private static void defaultValuesPopulated() {
        OASOrderItemDTO orderItemDTO = new OASOrderItemDTO();
        System.assertEquals(new List<OASOrderItemPromoDTO>(), orderItemDTO.promos);
        System.assertEquals(new List<OASOrderItemInstanceDTO>(), orderItemDTO.instances);
        System.assertEquals(new List<OASOrderItemDetailDTO>(), orderItemDTO.details);
        System.assertEquals(new List<OASOrderItemSubsidyDTO>(), orderItemDTO.subsidies);
        System.assertEquals(new List<OASOrderItemInstanceType>(), orderItemDTO.requiredInstanceTypes);
        System.assertEquals(null, orderItemDTO.id);
        System.assertEquals(null, orderItemDTO.offerId);
        System.assertEquals(null, orderItemDTO.offerName);
        System.assertEquals(null, orderItemDTO.price);
        System.assertEquals(null, orderItemDTO.buyerPrice);
        System.assertEquals(null, orderItemDTO.buyerPriceBeforeDiscount);
        System.assertEquals(null, orderItemDTO.priceBeforeDiscount);
        System.assertEquals(null, orderItemDTO.count);
        System.assertEquals(null, orderItemDTO.vat);
        System.assertEquals(null, orderItemDTO.shopSku);
        System.assertEquals(null, orderItemDTO.subsidy);
        System.assertEquals(null, orderItemDTO.partnerWarehouseId);
    }
}
