@isTest
private class OASParcelBoxDTOTest {
    @isTest
    private static void equalsSameInstance() {
        OASParcelBoxDTO parcelBoxDTO1 = OASParcelBoxDTO.getExample();
        OASParcelBoxDTO parcelBoxDTO2 = parcelBoxDTO1;
        OASParcelBoxDTO parcelBoxDTO3 = new OASParcelBoxDTO();
        OASParcelBoxDTO parcelBoxDTO4 = parcelBoxDTO3;

        System.assert(parcelBoxDTO1.equals(parcelBoxDTO2));
        System.assert(parcelBoxDTO2.equals(parcelBoxDTO1));
        System.assert(parcelBoxDTO1.equals(parcelBoxDTO1));
        System.assert(parcelBoxDTO3.equals(parcelBoxDTO4));
        System.assert(parcelBoxDTO4.equals(parcelBoxDTO3));
        System.assert(parcelBoxDTO3.equals(parcelBoxDTO3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASParcelBoxDTO parcelBoxDTO1 = OASParcelBoxDTO.getExample();
        OASParcelBoxDTO parcelBoxDTO2 = OASParcelBoxDTO.getExample();
        OASParcelBoxDTO parcelBoxDTO3 = new OASParcelBoxDTO();
        OASParcelBoxDTO parcelBoxDTO4 = new OASParcelBoxDTO();

        System.assert(parcelBoxDTO1.equals(parcelBoxDTO2));
        System.assert(parcelBoxDTO2.equals(parcelBoxDTO1));
        System.assert(parcelBoxDTO3.equals(parcelBoxDTO4));
        System.assert(parcelBoxDTO4.equals(parcelBoxDTO3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASParcelBoxDTO parcelBoxDTO1 = OASParcelBoxDTO.getExample();
        OASParcelBoxDTO parcelBoxDTO2 = new OASParcelBoxDTO();

        System.assertEquals(false, parcelBoxDTO1.equals('foo'));
        System.assertEquals(false, parcelBoxDTO2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASParcelBoxDTO parcelBoxDTO1 = OASParcelBoxDTO.getExample();
        OASParcelBoxDTO parcelBoxDTO2 = new OASParcelBoxDTO();
        OASParcelBoxDTO parcelBoxDTO3;

        System.assertEquals(false, parcelBoxDTO1.equals(parcelBoxDTO3));
        System.assertEquals(false, parcelBoxDTO2.equals(parcelBoxDTO3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASParcelBoxDTO parcelBoxDTO1 = OASParcelBoxDTO.getExample();
        OASParcelBoxDTO parcelBoxDTO2 = new OASParcelBoxDTO();

        System.assertEquals(parcelBoxDTO1.hashCode(), parcelBoxDTO1.hashCode());
        System.assertEquals(parcelBoxDTO2.hashCode(), parcelBoxDTO2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASParcelBoxDTO parcelBoxDTO1 = OASParcelBoxDTO.getExample();
        OASParcelBoxDTO parcelBoxDTO2 = OASParcelBoxDTO.getExample();
        OASParcelBoxDTO parcelBoxDTO3 = new OASParcelBoxDTO();
        OASParcelBoxDTO parcelBoxDTO4 = new OASParcelBoxDTO();

        System.assert(parcelBoxDTO1.equals(parcelBoxDTO2));
        System.assert(parcelBoxDTO3.equals(parcelBoxDTO4));
        System.assertEquals(parcelBoxDTO1.hashCode(), parcelBoxDTO2.hashCode());
        System.assertEquals(parcelBoxDTO3.hashCode(), parcelBoxDTO4.hashCode());
    }
}
