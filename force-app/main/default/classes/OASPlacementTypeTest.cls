@isTest
private class OASPlacementTypeTest {
    @isTest
    private static void allowableValues() {
        Set<OASPlacementType> expected = new Set<OASPlacementType>{
            OASPlacementType.FBS,
            OASPlacementType.FBY,
            OASPlacementType.DBS
        };
        Set<OASPlacementType> actual  = new Set<OASPlacementType>(OASPlacementType.values());
        System.assertEquals(expected, actual);
    }
}
