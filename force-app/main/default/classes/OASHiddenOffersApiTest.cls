@isTest
private class OASHiddenOffersApiTest {
    /**
     * Скрытие товаров и настройки скрытия
     *
     * Скрывает товары магазина на Маркете.\n\n{% note info &quot;Данные в каталоге обновляются не мгновенно&quot; %}\n\nЭто занимает до нескольких минут.\n\n{% endnote %}\n\n|**⚙️ Лимит:** 5000 товаров в минуту|\n|-|\n
     */
    @isTest
    private static void addHiddenOffersTest() {
        HttpResponse res = new HttpResponse();
        res.setStatusCode(200);
        res.setStatus('OK');
        Test.setMock(HttpCalloutMock.class, new OASResponseMock(res));

        Map<String, Object> params = new Map<String, Object>{
            'campaignId' => 2147483648L,
            'oaSAddHiddenOffersRequest' => ''
        };

        OASClient client;
        OASHiddenOffersApi api;
        OASEmptyApiResponse response;
        OASEmptyApiResponse expectedResponse;
        String js = '';

        client = new OASClient();
        api = new OASHiddenOffersApi(client);

        js = JSON.serialize(OASEmptyApiResponse.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASEmptyApiResponse.getExample();
        response = (OASEmptyApiResponse) api.addHiddenOffers(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASEmptyApiResponse.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASEmptyApiResponse.getExample();
        response = (OASEmptyApiResponse) api.addHiddenOffers(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASEmptyApiResponse.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASEmptyApiResponse.getExample();
        response = (OASEmptyApiResponse) api.addHiddenOffers(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASEmptyApiResponse.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASEmptyApiResponse.getExample();
        response = (OASEmptyApiResponse) api.addHiddenOffers(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASEmptyApiResponse.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASEmptyApiResponse.getExample();
        response = (OASEmptyApiResponse) api.addHiddenOffers(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASEmptyApiResponse.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASEmptyApiResponse.getExample();
        response = (OASEmptyApiResponse) api.addHiddenOffers(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASEmptyApiResponse.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASEmptyApiResponse.getExample();
        response = (OASEmptyApiResponse) api.addHiddenOffers(params);
        System.assertEquals(expectedResponse, response);
    }

    /**
     * Возобновление показа товаров
     *
     * Возобновляет показ скрытых вами товаров магазина на Маркете.\n\n{% note info &quot;Данные в каталоге обновляются не мгновенно&quot; %}\n\nЭто занимает до нескольких минут.\n\n{% endnote %}\n\n|**⚙️ Лимит:** 5000 товаров в минуту|\n|-|\n
     */
    @isTest
    private static void deleteHiddenOffersTest() {
        HttpResponse res = new HttpResponse();
        res.setStatusCode(200);
        res.setStatus('OK');
        Test.setMock(HttpCalloutMock.class, new OASResponseMock(res));

        Map<String, Object> params = new Map<String, Object>{
            'campaignId' => 2147483648L,
            'oaSDeleteHiddenOffersRequest' => ''
        };

        OASClient client;
        OASHiddenOffersApi api;
        OASEmptyApiResponse response;
        OASEmptyApiResponse expectedResponse;
        String js = '';

        client = new OASClient();
        api = new OASHiddenOffersApi(client);

        js = JSON.serialize(OASEmptyApiResponse.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASEmptyApiResponse.getExample();
        response = (OASEmptyApiResponse) api.deleteHiddenOffers(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASEmptyApiResponse.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASEmptyApiResponse.getExample();
        response = (OASEmptyApiResponse) api.deleteHiddenOffers(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASEmptyApiResponse.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASEmptyApiResponse.getExample();
        response = (OASEmptyApiResponse) api.deleteHiddenOffers(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASEmptyApiResponse.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASEmptyApiResponse.getExample();
        response = (OASEmptyApiResponse) api.deleteHiddenOffers(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASEmptyApiResponse.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASEmptyApiResponse.getExample();
        response = (OASEmptyApiResponse) api.deleteHiddenOffers(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASEmptyApiResponse.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASEmptyApiResponse.getExample();
        response = (OASEmptyApiResponse) api.deleteHiddenOffers(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASEmptyApiResponse.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASEmptyApiResponse.getExample();
        response = (OASEmptyApiResponse) api.deleteHiddenOffers(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASEmptyApiResponse.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASEmptyApiResponse.getExample();
        response = (OASEmptyApiResponse) api.deleteHiddenOffers(params);
        System.assertEquals(expectedResponse, response);
    }

    /**
     * Информация о скрытых вами товарах
     *
     * Возвращает список скрытых вами товаров для заданного магазина.\n\nВ списке будут товары, скрытые любым способом — по API, с помощью YML-фида, в кабинете и так далее.\n\n|**⚙️ Лимит:** 5000 товаров в минуту, не более 500 товаров в одном запросе|\n|-|\n
     */
    @isTest
    private static void getHiddenOffersTest() {
        HttpResponse res = new HttpResponse();
        res.setStatusCode(200);
        res.setStatus('OK');
        Test.setMock(HttpCalloutMock.class, new OASResponseMock(res));

        Map<String, Object> params = new Map<String, Object>{
            'campaignId' => 2147483648L,
            'offerId' => new List<String>{''},
            'pageToken' => eyBuZXh0SWQ6IDIzNDIgfQ==,
            'r_limit' => 20,
            'offset' => '',
            'page' => '',
            'pageSize' => ''
        };

        OASClient client;
        OASHiddenOffersApi api;
        OASGetHiddenOffersResponse response;
        OASGetHiddenOffersResponse expectedResponse;
        String js = '';

        client = new OASClient();
        api = new OASHiddenOffersApi(client);

        js = JSON.serialize(OASGetHiddenOffersResponse.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASGetHiddenOffersResponse.getExample();
        response = (OASGetHiddenOffersResponse) api.getHiddenOffers(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASGetHiddenOffersResponse.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASGetHiddenOffersResponse.getExample();
        response = (OASGetHiddenOffersResponse) api.getHiddenOffers(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASGetHiddenOffersResponse.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASGetHiddenOffersResponse.getExample();
        response = (OASGetHiddenOffersResponse) api.getHiddenOffers(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASGetHiddenOffersResponse.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASGetHiddenOffersResponse.getExample();
        response = (OASGetHiddenOffersResponse) api.getHiddenOffers(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASGetHiddenOffersResponse.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASGetHiddenOffersResponse.getExample();
        response = (OASGetHiddenOffersResponse) api.getHiddenOffers(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASGetHiddenOffersResponse.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASGetHiddenOffersResponse.getExample();
        response = (OASGetHiddenOffersResponse) api.getHiddenOffers(params);
        System.assertEquals(expectedResponse, response);
    }
}