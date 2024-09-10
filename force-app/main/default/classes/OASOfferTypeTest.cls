@isTest
private class OASOfferTypeTest {
    @isTest
    private static void allowableValues() {
        Set<OASOfferType> expected = new Set<OASOfferType>{
            OASOfferType.DEFAULT,
            OASOfferType.MEDICINE,
            OASOfferType.BOOK,
            OASOfferType.AUDIOBOOK,
            OASOfferType.ARTIST_TITLE,
            OASOfferType.ON_DEMAND
        };
        Set<OASOfferType> actual  = new Set<OASOfferType>(OASOfferType.values());
        System.assertEquals(expected, actual);
    }
}
