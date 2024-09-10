@isTest
private class OASOutletDTOTest {
    @isTest
    private static void equalsSameInstance() {
        OASOutletDTO outletDTO1 = OASOutletDTO.getExample();
        OASOutletDTO outletDTO2 = outletDTO1;
        OASOutletDTO outletDTO3 = new OASOutletDTO();
        OASOutletDTO outletDTO4 = outletDTO3;

        System.assert(outletDTO1.equals(outletDTO2));
        System.assert(outletDTO2.equals(outletDTO1));
        System.assert(outletDTO1.equals(outletDTO1));
        System.assert(outletDTO3.equals(outletDTO4));
        System.assert(outletDTO4.equals(outletDTO3));
        System.assert(outletDTO3.equals(outletDTO3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASOutletDTO outletDTO1 = OASOutletDTO.getExample();
        OASOutletDTO outletDTO2 = OASOutletDTO.getExample();
        OASOutletDTO outletDTO3 = new OASOutletDTO();
        OASOutletDTO outletDTO4 = new OASOutletDTO();

        System.assert(outletDTO1.equals(outletDTO2));
        System.assert(outletDTO2.equals(outletDTO1));
        System.assert(outletDTO3.equals(outletDTO4));
        System.assert(outletDTO4.equals(outletDTO3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASOutletDTO outletDTO1 = OASOutletDTO.getExample();
        OASOutletDTO outletDTO2 = new OASOutletDTO();

        System.assertEquals(false, outletDTO1.equals('foo'));
        System.assertEquals(false, outletDTO2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASOutletDTO outletDTO1 = OASOutletDTO.getExample();
        OASOutletDTO outletDTO2 = new OASOutletDTO();
        OASOutletDTO outletDTO3;

        System.assertEquals(false, outletDTO1.equals(outletDTO3));
        System.assertEquals(false, outletDTO2.equals(outletDTO3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASOutletDTO outletDTO1 = OASOutletDTO.getExample();
        OASOutletDTO outletDTO2 = new OASOutletDTO();

        System.assertEquals(outletDTO1.hashCode(), outletDTO1.hashCode());
        System.assertEquals(outletDTO2.hashCode(), outletDTO2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASOutletDTO outletDTO1 = OASOutletDTO.getExample();
        OASOutletDTO outletDTO2 = OASOutletDTO.getExample();
        OASOutletDTO outletDTO3 = new OASOutletDTO();
        OASOutletDTO outletDTO4 = new OASOutletDTO();

        System.assert(outletDTO1.equals(outletDTO2));
        System.assert(outletDTO3.equals(outletDTO4));
        System.assertEquals(outletDTO1.hashCode(), outletDTO2.hashCode());
        System.assertEquals(outletDTO3.hashCode(), outletDTO4.hashCode());
    }

    @isTest
    private static void defaultValuesPopulated() {
        OASOutletDTO outletDTO = new OASOutletDTO();
        System.assertEquals(new List<String>(), outletDTO.phones);
        System.assertEquals(new List<OASOutletDeliveryRuleDTO>(), outletDTO.deliveryRules);
        System.assertEquals(null, outletDTO.name);
        System.assertEquals(null, outletDTO.type);
        System.assertEquals(null, outletDTO.coords);
        System.assertEquals(null, outletDTO.isMain);
        System.assertEquals(null, outletDTO.shopOutletCode);
        System.assertEquals(null, outletDTO.visibility);
        System.assertEquals(null, outletDTO.address);
        System.assertEquals(null, outletDTO.workingSchedule);
        System.assertEquals(null, outletDTO.storagePeriod);
    }
}
