@isTest
private class OASUpdateOfferContentResultDTOTest {
    @isTest
    private static void equalsSameInstance() {
        OASUpdateOfferContentResultDTO updateOfferContentResultDTO1 = OASUpdateOfferContentResultDTO.getExample();
        OASUpdateOfferContentResultDTO updateOfferContentResultDTO2 = updateOfferContentResultDTO1;
        OASUpdateOfferContentResultDTO updateOfferContentResultDTO3 = new OASUpdateOfferContentResultDTO();
        OASUpdateOfferContentResultDTO updateOfferContentResultDTO4 = updateOfferContentResultDTO3;

        System.assert(updateOfferContentResultDTO1.equals(updateOfferContentResultDTO2));
        System.assert(updateOfferContentResultDTO2.equals(updateOfferContentResultDTO1));
        System.assert(updateOfferContentResultDTO1.equals(updateOfferContentResultDTO1));
        System.assert(updateOfferContentResultDTO3.equals(updateOfferContentResultDTO4));
        System.assert(updateOfferContentResultDTO4.equals(updateOfferContentResultDTO3));
        System.assert(updateOfferContentResultDTO3.equals(updateOfferContentResultDTO3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASUpdateOfferContentResultDTO updateOfferContentResultDTO1 = OASUpdateOfferContentResultDTO.getExample();
        OASUpdateOfferContentResultDTO updateOfferContentResultDTO2 = OASUpdateOfferContentResultDTO.getExample();
        OASUpdateOfferContentResultDTO updateOfferContentResultDTO3 = new OASUpdateOfferContentResultDTO();
        OASUpdateOfferContentResultDTO updateOfferContentResultDTO4 = new OASUpdateOfferContentResultDTO();

        System.assert(updateOfferContentResultDTO1.equals(updateOfferContentResultDTO2));
        System.assert(updateOfferContentResultDTO2.equals(updateOfferContentResultDTO1));
        System.assert(updateOfferContentResultDTO3.equals(updateOfferContentResultDTO4));
        System.assert(updateOfferContentResultDTO4.equals(updateOfferContentResultDTO3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASUpdateOfferContentResultDTO updateOfferContentResultDTO1 = OASUpdateOfferContentResultDTO.getExample();
        OASUpdateOfferContentResultDTO updateOfferContentResultDTO2 = new OASUpdateOfferContentResultDTO();

        System.assertEquals(false, updateOfferContentResultDTO1.equals('foo'));
        System.assertEquals(false, updateOfferContentResultDTO2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASUpdateOfferContentResultDTO updateOfferContentResultDTO1 = OASUpdateOfferContentResultDTO.getExample();
        OASUpdateOfferContentResultDTO updateOfferContentResultDTO2 = new OASUpdateOfferContentResultDTO();
        OASUpdateOfferContentResultDTO updateOfferContentResultDTO3;

        System.assertEquals(false, updateOfferContentResultDTO1.equals(updateOfferContentResultDTO3));
        System.assertEquals(false, updateOfferContentResultDTO2.equals(updateOfferContentResultDTO3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASUpdateOfferContentResultDTO updateOfferContentResultDTO1 = OASUpdateOfferContentResultDTO.getExample();
        OASUpdateOfferContentResultDTO updateOfferContentResultDTO2 = new OASUpdateOfferContentResultDTO();

        System.assertEquals(updateOfferContentResultDTO1.hashCode(), updateOfferContentResultDTO1.hashCode());
        System.assertEquals(updateOfferContentResultDTO2.hashCode(), updateOfferContentResultDTO2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASUpdateOfferContentResultDTO updateOfferContentResultDTO1 = OASUpdateOfferContentResultDTO.getExample();
        OASUpdateOfferContentResultDTO updateOfferContentResultDTO2 = OASUpdateOfferContentResultDTO.getExample();
        OASUpdateOfferContentResultDTO updateOfferContentResultDTO3 = new OASUpdateOfferContentResultDTO();
        OASUpdateOfferContentResultDTO updateOfferContentResultDTO4 = new OASUpdateOfferContentResultDTO();

        System.assert(updateOfferContentResultDTO1.equals(updateOfferContentResultDTO2));
        System.assert(updateOfferContentResultDTO3.equals(updateOfferContentResultDTO4));
        System.assertEquals(updateOfferContentResultDTO1.hashCode(), updateOfferContentResultDTO2.hashCode());
        System.assertEquals(updateOfferContentResultDTO3.hashCode(), updateOfferContentResultDTO4.hashCode());
    }

    @isTest
    private static void defaultValuesPopulated() {
        OASUpdateOfferContentResultDTO updateOfferContentResultDTO = new OASUpdateOfferContentResultDTO();
        System.assertEquals(new List<OASOfferContentErrorDTO>(), updateOfferContentResultDTO.errors);
        System.assertEquals(new List<OASOfferContentErrorDTO>(), updateOfferContentResultDTO.warnings);
        System.assertEquals(null, updateOfferContentResultDTO.offerId);
    }
}
