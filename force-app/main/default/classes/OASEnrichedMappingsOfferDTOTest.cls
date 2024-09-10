@isTest
private class OASEnrichedMappingsOfferDTOTest {
    @isTest
    private static void equalsSameInstance() {
        OASEnrichedMappingsOfferDTO enrichedMappingsOfferDTO1 = OASEnrichedMappingsOfferDTO.getExample();
        OASEnrichedMappingsOfferDTO enrichedMappingsOfferDTO2 = enrichedMappingsOfferDTO1;
        OASEnrichedMappingsOfferDTO enrichedMappingsOfferDTO3 = new OASEnrichedMappingsOfferDTO();
        OASEnrichedMappingsOfferDTO enrichedMappingsOfferDTO4 = enrichedMappingsOfferDTO3;

        System.assert(enrichedMappingsOfferDTO1.equals(enrichedMappingsOfferDTO2));
        System.assert(enrichedMappingsOfferDTO2.equals(enrichedMappingsOfferDTO1));
        System.assert(enrichedMappingsOfferDTO1.equals(enrichedMappingsOfferDTO1));
        System.assert(enrichedMappingsOfferDTO3.equals(enrichedMappingsOfferDTO4));
        System.assert(enrichedMappingsOfferDTO4.equals(enrichedMappingsOfferDTO3));
        System.assert(enrichedMappingsOfferDTO3.equals(enrichedMappingsOfferDTO3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASEnrichedMappingsOfferDTO enrichedMappingsOfferDTO1 = OASEnrichedMappingsOfferDTO.getExample();
        OASEnrichedMappingsOfferDTO enrichedMappingsOfferDTO2 = OASEnrichedMappingsOfferDTO.getExample();
        OASEnrichedMappingsOfferDTO enrichedMappingsOfferDTO3 = new OASEnrichedMappingsOfferDTO();
        OASEnrichedMappingsOfferDTO enrichedMappingsOfferDTO4 = new OASEnrichedMappingsOfferDTO();

        System.assert(enrichedMappingsOfferDTO1.equals(enrichedMappingsOfferDTO2));
        System.assert(enrichedMappingsOfferDTO2.equals(enrichedMappingsOfferDTO1));
        System.assert(enrichedMappingsOfferDTO3.equals(enrichedMappingsOfferDTO4));
        System.assert(enrichedMappingsOfferDTO4.equals(enrichedMappingsOfferDTO3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASEnrichedMappingsOfferDTO enrichedMappingsOfferDTO1 = OASEnrichedMappingsOfferDTO.getExample();
        OASEnrichedMappingsOfferDTO enrichedMappingsOfferDTO2 = new OASEnrichedMappingsOfferDTO();

        System.assertEquals(false, enrichedMappingsOfferDTO1.equals('foo'));
        System.assertEquals(false, enrichedMappingsOfferDTO2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASEnrichedMappingsOfferDTO enrichedMappingsOfferDTO1 = OASEnrichedMappingsOfferDTO.getExample();
        OASEnrichedMappingsOfferDTO enrichedMappingsOfferDTO2 = new OASEnrichedMappingsOfferDTO();
        OASEnrichedMappingsOfferDTO enrichedMappingsOfferDTO3;

        System.assertEquals(false, enrichedMappingsOfferDTO1.equals(enrichedMappingsOfferDTO3));
        System.assertEquals(false, enrichedMappingsOfferDTO2.equals(enrichedMappingsOfferDTO3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASEnrichedMappingsOfferDTO enrichedMappingsOfferDTO1 = OASEnrichedMappingsOfferDTO.getExample();
        OASEnrichedMappingsOfferDTO enrichedMappingsOfferDTO2 = new OASEnrichedMappingsOfferDTO();

        System.assertEquals(enrichedMappingsOfferDTO1.hashCode(), enrichedMappingsOfferDTO1.hashCode());
        System.assertEquals(enrichedMappingsOfferDTO2.hashCode(), enrichedMappingsOfferDTO2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASEnrichedMappingsOfferDTO enrichedMappingsOfferDTO1 = OASEnrichedMappingsOfferDTO.getExample();
        OASEnrichedMappingsOfferDTO enrichedMappingsOfferDTO2 = OASEnrichedMappingsOfferDTO.getExample();
        OASEnrichedMappingsOfferDTO enrichedMappingsOfferDTO3 = new OASEnrichedMappingsOfferDTO();
        OASEnrichedMappingsOfferDTO enrichedMappingsOfferDTO4 = new OASEnrichedMappingsOfferDTO();

        System.assert(enrichedMappingsOfferDTO1.equals(enrichedMappingsOfferDTO2));
        System.assert(enrichedMappingsOfferDTO3.equals(enrichedMappingsOfferDTO4));
        System.assertEquals(enrichedMappingsOfferDTO1.hashCode(), enrichedMappingsOfferDTO2.hashCode());
        System.assertEquals(enrichedMappingsOfferDTO3.hashCode(), enrichedMappingsOfferDTO4.hashCode());
    }

    @isTest
    private static void defaultValuesPopulated() {
        OASEnrichedMappingsOfferDTO enrichedMappingsOfferDTO = new OASEnrichedMappingsOfferDTO();
        System.assertEquals(new List<String>(), enrichedMappingsOfferDTO.barcodes);
        System.assertEquals(new List<String>(), enrichedMappingsOfferDTO.urls);
        System.assertEquals(new List<String>(), enrichedMappingsOfferDTO.pictures);
        System.assertEquals(new List<String>(), enrichedMappingsOfferDTO.manufacturerCountries);
        System.assertEquals(new List<String>(), enrichedMappingsOfferDTO.customsCommodityCodes);
        System.assertEquals(new List<OASDayOfWeekType>(), enrichedMappingsOfferDTO.supplyScheduleDays);
        System.assertEquals(null, enrichedMappingsOfferDTO.name);
        System.assertEquals(null, enrichedMappingsOfferDTO.shopSku);
        System.assertEquals(null, enrichedMappingsOfferDTO.category);
        System.assertEquals(null, enrichedMappingsOfferDTO.vendor);
        System.assertEquals(null, enrichedMappingsOfferDTO.vendorCode);
        System.assertEquals(null, enrichedMappingsOfferDTO.description);
        System.assertEquals(null, enrichedMappingsOfferDTO.id);
        System.assertEquals(null, enrichedMappingsOfferDTO.feedId);
        System.assertEquals(null, enrichedMappingsOfferDTO.manufacturer);
        System.assertEquals(null, enrichedMappingsOfferDTO.minShipment);
        System.assertEquals(null, enrichedMappingsOfferDTO.transportUnitSize);
        System.assertEquals(null, enrichedMappingsOfferDTO.quantumOfSupply);
        System.assertEquals(null, enrichedMappingsOfferDTO.deliveryDurationDays);
        System.assertEquals(null, enrichedMappingsOfferDTO.boxCount);
        System.assertEquals(null, enrichedMappingsOfferDTO.weightDimensions);
        System.assertEquals(null, enrichedMappingsOfferDTO.shelfLifeDays);
        System.assertEquals(null, enrichedMappingsOfferDTO.lifeTimeDays);
        System.assertEquals(null, enrichedMappingsOfferDTO.guaranteePeriodDays);
        System.assertEquals(null, enrichedMappingsOfferDTO.processingState);
        System.assertEquals(null, enrichedMappingsOfferDTO.availability);
        System.assertEquals(null, enrichedMappingsOfferDTO.shelfLife);
        System.assertEquals(null, enrichedMappingsOfferDTO.lifeTime);
        System.assertEquals(null, enrichedMappingsOfferDTO.guaranteePeriod);
        System.assertEquals(null, enrichedMappingsOfferDTO.certificate);
        System.assertEquals(null, enrichedMappingsOfferDTO.price);
        System.assertEquals(null, enrichedMappingsOfferDTO.marketCategoryId);
        System.assertEquals(null, enrichedMappingsOfferDTO.marketCategoryName);
        System.assertEquals(null, enrichedMappingsOfferDTO.marketModelId);
        System.assertEquals(null, enrichedMappingsOfferDTO.marketModelName);
        System.assertEquals(null, enrichedMappingsOfferDTO.marketSku);
        System.assertEquals(null, enrichedMappingsOfferDTO.marketSkuName);
    }
}
