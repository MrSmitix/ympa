@isTest
private class OASGetBidsRecommendationsResponseDTOTest {
    @isTest
    private static void equalsSameInstance() {
        OASGetBidsRecommendationsResponseDTO getBidsRecommendationsResponseDTO1 = OASGetBidsRecommendationsResponseDTO.getExample();
        OASGetBidsRecommendationsResponseDTO getBidsRecommendationsResponseDTO2 = getBidsRecommendationsResponseDTO1;
        OASGetBidsRecommendationsResponseDTO getBidsRecommendationsResponseDTO3 = new OASGetBidsRecommendationsResponseDTO();
        OASGetBidsRecommendationsResponseDTO getBidsRecommendationsResponseDTO4 = getBidsRecommendationsResponseDTO3;

        System.assert(getBidsRecommendationsResponseDTO1.equals(getBidsRecommendationsResponseDTO2));
        System.assert(getBidsRecommendationsResponseDTO2.equals(getBidsRecommendationsResponseDTO1));
        System.assert(getBidsRecommendationsResponseDTO1.equals(getBidsRecommendationsResponseDTO1));
        System.assert(getBidsRecommendationsResponseDTO3.equals(getBidsRecommendationsResponseDTO4));
        System.assert(getBidsRecommendationsResponseDTO4.equals(getBidsRecommendationsResponseDTO3));
        System.assert(getBidsRecommendationsResponseDTO3.equals(getBidsRecommendationsResponseDTO3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASGetBidsRecommendationsResponseDTO getBidsRecommendationsResponseDTO1 = OASGetBidsRecommendationsResponseDTO.getExample();
        OASGetBidsRecommendationsResponseDTO getBidsRecommendationsResponseDTO2 = OASGetBidsRecommendationsResponseDTO.getExample();
        OASGetBidsRecommendationsResponseDTO getBidsRecommendationsResponseDTO3 = new OASGetBidsRecommendationsResponseDTO();
        OASGetBidsRecommendationsResponseDTO getBidsRecommendationsResponseDTO4 = new OASGetBidsRecommendationsResponseDTO();

        System.assert(getBidsRecommendationsResponseDTO1.equals(getBidsRecommendationsResponseDTO2));
        System.assert(getBidsRecommendationsResponseDTO2.equals(getBidsRecommendationsResponseDTO1));
        System.assert(getBidsRecommendationsResponseDTO3.equals(getBidsRecommendationsResponseDTO4));
        System.assert(getBidsRecommendationsResponseDTO4.equals(getBidsRecommendationsResponseDTO3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASGetBidsRecommendationsResponseDTO getBidsRecommendationsResponseDTO1 = OASGetBidsRecommendationsResponseDTO.getExample();
        OASGetBidsRecommendationsResponseDTO getBidsRecommendationsResponseDTO2 = new OASGetBidsRecommendationsResponseDTO();

        System.assertEquals(false, getBidsRecommendationsResponseDTO1.equals('foo'));
        System.assertEquals(false, getBidsRecommendationsResponseDTO2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASGetBidsRecommendationsResponseDTO getBidsRecommendationsResponseDTO1 = OASGetBidsRecommendationsResponseDTO.getExample();
        OASGetBidsRecommendationsResponseDTO getBidsRecommendationsResponseDTO2 = new OASGetBidsRecommendationsResponseDTO();
        OASGetBidsRecommendationsResponseDTO getBidsRecommendationsResponseDTO3;

        System.assertEquals(false, getBidsRecommendationsResponseDTO1.equals(getBidsRecommendationsResponseDTO3));
        System.assertEquals(false, getBidsRecommendationsResponseDTO2.equals(getBidsRecommendationsResponseDTO3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASGetBidsRecommendationsResponseDTO getBidsRecommendationsResponseDTO1 = OASGetBidsRecommendationsResponseDTO.getExample();
        OASGetBidsRecommendationsResponseDTO getBidsRecommendationsResponseDTO2 = new OASGetBidsRecommendationsResponseDTO();

        System.assertEquals(getBidsRecommendationsResponseDTO1.hashCode(), getBidsRecommendationsResponseDTO1.hashCode());
        System.assertEquals(getBidsRecommendationsResponseDTO2.hashCode(), getBidsRecommendationsResponseDTO2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASGetBidsRecommendationsResponseDTO getBidsRecommendationsResponseDTO1 = OASGetBidsRecommendationsResponseDTO.getExample();
        OASGetBidsRecommendationsResponseDTO getBidsRecommendationsResponseDTO2 = OASGetBidsRecommendationsResponseDTO.getExample();
        OASGetBidsRecommendationsResponseDTO getBidsRecommendationsResponseDTO3 = new OASGetBidsRecommendationsResponseDTO();
        OASGetBidsRecommendationsResponseDTO getBidsRecommendationsResponseDTO4 = new OASGetBidsRecommendationsResponseDTO();

        System.assert(getBidsRecommendationsResponseDTO1.equals(getBidsRecommendationsResponseDTO2));
        System.assert(getBidsRecommendationsResponseDTO3.equals(getBidsRecommendationsResponseDTO4));
        System.assertEquals(getBidsRecommendationsResponseDTO1.hashCode(), getBidsRecommendationsResponseDTO2.hashCode());
        System.assertEquals(getBidsRecommendationsResponseDTO3.hashCode(), getBidsRecommendationsResponseDTO4.hashCode());
    }

    @isTest
    private static void defaultValuesPopulated() {
        OASGetBidsRecommendationsResponseDTO getBidsRecommendationsResponseDTO = new OASGetBidsRecommendationsResponseDTO();
        System.assertEquals(new List<OASSkuBidRecommendationItemDTO>(), getBidsRecommendationsResponseDTO.recommendations);
    }
}
