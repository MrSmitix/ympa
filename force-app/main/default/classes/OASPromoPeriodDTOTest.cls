@isTest
private class OASPromoPeriodDTOTest {
    @isTest
    private static void equalsSameInstance() {
        OASPromoPeriodDTO promoPeriodDTO1 = OASPromoPeriodDTO.getExample();
        OASPromoPeriodDTO promoPeriodDTO2 = promoPeriodDTO1;
        OASPromoPeriodDTO promoPeriodDTO3 = new OASPromoPeriodDTO();
        OASPromoPeriodDTO promoPeriodDTO4 = promoPeriodDTO3;

        System.assert(promoPeriodDTO1.equals(promoPeriodDTO2));
        System.assert(promoPeriodDTO2.equals(promoPeriodDTO1));
        System.assert(promoPeriodDTO1.equals(promoPeriodDTO1));
        System.assert(promoPeriodDTO3.equals(promoPeriodDTO4));
        System.assert(promoPeriodDTO4.equals(promoPeriodDTO3));
        System.assert(promoPeriodDTO3.equals(promoPeriodDTO3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASPromoPeriodDTO promoPeriodDTO1 = OASPromoPeriodDTO.getExample();
        OASPromoPeriodDTO promoPeriodDTO2 = OASPromoPeriodDTO.getExample();
        OASPromoPeriodDTO promoPeriodDTO3 = new OASPromoPeriodDTO();
        OASPromoPeriodDTO promoPeriodDTO4 = new OASPromoPeriodDTO();

        System.assert(promoPeriodDTO1.equals(promoPeriodDTO2));
        System.assert(promoPeriodDTO2.equals(promoPeriodDTO1));
        System.assert(promoPeriodDTO3.equals(promoPeriodDTO4));
        System.assert(promoPeriodDTO4.equals(promoPeriodDTO3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASPromoPeriodDTO promoPeriodDTO1 = OASPromoPeriodDTO.getExample();
        OASPromoPeriodDTO promoPeriodDTO2 = new OASPromoPeriodDTO();

        System.assertEquals(false, promoPeriodDTO1.equals('foo'));
        System.assertEquals(false, promoPeriodDTO2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASPromoPeriodDTO promoPeriodDTO1 = OASPromoPeriodDTO.getExample();
        OASPromoPeriodDTO promoPeriodDTO2 = new OASPromoPeriodDTO();
        OASPromoPeriodDTO promoPeriodDTO3;

        System.assertEquals(false, promoPeriodDTO1.equals(promoPeriodDTO3));
        System.assertEquals(false, promoPeriodDTO2.equals(promoPeriodDTO3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASPromoPeriodDTO promoPeriodDTO1 = OASPromoPeriodDTO.getExample();
        OASPromoPeriodDTO promoPeriodDTO2 = new OASPromoPeriodDTO();

        System.assertEquals(promoPeriodDTO1.hashCode(), promoPeriodDTO1.hashCode());
        System.assertEquals(promoPeriodDTO2.hashCode(), promoPeriodDTO2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASPromoPeriodDTO promoPeriodDTO1 = OASPromoPeriodDTO.getExample();
        OASPromoPeriodDTO promoPeriodDTO2 = OASPromoPeriodDTO.getExample();
        OASPromoPeriodDTO promoPeriodDTO3 = new OASPromoPeriodDTO();
        OASPromoPeriodDTO promoPeriodDTO4 = new OASPromoPeriodDTO();

        System.assert(promoPeriodDTO1.equals(promoPeriodDTO2));
        System.assert(promoPeriodDTO3.equals(promoPeriodDTO4));
        System.assertEquals(promoPeriodDTO1.hashCode(), promoPeriodDTO2.hashCode());
        System.assertEquals(promoPeriodDTO3.hashCode(), promoPeriodDTO4.hashCode());
    }
}
