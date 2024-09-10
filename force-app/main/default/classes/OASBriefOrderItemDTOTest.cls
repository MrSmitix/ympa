@isTest
private class OASBriefOrderItemDTOTest {
    @isTest
    private static void equalsSameInstance() {
        OASBriefOrderItemDTO briefOrderItemDTO1 = OASBriefOrderItemDTO.getExample();
        OASBriefOrderItemDTO briefOrderItemDTO2 = briefOrderItemDTO1;
        OASBriefOrderItemDTO briefOrderItemDTO3 = new OASBriefOrderItemDTO();
        OASBriefOrderItemDTO briefOrderItemDTO4 = briefOrderItemDTO3;

        System.assert(briefOrderItemDTO1.equals(briefOrderItemDTO2));
        System.assert(briefOrderItemDTO2.equals(briefOrderItemDTO1));
        System.assert(briefOrderItemDTO1.equals(briefOrderItemDTO1));
        System.assert(briefOrderItemDTO3.equals(briefOrderItemDTO4));
        System.assert(briefOrderItemDTO4.equals(briefOrderItemDTO3));
        System.assert(briefOrderItemDTO3.equals(briefOrderItemDTO3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASBriefOrderItemDTO briefOrderItemDTO1 = OASBriefOrderItemDTO.getExample();
        OASBriefOrderItemDTO briefOrderItemDTO2 = OASBriefOrderItemDTO.getExample();
        OASBriefOrderItemDTO briefOrderItemDTO3 = new OASBriefOrderItemDTO();
        OASBriefOrderItemDTO briefOrderItemDTO4 = new OASBriefOrderItemDTO();

        System.assert(briefOrderItemDTO1.equals(briefOrderItemDTO2));
        System.assert(briefOrderItemDTO2.equals(briefOrderItemDTO1));
        System.assert(briefOrderItemDTO3.equals(briefOrderItemDTO4));
        System.assert(briefOrderItemDTO4.equals(briefOrderItemDTO3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASBriefOrderItemDTO briefOrderItemDTO1 = OASBriefOrderItemDTO.getExample();
        OASBriefOrderItemDTO briefOrderItemDTO2 = new OASBriefOrderItemDTO();

        System.assertEquals(false, briefOrderItemDTO1.equals('foo'));
        System.assertEquals(false, briefOrderItemDTO2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASBriefOrderItemDTO briefOrderItemDTO1 = OASBriefOrderItemDTO.getExample();
        OASBriefOrderItemDTO briefOrderItemDTO2 = new OASBriefOrderItemDTO();
        OASBriefOrderItemDTO briefOrderItemDTO3;

        System.assertEquals(false, briefOrderItemDTO1.equals(briefOrderItemDTO3));
        System.assertEquals(false, briefOrderItemDTO2.equals(briefOrderItemDTO3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASBriefOrderItemDTO briefOrderItemDTO1 = OASBriefOrderItemDTO.getExample();
        OASBriefOrderItemDTO briefOrderItemDTO2 = new OASBriefOrderItemDTO();

        System.assertEquals(briefOrderItemDTO1.hashCode(), briefOrderItemDTO1.hashCode());
        System.assertEquals(briefOrderItemDTO2.hashCode(), briefOrderItemDTO2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASBriefOrderItemDTO briefOrderItemDTO1 = OASBriefOrderItemDTO.getExample();
        OASBriefOrderItemDTO briefOrderItemDTO2 = OASBriefOrderItemDTO.getExample();
        OASBriefOrderItemDTO briefOrderItemDTO3 = new OASBriefOrderItemDTO();
        OASBriefOrderItemDTO briefOrderItemDTO4 = new OASBriefOrderItemDTO();

        System.assert(briefOrderItemDTO1.equals(briefOrderItemDTO2));
        System.assert(briefOrderItemDTO3.equals(briefOrderItemDTO4));
        System.assertEquals(briefOrderItemDTO1.hashCode(), briefOrderItemDTO2.hashCode());
        System.assertEquals(briefOrderItemDTO3.hashCode(), briefOrderItemDTO4.hashCode());
    }

    @isTest
    private static void defaultValuesPopulated() {
        OASBriefOrderItemDTO briefOrderItemDTO = new OASBriefOrderItemDTO();
        System.assertEquals(new List<OASOrderItemInstanceDTO>(), briefOrderItemDTO.instances);
        System.assertEquals(null, briefOrderItemDTO.id);
        System.assertEquals(null, briefOrderItemDTO.vat);
        System.assertEquals(null, briefOrderItemDTO.count);
        System.assertEquals(null, briefOrderItemDTO.price);
        System.assertEquals(null, briefOrderItemDTO.offerName);
        System.assertEquals(null, briefOrderItemDTO.offerId);
    }
}
