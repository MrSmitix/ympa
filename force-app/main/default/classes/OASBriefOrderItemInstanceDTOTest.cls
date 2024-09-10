@isTest
private class OASBriefOrderItemInstanceDTOTest {
    @isTest
    private static void equalsSameInstance() {
        OASBriefOrderItemInstanceDTO briefOrderItemInstanceDTO1 = OASBriefOrderItemInstanceDTO.getExample();
        OASBriefOrderItemInstanceDTO briefOrderItemInstanceDTO2 = briefOrderItemInstanceDTO1;
        OASBriefOrderItemInstanceDTO briefOrderItemInstanceDTO3 = new OASBriefOrderItemInstanceDTO();
        OASBriefOrderItemInstanceDTO briefOrderItemInstanceDTO4 = briefOrderItemInstanceDTO3;

        System.assert(briefOrderItemInstanceDTO1.equals(briefOrderItemInstanceDTO2));
        System.assert(briefOrderItemInstanceDTO2.equals(briefOrderItemInstanceDTO1));
        System.assert(briefOrderItemInstanceDTO1.equals(briefOrderItemInstanceDTO1));
        System.assert(briefOrderItemInstanceDTO3.equals(briefOrderItemInstanceDTO4));
        System.assert(briefOrderItemInstanceDTO4.equals(briefOrderItemInstanceDTO3));
        System.assert(briefOrderItemInstanceDTO3.equals(briefOrderItemInstanceDTO3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASBriefOrderItemInstanceDTO briefOrderItemInstanceDTO1 = OASBriefOrderItemInstanceDTO.getExample();
        OASBriefOrderItemInstanceDTO briefOrderItemInstanceDTO2 = OASBriefOrderItemInstanceDTO.getExample();
        OASBriefOrderItemInstanceDTO briefOrderItemInstanceDTO3 = new OASBriefOrderItemInstanceDTO();
        OASBriefOrderItemInstanceDTO briefOrderItemInstanceDTO4 = new OASBriefOrderItemInstanceDTO();

        System.assert(briefOrderItemInstanceDTO1.equals(briefOrderItemInstanceDTO2));
        System.assert(briefOrderItemInstanceDTO2.equals(briefOrderItemInstanceDTO1));
        System.assert(briefOrderItemInstanceDTO3.equals(briefOrderItemInstanceDTO4));
        System.assert(briefOrderItemInstanceDTO4.equals(briefOrderItemInstanceDTO3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASBriefOrderItemInstanceDTO briefOrderItemInstanceDTO1 = OASBriefOrderItemInstanceDTO.getExample();
        OASBriefOrderItemInstanceDTO briefOrderItemInstanceDTO2 = new OASBriefOrderItemInstanceDTO();

        System.assertEquals(false, briefOrderItemInstanceDTO1.equals('foo'));
        System.assertEquals(false, briefOrderItemInstanceDTO2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASBriefOrderItemInstanceDTO briefOrderItemInstanceDTO1 = OASBriefOrderItemInstanceDTO.getExample();
        OASBriefOrderItemInstanceDTO briefOrderItemInstanceDTO2 = new OASBriefOrderItemInstanceDTO();
        OASBriefOrderItemInstanceDTO briefOrderItemInstanceDTO3;

        System.assertEquals(false, briefOrderItemInstanceDTO1.equals(briefOrderItemInstanceDTO3));
        System.assertEquals(false, briefOrderItemInstanceDTO2.equals(briefOrderItemInstanceDTO3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASBriefOrderItemInstanceDTO briefOrderItemInstanceDTO1 = OASBriefOrderItemInstanceDTO.getExample();
        OASBriefOrderItemInstanceDTO briefOrderItemInstanceDTO2 = new OASBriefOrderItemInstanceDTO();

        System.assertEquals(briefOrderItemInstanceDTO1.hashCode(), briefOrderItemInstanceDTO1.hashCode());
        System.assertEquals(briefOrderItemInstanceDTO2.hashCode(), briefOrderItemInstanceDTO2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASBriefOrderItemInstanceDTO briefOrderItemInstanceDTO1 = OASBriefOrderItemInstanceDTO.getExample();
        OASBriefOrderItemInstanceDTO briefOrderItemInstanceDTO2 = OASBriefOrderItemInstanceDTO.getExample();
        OASBriefOrderItemInstanceDTO briefOrderItemInstanceDTO3 = new OASBriefOrderItemInstanceDTO();
        OASBriefOrderItemInstanceDTO briefOrderItemInstanceDTO4 = new OASBriefOrderItemInstanceDTO();

        System.assert(briefOrderItemInstanceDTO1.equals(briefOrderItemInstanceDTO2));
        System.assert(briefOrderItemInstanceDTO3.equals(briefOrderItemInstanceDTO4));
        System.assertEquals(briefOrderItemInstanceDTO1.hashCode(), briefOrderItemInstanceDTO2.hashCode());
        System.assertEquals(briefOrderItemInstanceDTO3.hashCode(), briefOrderItemInstanceDTO4.hashCode());
    }
}
