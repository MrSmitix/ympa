@isTest
private class OASFullOutletDTOTest {
    @isTest
    private static void equalsSameInstance() {
        OASFullOutletDTO fullOutletDTO1 = OASFullOutletDTO.getExample();
        OASFullOutletDTO fullOutletDTO2 = fullOutletDTO1;
        OASFullOutletDTO fullOutletDTO3 = new OASFullOutletDTO();
        OASFullOutletDTO fullOutletDTO4 = fullOutletDTO3;

        System.assert(fullOutletDTO1.equals(fullOutletDTO2));
        System.assert(fullOutletDTO2.equals(fullOutletDTO1));
        System.assert(fullOutletDTO1.equals(fullOutletDTO1));
        System.assert(fullOutletDTO3.equals(fullOutletDTO4));
        System.assert(fullOutletDTO4.equals(fullOutletDTO3));
        System.assert(fullOutletDTO3.equals(fullOutletDTO3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASFullOutletDTO fullOutletDTO1 = OASFullOutletDTO.getExample();
        OASFullOutletDTO fullOutletDTO2 = OASFullOutletDTO.getExample();
        OASFullOutletDTO fullOutletDTO3 = new OASFullOutletDTO();
        OASFullOutletDTO fullOutletDTO4 = new OASFullOutletDTO();

        System.assert(fullOutletDTO1.equals(fullOutletDTO2));
        System.assert(fullOutletDTO2.equals(fullOutletDTO1));
        System.assert(fullOutletDTO3.equals(fullOutletDTO4));
        System.assert(fullOutletDTO4.equals(fullOutletDTO3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASFullOutletDTO fullOutletDTO1 = OASFullOutletDTO.getExample();
        OASFullOutletDTO fullOutletDTO2 = new OASFullOutletDTO();

        System.assertEquals(false, fullOutletDTO1.equals('foo'));
        System.assertEquals(false, fullOutletDTO2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASFullOutletDTO fullOutletDTO1 = OASFullOutletDTO.getExample();
        OASFullOutletDTO fullOutletDTO2 = new OASFullOutletDTO();
        OASFullOutletDTO fullOutletDTO3;

        System.assertEquals(false, fullOutletDTO1.equals(fullOutletDTO3));
        System.assertEquals(false, fullOutletDTO2.equals(fullOutletDTO3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASFullOutletDTO fullOutletDTO1 = OASFullOutletDTO.getExample();
        OASFullOutletDTO fullOutletDTO2 = new OASFullOutletDTO();

        System.assertEquals(fullOutletDTO1.hashCode(), fullOutletDTO1.hashCode());
        System.assertEquals(fullOutletDTO2.hashCode(), fullOutletDTO2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASFullOutletDTO fullOutletDTO1 = OASFullOutletDTO.getExample();
        OASFullOutletDTO fullOutletDTO2 = OASFullOutletDTO.getExample();
        OASFullOutletDTO fullOutletDTO3 = new OASFullOutletDTO();
        OASFullOutletDTO fullOutletDTO4 = new OASFullOutletDTO();

        System.assert(fullOutletDTO1.equals(fullOutletDTO2));
        System.assert(fullOutletDTO3.equals(fullOutletDTO4));
        System.assertEquals(fullOutletDTO1.hashCode(), fullOutletDTO2.hashCode());
        System.assertEquals(fullOutletDTO3.hashCode(), fullOutletDTO4.hashCode());
    }

    @isTest
    private static void defaultValuesPopulated() {
        OASFullOutletDTO fullOutletDTO = new OASFullOutletDTO();
        System.assertEquals(new List<String>(), fullOutletDTO.phones);
        System.assertEquals(new List<OASOutletDeliveryRuleDTO>(), fullOutletDTO.deliveryRules);
        System.assertEquals(null, fullOutletDTO.name);
        System.assertEquals(null, fullOutletDTO.type);
        System.assertEquals(null, fullOutletDTO.coords);
        System.assertEquals(null, fullOutletDTO.isMain);
        System.assertEquals(null, fullOutletDTO.shopOutletCode);
        System.assertEquals(null, fullOutletDTO.visibility);
        System.assertEquals(null, fullOutletDTO.address);
        System.assertEquals(null, fullOutletDTO.workingSchedule);
        System.assertEquals(null, fullOutletDTO.storagePeriod);
        System.assertEquals(null, fullOutletDTO.id);
        System.assertEquals(null, fullOutletDTO.status);
        System.assertEquals(null, fullOutletDTO.region);
        System.assertEquals(null, fullOutletDTO.shopOutletId);
        System.assertEquals(null, fullOutletDTO.workingTime);
        System.assertEquals(null, fullOutletDTO.moderationReason);
    }
}
