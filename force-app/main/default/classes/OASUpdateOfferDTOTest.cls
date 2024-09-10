@isTest
private class OASUpdateOfferDTOTest {
    @isTest
    private static void equalsSameInstance() {
        OASUpdateOfferDTO updateOfferDTO1 = OASUpdateOfferDTO.getExample();
        OASUpdateOfferDTO updateOfferDTO2 = updateOfferDTO1;
        OASUpdateOfferDTO updateOfferDTO3 = new OASUpdateOfferDTO();
        OASUpdateOfferDTO updateOfferDTO4 = updateOfferDTO3;

        System.assert(updateOfferDTO1.equals(updateOfferDTO2));
        System.assert(updateOfferDTO2.equals(updateOfferDTO1));
        System.assert(updateOfferDTO1.equals(updateOfferDTO1));
        System.assert(updateOfferDTO3.equals(updateOfferDTO4));
        System.assert(updateOfferDTO4.equals(updateOfferDTO3));
        System.assert(updateOfferDTO3.equals(updateOfferDTO3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASUpdateOfferDTO updateOfferDTO1 = OASUpdateOfferDTO.getExample();
        OASUpdateOfferDTO updateOfferDTO2 = OASUpdateOfferDTO.getExample();
        OASUpdateOfferDTO updateOfferDTO3 = new OASUpdateOfferDTO();
        OASUpdateOfferDTO updateOfferDTO4 = new OASUpdateOfferDTO();

        System.assert(updateOfferDTO1.equals(updateOfferDTO2));
        System.assert(updateOfferDTO2.equals(updateOfferDTO1));
        System.assert(updateOfferDTO3.equals(updateOfferDTO4));
        System.assert(updateOfferDTO4.equals(updateOfferDTO3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASUpdateOfferDTO updateOfferDTO1 = OASUpdateOfferDTO.getExample();
        OASUpdateOfferDTO updateOfferDTO2 = new OASUpdateOfferDTO();

        System.assertEquals(false, updateOfferDTO1.equals('foo'));
        System.assertEquals(false, updateOfferDTO2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASUpdateOfferDTO updateOfferDTO1 = OASUpdateOfferDTO.getExample();
        OASUpdateOfferDTO updateOfferDTO2 = new OASUpdateOfferDTO();
        OASUpdateOfferDTO updateOfferDTO3;

        System.assertEquals(false, updateOfferDTO1.equals(updateOfferDTO3));
        System.assertEquals(false, updateOfferDTO2.equals(updateOfferDTO3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASUpdateOfferDTO updateOfferDTO1 = OASUpdateOfferDTO.getExample();
        OASUpdateOfferDTO updateOfferDTO2 = new OASUpdateOfferDTO();

        System.assertEquals(updateOfferDTO1.hashCode(), updateOfferDTO1.hashCode());
        System.assertEquals(updateOfferDTO2.hashCode(), updateOfferDTO2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASUpdateOfferDTO updateOfferDTO1 = OASUpdateOfferDTO.getExample();
        OASUpdateOfferDTO updateOfferDTO2 = OASUpdateOfferDTO.getExample();
        OASUpdateOfferDTO updateOfferDTO3 = new OASUpdateOfferDTO();
        OASUpdateOfferDTO updateOfferDTO4 = new OASUpdateOfferDTO();

        System.assert(updateOfferDTO1.equals(updateOfferDTO2));
        System.assert(updateOfferDTO3.equals(updateOfferDTO4));
        System.assertEquals(updateOfferDTO1.hashCode(), updateOfferDTO2.hashCode());
        System.assertEquals(updateOfferDTO3.hashCode(), updateOfferDTO4.hashCode());
    }

    @isTest
    private static void defaultValuesPopulated() {
        OASUpdateOfferDTO updateOfferDTO = new OASUpdateOfferDTO();
        System.assertEquals(new List<String>(), updateOfferDTO.pictures);
        System.assertEquals(new List<String>(), updateOfferDTO.videos);
        System.assertEquals(new List<OASOfferManualDTO>(), updateOfferDTO.manuals);
        System.assertEquals(new List<String>(), updateOfferDTO.barcodes);
        System.assertEquals(new List<String>(), updateOfferDTO.manufacturerCountries);
        System.assertEquals(new List<String>(), updateOfferDTO.tags);
        System.assertEquals(new List<String>(), updateOfferDTO.certificates);
        System.assertEquals(new List<OASOfferParamDTO>(), updateOfferDTO.params);
        System.assertEquals(new List<OASParameterValueDTO>(), updateOfferDTO.parameterValues);
        System.assertEquals(null, updateOfferDTO.offerId);
        System.assertEquals(null, updateOfferDTO.name);
        System.assertEquals(null, updateOfferDTO.marketCategoryId);
        System.assertEquals(null, updateOfferDTO.category);
        System.assertEquals(null, updateOfferDTO.vendor);
        System.assertEquals(null, updateOfferDTO.description);
        System.assertEquals(null, updateOfferDTO.weightDimensions);
        System.assertEquals(null, updateOfferDTO.vendorCode);
        System.assertEquals(null, updateOfferDTO.shelfLife);
        System.assertEquals(null, updateOfferDTO.lifeTime);
        System.assertEquals(null, updateOfferDTO.guaranteePeriod);
        System.assertEquals(null, updateOfferDTO.customsCommodityCode);
        System.assertEquals(null, updateOfferDTO.boxCount);
        System.assertEquals(null, updateOfferDTO.condition);
        System.assertEquals(null, updateOfferDTO.type);
        System.assertEquals(null, updateOfferDTO.downloadable);
        System.assertEquals(null, updateOfferDTO.adult);
        System.assertEquals(null, updateOfferDTO.age);
        System.assertEquals(null, updateOfferDTO.basicPrice);
        System.assertEquals(null, updateOfferDTO.purchasePrice);
        System.assertEquals(null, updateOfferDTO.additionalExpenses);
        System.assertEquals(null, updateOfferDTO.cofinancePrice);
    }
}
