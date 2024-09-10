@isTest
private class OASFieldStateTypeTest {
    @isTest
    private static void allowableValues() {
        Set<OASFieldStateType> expected = new Set<OASFieldStateType>{
            OASFieldStateType.SPECIFIED,
            OASFieldStateType.EMPTY
        };
        Set<OASFieldStateType> actual  = new Set<OASFieldStateType>(OASFieldStateType.values());
        System.assertEquals(expected, actual);
    }
}
