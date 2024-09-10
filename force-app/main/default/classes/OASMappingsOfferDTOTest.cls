@isTest
private class OASMappingsOfferDTOTest {
    @isTest
    private static void equalsSameInstance() {
        OASMappingsOfferDTO mappingsOfferDTO1 = OASMappingsOfferDTO.getExample();
        OASMappingsOfferDTO mappingsOfferDTO2 = mappingsOfferDTO1;
        OASMappingsOfferDTO mappingsOfferDTO3 = new OASMappingsOfferDTO();
        OASMappingsOfferDTO mappingsOfferDTO4 = mappingsOfferDTO3;

        System.assert(mappingsOfferDTO1.equals(mappingsOfferDTO2));
        System.assert(mappingsOfferDTO2.equals(mappingsOfferDTO1));
        System.assert(mappingsOfferDTO1.equals(mappingsOfferDTO1));
        System.assert(mappingsOfferDTO3.equals(mappingsOfferDTO4));
        System.assert(mappingsOfferDTO4.equals(mappingsOfferDTO3));
        System.assert(mappingsOfferDTO3.equals(mappingsOfferDTO3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASMappingsOfferDTO mappingsOfferDTO1 = OASMappingsOfferDTO.getExample();
        OASMappingsOfferDTO mappingsOfferDTO2 = OASMappingsOfferDTO.getExample();
        OASMappingsOfferDTO mappingsOfferDTO3 = new OASMappingsOfferDTO();
        OASMappingsOfferDTO mappingsOfferDTO4 = new OASMappingsOfferDTO();

        System.assert(mappingsOfferDTO1.equals(mappingsOfferDTO2));
        System.assert(mappingsOfferDTO2.equals(mappingsOfferDTO1));
        System.assert(mappingsOfferDTO3.equals(mappingsOfferDTO4));
        System.assert(mappingsOfferDTO4.equals(mappingsOfferDTO3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASMappingsOfferDTO mappingsOfferDTO1 = OASMappingsOfferDTO.getExample();
        OASMappingsOfferDTO mappingsOfferDTO2 = new OASMappingsOfferDTO();

        System.assertEquals(false, mappingsOfferDTO1.equals('foo'));
        System.assertEquals(false, mappingsOfferDTO2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASMappingsOfferDTO mappingsOfferDTO1 = OASMappingsOfferDTO.getExample();
        OASMappingsOfferDTO mappingsOfferDTO2 = new OASMappingsOfferDTO();
        OASMappingsOfferDTO mappingsOfferDTO3;

        System.assertEquals(false, mappingsOfferDTO1.equals(mappingsOfferDTO3));
        System.assertEquals(false, mappingsOfferDTO2.equals(mappingsOfferDTO3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASMappingsOfferDTO mappingsOfferDTO1 = OASMappingsOfferDTO.getExample();
        OASMappingsOfferDTO mappingsOfferDTO2 = new OASMappingsOfferDTO();

        System.assertEquals(mappingsOfferDTO1.hashCode(), mappingsOfferDTO1.hashCode());
        System.assertEquals(mappingsOfferDTO2.hashCode(), mappingsOfferDTO2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASMappingsOfferDTO mappingsOfferDTO1 = OASMappingsOfferDTO.getExample();
        OASMappingsOfferDTO mappingsOfferDTO2 = OASMappingsOfferDTO.getExample();
        OASMappingsOfferDTO mappingsOfferDTO3 = new OASMappingsOfferDTO();
        OASMappingsOfferDTO mappingsOfferDTO4 = new OASMappingsOfferDTO();

        System.assert(mappingsOfferDTO1.equals(mappingsOfferDTO2));
        System.assert(mappingsOfferDTO3.equals(mappingsOfferDTO4));
        System.assertEquals(mappingsOfferDTO1.hashCode(), mappingsOfferDTO2.hashCode());
        System.assertEquals(mappingsOfferDTO3.hashCode(), mappingsOfferDTO4.hashCode());
    }

    @isTest
    private static void defaultValuesPopulated() {
        OASMappingsOfferDTO mappingsOfferDTO = new OASMappingsOfferDTO();
        System.assertEquals(new List<String>(), mappingsOfferDTO.barcodes);
        System.assertEquals(new List<String>(), mappingsOfferDTO.urls);
        System.assertEquals(new List<String>(), mappingsOfferDTO.pictures);
        System.assertEquals(new List<String>(), mappingsOfferDTO.manufacturerCountries);
        System.assertEquals(new List<String>(), mappingsOfferDTO.customsCommodityCodes);
        System.assertEquals(new List<OASDayOfWeekType>(), mappingsOfferDTO.supplyScheduleDays);
        System.assertEquals(null, mappingsOfferDTO.name);
        System.assertEquals(null, mappingsOfferDTO.shopSku);
        System.assertEquals(null, mappingsOfferDTO.category);
        System.assertEquals(null, mappingsOfferDTO.vendor);
        System.assertEquals(null, mappingsOfferDTO.vendorCode);
        System.assertEquals(null, mappingsOfferDTO.description);
        System.assertEquals(null, mappingsOfferDTO.id);
        System.assertEquals(null, mappingsOfferDTO.feedId);
        System.assertEquals(null, mappingsOfferDTO.manufacturer);
        System.assertEquals(null, mappingsOfferDTO.minShipment);
        System.assertEquals(null, mappingsOfferDTO.transportUnitSize);
        System.assertEquals(null, mappingsOfferDTO.quantumOfSupply);
        System.assertEquals(null, mappingsOfferDTO.deliveryDurationDays);
        System.assertEquals(null, mappingsOfferDTO.boxCount);
        System.assertEquals(null, mappingsOfferDTO.weightDimensions);
        System.assertEquals(null, mappingsOfferDTO.shelfLifeDays);
        System.assertEquals(null, mappingsOfferDTO.lifeTimeDays);
        System.assertEquals(null, mappingsOfferDTO.guaranteePeriodDays);
        System.assertEquals(null, mappingsOfferDTO.processingState);
        System.assertEquals(null, mappingsOfferDTO.availability);
        System.assertEquals(null, mappingsOfferDTO.shelfLife);
        System.assertEquals(null, mappingsOfferDTO.lifeTime);
        System.assertEquals(null, mappingsOfferDTO.guaranteePeriod);
        System.assertEquals(null, mappingsOfferDTO.certificate);
        System.assertEquals(null, mappingsOfferDTO.price);
    }
}
