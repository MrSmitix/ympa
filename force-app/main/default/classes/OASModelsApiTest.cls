@isTest
private class OASModelsApiTest {
    /**
     * Информация об одной модели
     *
     * Возвращает информацию о модели товара.\n\nДля методов &#x60;GET models&#x60;, &#x60;GET models/{modelId}&#x60; и &#x60;POST models&#x60; действует групповое ресурсное ограничение. Ограничение вводится на суммарное количество моделей, информация о которых запрошена при помощи этих методов.\n\n|**⚙️ Лимит:** [рассчитывается индивидуально](*rule)|\n|-|\n\n[//]: &lt;&gt; (rule: Суточный лимит зависит от количества предложений на карточках моделей и активных магазинов клиента. Количество предложений считается по данным за последние семь дней, не включая сегодня. Для новых магазинов, еще не разместивших предложения, ограничение равно 0 и пересчитывается на следующий день после размещения первых предложений. Для клиентов с несколькими магазинами ограничение рассчитывается с учетом количества предложений, являющегося максимальным среди всех магазинов клиента. Для агентств ограничение суммируется по всем субклиентам агентства.)\n
     */
    @isTest
    private static void getModelTest() {
        HttpResponse res = new HttpResponse();
        res.setStatusCode(200);
        res.setStatus('OK');
        Test.setMock(HttpCalloutMock.class, new OASResponseMock(res));

        Map<String, Object> params = new Map<String, Object>{
            'modelId' => 2147483648L,
            'regionId' => 2147483648L,
            'r_currency' => ''
        };

        OASClient client;
        OASModelsApi api;
        OASGetModelsResponse response;
        OASGetModelsResponse expectedResponse;
        String js = '';

        client = new OASClient();
        api = new OASModelsApi(client);

        js = JSON.serialize(OASGetModelsResponse.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASGetModelsResponse.getExample();
        response = (OASGetModelsResponse) api.getModel(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASGetModelsResponse.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASGetModelsResponse.getExample();
        response = (OASGetModelsResponse) api.getModel(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASGetModelsResponse.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASGetModelsResponse.getExample();
        response = (OASGetModelsResponse) api.getModel(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASGetModelsResponse.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASGetModelsResponse.getExample();
        response = (OASGetModelsResponse) api.getModel(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASGetModelsResponse.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASGetModelsResponse.getExample();
        response = (OASGetModelsResponse) api.getModel(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASGetModelsResponse.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASGetModelsResponse.getExample();
        response = (OASGetModelsResponse) api.getModel(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASGetModelsResponse.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASGetModelsResponse.getExample();
        response = (OASGetModelsResponse) api.getModel(params);
        System.assertEquals(expectedResponse, response);
    }

    /**
     * Список предложений для одной модели
     *
     * Возвращает информацию о первых десяти предложениях, расположенных на карточке модели.\n\nПредложения выдаются для определенного региона и располагаются в том же порядке, в котором они показываются в выдаче Маркета на карточке модели.\n\nДля групповых моделей метод не поддерживается. Идентификатор групповой модели игнорируется.\n\nДля методов &#x60;GET models/{modelId}/offers&#x60; и &#x60;POST models/offers&#x60; действует групповое ресурсное ограничение. Ограничение вводится на суммарное количество моделей, информация о которых запрошена при помощи этих методов.\n\n|**⚙️ Лимит:** [рассчитывается индивидуально](*rule)|\n|-|\n\n[//]: &lt;&gt; (rule: Суточный лимит зависит от количества предложений на карточках моделей и активных магазинов клиента. Количество предложений считается по данным за последние семь дней, не включая сегодня. Для новых магазинов, еще не разместивших предложения, ограничение равно 0 и пересчитывается на следующий день после размещения первых предложений. Для клиентов с несколькими магазинами ограничение рассчитывается с учетом количества предложений, являющегося максимальным среди всех магазинов клиента. Для агентств ограничение суммируется по всем субклиентам агентства.)\n
     */
    @isTest
    private static void getModelOffersTest() {
        HttpResponse res = new HttpResponse();
        res.setStatusCode(200);
        res.setStatus('OK');
        Test.setMock(HttpCalloutMock.class, new OASResponseMock(res));

        Map<String, Object> params = new Map<String, Object>{
            'modelId' => 2147483648L,
            'regionId' => 2147483648L,
            'r_currency' => '',
            'orderByPrice' => '',
            'count' => '',
            'page' => ''
        };

        OASClient client;
        OASModelsApi api;
        OASGetModelsOffersResponse response;
        OASGetModelsOffersResponse expectedResponse;
        String js = '';

        client = new OASClient();
        api = new OASModelsApi(client);

        js = JSON.serialize(OASGetModelsOffersResponse.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASGetModelsOffersResponse.getExample();
        response = (OASGetModelsOffersResponse) api.getModelOffers(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASGetModelsOffersResponse.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASGetModelsOffersResponse.getExample();
        response = (OASGetModelsOffersResponse) api.getModelOffers(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASGetModelsOffersResponse.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASGetModelsOffersResponse.getExample();
        response = (OASGetModelsOffersResponse) api.getModelOffers(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASGetModelsOffersResponse.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASGetModelsOffersResponse.getExample();
        response = (OASGetModelsOffersResponse) api.getModelOffers(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASGetModelsOffersResponse.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASGetModelsOffersResponse.getExample();
        response = (OASGetModelsOffersResponse) api.getModelOffers(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASGetModelsOffersResponse.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASGetModelsOffersResponse.getExample();
        response = (OASGetModelsOffersResponse) api.getModelOffers(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASGetModelsOffersResponse.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASGetModelsOffersResponse.getExample();
        response = (OASGetModelsOffersResponse) api.getModelOffers(params);
        System.assertEquals(expectedResponse, response);
    }

    /**
     * Информация о нескольких моделях
     *
     * Возвращает информацию о моделях товаров.\n\nВ одном запросе можно получить информацию не более чем о 100 моделях.\n\nДля методов &#x60;GET models&#x60;, &#x60;GET models/{modelId}&#x60; и &#x60;POST models&#x60; действует групповое ресурсное ограничение. Ограничение вводится на суммарное количество моделей, информация о которых запрошена при помощи этих методов.\n\n|**⚙️ Лимит:** [рассчитывается индивидуально](*rule)|\n|-|\n\n[//]: &lt;&gt; (rule: Суточный лимит зависит от количества предложений на карточках моделей и активных магазинов клиента. Количество предложений считается по данным за последние семь дней, не включая сегодня. Для новых магазинов, еще не разместивших предложения, ограничение равно 0 и пересчитывается на следующий день после размещения первых предложений. Для клиентов с несколькими магазинами ограничение рассчитывается с учетом количества предложений, являющегося максимальным среди всех магазинов клиента. Для агентств ограничение суммируется по всем субклиентам агентства.)\n
     */
    @isTest
    private static void getModelsTest() {
        HttpResponse res = new HttpResponse();
        res.setStatusCode(201);
        res.setStatus('Created');
        Test.setMock(HttpCalloutMock.class, new OASResponseMock(res));

        Map<String, Object> params = new Map<String, Object>{
            'regionId' => 2147483648L,
            'oaSGetModelsRequest' => '',
            'r_currency' => ''
        };

        OASClient client;
        OASModelsApi api;
        OASGetModelsResponse response;
        OASGetModelsResponse expectedResponse;
        String js = '';

        client = new OASClient();
        api = new OASModelsApi(client);

        js = JSON.serialize(OASGetModelsResponse.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASGetModelsResponse.getExample();
        response = (OASGetModelsResponse) api.getModels(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASGetModelsResponse.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASGetModelsResponse.getExample();
        response = (OASGetModelsResponse) api.getModels(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASGetModelsResponse.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASGetModelsResponse.getExample();
        response = (OASGetModelsResponse) api.getModels(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASGetModelsResponse.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASGetModelsResponse.getExample();
        response = (OASGetModelsResponse) api.getModels(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASGetModelsResponse.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASGetModelsResponse.getExample();
        response = (OASGetModelsResponse) api.getModels(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASGetModelsResponse.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASGetModelsResponse.getExample();
        response = (OASGetModelsResponse) api.getModels(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASGetModelsResponse.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASGetModelsResponse.getExample();
        response = (OASGetModelsResponse) api.getModels(params);
        System.assertEquals(expectedResponse, response);
    }

    /**
     * Список предложений для нескольких моделей
     *
     * Возвращает информацию о первых десяти предложениях, расположенных на карточках моделей, идентификаторы которых указаны в запросе.\n\nПредложения выдаются для определенного региона и располагаются в том же порядке, в котором они показываются в выдаче Маркета на карточке модели.\n\nДля групповых моделей выдача предложений не поддерживается. Идентификаторы групповых моделей игнорируются.\n\nВ одном запросе можно получить информацию о предложениях не более чем для 100 моделей.\n\nДля методов &#x60;GET models/{modelId}/offers&#x60; и &#x60;POST models/offers&#x60; действует групповое ресурсное ограничение. Ограничение вводится на суммарное количество моделей, информация о которых запрошена при помощи этих методов.\n\n|**⚙️ Лимит:** [рассчитывается индивидуально](*rule)|\n|-|\n\n[//]: &lt;&gt; (rule: Суточный лимит зависит от количества предложений на карточках моделей и активных магазинов клиента. Количество предложений считается по данным за последние семь дней, не включая сегодня. Для новых магазинов, еще не разместивших предложения, ограничение равно 0 и пересчитывается на следующий день после размещения первых предложений. Для клиентов с несколькими магазинами ограничение рассчитывается с учетом количества предложений, являющегося максимальным среди всех магазинов клиента. Для агентств ограничение суммируется по всем субклиентам агентства.)\n
     */
    @isTest
    private static void getModelsOffersTest() {
        HttpResponse res = new HttpResponse();
        res.setStatusCode(200);
        res.setStatus('OK');
        Test.setMock(HttpCalloutMock.class, new OASResponseMock(res));

        Map<String, Object> params = new Map<String, Object>{
            'regionId' => 2147483648L,
            'oaSGetModelsRequest' => '',
            'r_currency' => '',
            'orderByPrice' => ''
        };

        OASClient client;
        OASModelsApi api;
        OASGetModelsOffersResponse response;
        OASGetModelsOffersResponse expectedResponse;
        String js = '';

        client = new OASClient();
        api = new OASModelsApi(client);

        js = JSON.serialize(OASGetModelsOffersResponse.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASGetModelsOffersResponse.getExample();
        response = (OASGetModelsOffersResponse) api.getModelsOffers(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASGetModelsOffersResponse.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASGetModelsOffersResponse.getExample();
        response = (OASGetModelsOffersResponse) api.getModelsOffers(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASGetModelsOffersResponse.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASGetModelsOffersResponse.getExample();
        response = (OASGetModelsOffersResponse) api.getModelsOffers(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASGetModelsOffersResponse.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASGetModelsOffersResponse.getExample();
        response = (OASGetModelsOffersResponse) api.getModelsOffers(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASGetModelsOffersResponse.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASGetModelsOffersResponse.getExample();
        response = (OASGetModelsOffersResponse) api.getModelsOffers(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASGetModelsOffersResponse.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASGetModelsOffersResponse.getExample();
        response = (OASGetModelsOffersResponse) api.getModelsOffers(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASGetModelsOffersResponse.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASGetModelsOffersResponse.getExample();
        response = (OASGetModelsOffersResponse) api.getModelsOffers(params);
        System.assertEquals(expectedResponse, response);
    }

    /**
     * Поиск модели товара
     *
     * Возвращает информацию о моделях, удовлетворяющих заданным в запросе условиям поиска.\n\nВ одном запросе можно получить информацию не более чем о 100 моделях.\n\nДля методов &#x60;GET models&#x60;, &#x60;GET models/{modelId}&#x60; и &#x60;POST models&#x60; действует групповое ресурсное ограничение. Ограничение вводится на суммарное количество моделей, информация о которых запрошена при помощи этих методов.\n\n|**⚙️ Лимит:** [рассчитывается индивидуально](*rule)|\n|-|\n\n[//]: &lt;&gt; (rule: Суточный лимит зависит от количества предложений на карточках моделей и активных магазинов клиента. Количество предложений считается по данным за последние семь дней, не включая сегодня. Для новых магазинов, еще не разместивших предложения, ограничение равно 0 и пересчитывается на следующий день после размещения первых предложений. Для клиентов с несколькими магазинами ограничение рассчитывается с учетом количества предложений, являющегося максимальным среди всех магазинов клиента. Для агентств ограничение суммируется по всем субклиентам агентства.)\n
     */
    @isTest
    private static void searchModelsTest() {
        HttpResponse res = new HttpResponse();
        res.setStatusCode(200);
        res.setStatus('OK');
        Test.setMock(HttpCalloutMock.class, new OASResponseMock(res));

        Map<String, Object> params = new Map<String, Object>{
            'query' => 'null',
            'regionId' => 2147483648L,
            'r_currency' => '',
            'page' => '',
            'pageSize' => ''
        };

        OASClient client;
        OASModelsApi api;
        OASSearchModelsResponse response;
        OASSearchModelsResponse expectedResponse;
        String js = '';

        client = new OASClient();
        api = new OASModelsApi(client);

        js = JSON.serialize(OASSearchModelsResponse.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASSearchModelsResponse.getExample();
        response = (OASSearchModelsResponse) api.searchModels(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASSearchModelsResponse.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASSearchModelsResponse.getExample();
        response = (OASSearchModelsResponse) api.searchModels(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASSearchModelsResponse.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASSearchModelsResponse.getExample();
        response = (OASSearchModelsResponse) api.searchModels(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASSearchModelsResponse.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASSearchModelsResponse.getExample();
        response = (OASSearchModelsResponse) api.searchModels(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASSearchModelsResponse.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASSearchModelsResponse.getExample();
        response = (OASSearchModelsResponse) api.searchModels(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASSearchModelsResponse.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASSearchModelsResponse.getExample();
        response = (OASSearchModelsResponse) api.searchModels(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASSearchModelsResponse.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASSearchModelsResponse.getExample();
        response = (OASSearchModelsResponse) api.searchModels(params);
        System.assertEquals(expectedResponse, response);
    }
}