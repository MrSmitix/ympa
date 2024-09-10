@isTest
private class OASGetBidsInfoResponseDTOTest {
    @isTest
    private static void equalsSameInstance() {
        OASGetBidsInfoResponseDTO getBidsInfoResponseDTO1 = OASGetBidsInfoResponseDTO.getExample();
        OASGetBidsInfoResponseDTO getBidsInfoResponseDTO2 = getBidsInfoResponseDTO1;
        OASGetBidsInfoResponseDTO getBidsInfoResponseDTO3 = new OASGetBidsInfoResponseDTO();
        OASGetBidsInfoResponseDTO getBidsInfoResponseDTO4 = getBidsInfoResponseDTO3;

        System.assert(getBidsInfoResponseDTO1.equals(getBidsInfoResponseDTO2));
        System.assert(getBidsInfoResponseDTO2.equals(getBidsInfoResponseDTO1));
        System.assert(getBidsInfoResponseDTO1.equals(getBidsInfoResponseDTO1));
        System.assert(getBidsInfoResponseDTO3.equals(getBidsInfoResponseDTO4));
        System.assert(getBidsInfoResponseDTO4.equals(getBidsInfoResponseDTO3));
        System.assert(getBidsInfoResponseDTO3.equals(getBidsInfoResponseDTO3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASGetBidsInfoResponseDTO getBidsInfoResponseDTO1 = OASGetBidsInfoResponseDTO.getExample();
        OASGetBidsInfoResponseDTO getBidsInfoResponseDTO2 = OASGetBidsInfoResponseDTO.getExample();
        OASGetBidsInfoResponseDTO getBidsInfoResponseDTO3 = new OASGetBidsInfoResponseDTO();
        OASGetBidsInfoResponseDTO getBidsInfoResponseDTO4 = new OASGetBidsInfoResponseDTO();

        System.assert(getBidsInfoResponseDTO1.equals(getBidsInfoResponseDTO2));
        System.assert(getBidsInfoResponseDTO2.equals(getBidsInfoResponseDTO1));
        System.assert(getBidsInfoResponseDTO3.equals(getBidsInfoResponseDTO4));
        System.assert(getBidsInfoResponseDTO4.equals(getBidsInfoResponseDTO3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASGetBidsInfoResponseDTO getBidsInfoResponseDTO1 = OASGetBidsInfoResponseDTO.getExample();
        OASGetBidsInfoResponseDTO getBidsInfoResponseDTO2 = new OASGetBidsInfoResponseDTO();

        System.assertEquals(false, getBidsInfoResponseDTO1.equals('foo'));
        System.assertEquals(false, getBidsInfoResponseDTO2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASGetBidsInfoResponseDTO getBidsInfoResponseDTO1 = OASGetBidsInfoResponseDTO.getExample();
        OASGetBidsInfoResponseDTO getBidsInfoResponseDTO2 = new OASGetBidsInfoResponseDTO();
        OASGetBidsInfoResponseDTO getBidsInfoResponseDTO3;

        System.assertEquals(false, getBidsInfoResponseDTO1.equals(getBidsInfoResponseDTO3));
        System.assertEquals(false, getBidsInfoResponseDTO2.equals(getBidsInfoResponseDTO3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASGetBidsInfoResponseDTO getBidsInfoResponseDTO1 = OASGetBidsInfoResponseDTO.getExample();
        OASGetBidsInfoResponseDTO getBidsInfoResponseDTO2 = new OASGetBidsInfoResponseDTO();

        System.assertEquals(getBidsInfoResponseDTO1.hashCode(), getBidsInfoResponseDTO1.hashCode());
        System.assertEquals(getBidsInfoResponseDTO2.hashCode(), getBidsInfoResponseDTO2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASGetBidsInfoResponseDTO getBidsInfoResponseDTO1 = OASGetBidsInfoResponseDTO.getExample();
        OASGetBidsInfoResponseDTO getBidsInfoResponseDTO2 = OASGetBidsInfoResponseDTO.getExample();
        OASGetBidsInfoResponseDTO getBidsInfoResponseDTO3 = new OASGetBidsInfoResponseDTO();
        OASGetBidsInfoResponseDTO getBidsInfoResponseDTO4 = new OASGetBidsInfoResponseDTO();

        System.assert(getBidsInfoResponseDTO1.equals(getBidsInfoResponseDTO2));
        System.assert(getBidsInfoResponseDTO3.equals(getBidsInfoResponseDTO4));
        System.assertEquals(getBidsInfoResponseDTO1.hashCode(), getBidsInfoResponseDTO2.hashCode());
        System.assertEquals(getBidsInfoResponseDTO3.hashCode(), getBidsInfoResponseDTO4.hashCode());
    }

    @isTest
    private static void defaultValuesPopulated() {
        OASGetBidsInfoResponseDTO getBidsInfoResponseDTO = new OASGetBidsInfoResponseDTO();
        System.assertEquals(new List<OASSkuBidItemDTO>(), getBidsInfoResponseDTO.bids);
        System.assertEquals(null, getBidsInfoResponseDTO.paging);
    }
}
