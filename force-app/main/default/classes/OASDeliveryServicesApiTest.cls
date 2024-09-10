@isTest
private class OASDeliveryServicesApiTest {
    /**
     * Справочник служб доставки
     *
     * Возвращает справочник служб доставки: идентификаторы и наименования.\n|**⚙️ Лимит:** 5 000 запросов в час|\n|-|\n
     */
    @isTest
    private static void getDeliveryServicesTest() {
        HttpResponse res = new HttpResponse();
        res.setStatusCode(200);
        res.setStatus('OK');
        Test.setMock(HttpCalloutMock.class, new OASResponseMock(res));

        OASClient client;
        OASDeliveryServicesApi api;
        OASGetDeliveryServicesResponse response;
        OASGetDeliveryServicesResponse expectedResponse;
        String js = '';

        client = new OASClient();
        api = new OASDeliveryServicesApi(client);

        js = JSON.serialize(OASGetDeliveryServicesResponse.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASGetDeliveryServicesResponse.getExample();
        response = (OASGetDeliveryServicesResponse) api.getDeliveryServices();
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASGetDeliveryServicesResponse.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASGetDeliveryServicesResponse.getExample();
        response = (OASGetDeliveryServicesResponse) api.getDeliveryServices();
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASGetDeliveryServicesResponse.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASGetDeliveryServicesResponse.getExample();
        response = (OASGetDeliveryServicesResponse) api.getDeliveryServices();
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASGetDeliveryServicesResponse.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASGetDeliveryServicesResponse.getExample();
        response = (OASGetDeliveryServicesResponse) api.getDeliveryServices();
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASGetDeliveryServicesResponse.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASGetDeliveryServicesResponse.getExample();
        response = (OASGetDeliveryServicesResponse) api.getDeliveryServices();
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASGetDeliveryServicesResponse.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASGetDeliveryServicesResponse.getExample();
        response = (OASGetDeliveryServicesResponse) api.getDeliveryServices();
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASGetDeliveryServicesResponse.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASGetDeliveryServicesResponse.getExample();
        response = (OASGetDeliveryServicesResponse) api.getDeliveryServices();
        System.assertEquals(expectedResponse, response);
    }
}