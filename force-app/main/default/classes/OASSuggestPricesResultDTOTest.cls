@isTest
private class OASSuggestPricesResultDTOTest {
    @isTest
    private static void equalsSameInstance() {
        OASSuggestPricesResultDTO suggestPricesResultDTO1 = OASSuggestPricesResultDTO.getExample();
        OASSuggestPricesResultDTO suggestPricesResultDTO2 = suggestPricesResultDTO1;
        OASSuggestPricesResultDTO suggestPricesResultDTO3 = new OASSuggestPricesResultDTO();
        OASSuggestPricesResultDTO suggestPricesResultDTO4 = suggestPricesResultDTO3;

        System.assert(suggestPricesResultDTO1.equals(suggestPricesResultDTO2));
        System.assert(suggestPricesResultDTO2.equals(suggestPricesResultDTO1));
        System.assert(suggestPricesResultDTO1.equals(suggestPricesResultDTO1));
        System.assert(suggestPricesResultDTO3.equals(suggestPricesResultDTO4));
        System.assert(suggestPricesResultDTO4.equals(suggestPricesResultDTO3));
        System.assert(suggestPricesResultDTO3.equals(suggestPricesResultDTO3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASSuggestPricesResultDTO suggestPricesResultDTO1 = OASSuggestPricesResultDTO.getExample();
        OASSuggestPricesResultDTO suggestPricesResultDTO2 = OASSuggestPricesResultDTO.getExample();
        OASSuggestPricesResultDTO suggestPricesResultDTO3 = new OASSuggestPricesResultDTO();
        OASSuggestPricesResultDTO suggestPricesResultDTO4 = new OASSuggestPricesResultDTO();

        System.assert(suggestPricesResultDTO1.equals(suggestPricesResultDTO2));
        System.assert(suggestPricesResultDTO2.equals(suggestPricesResultDTO1));
        System.assert(suggestPricesResultDTO3.equals(suggestPricesResultDTO4));
        System.assert(suggestPricesResultDTO4.equals(suggestPricesResultDTO3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASSuggestPricesResultDTO suggestPricesResultDTO1 = OASSuggestPricesResultDTO.getExample();
        OASSuggestPricesResultDTO suggestPricesResultDTO2 = new OASSuggestPricesResultDTO();

        System.assertEquals(false, suggestPricesResultDTO1.equals('foo'));
        System.assertEquals(false, suggestPricesResultDTO2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASSuggestPricesResultDTO suggestPricesResultDTO1 = OASSuggestPricesResultDTO.getExample();
        OASSuggestPricesResultDTO suggestPricesResultDTO2 = new OASSuggestPricesResultDTO();
        OASSuggestPricesResultDTO suggestPricesResultDTO3;

        System.assertEquals(false, suggestPricesResultDTO1.equals(suggestPricesResultDTO3));
        System.assertEquals(false, suggestPricesResultDTO2.equals(suggestPricesResultDTO3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASSuggestPricesResultDTO suggestPricesResultDTO1 = OASSuggestPricesResultDTO.getExample();
        OASSuggestPricesResultDTO suggestPricesResultDTO2 = new OASSuggestPricesResultDTO();

        System.assertEquals(suggestPricesResultDTO1.hashCode(), suggestPricesResultDTO1.hashCode());
        System.assertEquals(suggestPricesResultDTO2.hashCode(), suggestPricesResultDTO2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASSuggestPricesResultDTO suggestPricesResultDTO1 = OASSuggestPricesResultDTO.getExample();
        OASSuggestPricesResultDTO suggestPricesResultDTO2 = OASSuggestPricesResultDTO.getExample();
        OASSuggestPricesResultDTO suggestPricesResultDTO3 = new OASSuggestPricesResultDTO();
        OASSuggestPricesResultDTO suggestPricesResultDTO4 = new OASSuggestPricesResultDTO();

        System.assert(suggestPricesResultDTO1.equals(suggestPricesResultDTO2));
        System.assert(suggestPricesResultDTO3.equals(suggestPricesResultDTO4));
        System.assertEquals(suggestPricesResultDTO1.hashCode(), suggestPricesResultDTO2.hashCode());
        System.assertEquals(suggestPricesResultDTO3.hashCode(), suggestPricesResultDTO4.hashCode());
    }

    @isTest
    private static void defaultValuesPopulated() {
        OASSuggestPricesResultDTO suggestPricesResultDTO = new OASSuggestPricesResultDTO();
        System.assertEquals(new List<OASPriceSuggestOfferDTO>(), suggestPricesResultDTO.offers);
    }
}
