@isTest
private class OASCreateChatResultDTOTest {
    @isTest
    private static void equalsSameInstance() {
        OASCreateChatResultDTO createChatResultDTO1 = OASCreateChatResultDTO.getExample();
        OASCreateChatResultDTO createChatResultDTO2 = createChatResultDTO1;
        OASCreateChatResultDTO createChatResultDTO3 = new OASCreateChatResultDTO();
        OASCreateChatResultDTO createChatResultDTO4 = createChatResultDTO3;

        System.assert(createChatResultDTO1.equals(createChatResultDTO2));
        System.assert(createChatResultDTO2.equals(createChatResultDTO1));
        System.assert(createChatResultDTO1.equals(createChatResultDTO1));
        System.assert(createChatResultDTO3.equals(createChatResultDTO4));
        System.assert(createChatResultDTO4.equals(createChatResultDTO3));
        System.assert(createChatResultDTO3.equals(createChatResultDTO3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASCreateChatResultDTO createChatResultDTO1 = OASCreateChatResultDTO.getExample();
        OASCreateChatResultDTO createChatResultDTO2 = OASCreateChatResultDTO.getExample();
        OASCreateChatResultDTO createChatResultDTO3 = new OASCreateChatResultDTO();
        OASCreateChatResultDTO createChatResultDTO4 = new OASCreateChatResultDTO();

        System.assert(createChatResultDTO1.equals(createChatResultDTO2));
        System.assert(createChatResultDTO2.equals(createChatResultDTO1));
        System.assert(createChatResultDTO3.equals(createChatResultDTO4));
        System.assert(createChatResultDTO4.equals(createChatResultDTO3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASCreateChatResultDTO createChatResultDTO1 = OASCreateChatResultDTO.getExample();
        OASCreateChatResultDTO createChatResultDTO2 = new OASCreateChatResultDTO();

        System.assertEquals(false, createChatResultDTO1.equals('foo'));
        System.assertEquals(false, createChatResultDTO2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASCreateChatResultDTO createChatResultDTO1 = OASCreateChatResultDTO.getExample();
        OASCreateChatResultDTO createChatResultDTO2 = new OASCreateChatResultDTO();
        OASCreateChatResultDTO createChatResultDTO3;

        System.assertEquals(false, createChatResultDTO1.equals(createChatResultDTO3));
        System.assertEquals(false, createChatResultDTO2.equals(createChatResultDTO3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASCreateChatResultDTO createChatResultDTO1 = OASCreateChatResultDTO.getExample();
        OASCreateChatResultDTO createChatResultDTO2 = new OASCreateChatResultDTO();

        System.assertEquals(createChatResultDTO1.hashCode(), createChatResultDTO1.hashCode());
        System.assertEquals(createChatResultDTO2.hashCode(), createChatResultDTO2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASCreateChatResultDTO createChatResultDTO1 = OASCreateChatResultDTO.getExample();
        OASCreateChatResultDTO createChatResultDTO2 = OASCreateChatResultDTO.getExample();
        OASCreateChatResultDTO createChatResultDTO3 = new OASCreateChatResultDTO();
        OASCreateChatResultDTO createChatResultDTO4 = new OASCreateChatResultDTO();

        System.assert(createChatResultDTO1.equals(createChatResultDTO2));
        System.assert(createChatResultDTO3.equals(createChatResultDTO4));
        System.assertEquals(createChatResultDTO1.hashCode(), createChatResultDTO2.hashCode());
        System.assertEquals(createChatResultDTO3.hashCode(), createChatResultDTO4.hashCode());
    }
}
