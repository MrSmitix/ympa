@isTest
private class OASChatMessageDTOTest {
    @isTest
    private static void equalsSameInstance() {
        OASChatMessageDTO chatMessageDTO1 = OASChatMessageDTO.getExample();
        OASChatMessageDTO chatMessageDTO2 = chatMessageDTO1;
        OASChatMessageDTO chatMessageDTO3 = new OASChatMessageDTO();
        OASChatMessageDTO chatMessageDTO4 = chatMessageDTO3;

        System.assert(chatMessageDTO1.equals(chatMessageDTO2));
        System.assert(chatMessageDTO2.equals(chatMessageDTO1));
        System.assert(chatMessageDTO1.equals(chatMessageDTO1));
        System.assert(chatMessageDTO3.equals(chatMessageDTO4));
        System.assert(chatMessageDTO4.equals(chatMessageDTO3));
        System.assert(chatMessageDTO3.equals(chatMessageDTO3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASChatMessageDTO chatMessageDTO1 = OASChatMessageDTO.getExample();
        OASChatMessageDTO chatMessageDTO2 = OASChatMessageDTO.getExample();
        OASChatMessageDTO chatMessageDTO3 = new OASChatMessageDTO();
        OASChatMessageDTO chatMessageDTO4 = new OASChatMessageDTO();

        System.assert(chatMessageDTO1.equals(chatMessageDTO2));
        System.assert(chatMessageDTO2.equals(chatMessageDTO1));
        System.assert(chatMessageDTO3.equals(chatMessageDTO4));
        System.assert(chatMessageDTO4.equals(chatMessageDTO3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASChatMessageDTO chatMessageDTO1 = OASChatMessageDTO.getExample();
        OASChatMessageDTO chatMessageDTO2 = new OASChatMessageDTO();

        System.assertEquals(false, chatMessageDTO1.equals('foo'));
        System.assertEquals(false, chatMessageDTO2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASChatMessageDTO chatMessageDTO1 = OASChatMessageDTO.getExample();
        OASChatMessageDTO chatMessageDTO2 = new OASChatMessageDTO();
        OASChatMessageDTO chatMessageDTO3;

        System.assertEquals(false, chatMessageDTO1.equals(chatMessageDTO3));
        System.assertEquals(false, chatMessageDTO2.equals(chatMessageDTO3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASChatMessageDTO chatMessageDTO1 = OASChatMessageDTO.getExample();
        OASChatMessageDTO chatMessageDTO2 = new OASChatMessageDTO();

        System.assertEquals(chatMessageDTO1.hashCode(), chatMessageDTO1.hashCode());
        System.assertEquals(chatMessageDTO2.hashCode(), chatMessageDTO2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASChatMessageDTO chatMessageDTO1 = OASChatMessageDTO.getExample();
        OASChatMessageDTO chatMessageDTO2 = OASChatMessageDTO.getExample();
        OASChatMessageDTO chatMessageDTO3 = new OASChatMessageDTO();
        OASChatMessageDTO chatMessageDTO4 = new OASChatMessageDTO();

        System.assert(chatMessageDTO1.equals(chatMessageDTO2));
        System.assert(chatMessageDTO3.equals(chatMessageDTO4));
        System.assertEquals(chatMessageDTO1.hashCode(), chatMessageDTO2.hashCode());
        System.assertEquals(chatMessageDTO3.hashCode(), chatMessageDTO4.hashCode());
    }

    @isTest
    private static void defaultValuesPopulated() {
        OASChatMessageDTO chatMessageDTO = new OASChatMessageDTO();
        System.assertEquals(new List<OASChatMessagePayloadDTO>(), chatMessageDTO.payload);
        System.assertEquals(null, chatMessageDTO.messageId);
        System.assertEquals(null, chatMessageDTO.createdAt);
        System.assertEquals(null, chatMessageDTO.sender);
        System.assertEquals(null, chatMessageDTO.message);
    }
}
