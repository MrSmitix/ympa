@isTest
private class OASPriceQuarantineVerdictParamNameTyTest {
    @isTest
    private static void allowableValues() {
        Set<OASPriceQuarantineVerdictParamNameTy> expected = new Set<OASPriceQuarantineVerdictParamNameTy>{
            OASPriceQuarantineVerdictParamNameTy.CURRENT_PRICE,
            OASPriceQuarantineVerdictParamNameTy.LAST_VALID_PRICE,
            OASPriceQuarantineVerdictParamNameTy.MIN_PRICE,
            OASPriceQuarantineVerdictParamNameTy.CURRENCY
        };
        Set<OASPriceQuarantineVerdictParamNameTy> actual  = new Set<OASPriceQuarantineVerdictParamNameTy>(OASPriceQuarantineVerdictParamNameTy.values());
        System.assertEquals(expected, actual);
    }
}
