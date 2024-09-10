@isTest
private class OASForwardScrollingPagerDTOTest {
    @isTest
    private static void equalsSameInstance() {
        OASForwardScrollingPagerDTO forwardScrollingPagerDTO1 = OASForwardScrollingPagerDTO.getExample();
        OASForwardScrollingPagerDTO forwardScrollingPagerDTO2 = forwardScrollingPagerDTO1;
        OASForwardScrollingPagerDTO forwardScrollingPagerDTO3 = new OASForwardScrollingPagerDTO();
        OASForwardScrollingPagerDTO forwardScrollingPagerDTO4 = forwardScrollingPagerDTO3;

        System.assert(forwardScrollingPagerDTO1.equals(forwardScrollingPagerDTO2));
        System.assert(forwardScrollingPagerDTO2.equals(forwardScrollingPagerDTO1));
        System.assert(forwardScrollingPagerDTO1.equals(forwardScrollingPagerDTO1));
        System.assert(forwardScrollingPagerDTO3.equals(forwardScrollingPagerDTO4));
        System.assert(forwardScrollingPagerDTO4.equals(forwardScrollingPagerDTO3));
        System.assert(forwardScrollingPagerDTO3.equals(forwardScrollingPagerDTO3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASForwardScrollingPagerDTO forwardScrollingPagerDTO1 = OASForwardScrollingPagerDTO.getExample();
        OASForwardScrollingPagerDTO forwardScrollingPagerDTO2 = OASForwardScrollingPagerDTO.getExample();
        OASForwardScrollingPagerDTO forwardScrollingPagerDTO3 = new OASForwardScrollingPagerDTO();
        OASForwardScrollingPagerDTO forwardScrollingPagerDTO4 = new OASForwardScrollingPagerDTO();

        System.assert(forwardScrollingPagerDTO1.equals(forwardScrollingPagerDTO2));
        System.assert(forwardScrollingPagerDTO2.equals(forwardScrollingPagerDTO1));
        System.assert(forwardScrollingPagerDTO3.equals(forwardScrollingPagerDTO4));
        System.assert(forwardScrollingPagerDTO4.equals(forwardScrollingPagerDTO3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASForwardScrollingPagerDTO forwardScrollingPagerDTO1 = OASForwardScrollingPagerDTO.getExample();
        OASForwardScrollingPagerDTO forwardScrollingPagerDTO2 = new OASForwardScrollingPagerDTO();

        System.assertEquals(false, forwardScrollingPagerDTO1.equals('foo'));
        System.assertEquals(false, forwardScrollingPagerDTO2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASForwardScrollingPagerDTO forwardScrollingPagerDTO1 = OASForwardScrollingPagerDTO.getExample();
        OASForwardScrollingPagerDTO forwardScrollingPagerDTO2 = new OASForwardScrollingPagerDTO();
        OASForwardScrollingPagerDTO forwardScrollingPagerDTO3;

        System.assertEquals(false, forwardScrollingPagerDTO1.equals(forwardScrollingPagerDTO3));
        System.assertEquals(false, forwardScrollingPagerDTO2.equals(forwardScrollingPagerDTO3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASForwardScrollingPagerDTO forwardScrollingPagerDTO1 = OASForwardScrollingPagerDTO.getExample();
        OASForwardScrollingPagerDTO forwardScrollingPagerDTO2 = new OASForwardScrollingPagerDTO();

        System.assertEquals(forwardScrollingPagerDTO1.hashCode(), forwardScrollingPagerDTO1.hashCode());
        System.assertEquals(forwardScrollingPagerDTO2.hashCode(), forwardScrollingPagerDTO2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASForwardScrollingPagerDTO forwardScrollingPagerDTO1 = OASForwardScrollingPagerDTO.getExample();
        OASForwardScrollingPagerDTO forwardScrollingPagerDTO2 = OASForwardScrollingPagerDTO.getExample();
        OASForwardScrollingPagerDTO forwardScrollingPagerDTO3 = new OASForwardScrollingPagerDTO();
        OASForwardScrollingPagerDTO forwardScrollingPagerDTO4 = new OASForwardScrollingPagerDTO();

        System.assert(forwardScrollingPagerDTO1.equals(forwardScrollingPagerDTO2));
        System.assert(forwardScrollingPagerDTO3.equals(forwardScrollingPagerDTO4));
        System.assertEquals(forwardScrollingPagerDTO1.hashCode(), forwardScrollingPagerDTO2.hashCode());
        System.assertEquals(forwardScrollingPagerDTO3.hashCode(), forwardScrollingPagerDTO4.hashCode());
    }
}
