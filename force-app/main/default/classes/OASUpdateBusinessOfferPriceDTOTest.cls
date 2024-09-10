@isTest
private class OASUpdateBusinessOfferPriceDTOTest {
    @isTest
    private static void equalsSameInstance() {
        OASUpdateBusinessOfferPriceDTO updateBusinessOfferPriceDTO1 = OASUpdateBusinessOfferPriceDTO.getExample();
        OASUpdateBusinessOfferPriceDTO updateBusinessOfferPriceDTO2 = updateBusinessOfferPriceDTO1;
        OASUpdateBusinessOfferPriceDTO updateBusinessOfferPriceDTO3 = new OASUpdateBusinessOfferPriceDTO();
        OASUpdateBusinessOfferPriceDTO updateBusinessOfferPriceDTO4 = updateBusinessOfferPriceDTO3;

        System.assert(updateBusinessOfferPriceDTO1.equals(updateBusinessOfferPriceDTO2));
        System.assert(updateBusinessOfferPriceDTO2.equals(updateBusinessOfferPriceDTO1));
        System.assert(updateBusinessOfferPriceDTO1.equals(updateBusinessOfferPriceDTO1));
        System.assert(updateBusinessOfferPriceDTO3.equals(updateBusinessOfferPriceDTO4));
        System.assert(updateBusinessOfferPriceDTO4.equals(updateBusinessOfferPriceDTO3));
        System.assert(updateBusinessOfferPriceDTO3.equals(updateBusinessOfferPriceDTO3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASUpdateBusinessOfferPriceDTO updateBusinessOfferPriceDTO1 = OASUpdateBusinessOfferPriceDTO.getExample();
        OASUpdateBusinessOfferPriceDTO updateBusinessOfferPriceDTO2 = OASUpdateBusinessOfferPriceDTO.getExample();
        OASUpdateBusinessOfferPriceDTO updateBusinessOfferPriceDTO3 = new OASUpdateBusinessOfferPriceDTO();
        OASUpdateBusinessOfferPriceDTO updateBusinessOfferPriceDTO4 = new OASUpdateBusinessOfferPriceDTO();

        System.assert(updateBusinessOfferPriceDTO1.equals(updateBusinessOfferPriceDTO2));
        System.assert(updateBusinessOfferPriceDTO2.equals(updateBusinessOfferPriceDTO1));
        System.assert(updateBusinessOfferPriceDTO3.equals(updateBusinessOfferPriceDTO4));
        System.assert(updateBusinessOfferPriceDTO4.equals(updateBusinessOfferPriceDTO3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASUpdateBusinessOfferPriceDTO updateBusinessOfferPriceDTO1 = OASUpdateBusinessOfferPriceDTO.getExample();
        OASUpdateBusinessOfferPriceDTO updateBusinessOfferPriceDTO2 = new OASUpdateBusinessOfferPriceDTO();

        System.assertEquals(false, updateBusinessOfferPriceDTO1.equals('foo'));
        System.assertEquals(false, updateBusinessOfferPriceDTO2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASUpdateBusinessOfferPriceDTO updateBusinessOfferPriceDTO1 = OASUpdateBusinessOfferPriceDTO.getExample();
        OASUpdateBusinessOfferPriceDTO updateBusinessOfferPriceDTO2 = new OASUpdateBusinessOfferPriceDTO();
        OASUpdateBusinessOfferPriceDTO updateBusinessOfferPriceDTO3;

        System.assertEquals(false, updateBusinessOfferPriceDTO1.equals(updateBusinessOfferPriceDTO3));
        System.assertEquals(false, updateBusinessOfferPriceDTO2.equals(updateBusinessOfferPriceDTO3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASUpdateBusinessOfferPriceDTO updateBusinessOfferPriceDTO1 = OASUpdateBusinessOfferPriceDTO.getExample();
        OASUpdateBusinessOfferPriceDTO updateBusinessOfferPriceDTO2 = new OASUpdateBusinessOfferPriceDTO();

        System.assertEquals(updateBusinessOfferPriceDTO1.hashCode(), updateBusinessOfferPriceDTO1.hashCode());
        System.assertEquals(updateBusinessOfferPriceDTO2.hashCode(), updateBusinessOfferPriceDTO2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASUpdateBusinessOfferPriceDTO updateBusinessOfferPriceDTO1 = OASUpdateBusinessOfferPriceDTO.getExample();
        OASUpdateBusinessOfferPriceDTO updateBusinessOfferPriceDTO2 = OASUpdateBusinessOfferPriceDTO.getExample();
        OASUpdateBusinessOfferPriceDTO updateBusinessOfferPriceDTO3 = new OASUpdateBusinessOfferPriceDTO();
        OASUpdateBusinessOfferPriceDTO updateBusinessOfferPriceDTO4 = new OASUpdateBusinessOfferPriceDTO();

        System.assert(updateBusinessOfferPriceDTO1.equals(updateBusinessOfferPriceDTO2));
        System.assert(updateBusinessOfferPriceDTO3.equals(updateBusinessOfferPriceDTO4));
        System.assertEquals(updateBusinessOfferPriceDTO1.hashCode(), updateBusinessOfferPriceDTO2.hashCode());
        System.assertEquals(updateBusinessOfferPriceDTO3.hashCode(), updateBusinessOfferPriceDTO4.hashCode());
    }
}
