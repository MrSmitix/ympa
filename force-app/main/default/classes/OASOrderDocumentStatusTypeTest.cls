@isTest
private class OASOrderDocumentStatusTypeTest {
    @isTest
    private static void allowableValues() {
        Set<OASOrderDocumentStatusType> expected = new Set<OASOrderDocumentStatusType>{
            OASOrderDocumentStatusType.READY,
            OASOrderDocumentStatusType.NOT_READY
        };
        Set<OASOrderDocumentStatusType> actual  = new Set<OASOrderDocumentStatusType>(OASOrderDocumentStatusType.values());
        System.assertEquals(expected, actual);
    }
}
