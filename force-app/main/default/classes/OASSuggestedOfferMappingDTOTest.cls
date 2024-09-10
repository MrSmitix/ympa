@isTest
private class OASSuggestedOfferMappingDTOTest {
    @isTest
    private static void equalsSameInstance() {
        OASSuggestedOfferMappingDTO suggestedOfferMappingDTO1 = OASSuggestedOfferMappingDTO.getExample();
        OASSuggestedOfferMappingDTO suggestedOfferMappingDTO2 = suggestedOfferMappingDTO1;
        OASSuggestedOfferMappingDTO suggestedOfferMappingDTO3 = new OASSuggestedOfferMappingDTO();
        OASSuggestedOfferMappingDTO suggestedOfferMappingDTO4 = suggestedOfferMappingDTO3;

        System.assert(suggestedOfferMappingDTO1.equals(suggestedOfferMappingDTO2));
        System.assert(suggestedOfferMappingDTO2.equals(suggestedOfferMappingDTO1));
        System.assert(suggestedOfferMappingDTO1.equals(suggestedOfferMappingDTO1));
        System.assert(suggestedOfferMappingDTO3.equals(suggestedOfferMappingDTO4));
        System.assert(suggestedOfferMappingDTO4.equals(suggestedOfferMappingDTO3));
        System.assert(suggestedOfferMappingDTO3.equals(suggestedOfferMappingDTO3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASSuggestedOfferMappingDTO suggestedOfferMappingDTO1 = OASSuggestedOfferMappingDTO.getExample();
        OASSuggestedOfferMappingDTO suggestedOfferMappingDTO2 = OASSuggestedOfferMappingDTO.getExample();
        OASSuggestedOfferMappingDTO suggestedOfferMappingDTO3 = new OASSuggestedOfferMappingDTO();
        OASSuggestedOfferMappingDTO suggestedOfferMappingDTO4 = new OASSuggestedOfferMappingDTO();

        System.assert(suggestedOfferMappingDTO1.equals(suggestedOfferMappingDTO2));
        System.assert(suggestedOfferMappingDTO2.equals(suggestedOfferMappingDTO1));
        System.assert(suggestedOfferMappingDTO3.equals(suggestedOfferMappingDTO4));
        System.assert(suggestedOfferMappingDTO4.equals(suggestedOfferMappingDTO3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASSuggestedOfferMappingDTO suggestedOfferMappingDTO1 = OASSuggestedOfferMappingDTO.getExample();
        OASSuggestedOfferMappingDTO suggestedOfferMappingDTO2 = new OASSuggestedOfferMappingDTO();

        System.assertEquals(false, suggestedOfferMappingDTO1.equals('foo'));
        System.assertEquals(false, suggestedOfferMappingDTO2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASSuggestedOfferMappingDTO suggestedOfferMappingDTO1 = OASSuggestedOfferMappingDTO.getExample();
        OASSuggestedOfferMappingDTO suggestedOfferMappingDTO2 = new OASSuggestedOfferMappingDTO();
        OASSuggestedOfferMappingDTO suggestedOfferMappingDTO3;

        System.assertEquals(false, suggestedOfferMappingDTO1.equals(suggestedOfferMappingDTO3));
        System.assertEquals(false, suggestedOfferMappingDTO2.equals(suggestedOfferMappingDTO3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASSuggestedOfferMappingDTO suggestedOfferMappingDTO1 = OASSuggestedOfferMappingDTO.getExample();
        OASSuggestedOfferMappingDTO suggestedOfferMappingDTO2 = new OASSuggestedOfferMappingDTO();

        System.assertEquals(suggestedOfferMappingDTO1.hashCode(), suggestedOfferMappingDTO1.hashCode());
        System.assertEquals(suggestedOfferMappingDTO2.hashCode(), suggestedOfferMappingDTO2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASSuggestedOfferMappingDTO suggestedOfferMappingDTO1 = OASSuggestedOfferMappingDTO.getExample();
        OASSuggestedOfferMappingDTO suggestedOfferMappingDTO2 = OASSuggestedOfferMappingDTO.getExample();
        OASSuggestedOfferMappingDTO suggestedOfferMappingDTO3 = new OASSuggestedOfferMappingDTO();
        OASSuggestedOfferMappingDTO suggestedOfferMappingDTO4 = new OASSuggestedOfferMappingDTO();

        System.assert(suggestedOfferMappingDTO1.equals(suggestedOfferMappingDTO2));
        System.assert(suggestedOfferMappingDTO3.equals(suggestedOfferMappingDTO4));
        System.assertEquals(suggestedOfferMappingDTO1.hashCode(), suggestedOfferMappingDTO2.hashCode());
        System.assertEquals(suggestedOfferMappingDTO3.hashCode(), suggestedOfferMappingDTO4.hashCode());
    }
}
