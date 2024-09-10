@isTest
private class OASFlippingPagerDTOTest {
    @isTest
    private static void equalsSameInstance() {
        OASFlippingPagerDTO flippingPagerDTO1 = OASFlippingPagerDTO.getExample();
        OASFlippingPagerDTO flippingPagerDTO2 = flippingPagerDTO1;
        OASFlippingPagerDTO flippingPagerDTO3 = new OASFlippingPagerDTO();
        OASFlippingPagerDTO flippingPagerDTO4 = flippingPagerDTO3;

        System.assert(flippingPagerDTO1.equals(flippingPagerDTO2));
        System.assert(flippingPagerDTO2.equals(flippingPagerDTO1));
        System.assert(flippingPagerDTO1.equals(flippingPagerDTO1));
        System.assert(flippingPagerDTO3.equals(flippingPagerDTO4));
        System.assert(flippingPagerDTO4.equals(flippingPagerDTO3));
        System.assert(flippingPagerDTO3.equals(flippingPagerDTO3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASFlippingPagerDTO flippingPagerDTO1 = OASFlippingPagerDTO.getExample();
        OASFlippingPagerDTO flippingPagerDTO2 = OASFlippingPagerDTO.getExample();
        OASFlippingPagerDTO flippingPagerDTO3 = new OASFlippingPagerDTO();
        OASFlippingPagerDTO flippingPagerDTO4 = new OASFlippingPagerDTO();

        System.assert(flippingPagerDTO1.equals(flippingPagerDTO2));
        System.assert(flippingPagerDTO2.equals(flippingPagerDTO1));
        System.assert(flippingPagerDTO3.equals(flippingPagerDTO4));
        System.assert(flippingPagerDTO4.equals(flippingPagerDTO3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASFlippingPagerDTO flippingPagerDTO1 = OASFlippingPagerDTO.getExample();
        OASFlippingPagerDTO flippingPagerDTO2 = new OASFlippingPagerDTO();

        System.assertEquals(false, flippingPagerDTO1.equals('foo'));
        System.assertEquals(false, flippingPagerDTO2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASFlippingPagerDTO flippingPagerDTO1 = OASFlippingPagerDTO.getExample();
        OASFlippingPagerDTO flippingPagerDTO2 = new OASFlippingPagerDTO();
        OASFlippingPagerDTO flippingPagerDTO3;

        System.assertEquals(false, flippingPagerDTO1.equals(flippingPagerDTO3));
        System.assertEquals(false, flippingPagerDTO2.equals(flippingPagerDTO3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASFlippingPagerDTO flippingPagerDTO1 = OASFlippingPagerDTO.getExample();
        OASFlippingPagerDTO flippingPagerDTO2 = new OASFlippingPagerDTO();

        System.assertEquals(flippingPagerDTO1.hashCode(), flippingPagerDTO1.hashCode());
        System.assertEquals(flippingPagerDTO2.hashCode(), flippingPagerDTO2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASFlippingPagerDTO flippingPagerDTO1 = OASFlippingPagerDTO.getExample();
        OASFlippingPagerDTO flippingPagerDTO2 = OASFlippingPagerDTO.getExample();
        OASFlippingPagerDTO flippingPagerDTO3 = new OASFlippingPagerDTO();
        OASFlippingPagerDTO flippingPagerDTO4 = new OASFlippingPagerDTO();

        System.assert(flippingPagerDTO1.equals(flippingPagerDTO2));
        System.assert(flippingPagerDTO3.equals(flippingPagerDTO4));
        System.assertEquals(flippingPagerDTO1.hashCode(), flippingPagerDTO2.hashCode());
        System.assertEquals(flippingPagerDTO3.hashCode(), flippingPagerDTO4.hashCode());
    }

    @isTest
    private static void maintainRenamedProperties() {
        OASFlippingPagerDTO flippingPagerDTO = new OASFlippingPagerDTO();
        Map<String, String> x-property-mappings = flippingPagerDTO.getx-property-mappings();
        System.assertEquals('r_from', x-property-mappings.get('from'));
    }
}
