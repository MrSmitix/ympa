@isTest
private class OASOutletDeliveryRuleDTOTest {
    @isTest
    private static void equalsSameInstance() {
        OASOutletDeliveryRuleDTO outletDeliveryRuleDTO1 = OASOutletDeliveryRuleDTO.getExample();
        OASOutletDeliveryRuleDTO outletDeliveryRuleDTO2 = outletDeliveryRuleDTO1;
        OASOutletDeliveryRuleDTO outletDeliveryRuleDTO3 = new OASOutletDeliveryRuleDTO();
        OASOutletDeliveryRuleDTO outletDeliveryRuleDTO4 = outletDeliveryRuleDTO3;

        System.assert(outletDeliveryRuleDTO1.equals(outletDeliveryRuleDTO2));
        System.assert(outletDeliveryRuleDTO2.equals(outletDeliveryRuleDTO1));
        System.assert(outletDeliveryRuleDTO1.equals(outletDeliveryRuleDTO1));
        System.assert(outletDeliveryRuleDTO3.equals(outletDeliveryRuleDTO4));
        System.assert(outletDeliveryRuleDTO4.equals(outletDeliveryRuleDTO3));
        System.assert(outletDeliveryRuleDTO3.equals(outletDeliveryRuleDTO3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASOutletDeliveryRuleDTO outletDeliveryRuleDTO1 = OASOutletDeliveryRuleDTO.getExample();
        OASOutletDeliveryRuleDTO outletDeliveryRuleDTO2 = OASOutletDeliveryRuleDTO.getExample();
        OASOutletDeliveryRuleDTO outletDeliveryRuleDTO3 = new OASOutletDeliveryRuleDTO();
        OASOutletDeliveryRuleDTO outletDeliveryRuleDTO4 = new OASOutletDeliveryRuleDTO();

        System.assert(outletDeliveryRuleDTO1.equals(outletDeliveryRuleDTO2));
        System.assert(outletDeliveryRuleDTO2.equals(outletDeliveryRuleDTO1));
        System.assert(outletDeliveryRuleDTO3.equals(outletDeliveryRuleDTO4));
        System.assert(outletDeliveryRuleDTO4.equals(outletDeliveryRuleDTO3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASOutletDeliveryRuleDTO outletDeliveryRuleDTO1 = OASOutletDeliveryRuleDTO.getExample();
        OASOutletDeliveryRuleDTO outletDeliveryRuleDTO2 = new OASOutletDeliveryRuleDTO();

        System.assertEquals(false, outletDeliveryRuleDTO1.equals('foo'));
        System.assertEquals(false, outletDeliveryRuleDTO2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASOutletDeliveryRuleDTO outletDeliveryRuleDTO1 = OASOutletDeliveryRuleDTO.getExample();
        OASOutletDeliveryRuleDTO outletDeliveryRuleDTO2 = new OASOutletDeliveryRuleDTO();
        OASOutletDeliveryRuleDTO outletDeliveryRuleDTO3;

        System.assertEquals(false, outletDeliveryRuleDTO1.equals(outletDeliveryRuleDTO3));
        System.assertEquals(false, outletDeliveryRuleDTO2.equals(outletDeliveryRuleDTO3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASOutletDeliveryRuleDTO outletDeliveryRuleDTO1 = OASOutletDeliveryRuleDTO.getExample();
        OASOutletDeliveryRuleDTO outletDeliveryRuleDTO2 = new OASOutletDeliveryRuleDTO();

        System.assertEquals(outletDeliveryRuleDTO1.hashCode(), outletDeliveryRuleDTO1.hashCode());
        System.assertEquals(outletDeliveryRuleDTO2.hashCode(), outletDeliveryRuleDTO2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASOutletDeliveryRuleDTO outletDeliveryRuleDTO1 = OASOutletDeliveryRuleDTO.getExample();
        OASOutletDeliveryRuleDTO outletDeliveryRuleDTO2 = OASOutletDeliveryRuleDTO.getExample();
        OASOutletDeliveryRuleDTO outletDeliveryRuleDTO3 = new OASOutletDeliveryRuleDTO();
        OASOutletDeliveryRuleDTO outletDeliveryRuleDTO4 = new OASOutletDeliveryRuleDTO();

        System.assert(outletDeliveryRuleDTO1.equals(outletDeliveryRuleDTO2));
        System.assert(outletDeliveryRuleDTO3.equals(outletDeliveryRuleDTO4));
        System.assertEquals(outletDeliveryRuleDTO1.hashCode(), outletDeliveryRuleDTO2.hashCode());
        System.assertEquals(outletDeliveryRuleDTO3.hashCode(), outletDeliveryRuleDTO4.hashCode());
    }
}
