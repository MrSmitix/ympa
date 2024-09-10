@isTest
private class OASUpdateMappingsOfferDTOTest {
    @isTest
    private static void equalsSameInstance() {
        OASUpdateMappingsOfferDTO updateMappingsOfferDTO1 = OASUpdateMappingsOfferDTO.getExample();
        OASUpdateMappingsOfferDTO updateMappingsOfferDTO2 = updateMappingsOfferDTO1;
        OASUpdateMappingsOfferDTO updateMappingsOfferDTO3 = new OASUpdateMappingsOfferDTO();
        OASUpdateMappingsOfferDTO updateMappingsOfferDTO4 = updateMappingsOfferDTO3;

        System.assert(updateMappingsOfferDTO1.equals(updateMappingsOfferDTO2));
        System.assert(updateMappingsOfferDTO2.equals(updateMappingsOfferDTO1));
        System.assert(updateMappingsOfferDTO1.equals(updateMappingsOfferDTO1));
        System.assert(updateMappingsOfferDTO3.equals(updateMappingsOfferDTO4));
        System.assert(updateMappingsOfferDTO4.equals(updateMappingsOfferDTO3));
        System.assert(updateMappingsOfferDTO3.equals(updateMappingsOfferDTO3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASUpdateMappingsOfferDTO updateMappingsOfferDTO1 = OASUpdateMappingsOfferDTO.getExample();
        OASUpdateMappingsOfferDTO updateMappingsOfferDTO2 = OASUpdateMappingsOfferDTO.getExample();
        OASUpdateMappingsOfferDTO updateMappingsOfferDTO3 = new OASUpdateMappingsOfferDTO();
        OASUpdateMappingsOfferDTO updateMappingsOfferDTO4 = new OASUpdateMappingsOfferDTO();

        System.assert(updateMappingsOfferDTO1.equals(updateMappingsOfferDTO2));
        System.assert(updateMappingsOfferDTO2.equals(updateMappingsOfferDTO1));
        System.assert(updateMappingsOfferDTO3.equals(updateMappingsOfferDTO4));
        System.assert(updateMappingsOfferDTO4.equals(updateMappingsOfferDTO3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASUpdateMappingsOfferDTO updateMappingsOfferDTO1 = OASUpdateMappingsOfferDTO.getExample();
        OASUpdateMappingsOfferDTO updateMappingsOfferDTO2 = new OASUpdateMappingsOfferDTO();

        System.assertEquals(false, updateMappingsOfferDTO1.equals('foo'));
        System.assertEquals(false, updateMappingsOfferDTO2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASUpdateMappingsOfferDTO updateMappingsOfferDTO1 = OASUpdateMappingsOfferDTO.getExample();
        OASUpdateMappingsOfferDTO updateMappingsOfferDTO2 = new OASUpdateMappingsOfferDTO();
        OASUpdateMappingsOfferDTO updateMappingsOfferDTO3;

        System.assertEquals(false, updateMappingsOfferDTO1.equals(updateMappingsOfferDTO3));
        System.assertEquals(false, updateMappingsOfferDTO2.equals(updateMappingsOfferDTO3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASUpdateMappingsOfferDTO updateMappingsOfferDTO1 = OASUpdateMappingsOfferDTO.getExample();
        OASUpdateMappingsOfferDTO updateMappingsOfferDTO2 = new OASUpdateMappingsOfferDTO();

        System.assertEquals(updateMappingsOfferDTO1.hashCode(), updateMappingsOfferDTO1.hashCode());
        System.assertEquals(updateMappingsOfferDTO2.hashCode(), updateMappingsOfferDTO2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASUpdateMappingsOfferDTO updateMappingsOfferDTO1 = OASUpdateMappingsOfferDTO.getExample();
        OASUpdateMappingsOfferDTO updateMappingsOfferDTO2 = OASUpdateMappingsOfferDTO.getExample();
        OASUpdateMappingsOfferDTO updateMappingsOfferDTO3 = new OASUpdateMappingsOfferDTO();
        OASUpdateMappingsOfferDTO updateMappingsOfferDTO4 = new OASUpdateMappingsOfferDTO();

        System.assert(updateMappingsOfferDTO1.equals(updateMappingsOfferDTO2));
        System.assert(updateMappingsOfferDTO3.equals(updateMappingsOfferDTO4));
        System.assertEquals(updateMappingsOfferDTO1.hashCode(), updateMappingsOfferDTO2.hashCode());
        System.assertEquals(updateMappingsOfferDTO3.hashCode(), updateMappingsOfferDTO4.hashCode());
    }

    @isTest
    private static void defaultValuesPopulated() {
        OASUpdateMappingsOfferDTO updateMappingsOfferDTO = new OASUpdateMappingsOfferDTO();
        System.assertEquals(new List<String>(), updateMappingsOfferDTO.barcodes);
        System.assertEquals(new List<String>(), updateMappingsOfferDTO.urls);
        System.assertEquals(new List<String>(), updateMappingsOfferDTO.pictures);
        System.assertEquals(new List<String>(), updateMappingsOfferDTO.manufacturerCountries);
        System.assertEquals(new List<String>(), updateMappingsOfferDTO.customsCommodityCodes);
        System.assertEquals(new List<OASDayOfWeekType>(), updateMappingsOfferDTO.supplyScheduleDays);
        System.assertEquals(null, updateMappingsOfferDTO.name);
        System.assertEquals(null, updateMappingsOfferDTO.shopSku);
        System.assertEquals(null, updateMappingsOfferDTO.category);
        System.assertEquals(null, updateMappingsOfferDTO.vendor);
        System.assertEquals(null, updateMappingsOfferDTO.vendorCode);
        System.assertEquals(null, updateMappingsOfferDTO.description);
        System.assertEquals(null, updateMappingsOfferDTO.id);
        System.assertEquals(null, updateMappingsOfferDTO.feedId);
        System.assertEquals(null, updateMappingsOfferDTO.manufacturer);
        System.assertEquals(null, updateMappingsOfferDTO.minShipment);
        System.assertEquals(null, updateMappingsOfferDTO.transportUnitSize);
        System.assertEquals(null, updateMappingsOfferDTO.quantumOfSupply);
        System.assertEquals(null, updateMappingsOfferDTO.deliveryDurationDays);
        System.assertEquals(null, updateMappingsOfferDTO.boxCount);
        System.assertEquals(null, updateMappingsOfferDTO.weightDimensions);
        System.assertEquals(null, updateMappingsOfferDTO.shelfLifeDays);
        System.assertEquals(null, updateMappingsOfferDTO.lifeTimeDays);
        System.assertEquals(null, updateMappingsOfferDTO.guaranteePeriodDays);
        System.assertEquals(null, updateMappingsOfferDTO.processingState);
        System.assertEquals(null, updateMappingsOfferDTO.availability);
        System.assertEquals(null, updateMappingsOfferDTO.shelfLife);
        System.assertEquals(null, updateMappingsOfferDTO.lifeTime);
        System.assertEquals(null, updateMappingsOfferDTO.guaranteePeriod);
        System.assertEquals(null, updateMappingsOfferDTO.certificate);
    }
}
