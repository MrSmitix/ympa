@isTest
private class OASQuarantineOfferDTOTest {
    @isTest
    private static void equalsSameInstance() {
        OASQuarantineOfferDTO quarantineOfferDTO1 = OASQuarantineOfferDTO.getExample();
        OASQuarantineOfferDTO quarantineOfferDTO2 = quarantineOfferDTO1;
        OASQuarantineOfferDTO quarantineOfferDTO3 = new OASQuarantineOfferDTO();
        OASQuarantineOfferDTO quarantineOfferDTO4 = quarantineOfferDTO3;

        System.assert(quarantineOfferDTO1.equals(quarantineOfferDTO2));
        System.assert(quarantineOfferDTO2.equals(quarantineOfferDTO1));
        System.assert(quarantineOfferDTO1.equals(quarantineOfferDTO1));
        System.assert(quarantineOfferDTO3.equals(quarantineOfferDTO4));
        System.assert(quarantineOfferDTO4.equals(quarantineOfferDTO3));
        System.assert(quarantineOfferDTO3.equals(quarantineOfferDTO3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASQuarantineOfferDTO quarantineOfferDTO1 = OASQuarantineOfferDTO.getExample();
        OASQuarantineOfferDTO quarantineOfferDTO2 = OASQuarantineOfferDTO.getExample();
        OASQuarantineOfferDTO quarantineOfferDTO3 = new OASQuarantineOfferDTO();
        OASQuarantineOfferDTO quarantineOfferDTO4 = new OASQuarantineOfferDTO();

        System.assert(quarantineOfferDTO1.equals(quarantineOfferDTO2));
        System.assert(quarantineOfferDTO2.equals(quarantineOfferDTO1));
        System.assert(quarantineOfferDTO3.equals(quarantineOfferDTO4));
        System.assert(quarantineOfferDTO4.equals(quarantineOfferDTO3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASQuarantineOfferDTO quarantineOfferDTO1 = OASQuarantineOfferDTO.getExample();
        OASQuarantineOfferDTO quarantineOfferDTO2 = new OASQuarantineOfferDTO();

        System.assertEquals(false, quarantineOfferDTO1.equals('foo'));
        System.assertEquals(false, quarantineOfferDTO2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASQuarantineOfferDTO quarantineOfferDTO1 = OASQuarantineOfferDTO.getExample();
        OASQuarantineOfferDTO quarantineOfferDTO2 = new OASQuarantineOfferDTO();
        OASQuarantineOfferDTO quarantineOfferDTO3;

        System.assertEquals(false, quarantineOfferDTO1.equals(quarantineOfferDTO3));
        System.assertEquals(false, quarantineOfferDTO2.equals(quarantineOfferDTO3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASQuarantineOfferDTO quarantineOfferDTO1 = OASQuarantineOfferDTO.getExample();
        OASQuarantineOfferDTO quarantineOfferDTO2 = new OASQuarantineOfferDTO();

        System.assertEquals(quarantineOfferDTO1.hashCode(), quarantineOfferDTO1.hashCode());
        System.assertEquals(quarantineOfferDTO2.hashCode(), quarantineOfferDTO2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASQuarantineOfferDTO quarantineOfferDTO1 = OASQuarantineOfferDTO.getExample();
        OASQuarantineOfferDTO quarantineOfferDTO2 = OASQuarantineOfferDTO.getExample();
        OASQuarantineOfferDTO quarantineOfferDTO3 = new OASQuarantineOfferDTO();
        OASQuarantineOfferDTO quarantineOfferDTO4 = new OASQuarantineOfferDTO();

        System.assert(quarantineOfferDTO1.equals(quarantineOfferDTO2));
        System.assert(quarantineOfferDTO3.equals(quarantineOfferDTO4));
        System.assertEquals(quarantineOfferDTO1.hashCode(), quarantineOfferDTO2.hashCode());
        System.assertEquals(quarantineOfferDTO3.hashCode(), quarantineOfferDTO4.hashCode());
    }

    @isTest
    private static void defaultValuesPopulated() {
        OASQuarantineOfferDTO quarantineOfferDTO = new OASQuarantineOfferDTO();
        System.assertEquals(new List<OASPriceQuarantineVerdictDTO>(), quarantineOfferDTO.verdicts);
        System.assertEquals(null, quarantineOfferDTO.offerId);
        System.assertEquals(null, quarantineOfferDTO.currentPrice);
        System.assertEquals(null, quarantineOfferDTO.lastValidPrice);
    }
}
