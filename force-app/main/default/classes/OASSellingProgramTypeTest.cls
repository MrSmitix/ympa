@isTest
private class OASSellingProgramTypeTest {
    @isTest
    private static void allowableValues() {
        Set<OASSellingProgramType> expected = new Set<OASSellingProgramType>{
            OASSellingProgramType.FBY,
            OASSellingProgramType.FBS,
            OASSellingProgramType.DBS,
            OASSellingProgramType.EXPRESS
        };
        Set<OASSellingProgramType> actual  = new Set<OASSellingProgramType>(OASSellingProgramType.values());
        System.assertEquals(expected, actual);
    }
}
