@isTest
private class OASHiddenOfferDTOTest {
    @isTest
    private static void equalsSameInstance() {
        OASHiddenOfferDTO hiddenOfferDTO1 = OASHiddenOfferDTO.getExample();
        OASHiddenOfferDTO hiddenOfferDTO2 = hiddenOfferDTO1;
        OASHiddenOfferDTO hiddenOfferDTO3 = new OASHiddenOfferDTO();
        OASHiddenOfferDTO hiddenOfferDTO4 = hiddenOfferDTO3;

        System.assert(hiddenOfferDTO1.equals(hiddenOfferDTO2));
        System.assert(hiddenOfferDTO2.equals(hiddenOfferDTO1));
        System.assert(hiddenOfferDTO1.equals(hiddenOfferDTO1));
        System.assert(hiddenOfferDTO3.equals(hiddenOfferDTO4));
        System.assert(hiddenOfferDTO4.equals(hiddenOfferDTO3));
        System.assert(hiddenOfferDTO3.equals(hiddenOfferDTO3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASHiddenOfferDTO hiddenOfferDTO1 = OASHiddenOfferDTO.getExample();
        OASHiddenOfferDTO hiddenOfferDTO2 = OASHiddenOfferDTO.getExample();
        OASHiddenOfferDTO hiddenOfferDTO3 = new OASHiddenOfferDTO();
        OASHiddenOfferDTO hiddenOfferDTO4 = new OASHiddenOfferDTO();

        System.assert(hiddenOfferDTO1.equals(hiddenOfferDTO2));
        System.assert(hiddenOfferDTO2.equals(hiddenOfferDTO1));
        System.assert(hiddenOfferDTO3.equals(hiddenOfferDTO4));
        System.assert(hiddenOfferDTO4.equals(hiddenOfferDTO3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASHiddenOfferDTO hiddenOfferDTO1 = OASHiddenOfferDTO.getExample();
        OASHiddenOfferDTO hiddenOfferDTO2 = new OASHiddenOfferDTO();

        System.assertEquals(false, hiddenOfferDTO1.equals('foo'));
        System.assertEquals(false, hiddenOfferDTO2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASHiddenOfferDTO hiddenOfferDTO1 = OASHiddenOfferDTO.getExample();
        OASHiddenOfferDTO hiddenOfferDTO2 = new OASHiddenOfferDTO();
        OASHiddenOfferDTO hiddenOfferDTO3;

        System.assertEquals(false, hiddenOfferDTO1.equals(hiddenOfferDTO3));
        System.assertEquals(false, hiddenOfferDTO2.equals(hiddenOfferDTO3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASHiddenOfferDTO hiddenOfferDTO1 = OASHiddenOfferDTO.getExample();
        OASHiddenOfferDTO hiddenOfferDTO2 = new OASHiddenOfferDTO();

        System.assertEquals(hiddenOfferDTO1.hashCode(), hiddenOfferDTO1.hashCode());
        System.assertEquals(hiddenOfferDTO2.hashCode(), hiddenOfferDTO2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASHiddenOfferDTO hiddenOfferDTO1 = OASHiddenOfferDTO.getExample();
        OASHiddenOfferDTO hiddenOfferDTO2 = OASHiddenOfferDTO.getExample();
        OASHiddenOfferDTO hiddenOfferDTO3 = new OASHiddenOfferDTO();
        OASHiddenOfferDTO hiddenOfferDTO4 = new OASHiddenOfferDTO();

        System.assert(hiddenOfferDTO1.equals(hiddenOfferDTO2));
        System.assert(hiddenOfferDTO3.equals(hiddenOfferDTO4));
        System.assertEquals(hiddenOfferDTO1.hashCode(), hiddenOfferDTO2.hashCode());
        System.assertEquals(hiddenOfferDTO3.hashCode(), hiddenOfferDTO4.hashCode());
    }
}
