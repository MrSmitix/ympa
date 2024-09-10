@isTest
private class OASChatMessagePayloadDTOTest {
    @isTest
    private static void equalsSameInstance() {
        OASChatMessagePayloadDTO chatMessagePayloadDTO1 = OASChatMessagePayloadDTO.getExample();
        OASChatMessagePayloadDTO chatMessagePayloadDTO2 = chatMessagePayloadDTO1;
        OASChatMessagePayloadDTO chatMessagePayloadDTO3 = new OASChatMessagePayloadDTO();
        OASChatMessagePayloadDTO chatMessagePayloadDTO4 = chatMessagePayloadDTO3;

        System.assert(chatMessagePayloadDTO1.equals(chatMessagePayloadDTO2));
        System.assert(chatMessagePayloadDTO2.equals(chatMessagePayloadDTO1));
        System.assert(chatMessagePayloadDTO1.equals(chatMessagePayloadDTO1));
        System.assert(chatMessagePayloadDTO3.equals(chatMessagePayloadDTO4));
        System.assert(chatMessagePayloadDTO4.equals(chatMessagePayloadDTO3));
        System.assert(chatMessagePayloadDTO3.equals(chatMessagePayloadDTO3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASChatMessagePayloadDTO chatMessagePayloadDTO1 = OASChatMessagePayloadDTO.getExample();
        OASChatMessagePayloadDTO chatMessagePayloadDTO2 = OASChatMessagePayloadDTO.getExample();
        OASChatMessagePayloadDTO chatMessagePayloadDTO3 = new OASChatMessagePayloadDTO();
        OASChatMessagePayloadDTO chatMessagePayloadDTO4 = new OASChatMessagePayloadDTO();

        System.assert(chatMessagePayloadDTO1.equals(chatMessagePayloadDTO2));
        System.assert(chatMessagePayloadDTO2.equals(chatMessagePayloadDTO1));
        System.assert(chatMessagePayloadDTO3.equals(chatMessagePayloadDTO4));
        System.assert(chatMessagePayloadDTO4.equals(chatMessagePayloadDTO3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASChatMessagePayloadDTO chatMessagePayloadDTO1 = OASChatMessagePayloadDTO.getExample();
        OASChatMessagePayloadDTO chatMessagePayloadDTO2 = new OASChatMessagePayloadDTO();

        System.assertEquals(false, chatMessagePayloadDTO1.equals('foo'));
        System.assertEquals(false, chatMessagePayloadDTO2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASChatMessagePayloadDTO chatMessagePayloadDTO1 = OASChatMessagePayloadDTO.getExample();
        OASChatMessagePayloadDTO chatMessagePayloadDTO2 = new OASChatMessagePayloadDTO();
        OASChatMessagePayloadDTO chatMessagePayloadDTO3;

        System.assertEquals(false, chatMessagePayloadDTO1.equals(chatMessagePayloadDTO3));
        System.assertEquals(false, chatMessagePayloadDTO2.equals(chatMessagePayloadDTO3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASChatMessagePayloadDTO chatMessagePayloadDTO1 = OASChatMessagePayloadDTO.getExample();
        OASChatMessagePayloadDTO chatMessagePayloadDTO2 = new OASChatMessagePayloadDTO();

        System.assertEquals(chatMessagePayloadDTO1.hashCode(), chatMessagePayloadDTO1.hashCode());
        System.assertEquals(chatMessagePayloadDTO2.hashCode(), chatMessagePayloadDTO2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASChatMessagePayloadDTO chatMessagePayloadDTO1 = OASChatMessagePayloadDTO.getExample();
        OASChatMessagePayloadDTO chatMessagePayloadDTO2 = OASChatMessagePayloadDTO.getExample();
        OASChatMessagePayloadDTO chatMessagePayloadDTO3 = new OASChatMessagePayloadDTO();
        OASChatMessagePayloadDTO chatMessagePayloadDTO4 = new OASChatMessagePayloadDTO();

        System.assert(chatMessagePayloadDTO1.equals(chatMessagePayloadDTO2));
        System.assert(chatMessagePayloadDTO3.equals(chatMessagePayloadDTO4));
        System.assertEquals(chatMessagePayloadDTO1.hashCode(), chatMessagePayloadDTO2.hashCode());
        System.assertEquals(chatMessagePayloadDTO3.hashCode(), chatMessagePayloadDTO4.hashCode());
    }
}
