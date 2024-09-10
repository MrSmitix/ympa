@isTest
private class OASApiErrorDTOTest {
    @isTest
    private static void equalsSameInstance() {
        OASApiErrorDTO apiErrorDTO1 = OASApiErrorDTO.getExample();
        OASApiErrorDTO apiErrorDTO2 = apiErrorDTO1;
        OASApiErrorDTO apiErrorDTO3 = new OASApiErrorDTO();
        OASApiErrorDTO apiErrorDTO4 = apiErrorDTO3;

        System.assert(apiErrorDTO1.equals(apiErrorDTO2));
        System.assert(apiErrorDTO2.equals(apiErrorDTO1));
        System.assert(apiErrorDTO1.equals(apiErrorDTO1));
        System.assert(apiErrorDTO3.equals(apiErrorDTO4));
        System.assert(apiErrorDTO4.equals(apiErrorDTO3));
        System.assert(apiErrorDTO3.equals(apiErrorDTO3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASApiErrorDTO apiErrorDTO1 = OASApiErrorDTO.getExample();
        OASApiErrorDTO apiErrorDTO2 = OASApiErrorDTO.getExample();
        OASApiErrorDTO apiErrorDTO3 = new OASApiErrorDTO();
        OASApiErrorDTO apiErrorDTO4 = new OASApiErrorDTO();

        System.assert(apiErrorDTO1.equals(apiErrorDTO2));
        System.assert(apiErrorDTO2.equals(apiErrorDTO1));
        System.assert(apiErrorDTO3.equals(apiErrorDTO4));
        System.assert(apiErrorDTO4.equals(apiErrorDTO3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASApiErrorDTO apiErrorDTO1 = OASApiErrorDTO.getExample();
        OASApiErrorDTO apiErrorDTO2 = new OASApiErrorDTO();

        System.assertEquals(false, apiErrorDTO1.equals('foo'));
        System.assertEquals(false, apiErrorDTO2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASApiErrorDTO apiErrorDTO1 = OASApiErrorDTO.getExample();
        OASApiErrorDTO apiErrorDTO2 = new OASApiErrorDTO();
        OASApiErrorDTO apiErrorDTO3;

        System.assertEquals(false, apiErrorDTO1.equals(apiErrorDTO3));
        System.assertEquals(false, apiErrorDTO2.equals(apiErrorDTO3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASApiErrorDTO apiErrorDTO1 = OASApiErrorDTO.getExample();
        OASApiErrorDTO apiErrorDTO2 = new OASApiErrorDTO();

        System.assertEquals(apiErrorDTO1.hashCode(), apiErrorDTO1.hashCode());
        System.assertEquals(apiErrorDTO2.hashCode(), apiErrorDTO2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASApiErrorDTO apiErrorDTO1 = OASApiErrorDTO.getExample();
        OASApiErrorDTO apiErrorDTO2 = OASApiErrorDTO.getExample();
        OASApiErrorDTO apiErrorDTO3 = new OASApiErrorDTO();
        OASApiErrorDTO apiErrorDTO4 = new OASApiErrorDTO();

        System.assert(apiErrorDTO1.equals(apiErrorDTO2));
        System.assert(apiErrorDTO3.equals(apiErrorDTO4));
        System.assertEquals(apiErrorDTO1.hashCode(), apiErrorDTO2.hashCode());
        System.assertEquals(apiErrorDTO3.hashCode(), apiErrorDTO4.hashCode());
    }
}
