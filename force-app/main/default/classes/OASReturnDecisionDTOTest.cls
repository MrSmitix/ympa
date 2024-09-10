@isTest
private class OASReturnDecisionDTOTest {
    @isTest
    private static void equalsSameInstance() {
        OASReturnDecisionDTO returnDecisionDTO1 = OASReturnDecisionDTO.getExample();
        OASReturnDecisionDTO returnDecisionDTO2 = returnDecisionDTO1;
        OASReturnDecisionDTO returnDecisionDTO3 = new OASReturnDecisionDTO();
        OASReturnDecisionDTO returnDecisionDTO4 = returnDecisionDTO3;

        System.assert(returnDecisionDTO1.equals(returnDecisionDTO2));
        System.assert(returnDecisionDTO2.equals(returnDecisionDTO1));
        System.assert(returnDecisionDTO1.equals(returnDecisionDTO1));
        System.assert(returnDecisionDTO3.equals(returnDecisionDTO4));
        System.assert(returnDecisionDTO4.equals(returnDecisionDTO3));
        System.assert(returnDecisionDTO3.equals(returnDecisionDTO3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASReturnDecisionDTO returnDecisionDTO1 = OASReturnDecisionDTO.getExample();
        OASReturnDecisionDTO returnDecisionDTO2 = OASReturnDecisionDTO.getExample();
        OASReturnDecisionDTO returnDecisionDTO3 = new OASReturnDecisionDTO();
        OASReturnDecisionDTO returnDecisionDTO4 = new OASReturnDecisionDTO();

        System.assert(returnDecisionDTO1.equals(returnDecisionDTO2));
        System.assert(returnDecisionDTO2.equals(returnDecisionDTO1));
        System.assert(returnDecisionDTO3.equals(returnDecisionDTO4));
        System.assert(returnDecisionDTO4.equals(returnDecisionDTO3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASReturnDecisionDTO returnDecisionDTO1 = OASReturnDecisionDTO.getExample();
        OASReturnDecisionDTO returnDecisionDTO2 = new OASReturnDecisionDTO();

        System.assertEquals(false, returnDecisionDTO1.equals('foo'));
        System.assertEquals(false, returnDecisionDTO2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASReturnDecisionDTO returnDecisionDTO1 = OASReturnDecisionDTO.getExample();
        OASReturnDecisionDTO returnDecisionDTO2 = new OASReturnDecisionDTO();
        OASReturnDecisionDTO returnDecisionDTO3;

        System.assertEquals(false, returnDecisionDTO1.equals(returnDecisionDTO3));
        System.assertEquals(false, returnDecisionDTO2.equals(returnDecisionDTO3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASReturnDecisionDTO returnDecisionDTO1 = OASReturnDecisionDTO.getExample();
        OASReturnDecisionDTO returnDecisionDTO2 = new OASReturnDecisionDTO();

        System.assertEquals(returnDecisionDTO1.hashCode(), returnDecisionDTO1.hashCode());
        System.assertEquals(returnDecisionDTO2.hashCode(), returnDecisionDTO2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASReturnDecisionDTO returnDecisionDTO1 = OASReturnDecisionDTO.getExample();
        OASReturnDecisionDTO returnDecisionDTO2 = OASReturnDecisionDTO.getExample();
        OASReturnDecisionDTO returnDecisionDTO3 = new OASReturnDecisionDTO();
        OASReturnDecisionDTO returnDecisionDTO4 = new OASReturnDecisionDTO();

        System.assert(returnDecisionDTO1.equals(returnDecisionDTO2));
        System.assert(returnDecisionDTO3.equals(returnDecisionDTO4));
        System.assertEquals(returnDecisionDTO1.hashCode(), returnDecisionDTO2.hashCode());
        System.assertEquals(returnDecisionDTO3.hashCode(), returnDecisionDTO4.hashCode());
    }

    @isTest
    private static void defaultValuesPopulated() {
        OASReturnDecisionDTO returnDecisionDTO = new OASReturnDecisionDTO();
        System.assertEquals(new List<String>(), returnDecisionDTO.images);
        System.assertEquals(null, returnDecisionDTO.returnItemId);
        System.assertEquals(null, returnDecisionDTO.count);
        System.assertEquals(null, returnDecisionDTO.comment);
        System.assertEquals(null, returnDecisionDTO.reasonType);
        System.assertEquals(null, returnDecisionDTO.subreasonType);
        System.assertEquals(null, returnDecisionDTO.decisionType);
        System.assertEquals(null, returnDecisionDTO.refundAmount);
        System.assertEquals(null, returnDecisionDTO.partnerCompensation);
    }
}
