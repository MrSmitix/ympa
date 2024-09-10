@isTest
private class OASParcelDTOTest {
    @isTest
    private static void equalsSameInstance() {
        OASParcelDTO parcelDTO1 = OASParcelDTO.getExample();
        OASParcelDTO parcelDTO2 = parcelDTO1;
        OASParcelDTO parcelDTO3 = new OASParcelDTO();
        OASParcelDTO parcelDTO4 = parcelDTO3;

        System.assert(parcelDTO1.equals(parcelDTO2));
        System.assert(parcelDTO2.equals(parcelDTO1));
        System.assert(parcelDTO1.equals(parcelDTO1));
        System.assert(parcelDTO3.equals(parcelDTO4));
        System.assert(parcelDTO4.equals(parcelDTO3));
        System.assert(parcelDTO3.equals(parcelDTO3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASParcelDTO parcelDTO1 = OASParcelDTO.getExample();
        OASParcelDTO parcelDTO2 = OASParcelDTO.getExample();
        OASParcelDTO parcelDTO3 = new OASParcelDTO();
        OASParcelDTO parcelDTO4 = new OASParcelDTO();

        System.assert(parcelDTO1.equals(parcelDTO2));
        System.assert(parcelDTO2.equals(parcelDTO1));
        System.assert(parcelDTO3.equals(parcelDTO4));
        System.assert(parcelDTO4.equals(parcelDTO3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASParcelDTO parcelDTO1 = OASParcelDTO.getExample();
        OASParcelDTO parcelDTO2 = new OASParcelDTO();

        System.assertEquals(false, parcelDTO1.equals('foo'));
        System.assertEquals(false, parcelDTO2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASParcelDTO parcelDTO1 = OASParcelDTO.getExample();
        OASParcelDTO parcelDTO2 = new OASParcelDTO();
        OASParcelDTO parcelDTO3;

        System.assertEquals(false, parcelDTO1.equals(parcelDTO3));
        System.assertEquals(false, parcelDTO2.equals(parcelDTO3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASParcelDTO parcelDTO1 = OASParcelDTO.getExample();
        OASParcelDTO parcelDTO2 = new OASParcelDTO();

        System.assertEquals(parcelDTO1.hashCode(), parcelDTO1.hashCode());
        System.assertEquals(parcelDTO2.hashCode(), parcelDTO2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASParcelDTO parcelDTO1 = OASParcelDTO.getExample();
        OASParcelDTO parcelDTO2 = OASParcelDTO.getExample();
        OASParcelDTO parcelDTO3 = new OASParcelDTO();
        OASParcelDTO parcelDTO4 = new OASParcelDTO();

        System.assert(parcelDTO1.equals(parcelDTO2));
        System.assert(parcelDTO3.equals(parcelDTO4));
        System.assertEquals(parcelDTO1.hashCode(), parcelDTO2.hashCode());
        System.assertEquals(parcelDTO3.hashCode(), parcelDTO4.hashCode());
    }

    @isTest
    private static void defaultValuesPopulated() {
        OASParcelDTO parcelDTO = new OASParcelDTO();
        System.assertEquals(new List<OASParcelBoxDTO>(), parcelDTO.boxes);
    }
}
