@isTest
private class OASOfferMappingKindTypeTest {
    @isTest
    private static void allowableValues() {
        Set<OASOfferMappingKindType> expected = new Set<OASOfferMappingKindType>{
            OASOfferMappingKindType.ACTIVE,
            OASOfferMappingKindType.ALL
        };
        Set<OASOfferMappingKindType> actual  = new Set<OASOfferMappingKindType>(OASOfferMappingKindType.values());
        System.assertEquals(expected, actual);
    }
}
