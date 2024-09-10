@isTest
private class OASGetOfferDTOTest {
    @isTest
    private static void equalsSameInstance() {
        OASGetOfferDTO getOfferDTO1 = OASGetOfferDTO.getExample();
        OASGetOfferDTO getOfferDTO2 = getOfferDTO1;
        OASGetOfferDTO getOfferDTO3 = new OASGetOfferDTO();
        OASGetOfferDTO getOfferDTO4 = getOfferDTO3;

        System.assert(getOfferDTO1.equals(getOfferDTO2));
        System.assert(getOfferDTO2.equals(getOfferDTO1));
        System.assert(getOfferDTO1.equals(getOfferDTO1));
        System.assert(getOfferDTO3.equals(getOfferDTO4));
        System.assert(getOfferDTO4.equals(getOfferDTO3));
        System.assert(getOfferDTO3.equals(getOfferDTO3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASGetOfferDTO getOfferDTO1 = OASGetOfferDTO.getExample();
        OASGetOfferDTO getOfferDTO2 = OASGetOfferDTO.getExample();
        OASGetOfferDTO getOfferDTO3 = new OASGetOfferDTO();
        OASGetOfferDTO getOfferDTO4 = new OASGetOfferDTO();

        System.assert(getOfferDTO1.equals(getOfferDTO2));
        System.assert(getOfferDTO2.equals(getOfferDTO1));
        System.assert(getOfferDTO3.equals(getOfferDTO4));
        System.assert(getOfferDTO4.equals(getOfferDTO3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASGetOfferDTO getOfferDTO1 = OASGetOfferDTO.getExample();
        OASGetOfferDTO getOfferDTO2 = new OASGetOfferDTO();

        System.assertEquals(false, getOfferDTO1.equals('foo'));
        System.assertEquals(false, getOfferDTO2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASGetOfferDTO getOfferDTO1 = OASGetOfferDTO.getExample();
        OASGetOfferDTO getOfferDTO2 = new OASGetOfferDTO();
        OASGetOfferDTO getOfferDTO3;

        System.assertEquals(false, getOfferDTO1.equals(getOfferDTO3));
        System.assertEquals(false, getOfferDTO2.equals(getOfferDTO3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASGetOfferDTO getOfferDTO1 = OASGetOfferDTO.getExample();
        OASGetOfferDTO getOfferDTO2 = new OASGetOfferDTO();

        System.assertEquals(getOfferDTO1.hashCode(), getOfferDTO1.hashCode());
        System.assertEquals(getOfferDTO2.hashCode(), getOfferDTO2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASGetOfferDTO getOfferDTO1 = OASGetOfferDTO.getExample();
        OASGetOfferDTO getOfferDTO2 = OASGetOfferDTO.getExample();
        OASGetOfferDTO getOfferDTO3 = new OASGetOfferDTO();
        OASGetOfferDTO getOfferDTO4 = new OASGetOfferDTO();

        System.assert(getOfferDTO1.equals(getOfferDTO2));
        System.assert(getOfferDTO3.equals(getOfferDTO4));
        System.assertEquals(getOfferDTO1.hashCode(), getOfferDTO2.hashCode());
        System.assertEquals(getOfferDTO3.hashCode(), getOfferDTO4.hashCode());
    }

    @isTest
    private static void defaultValuesPopulated() {
        OASGetOfferDTO getOfferDTO = new OASGetOfferDTO();
        System.assertEquals(new List<String>(), getOfferDTO.pictures);
        System.assertEquals(new List<String>(), getOfferDTO.videos);
        System.assertEquals(new List<OASOfferManualDTO>(), getOfferDTO.manuals);
        System.assertEquals(new List<String>(), getOfferDTO.barcodes);
        System.assertEquals(new List<String>(), getOfferDTO.manufacturerCountries);
        System.assertEquals(new List<String>(), getOfferDTO.tags);
        System.assertEquals(new List<String>(), getOfferDTO.certificates);
        System.assertEquals(new List<OASOfferParamDTO>(), getOfferDTO.params);
        System.assertEquals(new List<OASOfferCampaignStatusDTO>(), getOfferDTO.campaigns);
        System.assertEquals(new List<OASOfferSellingProgramDTO>(), getOfferDTO.sellingPrograms);
        System.assertEquals(null, getOfferDTO.offerId);
        System.assertEquals(null, getOfferDTO.name);
        System.assertEquals(null, getOfferDTO.marketCategoryId);
        System.assertEquals(null, getOfferDTO.category);
        System.assertEquals(null, getOfferDTO.vendor);
        System.assertEquals(null, getOfferDTO.description);
        System.assertEquals(null, getOfferDTO.weightDimensions);
        System.assertEquals(null, getOfferDTO.vendorCode);
        System.assertEquals(null, getOfferDTO.shelfLife);
        System.assertEquals(null, getOfferDTO.lifeTime);
        System.assertEquals(null, getOfferDTO.guaranteePeriod);
        System.assertEquals(null, getOfferDTO.customsCommodityCode);
        System.assertEquals(null, getOfferDTO.boxCount);
        System.assertEquals(null, getOfferDTO.condition);
        System.assertEquals(null, getOfferDTO.type);
        System.assertEquals(null, getOfferDTO.downloadable);
        System.assertEquals(null, getOfferDTO.adult);
        System.assertEquals(null, getOfferDTO.age);
        System.assertEquals(null, getOfferDTO.basicPrice);
        System.assertEquals(null, getOfferDTO.purchasePrice);
        System.assertEquals(null, getOfferDTO.additionalExpenses);
        System.assertEquals(null, getOfferDTO.cofinancePrice);
        System.assertEquals(null, getOfferDTO.cardStatus);
        System.assertEquals(null, getOfferDTO.archived);
    }
}
