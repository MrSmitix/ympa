@isTest
private class OASBaseOfferDTOTest {
    @isTest
    private static void equalsSameInstance() {
        OASBaseOfferDTO baseOfferDTO1 = OASBaseOfferDTO.getExample();
        OASBaseOfferDTO baseOfferDTO2 = baseOfferDTO1;
        OASBaseOfferDTO baseOfferDTO3 = new OASBaseOfferDTO();
        OASBaseOfferDTO baseOfferDTO4 = baseOfferDTO3;

        System.assert(baseOfferDTO1.equals(baseOfferDTO2));
        System.assert(baseOfferDTO2.equals(baseOfferDTO1));
        System.assert(baseOfferDTO1.equals(baseOfferDTO1));
        System.assert(baseOfferDTO3.equals(baseOfferDTO4));
        System.assert(baseOfferDTO4.equals(baseOfferDTO3));
        System.assert(baseOfferDTO3.equals(baseOfferDTO3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASBaseOfferDTO baseOfferDTO1 = OASBaseOfferDTO.getExample();
        OASBaseOfferDTO baseOfferDTO2 = OASBaseOfferDTO.getExample();
        OASBaseOfferDTO baseOfferDTO3 = new OASBaseOfferDTO();
        OASBaseOfferDTO baseOfferDTO4 = new OASBaseOfferDTO();

        System.assert(baseOfferDTO1.equals(baseOfferDTO2));
        System.assert(baseOfferDTO2.equals(baseOfferDTO1));
        System.assert(baseOfferDTO3.equals(baseOfferDTO4));
        System.assert(baseOfferDTO4.equals(baseOfferDTO3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASBaseOfferDTO baseOfferDTO1 = OASBaseOfferDTO.getExample();
        OASBaseOfferDTO baseOfferDTO2 = new OASBaseOfferDTO();

        System.assertEquals(false, baseOfferDTO1.equals('foo'));
        System.assertEquals(false, baseOfferDTO2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASBaseOfferDTO baseOfferDTO1 = OASBaseOfferDTO.getExample();
        OASBaseOfferDTO baseOfferDTO2 = new OASBaseOfferDTO();
        OASBaseOfferDTO baseOfferDTO3;

        System.assertEquals(false, baseOfferDTO1.equals(baseOfferDTO3));
        System.assertEquals(false, baseOfferDTO2.equals(baseOfferDTO3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASBaseOfferDTO baseOfferDTO1 = OASBaseOfferDTO.getExample();
        OASBaseOfferDTO baseOfferDTO2 = new OASBaseOfferDTO();

        System.assertEquals(baseOfferDTO1.hashCode(), baseOfferDTO1.hashCode());
        System.assertEquals(baseOfferDTO2.hashCode(), baseOfferDTO2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASBaseOfferDTO baseOfferDTO1 = OASBaseOfferDTO.getExample();
        OASBaseOfferDTO baseOfferDTO2 = OASBaseOfferDTO.getExample();
        OASBaseOfferDTO baseOfferDTO3 = new OASBaseOfferDTO();
        OASBaseOfferDTO baseOfferDTO4 = new OASBaseOfferDTO();

        System.assert(baseOfferDTO1.equals(baseOfferDTO2));
        System.assert(baseOfferDTO3.equals(baseOfferDTO4));
        System.assertEquals(baseOfferDTO1.hashCode(), baseOfferDTO2.hashCode());
        System.assertEquals(baseOfferDTO3.hashCode(), baseOfferDTO4.hashCode());
    }

    @isTest
    private static void defaultValuesPopulated() {
        OASBaseOfferDTO baseOfferDTO = new OASBaseOfferDTO();
        System.assertEquals(new List<String>(), baseOfferDTO.pictures);
        System.assertEquals(new List<String>(), baseOfferDTO.videos);
        System.assertEquals(new List<OASOfferManualDTO>(), baseOfferDTO.manuals);
        System.assertEquals(new List<String>(), baseOfferDTO.barcodes);
        System.assertEquals(new List<String>(), baseOfferDTO.manufacturerCountries);
        System.assertEquals(new List<String>(), baseOfferDTO.tags);
        System.assertEquals(new List<String>(), baseOfferDTO.certificates);
        System.assertEquals(new List<OASOfferParamDTO>(), baseOfferDTO.params);
        System.assertEquals(null, baseOfferDTO.offerId);
        System.assertEquals(null, baseOfferDTO.name);
        System.assertEquals(null, baseOfferDTO.marketCategoryId);
        System.assertEquals(null, baseOfferDTO.category);
        System.assertEquals(null, baseOfferDTO.vendor);
        System.assertEquals(null, baseOfferDTO.description);
        System.assertEquals(null, baseOfferDTO.weightDimensions);
        System.assertEquals(null, baseOfferDTO.vendorCode);
        System.assertEquals(null, baseOfferDTO.shelfLife);
        System.assertEquals(null, baseOfferDTO.lifeTime);
        System.assertEquals(null, baseOfferDTO.guaranteePeriod);
        System.assertEquals(null, baseOfferDTO.customsCommodityCode);
        System.assertEquals(null, baseOfferDTO.boxCount);
        System.assertEquals(null, baseOfferDTO.condition);
        System.assertEquals(null, baseOfferDTO.type);
        System.assertEquals(null, baseOfferDTO.downloadable);
        System.assertEquals(null, baseOfferDTO.adult);
        System.assertEquals(null, baseOfferDTO.age);
    }
}
