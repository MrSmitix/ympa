@isTest
private class OASGetChatInfoDTOTest {
    @isTest
    private static void equalsSameInstance() {
        OASGetChatInfoDTO getChatInfoDTO1 = OASGetChatInfoDTO.getExample();
        OASGetChatInfoDTO getChatInfoDTO2 = getChatInfoDTO1;
        OASGetChatInfoDTO getChatInfoDTO3 = new OASGetChatInfoDTO();
        OASGetChatInfoDTO getChatInfoDTO4 = getChatInfoDTO3;

        System.assert(getChatInfoDTO1.equals(getChatInfoDTO2));
        System.assert(getChatInfoDTO2.equals(getChatInfoDTO1));
        System.assert(getChatInfoDTO1.equals(getChatInfoDTO1));
        System.assert(getChatInfoDTO3.equals(getChatInfoDTO4));
        System.assert(getChatInfoDTO4.equals(getChatInfoDTO3));
        System.assert(getChatInfoDTO3.equals(getChatInfoDTO3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASGetChatInfoDTO getChatInfoDTO1 = OASGetChatInfoDTO.getExample();
        OASGetChatInfoDTO getChatInfoDTO2 = OASGetChatInfoDTO.getExample();
        OASGetChatInfoDTO getChatInfoDTO3 = new OASGetChatInfoDTO();
        OASGetChatInfoDTO getChatInfoDTO4 = new OASGetChatInfoDTO();

        System.assert(getChatInfoDTO1.equals(getChatInfoDTO2));
        System.assert(getChatInfoDTO2.equals(getChatInfoDTO1));
        System.assert(getChatInfoDTO3.equals(getChatInfoDTO4));
        System.assert(getChatInfoDTO4.equals(getChatInfoDTO3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASGetChatInfoDTO getChatInfoDTO1 = OASGetChatInfoDTO.getExample();
        OASGetChatInfoDTO getChatInfoDTO2 = new OASGetChatInfoDTO();

        System.assertEquals(false, getChatInfoDTO1.equals('foo'));
        System.assertEquals(false, getChatInfoDTO2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASGetChatInfoDTO getChatInfoDTO1 = OASGetChatInfoDTO.getExample();
        OASGetChatInfoDTO getChatInfoDTO2 = new OASGetChatInfoDTO();
        OASGetChatInfoDTO getChatInfoDTO3;

        System.assertEquals(false, getChatInfoDTO1.equals(getChatInfoDTO3));
        System.assertEquals(false, getChatInfoDTO2.equals(getChatInfoDTO3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASGetChatInfoDTO getChatInfoDTO1 = OASGetChatInfoDTO.getExample();
        OASGetChatInfoDTO getChatInfoDTO2 = new OASGetChatInfoDTO();

        System.assertEquals(getChatInfoDTO1.hashCode(), getChatInfoDTO1.hashCode());
        System.assertEquals(getChatInfoDTO2.hashCode(), getChatInfoDTO2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASGetChatInfoDTO getChatInfoDTO1 = OASGetChatInfoDTO.getExample();
        OASGetChatInfoDTO getChatInfoDTO2 = OASGetChatInfoDTO.getExample();
        OASGetChatInfoDTO getChatInfoDTO3 = new OASGetChatInfoDTO();
        OASGetChatInfoDTO getChatInfoDTO4 = new OASGetChatInfoDTO();

        System.assert(getChatInfoDTO1.equals(getChatInfoDTO2));
        System.assert(getChatInfoDTO3.equals(getChatInfoDTO4));
        System.assertEquals(getChatInfoDTO1.hashCode(), getChatInfoDTO2.hashCode());
        System.assertEquals(getChatInfoDTO3.hashCode(), getChatInfoDTO4.hashCode());
    }
}
