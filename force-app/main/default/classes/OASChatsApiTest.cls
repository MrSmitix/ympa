@isTest
private class OASChatsApiTest {
    /**
     * Создание нового чата с покупателем
     *
     * Создает новый чат с покупателем.\n\n|**⚙️ Лимит:** 1000 запросов в час|\n|-|\n
     */
    @isTest
    private static void createChatTest() {
        HttpResponse res = new HttpResponse();
        res.setStatusCode(200);
        res.setStatus('OK');
        Test.setMock(HttpCalloutMock.class, new OASResponseMock(res));

        Map<String, Object> params = new Map<String, Object>{
            'businessId' => 2147483648L,
            'oaSCreateChatRequest' => ''
        };

        OASClient client;
        OASChatsApi api;
        OASCreateChatResponse response;
        OASCreateChatResponse expectedResponse;
        String js = '';

        client = new OASClient();
        api = new OASChatsApi(client);

        js = JSON.serialize(OASCreateChatResponse.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASCreateChatResponse.getExample();
        response = (OASCreateChatResponse) api.createChat(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASCreateChatResponse.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASCreateChatResponse.getExample();
        response = (OASCreateChatResponse) api.createChat(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASCreateChatResponse.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASCreateChatResponse.getExample();
        response = (OASCreateChatResponse) api.createChat(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASCreateChatResponse.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASCreateChatResponse.getExample();
        response = (OASCreateChatResponse) api.createChat(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASCreateChatResponse.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASCreateChatResponse.getExample();
        response = (OASCreateChatResponse) api.createChat(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASCreateChatResponse.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASCreateChatResponse.getExample();
        response = (OASCreateChatResponse) api.createChat(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASCreateChatResponse.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASCreateChatResponse.getExample();
        response = (OASCreateChatResponse) api.createChat(params);
        System.assertEquals(expectedResponse, response);
    }

    /**
     * Получение истории сообщений в чате
     *
     * Возвращает историю сообщений в чате с покупателем.\n\n|**⚙️ Лимит:** 10000 запросов в час|\n|-|\n
     */
    @isTest
    private static void getChatHistoryTest() {
        HttpResponse res = new HttpResponse();
        res.setStatusCode(200);
        res.setStatus('OK');
        Test.setMock(HttpCalloutMock.class, new OASResponseMock(res));

        Map<String, Object> params = new Map<String, Object>{
            'businessId' => 2147483648L,
            'chatId' => 2147483648L,
            'oaSGetChatHistoryRequest' => '',
            'pageToken' => eyBuZXh0SWQ6IDIzNDIgfQ==,
            'r_limit' => 20
        };

        OASClient client;
        OASChatsApi api;
        OASGetChatHistoryResponse response;
        OASGetChatHistoryResponse expectedResponse;
        String js = '';

        client = new OASClient();
        api = new OASChatsApi(client);

        js = JSON.serialize(OASGetChatHistoryResponse.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASGetChatHistoryResponse.getExample();
        response = (OASGetChatHistoryResponse) api.getChatHistory(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASGetChatHistoryResponse.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASGetChatHistoryResponse.getExample();
        response = (OASGetChatHistoryResponse) api.getChatHistory(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASGetChatHistoryResponse.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASGetChatHistoryResponse.getExample();
        response = (OASGetChatHistoryResponse) api.getChatHistory(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASGetChatHistoryResponse.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASGetChatHistoryResponse.getExample();
        response = (OASGetChatHistoryResponse) api.getChatHistory(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASGetChatHistoryResponse.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASGetChatHistoryResponse.getExample();
        response = (OASGetChatHistoryResponse) api.getChatHistory(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASGetChatHistoryResponse.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASGetChatHistoryResponse.getExample();
        response = (OASGetChatHistoryResponse) api.getChatHistory(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASGetChatHistoryResponse.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASGetChatHistoryResponse.getExample();
        response = (OASGetChatHistoryResponse) api.getChatHistory(params);
        System.assertEquals(expectedResponse, response);
    }

    /**
     * Получение доступных чатов
     *
     * Возвращает ваши чаты с покупателями.\n\n|**⚙️ Лимит:** 10000 запросов в час|\n|-|\n
     */
    @isTest
    private static void getChatsTest() {
        HttpResponse res = new HttpResponse();
        res.setStatusCode(200);
        res.setStatus('OK');
        Test.setMock(HttpCalloutMock.class, new OASResponseMock(res));

        Map<String, Object> params = new Map<String, Object>{
            'businessId' => 2147483648L,
            'oaSGetChatsRequest' => '',
            'pageToken' => eyBuZXh0SWQ6IDIzNDIgfQ==,
            'r_limit' => 20
        };

        OASClient client;
        OASChatsApi api;
        OASGetChatsResponse response;
        OASGetChatsResponse expectedResponse;
        String js = '';

        client = new OASClient();
        api = new OASChatsApi(client);

        js = JSON.serialize(OASGetChatsResponse.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASGetChatsResponse.getExample();
        response = (OASGetChatsResponse) api.getChats(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASGetChatsResponse.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASGetChatsResponse.getExample();
        response = (OASGetChatsResponse) api.getChats(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASGetChatsResponse.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASGetChatsResponse.getExample();
        response = (OASGetChatsResponse) api.getChats(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASGetChatsResponse.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASGetChatsResponse.getExample();
        response = (OASGetChatsResponse) api.getChats(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASGetChatsResponse.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASGetChatsResponse.getExample();
        response = (OASGetChatsResponse) api.getChats(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASGetChatsResponse.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASGetChatsResponse.getExample();
        response = (OASGetChatsResponse) api.getChats(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASGetChatsResponse.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASGetChatsResponse.getExample();
        response = (OASGetChatsResponse) api.getChats(params);
        System.assertEquals(expectedResponse, response);
    }

    /**
     * Отправка файла в чат
     *
     * Отправляет файл в чат с покупателем.\n\n|**⚙️ Лимит:** 1000 запросов в час|\n|-|\n
     */
    @isTest
    private static void sendFileToChatTest() {
        HttpResponse res = new HttpResponse();
        res.setStatusCode(200);
        res.setStatus('OK');
        Test.setMock(HttpCalloutMock.class, new OASResponseMock(res));

        Map<String, Object> params = new Map<String, Object>{
            'businessId' => 2147483648L,
            'chatId' => 2147483648L,
            'file' => Blob.valueOf('Sample text file\nContents')
        };

        OASClient client;
        OASChatsApi api;
        OASEmptyApiResponse response;
        OASEmptyApiResponse expectedResponse;
        String js = '';

        client = new OASClient();
        api = new OASChatsApi(client);

        js = JSON.serialize(OASEmptyApiResponse.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASEmptyApiResponse.getExample();
        response = (OASEmptyApiResponse) api.sendFileToChat(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASEmptyApiResponse.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASEmptyApiResponse.getExample();
        response = (OASEmptyApiResponse) api.sendFileToChat(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASEmptyApiResponse.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASEmptyApiResponse.getExample();
        response = (OASEmptyApiResponse) api.sendFileToChat(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASEmptyApiResponse.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASEmptyApiResponse.getExample();
        response = (OASEmptyApiResponse) api.sendFileToChat(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASEmptyApiResponse.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASEmptyApiResponse.getExample();
        response = (OASEmptyApiResponse) api.sendFileToChat(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASEmptyApiResponse.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASEmptyApiResponse.getExample();
        response = (OASEmptyApiResponse) api.sendFileToChat(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASEmptyApiResponse.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASEmptyApiResponse.getExample();
        response = (OASEmptyApiResponse) api.sendFileToChat(params);
        System.assertEquals(expectedResponse, response);
    }

    /**
     * Отправка сообщения в чат
     *
     * Отправляет сообщение в чат с покупателем.\n\n|**⚙️ Лимит:** 1000 запросов в час|\n|-|\n
     */
    @isTest
    private static void sendMessageToChatTest() {
        HttpResponse res = new HttpResponse();
        res.setStatusCode(200);
        res.setStatus('OK');
        Test.setMock(HttpCalloutMock.class, new OASResponseMock(res));

        Map<String, Object> params = new Map<String, Object>{
            'businessId' => 2147483648L,
            'chatId' => 2147483648L,
            'oaSSendMessageToChatRequest' => ''
        };

        OASClient client;
        OASChatsApi api;
        OASEmptyApiResponse response;
        OASEmptyApiResponse expectedResponse;
        String js = '';

        client = new OASClient();
        api = new OASChatsApi(client);

        js = JSON.serialize(OASEmptyApiResponse.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASEmptyApiResponse.getExample();
        response = (OASEmptyApiResponse) api.sendMessageToChat(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASEmptyApiResponse.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASEmptyApiResponse.getExample();
        response = (OASEmptyApiResponse) api.sendMessageToChat(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASEmptyApiResponse.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASEmptyApiResponse.getExample();
        response = (OASEmptyApiResponse) api.sendMessageToChat(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASEmptyApiResponse.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASEmptyApiResponse.getExample();
        response = (OASEmptyApiResponse) api.sendMessageToChat(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASEmptyApiResponse.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASEmptyApiResponse.getExample();
        response = (OASEmptyApiResponse) api.sendMessageToChat(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASEmptyApiResponse.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASEmptyApiResponse.getExample();
        response = (OASEmptyApiResponse) api.sendMessageToChat(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASEmptyApiResponse.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASEmptyApiResponse.getExample();
        response = (OASEmptyApiResponse) api.sendMessageToChat(params);
        System.assertEquals(expectedResponse, response);
    }
}