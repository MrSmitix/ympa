@isTest
private class OASParcelBoxLabelDTOTest {
    @isTest
    private static void equalsSameInstance() {
        OASParcelBoxLabelDTO parcelBoxLabelDTO1 = OASParcelBoxLabelDTO.getExample();
        OASParcelBoxLabelDTO parcelBoxLabelDTO2 = parcelBoxLabelDTO1;
        OASParcelBoxLabelDTO parcelBoxLabelDTO3 = new OASParcelBoxLabelDTO();
        OASParcelBoxLabelDTO parcelBoxLabelDTO4 = parcelBoxLabelDTO3;

        System.assert(parcelBoxLabelDTO1.equals(parcelBoxLabelDTO2));
        System.assert(parcelBoxLabelDTO2.equals(parcelBoxLabelDTO1));
        System.assert(parcelBoxLabelDTO1.equals(parcelBoxLabelDTO1));
        System.assert(parcelBoxLabelDTO3.equals(parcelBoxLabelDTO4));
        System.assert(parcelBoxLabelDTO4.equals(parcelBoxLabelDTO3));
        System.assert(parcelBoxLabelDTO3.equals(parcelBoxLabelDTO3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASParcelBoxLabelDTO parcelBoxLabelDTO1 = OASParcelBoxLabelDTO.getExample();
        OASParcelBoxLabelDTO parcelBoxLabelDTO2 = OASParcelBoxLabelDTO.getExample();
        OASParcelBoxLabelDTO parcelBoxLabelDTO3 = new OASParcelBoxLabelDTO();
        OASParcelBoxLabelDTO parcelBoxLabelDTO4 = new OASParcelBoxLabelDTO();

        System.assert(parcelBoxLabelDTO1.equals(parcelBoxLabelDTO2));
        System.assert(parcelBoxLabelDTO2.equals(parcelBoxLabelDTO1));
        System.assert(parcelBoxLabelDTO3.equals(parcelBoxLabelDTO4));
        System.assert(parcelBoxLabelDTO4.equals(parcelBoxLabelDTO3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASParcelBoxLabelDTO parcelBoxLabelDTO1 = OASParcelBoxLabelDTO.getExample();
        OASParcelBoxLabelDTO parcelBoxLabelDTO2 = new OASParcelBoxLabelDTO();

        System.assertEquals(false, parcelBoxLabelDTO1.equals('foo'));
        System.assertEquals(false, parcelBoxLabelDTO2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASParcelBoxLabelDTO parcelBoxLabelDTO1 = OASParcelBoxLabelDTO.getExample();
        OASParcelBoxLabelDTO parcelBoxLabelDTO2 = new OASParcelBoxLabelDTO();
        OASParcelBoxLabelDTO parcelBoxLabelDTO3;

        System.assertEquals(false, parcelBoxLabelDTO1.equals(parcelBoxLabelDTO3));
        System.assertEquals(false, parcelBoxLabelDTO2.equals(parcelBoxLabelDTO3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASParcelBoxLabelDTO parcelBoxLabelDTO1 = OASParcelBoxLabelDTO.getExample();
        OASParcelBoxLabelDTO parcelBoxLabelDTO2 = new OASParcelBoxLabelDTO();

        System.assertEquals(parcelBoxLabelDTO1.hashCode(), parcelBoxLabelDTO1.hashCode());
        System.assertEquals(parcelBoxLabelDTO2.hashCode(), parcelBoxLabelDTO2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASParcelBoxLabelDTO parcelBoxLabelDTO1 = OASParcelBoxLabelDTO.getExample();
        OASParcelBoxLabelDTO parcelBoxLabelDTO2 = OASParcelBoxLabelDTO.getExample();
        OASParcelBoxLabelDTO parcelBoxLabelDTO3 = new OASParcelBoxLabelDTO();
        OASParcelBoxLabelDTO parcelBoxLabelDTO4 = new OASParcelBoxLabelDTO();

        System.assert(parcelBoxLabelDTO1.equals(parcelBoxLabelDTO2));
        System.assert(parcelBoxLabelDTO3.equals(parcelBoxLabelDTO4));
        System.assertEquals(parcelBoxLabelDTO1.hashCode(), parcelBoxLabelDTO2.hashCode());
        System.assertEquals(parcelBoxLabelDTO3.hashCode(), parcelBoxLabelDTO4.hashCode());
    }
}
