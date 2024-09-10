@isTest
private class OASScrollingPagerDTOTest {
    @isTest
    private static void equalsSameInstance() {
        OASScrollingPagerDTO scrollingPagerDTO1 = OASScrollingPagerDTO.getExample();
        OASScrollingPagerDTO scrollingPagerDTO2 = scrollingPagerDTO1;
        OASScrollingPagerDTO scrollingPagerDTO3 = new OASScrollingPagerDTO();
        OASScrollingPagerDTO scrollingPagerDTO4 = scrollingPagerDTO3;

        System.assert(scrollingPagerDTO1.equals(scrollingPagerDTO2));
        System.assert(scrollingPagerDTO2.equals(scrollingPagerDTO1));
        System.assert(scrollingPagerDTO1.equals(scrollingPagerDTO1));
        System.assert(scrollingPagerDTO3.equals(scrollingPagerDTO4));
        System.assert(scrollingPagerDTO4.equals(scrollingPagerDTO3));
        System.assert(scrollingPagerDTO3.equals(scrollingPagerDTO3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASScrollingPagerDTO scrollingPagerDTO1 = OASScrollingPagerDTO.getExample();
        OASScrollingPagerDTO scrollingPagerDTO2 = OASScrollingPagerDTO.getExample();
        OASScrollingPagerDTO scrollingPagerDTO3 = new OASScrollingPagerDTO();
        OASScrollingPagerDTO scrollingPagerDTO4 = new OASScrollingPagerDTO();

        System.assert(scrollingPagerDTO1.equals(scrollingPagerDTO2));
        System.assert(scrollingPagerDTO2.equals(scrollingPagerDTO1));
        System.assert(scrollingPagerDTO3.equals(scrollingPagerDTO4));
        System.assert(scrollingPagerDTO4.equals(scrollingPagerDTO3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASScrollingPagerDTO scrollingPagerDTO1 = OASScrollingPagerDTO.getExample();
        OASScrollingPagerDTO scrollingPagerDTO2 = new OASScrollingPagerDTO();

        System.assertEquals(false, scrollingPagerDTO1.equals('foo'));
        System.assertEquals(false, scrollingPagerDTO2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASScrollingPagerDTO scrollingPagerDTO1 = OASScrollingPagerDTO.getExample();
        OASScrollingPagerDTO scrollingPagerDTO2 = new OASScrollingPagerDTO();
        OASScrollingPagerDTO scrollingPagerDTO3;

        System.assertEquals(false, scrollingPagerDTO1.equals(scrollingPagerDTO3));
        System.assertEquals(false, scrollingPagerDTO2.equals(scrollingPagerDTO3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASScrollingPagerDTO scrollingPagerDTO1 = OASScrollingPagerDTO.getExample();
        OASScrollingPagerDTO scrollingPagerDTO2 = new OASScrollingPagerDTO();

        System.assertEquals(scrollingPagerDTO1.hashCode(), scrollingPagerDTO1.hashCode());
        System.assertEquals(scrollingPagerDTO2.hashCode(), scrollingPagerDTO2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASScrollingPagerDTO scrollingPagerDTO1 = OASScrollingPagerDTO.getExample();
        OASScrollingPagerDTO scrollingPagerDTO2 = OASScrollingPagerDTO.getExample();
        OASScrollingPagerDTO scrollingPagerDTO3 = new OASScrollingPagerDTO();
        OASScrollingPagerDTO scrollingPagerDTO4 = new OASScrollingPagerDTO();

        System.assert(scrollingPagerDTO1.equals(scrollingPagerDTO2));
        System.assert(scrollingPagerDTO3.equals(scrollingPagerDTO4));
        System.assertEquals(scrollingPagerDTO1.hashCode(), scrollingPagerDTO2.hashCode());
        System.assertEquals(scrollingPagerDTO3.hashCode(), scrollingPagerDTO4.hashCode());
    }
}
