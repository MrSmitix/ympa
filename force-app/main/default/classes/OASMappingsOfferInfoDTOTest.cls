@isTest
private class OASMappingsOfferInfoDTOTest {
    @isTest
    private static void equalsSameInstance() {
        OASMappingsOfferInfoDTO mappingsOfferInfoDTO1 = OASMappingsOfferInfoDTO.getExample();
        OASMappingsOfferInfoDTO mappingsOfferInfoDTO2 = mappingsOfferInfoDTO1;
        OASMappingsOfferInfoDTO mappingsOfferInfoDTO3 = new OASMappingsOfferInfoDTO();
        OASMappingsOfferInfoDTO mappingsOfferInfoDTO4 = mappingsOfferInfoDTO3;

        System.assert(mappingsOfferInfoDTO1.equals(mappingsOfferInfoDTO2));
        System.assert(mappingsOfferInfoDTO2.equals(mappingsOfferInfoDTO1));
        System.assert(mappingsOfferInfoDTO1.equals(mappingsOfferInfoDTO1));
        System.assert(mappingsOfferInfoDTO3.equals(mappingsOfferInfoDTO4));
        System.assert(mappingsOfferInfoDTO4.equals(mappingsOfferInfoDTO3));
        System.assert(mappingsOfferInfoDTO3.equals(mappingsOfferInfoDTO3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASMappingsOfferInfoDTO mappingsOfferInfoDTO1 = OASMappingsOfferInfoDTO.getExample();
        OASMappingsOfferInfoDTO mappingsOfferInfoDTO2 = OASMappingsOfferInfoDTO.getExample();
        OASMappingsOfferInfoDTO mappingsOfferInfoDTO3 = new OASMappingsOfferInfoDTO();
        OASMappingsOfferInfoDTO mappingsOfferInfoDTO4 = new OASMappingsOfferInfoDTO();

        System.assert(mappingsOfferInfoDTO1.equals(mappingsOfferInfoDTO2));
        System.assert(mappingsOfferInfoDTO2.equals(mappingsOfferInfoDTO1));
        System.assert(mappingsOfferInfoDTO3.equals(mappingsOfferInfoDTO4));
        System.assert(mappingsOfferInfoDTO4.equals(mappingsOfferInfoDTO3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASMappingsOfferInfoDTO mappingsOfferInfoDTO1 = OASMappingsOfferInfoDTO.getExample();
        OASMappingsOfferInfoDTO mappingsOfferInfoDTO2 = new OASMappingsOfferInfoDTO();

        System.assertEquals(false, mappingsOfferInfoDTO1.equals('foo'));
        System.assertEquals(false, mappingsOfferInfoDTO2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASMappingsOfferInfoDTO mappingsOfferInfoDTO1 = OASMappingsOfferInfoDTO.getExample();
        OASMappingsOfferInfoDTO mappingsOfferInfoDTO2 = new OASMappingsOfferInfoDTO();
        OASMappingsOfferInfoDTO mappingsOfferInfoDTO3;

        System.assertEquals(false, mappingsOfferInfoDTO1.equals(mappingsOfferInfoDTO3));
        System.assertEquals(false, mappingsOfferInfoDTO2.equals(mappingsOfferInfoDTO3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASMappingsOfferInfoDTO mappingsOfferInfoDTO1 = OASMappingsOfferInfoDTO.getExample();
        OASMappingsOfferInfoDTO mappingsOfferInfoDTO2 = new OASMappingsOfferInfoDTO();

        System.assertEquals(mappingsOfferInfoDTO1.hashCode(), mappingsOfferInfoDTO1.hashCode());
        System.assertEquals(mappingsOfferInfoDTO2.hashCode(), mappingsOfferInfoDTO2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASMappingsOfferInfoDTO mappingsOfferInfoDTO1 = OASMappingsOfferInfoDTO.getExample();
        OASMappingsOfferInfoDTO mappingsOfferInfoDTO2 = OASMappingsOfferInfoDTO.getExample();
        OASMappingsOfferInfoDTO mappingsOfferInfoDTO3 = new OASMappingsOfferInfoDTO();
        OASMappingsOfferInfoDTO mappingsOfferInfoDTO4 = new OASMappingsOfferInfoDTO();

        System.assert(mappingsOfferInfoDTO1.equals(mappingsOfferInfoDTO2));
        System.assert(mappingsOfferInfoDTO3.equals(mappingsOfferInfoDTO4));
        System.assertEquals(mappingsOfferInfoDTO1.hashCode(), mappingsOfferInfoDTO2.hashCode());
        System.assertEquals(mappingsOfferInfoDTO3.hashCode(), mappingsOfferInfoDTO4.hashCode());
    }

    @isTest
    private static void defaultValuesPopulated() {
        OASMappingsOfferInfoDTO mappingsOfferInfoDTO = new OASMappingsOfferInfoDTO();
        System.assertEquals(new List<String>(), mappingsOfferInfoDTO.barcodes);
        System.assertEquals(new List<String>(), mappingsOfferInfoDTO.urls);
        System.assertEquals(new List<String>(), mappingsOfferInfoDTO.pictures);
        System.assertEquals(new List<String>(), mappingsOfferInfoDTO.manufacturerCountries);
        System.assertEquals(new List<String>(), mappingsOfferInfoDTO.customsCommodityCodes);
        System.assertEquals(new List<OASDayOfWeekType>(), mappingsOfferInfoDTO.supplyScheduleDays);
        System.assertEquals(null, mappingsOfferInfoDTO.name);
        System.assertEquals(null, mappingsOfferInfoDTO.shopSku);
        System.assertEquals(null, mappingsOfferInfoDTO.category);
        System.assertEquals(null, mappingsOfferInfoDTO.vendor);
        System.assertEquals(null, mappingsOfferInfoDTO.vendorCode);
        System.assertEquals(null, mappingsOfferInfoDTO.description);
        System.assertEquals(null, mappingsOfferInfoDTO.id);
        System.assertEquals(null, mappingsOfferInfoDTO.feedId);
        System.assertEquals(null, mappingsOfferInfoDTO.manufacturer);
        System.assertEquals(null, mappingsOfferInfoDTO.minShipment);
        System.assertEquals(null, mappingsOfferInfoDTO.transportUnitSize);
        System.assertEquals(null, mappingsOfferInfoDTO.quantumOfSupply);
        System.assertEquals(null, mappingsOfferInfoDTO.deliveryDurationDays);
        System.assertEquals(null, mappingsOfferInfoDTO.boxCount);
        System.assertEquals(null, mappingsOfferInfoDTO.weightDimensions);
        System.assertEquals(null, mappingsOfferInfoDTO.shelfLifeDays);
        System.assertEquals(null, mappingsOfferInfoDTO.lifeTimeDays);
        System.assertEquals(null, mappingsOfferInfoDTO.guaranteePeriodDays);
        System.assertEquals(null, mappingsOfferInfoDTO.processingState);
        System.assertEquals(null, mappingsOfferInfoDTO.availability);
        System.assertEquals(null, mappingsOfferInfoDTO.shelfLife);
        System.assertEquals(null, mappingsOfferInfoDTO.lifeTime);
        System.assertEquals(null, mappingsOfferInfoDTO.guaranteePeriod);
        System.assertEquals(null, mappingsOfferInfoDTO.certificate);
    }
}
