@isTest
private class OASRegionsApiTest {
    /**
     * Информация о дочерних регионах
     *
     * Возвращает информацию о регионах, являющихся дочерними по отношению к региону, идентификатор которого указан в запросе.\n\nДля методов &#x60;GET regions&#x60;, &#x60;GET regions/{regionId}&#x60; и &#x60;GET regions/{regionId}/children&#x60; действует групповое ресурсное ограничение. Ограничение вводится на суммарное количество регионов, информация о которых запрошена при помощи этих методов (не более 100 000 регионов).\n\nОбъем запросов к ресурсу, который возможно выполнить в течение суток, зависит от суммарного количества регионов.\n\n|**⚙️ Лимит:** 50 000 запросов в час|\n|-|\n
     */
    @isTest
    private static void searchRegionChildrenTest() {
        HttpResponse res = new HttpResponse();
        res.setStatusCode(200);
        res.setStatus('OK');
        Test.setMock(HttpCalloutMock.class, new OASResponseMock(res));

        Map<String, Object> params = new Map<String, Object>{
            'regionId' => 2147483648L,
            'page' => '',
            'pageSize' => ''
        };

        OASClient client;
        OASRegionsApi api;
        OASGetRegionWithChildrenResponse response;
        OASGetRegionWithChildrenResponse expectedResponse;
        String js = '';

        client = new OASClient();
        api = new OASRegionsApi(client);

        js = JSON.serialize(OASGetRegionWithChildrenResponse.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASGetRegionWithChildrenResponse.getExample();
        response = (OASGetRegionWithChildrenResponse) api.searchRegionChildren(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASGetRegionWithChildrenResponse.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASGetRegionWithChildrenResponse.getExample();
        response = (OASGetRegionWithChildrenResponse) api.searchRegionChildren(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASGetRegionWithChildrenResponse.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASGetRegionWithChildrenResponse.getExample();
        response = (OASGetRegionWithChildrenResponse) api.searchRegionChildren(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASGetRegionWithChildrenResponse.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASGetRegionWithChildrenResponse.getExample();
        response = (OASGetRegionWithChildrenResponse) api.searchRegionChildren(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASGetRegionWithChildrenResponse.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASGetRegionWithChildrenResponse.getExample();
        response = (OASGetRegionWithChildrenResponse) api.searchRegionChildren(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASGetRegionWithChildrenResponse.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASGetRegionWithChildrenResponse.getExample();
        response = (OASGetRegionWithChildrenResponse) api.searchRegionChildren(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASGetRegionWithChildrenResponse.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASGetRegionWithChildrenResponse.getExample();
        response = (OASGetRegionWithChildrenResponse) api.searchRegionChildren(params);
        System.assertEquals(expectedResponse, response);
    }

    /**
     * Информация о регионе
     *
     * Возвращает информацию о регионе.\n\nДля методов &#x60;GET regions&#x60;, &#x60;GET regions/{regionId}&#x60; и &#x60;GET regions/{regionId}/children&#x60; действует групповое ресурсное ограничение. Ограничение вводится на суммарное количество регионов, информация о которых запрошена при помощи этих методов (не более 100 000 регионов).\n\nОбъем запросов к ресурсу, который возможно выполнить в течение суток, зависит от суммарного количества регионов.\n\n|**⚙️ Лимит:** 50 000 запросов в час|\n|-|\n
     */
    @isTest
    private static void searchRegionsByIdTest() {
        HttpResponse res = new HttpResponse();
        res.setStatusCode(200);
        res.setStatus('OK');
        Test.setMock(HttpCalloutMock.class, new OASResponseMock(res));

        Map<String, Object> params = new Map<String, Object>{
            'regionId' => 2147483648L
        };

        OASClient client;
        OASRegionsApi api;
        OASGetRegionsResponse response;
        OASGetRegionsResponse expectedResponse;
        String js = '';

        client = new OASClient();
        api = new OASRegionsApi(client);

        js = JSON.serialize(OASGetRegionsResponse.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASGetRegionsResponse.getExample();
        response = (OASGetRegionsResponse) api.searchRegionsById(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASGetRegionsResponse.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASGetRegionsResponse.getExample();
        response = (OASGetRegionsResponse) api.searchRegionsById(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASGetRegionsResponse.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASGetRegionsResponse.getExample();
        response = (OASGetRegionsResponse) api.searchRegionsById(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASGetRegionsResponse.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASGetRegionsResponse.getExample();
        response = (OASGetRegionsResponse) api.searchRegionsById(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASGetRegionsResponse.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASGetRegionsResponse.getExample();
        response = (OASGetRegionsResponse) api.searchRegionsById(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASGetRegionsResponse.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASGetRegionsResponse.getExample();
        response = (OASGetRegionsResponse) api.searchRegionsById(params);
        System.assertEquals(expectedResponse, response);
    }

    /**
     * Поиск регионов по их имени
     *
     * Возвращает информацию о регионе, удовлетворяющем заданным в запросе условиям поиска.\n\nЕсли найдено несколько регионов, удовлетворяющих условиям поиска, возвращается информация по каждому найденному региону (но не более десяти регионов) для возможности определения нужного региона по родительским регионам.\n\nДля методов &#x60;GET regions&#x60;, &#x60;GET regions/{regionId}&#x60; и &#x60;GET regions/{regionId}/children&#x60; действует групповое ресурсное ограничение. Ограничение вводится на суммарное количество регионов, информация о которых запрошена при помощи этих методов (не более 100 000 регионов).\n\nОбъем запросов к ресурсу, который возможно выполнить в течение суток, зависит от суммарного количества регионов.\n\n|**⚙️ Лимит:** 50 000 запросов в час|\n|-|\n
     */
    @isTest
    private static void searchRegionsByNameTest() {
        HttpResponse res = new HttpResponse();
        res.setStatusCode(200);
        res.setStatus('OK');
        Test.setMock(HttpCalloutMock.class, new OASResponseMock(res));

        Map<String, Object> params = new Map<String, Object>{
            'name' => 'null',
            'pageToken' => eyBuZXh0SWQ6IDIzNDIgfQ==,
            'r_limit' => 20
        };

        OASClient client;
        OASRegionsApi api;
        OASGetRegionsResponse response;
        OASGetRegionsResponse expectedResponse;
        String js = '';

        client = new OASClient();
        api = new OASRegionsApi(client);

        js = JSON.serialize(OASGetRegionsResponse.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASGetRegionsResponse.getExample();
        response = (OASGetRegionsResponse) api.searchRegionsByName(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASGetRegionsResponse.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASGetRegionsResponse.getExample();
        response = (OASGetRegionsResponse) api.searchRegionsByName(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASGetRegionsResponse.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASGetRegionsResponse.getExample();
        response = (OASGetRegionsResponse) api.searchRegionsByName(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASGetRegionsResponse.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASGetRegionsResponse.getExample();
        response = (OASGetRegionsResponse) api.searchRegionsByName(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASGetRegionsResponse.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASGetRegionsResponse.getExample();
        response = (OASGetRegionsResponse) api.searchRegionsByName(params);
        System.assertEquals(expectedResponse, response);
    }
}