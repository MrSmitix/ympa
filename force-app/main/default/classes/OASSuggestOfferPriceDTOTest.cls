@isTest
private class OASSuggestOfferPriceDTOTest {
    @isTest
    private static void equalsSameInstance() {
        OASSuggestOfferPriceDTO suggestOfferPriceDTO1 = OASSuggestOfferPriceDTO.getExample();
        OASSuggestOfferPriceDTO suggestOfferPriceDTO2 = suggestOfferPriceDTO1;
        OASSuggestOfferPriceDTO suggestOfferPriceDTO3 = new OASSuggestOfferPriceDTO();
        OASSuggestOfferPriceDTO suggestOfferPriceDTO4 = suggestOfferPriceDTO3;

        System.assert(suggestOfferPriceDTO1.equals(suggestOfferPriceDTO2));
        System.assert(suggestOfferPriceDTO2.equals(suggestOfferPriceDTO1));
        System.assert(suggestOfferPriceDTO1.equals(suggestOfferPriceDTO1));
        System.assert(suggestOfferPriceDTO3.equals(suggestOfferPriceDTO4));
        System.assert(suggestOfferPriceDTO4.equals(suggestOfferPriceDTO3));
        System.assert(suggestOfferPriceDTO3.equals(suggestOfferPriceDTO3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASSuggestOfferPriceDTO suggestOfferPriceDTO1 = OASSuggestOfferPriceDTO.getExample();
        OASSuggestOfferPriceDTO suggestOfferPriceDTO2 = OASSuggestOfferPriceDTO.getExample();
        OASSuggestOfferPriceDTO suggestOfferPriceDTO3 = new OASSuggestOfferPriceDTO();
        OASSuggestOfferPriceDTO suggestOfferPriceDTO4 = new OASSuggestOfferPriceDTO();

        System.assert(suggestOfferPriceDTO1.equals(suggestOfferPriceDTO2));
        System.assert(suggestOfferPriceDTO2.equals(suggestOfferPriceDTO1));
        System.assert(suggestOfferPriceDTO3.equals(suggestOfferPriceDTO4));
        System.assert(suggestOfferPriceDTO4.equals(suggestOfferPriceDTO3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASSuggestOfferPriceDTO suggestOfferPriceDTO1 = OASSuggestOfferPriceDTO.getExample();
        OASSuggestOfferPriceDTO suggestOfferPriceDTO2 = new OASSuggestOfferPriceDTO();

        System.assertEquals(false, suggestOfferPriceDTO1.equals('foo'));
        System.assertEquals(false, suggestOfferPriceDTO2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASSuggestOfferPriceDTO suggestOfferPriceDTO1 = OASSuggestOfferPriceDTO.getExample();
        OASSuggestOfferPriceDTO suggestOfferPriceDTO2 = new OASSuggestOfferPriceDTO();
        OASSuggestOfferPriceDTO suggestOfferPriceDTO3;

        System.assertEquals(false, suggestOfferPriceDTO1.equals(suggestOfferPriceDTO3));
        System.assertEquals(false, suggestOfferPriceDTO2.equals(suggestOfferPriceDTO3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASSuggestOfferPriceDTO suggestOfferPriceDTO1 = OASSuggestOfferPriceDTO.getExample();
        OASSuggestOfferPriceDTO suggestOfferPriceDTO2 = new OASSuggestOfferPriceDTO();

        System.assertEquals(suggestOfferPriceDTO1.hashCode(), suggestOfferPriceDTO1.hashCode());
        System.assertEquals(suggestOfferPriceDTO2.hashCode(), suggestOfferPriceDTO2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASSuggestOfferPriceDTO suggestOfferPriceDTO1 = OASSuggestOfferPriceDTO.getExample();
        OASSuggestOfferPriceDTO suggestOfferPriceDTO2 = OASSuggestOfferPriceDTO.getExample();
        OASSuggestOfferPriceDTO suggestOfferPriceDTO3 = new OASSuggestOfferPriceDTO();
        OASSuggestOfferPriceDTO suggestOfferPriceDTO4 = new OASSuggestOfferPriceDTO();

        System.assert(suggestOfferPriceDTO1.equals(suggestOfferPriceDTO2));
        System.assert(suggestOfferPriceDTO3.equals(suggestOfferPriceDTO4));
        System.assertEquals(suggestOfferPriceDTO1.hashCode(), suggestOfferPriceDTO2.hashCode());
        System.assertEquals(suggestOfferPriceDTO3.hashCode(), suggestOfferPriceDTO4.hashCode());
    }
}
