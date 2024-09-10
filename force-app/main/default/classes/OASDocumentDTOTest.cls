@isTest
private class OASDocumentDTOTest {
    @isTest
    private static void equalsSameInstance() {
        OASDocumentDTO documentDTO1 = OASDocumentDTO.getExample();
        OASDocumentDTO documentDTO2 = documentDTO1;
        OASDocumentDTO documentDTO3 = new OASDocumentDTO();
        OASDocumentDTO documentDTO4 = documentDTO3;

        System.assert(documentDTO1.equals(documentDTO2));
        System.assert(documentDTO2.equals(documentDTO1));
        System.assert(documentDTO1.equals(documentDTO1));
        System.assert(documentDTO3.equals(documentDTO4));
        System.assert(documentDTO4.equals(documentDTO3));
        System.assert(documentDTO3.equals(documentDTO3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASDocumentDTO documentDTO1 = OASDocumentDTO.getExample();
        OASDocumentDTO documentDTO2 = OASDocumentDTO.getExample();
        OASDocumentDTO documentDTO3 = new OASDocumentDTO();
        OASDocumentDTO documentDTO4 = new OASDocumentDTO();

        System.assert(documentDTO1.equals(documentDTO2));
        System.assert(documentDTO2.equals(documentDTO1));
        System.assert(documentDTO3.equals(documentDTO4));
        System.assert(documentDTO4.equals(documentDTO3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASDocumentDTO documentDTO1 = OASDocumentDTO.getExample();
        OASDocumentDTO documentDTO2 = new OASDocumentDTO();

        System.assertEquals(false, documentDTO1.equals('foo'));
        System.assertEquals(false, documentDTO2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASDocumentDTO documentDTO1 = OASDocumentDTO.getExample();
        OASDocumentDTO documentDTO2 = new OASDocumentDTO();
        OASDocumentDTO documentDTO3;

        System.assertEquals(false, documentDTO1.equals(documentDTO3));
        System.assertEquals(false, documentDTO2.equals(documentDTO3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASDocumentDTO documentDTO1 = OASDocumentDTO.getExample();
        OASDocumentDTO documentDTO2 = new OASDocumentDTO();

        System.assertEquals(documentDTO1.hashCode(), documentDTO1.hashCode());
        System.assertEquals(documentDTO2.hashCode(), documentDTO2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASDocumentDTO documentDTO1 = OASDocumentDTO.getExample();
        OASDocumentDTO documentDTO2 = OASDocumentDTO.getExample();
        OASDocumentDTO documentDTO3 = new OASDocumentDTO();
        OASDocumentDTO documentDTO4 = new OASDocumentDTO();

        System.assert(documentDTO1.equals(documentDTO2));
        System.assert(documentDTO3.equals(documentDTO4));
        System.assertEquals(documentDTO1.hashCode(), documentDTO2.hashCode());
        System.assertEquals(documentDTO3.hashCode(), documentDTO4.hashCode());
    }

    @isTest
    private static void maintainRenamedProperties() {
        OASDocumentDTO documentDTO = new OASDocumentDTO();
        Map<String, String> x-property-mappings = documentDTO.getx-property-mappings();
        System.assertEquals('r_number', x-property-mappings.get('number'));
        System.assertEquals('r_date', x-property-mappings.get('date'));
    }
}
