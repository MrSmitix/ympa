@isTest
private class OASPromosApiTest {
    /**
     * Удаление товаров из акции
     *
     * Убирает товары из акции.\n\nИзменения начинают действовать в течение 4–6 часов.\n\n|**⚙️ Лимит:** 10000 запросов в час|\n|-|\n
     */
    @isTest
    private static void deletePromoOffersTest() {
        HttpResponse res = new HttpResponse();
        res.setStatusCode(200);
        res.setStatus('OK');
        Test.setMock(HttpCalloutMock.class, new OASResponseMock(res));

        Map<String, Object> params = new Map<String, Object>{
            'businessId' => 2147483648L,
            'oaSDeletePromoOffersRequest' => ''
        };

        OASClient client;
        OASPromosApi api;
        OASDeletePromoOffersResponse response;
        OASDeletePromoOffersResponse expectedResponse;
        String js = '';

        client = new OASClient();
        api = new OASPromosApi(client);

        js = JSON.serialize(OASDeletePromoOffersResponse.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASDeletePromoOffersResponse.getExample();
        response = (OASDeletePromoOffersResponse) api.deletePromoOffers(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASDeletePromoOffersResponse.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASDeletePromoOffersResponse.getExample();
        response = (OASDeletePromoOffersResponse) api.deletePromoOffers(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASDeletePromoOffersResponse.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASDeletePromoOffersResponse.getExample();
        response = (OASDeletePromoOffersResponse) api.deletePromoOffers(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASDeletePromoOffersResponse.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASDeletePromoOffersResponse.getExample();
        response = (OASDeletePromoOffersResponse) api.deletePromoOffers(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASDeletePromoOffersResponse.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASDeletePromoOffersResponse.getExample();
        response = (OASDeletePromoOffersResponse) api.deletePromoOffers(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASDeletePromoOffersResponse.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASDeletePromoOffersResponse.getExample();
        response = (OASDeletePromoOffersResponse) api.deletePromoOffers(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASDeletePromoOffersResponse.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASDeletePromoOffersResponse.getExample();
        response = (OASDeletePromoOffersResponse) api.deletePromoOffers(params);
        System.assertEquals(expectedResponse, response);
    }

    /**
     * Получение списка товаров, которые участвуют или могут участвовать в акции
     *
     * Возвращает список товаров, которые участвуют или могут участвовать в акции.\n\n{% note warning %}\n\nВ параметре &#x60;limit&#x60; не передавайте значение больше 500.\n\n{% endnote %}\n\n|**⚙️ Лимит:** 10000 запросов в час|\n|-|\n
     */
    @isTest
    private static void getPromoOffersTest() {
        HttpResponse res = new HttpResponse();
        res.setStatusCode(200);
        res.setStatus('OK');
        Test.setMock(HttpCalloutMock.class, new OASResponseMock(res));

        Map<String, Object> params = new Map<String, Object>{
            'businessId' => 2147483648L,
            'oaSGetPromoOffersRequest' => '',
            'pageToken' => eyBuZXh0SWQ6IDIzNDIgfQ==,
            'r_limit' => 20
        };

        OASClient client;
        OASPromosApi api;
        OASGetPromoOffersResponse response;
        OASGetPromoOffersResponse expectedResponse;
        String js = '';

        client = new OASClient();
        api = new OASPromosApi(client);

        js = JSON.serialize(OASGetPromoOffersResponse.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASGetPromoOffersResponse.getExample();
        response = (OASGetPromoOffersResponse) api.getPromoOffers(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASGetPromoOffersResponse.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASGetPromoOffersResponse.getExample();
        response = (OASGetPromoOffersResponse) api.getPromoOffers(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASGetPromoOffersResponse.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASGetPromoOffersResponse.getExample();
        response = (OASGetPromoOffersResponse) api.getPromoOffers(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASGetPromoOffersResponse.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASGetPromoOffersResponse.getExample();
        response = (OASGetPromoOffersResponse) api.getPromoOffers(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASGetPromoOffersResponse.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASGetPromoOffersResponse.getExample();
        response = (OASGetPromoOffersResponse) api.getPromoOffers(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASGetPromoOffersResponse.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASGetPromoOffersResponse.getExample();
        response = (OASGetPromoOffersResponse) api.getPromoOffers(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASGetPromoOffersResponse.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASGetPromoOffersResponse.getExample();
        response = (OASGetPromoOffersResponse) api.getPromoOffers(params);
        System.assertEquals(expectedResponse, response);
    }

    /**
     * Получение списка акций
     *
     * Возвращает информацию об акциях Маркета.\n\nПо умолчанию возвращаются акции, в которых продавец участвует или может принять участие.\n\nЧтобы получить текущие или завершенные акции, передайте параметр &#x60;participation&#x60;.\n\nТипы акций, которые возвращаются в ответе:\n\n* прямая скидка;\n* флеш-акция;\n* скидка по промокоду.\n\n|**⚙️ Лимит:** 1000 запросов в час|\n|-|\n
     */
    @isTest
    private static void getPromosTest() {
        HttpResponse res = new HttpResponse();
        res.setStatusCode(200);
        res.setStatus('OK');
        Test.setMock(HttpCalloutMock.class, new OASResponseMock(res));

        Map<String, Object> params = new Map<String, Object>{
            'businessId' => 2147483648L,
            'oaSGetPromosRequest' => ''
        };

        OASClient client;
        OASPromosApi api;
        OASGetPromosResponse response;
        OASGetPromosResponse expectedResponse;
        String js = '';

        client = new OASClient();
        api = new OASPromosApi(client);

        js = JSON.serialize(OASGetPromosResponse.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASGetPromosResponse.getExample();
        response = (OASGetPromosResponse) api.getPromos(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASGetPromosResponse.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASGetPromosResponse.getExample();
        response = (OASGetPromosResponse) api.getPromos(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASGetPromosResponse.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASGetPromosResponse.getExample();
        response = (OASGetPromosResponse) api.getPromos(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASGetPromosResponse.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASGetPromosResponse.getExample();
        response = (OASGetPromosResponse) api.getPromos(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASGetPromosResponse.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASGetPromosResponse.getExample();
        response = (OASGetPromosResponse) api.getPromos(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASGetPromosResponse.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASGetPromosResponse.getExample();
        response = (OASGetPromosResponse) api.getPromos(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASGetPromosResponse.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASGetPromosResponse.getExample();
        response = (OASGetPromosResponse) api.getPromos(params);
        System.assertEquals(expectedResponse, response);
    }

    /**
     * Добавление товаров в акцию или изменение их цен
     *
     * Добавляет товары в акцию или изменяет цены на товары, которые участвуют в акции.\n\nИзменения начинают действовать в течение 4–6 часов.\n\n|**⚙️ Лимит:** 10000 запросов в час|\n|-|\n
     */
    @isTest
    private static void updatePromoOffersTest() {
        HttpResponse res = new HttpResponse();
        res.setStatusCode(200);
        res.setStatus('OK');
        Test.setMock(HttpCalloutMock.class, new OASResponseMock(res));

        Map<String, Object> params = new Map<String, Object>{
            'businessId' => 2147483648L,
            'oaSUpdatePromoOffersRequest' => ''
        };

        OASClient client;
        OASPromosApi api;
        OASUpdatePromoOffersResponse response;
        OASUpdatePromoOffersResponse expectedResponse;
        String js = '';

        client = new OASClient();
        api = new OASPromosApi(client);

        js = JSON.serialize(OASUpdatePromoOffersResponse.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASUpdatePromoOffersResponse.getExample();
        response = (OASUpdatePromoOffersResponse) api.updatePromoOffers(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASUpdatePromoOffersResponse.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASUpdatePromoOffersResponse.getExample();
        response = (OASUpdatePromoOffersResponse) api.updatePromoOffers(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASUpdatePromoOffersResponse.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASUpdatePromoOffersResponse.getExample();
        response = (OASUpdatePromoOffersResponse) api.updatePromoOffers(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASUpdatePromoOffersResponse.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASUpdatePromoOffersResponse.getExample();
        response = (OASUpdatePromoOffersResponse) api.updatePromoOffers(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASUpdatePromoOffersResponse.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASUpdatePromoOffersResponse.getExample();
        response = (OASUpdatePromoOffersResponse) api.updatePromoOffers(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASUpdatePromoOffersResponse.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASUpdatePromoOffersResponse.getExample();
        response = (OASUpdatePromoOffersResponse) api.updatePromoOffers(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASUpdatePromoOffersResponse.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASUpdatePromoOffersResponse.getExample();
        response = (OASUpdatePromoOffersResponse) api.updatePromoOffers(params);
        System.assertEquals(expectedResponse, response);
    }
}