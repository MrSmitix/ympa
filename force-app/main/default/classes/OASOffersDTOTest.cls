@isTest
private class OASOffersDTOTest {
    @isTest
    private static void equalsSameInstance() {
        OASOffersDTO offersDTO1 = OASOffersDTO.getExample();
        OASOffersDTO offersDTO2 = offersDTO1;
        OASOffersDTO offersDTO3 = new OASOffersDTO();
        OASOffersDTO offersDTO4 = offersDTO3;

        System.assert(offersDTO1.equals(offersDTO2));
        System.assert(offersDTO2.equals(offersDTO1));
        System.assert(offersDTO1.equals(offersDTO1));
        System.assert(offersDTO3.equals(offersDTO4));
        System.assert(offersDTO4.equals(offersDTO3));
        System.assert(offersDTO3.equals(offersDTO3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASOffersDTO offersDTO1 = OASOffersDTO.getExample();
        OASOffersDTO offersDTO2 = OASOffersDTO.getExample();
        OASOffersDTO offersDTO3 = new OASOffersDTO();
        OASOffersDTO offersDTO4 = new OASOffersDTO();

        System.assert(offersDTO1.equals(offersDTO2));
        System.assert(offersDTO2.equals(offersDTO1));
        System.assert(offersDTO3.equals(offersDTO4));
        System.assert(offersDTO4.equals(offersDTO3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASOffersDTO offersDTO1 = OASOffersDTO.getExample();
        OASOffersDTO offersDTO2 = new OASOffersDTO();

        System.assertEquals(false, offersDTO1.equals('foo'));
        System.assertEquals(false, offersDTO2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASOffersDTO offersDTO1 = OASOffersDTO.getExample();
        OASOffersDTO offersDTO2 = new OASOffersDTO();
        OASOffersDTO offersDTO3;

        System.assertEquals(false, offersDTO1.equals(offersDTO3));
        System.assertEquals(false, offersDTO2.equals(offersDTO3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASOffersDTO offersDTO1 = OASOffersDTO.getExample();
        OASOffersDTO offersDTO2 = new OASOffersDTO();

        System.assertEquals(offersDTO1.hashCode(), offersDTO1.hashCode());
        System.assertEquals(offersDTO2.hashCode(), offersDTO2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASOffersDTO offersDTO1 = OASOffersDTO.getExample();
        OASOffersDTO offersDTO2 = OASOffersDTO.getExample();
        OASOffersDTO offersDTO3 = new OASOffersDTO();
        OASOffersDTO offersDTO4 = new OASOffersDTO();

        System.assert(offersDTO1.equals(offersDTO2));
        System.assert(offersDTO3.equals(offersDTO4));
        System.assertEquals(offersDTO1.hashCode(), offersDTO2.hashCode());
        System.assertEquals(offersDTO3.hashCode(), offersDTO4.hashCode());
    }

    @isTest
    private static void defaultValuesPopulated() {
        OASOffersDTO offersDTO = new OASOffersDTO();
        System.assertEquals(new List<OASOfferDTO>(), offersDTO.offers);
    }
}
