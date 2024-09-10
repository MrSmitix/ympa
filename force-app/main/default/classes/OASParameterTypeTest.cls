@isTest
private class OASParameterTypeTest {
    @isTest
    private static void allowableValues() {
        Set<OASParameterType> expected = new Set<OASParameterType>{
            OASParameterType.TEXT,
            OASParameterType.ENUM,
            OASParameterType.BOOLEAN,
            OASParameterType.NUMERIC
        };
        Set<OASParameterType> actual  = new Set<OASParameterType>(OASParameterType.values());
        System.assertEquals(expected, actual);
    }
}
