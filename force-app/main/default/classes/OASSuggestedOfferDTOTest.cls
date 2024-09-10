@isTest
private class OASSuggestedOfferDTOTest {
    @isTest
    private static void equalsSameInstance() {
        OASSuggestedOfferDTO suggestedOfferDTO1 = OASSuggestedOfferDTO.getExample();
        OASSuggestedOfferDTO suggestedOfferDTO2 = suggestedOfferDTO1;
        OASSuggestedOfferDTO suggestedOfferDTO3 = new OASSuggestedOfferDTO();
        OASSuggestedOfferDTO suggestedOfferDTO4 = suggestedOfferDTO3;

        System.assert(suggestedOfferDTO1.equals(suggestedOfferDTO2));
        System.assert(suggestedOfferDTO2.equals(suggestedOfferDTO1));
        System.assert(suggestedOfferDTO1.equals(suggestedOfferDTO1));
        System.assert(suggestedOfferDTO3.equals(suggestedOfferDTO4));
        System.assert(suggestedOfferDTO4.equals(suggestedOfferDTO3));
        System.assert(suggestedOfferDTO3.equals(suggestedOfferDTO3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASSuggestedOfferDTO suggestedOfferDTO1 = OASSuggestedOfferDTO.getExample();
        OASSuggestedOfferDTO suggestedOfferDTO2 = OASSuggestedOfferDTO.getExample();
        OASSuggestedOfferDTO suggestedOfferDTO3 = new OASSuggestedOfferDTO();
        OASSuggestedOfferDTO suggestedOfferDTO4 = new OASSuggestedOfferDTO();

        System.assert(suggestedOfferDTO1.equals(suggestedOfferDTO2));
        System.assert(suggestedOfferDTO2.equals(suggestedOfferDTO1));
        System.assert(suggestedOfferDTO3.equals(suggestedOfferDTO4));
        System.assert(suggestedOfferDTO4.equals(suggestedOfferDTO3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASSuggestedOfferDTO suggestedOfferDTO1 = OASSuggestedOfferDTO.getExample();
        OASSuggestedOfferDTO suggestedOfferDTO2 = new OASSuggestedOfferDTO();

        System.assertEquals(false, suggestedOfferDTO1.equals('foo'));
        System.assertEquals(false, suggestedOfferDTO2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASSuggestedOfferDTO suggestedOfferDTO1 = OASSuggestedOfferDTO.getExample();
        OASSuggestedOfferDTO suggestedOfferDTO2 = new OASSuggestedOfferDTO();
        OASSuggestedOfferDTO suggestedOfferDTO3;

        System.assertEquals(false, suggestedOfferDTO1.equals(suggestedOfferDTO3));
        System.assertEquals(false, suggestedOfferDTO2.equals(suggestedOfferDTO3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASSuggestedOfferDTO suggestedOfferDTO1 = OASSuggestedOfferDTO.getExample();
        OASSuggestedOfferDTO suggestedOfferDTO2 = new OASSuggestedOfferDTO();

        System.assertEquals(suggestedOfferDTO1.hashCode(), suggestedOfferDTO1.hashCode());
        System.assertEquals(suggestedOfferDTO2.hashCode(), suggestedOfferDTO2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASSuggestedOfferDTO suggestedOfferDTO1 = OASSuggestedOfferDTO.getExample();
        OASSuggestedOfferDTO suggestedOfferDTO2 = OASSuggestedOfferDTO.getExample();
        OASSuggestedOfferDTO suggestedOfferDTO3 = new OASSuggestedOfferDTO();
        OASSuggestedOfferDTO suggestedOfferDTO4 = new OASSuggestedOfferDTO();

        System.assert(suggestedOfferDTO1.equals(suggestedOfferDTO2));
        System.assert(suggestedOfferDTO3.equals(suggestedOfferDTO4));
        System.assertEquals(suggestedOfferDTO1.hashCode(), suggestedOfferDTO2.hashCode());
        System.assertEquals(suggestedOfferDTO3.hashCode(), suggestedOfferDTO4.hashCode());
    }

    @isTest
    private static void defaultValuesPopulated() {
        OASSuggestedOfferDTO suggestedOfferDTO = new OASSuggestedOfferDTO();
        System.assertEquals(new List<String>(), suggestedOfferDTO.barcodes);
        System.assertEquals(null, suggestedOfferDTO.offerId);
        System.assertEquals(null, suggestedOfferDTO.name);
        System.assertEquals(null, suggestedOfferDTO.category);
        System.assertEquals(null, suggestedOfferDTO.vendor);
        System.assertEquals(null, suggestedOfferDTO.description);
        System.assertEquals(null, suggestedOfferDTO.vendorCode);
        System.assertEquals(null, suggestedOfferDTO.basicPrice);
    }
}
