@isTest
private class OASOrderBusinessDocumentsDTOTest {
    @isTest
    private static void equalsSameInstance() {
        OASOrderBusinessDocumentsDTO orderBusinessDocumentsDTO1 = OASOrderBusinessDocumentsDTO.getExample();
        OASOrderBusinessDocumentsDTO orderBusinessDocumentsDTO2 = orderBusinessDocumentsDTO1;
        OASOrderBusinessDocumentsDTO orderBusinessDocumentsDTO3 = new OASOrderBusinessDocumentsDTO();
        OASOrderBusinessDocumentsDTO orderBusinessDocumentsDTO4 = orderBusinessDocumentsDTO3;

        System.assert(orderBusinessDocumentsDTO1.equals(orderBusinessDocumentsDTO2));
        System.assert(orderBusinessDocumentsDTO2.equals(orderBusinessDocumentsDTO1));
        System.assert(orderBusinessDocumentsDTO1.equals(orderBusinessDocumentsDTO1));
        System.assert(orderBusinessDocumentsDTO3.equals(orderBusinessDocumentsDTO4));
        System.assert(orderBusinessDocumentsDTO4.equals(orderBusinessDocumentsDTO3));
        System.assert(orderBusinessDocumentsDTO3.equals(orderBusinessDocumentsDTO3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASOrderBusinessDocumentsDTO orderBusinessDocumentsDTO1 = OASOrderBusinessDocumentsDTO.getExample();
        OASOrderBusinessDocumentsDTO orderBusinessDocumentsDTO2 = OASOrderBusinessDocumentsDTO.getExample();
        OASOrderBusinessDocumentsDTO orderBusinessDocumentsDTO3 = new OASOrderBusinessDocumentsDTO();
        OASOrderBusinessDocumentsDTO orderBusinessDocumentsDTO4 = new OASOrderBusinessDocumentsDTO();

        System.assert(orderBusinessDocumentsDTO1.equals(orderBusinessDocumentsDTO2));
        System.assert(orderBusinessDocumentsDTO2.equals(orderBusinessDocumentsDTO1));
        System.assert(orderBusinessDocumentsDTO3.equals(orderBusinessDocumentsDTO4));
        System.assert(orderBusinessDocumentsDTO4.equals(orderBusinessDocumentsDTO3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASOrderBusinessDocumentsDTO orderBusinessDocumentsDTO1 = OASOrderBusinessDocumentsDTO.getExample();
        OASOrderBusinessDocumentsDTO orderBusinessDocumentsDTO2 = new OASOrderBusinessDocumentsDTO();

        System.assertEquals(false, orderBusinessDocumentsDTO1.equals('foo'));
        System.assertEquals(false, orderBusinessDocumentsDTO2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASOrderBusinessDocumentsDTO orderBusinessDocumentsDTO1 = OASOrderBusinessDocumentsDTO.getExample();
        OASOrderBusinessDocumentsDTO orderBusinessDocumentsDTO2 = new OASOrderBusinessDocumentsDTO();
        OASOrderBusinessDocumentsDTO orderBusinessDocumentsDTO3;

        System.assertEquals(false, orderBusinessDocumentsDTO1.equals(orderBusinessDocumentsDTO3));
        System.assertEquals(false, orderBusinessDocumentsDTO2.equals(orderBusinessDocumentsDTO3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASOrderBusinessDocumentsDTO orderBusinessDocumentsDTO1 = OASOrderBusinessDocumentsDTO.getExample();
        OASOrderBusinessDocumentsDTO orderBusinessDocumentsDTO2 = new OASOrderBusinessDocumentsDTO();

        System.assertEquals(orderBusinessDocumentsDTO1.hashCode(), orderBusinessDocumentsDTO1.hashCode());
        System.assertEquals(orderBusinessDocumentsDTO2.hashCode(), orderBusinessDocumentsDTO2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASOrderBusinessDocumentsDTO orderBusinessDocumentsDTO1 = OASOrderBusinessDocumentsDTO.getExample();
        OASOrderBusinessDocumentsDTO orderBusinessDocumentsDTO2 = OASOrderBusinessDocumentsDTO.getExample();
        OASOrderBusinessDocumentsDTO orderBusinessDocumentsDTO3 = new OASOrderBusinessDocumentsDTO();
        OASOrderBusinessDocumentsDTO orderBusinessDocumentsDTO4 = new OASOrderBusinessDocumentsDTO();

        System.assert(orderBusinessDocumentsDTO1.equals(orderBusinessDocumentsDTO2));
        System.assert(orderBusinessDocumentsDTO3.equals(orderBusinessDocumentsDTO4));
        System.assertEquals(orderBusinessDocumentsDTO1.hashCode(), orderBusinessDocumentsDTO2.hashCode());
        System.assertEquals(orderBusinessDocumentsDTO3.hashCode(), orderBusinessDocumentsDTO4.hashCode());
    }
}
