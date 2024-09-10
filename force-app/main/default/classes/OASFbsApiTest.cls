@isTest
private class OASFbsApiTest {
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
        OASFbsApi api;
        OASEmptyApiResponse response;
        OASEmptyApiResponse expectedResponse;
        String js = '';

        client = new OASClient();
        api = new OASFbsApi(client);

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
     * Добавление товаров в архив
     *
     * Помещает товары в архив. Товары, помещенные в архив, скрыты с витрины во всех магазинах кабинета.\n\n{% note warning &quot;В архив нельзя отправить товар, который хранится на складе Маркета&quot; %}\n\nВначале такой товар нужно распродать или вывезти.\n\n{% endnote %}\n\n|**⚙️ Лимит:** 5000 товаров в минуту, не более 200 товаров в одном запросе|\n|-|\n
     */
    @isTest
    private static void addOffersToArchiveTest() {
        HttpResponse res = new HttpResponse();
        res.setStatusCode(200);
        res.setStatus('OK');
        Test.setMock(HttpCalloutMock.class, new OASResponseMock(res));

        Map<String, Object> params = new Map<String, Object>{
            'businessId' => 2147483648L,
            'oaSAddOffersToArchiveRequest' => ''
        };

        OASClient client;
        OASFbsApi api;
        OASAddOffersToArchiveResponse response;
        OASAddOffersToArchiveResponse expectedResponse;
        String js = '';

        client = new OASClient();
        api = new OASFbsApi(client);

        js = JSON.serialize(OASAddOffersToArchiveResponse.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASAddOffersToArchiveResponse.getExample();
        response = (OASAddOffersToArchiveResponse) api.addOffersToArchive(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASAddOffersToArchiveResponse.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASAddOffersToArchiveResponse.getExample();
        response = (OASAddOffersToArchiveResponse) api.addOffersToArchive(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASAddOffersToArchiveResponse.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASAddOffersToArchiveResponse.getExample();
        response = (OASAddOffersToArchiveResponse) api.addOffersToArchive(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASAddOffersToArchiveResponse.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASAddOffersToArchiveResponse.getExample();
        response = (OASAddOffersToArchiveResponse) api.addOffersToArchive(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASAddOffersToArchiveResponse.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASAddOffersToArchiveResponse.getExample();
        response = (OASAddOffersToArchiveResponse) api.addOffersToArchive(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASAddOffersToArchiveResponse.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASAddOffersToArchiveResponse.getExample();
        response = (OASAddOffersToArchiveResponse) api.addOffersToArchive(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASAddOffersToArchiveResponse.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASAddOffersToArchiveResponse.getExample();
        response = (OASAddOffersToArchiveResponse) api.addOffersToArchive(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASAddOffersToArchiveResponse.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASAddOffersToArchiveResponse.getExample();
        response = (OASAddOffersToArchiveResponse) api.addOffersToArchive(params);
        System.assertEquals(expectedResponse, response);
    }

    /**
     * Калькулятор стоимости услуг
     *
     * Рассчитывает стоимость услуг Маркета для товаров с заданными параметрами. Порядок товаров в запросе и ответе сохраняется, чтобы определить,\nдля какого товара рассчитана стоимость услуги.\n\nОбратите внимание: калькулятор осуществляет примерные расчеты. Финальная стоимость для каждого заказа зависит от предоставленных услуг.\n\nВ запросе можно указать либо параметр &#x60;campaignId&#x60;, либо &#x60;sellingProgram&#x60;. Совместное использование параметров приведет к ошибке.\n\n|**⚙️ Лимит:** 100 запросов в минуту|\n|-|\n
     */
    @isTest
    private static void calculateTariffsTest() {
        HttpResponse res = new HttpResponse();
        res.setStatusCode(200);
        res.setStatus('OK');
        Test.setMock(HttpCalloutMock.class, new OASResponseMock(res));

        Map<String, Object> params = new Map<String, Object>{
            'oaSCalculateTariffsRequest' => ''
        };

        OASClient client;
        OASFbsApi api;
        OASCalculateTariffsResponse response;
        OASCalculateTariffsResponse expectedResponse;
        String js = '';

        client = new OASClient();
        api = new OASFbsApi(client);

        js = JSON.serialize(OASCalculateTariffsResponse.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASCalculateTariffsResponse.getExample();
        response = (OASCalculateTariffsResponse) api.calculateTariffs(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASCalculateTariffsResponse.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASCalculateTariffsResponse.getExample();
        response = (OASCalculateTariffsResponse) api.calculateTariffs(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASCalculateTariffsResponse.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASCalculateTariffsResponse.getExample();
        response = (OASCalculateTariffsResponse) api.calculateTariffs(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASCalculateTariffsResponse.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASCalculateTariffsResponse.getExample();
        response = (OASCalculateTariffsResponse) api.calculateTariffs(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASCalculateTariffsResponse.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASCalculateTariffsResponse.getExample();
        response = (OASCalculateTariffsResponse) api.calculateTariffs(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASCalculateTariffsResponse.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASCalculateTariffsResponse.getExample();
        response = (OASCalculateTariffsResponse) api.calculateTariffs(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASCalculateTariffsResponse.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASCalculateTariffsResponse.getExample();
        response = (OASCalculateTariffsResponse) api.calculateTariffs(params);
        System.assertEquals(expectedResponse, response);
    }

    /**
     * Удаление товара из карантина по цене в кабинете
     *
     * Подтверждает основную цену на товары, которые попали в карантин, и удаляет их из карантина.\n\nОсновная цена задается в каталоге и действует во всех магазинах кабинета.\n\nТовар попадает в карантин, если его цена меняется слишком резко. [Как настроить карантин](https://yandex.ru/support/marketplace/assortment/operations/prices.html#quarantine)\n\nЧтобы увидеть список товаров, которые попали в карантин, используйте запрос [POST businesses/{businessId}/price-quarantine](getBusinessQuarantineOffers.md).\n\n|**⚙️ Лимит:** 5000 товаров в минуту, не более 200 товаров в одном запросе|\n|-|\n
     */
    @isTest
    private static void confirmBusinessPricesTest() {
        HttpResponse res = new HttpResponse();
        res.setStatusCode(200);
        res.setStatus('OK');
        Test.setMock(HttpCalloutMock.class, new OASResponseMock(res));

        Map<String, Object> params = new Map<String, Object>{
            'businessId' => 2147483648L,
            'oaSConfirmPricesRequest' => ''
        };

        OASClient client;
        OASFbsApi api;
        OASEmptyApiResponse response;
        OASEmptyApiResponse expectedResponse;
        String js = '';

        client = new OASClient();
        api = new OASFbsApi(client);

        js = JSON.serialize(OASEmptyApiResponse.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASEmptyApiResponse.getExample();
        response = (OASEmptyApiResponse) api.confirmBusinessPrices(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASEmptyApiResponse.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASEmptyApiResponse.getExample();
        response = (OASEmptyApiResponse) api.confirmBusinessPrices(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASEmptyApiResponse.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASEmptyApiResponse.getExample();
        response = (OASEmptyApiResponse) api.confirmBusinessPrices(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASEmptyApiResponse.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASEmptyApiResponse.getExample();
        response = (OASEmptyApiResponse) api.confirmBusinessPrices(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASEmptyApiResponse.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASEmptyApiResponse.getExample();
        response = (OASEmptyApiResponse) api.confirmBusinessPrices(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASEmptyApiResponse.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASEmptyApiResponse.getExample();
        response = (OASEmptyApiResponse) api.confirmBusinessPrices(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASEmptyApiResponse.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASEmptyApiResponse.getExample();
        response = (OASEmptyApiResponse) api.confirmBusinessPrices(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASEmptyApiResponse.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASEmptyApiResponse.getExample();
        response = (OASEmptyApiResponse) api.confirmBusinessPrices(params);
        System.assertEquals(expectedResponse, response);
    }

    /**
     * Удаление товара из карантина по цене в магазине
     *
     * Подтверждает в заданном магазине цену на товары, которые попали в карантин, и удаляет их из карантина.\n\nТовар попадает в карантин, если его цена меняется слишком резко. [Как настроить карантин](https://yandex.ru/support/marketplace/assortment/operations/prices.html#quarantine)\n\nЧтобы увидеть список товаров, которые попали в карантин, используйте запрос [POST campaigns/{campaignId}/price-quarantine](getCampaignQuarantineOffers.md).\n\n|**⚙️ Лимит:** 5000 товаров в минуту|\n|-|\n
     */
    @isTest
    private static void confirmCampaignPricesTest() {
        HttpResponse res = new HttpResponse();
        res.setStatusCode(200);
        res.setStatus('OK');
        Test.setMock(HttpCalloutMock.class, new OASResponseMock(res));

        Map<String, Object> params = new Map<String, Object>{
            'campaignId' => 2147483648L,
            'oaSConfirmPricesRequest' => ''
        };

        OASClient client;
        OASFbsApi api;
        OASEmptyApiResponse response;
        OASEmptyApiResponse expectedResponse;
        String js = '';

        client = new OASClient();
        api = new OASFbsApi(client);

        js = JSON.serialize(OASEmptyApiResponse.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASEmptyApiResponse.getExample();
        response = (OASEmptyApiResponse) api.confirmCampaignPrices(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASEmptyApiResponse.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASEmptyApiResponse.getExample();
        response = (OASEmptyApiResponse) api.confirmCampaignPrices(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASEmptyApiResponse.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASEmptyApiResponse.getExample();
        response = (OASEmptyApiResponse) api.confirmCampaignPrices(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASEmptyApiResponse.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASEmptyApiResponse.getExample();
        response = (OASEmptyApiResponse) api.confirmCampaignPrices(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASEmptyApiResponse.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASEmptyApiResponse.getExample();
        response = (OASEmptyApiResponse) api.confirmCampaignPrices(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASEmptyApiResponse.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASEmptyApiResponse.getExample();
        response = (OASEmptyApiResponse) api.confirmCampaignPrices(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASEmptyApiResponse.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASEmptyApiResponse.getExample();
        response = (OASEmptyApiResponse) api.confirmCampaignPrices(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASEmptyApiResponse.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASEmptyApiResponse.getExample();
        response = (OASEmptyApiResponse) api.confirmCampaignPrices(params);
        System.assertEquals(expectedResponse, response);
    }

    /**
     * Подтверждение отгрузки
     *
     * Подтверждает отгрузку товаров в сортировочный центр или пункт приема заказов.\n|**⚙️ Лимит:** 100 запросов в час|\n|-|\n
     */
    @isTest
    private static void confirmShipmentTest() {
        HttpResponse res = new HttpResponse();
        res.setStatusCode(200);
        res.setStatus('OK');
        Test.setMock(HttpCalloutMock.class, new OASResponseMock(res));

        Map<String, Object> params = new Map<String, Object>{
            'campaignId' => 2147483648L,
            'shipmentId' => 2147483648L,
            'oaSConfirmShipmentRequest' => ''
        };

        OASClient client;
        OASFbsApi api;
        OASEmptyApiResponse response;
        OASEmptyApiResponse expectedResponse;
        String js = '';

        client = new OASClient();
        api = new OASFbsApi(client);

        js = JSON.serialize(OASEmptyApiResponse.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASEmptyApiResponse.getExample();
        response = (OASEmptyApiResponse) api.confirmShipment(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASEmptyApiResponse.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASEmptyApiResponse.getExample();
        response = (OASEmptyApiResponse) api.confirmShipment(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASEmptyApiResponse.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASEmptyApiResponse.getExample();
        response = (OASEmptyApiResponse) api.confirmShipment(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASEmptyApiResponse.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASEmptyApiResponse.getExample();
        response = (OASEmptyApiResponse) api.confirmShipment(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASEmptyApiResponse.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASEmptyApiResponse.getExample();
        response = (OASEmptyApiResponse) api.confirmShipment(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASEmptyApiResponse.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASEmptyApiResponse.getExample();
        response = (OASEmptyApiResponse) api.confirmShipment(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASEmptyApiResponse.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASEmptyApiResponse.getExample();
        response = (OASEmptyApiResponse) api.confirmShipment(params);
        System.assertEquals(expectedResponse, response);
    }

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
        OASFbsApi api;
        OASCreateChatResponse response;
        OASCreateChatResponse expectedResponse;
        String js = '';

        client = new OASClient();
        api = new OASFbsApi(client);

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
     * Удаление товаров из ассортимента магазина
     *
     * Удаляет заданные товары из заданного магазина.\n\n{% note warning &quot;Запрос удаляет товары именно из конкретного магазина&quot; %}\n\nНа продажи в других магазинах и на наличие товара в общем каталоге он не влияет.\n\n{% endnote %}\n\nТовар не получится удалить, если он хранится на складах Маркета.\n\n|**⚙️ Лимит:** 5000 товаров в минуту|\n|-|\n
     */
    @isTest
    private static void deleteCampaignOffersTest() {
        HttpResponse res = new HttpResponse();
        res.setStatusCode(200);
        res.setStatus('OK');
        Test.setMock(HttpCalloutMock.class, new OASResponseMock(res));

        Map<String, Object> params = new Map<String, Object>{
            'campaignId' => 2147483648L,
            'oaSDeleteCampaignOffersRequest' => ''
        };

        OASClient client;
        OASFbsApi api;
        OASDeleteCampaignOffersResponse response;
        OASDeleteCampaignOffersResponse expectedResponse;
        String js = '';

        client = new OASClient();
        api = new OASFbsApi(client);

        js = JSON.serialize(OASDeleteCampaignOffersResponse.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASDeleteCampaignOffersResponse.getExample();
        response = (OASDeleteCampaignOffersResponse) api.deleteCampaignOffers(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASDeleteCampaignOffersResponse.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASDeleteCampaignOffersResponse.getExample();
        response = (OASDeleteCampaignOffersResponse) api.deleteCampaignOffers(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASDeleteCampaignOffersResponse.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASDeleteCampaignOffersResponse.getExample();
        response = (OASDeleteCampaignOffersResponse) api.deleteCampaignOffers(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASDeleteCampaignOffersResponse.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASDeleteCampaignOffersResponse.getExample();
        response = (OASDeleteCampaignOffersResponse) api.deleteCampaignOffers(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASDeleteCampaignOffersResponse.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASDeleteCampaignOffersResponse.getExample();
        response = (OASDeleteCampaignOffersResponse) api.deleteCampaignOffers(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASDeleteCampaignOffersResponse.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASDeleteCampaignOffersResponse.getExample();
        response = (OASDeleteCampaignOffersResponse) api.deleteCampaignOffers(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASDeleteCampaignOffersResponse.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASDeleteCampaignOffersResponse.getExample();
        response = (OASDeleteCampaignOffersResponse) api.deleteCampaignOffers(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASDeleteCampaignOffersResponse.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASDeleteCampaignOffersResponse.getExample();
        response = (OASDeleteCampaignOffersResponse) api.deleteCampaignOffers(params);
        System.assertEquals(expectedResponse, response);
    }

    /**
     * Удаление комментария к отзыву
     *
     * Удаляет комментарий магазина.\n\n|**⚙️ Лимит:** 1 000 запросов в час|\n|-|\n
     */
    @isTest
    private static void deleteGoodsFeedbackCommentTest() {
        HttpResponse res = new HttpResponse();
        res.setStatusCode(200);
        res.setStatus('OK');
        Test.setMock(HttpCalloutMock.class, new OASResponseMock(res));

        Map<String, Object> params = new Map<String, Object>{
            'businessId' => 2147483648L,
            'oaSDeleteGoodsFeedbackCommentRequest' => ''
        };

        OASClient client;
        OASFbsApi api;
        OASEmptyApiResponse response;
        OASEmptyApiResponse expectedResponse;
        String js = '';

        client = new OASClient();
        api = new OASFbsApi(client);

        js = JSON.serialize(OASEmptyApiResponse.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASEmptyApiResponse.getExample();
        response = (OASEmptyApiResponse) api.deleteGoodsFeedbackComment(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASEmptyApiResponse.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASEmptyApiResponse.getExample();
        response = (OASEmptyApiResponse) api.deleteGoodsFeedbackComment(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASEmptyApiResponse.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASEmptyApiResponse.getExample();
        response = (OASEmptyApiResponse) api.deleteGoodsFeedbackComment(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASEmptyApiResponse.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASEmptyApiResponse.getExample();
        response = (OASEmptyApiResponse) api.deleteGoodsFeedbackComment(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASEmptyApiResponse.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASEmptyApiResponse.getExample();
        response = (OASEmptyApiResponse) api.deleteGoodsFeedbackComment(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASEmptyApiResponse.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASEmptyApiResponse.getExample();
        response = (OASEmptyApiResponse) api.deleteGoodsFeedbackComment(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASEmptyApiResponse.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASEmptyApiResponse.getExample();
        response = (OASEmptyApiResponse) api.deleteGoodsFeedbackComment(params);
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
        OASFbsApi api;
        OASEmptyApiResponse response;
        OASEmptyApiResponse expectedResponse;
        String js = '';

        client = new OASClient();
        api = new OASFbsApi(client);

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
     * Удаление товаров из каталога
     *
     * Удаляет товары из каталога.\n\n|**⚙️ Лимит:** 5000 товаров в минуту, не более 200 товаров в одном запросе|\n|-|\n
     */
    @isTest
    private static void deleteOffersTest() {
        HttpResponse res = new HttpResponse();
        res.setStatusCode(200);
        res.setStatus('OK');
        Test.setMock(HttpCalloutMock.class, new OASResponseMock(res));

        Map<String, Object> params = new Map<String, Object>{
            'businessId' => 2147483648L,
            'oaSDeleteOffersRequest' => ''
        };

        OASClient client;
        OASFbsApi api;
        OASDeleteOffersResponse response;
        OASDeleteOffersResponse expectedResponse;
        String js = '';

        client = new OASClient();
        api = new OASFbsApi(client);

        js = JSON.serialize(OASDeleteOffersResponse.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASDeleteOffersResponse.getExample();
        response = (OASDeleteOffersResponse) api.deleteOffers(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASDeleteOffersResponse.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASDeleteOffersResponse.getExample();
        response = (OASDeleteOffersResponse) api.deleteOffers(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASDeleteOffersResponse.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASDeleteOffersResponse.getExample();
        response = (OASDeleteOffersResponse) api.deleteOffers(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASDeleteOffersResponse.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASDeleteOffersResponse.getExample();
        response = (OASDeleteOffersResponse) api.deleteOffers(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASDeleteOffersResponse.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASDeleteOffersResponse.getExample();
        response = (OASDeleteOffersResponse) api.deleteOffers(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASDeleteOffersResponse.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASDeleteOffersResponse.getExample();
        response = (OASDeleteOffersResponse) api.deleteOffers(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASDeleteOffersResponse.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASDeleteOffersResponse.getExample();
        response = (OASDeleteOffersResponse) api.deleteOffers(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASDeleteOffersResponse.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASDeleteOffersResponse.getExample();
        response = (OASDeleteOffersResponse) api.deleteOffers(params);
        System.assertEquals(expectedResponse, response);
    }

    /**
     * Удаление товаров из архива
     *
     * Восстанавливает товары из архива.\n\n|**⚙️ Лимит:** 5000 товаров в минуту, не более 200 товаров в одном запросе|\n|-|\n
     */
    @isTest
    private static void deleteOffersFromArchiveTest() {
        HttpResponse res = new HttpResponse();
        res.setStatusCode(200);
        res.setStatus('OK');
        Test.setMock(HttpCalloutMock.class, new OASResponseMock(res));

        Map<String, Object> params = new Map<String, Object>{
            'businessId' => 2147483648L,
            'oaSDeleteOffersFromArchiveRequest' => ''
        };

        OASClient client;
        OASFbsApi api;
        OASDeleteOffersFromArchiveResponse response;
        OASDeleteOffersFromArchiveResponse expectedResponse;
        String js = '';

        client = new OASClient();
        api = new OASFbsApi(client);

        js = JSON.serialize(OASDeleteOffersFromArchiveResponse.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASDeleteOffersFromArchiveResponse.getExample();
        response = (OASDeleteOffersFromArchiveResponse) api.deleteOffersFromArchive(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASDeleteOffersFromArchiveResponse.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASDeleteOffersFromArchiveResponse.getExample();
        response = (OASDeleteOffersFromArchiveResponse) api.deleteOffersFromArchive(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASDeleteOffersFromArchiveResponse.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASDeleteOffersFromArchiveResponse.getExample();
        response = (OASDeleteOffersFromArchiveResponse) api.deleteOffersFromArchive(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASDeleteOffersFromArchiveResponse.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASDeleteOffersFromArchiveResponse.getExample();
        response = (OASDeleteOffersFromArchiveResponse) api.deleteOffersFromArchive(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASDeleteOffersFromArchiveResponse.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASDeleteOffersFromArchiveResponse.getExample();
        response = (OASDeleteOffersFromArchiveResponse) api.deleteOffersFromArchive(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASDeleteOffersFromArchiveResponse.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASDeleteOffersFromArchiveResponse.getExample();
        response = (OASDeleteOffersFromArchiveResponse) api.deleteOffersFromArchive(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASDeleteOffersFromArchiveResponse.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASDeleteOffersFromArchiveResponse.getExample();
        response = (OASDeleteOffersFromArchiveResponse) api.deleteOffersFromArchive(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASDeleteOffersFromArchiveResponse.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASDeleteOffersFromArchiveResponse.getExample();
        response = (OASDeleteOffersFromArchiveResponse) api.deleteOffersFromArchive(params);
        System.assertEquals(expectedResponse, response);
    }

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
        OASFbsApi api;
        OASDeletePromoOffersResponse response;
        OASDeletePromoOffersResponse expectedResponse;
        String js = '';

        client = new OASClient();
        api = new OASFbsApi(client);

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
     * Получение акта приема-передачи
     *
     * {% note warning &quot;Экспресс‑доставка&quot; %}\n\nЕсли ваш магазин подключен к экспресс‑доставке и вы отгружаете заказы курьерам Яндекс Go, подготавливать акт приема‑передачи не нужно.\n\n{% endnote %}\n\nЗапрос формирует акт приема-передачи заказов, входящих в отгрузку, и возвращает акт в формате PDF. В акте содержатся собранные и готовые к отправке заказы.\n\nПри формировании акта Маркет автоматически находит и подставляет в шаблон следующие данные:\n\n{% cut &quot;Данные, из которых Маркет формирует акт&quot; %}\n\n| **Данные в акте**                                         | **Описание**                                                                                                                                                                                                                                                         |\n| --------------------------------------------------------- | -------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------- |\n| Дата                                                      | Дата запроса.                                                                                                                                                                                                                                                        |\n| Отправитель                                               | Название вашего юридического лица, указанное в кабинете продавца на Маркете.                                                                                                                                                                                         |\n| Исполнитель                                               | Название юридического лица сортировочного центра или службы доставки.                                                                                                                                                                                                |\n| № отправления в системе заказчика                         | Ваш идентификатор заказа, который вы указали в ответе на запрос [POST order/accept](../../pushapi/reference/orderAccept.md) от Маркета.                                                                                                                              |\n| № отправления в системе исполнителя (субподрядчика)       | Идентификатор заказа на Маркете, как в выходных данных запроса [GET campaigns/{campaignId}/orders](../../reference/orders/getOrders.md).                                                                                                                             |\n| Объявленная ценность                                      | Общая сумма заказа без учета стоимости доставки, как в выходных данных запроса [GET campaigns/{campaignId}/orders](../../reference/orders/getOrders.md) или [GET campaigns/{campaignId}/orders/{orderId}](../../reference/orders/getOrder.md).                       |\n| Вес                                                       | Масса брутто грузового места (суммарная масса упаковки и содержимого), как в выходных данных запроса [GET campaigns/{campaignId}/orders](../../reference/orders/getOrders.md) или [GET campaigns/{campaignId}/orders/{orderId}](../../reference/orders/getOrder.md). |\n| Количество мест                                           | Количество грузовых мест в заказе, как в выходных данных запроса [GET campaigns/{campaignId}/orders](../../reference/orders/getOrders.md) или [GET campaigns/{campaignId}/orders/{orderId}](../../reference/orders/getOrder.md).                                     |\n\n{% endcut %}\n\nОстальные поля нужно заполнить самостоятельно в распечатанном акте.\n|**⚙️ Лимит:** 100 запросов в час|\n|-|\n
     */
    @isTest
    private static void downloadShipmentActTest() {
        HttpResponse res = new HttpResponse();
        res.setStatusCode(200);
        res.setStatus('OK');
        Test.setMock(HttpCalloutMock.class, new OASResponseMock(res));

        Map<String, Object> params = new Map<String, Object>{
            'campaignId' => 2147483648L,
            'shipmentId' => 2147483648L
        };

        OASClient client;
        OASFbsApi api;
        Blob response;
        Blob expectedResponse;
        String js = '';

        client = new OASClient();
        api = new OASFbsApi(client);

        js = JSON.serialize(EncodingUtil.base64Decode(VGhlIHF1aWNrIGJyb3duIGZveCBqdW1wZWQgb3ZlciB0aGUgbGF6eSBkb2cu));
        res.setHeader('Content-Type', '');
        res.setBody(js);
        expectedResponse = EncodingUtil.base64Decode(VGhlIHF1aWNrIGJyb3duIGZveCBqdW1wZWQgb3ZlciB0aGUgbGF6eSBkb2cu);
        response = (Blob) api.downloadShipmentAct(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(EncodingUtil.base64Decode(VGhlIHF1aWNrIGJyb3duIGZveCBqdW1wZWQgb3ZlciB0aGUgbGF6eSBkb2cu));
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = EncodingUtil.base64Decode(VGhlIHF1aWNrIGJyb3duIGZveCBqdW1wZWQgb3ZlciB0aGUgbGF6eSBkb2cu);
        response = (Blob) api.downloadShipmentAct(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(EncodingUtil.base64Decode(VGhlIHF1aWNrIGJyb3duIGZveCBqdW1wZWQgb3ZlciB0aGUgbGF6eSBkb2cu));
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = EncodingUtil.base64Decode(VGhlIHF1aWNrIGJyb3duIGZveCBqdW1wZWQgb3ZlciB0aGUgbGF6eSBkb2cu);
        response = (Blob) api.downloadShipmentAct(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(EncodingUtil.base64Decode(VGhlIHF1aWNrIGJyb3duIGZveCBqdW1wZWQgb3ZlciB0aGUgbGF6eSBkb2cu));
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = EncodingUtil.base64Decode(VGhlIHF1aWNrIGJyb3duIGZveCBqdW1wZWQgb3ZlciB0aGUgbGF6eSBkb2cu);
        response = (Blob) api.downloadShipmentAct(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(EncodingUtil.base64Decode(VGhlIHF1aWNrIGJyb3duIGZveCBqdW1wZWQgb3ZlciB0aGUgbGF6eSBkb2cu));
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = EncodingUtil.base64Decode(VGhlIHF1aWNrIGJyb3duIGZveCBqdW1wZWQgb3ZlciB0aGUgbGF6eSBkb2cu);
        response = (Blob) api.downloadShipmentAct(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(EncodingUtil.base64Decode(VGhlIHF1aWNrIGJyb3duIGZveCBqdW1wZWQgb3ZlciB0aGUgbGF6eSBkb2cu));
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = EncodingUtil.base64Decode(VGhlIHF1aWNrIGJyb3duIGZveCBqdW1wZWQgb3ZlciB0aGUgbGF6eSBkb2cu);
        response = (Blob) api.downloadShipmentAct(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(EncodingUtil.base64Decode(VGhlIHF1aWNrIGJyb3duIGZveCBqdW1wZWQgb3ZlciB0aGUgbGF6eSBkb2cu));
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = EncodingUtil.base64Decode(VGhlIHF1aWNrIGJyb3duIGZveCBqdW1wZWQgb3ZlciB0aGUgbGF6eSBkb2cu);
        response = (Blob) api.downloadShipmentAct(params);
        System.assertEquals(expectedResponse, response);
    }

    /**
     * Получение акта расхождений
     *
     * Возвращает акт расхождений для заданной отгрузки.\n|**⚙️ Лимит:** 200 запросов в час|\n|-|\n
     */
    @isTest
    private static void downloadShipmentDiscrepancyActTest() {
        HttpResponse res = new HttpResponse();
        res.setStatusCode(200);
        res.setStatus('OK');
        Test.setMock(HttpCalloutMock.class, new OASResponseMock(res));

        Map<String, Object> params = new Map<String, Object>{
            'campaignId' => 2147483648L,
            'shipmentId' => 2147483648L
        };

        OASClient client;
        OASFbsApi api;
        Blob response;
        Blob expectedResponse;
        String js = '';

        client = new OASClient();
        api = new OASFbsApi(client);

        js = JSON.serialize(EncodingUtil.base64Decode(VGhlIHF1aWNrIGJyb3duIGZveCBqdW1wZWQgb3ZlciB0aGUgbGF6eSBkb2cu));
        res.setHeader('Content-Type', '');
        res.setBody(js);
        expectedResponse = EncodingUtil.base64Decode(VGhlIHF1aWNrIGJyb3duIGZveCBqdW1wZWQgb3ZlciB0aGUgbGF6eSBkb2cu);
        response = (Blob) api.downloadShipmentDiscrepancyAct(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(EncodingUtil.base64Decode(VGhlIHF1aWNrIGJyb3duIGZveCBqdW1wZWQgb3ZlciB0aGUgbGF6eSBkb2cu));
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = EncodingUtil.base64Decode(VGhlIHF1aWNrIGJyb3duIGZveCBqdW1wZWQgb3ZlciB0aGUgbGF6eSBkb2cu);
        response = (Blob) api.downloadShipmentDiscrepancyAct(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(EncodingUtil.base64Decode(VGhlIHF1aWNrIGJyb3duIGZveCBqdW1wZWQgb3ZlciB0aGUgbGF6eSBkb2cu));
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = EncodingUtil.base64Decode(VGhlIHF1aWNrIGJyb3duIGZveCBqdW1wZWQgb3ZlciB0aGUgbGF6eSBkb2cu);
        response = (Blob) api.downloadShipmentDiscrepancyAct(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(EncodingUtil.base64Decode(VGhlIHF1aWNrIGJyb3duIGZveCBqdW1wZWQgb3ZlciB0aGUgbGF6eSBkb2cu));
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = EncodingUtil.base64Decode(VGhlIHF1aWNrIGJyb3duIGZveCBqdW1wZWQgb3ZlciB0aGUgbGF6eSBkb2cu);
        response = (Blob) api.downloadShipmentDiscrepancyAct(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(EncodingUtil.base64Decode(VGhlIHF1aWNrIGJyb3duIGZveCBqdW1wZWQgb3ZlciB0aGUgbGF6eSBkb2cu));
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = EncodingUtil.base64Decode(VGhlIHF1aWNrIGJyb3duIGZveCBqdW1wZWQgb3ZlciB0aGUgbGF6eSBkb2cu);
        response = (Blob) api.downloadShipmentDiscrepancyAct(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(EncodingUtil.base64Decode(VGhlIHF1aWNrIGJyb3duIGZveCBqdW1wZWQgb3ZlciB0aGUgbGF6eSBkb2cu));
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = EncodingUtil.base64Decode(VGhlIHF1aWNrIGJyb3duIGZveCBqdW1wZWQgb3ZlciB0aGUgbGF6eSBkb2cu);
        response = (Blob) api.downloadShipmentDiscrepancyAct(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(EncodingUtil.base64Decode(VGhlIHF1aWNrIGJyb3duIGZveCBqdW1wZWQgb3ZlciB0aGUgbGF6eSBkb2cu));
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = EncodingUtil.base64Decode(VGhlIHF1aWNrIGJyb3duIGZveCBqdW1wZWQgb3ZlciB0aGUgbGF6eSBkb2cu);
        response = (Blob) api.downloadShipmentDiscrepancyAct(params);
        System.assertEquals(expectedResponse, response);
    }

    /**
     * Получение фактического акта приема-передачи
     *
     * Возвращает фактический акт приема-передачи для заданной отгрузки.\n\nТакой акт становится доступен спустя несколько часов после завершения отгрузки. Он может понадобиться, если после отгрузки обнаружатся расхождения.\n\n|**⚙️ Лимит:** 200 запросов в час|\n|-|\n
     */
    @isTest
    private static void downloadShipmentInboundActTest() {
        HttpResponse res = new HttpResponse();
        res.setStatusCode(200);
        res.setStatus('OK');
        Test.setMock(HttpCalloutMock.class, new OASResponseMock(res));

        Map<String, Object> params = new Map<String, Object>{
            'campaignId' => 2147483648L,
            'shipmentId' => 2147483648L
        };

        OASClient client;
        OASFbsApi api;
        Blob response;
        Blob expectedResponse;
        String js = '';

        client = new OASClient();
        api = new OASFbsApi(client);

        js = JSON.serialize(EncodingUtil.base64Decode(VGhlIHF1aWNrIGJyb3duIGZveCBqdW1wZWQgb3ZlciB0aGUgbGF6eSBkb2cu));
        res.setHeader('Content-Type', '');
        res.setBody(js);
        expectedResponse = EncodingUtil.base64Decode(VGhlIHF1aWNrIGJyb3duIGZveCBqdW1wZWQgb3ZlciB0aGUgbGF6eSBkb2cu);
        response = (Blob) api.downloadShipmentInboundAct(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(EncodingUtil.base64Decode(VGhlIHF1aWNrIGJyb3duIGZveCBqdW1wZWQgb3ZlciB0aGUgbGF6eSBkb2cu));
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = EncodingUtil.base64Decode(VGhlIHF1aWNrIGJyb3duIGZveCBqdW1wZWQgb3ZlciB0aGUgbGF6eSBkb2cu);
        response = (Blob) api.downloadShipmentInboundAct(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(EncodingUtil.base64Decode(VGhlIHF1aWNrIGJyb3duIGZveCBqdW1wZWQgb3ZlciB0aGUgbGF6eSBkb2cu));
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = EncodingUtil.base64Decode(VGhlIHF1aWNrIGJyb3duIGZveCBqdW1wZWQgb3ZlciB0aGUgbGF6eSBkb2cu);
        response = (Blob) api.downloadShipmentInboundAct(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(EncodingUtil.base64Decode(VGhlIHF1aWNrIGJyb3duIGZveCBqdW1wZWQgb3ZlciB0aGUgbGF6eSBkb2cu));
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = EncodingUtil.base64Decode(VGhlIHF1aWNrIGJyb3duIGZveCBqdW1wZWQgb3ZlciB0aGUgbGF6eSBkb2cu);
        response = (Blob) api.downloadShipmentInboundAct(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(EncodingUtil.base64Decode(VGhlIHF1aWNrIGJyb3duIGZveCBqdW1wZWQgb3ZlciB0aGUgbGF6eSBkb2cu));
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = EncodingUtil.base64Decode(VGhlIHF1aWNrIGJyb3duIGZveCBqdW1wZWQgb3ZlciB0aGUgbGF6eSBkb2cu);
        response = (Blob) api.downloadShipmentInboundAct(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(EncodingUtil.base64Decode(VGhlIHF1aWNrIGJyb3duIGZveCBqdW1wZWQgb3ZlciB0aGUgbGF6eSBkb2cu));
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = EncodingUtil.base64Decode(VGhlIHF1aWNrIGJyb3duIGZveCBqdW1wZWQgb3ZlciB0aGUgbGF6eSBkb2cu);
        response = (Blob) api.downloadShipmentInboundAct(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(EncodingUtil.base64Decode(VGhlIHF1aWNrIGJyb3duIGZveCBqdW1wZWQgb3ZlciB0aGUgbGF6eSBkb2cu));
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = EncodingUtil.base64Decode(VGhlIHF1aWNrIGJyb3duIGZveCBqdW1wZWQgb3ZlciB0aGUgbGF6eSBkb2cu);
        response = (Blob) api.downloadShipmentInboundAct(params);
        System.assertEquals(expectedResponse, response);
    }

    /**
     * Ярлыки для доверительной приемки (FBS)
     *
     * PDF-файл с ярлыками на каждый короб или палету в отгрузке для доверительной приемки. Подробнее про доверительную приемку написано в [Справке Маркета](https://yandex.ru/support/marketplace/orders/fbs/process.html#acceptance).\n\nРаспечатайте по несколько копий каждого ярлыка: на одну тару нужно наклеить минимум 2 ярлыка с разных сторон.\n\nКоличество упаковок в отгрузке задается в запросе [PUT campaigns/{campaignId}/first-mile/shipments/{shipmentId}/pallets](../../reference/shipments/setShipmentPalletsCount.md).\n|**⚙️ Лимит:** 200 запросов в час|\n|-|\n
     */
    @isTest
    private static void downloadShipmentPalletLabelsTest() {
        HttpResponse res = new HttpResponse();
        res.setStatusCode(200);
        res.setStatus('OK');
        Test.setMock(HttpCalloutMock.class, new OASResponseMock(res));

        Map<String, Object> params = new Map<String, Object>{
            'campaignId' => 2147483648L,
            'shipmentId' => 2147483648L,
            'format' => ''
        };

        OASClient client;
        OASFbsApi api;
        Blob response;
        Blob expectedResponse;
        String js = '';

        client = new OASClient();
        api = new OASFbsApi(client);

        js = JSON.serialize(EncodingUtil.base64Decode(VGhlIHF1aWNrIGJyb3duIGZveCBqdW1wZWQgb3ZlciB0aGUgbGF6eSBkb2cu));
        res.setHeader('Content-Type', '');
        res.setBody(js);
        expectedResponse = EncodingUtil.base64Decode(VGhlIHF1aWNrIGJyb3duIGZveCBqdW1wZWQgb3ZlciB0aGUgbGF6eSBkb2cu);
        response = (Blob) api.downloadShipmentPalletLabels(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(EncodingUtil.base64Decode(VGhlIHF1aWNrIGJyb3duIGZveCBqdW1wZWQgb3ZlciB0aGUgbGF6eSBkb2cu));
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = EncodingUtil.base64Decode(VGhlIHF1aWNrIGJyb3duIGZveCBqdW1wZWQgb3ZlciB0aGUgbGF6eSBkb2cu);
        response = (Blob) api.downloadShipmentPalletLabels(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(EncodingUtil.base64Decode(VGhlIHF1aWNrIGJyb3duIGZveCBqdW1wZWQgb3ZlciB0aGUgbGF6eSBkb2cu));
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = EncodingUtil.base64Decode(VGhlIHF1aWNrIGJyb3duIGZveCBqdW1wZWQgb3ZlciB0aGUgbGF6eSBkb2cu);
        response = (Blob) api.downloadShipmentPalletLabels(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(EncodingUtil.base64Decode(VGhlIHF1aWNrIGJyb3duIGZveCBqdW1wZWQgb3ZlciB0aGUgbGF6eSBkb2cu));
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = EncodingUtil.base64Decode(VGhlIHF1aWNrIGJyb3duIGZveCBqdW1wZWQgb3ZlciB0aGUgbGF6eSBkb2cu);
        response = (Blob) api.downloadShipmentPalletLabels(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(EncodingUtil.base64Decode(VGhlIHF1aWNrIGJyb3duIGZveCBqdW1wZWQgb3ZlciB0aGUgbGF6eSBkb2cu));
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = EncodingUtil.base64Decode(VGhlIHF1aWNrIGJyb3duIGZveCBqdW1wZWQgb3ZlciB0aGUgbGF6eSBkb2cu);
        response = (Blob) api.downloadShipmentPalletLabels(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(EncodingUtil.base64Decode(VGhlIHF1aWNrIGJyb3duIGZveCBqdW1wZWQgb3ZlciB0aGUgbGF6eSBkb2cu));
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = EncodingUtil.base64Decode(VGhlIHF1aWNrIGJyb3duIGZveCBqdW1wZWQgb3ZlciB0aGUgbGF6eSBkb2cu);
        response = (Blob) api.downloadShipmentPalletLabels(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(EncodingUtil.base64Decode(VGhlIHF1aWNrIGJyb3duIGZveCBqdW1wZWQgb3ZlciB0aGUgbGF6eSBkb2cu));
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = EncodingUtil.base64Decode(VGhlIHF1aWNrIGJyb3duIGZveCBqdW1wZWQgb3ZlciB0aGUgbGF6eSBkb2cu);
        response = (Blob) api.downloadShipmentPalletLabels(params);
        System.assertEquals(expectedResponse, response);
    }

    /**
     * Подтверждение ближайшей отгрузки и получение акта приема-передачи для нее
     *
     * Запрос подтверждает ближайшую отгрузку и возвращает акт приема-передачи в формате PDF.\n\n{% note warning &quot;Экспресс‑доставка&quot; %}\n\nЕсли ваш магазин подключен к экспресс‑доставке и вы отгружаете заказы курьерам [Яндекс Go](https://go.yandex/), подготавливать акт приема‑передачи не нужно.\n\n{% endnote %}\n\nВ акт входят собранные и готовые к отправке заказы, которые отгружаются в сортировочный центр или пункт приема или курьерам Маркета.\n\nПри формировании акта Маркет автоматически находит и подставляет в шаблон следующие данные:\n\n{% cut &quot;Данные, из которых Маркет формирует акт&quot; %}\n\n| **Данные в акте**	                                  | **Описание**                                                                                                                                                                                                                                                         |\n| --------------------------------------------------- | -------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------- |\n| Отправитель	                                        | Название вашего юридического лица, указанное в кабинете продавца на Маркете.                                                                                                                                                                                         |\n| Исполнитель                                         | Название юридического лица сортировочного центра или службы доставки.                                                                                                                                                                                                |\n| № отправления в системе заказчика                   | Ваш идентификатор заказа, который вы указали в ответе на запрос [POST order/accept](../../pushapi/reference/orderAccept.md) от Маркета.                                                                                                                              |\n| № отправления в системе исполнителя (субподрядчика) | Идентификатор заказа на Маркете, как в выходных данных запроса [GET campaigns/{campaignId}/orders](../../reference/orders/getOrders.md).                                                                                                                             |\n| Объявленная ценность                                | Общая сумма заказа без учета стоимости доставки, как в выходных данных запроса [GET campaigns/{campaignId}/orders](../../reference/orders/getOrders.md) или [GET campaigns/{campaignId}/orders/{orderId}](../../reference/orders/getOrder.md).                       |\n| Стоимость всех товаров в заказе                     | Стоимость всех заказанных товаров.                                                                                                                                                                                                                                   |\n| Вес                                                 | Масса брутто грузового места (суммарная масса упаковки и содержимого), как в выходных данных запроса [GET campaigns/{campaignId}/orders](../../reference/orders/getOrders.md) или [GET campaigns/{campaignId}/orders/{orderId}](../../reference/orders/getOrder.md). |\n| Количество мест                                     | Количество грузовых мест в заказе, как в выходных данных запроса [GET campaigns/{campaignId}/orders](../../reference/orders/getOrders.md) или [GET campaigns/{campaignId}/orders/{orderId}](../../reference/orders/getOrder.md).                                     |\n\n{% endcut %}\n\nОстальные поля нужно заполнить самостоятельно в распечатанном акте.\n|**⚙️ Лимит:** 100 запросов в час|\n|-|\n
     */
    @isTest
    private static void downloadShipmentReceptionTransferActTest() {
        HttpResponse res = new HttpResponse();
        res.setStatusCode(200);
        res.setStatus('OK');
        Test.setMock(HttpCalloutMock.class, new OASResponseMock(res));

        Map<String, Object> params = new Map<String, Object>{
            'campaignId' => 2147483648L,
            'warehouseId' => 123123
        };

        OASClient client;
        OASFbsApi api;
        Blob response;
        Blob expectedResponse;
        String js = '';

        client = new OASClient();
        api = new OASFbsApi(client);

        js = JSON.serialize(EncodingUtil.base64Decode(VGhlIHF1aWNrIGJyb3duIGZveCBqdW1wZWQgb3ZlciB0aGUgbGF6eSBkb2cu));
        res.setHeader('Content-Type', '');
        res.setBody(js);
        expectedResponse = EncodingUtil.base64Decode(VGhlIHF1aWNrIGJyb3duIGZveCBqdW1wZWQgb3ZlciB0aGUgbGF6eSBkb2cu);
        response = (Blob) api.downloadShipmentReceptionTransferAct(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(EncodingUtil.base64Decode(VGhlIHF1aWNrIGJyb3duIGZveCBqdW1wZWQgb3ZlciB0aGUgbGF6eSBkb2cu));
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = EncodingUtil.base64Decode(VGhlIHF1aWNrIGJyb3duIGZveCBqdW1wZWQgb3ZlciB0aGUgbGF6eSBkb2cu);
        response = (Blob) api.downloadShipmentReceptionTransferAct(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(EncodingUtil.base64Decode(VGhlIHF1aWNrIGJyb3duIGZveCBqdW1wZWQgb3ZlciB0aGUgbGF6eSBkb2cu));
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = EncodingUtil.base64Decode(VGhlIHF1aWNrIGJyb3duIGZveCBqdW1wZWQgb3ZlciB0aGUgbGF6eSBkb2cu);
        response = (Blob) api.downloadShipmentReceptionTransferAct(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(EncodingUtil.base64Decode(VGhlIHF1aWNrIGJyb3duIGZveCBqdW1wZWQgb3ZlciB0aGUgbGF6eSBkb2cu));
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = EncodingUtil.base64Decode(VGhlIHF1aWNrIGJyb3duIGZveCBqdW1wZWQgb3ZlciB0aGUgbGF6eSBkb2cu);
        response = (Blob) api.downloadShipmentReceptionTransferAct(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(EncodingUtil.base64Decode(VGhlIHF1aWNrIGJyb3duIGZveCBqdW1wZWQgb3ZlciB0aGUgbGF6eSBkb2cu));
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = EncodingUtil.base64Decode(VGhlIHF1aWNrIGJyb3duIGZveCBqdW1wZWQgb3ZlciB0aGUgbGF6eSBkb2cu);
        response = (Blob) api.downloadShipmentReceptionTransferAct(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(EncodingUtil.base64Decode(VGhlIHF1aWNrIGJyb3duIGZveCBqdW1wZWQgb3ZlciB0aGUgbGF6eSBkb2cu));
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = EncodingUtil.base64Decode(VGhlIHF1aWNrIGJyb3duIGZveCBqdW1wZWQgb3ZlciB0aGUgbGF6eSBkb2cu);
        response = (Blob) api.downloadShipmentReceptionTransferAct(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(EncodingUtil.base64Decode(VGhlIHF1aWNrIGJyb3duIGZveCBqdW1wZWQgb3ZlciB0aGUgbGF6eSBkb2cu));
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = EncodingUtil.base64Decode(VGhlIHF1aWNrIGJyb3duIGZveCBqdW1wZWQgb3ZlciB0aGUgbGF6eSBkb2cu);
        response = (Blob) api.downloadShipmentReceptionTransferAct(params);
        System.assertEquals(expectedResponse, response);
    }

    /**
     * Получение транспортной накладной
     *
     * Возвращает транспортную накладную для заданной отгрузки.\n\nТранспортная накладная понадобится, если вы отгружаете товары непосредственно со своего склада. [Подробно об этом способе отгрузки](https://yandex.ru/support/marketplace/orders/fbs/settings/shipment.html#at-your-warehouse)\n\n|**⚙️ Лимит:** 200 запросов в час|\n|-|\n
     */
    @isTest
    private static void downloadShipmentTransportationWaybillTest() {
        HttpResponse res = new HttpResponse();
        res.setStatusCode(200);
        res.setStatus('OK');
        Test.setMock(HttpCalloutMock.class, new OASResponseMock(res));

        Map<String, Object> params = new Map<String, Object>{
            'campaignId' => 2147483648L,
            'shipmentId' => 2147483648L
        };

        OASClient client;
        OASFbsApi api;
        Blob response;
        Blob expectedResponse;
        String js = '';

        client = new OASClient();
        api = new OASFbsApi(client);

        js = JSON.serialize(EncodingUtil.base64Decode(VGhlIHF1aWNrIGJyb3duIGZveCBqdW1wZWQgb3ZlciB0aGUgbGF6eSBkb2cu));
        res.setHeader('Content-Type', '');
        res.setBody(js);
        expectedResponse = EncodingUtil.base64Decode(VGhlIHF1aWNrIGJyb3duIGZveCBqdW1wZWQgb3ZlciB0aGUgbGF6eSBkb2cu);
        response = (Blob) api.downloadShipmentTransportationWaybill(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(EncodingUtil.base64Decode(VGhlIHF1aWNrIGJyb3duIGZveCBqdW1wZWQgb3ZlciB0aGUgbGF6eSBkb2cu));
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = EncodingUtil.base64Decode(VGhlIHF1aWNrIGJyb3duIGZveCBqdW1wZWQgb3ZlciB0aGUgbGF6eSBkb2cu);
        response = (Blob) api.downloadShipmentTransportationWaybill(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(EncodingUtil.base64Decode(VGhlIHF1aWNrIGJyb3duIGZveCBqdW1wZWQgb3ZlciB0aGUgbGF6eSBkb2cu));
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = EncodingUtil.base64Decode(VGhlIHF1aWNrIGJyb3duIGZveCBqdW1wZWQgb3ZlciB0aGUgbGF6eSBkb2cu);
        response = (Blob) api.downloadShipmentTransportationWaybill(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(EncodingUtil.base64Decode(VGhlIHF1aWNrIGJyb3duIGZveCBqdW1wZWQgb3ZlciB0aGUgbGF6eSBkb2cu));
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = EncodingUtil.base64Decode(VGhlIHF1aWNrIGJyb3duIGZveCBqdW1wZWQgb3ZlciB0aGUgbGF6eSBkb2cu);
        response = (Blob) api.downloadShipmentTransportationWaybill(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(EncodingUtil.base64Decode(VGhlIHF1aWNrIGJyb3duIGZveCBqdW1wZWQgb3ZlciB0aGUgbGF6eSBkb2cu));
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = EncodingUtil.base64Decode(VGhlIHF1aWNrIGJyb3duIGZveCBqdW1wZWQgb3ZlciB0aGUgbGF6eSBkb2cu);
        response = (Blob) api.downloadShipmentTransportationWaybill(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(EncodingUtil.base64Decode(VGhlIHF1aWNrIGJyb3duIGZveCBqdW1wZWQgb3ZlciB0aGUgbGF6eSBkb2cu));
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = EncodingUtil.base64Decode(VGhlIHF1aWNrIGJyb3duIGZveCBqdW1wZWQgb3ZlciB0aGUgbGF6eSBkb2cu);
        response = (Blob) api.downloadShipmentTransportationWaybill(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(EncodingUtil.base64Decode(VGhlIHF1aWNrIGJyb3duIGZveCBqdW1wZWQgb3ZlciB0aGUgbGF6eSBkb2cu));
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = EncodingUtil.base64Decode(VGhlIHF1aWNrIGJyb3duIGZveCBqdW1wZWQgb3ZlciB0aGUgbGF6eSBkb2cu);
        response = (Blob) api.downloadShipmentTransportationWaybill(params);
        System.assertEquals(expectedResponse, response);
    }

    /**
     * Отчет по бусту продаж
     *
     * Запускает генерацию **сводного отчета по бусту продаж** за заданный период. Отчет содержит информацию по всем кампаниям, созданным и через API, и в кабинете.\n\nУзнать статус генерации и получить ссылку на готовый отчет можно с помощью запроса [GET reports/info/{reportId}](../../reference/reports/getReportInfo.md).\n\n|**⚙️ Лимит:** 100 запросов в час|\n|-|\n
     */
    @isTest
    private static void generateBoostConsolidatedReportTest() {
        HttpResponse res = new HttpResponse();
        res.setStatusCode(200);
        res.setStatus('OK');
        Test.setMock(HttpCalloutMock.class, new OASResponseMock(res));

        Map<String, Object> params = new Map<String, Object>{
            'oaSGenerateBoostConsolidatedRequest' => '',
            'format' => ''
        };

        OASClient client;
        OASFbsApi api;
        OASGenerateReportResponse response;
        OASGenerateReportResponse expectedResponse;
        String js = '';

        client = new OASClient();
        api = new OASFbsApi(client);

        js = JSON.serialize(OASGenerateReportResponse.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASGenerateReportResponse.getExample();
        response = (OASGenerateReportResponse) api.generateBoostConsolidatedReport(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASGenerateReportResponse.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASGenerateReportResponse.getExample();
        response = (OASGenerateReportResponse) api.generateBoostConsolidatedReport(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASGenerateReportResponse.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASGenerateReportResponse.getExample();
        response = (OASGenerateReportResponse) api.generateBoostConsolidatedReport(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASGenerateReportResponse.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASGenerateReportResponse.getExample();
        response = (OASGenerateReportResponse) api.generateBoostConsolidatedReport(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASGenerateReportResponse.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASGenerateReportResponse.getExample();
        response = (OASGenerateReportResponse) api.generateBoostConsolidatedReport(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASGenerateReportResponse.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASGenerateReportResponse.getExample();
        response = (OASGenerateReportResponse) api.generateBoostConsolidatedReport(params);
        System.assertEquals(expectedResponse, response);
    }

    /**
     * Отчет «Конкурентная позиция»
     *
     * Запускает генерацию **отчета «Конкурентная позиция»** за заданный период. [Что это за отчет](https://yandex.ru/support2/marketplace/ru/analytics/competitors.html)\n\nУзнать статус генерации и получить ссылку на готовый отчет можно с помощью запроса [GET reports/info/{reportId}](../../reference/reports/getReportInfo.md).\n\n{% note info &quot;Значение -1 в отчете&quot; %}\n\nЕсли в CSV-файле в столбце **POSITION** стоит -1, в этот день не было заказов с товарами в указанной категории.\n\n{% endnote %}\n\n|**⚙️ Лимит:** 10 запросов в час|\n|-|\n
     */
    @isTest
    private static void generateCompetitorsPositionReportTest() {
        HttpResponse res = new HttpResponse();
        res.setStatusCode(200);
        res.setStatus('OK');
        Test.setMock(HttpCalloutMock.class, new OASResponseMock(res));

        Map<String, Object> params = new Map<String, Object>{
            'oaSGenerateCompetitorsPositionReport' => '',
            'format' => ''
        };

        OASClient client;
        OASFbsApi api;
        OASGenerateReportResponse response;
        OASGenerateReportResponse expectedResponse;
        String js = '';

        client = new OASClient();
        api = new OASFbsApi(client);

        js = JSON.serialize(OASGenerateReportResponse.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASGenerateReportResponse.getExample();
        response = (OASGenerateReportResponse) api.generateCompetitorsPositionReport(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASGenerateReportResponse.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASGenerateReportResponse.getExample();
        response = (OASGenerateReportResponse) api.generateCompetitorsPositionReport(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASGenerateReportResponse.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASGenerateReportResponse.getExample();
        response = (OASGenerateReportResponse) api.generateCompetitorsPositionReport(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASGenerateReportResponse.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASGenerateReportResponse.getExample();
        response = (OASGenerateReportResponse) api.generateCompetitorsPositionReport(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASGenerateReportResponse.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASGenerateReportResponse.getExample();
        response = (OASGenerateReportResponse) api.generateCompetitorsPositionReport(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASGenerateReportResponse.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASGenerateReportResponse.getExample();
        response = (OASGenerateReportResponse) api.generateCompetitorsPositionReport(params);
        System.assertEquals(expectedResponse, response);
    }

    /**
     * Отчет по отзывам о товарах
     *
     * Запускает генерацию **отчета по отзывам о товарах**. [Что это за отчет](https://yandex.ru/support2/marketplace/ru/marketing/plus-reviews#stat)\n\nУзнать статус генерации и получить ссылку на готовый отчет можно с помощью запроса [GET reports/info/{reportId}](../../reference/reports/getReportInfo.md).\n\n|**⚙️ Лимит:** 100 запросов в час|\n|-|\n
     */
    @isTest
    private static void generateGoodsFeedbackReportTest() {
        HttpResponse res = new HttpResponse();
        res.setStatusCode(200);
        res.setStatus('OK');
        Test.setMock(HttpCalloutMock.class, new OASResponseMock(res));

        Map<String, Object> params = new Map<String, Object>{
            'oaSGenerateGoodsFeedbackRequest' => '',
            'format' => ''
        };

        OASClient client;
        OASFbsApi api;
        OASGenerateReportResponse response;
        OASGenerateReportResponse expectedResponse;
        String js = '';

        client = new OASClient();
        api = new OASFbsApi(client);

        js = JSON.serialize(OASGenerateReportResponse.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASGenerateReportResponse.getExample();
        response = (OASGenerateReportResponse) api.generateGoodsFeedbackReport(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASGenerateReportResponse.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASGenerateReportResponse.getExample();
        response = (OASGenerateReportResponse) api.generateGoodsFeedbackReport(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASGenerateReportResponse.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASGenerateReportResponse.getExample();
        response = (OASGenerateReportResponse) api.generateGoodsFeedbackReport(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASGenerateReportResponse.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASGenerateReportResponse.getExample();
        response = (OASGenerateReportResponse) api.generateGoodsFeedbackReport(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASGenerateReportResponse.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASGenerateReportResponse.getExample();
        response = (OASGenerateReportResponse) api.generateGoodsFeedbackReport(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASGenerateReportResponse.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASGenerateReportResponse.getExample();
        response = (OASGenerateReportResponse) api.generateGoodsFeedbackReport(params);
        System.assertEquals(expectedResponse, response);
    }

    /**
     * Отчет по реализации
     *
     * Запускает генерацию **отчета по реализации** за заданный период. [Что это за отчет](https://yandex.ru/support/marketplace/analytics/reports-fby-fbs.html#sales-report)\n\nУзнать статус генерации и получить ссылку на готовый отчет можно с помощью запроса [GET reports/info/{reportId}](../../reference/reports/getReportInfo.md).\n\n|**⚙️ Лимит:** 100 запросов в час|\n|-|\n
     */
    @isTest
    private static void generateGoodsRealizationReportTest() {
        HttpResponse res = new HttpResponse();
        res.setStatusCode(200);
        res.setStatus('OK');
        Test.setMock(HttpCalloutMock.class, new OASResponseMock(res));

        Map<String, Object> params = new Map<String, Object>{
            'oaSGenerateGoodsRealizationReportReq' => '',
            'format' => ''
        };

        OASClient client;
        OASFbsApi api;
        OASGenerateReportResponse response;
        OASGenerateReportResponse expectedResponse;
        String js = '';

        client = new OASClient();
        api = new OASFbsApi(client);

        js = JSON.serialize(OASGenerateReportResponse.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASGenerateReportResponse.getExample();
        response = (OASGenerateReportResponse) api.generateGoodsRealizationReport(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASGenerateReportResponse.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASGenerateReportResponse.getExample();
        response = (OASGenerateReportResponse) api.generateGoodsRealizationReport(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASGenerateReportResponse.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASGenerateReportResponse.getExample();
        response = (OASGenerateReportResponse) api.generateGoodsRealizationReport(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASGenerateReportResponse.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASGenerateReportResponse.getExample();
        response = (OASGenerateReportResponse) api.generateGoodsRealizationReport(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASGenerateReportResponse.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASGenerateReportResponse.getExample();
        response = (OASGenerateReportResponse) api.generateGoodsRealizationReport(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASGenerateReportResponse.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASGenerateReportResponse.getExample();
        response = (OASGenerateReportResponse) api.generateGoodsRealizationReport(params);
        System.assertEquals(expectedResponse, response);
    }

    /**
     * Готовые ярлыки‑наклейки на все коробки в нескольких заказах
     *
     * Запускает генерацию PDF-файла с ярлыками для переданных заказов. Подробно о том, зачем они нужны и как выглядят, рассказано [в Справке Маркета для продавцов](https://yandex.ru/support/marketplace/orders/fbs/packaging/marking.html).\n\nУзнать статус генерации и получить ссылку на готовый файл можно с помощью запроса [GET reports/info/{reportId}](../../reference/reports/getReportInfo.md).\n\n|**⚙️ Лимит:** 1000 запросов в час|\n|-|\n
     */
    @isTest
    private static void generateMassOrderLabelsReportTest() {
        HttpResponse res = new HttpResponse();
        res.setStatusCode(200);
        res.setStatus('OK');
        Test.setMock(HttpCalloutMock.class, new OASResponseMock(res));

        Map<String, Object> params = new Map<String, Object>{
            'oaSGenerateMassOrderLabelsRequest' => '',
            'format' => ''
        };

        OASClient client;
        OASFbsApi api;
        OASGenerateReportResponse response;
        OASGenerateReportResponse expectedResponse;
        String js = '';

        client = new OASClient();
        api = new OASFbsApi(client);

        js = JSON.serialize(OASGenerateReportResponse.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASGenerateReportResponse.getExample();
        response = (OASGenerateReportResponse) api.generateMassOrderLabelsReport(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASGenerateReportResponse.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASGenerateReportResponse.getExample();
        response = (OASGenerateReportResponse) api.generateMassOrderLabelsReport(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASGenerateReportResponse.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASGenerateReportResponse.getExample();
        response = (OASGenerateReportResponse) api.generateMassOrderLabelsReport(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASGenerateReportResponse.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASGenerateReportResponse.getExample();
        response = (OASGenerateReportResponse) api.generateMassOrderLabelsReport(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASGenerateReportResponse.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASGenerateReportResponse.getExample();
        response = (OASGenerateReportResponse) api.generateMassOrderLabelsReport(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASGenerateReportResponse.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASGenerateReportResponse.getExample();
        response = (OASGenerateReportResponse) api.generateMassOrderLabelsReport(params);
        System.assertEquals(expectedResponse, response);
    }

    /**
     * Готовый ярлык‑наклейка для коробки в заказе
     *
     * Формирует ярлык‑наклейку для коробки в заказе и возвращает ярлык в PDF‑файле.\n\n|**⚙️ Лимит:** 1 000 000 запросов в час|\n|-|\n
     */
    @isTest
    private static void generateOrderLabelTest() {
        HttpResponse res = new HttpResponse();
        res.setStatusCode(200);
        res.setStatus('OK');
        Test.setMock(HttpCalloutMock.class, new OASResponseMock(res));

        Map<String, Object> params = new Map<String, Object>{
            'campaignId' => 2147483648L,
            'orderId' => 2147483648L,
            'shipmentId' => 2147483648L,
            'boxId' => 2147483648L,
            'format' => ''
        };

        OASClient client;
        OASFbsApi api;
        Blob response;
        Blob expectedResponse;
        String js = '';

        client = new OASClient();
        api = new OASFbsApi(client);

        js = JSON.serialize(EncodingUtil.base64Decode(VGhlIHF1aWNrIGJyb3duIGZveCBqdW1wZWQgb3ZlciB0aGUgbGF6eSBkb2cu));
        res.setHeader('Content-Type', '');
        res.setBody(js);
        expectedResponse = EncodingUtil.base64Decode(VGhlIHF1aWNrIGJyb3duIGZveCBqdW1wZWQgb3ZlciB0aGUgbGF6eSBkb2cu);
        response = (Blob) api.generateOrderLabel(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(EncodingUtil.base64Decode(VGhlIHF1aWNrIGJyb3duIGZveCBqdW1wZWQgb3ZlciB0aGUgbGF6eSBkb2cu));
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = EncodingUtil.base64Decode(VGhlIHF1aWNrIGJyb3duIGZveCBqdW1wZWQgb3ZlciB0aGUgbGF6eSBkb2cu);
        response = (Blob) api.generateOrderLabel(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(EncodingUtil.base64Decode(VGhlIHF1aWNrIGJyb3duIGZveCBqdW1wZWQgb3ZlciB0aGUgbGF6eSBkb2cu));
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = EncodingUtil.base64Decode(VGhlIHF1aWNrIGJyb3duIGZveCBqdW1wZWQgb3ZlciB0aGUgbGF6eSBkb2cu);
        response = (Blob) api.generateOrderLabel(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(EncodingUtil.base64Decode(VGhlIHF1aWNrIGJyb3duIGZveCBqdW1wZWQgb3ZlciB0aGUgbGF6eSBkb2cu));
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = EncodingUtil.base64Decode(VGhlIHF1aWNrIGJyb3duIGZveCBqdW1wZWQgb3ZlciB0aGUgbGF6eSBkb2cu);
        response = (Blob) api.generateOrderLabel(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(EncodingUtil.base64Decode(VGhlIHF1aWNrIGJyb3duIGZveCBqdW1wZWQgb3ZlciB0aGUgbGF6eSBkb2cu));
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = EncodingUtil.base64Decode(VGhlIHF1aWNrIGJyb3duIGZveCBqdW1wZWQgb3ZlciB0aGUgbGF6eSBkb2cu);
        response = (Blob) api.generateOrderLabel(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(EncodingUtil.base64Decode(VGhlIHF1aWNrIGJyb3duIGZveCBqdW1wZWQgb3ZlciB0aGUgbGF6eSBkb2cu));
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = EncodingUtil.base64Decode(VGhlIHF1aWNrIGJyb3duIGZveCBqdW1wZWQgb3ZlciB0aGUgbGF6eSBkb2cu);
        response = (Blob) api.generateOrderLabel(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(EncodingUtil.base64Decode(VGhlIHF1aWNrIGJyb3duIGZveCBqdW1wZWQgb3ZlciB0aGUgbGF6eSBkb2cu));
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = EncodingUtil.base64Decode(VGhlIHF1aWNrIGJyb3duIGZveCBqdW1wZWQgb3ZlciB0aGUgbGF6eSBkb2cu);
        response = (Blob) api.generateOrderLabel(params);
        System.assertEquals(expectedResponse, response);
    }

    /**
     * Готовые ярлыки‑наклейки на все коробки в одном заказе
     *
     * Возвращает PDF-файл с ярлыками, которые нужно наклеить на коробки перед отгрузкой. Подробно о том, зачем они нужны и как выглядят, рассказано [в Справке Маркета для продавцов](https://yandex.ru/support/marketplace/orders/fbs/packaging/marking.html).\n\nНа вход нужно передать идентификатор заказа и один необязательный параметр, который управляет версткой PDF-файла.\n\n|**⚙️ Лимит:** 1 000 000 запросов в час|\n|-|\n
     */
    @isTest
    private static void generateOrderLabelsTest() {
        HttpResponse res = new HttpResponse();
        res.setStatusCode(200);
        res.setStatus('OK');
        Test.setMock(HttpCalloutMock.class, new OASResponseMock(res));

        Map<String, Object> params = new Map<String, Object>{
            'campaignId' => 2147483648L,
            'orderId' => 2147483648L,
            'format' => ''
        };

        OASClient client;
        OASFbsApi api;
        Blob response;
        Blob expectedResponse;
        String js = '';

        client = new OASClient();
        api = new OASFbsApi(client);

        js = JSON.serialize(EncodingUtil.base64Decode(VGhlIHF1aWNrIGJyb3duIGZveCBqdW1wZWQgb3ZlciB0aGUgbGF6eSBkb2cu));
        res.setHeader('Content-Type', '');
        res.setBody(js);
        expectedResponse = EncodingUtil.base64Decode(VGhlIHF1aWNrIGJyb3duIGZveCBqdW1wZWQgb3ZlciB0aGUgbGF6eSBkb2cu);
        response = (Blob) api.generateOrderLabels(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(EncodingUtil.base64Decode(VGhlIHF1aWNrIGJyb3duIGZveCBqdW1wZWQgb3ZlciB0aGUgbGF6eSBkb2cu));
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = EncodingUtil.base64Decode(VGhlIHF1aWNrIGJyb3duIGZveCBqdW1wZWQgb3ZlciB0aGUgbGF6eSBkb2cu);
        response = (Blob) api.generateOrderLabels(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(EncodingUtil.base64Decode(VGhlIHF1aWNrIGJyb3duIGZveCBqdW1wZWQgb3ZlciB0aGUgbGF6eSBkb2cu));
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = EncodingUtil.base64Decode(VGhlIHF1aWNrIGJyb3duIGZveCBqdW1wZWQgb3ZlciB0aGUgbGF6eSBkb2cu);
        response = (Blob) api.generateOrderLabels(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(EncodingUtil.base64Decode(VGhlIHF1aWNrIGJyb3duIGZveCBqdW1wZWQgb3ZlciB0aGUgbGF6eSBkb2cu));
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = EncodingUtil.base64Decode(VGhlIHF1aWNrIGJyb3duIGZveCBqdW1wZWQgb3ZlciB0aGUgbGF6eSBkb2cu);
        response = (Blob) api.generateOrderLabels(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(EncodingUtil.base64Decode(VGhlIHF1aWNrIGJyb3duIGZveCBqdW1wZWQgb3ZlciB0aGUgbGF6eSBkb2cu));
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = EncodingUtil.base64Decode(VGhlIHF1aWNrIGJyb3duIGZveCBqdW1wZWQgb3ZlciB0aGUgbGF6eSBkb2cu);
        response = (Blob) api.generateOrderLabels(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(EncodingUtil.base64Decode(VGhlIHF1aWNrIGJyb3duIGZveCBqdW1wZWQgb3ZlciB0aGUgbGF6eSBkb2cu));
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = EncodingUtil.base64Decode(VGhlIHF1aWNrIGJyb3duIGZveCBqdW1wZWQgb3ZlciB0aGUgbGF6eSBkb2cu);
        response = (Blob) api.generateOrderLabels(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(EncodingUtil.base64Decode(VGhlIHF1aWNrIGJyb3duIGZveCBqdW1wZWQgb3ZlciB0aGUgbGF6eSBkb2cu));
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = EncodingUtil.base64Decode(VGhlIHF1aWNrIGJyb3duIGZveCBqdW1wZWQgb3ZlciB0aGUgbGF6eSBkb2cu);
        response = (Blob) api.generateOrderLabels(params);
        System.assertEquals(expectedResponse, response);
    }

    /**
     * Отчет «Цены на рынке»
     *
     * Запускает генерацию **отчета «Цены на рынке»**.\n\nУзнать статус генерации и получить ссылку на готовый отчет можно с помощью запроса [GET reports/info/{reportId}](../../reference/reports/getReportInfo.md).\n\n|**⚙️ Лимит:** 100 запросов в час|\n|-|\n
     */
    @isTest
    private static void generatePricesReportTest() {
        HttpResponse res = new HttpResponse();
        res.setStatusCode(200);
        res.setStatus('OK');
        Test.setMock(HttpCalloutMock.class, new OASResponseMock(res));

        Map<String, Object> params = new Map<String, Object>{
            'oaSGeneratePricesReportRequest' => '',
            'format' => ''
        };

        OASClient client;
        OASFbsApi api;
        OASGenerateReportResponse response;
        OASGenerateReportResponse expectedResponse;
        String js = '';

        client = new OASClient();
        api = new OASFbsApi(client);

        js = JSON.serialize(OASGenerateReportResponse.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASGenerateReportResponse.getExample();
        response = (OASGenerateReportResponse) api.generatePricesReport(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASGenerateReportResponse.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASGenerateReportResponse.getExample();
        response = (OASGenerateReportResponse) api.generatePricesReport(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASGenerateReportResponse.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASGenerateReportResponse.getExample();
        response = (OASGenerateReportResponse) api.generatePricesReport(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASGenerateReportResponse.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASGenerateReportResponse.getExample();
        response = (OASGenerateReportResponse) api.generatePricesReport(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASGenerateReportResponse.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASGenerateReportResponse.getExample();
        response = (OASGenerateReportResponse) api.generatePricesReport(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASGenerateReportResponse.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASGenerateReportResponse.getExample();
        response = (OASGenerateReportResponse) api.generatePricesReport(params);
        System.assertEquals(expectedResponse, response);
    }

    /**
     * Отчет по полкам
     *
     * Запускает генерацию **сводного отчета по полкам** — рекламным блокам с баннером или видео и набором товаров. Подробнее о них читайте [в Справке Маркета для продавцов](https://yandex.ru/support2/marketplace/ru/marketing/shelf).\n\nУзнать статус генерации и получить ссылку на готовый отчет можно с помощью запроса [GET reports/info/{reportId}](../../reference/reports/getReportInfo.md).\n\n|**⚙️ Лимит:** 100 запросов в час|\n|-|\n
     */
    @isTest
    private static void generateShelfsStatisticsReportTest() {
        HttpResponse res = new HttpResponse();
        res.setStatusCode(200);
        res.setStatus('OK');
        Test.setMock(HttpCalloutMock.class, new OASResponseMock(res));

        Map<String, Object> params = new Map<String, Object>{
            'oaSGenerateShelfsStatisticsRequest' => '',
            'format' => ''
        };

        OASClient client;
        OASFbsApi api;
        OASGenerateReportResponse response;
        OASGenerateReportResponse expectedResponse;
        String js = '';

        client = new OASClient();
        api = new OASFbsApi(client);

        js = JSON.serialize(OASGenerateReportResponse.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASGenerateReportResponse.getExample();
        response = (OASGenerateReportResponse) api.generateShelfsStatisticsReport(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASGenerateReportResponse.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASGenerateReportResponse.getExample();
        response = (OASGenerateReportResponse) api.generateShelfsStatisticsReport(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASGenerateReportResponse.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASGenerateReportResponse.getExample();
        response = (OASGenerateReportResponse) api.generateShelfsStatisticsReport(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASGenerateReportResponse.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASGenerateReportResponse.getExample();
        response = (OASGenerateReportResponse) api.generateShelfsStatisticsReport(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASGenerateReportResponse.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASGenerateReportResponse.getExample();
        response = (OASGenerateReportResponse) api.generateShelfsStatisticsReport(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASGenerateReportResponse.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASGenerateReportResponse.getExample();
        response = (OASGenerateReportResponse) api.generateShelfsStatisticsReport(params);
        System.assertEquals(expectedResponse, response);
    }

    /**
     * Получение листа сборки
     *
     * Запускает генерацию **листа сборки** для отгрузки.\n\nУзнать статус генерации и получить ссылку на готовый документ можно с помощью запроса [GET reports/info/{reportId}](../../reference/reports/getReportInfo.md).\n\n|**⚙️ Лимит:** 100 запросов в час|\n|-|\n
     */
    @isTest
    private static void generateShipmentListDocumentReportTest() {
        HttpResponse res = new HttpResponse();
        res.setStatusCode(200);
        res.setStatus('OK');
        Test.setMock(HttpCalloutMock.class, new OASResponseMock(res));

        Map<String, Object> params = new Map<String, Object>{
            'oaSGenerateShipmentListDocumentRepor' => ''
        };

        OASClient client;
        OASFbsApi api;
        OASGenerateReportResponse response;
        OASGenerateReportResponse expectedResponse;
        String js = '';

        client = new OASClient();
        api = new OASFbsApi(client);

        js = JSON.serialize(OASGenerateReportResponse.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASGenerateReportResponse.getExample();
        response = (OASGenerateReportResponse) api.generateShipmentListDocumentReport(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASGenerateReportResponse.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASGenerateReportResponse.getExample();
        response = (OASGenerateReportResponse) api.generateShipmentListDocumentReport(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASGenerateReportResponse.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASGenerateReportResponse.getExample();
        response = (OASGenerateReportResponse) api.generateShipmentListDocumentReport(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASGenerateReportResponse.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASGenerateReportResponse.getExample();
        response = (OASGenerateReportResponse) api.generateShipmentListDocumentReport(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASGenerateReportResponse.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASGenerateReportResponse.getExample();
        response = (OASGenerateReportResponse) api.generateShipmentListDocumentReport(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASGenerateReportResponse.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASGenerateReportResponse.getExample();
        response = (OASGenerateReportResponse) api.generateShipmentListDocumentReport(params);
        System.assertEquals(expectedResponse, response);
    }

    /**
     * Отчет «Аналитика продаж»
     *
     * Запускает генерацию **отчета «Аналитика продаж»** за заданный период. [Что это за отчет](https://yandex.ru/support/marketplace/analytics/shows-sales.html)\n\nУзнать статус генерации и получить ссылку на готовый отчет можно с помощью запроса [GET reports/info/{reportId}](../../reference/reports/getReportInfo.md).\n\n|**⚙️ Лимит:** 10 запросов в час|\n|-|\n
     */
    @isTest
    private static void generateShowsSalesReportTest() {
        HttpResponse res = new HttpResponse();
        res.setStatusCode(200);
        res.setStatus('OK');
        Test.setMock(HttpCalloutMock.class, new OASResponseMock(res));

        Map<String, Object> params = new Map<String, Object>{
            'oaSGenerateShowsSalesReportRequest' => '',
            'format' => ''
        };

        OASClient client;
        OASFbsApi api;
        OASGenerateReportResponse response;
        OASGenerateReportResponse expectedResponse;
        String js = '';

        client = new OASClient();
        api = new OASFbsApi(client);

        js = JSON.serialize(OASGenerateReportResponse.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASGenerateReportResponse.getExample();
        response = (OASGenerateReportResponse) api.generateShowsSalesReport(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASGenerateReportResponse.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASGenerateReportResponse.getExample();
        response = (OASGenerateReportResponse) api.generateShowsSalesReport(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASGenerateReportResponse.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASGenerateReportResponse.getExample();
        response = (OASGenerateReportResponse) api.generateShowsSalesReport(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASGenerateReportResponse.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASGenerateReportResponse.getExample();
        response = (OASGenerateReportResponse) api.generateShowsSalesReport(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASGenerateReportResponse.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASGenerateReportResponse.getExample();
        response = (OASGenerateReportResponse) api.generateShowsSalesReport(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASGenerateReportResponse.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASGenerateReportResponse.getExample();
        response = (OASGenerateReportResponse) api.generateShowsSalesReport(params);
        System.assertEquals(expectedResponse, response);
    }

    /**
     * Отчет по остаткам на складах
     *
     * Запускает генерацию **отчета по остаткам на складах**. Отчет содержит данные:\n\n* Для модели FBY — об остатках на складах Маркета.\n* Для остальных моделей — об остатках на соответствующем складе магазина.\n\nУзнать статус генерации и получить ссылку на готовый отчет можно с помощью запроса [GET reports/info/{reportId}](../../reference/reports/getReportInfo.md).\n\n|**⚙️ Лимит:** 100 запросов в час|\n|-|\n
     */
    @isTest
    private static void generateStocksOnWarehousesReportTest() {
        HttpResponse res = new HttpResponse();
        res.setStatusCode(200);
        res.setStatus('OK');
        Test.setMock(HttpCalloutMock.class, new OASResponseMock(res));

        Map<String, Object> params = new Map<String, Object>{
            'oaSGenerateStocksOnWarehousesReportR' => '',
            'format' => ''
        };

        OASClient client;
        OASFbsApi api;
        OASGenerateReportResponse response;
        OASGenerateReportResponse expectedResponse;
        String js = '';

        client = new OASClient();
        api = new OASFbsApi(client);

        js = JSON.serialize(OASGenerateReportResponse.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASGenerateReportResponse.getExample();
        response = (OASGenerateReportResponse) api.generateStocksOnWarehousesReport(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASGenerateReportResponse.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASGenerateReportResponse.getExample();
        response = (OASGenerateReportResponse) api.generateStocksOnWarehousesReport(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASGenerateReportResponse.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASGenerateReportResponse.getExample();
        response = (OASGenerateReportResponse) api.generateStocksOnWarehousesReport(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASGenerateReportResponse.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASGenerateReportResponse.getExample();
        response = (OASGenerateReportResponse) api.generateStocksOnWarehousesReport(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASGenerateReportResponse.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASGenerateReportResponse.getExample();
        response = (OASGenerateReportResponse) api.generateStocksOnWarehousesReport(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASGenerateReportResponse.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASGenerateReportResponse.getExample();
        response = (OASGenerateReportResponse) api.generateStocksOnWarehousesReport(params);
        System.assertEquals(expectedResponse, response);
    }

    /**
     * Отчет по стоимости услуг
     *
     * Запускает генерацию **отчета по стоимости услуг** за заданный период. [Что это за отчет](https://yandex.ru/support/marketplace/analytics/reports.html)\n\nТип отчета зависит от того, какие поля заполнены в запросе:\n\n|**Тип отчета**               |**Какие поля нужны**             |\n|-----------------------------|---------------------------------|\n|По дате начисления услуги    |&#x60;dateFrom&#x60; и &#x60;dateTo&#x60;            |\n|По дате формирования акта    |&#x60;year&#x60; и &#x60;month&#x60;                 |\n\nЗаказать отчеты обоих типов одним запросом нельзя.\n\nУзнать статус генерации и получить ссылку на готовый отчет можно с помощью запроса [GET reports/info/{reportId}](../../reference/reports/getReportInfo.md).\n\n|**⚙️ Лимит:** 100 запросов в час|\n|-|\n
     */
    @isTest
    private static void generateUnitedMarketplaceServicesReportTest() {
        HttpResponse res = new HttpResponse();
        res.setStatusCode(200);
        res.setStatus('OK');
        Test.setMock(HttpCalloutMock.class, new OASResponseMock(res));

        Map<String, Object> params = new Map<String, Object>{
            'oaSGenerateUnitedMarketplaceServices' => '',
            'format' => ''
        };

        OASClient client;
        OASFbsApi api;
        OASGenerateReportResponse response;
        OASGenerateReportResponse expectedResponse;
        String js = '';

        client = new OASClient();
        api = new OASFbsApi(client);

        js = JSON.serialize(OASGenerateReportResponse.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASGenerateReportResponse.getExample();
        response = (OASGenerateReportResponse) api.generateUnitedMarketplaceServicesReport(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASGenerateReportResponse.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASGenerateReportResponse.getExample();
        response = (OASGenerateReportResponse) api.generateUnitedMarketplaceServicesReport(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASGenerateReportResponse.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASGenerateReportResponse.getExample();
        response = (OASGenerateReportResponse) api.generateUnitedMarketplaceServicesReport(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASGenerateReportResponse.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASGenerateReportResponse.getExample();
        response = (OASGenerateReportResponse) api.generateUnitedMarketplaceServicesReport(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASGenerateReportResponse.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASGenerateReportResponse.getExample();
        response = (OASGenerateReportResponse) api.generateUnitedMarketplaceServicesReport(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASGenerateReportResponse.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASGenerateReportResponse.getExample();
        response = (OASGenerateReportResponse) api.generateUnitedMarketplaceServicesReport(params);
        System.assertEquals(expectedResponse, response);
    }

    /**
     * Отчет по платежам
     *
     * Запускает генерацию **отчета по платежам** за заданный период. [Что это за отчет](https://yandex.ru/support/marketplace/analytics/transactions.html)\n\nУзнать статус генерации и получить ссылку на готовый отчет можно с помощью запроса [GET reports/info/{reportId}](../../reference/reports/getReportInfo.md).\n\nТип отчета зависит от того, какие поля заполнены в запросе:\n\n|**Тип отчета**           |**Какие поля нужны**                   |\n|-------------------------|---------------------------------------|\n|О платежах за период     |&#x60;dateFrom&#x60; и &#x60;dateTo&#x60;                  |\n|О платежном поручении    |&#x60;bankOrderId&#x60; и &#x60;bankOrderDateTime&#x60;    |\n\nЗаказать отчеты обоих типов одним запросом нельзя.\n\n|**⚙️ Лимит:** 100 запросов в час|\n|-|\n
     */
    @isTest
    private static void generateUnitedNettingReportTest() {
        HttpResponse res = new HttpResponse();
        res.setStatusCode(200);
        res.setStatus('OK');
        Test.setMock(HttpCalloutMock.class, new OASResponseMock(res));

        Map<String, Object> params = new Map<String, Object>{
            'oaSGenerateUnitedNettingReportReques' => '',
            'format' => ''
        };

        OASClient client;
        OASFbsApi api;
        OASGenerateReportResponse response;
        OASGenerateReportResponse expectedResponse;
        String js = '';

        client = new OASClient();
        api = new OASFbsApi(client);

        js = JSON.serialize(OASGenerateReportResponse.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASGenerateReportResponse.getExample();
        response = (OASGenerateReportResponse) api.generateUnitedNettingReport(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASGenerateReportResponse.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASGenerateReportResponse.getExample();
        response = (OASGenerateReportResponse) api.generateUnitedNettingReport(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASGenerateReportResponse.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASGenerateReportResponse.getExample();
        response = (OASGenerateReportResponse) api.generateUnitedNettingReport(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASGenerateReportResponse.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASGenerateReportResponse.getExample();
        response = (OASGenerateReportResponse) api.generateUnitedNettingReport(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASGenerateReportResponse.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASGenerateReportResponse.getExample();
        response = (OASGenerateReportResponse) api.generateUnitedNettingReport(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASGenerateReportResponse.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASGenerateReportResponse.getExample();
        response = (OASGenerateReportResponse) api.generateUnitedNettingReport(params);
        System.assertEquals(expectedResponse, response);
    }

    /**
     * Отчет по заказам
     *
     * Запускает генерацию **отчета по заказам** за заданный период. [Что это за отчет](https://yandex.ru/support/marketplace/analytics/orders.html)\n\n{% note info &quot;&quot; %}\n\nЭто новый отчет. Раньше мы так называли генерацию детальной информации по заказам. [Как получить детальную информацию по заказам](../../reference/stats/getOrdersStats.md)\n\n{% endnote %}\n\nУзнать статус генерации и получить ссылку на готовый отчет можно с помощью запроса [GET reports/info/{reportId}](../../reference/reports/getReportInfo.md).\n\n|**⚙️ Лимит:** 100 запросов в час|\n|-|\n
     */
    @isTest
    private static void generateUnitedOrdersReportTest() {
        HttpResponse res = new HttpResponse();
        res.setStatusCode(200);
        res.setStatus('OK');
        Test.setMock(HttpCalloutMock.class, new OASResponseMock(res));

        Map<String, Object> params = new Map<String, Object>{
            'oaSGenerateUnitedOrdersRequest' => '',
            'format' => ''
        };

        OASClient client;
        OASFbsApi api;
        OASGenerateReportResponse response;
        OASGenerateReportResponse expectedResponse;
        String js = '';

        client = new OASClient();
        api = new OASFbsApi(client);

        js = JSON.serialize(OASGenerateReportResponse.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASGenerateReportResponse.getExample();
        response = (OASGenerateReportResponse) api.generateUnitedOrdersReport(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASGenerateReportResponse.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASGenerateReportResponse.getExample();
        response = (OASGenerateReportResponse) api.generateUnitedOrdersReport(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASGenerateReportResponse.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASGenerateReportResponse.getExample();
        response = (OASGenerateReportResponse) api.generateUnitedOrdersReport(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASGenerateReportResponse.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASGenerateReportResponse.getExample();
        response = (OASGenerateReportResponse) api.generateUnitedOrdersReport(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASGenerateReportResponse.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASGenerateReportResponse.getExample();
        response = (OASGenerateReportResponse) api.generateUnitedOrdersReport(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASGenerateReportResponse.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASGenerateReportResponse.getExample();
        response = (OASGenerateReportResponse) api.generateUnitedOrdersReport(params);
        System.assertEquals(expectedResponse, response);
    }

    /**
     * Все предложения магазина
     *
     * {% note warning &quot;&quot; %}\n\nЭтот метод устарел. Не используйте его.\n\n{% endnote %}\n\nПозволяет максимально быстро получить информацию обо всех предложениях магазина, размещенных на Маркете. Возвращает результат в виде сегментов нефиксированного размера.\n\nВ ответе на запрос для каждого найденного предложения указывается URL и наименование этого предложения, его цена и валюта, в которой она указана, карточка модели Яндекс Маркета, с которой соотнесено предложение, а также аукционные ставки на него.\n\n{% note info %}\n\nКоличество предложений считается по данным за последние семь дней (не включая сегодня).\n\nДля новых магазинов, еще не разместивших предложения, ограничение равно 0 и пересчитывается на следующий день после размещения первых предложений.\n\n{% endnote %}\n\n|**⚙️ Лимит:** рассчитывается по [формуле](*rule)|\n|-|\n\n[//]: &lt;&gt; (rule: суточный лимит товаров — среднее количество таваров в каталоге за неделю * 25)\n
     */
    @isTest
    private static void getAllOffersTest() {
        HttpResponse res = new HttpResponse();
        res.setStatusCode(200);
        res.setStatus('OK');
        Test.setMock(HttpCalloutMock.class, new OASResponseMock(res));

        Map<String, Object> params = new Map<String, Object>{
            'campaignId' => 2147483648L,
            'feedId' => 2147483648L,
            'chunk' => ''
        };

        OASClient client;
        OASFbsApi api;
        OASGetAllOffersResponse response;
        OASGetAllOffersResponse expectedResponse;
        String js = '';

        client = new OASClient();
        api = new OASFbsApi(client);

        js = JSON.serialize(OASGetAllOffersResponse.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASGetAllOffersResponse.getExample();
        response = (OASGetAllOffersResponse) api.getAllOffers(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASGetAllOffersResponse.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASGetAllOffersResponse.getExample();
        response = (OASGetAllOffersResponse) api.getAllOffers(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASGetAllOffersResponse.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASGetAllOffersResponse.getExample();
        response = (OASGetAllOffersResponse) api.getAllOffers(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASGetAllOffersResponse.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASGetAllOffersResponse.getExample();
        response = (OASGetAllOffersResponse) api.getAllOffers(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASGetAllOffersResponse.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASGetAllOffersResponse.getExample();
        response = (OASGetAllOffersResponse) api.getAllOffers(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASGetAllOffersResponse.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASGetAllOffersResponse.getExample();
        response = (OASGetAllOffersResponse) api.getAllOffers(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASGetAllOffersResponse.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASGetAllOffersResponse.getExample();
        response = (OASGetAllOffersResponse) api.getAllOffers(params);
        System.assertEquals(expectedResponse, response);
    }

    /**
     * Информация об установленных ставках
     *
     * Возвращает значения ставок для заданных товаров.\n\n{% note warning &quot;&quot; %}\n\nВ ответе возвращаются значения только тех ставок, которые вы установили через запрос [PUT businesses/{businessId}/bids](../../reference/bids/putBidsForBusiness.md). Получить информацию по кампаниям, созданным в кабинете, не получится.\n\n{% endnote %}\n\nВ одном запросе может быть максимум 1500 товаров.\n\n|**⚙️ Лимит:** 1000 запросов в минуту|\n|-|\n
     */
    @isTest
    private static void getBidsInfoForBusinessTest() {
        HttpResponse res = new HttpResponse();
        res.setStatusCode(200);
        res.setStatus('OK');
        Test.setMock(HttpCalloutMock.class, new OASResponseMock(res));

        Map<String, Object> params = new Map<String, Object>{
            'businessId' => 2147483648L,
            'pageToken' => eyBuZXh0SWQ6IDIzNDIgfQ==,
            'r_limit' => 20,
            'oaSGetBidsInfoRequest' => ''
        };

        OASClient client;
        OASFbsApi api;
        OASGetBidsInfoResponse response;
        OASGetBidsInfoResponse expectedResponse;
        String js = '';

        client = new OASClient();
        api = new OASFbsApi(client);

        js = JSON.serialize(OASGetBidsInfoResponse.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASGetBidsInfoResponse.getExample();
        response = (OASGetBidsInfoResponse) api.getBidsInfoForBusiness(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASGetBidsInfoResponse.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASGetBidsInfoResponse.getExample();
        response = (OASGetBidsInfoResponse) api.getBidsInfoForBusiness(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASGetBidsInfoResponse.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASGetBidsInfoResponse.getExample();
        response = (OASGetBidsInfoResponse) api.getBidsInfoForBusiness(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASGetBidsInfoResponse.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASGetBidsInfoResponse.getExample();
        response = (OASGetBidsInfoResponse) api.getBidsInfoForBusiness(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASGetBidsInfoResponse.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASGetBidsInfoResponse.getExample();
        response = (OASGetBidsInfoResponse) api.getBidsInfoForBusiness(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASGetBidsInfoResponse.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASGetBidsInfoResponse.getExample();
        response = (OASGetBidsInfoResponse) api.getBidsInfoForBusiness(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASGetBidsInfoResponse.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASGetBidsInfoResponse.getExample();
        response = (OASGetBidsInfoResponse) api.getBidsInfoForBusiness(params);
        System.assertEquals(expectedResponse, response);
    }

    /**
     * Рекомендованные ставки для заданных товаров
     *
     * Возвращает рекомендованные ставки для заданных товаров — такие ставки обеспечивают вашим предложениям определенную долю показов, если цена не превышает рекомендованную.\n\nДля одного товара может возвращаться одна рекомендованная ставка или несколько. Во втором случае разные ставки предназначены для достижения разной доли показов.\n\nЕсли товар только добавлен в каталог, но пока не продается, рекомендованной ставки для него не будет.\n\nВ одном запросе может быть максимум 1500 товаров.\n\n|**⚙️ Лимит:** 1000 запросов в минуту|\n|-|\n
     */
    @isTest
    private static void getBidsRecommendationsTest() {
        HttpResponse res = new HttpResponse();
        res.setStatusCode(200);
        res.setStatus('OK');
        Test.setMock(HttpCalloutMock.class, new OASResponseMock(res));

        Map<String, Object> params = new Map<String, Object>{
            'businessId' => 2147483648L,
            'oaSGetBidsRecommendationsRequest' => ''
        };

        OASClient client;
        OASFbsApi api;
        OASGetBidsRecommendationsResponse response;
        OASGetBidsRecommendationsResponse expectedResponse;
        String js = '';

        client = new OASClient();
        api = new OASFbsApi(client);

        js = JSON.serialize(OASGetBidsRecommendationsResponse.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASGetBidsRecommendationsResponse.getExample();
        response = (OASGetBidsRecommendationsResponse) api.getBidsRecommendations(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASGetBidsRecommendationsResponse.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASGetBidsRecommendationsResponse.getExample();
        response = (OASGetBidsRecommendationsResponse) api.getBidsRecommendations(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASGetBidsRecommendationsResponse.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASGetBidsRecommendationsResponse.getExample();
        response = (OASGetBidsRecommendationsResponse) api.getBidsRecommendations(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASGetBidsRecommendationsResponse.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASGetBidsRecommendationsResponse.getExample();
        response = (OASGetBidsRecommendationsResponse) api.getBidsRecommendations(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASGetBidsRecommendationsResponse.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASGetBidsRecommendationsResponse.getExample();
        response = (OASGetBidsRecommendationsResponse) api.getBidsRecommendations(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASGetBidsRecommendationsResponse.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASGetBidsRecommendationsResponse.getExample();
        response = (OASGetBidsRecommendationsResponse) api.getBidsRecommendations(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASGetBidsRecommendationsResponse.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASGetBidsRecommendationsResponse.getExample();
        response = (OASGetBidsRecommendationsResponse) api.getBidsRecommendations(params);
        System.assertEquals(expectedResponse, response);
    }

    /**
     * Список товаров, находящихся в карантине по цене в кабинете
     *
     * Возвращает список товаров, которые находятся в карантине по **основной цене**. Основная цена задается в каталоге и действует во всех магазинах кабинета.\n\nПроверьте цену каждого из товаров, который попал в карантин. Если ошибки нет и цена правильная, подтвердите ее с помощью запроса [POST businesses/{businessId}/price-quarantine/confirm](../../reference/business-assortment/confirmBusinessPrices.md). Если цена в самом деле ошибочная, установите верную с помощью запроса [POST businesses/{businessId}/offer-prices/updates](../../reference/business-assortment/updateBusinessPrices.md).\n\n{% note info &quot;𝓠 Что такое карантин?&quot; %}\n\n𝓐 Товар попадает в карантин, если его цена меняется слишком резко или слишком сильно отличается от рыночной. [Подробнее](https://yandex.ru/support/marketplace/assortment/operations/prices.html#quarantine)\n\n{% endnote %}\n\nВ запросе можно использовать фильтры.\n\nРезультаты возвращаются постранично.\n\n|**⚙️ Лимит:** 5000 товаров в минуту, не более 500 товаров в одном запросе|\n|-|\n
     */
    @isTest
    private static void getBusinessQuarantineOffersTest() {
        HttpResponse res = new HttpResponse();
        res.setStatusCode(200);
        res.setStatus('OK');
        Test.setMock(HttpCalloutMock.class, new OASResponseMock(res));

        Map<String, Object> params = new Map<String, Object>{
            'businessId' => 2147483648L,
            'oaSGetQuarantineOffersRequest' => '',
            'pageToken' => eyBuZXh0SWQ6IDIzNDIgfQ==,
            'r_limit' => 20
        };

        OASClient client;
        OASFbsApi api;
        OASGetQuarantineOffersResponse response;
        OASGetQuarantineOffersResponse expectedResponse;
        String js = '';

        client = new OASClient();
        api = new OASFbsApi(client);

        js = JSON.serialize(OASGetQuarantineOffersResponse.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASGetQuarantineOffersResponse.getExample();
        response = (OASGetQuarantineOffersResponse) api.getBusinessQuarantineOffers(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASGetQuarantineOffersResponse.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASGetQuarantineOffersResponse.getExample();
        response = (OASGetQuarantineOffersResponse) api.getBusinessQuarantineOffers(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASGetQuarantineOffersResponse.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASGetQuarantineOffersResponse.getExample();
        response = (OASGetQuarantineOffersResponse) api.getBusinessQuarantineOffers(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASGetQuarantineOffersResponse.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASGetQuarantineOffersResponse.getExample();
        response = (OASGetQuarantineOffersResponse) api.getBusinessQuarantineOffers(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASGetQuarantineOffersResponse.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASGetQuarantineOffersResponse.getExample();
        response = (OASGetQuarantineOffersResponse) api.getBusinessQuarantineOffers(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASGetQuarantineOffersResponse.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASGetQuarantineOffersResponse.getExample();
        response = (OASGetQuarantineOffersResponse) api.getBusinessQuarantineOffers(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASGetQuarantineOffersResponse.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASGetQuarantineOffersResponse.getExample();
        response = (OASGetQuarantineOffersResponse) api.getBusinessQuarantineOffers(params);
        System.assertEquals(expectedResponse, response);
    }

    /**
     * Настройки кабинета
     *
     * Возвращает информацию о настройках кабинета, идентификатор которого указан в запросе.\n|**⚙️ Лимит:** 1000 запросов в час|\n|-|\n
     */
    @isTest
    private static void getBusinessSettingsTest() {
        HttpResponse res = new HttpResponse();
        res.setStatusCode(200);
        res.setStatus('OK');
        Test.setMock(HttpCalloutMock.class, new OASResponseMock(res));

        Map<String, Object> params = new Map<String, Object>{
            'businessId' => 2147483648L
        };

        OASClient client;
        OASFbsApi api;
        OASGetBusinessSettingsResponse response;
        OASGetBusinessSettingsResponse expectedResponse;
        String js = '';

        client = new OASClient();
        api = new OASFbsApi(client);

        js = JSON.serialize(OASGetBusinessSettingsResponse.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASGetBusinessSettingsResponse.getExample();
        response = (OASGetBusinessSettingsResponse) api.getBusinessSettings(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASGetBusinessSettingsResponse.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASGetBusinessSettingsResponse.getExample();
        response = (OASGetBusinessSettingsResponse) api.getBusinessSettings(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASGetBusinessSettingsResponse.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASGetBusinessSettingsResponse.getExample();
        response = (OASGetBusinessSettingsResponse) api.getBusinessSettings(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASGetBusinessSettingsResponse.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASGetBusinessSettingsResponse.getExample();
        response = (OASGetBusinessSettingsResponse) api.getBusinessSettings(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASGetBusinessSettingsResponse.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASGetBusinessSettingsResponse.getExample();
        response = (OASGetBusinessSettingsResponse) api.getBusinessSettings(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASGetBusinessSettingsResponse.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASGetBusinessSettingsResponse.getExample();
        response = (OASGetBusinessSettingsResponse) api.getBusinessSettings(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASGetBusinessSettingsResponse.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASGetBusinessSettingsResponse.getExample();
        response = (OASGetBusinessSettingsResponse) api.getBusinessSettings(params);
        System.assertEquals(expectedResponse, response);
    }

    /**
     * Информация о магазине
     *
     * Возвращает информацию о магазине.\n|**⚙️ Лимит:** 1000 запросов в час|\n|-|\n
     */
    @isTest
    private static void getCampaignTest() {
        HttpResponse res = new HttpResponse();
        res.setStatusCode(200);
        res.setStatus('OK');
        Test.setMock(HttpCalloutMock.class, new OASResponseMock(res));

        Map<String, Object> params = new Map<String, Object>{
            'campaignId' => 2147483648L
        };

        OASClient client;
        OASFbsApi api;
        OASGetCampaignResponse response;
        OASGetCampaignResponse expectedResponse;
        String js = '';

        client = new OASClient();
        api = new OASFbsApi(client);

        js = JSON.serialize(OASGetCampaignResponse.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASGetCampaignResponse.getExample();
        response = (OASGetCampaignResponse) api.getCampaign(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASGetCampaignResponse.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASGetCampaignResponse.getExample();
        response = (OASGetCampaignResponse) api.getCampaign(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASGetCampaignResponse.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASGetCampaignResponse.getExample();
        response = (OASGetCampaignResponse) api.getCampaign(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASGetCampaignResponse.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASGetCampaignResponse.getExample();
        response = (OASGetCampaignResponse) api.getCampaign(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASGetCampaignResponse.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASGetCampaignResponse.getExample();
        response = (OASGetCampaignResponse) api.getCampaign(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASGetCampaignResponse.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASGetCampaignResponse.getExample();
        response = (OASGetCampaignResponse) api.getCampaign(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASGetCampaignResponse.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASGetCampaignResponse.getExample();
        response = (OASGetCampaignResponse) api.getCampaign(params);
        System.assertEquals(expectedResponse, response);
    }

    /**
     * Логины, связанные с магазином
     *
     * Возвращает список логинов, у которых есть доступ к магазину.\n|**⚙️ Лимит:** 1000 запросов в час|\n|-|\n
     */
    @isTest
    private static void getCampaignLoginsTest() {
        HttpResponse res = new HttpResponse();
        res.setStatusCode(200);
        res.setStatus('OK');
        Test.setMock(HttpCalloutMock.class, new OASResponseMock(res));

        Map<String, Object> params = new Map<String, Object>{
            'campaignId' => 2147483648L
        };

        OASClient client;
        OASFbsApi api;
        OASGetCampaignLoginsResponse response;
        OASGetCampaignLoginsResponse expectedResponse;
        String js = '';

        client = new OASClient();
        api = new OASFbsApi(client);

        js = JSON.serialize(OASGetCampaignLoginsResponse.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASGetCampaignLoginsResponse.getExample();
        response = (OASGetCampaignLoginsResponse) api.getCampaignLogins(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASGetCampaignLoginsResponse.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASGetCampaignLoginsResponse.getExample();
        response = (OASGetCampaignLoginsResponse) api.getCampaignLogins(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASGetCampaignLoginsResponse.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASGetCampaignLoginsResponse.getExample();
        response = (OASGetCampaignLoginsResponse) api.getCampaignLogins(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASGetCampaignLoginsResponse.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASGetCampaignLoginsResponse.getExample();
        response = (OASGetCampaignLoginsResponse) api.getCampaignLogins(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASGetCampaignLoginsResponse.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASGetCampaignLoginsResponse.getExample();
        response = (OASGetCampaignLoginsResponse) api.getCampaignLogins(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASGetCampaignLoginsResponse.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASGetCampaignLoginsResponse.getExample();
        response = (OASGetCampaignLoginsResponse) api.getCampaignLogins(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASGetCampaignLoginsResponse.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASGetCampaignLoginsResponse.getExample();
        response = (OASGetCampaignLoginsResponse) api.getCampaignLogins(params);
        System.assertEquals(expectedResponse, response);
    }

    /**
     * Информация о товарах, которые размещены в заданном магазине
     *
     * Возвращает список товаров, которые размещены в заданном магазине. Для каждого товара указываются параметры размещения.\n\n|**⚙️ Лимит:** 5000 товаров в минуту|\n|-|\n
     */
    @isTest
    private static void getCampaignOffersTest() {
        HttpResponse res = new HttpResponse();
        res.setStatusCode(200);
        res.setStatus('OK');
        Test.setMock(HttpCalloutMock.class, new OASResponseMock(res));

        Map<String, Object> params = new Map<String, Object>{
            'campaignId' => 2147483648L,
            'oaSGetCampaignOffersRequest' => '',
            'pageToken' => eyBuZXh0SWQ6IDIzNDIgfQ==,
            'r_limit' => 20
        };

        OASClient client;
        OASFbsApi api;
        OASGetCampaignOffersResponse response;
        OASGetCampaignOffersResponse expectedResponse;
        String js = '';

        client = new OASClient();
        api = new OASFbsApi(client);

        js = JSON.serialize(OASGetCampaignOffersResponse.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASGetCampaignOffersResponse.getExample();
        response = (OASGetCampaignOffersResponse) api.getCampaignOffers(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASGetCampaignOffersResponse.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASGetCampaignOffersResponse.getExample();
        response = (OASGetCampaignOffersResponse) api.getCampaignOffers(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASGetCampaignOffersResponse.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASGetCampaignOffersResponse.getExample();
        response = (OASGetCampaignOffersResponse) api.getCampaignOffers(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASGetCampaignOffersResponse.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASGetCampaignOffersResponse.getExample();
        response = (OASGetCampaignOffersResponse) api.getCampaignOffers(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASGetCampaignOffersResponse.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASGetCampaignOffersResponse.getExample();
        response = (OASGetCampaignOffersResponse) api.getCampaignOffers(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASGetCampaignOffersResponse.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASGetCampaignOffersResponse.getExample();
        response = (OASGetCampaignOffersResponse) api.getCampaignOffers(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASGetCampaignOffersResponse.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASGetCampaignOffersResponse.getExample();
        response = (OASGetCampaignOffersResponse) api.getCampaignOffers(params);
        System.assertEquals(expectedResponse, response);
    }

    /**
     * Список товаров, находящихся в карантине по цене в магазине
     *
     * Возвращает список товаров, которые находятся в карантине по цене, установленной в заданном магазине.\n\nПроверьте цену каждого из товаров, который попал в карантин. Если ошибки нет и цена правильная, подтвердите ее с помощью запроса [POST campaigns/{campaignId}/price-quarantine/confirm](../../reference/assortment/confirmCampaignPrices.md). Если цена в самом деле ошибочная, установите верную с помощью запроса [POST campaigns/{campaignId}/offer-prices/updates](../../reference/assortment/updatePrices.md).\n\n{% note info &quot;𝓠 Что такое карантин?&quot; %}\n\n𝓐 Товар попадает в карантин, если его цена меняется слишком резко или слишком сильно отличается от рыночной. [Подробнее](https://yandex.ru/support/marketplace/assortment/operations/prices.html#quarantine)\n\n{% endnote %}\n\nВ запросе можно использовать фильтры.\n\nРезультаты возвращаются постранично.\n\n|**⚙️ Лимит:** 5000 товаров в минуту|\n|-|\n
     */
    @isTest
    private static void getCampaignQuarantineOffersTest() {
        HttpResponse res = new HttpResponse();
        res.setStatusCode(200);
        res.setStatus('OK');
        Test.setMock(HttpCalloutMock.class, new OASResponseMock(res));

        Map<String, Object> params = new Map<String, Object>{
            'campaignId' => 2147483648L,
            'oaSGetQuarantineOffersRequest' => '',
            'pageToken' => eyBuZXh0SWQ6IDIzNDIgfQ==,
            'r_limit' => 20
        };

        OASClient client;
        OASFbsApi api;
        OASGetQuarantineOffersResponse response;
        OASGetQuarantineOffersResponse expectedResponse;
        String js = '';

        client = new OASClient();
        api = new OASFbsApi(client);

        js = JSON.serialize(OASGetQuarantineOffersResponse.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASGetQuarantineOffersResponse.getExample();
        response = (OASGetQuarantineOffersResponse) api.getCampaignQuarantineOffers(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASGetQuarantineOffersResponse.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASGetQuarantineOffersResponse.getExample();
        response = (OASGetQuarantineOffersResponse) api.getCampaignQuarantineOffers(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASGetQuarantineOffersResponse.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASGetQuarantineOffersResponse.getExample();
        response = (OASGetQuarantineOffersResponse) api.getCampaignQuarantineOffers(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASGetQuarantineOffersResponse.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASGetQuarantineOffersResponse.getExample();
        response = (OASGetQuarantineOffersResponse) api.getCampaignQuarantineOffers(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASGetQuarantineOffersResponse.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASGetQuarantineOffersResponse.getExample();
        response = (OASGetQuarantineOffersResponse) api.getCampaignQuarantineOffers(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASGetQuarantineOffersResponse.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASGetQuarantineOffersResponse.getExample();
        response = (OASGetQuarantineOffersResponse) api.getCampaignQuarantineOffers(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASGetQuarantineOffersResponse.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASGetQuarantineOffersResponse.getExample();
        response = (OASGetQuarantineOffersResponse) api.getCampaignQuarantineOffers(params);
        System.assertEquals(expectedResponse, response);
    }

    /**
     * Регион магазина
     *
     * {% note warning &quot;&quot; %}\n\nЭтот метод устарел. Вместо него используйте [GET campaigns/{campaignId}/settings](../../reference/campaigns/getCampaignSettings.md).\n\n{% endnote %}\n\nВозвращает регион, в котором находится магазин.\n|**⚙️ Лимит:** 5 000 запросов в час|\n|-|\n
     */
    @isTest
    private static void getCampaignRegionTest() {
        HttpResponse res = new HttpResponse();
        res.setStatusCode(200);
        res.setStatus('OK');
        Test.setMock(HttpCalloutMock.class, new OASResponseMock(res));

        Map<String, Object> params = new Map<String, Object>{
            'campaignId' => 2147483648L
        };

        OASClient client;
        OASFbsApi api;
        OASGetCampaignRegionResponse response;
        OASGetCampaignRegionResponse expectedResponse;
        String js = '';

        client = new OASClient();
        api = new OASFbsApi(client);

        js = JSON.serialize(OASGetCampaignRegionResponse.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASGetCampaignRegionResponse.getExample();
        response = (OASGetCampaignRegionResponse) api.getCampaignRegion(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASGetCampaignRegionResponse.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASGetCampaignRegionResponse.getExample();
        response = (OASGetCampaignRegionResponse) api.getCampaignRegion(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASGetCampaignRegionResponse.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASGetCampaignRegionResponse.getExample();
        response = (OASGetCampaignRegionResponse) api.getCampaignRegion(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASGetCampaignRegionResponse.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASGetCampaignRegionResponse.getExample();
        response = (OASGetCampaignRegionResponse) api.getCampaignRegion(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASGetCampaignRegionResponse.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASGetCampaignRegionResponse.getExample();
        response = (OASGetCampaignRegionResponse) api.getCampaignRegion(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASGetCampaignRegionResponse.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASGetCampaignRegionResponse.getExample();
        response = (OASGetCampaignRegionResponse) api.getCampaignRegion(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASGetCampaignRegionResponse.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASGetCampaignRegionResponse.getExample();
        response = (OASGetCampaignRegionResponse) api.getCampaignRegion(params);
        System.assertEquals(expectedResponse, response);
    }

    /**
     * Настройки магазина
     *
     * Возвращает информацию о настройках магазина, идентификатор которого указан в запросе.\n|**⚙️ Лимит:** 1000 запросов в час|\n|-|\n
     */
    @isTest
    private static void getCampaignSettingsTest() {
        HttpResponse res = new HttpResponse();
        res.setStatusCode(200);
        res.setStatus('OK');
        Test.setMock(HttpCalloutMock.class, new OASResponseMock(res));

        Map<String, Object> params = new Map<String, Object>{
            'campaignId' => 2147483648L
        };

        OASClient client;
        OASFbsApi api;
        OASGetCampaignSettingsResponse response;
        OASGetCampaignSettingsResponse expectedResponse;
        String js = '';

        client = new OASClient();
        api = new OASFbsApi(client);

        js = JSON.serialize(OASGetCampaignSettingsResponse.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASGetCampaignSettingsResponse.getExample();
        response = (OASGetCampaignSettingsResponse) api.getCampaignSettings(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASGetCampaignSettingsResponse.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASGetCampaignSettingsResponse.getExample();
        response = (OASGetCampaignSettingsResponse) api.getCampaignSettings(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASGetCampaignSettingsResponse.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASGetCampaignSettingsResponse.getExample();
        response = (OASGetCampaignSettingsResponse) api.getCampaignSettings(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASGetCampaignSettingsResponse.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASGetCampaignSettingsResponse.getExample();
        response = (OASGetCampaignSettingsResponse) api.getCampaignSettings(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASGetCampaignSettingsResponse.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASGetCampaignSettingsResponse.getExample();
        response = (OASGetCampaignSettingsResponse) api.getCampaignSettings(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASGetCampaignSettingsResponse.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASGetCampaignSettingsResponse.getExample();
        response = (OASGetCampaignSettingsResponse) api.getCampaignSettings(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASGetCampaignSettingsResponse.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASGetCampaignSettingsResponse.getExample();
        response = (OASGetCampaignSettingsResponse) api.getCampaignSettings(params);
        System.assertEquals(expectedResponse, response);
    }

    /**
     * Список магазинов пользователя
     *
     * Возвращает список магазинов, к которым имеет доступ пользователь — владелец авторизационного токена, использованного в запросе. Для агентских пользователей список состоит из подагентских магазинов.\n|**⚙️ Лимит:** 1000 запросов в час|\n|-|\n
     */
    @isTest
    private static void getCampaignsTest() {
        HttpResponse res = new HttpResponse();
        res.setStatusCode(200);
        res.setStatus('OK');
        Test.setMock(HttpCalloutMock.class, new OASResponseMock(res));

        Map<String, Object> params = new Map<String, Object>{
            'page' => '',
            'pageSize' => ''
        };

        OASClient client;
        OASFbsApi api;
        OASGetCampaignsResponse response;
        OASGetCampaignsResponse expectedResponse;
        String js = '';

        client = new OASClient();
        api = new OASFbsApi(client);

        js = JSON.serialize(OASGetCampaignsResponse.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASGetCampaignsResponse.getExample();
        response = (OASGetCampaignsResponse) api.getCampaigns(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASGetCampaignsResponse.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASGetCampaignsResponse.getExample();
        response = (OASGetCampaignsResponse) api.getCampaigns(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASGetCampaignsResponse.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASGetCampaignsResponse.getExample();
        response = (OASGetCampaignsResponse) api.getCampaigns(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASGetCampaignsResponse.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASGetCampaignsResponse.getExample();
        response = (OASGetCampaignsResponse) api.getCampaigns(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASGetCampaignsResponse.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASGetCampaignsResponse.getExample();
        response = (OASGetCampaignsResponse) api.getCampaigns(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASGetCampaignsResponse.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASGetCampaignsResponse.getExample();
        response = (OASGetCampaignsResponse) api.getCampaigns(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASGetCampaignsResponse.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASGetCampaignsResponse.getExample();
        response = (OASGetCampaignsResponse) api.getCampaigns(params);
        System.assertEquals(expectedResponse, response);
    }

    /**
     * Магазины, доступные логину
     *
     * Возвращает список магазинов, к которым у пользователя с указанным логином есть доступ.\n|**⚙️ Лимит:** 100 запросов в час|\n|-|\n
     */
    @isTest
    private static void getCampaignsByLoginTest() {
        HttpResponse res = new HttpResponse();
        res.setStatusCode(200);
        res.setStatus('OK');
        Test.setMock(HttpCalloutMock.class, new OASResponseMock(res));

        Map<String, Object> params = new Map<String, Object>{
            'login' => 'null',
            'page' => '',
            'pageSize' => ''
        };

        OASClient client;
        OASFbsApi api;
        OASGetCampaignsResponse response;
        OASGetCampaignsResponse expectedResponse;
        String js = '';

        client = new OASClient();
        api = new OASFbsApi(client);

        js = JSON.serialize(OASGetCampaignsResponse.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASGetCampaignsResponse.getExample();
        response = (OASGetCampaignsResponse) api.getCampaignsByLogin(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASGetCampaignsResponse.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASGetCampaignsResponse.getExample();
        response = (OASGetCampaignsResponse) api.getCampaignsByLogin(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASGetCampaignsResponse.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASGetCampaignsResponse.getExample();
        response = (OASGetCampaignsResponse) api.getCampaignsByLogin(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASGetCampaignsResponse.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASGetCampaignsResponse.getExample();
        response = (OASGetCampaignsResponse) api.getCampaignsByLogin(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASGetCampaignsResponse.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASGetCampaignsResponse.getExample();
        response = (OASGetCampaignsResponse) api.getCampaignsByLogin(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASGetCampaignsResponse.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASGetCampaignsResponse.getExample();
        response = (OASGetCampaignsResponse) api.getCampaignsByLogin(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASGetCampaignsResponse.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASGetCampaignsResponse.getExample();
        response = (OASGetCampaignsResponse) api.getCampaignsByLogin(params);
        System.assertEquals(expectedResponse, response);
    }

    /**
     * Лимит на установку кванта продажи и минимального количества товаров в заказе
     *
     * Возвращает лимит на установку [кванта](*quantum) и минимального количества товаров в заказе, которые вы можете задать для товаров указанных категорий.\n\nЕсли вы передадите значение кванта или минимального количества товаров выше установленного Маркетом ограничения, товар будет скрыт с витрины.\n\nПодробнее о том, как продавать товары по несколько штук, читайте [в Справке Маркета для продавцов](https://yandex.ru/support2/marketplace/ru/assortment/fields/quantum).\n\n|**⚙️ Лимит:** 1 000 запросов в час|\n|-|\n
     */
    @isTest
    private static void getCategoriesMaxSaleQuantumTest() {
        HttpResponse res = new HttpResponse();
        res.setStatusCode(200);
        res.setStatus('OK');
        Test.setMock(HttpCalloutMock.class, new OASResponseMock(res));

        Map<String, Object> params = new Map<String, Object>{
            'oaSGetCategoriesMaxSaleQuantumReques' => ''
        };

        OASClient client;
        OASFbsApi api;
        OASGetCategoriesMaxSaleQuantumRespon response;
        OASGetCategoriesMaxSaleQuantumRespon expectedResponse;
        String js = '';

        client = new OASClient();
        api = new OASFbsApi(client);

        js = JSON.serialize(OASGetCategoriesMaxSaleQuantumRespon.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASGetCategoriesMaxSaleQuantumRespon.getExample();
        response = (OASGetCategoriesMaxSaleQuantumRespon) api.getCategoriesMaxSaleQuantum(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASGetCategoriesMaxSaleQuantumRespon.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASGetCategoriesMaxSaleQuantumRespon.getExample();
        response = (OASGetCategoriesMaxSaleQuantumRespon) api.getCategoriesMaxSaleQuantum(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASGetCategoriesMaxSaleQuantumRespon.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASGetCategoriesMaxSaleQuantumRespon.getExample();
        response = (OASGetCategoriesMaxSaleQuantumRespon) api.getCategoriesMaxSaleQuantum(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASGetCategoriesMaxSaleQuantumRespon.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASGetCategoriesMaxSaleQuantumRespon.getExample();
        response = (OASGetCategoriesMaxSaleQuantumRespon) api.getCategoriesMaxSaleQuantum(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASGetCategoriesMaxSaleQuantumRespon.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASGetCategoriesMaxSaleQuantumRespon.getExample();
        response = (OASGetCategoriesMaxSaleQuantumRespon) api.getCategoriesMaxSaleQuantum(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASGetCategoriesMaxSaleQuantumRespon.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASGetCategoriesMaxSaleQuantumRespon.getExample();
        response = (OASGetCategoriesMaxSaleQuantumRespon) api.getCategoriesMaxSaleQuantum(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASGetCategoriesMaxSaleQuantumRespon.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASGetCategoriesMaxSaleQuantumRespon.getExample();
        response = (OASGetCategoriesMaxSaleQuantumRespon) api.getCategoriesMaxSaleQuantum(params);
        System.assertEquals(expectedResponse, response);
    }

    /**
     * Дерево категорий
     *
     * Возвращает дерево категорий Маркета.\n\n|**⚙️ Лимит:** 1 000 запросов в час|\n|-|\n
     */
    @isTest
    private static void getCategoriesTreeTest() {
        HttpResponse res = new HttpResponse();
        res.setStatusCode(200);
        res.setStatus('OK');
        Test.setMock(HttpCalloutMock.class, new OASResponseMock(res));

        Map<String, Object> params = new Map<String, Object>{
            'oaSGetCategoriesRequest' => ''
        };

        OASClient client;
        OASFbsApi api;
        OASGetCategoriesResponse response;
        OASGetCategoriesResponse expectedResponse;
        String js = '';

        client = new OASClient();
        api = new OASFbsApi(client);

        js = JSON.serialize(OASGetCategoriesResponse.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASGetCategoriesResponse.getExample();
        response = (OASGetCategoriesResponse) api.getCategoriesTree(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASGetCategoriesResponse.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASGetCategoriesResponse.getExample();
        response = (OASGetCategoriesResponse) api.getCategoriesTree(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASGetCategoriesResponse.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASGetCategoriesResponse.getExample();
        response = (OASGetCategoriesResponse) api.getCategoriesTree(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASGetCategoriesResponse.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASGetCategoriesResponse.getExample();
        response = (OASGetCategoriesResponse) api.getCategoriesTree(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASGetCategoriesResponse.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASGetCategoriesResponse.getExample();
        response = (OASGetCategoriesResponse) api.getCategoriesTree(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASGetCategoriesResponse.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASGetCategoriesResponse.getExample();
        response = (OASGetCategoriesResponse) api.getCategoriesTree(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASGetCategoriesResponse.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASGetCategoriesResponse.getExample();
        response = (OASGetCategoriesResponse) api.getCategoriesTree(params);
        System.assertEquals(expectedResponse, response);
    }

    /**
     * Списки характеристик товаров по категориям
     *
     * Возвращает список характеристик с допустимыми значениями для заданной категории.\n\n|**⚙️ Лимит:** 50 категорий в минуту |\n|-|\n
     */
    @isTest
    private static void getCategoryContentParametersTest() {
        HttpResponse res = new HttpResponse();
        res.setStatusCode(200);
        res.setStatus('OK');
        Test.setMock(HttpCalloutMock.class, new OASResponseMock(res));

        Map<String, Object> params = new Map<String, Object>{
            'categoryId' => 2147483648L
        };

        OASClient client;
        OASFbsApi api;
        OASGetCategoryContentParametersRespo response;
        OASGetCategoryContentParametersRespo expectedResponse;
        String js = '';

        client = new OASClient();
        api = new OASFbsApi(client);

        js = JSON.serialize(OASGetCategoryContentParametersRespo.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASGetCategoryContentParametersRespo.getExample();
        response = (OASGetCategoryContentParametersRespo) api.getCategoryContentParameters(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASGetCategoryContentParametersRespo.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASGetCategoryContentParametersRespo.getExample();
        response = (OASGetCategoryContentParametersRespo) api.getCategoryContentParameters(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASGetCategoryContentParametersRespo.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASGetCategoryContentParametersRespo.getExample();
        response = (OASGetCategoryContentParametersRespo) api.getCategoryContentParameters(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASGetCategoryContentParametersRespo.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASGetCategoryContentParametersRespo.getExample();
        response = (OASGetCategoryContentParametersRespo) api.getCategoryContentParameters(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASGetCategoryContentParametersRespo.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASGetCategoryContentParametersRespo.getExample();
        response = (OASGetCategoryContentParametersRespo) api.getCategoryContentParameters(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASGetCategoryContentParametersRespo.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASGetCategoryContentParametersRespo.getExample();
        response = (OASGetCategoryContentParametersRespo) api.getCategoryContentParameters(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASGetCategoryContentParametersRespo.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASGetCategoryContentParametersRespo.getExample();
        response = (OASGetCategoryContentParametersRespo) api.getCategoryContentParameters(params);
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
        OASFbsApi api;
        OASGetChatHistoryResponse response;
        OASGetChatHistoryResponse expectedResponse;
        String js = '';

        client = new OASClient();
        api = new OASFbsApi(client);

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
        OASFbsApi api;
        OASGetChatsResponse response;
        OASGetChatsResponse expectedResponse;
        String js = '';

        client = new OASClient();
        api = new OASFbsApi(client);

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
        OASFbsApi api;
        OASGetDeliveryServicesResponse response;
        OASGetDeliveryServicesResponse expectedResponse;
        String js = '';

        client = new OASClient();
        api = new OASFbsApi(client);

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

    /**
     * Информация о прайс-листе
     *
     * {% note warning &quot;&quot; %}\n\nЭтот метод устарел. Не используйте его.\n\n{% endnote %}\n\nВозвращает информацию о прайс-листе, размещенном на Маркете для заданного магазина. Также ресурс возвращает результаты автоматических проверок прайс-листа.\n|**⚙️ Лимит:** 1000 запросов в час|\n|-|\n
     */
    @isTest
    private static void getFeedTest() {
        HttpResponse res = new HttpResponse();
        res.setStatusCode(200);
        res.setStatus('OK');
        Test.setMock(HttpCalloutMock.class, new OASResponseMock(res));

        Map<String, Object> params = new Map<String, Object>{
            'campaignId' => 2147483648L,
            'feedId' => 2147483648L
        };

        OASClient client;
        OASFbsApi api;
        OASGetFeedResponse response;
        OASGetFeedResponse expectedResponse;
        String js = '';

        client = new OASClient();
        api = new OASFbsApi(client);

        js = JSON.serialize(OASGetFeedResponse.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASGetFeedResponse.getExample();
        response = (OASGetFeedResponse) api.getFeed(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASGetFeedResponse.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASGetFeedResponse.getExample();
        response = (OASGetFeedResponse) api.getFeed(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASGetFeedResponse.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASGetFeedResponse.getExample();
        response = (OASGetFeedResponse) api.getFeed(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASGetFeedResponse.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASGetFeedResponse.getExample();
        response = (OASGetFeedResponse) api.getFeed(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASGetFeedResponse.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASGetFeedResponse.getExample();
        response = (OASGetFeedResponse) api.getFeed(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASGetFeedResponse.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASGetFeedResponse.getExample();
        response = (OASGetFeedResponse) api.getFeed(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASGetFeedResponse.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASGetFeedResponse.getExample();
        response = (OASGetFeedResponse) api.getFeed(params);
        System.assertEquals(expectedResponse, response);
    }

    /**
     * Отчет по индексации прайс-листа
     *
     * {% note warning &quot;&quot; %}\n\nЭтот метод устарел. Не используйте его.\n\n{% endnote %}\n\nВозвращает отчет по индексации прайс-листа для заданного магазина. Отчет позволяет получить статистику загрузки прайс-листа и результаты его автоматических проверок.\n\nДанные в отчете возвращаются в порядке убывания значений параметра &#x60;generationId&#x60;.\n\n|**⚙️ Лимит:** 1 000 запросов в час|\n|-|\n
     */
    @isTest
    private static void getFeedIndexLogsTest() {
        HttpResponse res = new HttpResponse();
        res.setStatusCode(200);
        res.setStatus('OK');
        Test.setMock(HttpCalloutMock.class, new OASResponseMock(res));

        Map<String, Object> params = new Map<String, Object>{
            'campaignId' => 2147483648L,
            'feedId' => 2147483648L,
            'r_limit' => 20,
            'publishedTimeFrom' => Datetime.newInstanceGmt(2013, 11, 12, 3, 3, 3),
            'publishedTimeTo' => Datetime.newInstanceGmt(2013, 11, 12, 3, 3, 3),
            'status' => ''
        };

        OASClient client;
        OASFbsApi api;
        OASGetFeedIndexLogsResponse response;
        OASGetFeedIndexLogsResponse expectedResponse;
        String js = '';

        client = new OASClient();
        api = new OASFbsApi(client);

        js = JSON.serialize(OASGetFeedIndexLogsResponse.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASGetFeedIndexLogsResponse.getExample();
        response = (OASGetFeedIndexLogsResponse) api.getFeedIndexLogs(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASGetFeedIndexLogsResponse.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASGetFeedIndexLogsResponse.getExample();
        response = (OASGetFeedIndexLogsResponse) api.getFeedIndexLogs(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASGetFeedIndexLogsResponse.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASGetFeedIndexLogsResponse.getExample();
        response = (OASGetFeedIndexLogsResponse) api.getFeedIndexLogs(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASGetFeedIndexLogsResponse.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASGetFeedIndexLogsResponse.getExample();
        response = (OASGetFeedIndexLogsResponse) api.getFeedIndexLogs(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASGetFeedIndexLogsResponse.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASGetFeedIndexLogsResponse.getExample();
        response = (OASGetFeedIndexLogsResponse) api.getFeedIndexLogs(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASGetFeedIndexLogsResponse.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASGetFeedIndexLogsResponse.getExample();
        response = (OASGetFeedIndexLogsResponse) api.getFeedIndexLogs(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASGetFeedIndexLogsResponse.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASGetFeedIndexLogsResponse.getExample();
        response = (OASGetFeedIndexLogsResponse) api.getFeedIndexLogs(params);
        System.assertEquals(expectedResponse, response);
    }

    /**
     * Новые и обновленные отзывы о магазине
     *
     * {% note warning &quot;&quot; %}\n\nЭтот метод устарел. Не используйте его.\n\n{% endnote %}\n\nВозвращает новые и обновленные отзывы о магазине на Маркете.\n\nРезультаты возвращаются постранично, одна страница содержит не более 20 отзывов. Выходные данные содержат идентификатор следующей страницы.\n\n|**⚙️ Лимит:** 100 запросов в час|\n|-|\n
     */
    @isTest
    private static void getFeedbackAndCommentUpdatesTest() {
        HttpResponse res = new HttpResponse();
        res.setStatusCode(200);
        res.setStatus('OK');
        Test.setMock(HttpCalloutMock.class, new OASResponseMock(res));

        Map<String, Object> params = new Map<String, Object>{
            'campaignId' => 2147483648L,
            'pageToken' => eyBuZXh0SWQ6IDIzNDIgfQ==,
            'r_limit' => 20,
            'fromDate' => Date.newInstance(1960, 2, 17)
        };

        OASClient client;
        OASFbsApi api;
        OASGetFeedbackListResponse response;
        OASGetFeedbackListResponse expectedResponse;
        String js = '';

        client = new OASClient();
        api = new OASFbsApi(client);

        js = JSON.serialize(OASGetFeedbackListResponse.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASGetFeedbackListResponse.getExample();
        response = (OASGetFeedbackListResponse) api.getFeedbackAndCommentUpdates(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASGetFeedbackListResponse.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASGetFeedbackListResponse.getExample();
        response = (OASGetFeedbackListResponse) api.getFeedbackAndCommentUpdates(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASGetFeedbackListResponse.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASGetFeedbackListResponse.getExample();
        response = (OASGetFeedbackListResponse) api.getFeedbackAndCommentUpdates(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASGetFeedbackListResponse.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASGetFeedbackListResponse.getExample();
        response = (OASGetFeedbackListResponse) api.getFeedbackAndCommentUpdates(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASGetFeedbackListResponse.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASGetFeedbackListResponse.getExample();
        response = (OASGetFeedbackListResponse) api.getFeedbackAndCommentUpdates(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASGetFeedbackListResponse.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASGetFeedbackListResponse.getExample();
        response = (OASGetFeedbackListResponse) api.getFeedbackAndCommentUpdates(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASGetFeedbackListResponse.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASGetFeedbackListResponse.getExample();
        response = (OASGetFeedbackListResponse) api.getFeedbackAndCommentUpdates(params);
        System.assertEquals(expectedResponse, response);
    }

    /**
     * Список прайс-листов магазина
     *
     * {% note warning &quot;&quot; %}\n\nЭтот метод устарел. Не используйте его.\n\n{% endnote %}\n\nВозвращает список прайс-листов, размещенных на Маркете для магазина. Также ресурс возвращает результаты автоматических проверок прайс-листов.\n|**⚙️ Лимит:** 1000 запросов в час|\n|-|\n
     */
    @isTest
    private static void getFeedsTest() {
        HttpResponse res = new HttpResponse();
        res.setStatusCode(200);
        res.setStatus('OK');
        Test.setMock(HttpCalloutMock.class, new OASResponseMock(res));

        Map<String, Object> params = new Map<String, Object>{
            'campaignId' => 2147483648L
        };

        OASClient client;
        OASFbsApi api;
        OASGetFeedsResponse response;
        OASGetFeedsResponse expectedResponse;
        String js = '';

        client = new OASClient();
        api = new OASFbsApi(client);

        js = JSON.serialize(OASGetFeedsResponse.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASGetFeedsResponse.getExample();
        response = (OASGetFeedsResponse) api.getFeeds(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASGetFeedsResponse.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASGetFeedsResponse.getExample();
        response = (OASGetFeedsResponse) api.getFeeds(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASGetFeedsResponse.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASGetFeedsResponse.getExample();
        response = (OASGetFeedsResponse) api.getFeeds(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASGetFeedsResponse.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASGetFeedsResponse.getExample();
        response = (OASGetFeedsResponse) api.getFeeds(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASGetFeedsResponse.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASGetFeedsResponse.getExample();
        response = (OASGetFeedsResponse) api.getFeeds(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASGetFeedsResponse.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASGetFeedsResponse.getExample();
        response = (OASGetFeedsResponse) api.getFeeds(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASGetFeedsResponse.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASGetFeedsResponse.getExample();
        response = (OASGetFeedsResponse) api.getFeeds(params);
        System.assertEquals(expectedResponse, response);
    }

    /**
     * Получение комментариев к отзыву
     *
     * Возвращает комментарии к отзыву.\n\nРезультаты возвращаются постранично, одна страница содержит не более 20 комментариев.\n\nКомментарии расположены в порядке публикации, поэтому вы можете передавать определенный идентификатор страницы в &#x60;page_token&#x60;, если вы получали его ранее.\n\n|**⚙️ Лимит:** 1 000 запросов в час|\n|-|\n
     */
    @isTest
    private static void getGoodsFeedbackCommentsTest() {
        HttpResponse res = new HttpResponse();
        res.setStatusCode(200);
        res.setStatus('OK');
        Test.setMock(HttpCalloutMock.class, new OASResponseMock(res));

        Map<String, Object> params = new Map<String, Object>{
            'businessId' => 2147483648L,
            'oaSGetGoodsFeedbackCommentsRequest' => '',
            'pageToken' => eyBuZXh0SWQ6IDIzNDIgfQ==,
            'r_limit' => 20
        };

        OASClient client;
        OASFbsApi api;
        OASGetGoodsFeedbackCommentsResponse response;
        OASGetGoodsFeedbackCommentsResponse expectedResponse;
        String js = '';

        client = new OASClient();
        api = new OASFbsApi(client);

        js = JSON.serialize(OASGetGoodsFeedbackCommentsResponse.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASGetGoodsFeedbackCommentsResponse.getExample();
        response = (OASGetGoodsFeedbackCommentsResponse) api.getGoodsFeedbackComments(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASGetGoodsFeedbackCommentsResponse.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASGetGoodsFeedbackCommentsResponse.getExample();
        response = (OASGetGoodsFeedbackCommentsResponse) api.getGoodsFeedbackComments(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASGetGoodsFeedbackCommentsResponse.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASGetGoodsFeedbackCommentsResponse.getExample();
        response = (OASGetGoodsFeedbackCommentsResponse) api.getGoodsFeedbackComments(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASGetGoodsFeedbackCommentsResponse.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASGetGoodsFeedbackCommentsResponse.getExample();
        response = (OASGetGoodsFeedbackCommentsResponse) api.getGoodsFeedbackComments(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASGetGoodsFeedbackCommentsResponse.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASGetGoodsFeedbackCommentsResponse.getExample();
        response = (OASGetGoodsFeedbackCommentsResponse) api.getGoodsFeedbackComments(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASGetGoodsFeedbackCommentsResponse.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASGetGoodsFeedbackCommentsResponse.getExample();
        response = (OASGetGoodsFeedbackCommentsResponse) api.getGoodsFeedbackComments(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASGetGoodsFeedbackCommentsResponse.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASGetGoodsFeedbackCommentsResponse.getExample();
        response = (OASGetGoodsFeedbackCommentsResponse) api.getGoodsFeedbackComments(params);
        System.assertEquals(expectedResponse, response);
    }

    /**
     * Получение отзывов о товарах продавца
     *
     * Возвращает все отзывы о товарах продавца по указанным фильтрам.\n\nРезультаты возвращаются постранично, одна страница содержит не более 20 отзывов.\n\nОтзывы расположены в порядке публикации, поэтому вы можете передавать определенный идентификатор страницы в &#x60;page_token&#x60;, если вы получали его ранее.\n\n|**⚙️ Лимит:** 1 000 запросов в час|\n|-|\n
     */
    @isTest
    private static void getGoodsFeedbacksTest() {
        HttpResponse res = new HttpResponse();
        res.setStatusCode(200);
        res.setStatus('OK');
        Test.setMock(HttpCalloutMock.class, new OASResponseMock(res));

        Map<String, Object> params = new Map<String, Object>{
            'businessId' => 2147483648L,
            'pageToken' => eyBuZXh0SWQ6IDIzNDIgfQ==,
            'r_limit' => 20,
            'oaSGetGoodsFeedbackRequest' => ''
        };

        OASClient client;
        OASFbsApi api;
        OASGetGoodsFeedbackResponse response;
        OASGetGoodsFeedbackResponse expectedResponse;
        String js = '';

        client = new OASClient();
        api = new OASFbsApi(client);

        js = JSON.serialize(OASGetGoodsFeedbackResponse.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASGetGoodsFeedbackResponse.getExample();
        response = (OASGetGoodsFeedbackResponse) api.getGoodsFeedbacks(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASGetGoodsFeedbackResponse.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASGetGoodsFeedbackResponse.getExample();
        response = (OASGetGoodsFeedbackResponse) api.getGoodsFeedbacks(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASGetGoodsFeedbackResponse.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASGetGoodsFeedbackResponse.getExample();
        response = (OASGetGoodsFeedbackResponse) api.getGoodsFeedbacks(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASGetGoodsFeedbackResponse.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASGetGoodsFeedbackResponse.getExample();
        response = (OASGetGoodsFeedbackResponse) api.getGoodsFeedbacks(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASGetGoodsFeedbackResponse.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASGetGoodsFeedbackResponse.getExample();
        response = (OASGetGoodsFeedbackResponse) api.getGoodsFeedbacks(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASGetGoodsFeedbackResponse.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASGetGoodsFeedbackResponse.getExample();
        response = (OASGetGoodsFeedbackResponse) api.getGoodsFeedbacks(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASGetGoodsFeedbackResponse.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASGetGoodsFeedbackResponse.getExample();
        response = (OASGetGoodsFeedbackResponse) api.getGoodsFeedbacks(params);
        System.assertEquals(expectedResponse, response);
    }

    /**
     * Отчет по товарам
     *
     * Возвращает подробный отчет по товарам, которые вы разместили на Маркете. С помощью отчета вы можете узнать, например, об остатках на складе, об условиях хранения ваших товаров и т. д.\n\n|**⚙️ Лимит:** 5000 товаров в минуту|\n|-|\n
     */
    @isTest
    private static void getGoodsStatsTest() {
        HttpResponse res = new HttpResponse();
        res.setStatusCode(200);
        res.setStatus('OK');
        Test.setMock(HttpCalloutMock.class, new OASResponseMock(res));

        Map<String, Object> params = new Map<String, Object>{
            'campaignId' => 2147483648L,
            'oaSGetGoodsStatsRequest' => ''
        };

        OASClient client;
        OASFbsApi api;
        OASGetGoodsStatsResponse response;
        OASGetGoodsStatsResponse expectedResponse;
        String js = '';

        client = new OASClient();
        api = new OASFbsApi(client);

        js = JSON.serialize(OASGetGoodsStatsResponse.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASGetGoodsStatsResponse.getExample();
        response = (OASGetGoodsStatsResponse) api.getGoodsStats(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASGetGoodsStatsResponse.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASGetGoodsStatsResponse.getExample();
        response = (OASGetGoodsStatsResponse) api.getGoodsStats(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASGetGoodsStatsResponse.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASGetGoodsStatsResponse.getExample();
        response = (OASGetGoodsStatsResponse) api.getGoodsStats(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASGetGoodsStatsResponse.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASGetGoodsStatsResponse.getExample();
        response = (OASGetGoodsStatsResponse) api.getGoodsStats(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASGetGoodsStatsResponse.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASGetGoodsStatsResponse.getExample();
        response = (OASGetGoodsStatsResponse) api.getGoodsStats(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASGetGoodsStatsResponse.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASGetGoodsStatsResponse.getExample();
        response = (OASGetGoodsStatsResponse) api.getGoodsStats(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASGetGoodsStatsResponse.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASGetGoodsStatsResponse.getExample();
        response = (OASGetGoodsStatsResponse) api.getGoodsStats(params);
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
        OASFbsApi api;
        OASGetHiddenOffersResponse response;
        OASGetHiddenOffersResponse expectedResponse;
        String js = '';

        client = new OASClient();
        api = new OASFbsApi(client);

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

    /**
     * Получение информации о заполненности карточек магазина
     *
     * Возвращает сведения о состоянии контента для заданных товаров:\n\n* создана ли карточка товара и в каком она статусе;\n* заполненность карточки в процентах;\n* переданные характеристики товаров;\n* есть ли ошибки или предупреждения, связанные с контентом;\n* рекомендации по заполнению карточки.\n\n|**⚙️ Лимит:** 600 запросов в минуту|\n|-|\n
     */
    @isTest
    private static void getOfferCardsContentStatusTest() {
        HttpResponse res = new HttpResponse();
        res.setStatusCode(200);
        res.setStatus('OK');
        Test.setMock(HttpCalloutMock.class, new OASResponseMock(res));

        Map<String, Object> params = new Map<String, Object>{
            'businessId' => 2147483648L,
            'pageToken' => eyBuZXh0SWQ6IDIzNDIgfQ==,
            'r_limit' => 20,
            'oaSGetOfferCardsContentStatusRequest' => ''
        };

        OASClient client;
        OASFbsApi api;
        OASGetOfferCardsContentStatusRespons response;
        OASGetOfferCardsContentStatusRespons expectedResponse;
        String js = '';

        client = new OASClient();
        api = new OASFbsApi(client);

        js = JSON.serialize(OASGetOfferCardsContentStatusRespons.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASGetOfferCardsContentStatusRespons.getExample();
        response = (OASGetOfferCardsContentStatusRespons) api.getOfferCardsContentStatus(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASGetOfferCardsContentStatusRespons.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASGetOfferCardsContentStatusRespons.getExample();
        response = (OASGetOfferCardsContentStatusRespons) api.getOfferCardsContentStatus(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASGetOfferCardsContentStatusRespons.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASGetOfferCardsContentStatusRespons.getExample();
        response = (OASGetOfferCardsContentStatusRespons) api.getOfferCardsContentStatus(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASGetOfferCardsContentStatusRespons.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASGetOfferCardsContentStatusRespons.getExample();
        response = (OASGetOfferCardsContentStatusRespons) api.getOfferCardsContentStatus(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASGetOfferCardsContentStatusRespons.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASGetOfferCardsContentStatusRespons.getExample();
        response = (OASGetOfferCardsContentStatusRespons) api.getOfferCardsContentStatus(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASGetOfferCardsContentStatusRespons.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASGetOfferCardsContentStatusRespons.getExample();
        response = (OASGetOfferCardsContentStatusRespons) api.getOfferCardsContentStatus(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASGetOfferCardsContentStatusRespons.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASGetOfferCardsContentStatusRespons.getExample();
        response = (OASGetOfferCardsContentStatusRespons) api.getOfferCardsContentStatus(params);
        System.assertEquals(expectedResponse, response);
    }

    /**
     * Список товаров в каталоге
     *
     * {% note warning &quot;&quot; %}\n\nЭтот метод устарел. Вместо него используйте [POST businesses/{businessId}/offer-mappings](../../reference/business-assortment/getOfferMappings.md).\n\n{% endnote %}\n\nДля каждого товара, который вы размещаете на Маркете, возвращается информация о карточках Маркета, к которым привязан этот товар:\n\n* Идентификатор текущей карточки (marketSku), карточки, которая проходит модерацию и последней отклоненной карточки.\n* Описание товара, которое указано на карточке Маркета. Например, размер упаковки и вес товара.\n\nРезультаты возвращаются постранично. Выходные данные содержат идентификатор следующей страницы.\n\n{% note info %}\n\nКоличество товаров в каталоге магазина считается по данным за последние семь дней (не включая сегодня).\n\n{% endnote %}\n\n|**⚙️ Лимит:** рассчитывается по [формуле](*rule)|\n|-|\n\n[//]: &lt;&gt; (rule: суточный лимит товаров — количество товаров в каталоге магазина * 25)\n
     */
    @isTest
    private static void getOfferMappingEntriesTest() {
        HttpResponse res = new HttpResponse();
        res.setStatusCode(200);
        res.setStatus('OK');
        Test.setMock(HttpCalloutMock.class, new OASResponseMock(res));

        Map<String, Object> params = new Map<String, Object>{
            'campaignId' => 2147483648L,
            'offerId' => new List<String>{''},
            'shopSku' => new List<String>{''},
            'mappingKind' => '',
            'status' => new List<OASOfferProcessingStatusType>{OASOfferProcessingStatusType.getExample()},
            'availability' => new List<OASOfferAvailabilityStatusType>{OASOfferAvailabilityStatusType.getExample()},
            'categoryId' => new List<Integer>{0},
            'vendor' => new List<String>{''},
            'pageToken' => eyBuZXh0SWQ6IDIzNDIgfQ==,
            'r_limit' => 20
        };

        OASClient client;
        OASFbsApi api;
        OASGetOfferMappingEntriesResponse response;
        OASGetOfferMappingEntriesResponse expectedResponse;
        String js = '';

        client = new OASClient();
        api = new OASFbsApi(client);

        js = JSON.serialize(OASGetOfferMappingEntriesResponse.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASGetOfferMappingEntriesResponse.getExample();
        response = (OASGetOfferMappingEntriesResponse) api.getOfferMappingEntries(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASGetOfferMappingEntriesResponse.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASGetOfferMappingEntriesResponse.getExample();
        response = (OASGetOfferMappingEntriesResponse) api.getOfferMappingEntries(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASGetOfferMappingEntriesResponse.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASGetOfferMappingEntriesResponse.getExample();
        response = (OASGetOfferMappingEntriesResponse) api.getOfferMappingEntries(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASGetOfferMappingEntriesResponse.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASGetOfferMappingEntriesResponse.getExample();
        response = (OASGetOfferMappingEntriesResponse) api.getOfferMappingEntries(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASGetOfferMappingEntriesResponse.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASGetOfferMappingEntriesResponse.getExample();
        response = (OASGetOfferMappingEntriesResponse) api.getOfferMappingEntries(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASGetOfferMappingEntriesResponse.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASGetOfferMappingEntriesResponse.getExample();
        response = (OASGetOfferMappingEntriesResponse) api.getOfferMappingEntries(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASGetOfferMappingEntriesResponse.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASGetOfferMappingEntriesResponse.getExample();
        response = (OASGetOfferMappingEntriesResponse) api.getOfferMappingEntries(params);
        System.assertEquals(expectedResponse, response);
    }

    /**
     * Информация о товарах в каталоге
     *
     * Возвращает список товаров в каталоге, их категории на Маркете и характеристики каждого товара.\n\nМожно использовать тремя способами:\n* задать список интересующих SKU;\n* задать фильтр — в этом случае результаты возвращаются постранично;\n* не передавать тело запроса, чтобы получить список всех товаров в каталоге.\n\n|**⚙️ Лимит:** 600 запросов в минуту, не более 200 товаров в одном запросе|\n|-|\n
     */
    @isTest
    private static void getOfferMappingsTest() {
        HttpResponse res = new HttpResponse();
        res.setStatusCode(200);
        res.setStatus('OK');
        Test.setMock(HttpCalloutMock.class, new OASResponseMock(res));

        Map<String, Object> params = new Map<String, Object>{
            'businessId' => 2147483648L,
            'pageToken' => eyBuZXh0SWQ6IDIzNDIgfQ==,
            'r_limit' => 20,
            'oaSGetOfferMappingsRequest' => ''
        };

        OASClient client;
        OASFbsApi api;
        OASGetOfferMappingsResponse response;
        OASGetOfferMappingsResponse expectedResponse;
        String js = '';

        client = new OASClient();
        api = new OASFbsApi(client);

        js = JSON.serialize(OASGetOfferMappingsResponse.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASGetOfferMappingsResponse.getExample();
        response = (OASGetOfferMappingsResponse) api.getOfferMappings(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASGetOfferMappingsResponse.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASGetOfferMappingsResponse.getExample();
        response = (OASGetOfferMappingsResponse) api.getOfferMappings(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASGetOfferMappingsResponse.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASGetOfferMappingsResponse.getExample();
        response = (OASGetOfferMappingsResponse) api.getOfferMappings(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASGetOfferMappingsResponse.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASGetOfferMappingsResponse.getExample();
        response = (OASGetOfferMappingsResponse) api.getOfferMappings(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASGetOfferMappingsResponse.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASGetOfferMappingsResponse.getExample();
        response = (OASGetOfferMappingsResponse) api.getOfferMappings(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASGetOfferMappingsResponse.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASGetOfferMappingsResponse.getExample();
        response = (OASGetOfferMappingsResponse) api.getOfferMappings(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASGetOfferMappingsResponse.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASGetOfferMappingsResponse.getExample();
        response = (OASGetOfferMappingsResponse) api.getOfferMappings(params);
        System.assertEquals(expectedResponse, response);
    }

    /**
     * Рекомендации Маркета, касающиеся цен
     *
     * Метод возвращает рекомендации нескольких типов.\n\n**1. Порог для привлекательной цены. Он нужен для участия в софинансировании скидок.**\n\nПоказывает, какие **цены для участия** нужно установить, чтобы получить максимальные шансы на срабатывание скидок, софинансируемых Маркетом. [Как это устроено](https://yandex.ru/support/marketplace/marketing/smart-pricing.html#sponsored-discounts)\n\n**2. Оценка привлекательности цен на витрине.**\n\nПривлекательность влияет на вероятность срабатывания скидок за счет Маркета. [Как это устроено](https://yandex.ru/support/marketplace/marketing/smart-pricing.html#validation)\n\nВ запросе можно использовать фильтры.\n\nРезультаты возвращаются постранично.\n\n|**⚙️ Лимит:** 100 запросов в минуту|\n|-|\n
     */
    @isTest
    private static void getOfferRecommendationsTest() {
        HttpResponse res = new HttpResponse();
        res.setStatusCode(200);
        res.setStatus('OK');
        Test.setMock(HttpCalloutMock.class, new OASResponseMock(res));

        Map<String, Object> params = new Map<String, Object>{
            'businessId' => 2147483648L,
            'oaSGetOfferRecommendationsRequest' => '',
            'pageToken' => eyBuZXh0SWQ6IDIzNDIgfQ==,
            'r_limit' => 20
        };

        OASClient client;
        OASFbsApi api;
        OASGetOfferRecommendationsResponse response;
        OASGetOfferRecommendationsResponse expectedResponse;
        String js = '';

        client = new OASClient();
        api = new OASFbsApi(client);

        js = JSON.serialize(OASGetOfferRecommendationsResponse.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASGetOfferRecommendationsResponse.getExample();
        response = (OASGetOfferRecommendationsResponse) api.getOfferRecommendations(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASGetOfferRecommendationsResponse.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASGetOfferRecommendationsResponse.getExample();
        response = (OASGetOfferRecommendationsResponse) api.getOfferRecommendations(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASGetOfferRecommendationsResponse.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASGetOfferRecommendationsResponse.getExample();
        response = (OASGetOfferRecommendationsResponse) api.getOfferRecommendations(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASGetOfferRecommendationsResponse.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASGetOfferRecommendationsResponse.getExample();
        response = (OASGetOfferRecommendationsResponse) api.getOfferRecommendations(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASGetOfferRecommendationsResponse.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASGetOfferRecommendationsResponse.getExample();
        response = (OASGetOfferRecommendationsResponse) api.getOfferRecommendations(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASGetOfferRecommendationsResponse.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASGetOfferRecommendationsResponse.getExample();
        response = (OASGetOfferRecommendationsResponse) api.getOfferRecommendations(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASGetOfferRecommendationsResponse.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASGetOfferRecommendationsResponse.getExample();
        response = (OASGetOfferRecommendationsResponse) api.getOfferRecommendations(params);
        System.assertEquals(expectedResponse, response);
    }

    /**
     * Предложения магазина
     *
     * {% note warning &quot;&quot; %}\n\nЭтот метод устарел. Не используйте его.\n\n{% endnote %}\n\nПозволяет фильтровать информацию о предложениях магазина, размещенных на Маркете, и искать предложения по заданному поисковому запросу.\n\nПоиск предложений, размещенных на Маркете, работает по поисковому запросу аналогично поиску Маркета. Результаты возвращаются с использованием пейджера.\n\nВ ответе на запрос для каждого найденного предложения указывается URL и наименование этого предложения, его цена и валюта, в которой она указана, карточка модели Маркета, с которой соотнесено предложение, и аукционные ставки на него.\n\n{% note info %}\n\nИз-за особенностей поиска Маркета иногда на последних страницах пейджера фактическое количество результатов оказывается меньше количества, указанного ранее на предыдущих страницах.\n\nВ связи с этим настоятельно рекомендуется анализировать содержимое параметра pager для каждой полученной страницы.\n\n{% endnote %}\n\n{% note info %}\n\nКоличество предложений считается по данным за последние семь дней (не включая сегодня).\n\nДля новых магазинов, еще не разместивших предложения, ограничение равно 0 и пересчитывается на следующий день после размещения первых предложений.\n\n{% endnote %}\n\n|**⚙️ Лимит:** рассчитывается по [формуле](*rule)|\n|-|\n\n[//]: &lt;&gt; (rule: суточный лисит товаров — среднее количество таваров в каталоге за неделю * 25)\n
     */
    @isTest
    private static void getOffersTest() {
        HttpResponse res = new HttpResponse();
        res.setStatusCode(200);
        res.setStatus('OK');
        Test.setMock(HttpCalloutMock.class, new OASResponseMock(res));

        Map<String, Object> params = new Map<String, Object>{
            'campaignId' => 2147483648L,
            'query' => 'null',
            'feedId' => 2147483648L,
            'shopCategoryId' => 'null',
            'r_currency' => '',
            'matched' => '',
            'page' => '',
            'pageSize' => ''
        };

        OASClient client;
        OASFbsApi api;
        OASGetOffersResponse response;
        OASGetOffersResponse expectedResponse;
        String js = '';

        client = new OASClient();
        api = new OASFbsApi(client);

        js = JSON.serialize(OASGetOffersResponse.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASGetOffersResponse.getExample();
        response = (OASGetOffersResponse) api.getOffers(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASGetOffersResponse.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASGetOffersResponse.getExample();
        response = (OASGetOffersResponse) api.getOffers(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASGetOffersResponse.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASGetOffersResponse.getExample();
        response = (OASGetOffersResponse) api.getOffers(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASGetOffersResponse.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASGetOffersResponse.getExample();
        response = (OASGetOffersResponse) api.getOffers(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASGetOffersResponse.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASGetOffersResponse.getExample();
        response = (OASGetOffersResponse) api.getOffers(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASGetOffersResponse.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASGetOffersResponse.getExample();
        response = (OASGetOffersResponse) api.getOffers(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASGetOffersResponse.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASGetOffersResponse.getExample();
        response = (OASGetOffersResponse) api.getOffers(params);
        System.assertEquals(expectedResponse, response);
    }

    /**
     * Информация об одном заказе
     *
     * Возвращает информацию о заказе.\n\nПолучить более подробную информацию о покупателе и его номере телефона можно с помощью запроса [GET campaigns/{campaignId}/orders/{orderId}/buyer](../../reference/orders/getOrderBuyerInfo.md).\n\n|**⚙️ Лимит:** 1 000 000 запросов в час|\n|-|\n
     */
    @isTest
    private static void getOrderTest() {
        HttpResponse res = new HttpResponse();
        res.setStatusCode(200);
        res.setStatus('OK');
        Test.setMock(HttpCalloutMock.class, new OASResponseMock(res));

        Map<String, Object> params = new Map<String, Object>{
            'campaignId' => 2147483648L,
            'orderId' => 2147483648L
        };

        OASClient client;
        OASFbsApi api;
        OASGetOrderResponse response;
        OASGetOrderResponse expectedResponse;
        String js = '';

        client = new OASClient();
        api = new OASFbsApi(client);

        js = JSON.serialize(OASGetOrderResponse.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASGetOrderResponse.getExample();
        response = (OASGetOrderResponse) api.getOrder(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASGetOrderResponse.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASGetOrderResponse.getExample();
        response = (OASGetOrderResponse) api.getOrder(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASGetOrderResponse.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASGetOrderResponse.getExample();
        response = (OASGetOrderResponse) api.getOrder(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASGetOrderResponse.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASGetOrderResponse.getExample();
        response = (OASGetOrderResponse) api.getOrder(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASGetOrderResponse.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASGetOrderResponse.getExample();
        response = (OASGetOrderResponse) api.getOrder(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASGetOrderResponse.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASGetOrderResponse.getExample();
        response = (OASGetOrderResponse) api.getOrder(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASGetOrderResponse.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASGetOrderResponse.getExample();
        response = (OASGetOrderResponse) api.getOrder(params);
        System.assertEquals(expectedResponse, response);
    }

    /**
     * Информация о покупателе — юридическом лице
     *
     * Возвращает информацию о покупателе по идентификатору заказа.\n\n{% note info &quot;&quot; %}\n\nЧтобы получить информацию о покупателе, который является физическим лицом, воспользуйтесь запросом [GET campaigns/{campaignId}/orders/{orderId}/buyer](../../reference/orders/getOrderBuyerInfo.md).\n\n{% endnote %}\n\nПолучить данные можно, только если заказ находится в статусе &#x60;PROCESSING&#x60;, &#x60;DELIVERY&#x60;, &#x60;PICKUP&#x60; или &#x60;DELIVERED&#x60;.\n\nЕсли у вас настроена работа с push-компонентом, Маркет отправит уведомление о смене статуса заказа с помощью запроса [POST order/status](../../pushapi/reference/postOrderStatus.md).\n\n|**⚙️ Лимит:** 3 000 запросов в час|\n|-|\n
     */
    @isTest
    private static void getOrderBusinessBuyerInfoTest() {
        HttpResponse res = new HttpResponse();
        res.setStatusCode(200);
        res.setStatus('OK');
        Test.setMock(HttpCalloutMock.class, new OASResponseMock(res));

        Map<String, Object> params = new Map<String, Object>{
            'campaignId' => 2147483648L,
            'orderId' => 2147483648L
        };

        OASClient client;
        OASFbsApi api;
        OASGetBusinessBuyerInfoResponse response;
        OASGetBusinessBuyerInfoResponse expectedResponse;
        String js = '';

        client = new OASClient();
        api = new OASFbsApi(client);

        js = JSON.serialize(OASGetBusinessBuyerInfoResponse.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASGetBusinessBuyerInfoResponse.getExample();
        response = (OASGetBusinessBuyerInfoResponse) api.getOrderBusinessBuyerInfo(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASGetBusinessBuyerInfoResponse.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASGetBusinessBuyerInfoResponse.getExample();
        response = (OASGetBusinessBuyerInfoResponse) api.getOrderBusinessBuyerInfo(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASGetBusinessBuyerInfoResponse.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASGetBusinessBuyerInfoResponse.getExample();
        response = (OASGetBusinessBuyerInfoResponse) api.getOrderBusinessBuyerInfo(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASGetBusinessBuyerInfoResponse.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASGetBusinessBuyerInfoResponse.getExample();
        response = (OASGetBusinessBuyerInfoResponse) api.getOrderBusinessBuyerInfo(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASGetBusinessBuyerInfoResponse.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASGetBusinessBuyerInfoResponse.getExample();
        response = (OASGetBusinessBuyerInfoResponse) api.getOrderBusinessBuyerInfo(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASGetBusinessBuyerInfoResponse.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASGetBusinessBuyerInfoResponse.getExample();
        response = (OASGetBusinessBuyerInfoResponse) api.getOrderBusinessBuyerInfo(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASGetBusinessBuyerInfoResponse.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASGetBusinessBuyerInfoResponse.getExample();
        response = (OASGetBusinessBuyerInfoResponse) api.getOrderBusinessBuyerInfo(params);
        System.assertEquals(expectedResponse, response);
    }

    /**
     * Информация о документах
     *
     * Возвращает информацию о документах по идентификатору заказа.\n\nПолучить данные можно после того, как заказ перейдет в статус &#x60;DELIVERED&#x60;.\n\nЕсли у вас настроена работа с push-компонентом, Маркет отправит уведомление о смене статуса заказа с помощью запроса [POST order/status](../../pushapi/reference/postOrderStatus.md).\n\n|**⚙️ Лимит:** 3 000 запросов в час|\n|-|\n
     */
    @isTest
    private static void getOrderBusinessDocumentsInfoTest() {
        HttpResponse res = new HttpResponse();
        res.setStatusCode(200);
        res.setStatus('OK');
        Test.setMock(HttpCalloutMock.class, new OASResponseMock(res));

        Map<String, Object> params = new Map<String, Object>{
            'campaignId' => 2147483648L,
            'orderId' => 2147483648L
        };

        OASClient client;
        OASFbsApi api;
        OASGetBusinessDocumentsInfoResponse response;
        OASGetBusinessDocumentsInfoResponse expectedResponse;
        String js = '';

        client = new OASClient();
        api = new OASFbsApi(client);

        js = JSON.serialize(OASGetBusinessDocumentsInfoResponse.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASGetBusinessDocumentsInfoResponse.getExample();
        response = (OASGetBusinessDocumentsInfoResponse) api.getOrderBusinessDocumentsInfo(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASGetBusinessDocumentsInfoResponse.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASGetBusinessDocumentsInfoResponse.getExample();
        response = (OASGetBusinessDocumentsInfoResponse) api.getOrderBusinessDocumentsInfo(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASGetBusinessDocumentsInfoResponse.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASGetBusinessDocumentsInfoResponse.getExample();
        response = (OASGetBusinessDocumentsInfoResponse) api.getOrderBusinessDocumentsInfo(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASGetBusinessDocumentsInfoResponse.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASGetBusinessDocumentsInfoResponse.getExample();
        response = (OASGetBusinessDocumentsInfoResponse) api.getOrderBusinessDocumentsInfo(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASGetBusinessDocumentsInfoResponse.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASGetBusinessDocumentsInfoResponse.getExample();
        response = (OASGetBusinessDocumentsInfoResponse) api.getOrderBusinessDocumentsInfo(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASGetBusinessDocumentsInfoResponse.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASGetBusinessDocumentsInfoResponse.getExample();
        response = (OASGetBusinessDocumentsInfoResponse) api.getOrderBusinessDocumentsInfo(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASGetBusinessDocumentsInfoResponse.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASGetBusinessDocumentsInfoResponse.getExample();
        response = (OASGetBusinessDocumentsInfoResponse) api.getOrderBusinessDocumentsInfo(params);
        System.assertEquals(expectedResponse, response);
    }

    /**
     * Данные для самостоятельного изготовления ярлыков
     *
     * Возвращает информацию на ярлыках, которые клеятся на коробки в заказе.\n\n|**⚙️ Лимит:** 1 000 000 запросов в час|\n|-|\n
     */
    @isTest
    private static void getOrderLabelsDataTest() {
        HttpResponse res = new HttpResponse();
        res.setStatusCode(200);
        res.setStatus('OK');
        Test.setMock(HttpCalloutMock.class, new OASResponseMock(res));

        Map<String, Object> params = new Map<String, Object>{
            'campaignId' => 2147483648L,
            'orderId' => 2147483648L
        };

        OASClient client;
        OASFbsApi api;
        OASGetOrderLabelsDataResponse response;
        OASGetOrderLabelsDataResponse expectedResponse;
        String js = '';

        client = new OASClient();
        api = new OASFbsApi(client);

        js = JSON.serialize(OASGetOrderLabelsDataResponse.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASGetOrderLabelsDataResponse.getExample();
        response = (OASGetOrderLabelsDataResponse) api.getOrderLabelsData(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASGetOrderLabelsDataResponse.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASGetOrderLabelsDataResponse.getExample();
        response = (OASGetOrderLabelsDataResponse) api.getOrderLabelsData(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASGetOrderLabelsDataResponse.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASGetOrderLabelsDataResponse.getExample();
        response = (OASGetOrderLabelsDataResponse) api.getOrderLabelsData(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASGetOrderLabelsDataResponse.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASGetOrderLabelsDataResponse.getExample();
        response = (OASGetOrderLabelsDataResponse) api.getOrderLabelsData(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASGetOrderLabelsDataResponse.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASGetOrderLabelsDataResponse.getExample();
        response = (OASGetOrderLabelsDataResponse) api.getOrderLabelsData(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASGetOrderLabelsDataResponse.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASGetOrderLabelsDataResponse.getExample();
        response = (OASGetOrderLabelsDataResponse) api.getOrderLabelsData(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASGetOrderLabelsDataResponse.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASGetOrderLabelsDataResponse.getExample();
        response = (OASGetOrderLabelsDataResponse) api.getOrderLabelsData(params);
        System.assertEquals(expectedResponse, response);
    }

    /**
     * Информация о нескольких заказах
     *
     * Возвращает информацию о заказах. Запрос можно использовать, чтобы узнать, нет ли новых заказов.\n\nДоступна фильтрация по нескольким характеристикам заказов:\n\n* дате оформления;\n\n* статусу;\n\n* идентификаторам заказов;\n\n* этапу обработки или причине отмены;\n\n* типу (настоящий или тестовый);\n\n* дате отгрузки в службу доставки;\n\n* дате и времени обновления заказа.\n\nИнформация о заказах, доставленных или отмененных больше 30 дней назад, не возвращается. Ее можно получить с помощью запроса информации об отдельном заказе [GET campaigns/{campaignId}/orders/{orderId}](../../reference/orders/getOrder.md) (если у вас есть идентификатор заказа) или запроса отчета по заказам [POST campaigns/{campaignId}/stats/orders](../../reference/stats/getOrdersStats.md).\n\nМаксимальный диапазон дат за один запрос к ресурсу — 30 дней. Максимальное количество заказов в выходных данных запроса — 50.\n\nРезультаты возвращаются постранично. Для навигации по страницам используйте параметры &#x60;page_token&#x60; и &#x60;limit&#x60;.\n\nПолучить более подробную информацию о покупателе и его номере телефона можно с помощью запроса [GET campaigns/{campaignId}/orders/{orderId}/buyer](../../reference/orders/getOrderBuyerInfo.md).\n\n|**⚙️ Лимит:** 1 000 000 запросов в час|\n|-|\n
     */
    @isTest
    private static void getOrdersTest() {
        HttpResponse res = new HttpResponse();
        res.setStatusCode(200);
        res.setStatus('OK');
        Test.setMock(HttpCalloutMock.class, new OASResponseMock(res));

        Map<String, Object> params = new Map<String, Object>{
            'campaignId' => 2147483648L,
            'orderIds' => new List<Long>{123456789L},
            'status' => new Set<OASOrderStatusType>{OASOrderStatusType.getExample()},
            'substatus' => new Set<OASOrderSubstatusType>{OASOrderSubstatusType.getExample()},
            'fromDate' => Date.newInstance(1960, 2, 17),
            'toDate' => Date.newInstance(1960, 2, 17),
            'supplierShipmentDateFrom' => Date.newInstance(1960, 2, 17),
            'supplierShipmentDateTo' => Date.newInstance(1960, 2, 17),
            'updatedAtFrom' => Datetime.newInstanceGmt(2013, 11, 12, 3, 3, 3),
            'updatedAtTo' => Datetime.newInstanceGmt(2013, 11, 12, 3, 3, 3),
            'dispatchType' => '',
            'fake' => '',
            'hasCis' => '',
            'onlyWaitingForCancellationApprove' => '',
            'onlyEstimatedDelivery' => '',
            'buyerType' => '',
            'page' => '',
            'pageSize' => '',
            'pageToken' => eyBuZXh0SWQ6IDIzNDIgfQ==,
            'r_limit' => 20
        };

        OASClient client;
        OASFbsApi api;
        OASGetOrdersResponse response;
        OASGetOrdersResponse expectedResponse;
        String js = '';

        client = new OASClient();
        api = new OASFbsApi(client);

        js = JSON.serialize(OASGetOrdersResponse.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASGetOrdersResponse.getExample();
        response = (OASGetOrdersResponse) api.getOrders(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASGetOrdersResponse.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASGetOrdersResponse.getExample();
        response = (OASGetOrdersResponse) api.getOrders(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASGetOrdersResponse.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASGetOrdersResponse.getExample();
        response = (OASGetOrdersResponse) api.getOrders(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASGetOrdersResponse.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASGetOrdersResponse.getExample();
        response = (OASGetOrdersResponse) api.getOrders(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASGetOrdersResponse.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASGetOrdersResponse.getExample();
        response = (OASGetOrdersResponse) api.getOrders(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASGetOrdersResponse.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASGetOrdersResponse.getExample();
        response = (OASGetOrdersResponse) api.getOrders(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASGetOrdersResponse.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASGetOrdersResponse.getExample();
        response = (OASGetOrdersResponse) api.getOrders(params);
        System.assertEquals(expectedResponse, response);
    }

    /**
     * Детальная информация по заказам
     *
     * Возвращает информацию по заказам на Маркете, в которых есть ваши товары. С помощью нее вы можете собрать статистику по вашим заказам и узнать, например, какие из товаров чаще всего возвращаются покупателями, какие, наоборот, пользуются большим спросом, какая комиссия начисляется за заказы и т. п.\n\n{% note info &quot;&quot; %}\n\nРаньше генерация детальной информации по заказам называлась **Отчет по заказам**. Сейчас это новый отчет. [Подробнее об отчете](../../reference/reports/generateUnitedOrdersReport.md)\n\n{% endnote %}\n\nВ одном запросе можно получить информацию не более чем по 200 заказам.\n\n|**⚙️ Лимит:** 1 000 000 запросов в час|\n|-|\n
     */
    @isTest
    private static void getOrdersStatsTest() {
        HttpResponse res = new HttpResponse();
        res.setStatusCode(200);
        res.setStatus('OK');
        Test.setMock(HttpCalloutMock.class, new OASResponseMock(res));

        Map<String, Object> params = new Map<String, Object>{
            'campaignId' => 2147483648L,
            'pageToken' => eyBuZXh0SWQ6IDIzNDIgfQ==,
            'r_limit' => 20,
            'oaSGetOrdersStatsRequest' => ''
        };

        OASClient client;
        OASFbsApi api;
        OASGetOrdersStatsResponse response;
        OASGetOrdersStatsResponse expectedResponse;
        String js = '';

        client = new OASClient();
        api = new OASFbsApi(client);

        js = JSON.serialize(OASGetOrdersStatsResponse.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASGetOrdersStatsResponse.getExample();
        response = (OASGetOrdersStatsResponse) api.getOrdersStats(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASGetOrdersStatsResponse.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASGetOrdersStatsResponse.getExample();
        response = (OASGetOrdersStatsResponse) api.getOrdersStats(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASGetOrdersStatsResponse.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASGetOrdersStatsResponse.getExample();
        response = (OASGetOrdersStatsResponse) api.getOrdersStats(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASGetOrdersStatsResponse.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASGetOrdersStatsResponse.getExample();
        response = (OASGetOrdersStatsResponse) api.getOrdersStats(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASGetOrdersStatsResponse.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASGetOrdersStatsResponse.getExample();
        response = (OASGetOrdersStatsResponse) api.getOrdersStats(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASGetOrdersStatsResponse.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASGetOrdersStatsResponse.getExample();
        response = (OASGetOrdersStatsResponse) api.getOrdersStats(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASGetOrdersStatsResponse.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASGetOrdersStatsResponse.getExample();
        response = (OASGetOrdersStatsResponse) api.getOrdersStats(params);
        System.assertEquals(expectedResponse, response);
    }

    /**
     * Список цен
     *
     * {% note warning &quot;&quot; %}\n\nЭтот метод устарел. Вместо него используйте [POST campaigns/{campaignId}/offer-prices](../../reference/assortment/getPricesByOfferIds.md).\n\n{% endnote %}\n\nВозвращает список цен, установленных вами на товары любым способом: например, через партнерский API или в файле с каталогом.\n\n{% note info %}\n\nОбщее количество товаров считается по данным за последние семь дней (не включая сегодня) и не может быть выше 2 миллионов.\n\n{% endnote %}\n\nСпособы установки цен описаны [в Справке Маркета для продавцов](https://yandex.ru/support/marketplace/assortment/operations/prices.html).\n\n|**⚙️ Лимит:** &#x60;&#x60;&#x60;(количество товаров партнера на витрине) * 25&#x60;&#x60;&#x60; товаров в сутки|\n|-|\n
     */
    @isTest
    private static void getPricesTest() {
        HttpResponse res = new HttpResponse();
        res.setStatusCode(200);
        res.setStatus('OK');
        Test.setMock(HttpCalloutMock.class, new OASResponseMock(res));

        Map<String, Object> params = new Map<String, Object>{
            'campaignId' => 2147483648L,
            'pageToken' => eyBuZXh0SWQ6IDIzNDIgfQ==,
            'r_limit' => 20,
            'archived' => ''
        };

        OASClient client;
        OASFbsApi api;
        OASGetPricesResponse response;
        OASGetPricesResponse expectedResponse;
        String js = '';

        client = new OASClient();
        api = new OASFbsApi(client);

        js = JSON.serialize(OASGetPricesResponse.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASGetPricesResponse.getExample();
        response = (OASGetPricesResponse) api.getPrices(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASGetPricesResponse.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASGetPricesResponse.getExample();
        response = (OASGetPricesResponse) api.getPrices(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASGetPricesResponse.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASGetPricesResponse.getExample();
        response = (OASGetPricesResponse) api.getPrices(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASGetPricesResponse.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASGetPricesResponse.getExample();
        response = (OASGetPricesResponse) api.getPrices(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASGetPricesResponse.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASGetPricesResponse.getExample();
        response = (OASGetPricesResponse) api.getPrices(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASGetPricesResponse.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASGetPricesResponse.getExample();
        response = (OASGetPricesResponse) api.getPrices(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASGetPricesResponse.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASGetPricesResponse.getExample();
        response = (OASGetPricesResponse) api.getPrices(params);
        System.assertEquals(expectedResponse, response);
    }

    /**
     * Просмотр цен на указанные товары в магазине
     *
     * Возвращает список цен на указанные товары в магазине.\n\n{% note warning &quot;Метод только для отдельных магазинов&quot; %}\n\nИспользуйте этот метод, только если в кабинете установлены уникальные цены в отдельных магазинах.\n\nДля просмотра базовых цен используйте [POST businesses/{businessId}/offer-mappings](../../reference/business-assortment/getOfferMappings.md).\n\n{% endnote %}\n\n|**⚙️ Лимит:** рассчитывается по [формуле](*rule)|\n|-|\n\n[//]: &lt;&gt; (rule: суточный лимит товаров — количество товаров на витрине * 25)\n
     */
    @isTest
    private static void getPricesByOfferIdsTest() {
        HttpResponse res = new HttpResponse();
        res.setStatusCode(200);
        res.setStatus('OK');
        Test.setMock(HttpCalloutMock.class, new OASResponseMock(res));

        Map<String, Object> params = new Map<String, Object>{
            'campaignId' => 2147483648L,
            'pageToken' => eyBuZXh0SWQ6IDIzNDIgfQ==,
            'r_limit' => 20,
            'oaSGetPricesByOfferIdsRequest' => ''
        };

        OASClient client;
        OASFbsApi api;
        OASGetPricesByOfferIdsResponse response;
        OASGetPricesByOfferIdsResponse expectedResponse;
        String js = '';

        client = new OASClient();
        api = new OASFbsApi(client);

        js = JSON.serialize(OASGetPricesByOfferIdsResponse.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASGetPricesByOfferIdsResponse.getExample();
        response = (OASGetPricesByOfferIdsResponse) api.getPricesByOfferIds(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASGetPricesByOfferIdsResponse.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASGetPricesByOfferIdsResponse.getExample();
        response = (OASGetPricesByOfferIdsResponse) api.getPricesByOfferIds(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASGetPricesByOfferIdsResponse.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASGetPricesByOfferIdsResponse.getExample();
        response = (OASGetPricesByOfferIdsResponse) api.getPricesByOfferIds(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASGetPricesByOfferIdsResponse.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASGetPricesByOfferIdsResponse.getExample();
        response = (OASGetPricesByOfferIdsResponse) api.getPricesByOfferIds(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASGetPricesByOfferIdsResponse.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASGetPricesByOfferIdsResponse.getExample();
        response = (OASGetPricesByOfferIdsResponse) api.getPricesByOfferIds(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASGetPricesByOfferIdsResponse.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASGetPricesByOfferIdsResponse.getExample();
        response = (OASGetPricesByOfferIdsResponse) api.getPricesByOfferIds(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASGetPricesByOfferIdsResponse.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASGetPricesByOfferIdsResponse.getExample();
        response = (OASGetPricesByOfferIdsResponse) api.getPricesByOfferIds(params);
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
        OASFbsApi api;
        OASGetPromoOffersResponse response;
        OASGetPromoOffersResponse expectedResponse;
        String js = '';

        client = new OASClient();
        api = new OASFbsApi(client);

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
        OASFbsApi api;
        OASGetPromosResponse response;
        OASGetPromosResponse expectedResponse;
        String js = '';

        client = new OASClient();
        api = new OASFbsApi(client);

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
     * Заказы, которые повлияли на индекс качества
     *
     * Возвращает список заказов, которые повлияли на индекс качества магазина. Чтобы узнать значение индекса качества, выполните запрос [POST businesses/{businessId}/ratings/quality](../../reference/ratings/getQualityRatings.md).\n\n|**⚙️ Лимит:** 100000 запросов в час|\n|-|\n
     */
    @isTest
    private static void getQualityRatingDetailsTest() {
        HttpResponse res = new HttpResponse();
        res.setStatusCode(200);
        res.setStatus('OK');
        Test.setMock(HttpCalloutMock.class, new OASResponseMock(res));

        Map<String, Object> params = new Map<String, Object>{
            'campaignId' => 2147483648L
        };

        OASClient client;
        OASFbsApi api;
        OASGetQualityRatingDetailsResponse response;
        OASGetQualityRatingDetailsResponse expectedResponse;
        String js = '';

        client = new OASClient();
        api = new OASFbsApi(client);

        js = JSON.serialize(OASGetQualityRatingDetailsResponse.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASGetQualityRatingDetailsResponse.getExample();
        response = (OASGetQualityRatingDetailsResponse) api.getQualityRatingDetails(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASGetQualityRatingDetailsResponse.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASGetQualityRatingDetailsResponse.getExample();
        response = (OASGetQualityRatingDetailsResponse) api.getQualityRatingDetails(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASGetQualityRatingDetailsResponse.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASGetQualityRatingDetailsResponse.getExample();
        response = (OASGetQualityRatingDetailsResponse) api.getQualityRatingDetails(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASGetQualityRatingDetailsResponse.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASGetQualityRatingDetailsResponse.getExample();
        response = (OASGetQualityRatingDetailsResponse) api.getQualityRatingDetails(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASGetQualityRatingDetailsResponse.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASGetQualityRatingDetailsResponse.getExample();
        response = (OASGetQualityRatingDetailsResponse) api.getQualityRatingDetails(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASGetQualityRatingDetailsResponse.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASGetQualityRatingDetailsResponse.getExample();
        response = (OASGetQualityRatingDetailsResponse) api.getQualityRatingDetails(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASGetQualityRatingDetailsResponse.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASGetQualityRatingDetailsResponse.getExample();
        response = (OASGetQualityRatingDetailsResponse) api.getQualityRatingDetails(params);
        System.assertEquals(expectedResponse, response);
    }

    /**
     * Индекс качества магазинов
     *
     * Возвращает значение индекса качества магазинов и его составляющие.\n\nПодробнее об индексе качества читайте [в Справке Маркета для продавцов](https://yandex.ru/support2/marketplace/ru/quality/score/).\n\n|**⚙️ Лимит:** 10000 запросов в час|\n|-|\n
     */
    @isTest
    private static void getQualityRatingsTest() {
        HttpResponse res = new HttpResponse();
        res.setStatusCode(200);
        res.setStatus('OK');
        Test.setMock(HttpCalloutMock.class, new OASResponseMock(res));

        Map<String, Object> params = new Map<String, Object>{
            'businessId' => 2147483648L,
            'oaSGetQualityRatingRequest' => ''
        };

        OASClient client;
        OASFbsApi api;
        OASGetQualityRatingResponse response;
        OASGetQualityRatingResponse expectedResponse;
        String js = '';

        client = new OASClient();
        api = new OASFbsApi(client);

        js = JSON.serialize(OASGetQualityRatingResponse.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASGetQualityRatingResponse.getExample();
        response = (OASGetQualityRatingResponse) api.getQualityRatings(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASGetQualityRatingResponse.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASGetQualityRatingResponse.getExample();
        response = (OASGetQualityRatingResponse) api.getQualityRatings(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASGetQualityRatingResponse.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASGetQualityRatingResponse.getExample();
        response = (OASGetQualityRatingResponse) api.getQualityRatings(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASGetQualityRatingResponse.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASGetQualityRatingResponse.getExample();
        response = (OASGetQualityRatingResponse) api.getQualityRatings(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASGetQualityRatingResponse.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASGetQualityRatingResponse.getExample();
        response = (OASGetQualityRatingResponse) api.getQualityRatings(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASGetQualityRatingResponse.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASGetQualityRatingResponse.getExample();
        response = (OASGetQualityRatingResponse) api.getQualityRatings(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASGetQualityRatingResponse.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASGetQualityRatingResponse.getExample();
        response = (OASGetQualityRatingResponse) api.getQualityRatings(params);
        System.assertEquals(expectedResponse, response);
    }

    /**
     * Получение заданного отчета
     *
     * Возвращает статус генерации заданного отчета и, если отчет готов, ссылку для скачивания.\n\nЧтобы воспользоваться этим запросом, вначале нужно запустить генерацию отчета. [Инструкция](../../step-by-step/reports.md)\n\n|**⚙️ Лимит:** 100 запросов в минуту|\n|-|\n
     */
    @isTest
    private static void getReportInfoTest() {
        HttpResponse res = new HttpResponse();
        res.setStatusCode(200);
        res.setStatus('OK');
        Test.setMock(HttpCalloutMock.class, new OASResponseMock(res));

        Map<String, Object> params = new Map<String, Object>{
            'reportId' => 'null'
        };

        OASClient client;
        OASFbsApi api;
        OASGetReportInfoResponse response;
        OASGetReportInfoResponse expectedResponse;
        String js = '';

        client = new OASClient();
        api = new OASFbsApi(client);

        js = JSON.serialize(OASGetReportInfoResponse.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASGetReportInfoResponse.getExample();
        response = (OASGetReportInfoResponse) api.getReportInfo(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASGetReportInfoResponse.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASGetReportInfoResponse.getExample();
        response = (OASGetReportInfoResponse) api.getReportInfo(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASGetReportInfoResponse.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASGetReportInfoResponse.getExample();
        response = (OASGetReportInfoResponse) api.getReportInfo(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASGetReportInfoResponse.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASGetReportInfoResponse.getExample();
        response = (OASGetReportInfoResponse) api.getReportInfo(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASGetReportInfoResponse.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASGetReportInfoResponse.getExample();
        response = (OASGetReportInfoResponse) api.getReportInfo(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASGetReportInfoResponse.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASGetReportInfoResponse.getExample();
        response = (OASGetReportInfoResponse) api.getReportInfo(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASGetReportInfoResponse.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASGetReportInfoResponse.getExample();
        response = (OASGetReportInfoResponse) api.getReportInfo(params);
        System.assertEquals(expectedResponse, response);
    }

    /**
     * Информация о невыкупе или возврате
     *
     * Получает информацию по одному невыкупу или возврату.\n\n|**⚙️ Лимит:** 10 000 запросов в час|\n|-|\n
     */
    @isTest
    private static void getReturnTest() {
        HttpResponse res = new HttpResponse();
        res.setStatusCode(200);
        res.setStatus('OK');
        Test.setMock(HttpCalloutMock.class, new OASResponseMock(res));

        Map<String, Object> params = new Map<String, Object>{
            'campaignId' => 2147483648L,
            'orderId' => 2147483648L,
            'returnId' => 2147483648L
        };

        OASClient client;
        OASFbsApi api;
        OASGetReturnResponse response;
        OASGetReturnResponse expectedResponse;
        String js = '';

        client = new OASClient();
        api = new OASFbsApi(client);

        js = JSON.serialize(OASGetReturnResponse.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASGetReturnResponse.getExample();
        response = (OASGetReturnResponse) api.getReturn(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASGetReturnResponse.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASGetReturnResponse.getExample();
        response = (OASGetReturnResponse) api.getReturn(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASGetReturnResponse.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASGetReturnResponse.getExample();
        response = (OASGetReturnResponse) api.getReturn(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASGetReturnResponse.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASGetReturnResponse.getExample();
        response = (OASGetReturnResponse) api.getReturn(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASGetReturnResponse.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASGetReturnResponse.getExample();
        response = (OASGetReturnResponse) api.getReturn(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASGetReturnResponse.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASGetReturnResponse.getExample();
        response = (OASGetReturnResponse) api.getReturn(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASGetReturnResponse.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASGetReturnResponse.getExample();
        response = (OASGetReturnResponse) api.getReturn(params);
        System.assertEquals(expectedResponse, response);
    }

    /**
     * Получение заявления на возврат
     *
     * Загружает заявление покупателя на возврат товара.\n\n|**⚙️ Лимит:** 10 000 запросов в час|\n|-|\n
     */
    @isTest
    private static void getReturnApplicationTest() {
        HttpResponse res = new HttpResponse();
        res.setStatusCode(200);
        res.setStatus('OK');
        Test.setMock(HttpCalloutMock.class, new OASResponseMock(res));

        Map<String, Object> params = new Map<String, Object>{
            'campaignId' => 2147483648L,
            'orderId' => 2147483648L,
            'returnId' => 2147483648L
        };

        OASClient client;
        OASFbsApi api;
        Blob response;
        Blob expectedResponse;
        String js = '';

        client = new OASClient();
        api = new OASFbsApi(client);

        js = JSON.serialize(EncodingUtil.base64Decode(VGhlIHF1aWNrIGJyb3duIGZveCBqdW1wZWQgb3ZlciB0aGUgbGF6eSBkb2cu));
        res.setHeader('Content-Type', '');
        res.setBody(js);
        expectedResponse = EncodingUtil.base64Decode(VGhlIHF1aWNrIGJyb3duIGZveCBqdW1wZWQgb3ZlciB0aGUgbGF6eSBkb2cu);
        response = (Blob) api.getReturnApplication(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(EncodingUtil.base64Decode(VGhlIHF1aWNrIGJyb3duIGZveCBqdW1wZWQgb3ZlciB0aGUgbGF6eSBkb2cu));
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = EncodingUtil.base64Decode(VGhlIHF1aWNrIGJyb3duIGZveCBqdW1wZWQgb3ZlciB0aGUgbGF6eSBkb2cu);
        response = (Blob) api.getReturnApplication(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(EncodingUtil.base64Decode(VGhlIHF1aWNrIGJyb3duIGZveCBqdW1wZWQgb3ZlciB0aGUgbGF6eSBkb2cu));
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = EncodingUtil.base64Decode(VGhlIHF1aWNrIGJyb3duIGZveCBqdW1wZWQgb3ZlciB0aGUgbGF6eSBkb2cu);
        response = (Blob) api.getReturnApplication(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(EncodingUtil.base64Decode(VGhlIHF1aWNrIGJyb3duIGZveCBqdW1wZWQgb3ZlciB0aGUgbGF6eSBkb2cu));
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = EncodingUtil.base64Decode(VGhlIHF1aWNrIGJyb3duIGZveCBqdW1wZWQgb3ZlciB0aGUgbGF6eSBkb2cu);
        response = (Blob) api.getReturnApplication(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(EncodingUtil.base64Decode(VGhlIHF1aWNrIGJyb3duIGZveCBqdW1wZWQgb3ZlciB0aGUgbGF6eSBkb2cu));
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = EncodingUtil.base64Decode(VGhlIHF1aWNrIGJyb3duIGZveCBqdW1wZWQgb3ZlciB0aGUgbGF6eSBkb2cu);
        response = (Blob) api.getReturnApplication(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(EncodingUtil.base64Decode(VGhlIHF1aWNrIGJyb3duIGZveCBqdW1wZWQgb3ZlciB0aGUgbGF6eSBkb2cu));
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = EncodingUtil.base64Decode(VGhlIHF1aWNrIGJyb3duIGZveCBqdW1wZWQgb3ZlciB0aGUgbGF6eSBkb2cu);
        response = (Blob) api.getReturnApplication(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(EncodingUtil.base64Decode(VGhlIHF1aWNrIGJyb3duIGZveCBqdW1wZWQgb3ZlciB0aGUgbGF6eSBkb2cu));
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = EncodingUtil.base64Decode(VGhlIHF1aWNrIGJyb3duIGZveCBqdW1wZWQgb3ZlciB0aGUgbGF6eSBkb2cu);
        response = (Blob) api.getReturnApplication(params);
        System.assertEquals(expectedResponse, response);
    }

    /**
     * Получение фотографии возврата
     *
     * Получает фотографии, которые покупатель приложил к заявлению на возврат товара.\n\n|**⚙️ Лимит:** 10 000 запросов в час|\n|-|\n
     */
    @isTest
    private static void getReturnPhotoTest() {
        HttpResponse res = new HttpResponse();
        res.setStatusCode(200);
        res.setStatus('OK');
        Test.setMock(HttpCalloutMock.class, new OASResponseMock(res));

        Map<String, Object> params = new Map<String, Object>{
            'campaignId' => 2147483648L,
            'orderId' => 2147483648L,
            'returnId' => 2147483648L,
            'itemId' => 2147483648L,
            'imageHash' => 'null'
        };

        OASClient client;
        OASFbsApi api;
        Blob response;
        Blob expectedResponse;
        String js = '';

        client = new OASClient();
        api = new OASFbsApi(client);

        js = JSON.serialize(EncodingUtil.base64Decode(VGhlIHF1aWNrIGJyb3duIGZveCBqdW1wZWQgb3ZlciB0aGUgbGF6eSBkb2cu));
        res.setHeader('Content-Type', '');
        res.setBody(js);
        expectedResponse = EncodingUtil.base64Decode(VGhlIHF1aWNrIGJyb3duIGZveCBqdW1wZWQgb3ZlciB0aGUgbGF6eSBkb2cu);
        response = (Blob) api.getReturnPhoto(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(EncodingUtil.base64Decode(VGhlIHF1aWNrIGJyb3duIGZveCBqdW1wZWQgb3ZlciB0aGUgbGF6eSBkb2cu));
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = EncodingUtil.base64Decode(VGhlIHF1aWNrIGJyb3duIGZveCBqdW1wZWQgb3ZlciB0aGUgbGF6eSBkb2cu);
        response = (Blob) api.getReturnPhoto(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(EncodingUtil.base64Decode(VGhlIHF1aWNrIGJyb3duIGZveCBqdW1wZWQgb3ZlciB0aGUgbGF6eSBkb2cu));
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = EncodingUtil.base64Decode(VGhlIHF1aWNrIGJyb3duIGZveCBqdW1wZWQgb3ZlciB0aGUgbGF6eSBkb2cu);
        response = (Blob) api.getReturnPhoto(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(EncodingUtil.base64Decode(VGhlIHF1aWNrIGJyb3duIGZveCBqdW1wZWQgb3ZlciB0aGUgbGF6eSBkb2cu));
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = EncodingUtil.base64Decode(VGhlIHF1aWNrIGJyb3duIGZveCBqdW1wZWQgb3ZlciB0aGUgbGF6eSBkb2cu);
        response = (Blob) api.getReturnPhoto(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(EncodingUtil.base64Decode(VGhlIHF1aWNrIGJyb3duIGZveCBqdW1wZWQgb3ZlciB0aGUgbGF6eSBkb2cu));
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = EncodingUtil.base64Decode(VGhlIHF1aWNrIGJyb3duIGZveCBqdW1wZWQgb3ZlciB0aGUgbGF6eSBkb2cu);
        response = (Blob) api.getReturnPhoto(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(EncodingUtil.base64Decode(VGhlIHF1aWNrIGJyb3duIGZveCBqdW1wZWQgb3ZlciB0aGUgbGF6eSBkb2cu));
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = EncodingUtil.base64Decode(VGhlIHF1aWNrIGJyb3duIGZveCBqdW1wZWQgb3ZlciB0aGUgbGF6eSBkb2cu);
        response = (Blob) api.getReturnPhoto(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(EncodingUtil.base64Decode(VGhlIHF1aWNrIGJyb3duIGZveCBqdW1wZWQgb3ZlciB0aGUgbGF6eSBkb2cu));
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = EncodingUtil.base64Decode(VGhlIHF1aWNrIGJyb3duIGZveCBqdW1wZWQgb3ZlciB0aGUgbGF6eSBkb2cu);
        response = (Blob) api.getReturnPhoto(params);
        System.assertEquals(expectedResponse, response);
    }

    /**
     * Список невыкупов и возвратов
     *
     * Получает список невыкупов и возвратов.\n\nЧтобы получить информацию по одному возврату или невыкупу, выполните запрос [GET campaigns/{campaignId}/orders/{orderId}/returns/{returnId}](../../reference/orders/getReturn.md).\n\n|**⚙️ Лимит:** 10 000 запросов в час|\n|-|\n
     */
    @isTest
    private static void getReturnsTest() {
        HttpResponse res = new HttpResponse();
        res.setStatusCode(200);
        res.setStatus('OK');
        Test.setMock(HttpCalloutMock.class, new OASResponseMock(res));

        Map<String, Object> params = new Map<String, Object>{
            'campaignId' => 2147483648L,
            'pageToken' => eyBuZXh0SWQ6IDIzNDIgfQ==,
            'r_limit' => 20,
            'orderIds' => new List<Long>{123543L},
            'statuses' => STARTED_BY_USER,WAITING_FOR_DECISION,
            'type' => '',
            'fromDate' => 2022-10-31,
            'toDate' => 2022-11-30,
            'fromDate2' => 2022-10-31,
            'toDate2' => 2022-11-30
        };

        OASClient client;
        OASFbsApi api;
        OASGetReturnsResponse response;
        OASGetReturnsResponse expectedResponse;
        String js = '';

        client = new OASClient();
        api = new OASFbsApi(client);

        js = JSON.serialize(OASGetReturnsResponse.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASGetReturnsResponse.getExample();
        response = (OASGetReturnsResponse) api.getReturns(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASGetReturnsResponse.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASGetReturnsResponse.getExample();
        response = (OASGetReturnsResponse) api.getReturns(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASGetReturnsResponse.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASGetReturnsResponse.getExample();
        response = (OASGetReturnsResponse) api.getReturns(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASGetReturnsResponse.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASGetReturnsResponse.getExample();
        response = (OASGetReturnsResponse) api.getReturns(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASGetReturnsResponse.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASGetReturnsResponse.getExample();
        response = (OASGetReturnsResponse) api.getReturns(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASGetReturnsResponse.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASGetReturnsResponse.getExample();
        response = (OASGetReturnsResponse) api.getReturns(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASGetReturnsResponse.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASGetReturnsResponse.getExample();
        response = (OASGetReturnsResponse) api.getReturns(params);
        System.assertEquals(expectedResponse, response);
    }

    /**
     * Получение информации об одной отгрузке
     *
     * Возвращает информацию об отгрузке по ее идентификатору.\n|**⚙️ Лимит:** 100 запросов в час|\n|-|\n
     */
    @isTest
    private static void getShipmentTest() {
        HttpResponse res = new HttpResponse();
        res.setStatusCode(200);
        res.setStatus('OK');
        Test.setMock(HttpCalloutMock.class, new OASResponseMock(res));

        Map<String, Object> params = new Map<String, Object>{
            'campaignId' => 2147483648L,
            'shipmentId' => 2147483648L,
            'cancelledOrders' => ''
        };

        OASClient client;
        OASFbsApi api;
        OASGetShipmentResponse response;
        OASGetShipmentResponse expectedResponse;
        String js = '';

        client = new OASClient();
        api = new OASFbsApi(client);

        js = JSON.serialize(OASGetShipmentResponse.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASGetShipmentResponse.getExample();
        response = (OASGetShipmentResponse) api.getShipment(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASGetShipmentResponse.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASGetShipmentResponse.getExample();
        response = (OASGetShipmentResponse) api.getShipment(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASGetShipmentResponse.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASGetShipmentResponse.getExample();
        response = (OASGetShipmentResponse) api.getShipment(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASGetShipmentResponse.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASGetShipmentResponse.getExample();
        response = (OASGetShipmentResponse) api.getShipment(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASGetShipmentResponse.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASGetShipmentResponse.getExample();
        response = (OASGetShipmentResponse) api.getShipment(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASGetShipmentResponse.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASGetShipmentResponse.getExample();
        response = (OASGetShipmentResponse) api.getShipment(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASGetShipmentResponse.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASGetShipmentResponse.getExample();
        response = (OASGetShipmentResponse) api.getShipment(params);
        System.assertEquals(expectedResponse, response);
    }

    /**
     * Получение информации о возможности печати ярлыков (FBS)
     *
     * Возвращает информацию о возможности печати ярлыков-наклеек для заказов в отгрузке.\n|**⚙️ Лимит:** 100 запросов в час|\n|-|\n
     */
    @isTest
    private static void getShipmentOrdersInfoTest() {
        HttpResponse res = new HttpResponse();
        res.setStatusCode(200);
        res.setStatus('OK');
        Test.setMock(HttpCalloutMock.class, new OASResponseMock(res));

        Map<String, Object> params = new Map<String, Object>{
            'campaignId' => 2147483648L,
            'shipmentId' => 2147483648L
        };

        OASClient client;
        OASFbsApi api;
        OASGetShipmentOrdersInfoResponse response;
        OASGetShipmentOrdersInfoResponse expectedResponse;
        String js = '';

        client = new OASClient();
        api = new OASFbsApi(client);

        js = JSON.serialize(OASGetShipmentOrdersInfoResponse.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASGetShipmentOrdersInfoResponse.getExample();
        response = (OASGetShipmentOrdersInfoResponse) api.getShipmentOrdersInfo(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASGetShipmentOrdersInfoResponse.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASGetShipmentOrdersInfoResponse.getExample();
        response = (OASGetShipmentOrdersInfoResponse) api.getShipmentOrdersInfo(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASGetShipmentOrdersInfoResponse.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASGetShipmentOrdersInfoResponse.getExample();
        response = (OASGetShipmentOrdersInfoResponse) api.getShipmentOrdersInfo(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASGetShipmentOrdersInfoResponse.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASGetShipmentOrdersInfoResponse.getExample();
        response = (OASGetShipmentOrdersInfoResponse) api.getShipmentOrdersInfo(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASGetShipmentOrdersInfoResponse.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASGetShipmentOrdersInfoResponse.getExample();
        response = (OASGetShipmentOrdersInfoResponse) api.getShipmentOrdersInfo(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASGetShipmentOrdersInfoResponse.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASGetShipmentOrdersInfoResponse.getExample();
        response = (OASGetShipmentOrdersInfoResponse) api.getShipmentOrdersInfo(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASGetShipmentOrdersInfoResponse.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASGetShipmentOrdersInfoResponse.getExample();
        response = (OASGetShipmentOrdersInfoResponse) api.getShipmentOrdersInfo(params);
        System.assertEquals(expectedResponse, response);
    }

    /**
     * Информация об остатках и оборачиваемости
     *
     * Возвращает данные об остатках товаров (для всех моделей) и об [оборачиваемости](*turnover) товаров (для модели FBY).\n\n{% note info &quot;По умолчанию данные по оборачивамости не возращаются&quot; %}\n\nЧтобы они были в ответе, передавайте &#x60;true&#x60; в поле &#x60;withTurnover&#x60;.\n\n{% endnote %}\n\n|**⚙️ Лимит:** 100 000 товаров в минуту|\n|-|\n\n[//]: &lt;&gt; (turnover: Среднее количество дней, за которое товар продается. Подробно об оборачиваемости рассказано в Справке Маркета для продавцов https://yandex.ru/support/marketplace/analytics/turnover.html.)\n
     */
    @isTest
    private static void getStocksTest() {
        HttpResponse res = new HttpResponse();
        res.setStatusCode(200);
        res.setStatus('OK');
        Test.setMock(HttpCalloutMock.class, new OASResponseMock(res));

        Map<String, Object> params = new Map<String, Object>{
            'campaignId' => 2147483648L,
            'pageToken' => eyBuZXh0SWQ6IDIzNDIgfQ==,
            'r_limit' => 20,
            'oaSGetWarehouseStocksRequest' => ''
        };

        OASClient client;
        OASFbsApi api;
        OASGetWarehouseStocksResponse response;
        OASGetWarehouseStocksResponse expectedResponse;
        String js = '';

        client = new OASClient();
        api = new OASFbsApi(client);

        js = JSON.serialize(OASGetWarehouseStocksResponse.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASGetWarehouseStocksResponse.getExample();
        response = (OASGetWarehouseStocksResponse) api.getStocks(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASGetWarehouseStocksResponse.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASGetWarehouseStocksResponse.getExample();
        response = (OASGetWarehouseStocksResponse) api.getStocks(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASGetWarehouseStocksResponse.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASGetWarehouseStocksResponse.getExample();
        response = (OASGetWarehouseStocksResponse) api.getStocks(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASGetWarehouseStocksResponse.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASGetWarehouseStocksResponse.getExample();
        response = (OASGetWarehouseStocksResponse) api.getStocks(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASGetWarehouseStocksResponse.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASGetWarehouseStocksResponse.getExample();
        response = (OASGetWarehouseStocksResponse) api.getStocks(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASGetWarehouseStocksResponse.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASGetWarehouseStocksResponse.getExample();
        response = (OASGetWarehouseStocksResponse) api.getStocks(params);
        System.assertEquals(expectedResponse, response);
    }

    /**
     * Рекомендованные карточки для товаров
     *
     * {% note warning &quot;&quot; %}\n\nЭтот метод устарел. Вместо него используйте [POST businesses/{businessId}/offer-mappings/suggestions](../../reference/business-assortment/getSuggestedOfferMappings.md).\n\n{% endnote %}\n\nВозвращает идентификаторы карточек товаров на Маркете, рекомендованных для ваших товаров.\n\nКаждому товару, который вы размещаете, должна соответствовать карточка товара на Маркете со своим идентификатором — SKU на Маркете. Он указывается в URL карточки товара, после «...sku&#x3D;», например:\n\n##https://market.yandex.ru/product--yandex-kniga/484830016?sku&#x3D;484830016…##\n\nЧтобы получить для товаров рекомендованные SKU на Маркете, передайте в теле POST-запроса как можно больше информации о них: названия, производителей, штрихкоды, цены и т. д.\n\nПолученные SKU можно передать вместе с информацией о ваших товарах с помощью запроса [POST campaigns/{campaignId}/offer-mapping-entries/updates](../../reference/offer-mappings/updateOfferMappingEntries.md).\n\nВ одном запросе можно получить не более 500 рекомендаций.\n\n|**⚙️ Лимит:** 100 000 рекомендаций в час|\n|-|\n
     */
    @isTest
    private static void getSuggestedOfferMappingEntriesTest() {
        HttpResponse res = new HttpResponse();
        res.setStatusCode(200);
        res.setStatus('OK');
        Test.setMock(HttpCalloutMock.class, new OASResponseMock(res));

        Map<String, Object> params = new Map<String, Object>{
            'campaignId' => 2147483648L,
            'oaSGetSuggestedOfferMappingEntriesRe' => ''
        };

        OASClient client;
        OASFbsApi api;
        OASGetSuggestedOfferMappingEntriesRe response;
        OASGetSuggestedOfferMappingEntriesRe expectedResponse;
        String js = '';

        client = new OASClient();
        api = new OASFbsApi(client);

        js = JSON.serialize(OASGetSuggestedOfferMappingEntriesRe.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASGetSuggestedOfferMappingEntriesRe.getExample();
        response = (OASGetSuggestedOfferMappingEntriesRe) api.getSuggestedOfferMappingEntries(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASGetSuggestedOfferMappingEntriesRe.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASGetSuggestedOfferMappingEntriesRe.getExample();
        response = (OASGetSuggestedOfferMappingEntriesRe) api.getSuggestedOfferMappingEntries(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASGetSuggestedOfferMappingEntriesRe.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASGetSuggestedOfferMappingEntriesRe.getExample();
        response = (OASGetSuggestedOfferMappingEntriesRe) api.getSuggestedOfferMappingEntries(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASGetSuggestedOfferMappingEntriesRe.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASGetSuggestedOfferMappingEntriesRe.getExample();
        response = (OASGetSuggestedOfferMappingEntriesRe) api.getSuggestedOfferMappingEntries(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASGetSuggestedOfferMappingEntriesRe.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASGetSuggestedOfferMappingEntriesRe.getExample();
        response = (OASGetSuggestedOfferMappingEntriesRe) api.getSuggestedOfferMappingEntries(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASGetSuggestedOfferMappingEntriesRe.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASGetSuggestedOfferMappingEntriesRe.getExample();
        response = (OASGetSuggestedOfferMappingEntriesRe) api.getSuggestedOfferMappingEntries(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASGetSuggestedOfferMappingEntriesRe.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASGetSuggestedOfferMappingEntriesRe.getExample();
        response = (OASGetSuggestedOfferMappingEntriesRe) api.getSuggestedOfferMappingEntries(params);
        System.assertEquals(expectedResponse, response);
    }

    /**
     * Просмотр карточек на Маркете, которые подходят вашим товарам
     *
     * Возвращает идентификаторы карточек на Маркете, которые соответствуют товарам с заданными параметрами.\n\nПользоваться этим запросом необязательно: он просто помогает заранее убедиться, что Маркет верно определяет карточки по предоставленным вами данным.\n\n**Как пользоваться запросом**\n\n1. Передайте Маркету список товаров, которые нужно проверить.\n2. В ответ вы получите список SKU на Маркете с расшифровкой: названием, идентификатором модели, категорией.\n3. Если расшифровки мало, вы можете открыть карточку. Для этого перейдите по ссылке вида &#x60;https://market.yandex.ru/product/&lt;marketModelId&gt;?sku&#x3D;&lt;marketSku&gt;&#x60;.\n4. Если карточка соответствует товару, значит его можно добавлять в каталог с теми данными, что вы указали. Если карточка определилась неправильно — проверьте данные о товаре. Возможно, их нужно уточнить или дополнить. Кроме того, на этапе добавления товара вы можете указать &#x60;marketSKU&#x60;, который ему подходит по вашему мнению.\n\n{% note info &quot;𝓠 Как определить &#x60;marketSku&#x60; товара, найденного на Маркете?&quot; %}\n\n𝓐 Он есть в адресе страницы товара — расположен после &#x60;sku&#x3D;&#x60;.\n\nНапример, &#x60;https://market.yandex.ru/product--yandex-kniga/484830016?sku&#x3D;484830016&#x60;\n\n{% endnote %}\n\n|**⚙️ Лимит:** 100 000 товаров в час|\n|-|\n
     */
    @isTest
    private static void getSuggestedOfferMappingsTest() {
        HttpResponse res = new HttpResponse();
        res.setStatusCode(200);
        res.setStatus('OK');
        Test.setMock(HttpCalloutMock.class, new OASResponseMock(res));

        Map<String, Object> params = new Map<String, Object>{
            'businessId' => 2147483648L,
            'oaSGetSuggestedOfferMappingsRequest' => ''
        };

        OASClient client;
        OASFbsApi api;
        OASGetSuggestedOfferMappingsResponse response;
        OASGetSuggestedOfferMappingsResponse expectedResponse;
        String js = '';

        client = new OASClient();
        api = new OASFbsApi(client);

        js = JSON.serialize(OASGetSuggestedOfferMappingsResponse.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASGetSuggestedOfferMappingsResponse.getExample();
        response = (OASGetSuggestedOfferMappingsResponse) api.getSuggestedOfferMappings(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASGetSuggestedOfferMappingsResponse.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASGetSuggestedOfferMappingsResponse.getExample();
        response = (OASGetSuggestedOfferMappingsResponse) api.getSuggestedOfferMappings(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASGetSuggestedOfferMappingsResponse.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASGetSuggestedOfferMappingsResponse.getExample();
        response = (OASGetSuggestedOfferMappingsResponse) api.getSuggestedOfferMappings(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASGetSuggestedOfferMappingsResponse.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASGetSuggestedOfferMappingsResponse.getExample();
        response = (OASGetSuggestedOfferMappingsResponse) api.getSuggestedOfferMappings(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASGetSuggestedOfferMappingsResponse.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASGetSuggestedOfferMappingsResponse.getExample();
        response = (OASGetSuggestedOfferMappingsResponse) api.getSuggestedOfferMappings(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASGetSuggestedOfferMappingsResponse.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASGetSuggestedOfferMappingsResponse.getExample();
        response = (OASGetSuggestedOfferMappingsResponse) api.getSuggestedOfferMappings(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASGetSuggestedOfferMappingsResponse.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASGetSuggestedOfferMappingsResponse.getExample();
        response = (OASGetSuggestedOfferMappingsResponse) api.getSuggestedOfferMappings(params);
        System.assertEquals(expectedResponse, response);
    }

    /**
     * Цены для продвижения товаров
     *
     * {% note warning &quot;&quot; %}\n\nЭтот метод устарел. Вместо него используйте [отчет «Цены на рынке»](../../reference/reports/generatePricesReport.md).\n\n{% endnote %}\n\n{% note warning &quot;&quot; %}\n\nЭтот метод подходит только тем магазинам, которые устанавливают цены на товары в рублях.\n\n{% endnote %}\n\nВозвращает цены для продвижения товаров, которые вы размещаете на Маркете.\n\nТовары, для которых нужно получить цены, передаются в теле POST-запроса.\n\nЦены для продвижения зависят от цен, установленных на товары другими партнерами. Если один товар поставляют несколько партнеров, на Маркете сначала продается товар с более низкой ценой. Когда закончится товар по низкой цене, начнет продаваться товар по более высокой цене.\n\nВыходные данные содержат для каждого товара несколько цен, соответствующих разным типам продвижения.\n\nУстановить цены на товары можно с помощью запроса [POST campaigns/{campaignId}/offer-prices/updates](../../reference/assortment/updatePrices.md) или другими способами: например, указать их в файле с каталогом. Также вы можете использовать стратегии для автоматической установки рекомендованных цен или минимальных цен на Маркете.\n\nПодробно об автоматическом управлении ценами рассказано [в Справке Маркета для продавцов](https://yandex.ru/support/marketplace/marketing/prices.html).\n\n|**⚙️ Лимит:** 100 000 товаров в час|\n|-|\n
     */
    @isTest
    private static void getSuggestedPricesTest() {
        HttpResponse res = new HttpResponse();
        res.setStatusCode(200);
        res.setStatus('OK');
        Test.setMock(HttpCalloutMock.class, new OASResponseMock(res));

        Map<String, Object> params = new Map<String, Object>{
            'campaignId' => 2147483648L,
            'oaSSuggestPricesRequest' => ''
        };

        OASClient client;
        OASFbsApi api;
        OASSuggestPricesResponse response;
        OASSuggestPricesResponse expectedResponse;
        String js = '';

        client = new OASClient();
        api = new OASFbsApi(client);

        js = JSON.serialize(OASSuggestPricesResponse.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASSuggestPricesResponse.getExample();
        response = (OASSuggestPricesResponse) api.getSuggestedPrices(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASSuggestPricesResponse.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASSuggestPricesResponse.getExample();
        response = (OASSuggestPricesResponse) api.getSuggestedPrices(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASSuggestPricesResponse.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASSuggestPricesResponse.getExample();
        response = (OASSuggestPricesResponse) api.getSuggestedPrices(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASSuggestPricesResponse.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASSuggestPricesResponse.getExample();
        response = (OASSuggestPricesResponse) api.getSuggestedPrices(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASSuggestPricesResponse.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASSuggestPricesResponse.getExample();
        response = (OASSuggestPricesResponse) api.getSuggestedPrices(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASSuggestPricesResponse.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASSuggestPricesResponse.getExample();
        response = (OASSuggestPricesResponse) api.getSuggestedPrices(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASSuggestPricesResponse.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASSuggestPricesResponse.getExample();
        response = (OASSuggestPricesResponse) api.getSuggestedPrices(params);
        System.assertEquals(expectedResponse, response);
    }

    /**
     * Список складов и групп складов
     *
     * Возвращает список складов и, если склады объединены, список групп складов. [Что такое группы складов и зачем они нужны](https://yandex.ru/support/marketplace/assortment/operations/stocks.html#unified-stocks)\n\nСреди прочего запрос позволяет определить идентификатор, который нужно использовать при передаче остатков для группы складов.\n\n|**⚙️ Лимит:** 100 запросов в минуту|\n|-|\n
     */
    @isTest
    private static void getWarehousesTest() {
        HttpResponse res = new HttpResponse();
        res.setStatusCode(200);
        res.setStatus('OK');
        Test.setMock(HttpCalloutMock.class, new OASResponseMock(res));

        Map<String, Object> params = new Map<String, Object>{
            'businessId' => 2147483648L
        };

        OASClient client;
        OASFbsApi api;
        OASGetWarehousesResponse response;
        OASGetWarehousesResponse expectedResponse;
        String js = '';

        client = new OASClient();
        api = new OASFbsApi(client);

        js = JSON.serialize(OASGetWarehousesResponse.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASGetWarehousesResponse.getExample();
        response = (OASGetWarehousesResponse) api.getWarehouses(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASGetWarehousesResponse.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASGetWarehousesResponse.getExample();
        response = (OASGetWarehousesResponse) api.getWarehouses(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASGetWarehousesResponse.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASGetWarehousesResponse.getExample();
        response = (OASGetWarehousesResponse) api.getWarehouses(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASGetWarehousesResponse.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASGetWarehousesResponse.getExample();
        response = (OASGetWarehousesResponse) api.getWarehouses(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASGetWarehousesResponse.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASGetWarehousesResponse.getExample();
        response = (OASGetWarehousesResponse) api.getWarehouses(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASGetWarehousesResponse.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASGetWarehousesResponse.getExample();
        response = (OASGetWarehousesResponse) api.getWarehouses(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASGetWarehousesResponse.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASGetWarehousesResponse.getExample();
        response = (OASGetWarehousesResponse) api.getWarehouses(params);
        System.assertEquals(expectedResponse, response);
    }

    /**
     * Передача кодов маркировки единиц товара
     *
     * {% note warning &quot;Этот запрос только для DBS&quot; %}\n\nЕсли вы работаете по модели FBS, пользуйтесь [PUT campaigns/{campaignId}/orders/{orderId}/boxes](../../reference/orders/setOrderBoxLayout.md).\n\n{% endnote %}\n\nПередает Маркету коды маркировки для единиц товара в указанном заказе.\n\nПринимаются коды следующих типов:\n\n* Коды «Честного знака».\n* УИН для ювелирных изделий.\n* РНПТ и ГТД для импортных прослеживаемых товаров.\n\n{% note warning %}\n\nПрежде чем работать с этим методом, обязательно прочтите [статью о работе с маркируемыми товарами](https://yandex.ru/support/marketplace/orders/cz.html).\n\n{% endnote %}\n\nДля каждой позиции в заказе, требующей маркировки, нужно передать список кодов — по одному для каждой единицы товара. Например, если в заказе две пары тапочек и одна пара туфель, получится список из двух кодов для первой позиции и список из одного кода для второй.\n\n|**⚙️ Лимит:** 1 000 000 запросов в час|\n|-|\n
     */
    @isTest
    private static void provideOrderItemIdentifiersTest() {
        HttpResponse res = new HttpResponse();
        res.setStatusCode(200);
        res.setStatus('OK');
        Test.setMock(HttpCalloutMock.class, new OASResponseMock(res));

        Map<String, Object> params = new Map<String, Object>{
            'campaignId' => 2147483648L,
            'orderId' => 2147483648L,
            'oaSProvideOrderItemIdentifiersReques' => ''
        };

        OASClient client;
        OASFbsApi api;
        OASProvideOrderItemIdentifiersRespon response;
        OASProvideOrderItemIdentifiersRespon expectedResponse;
        String js = '';

        client = new OASClient();
        api = new OASFbsApi(client);

        js = JSON.serialize(OASProvideOrderItemIdentifiersRespon.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASProvideOrderItemIdentifiersRespon.getExample();
        response = (OASProvideOrderItemIdentifiersRespon) api.provideOrderItemIdentifiers(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASProvideOrderItemIdentifiersRespon.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASProvideOrderItemIdentifiersRespon.getExample();
        response = (OASProvideOrderItemIdentifiersRespon) api.provideOrderItemIdentifiers(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASProvideOrderItemIdentifiersRespon.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASProvideOrderItemIdentifiersRespon.getExample();
        response = (OASProvideOrderItemIdentifiersRespon) api.provideOrderItemIdentifiers(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASProvideOrderItemIdentifiersRespon.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASProvideOrderItemIdentifiersRespon.getExample();
        response = (OASProvideOrderItemIdentifiersRespon) api.provideOrderItemIdentifiers(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASProvideOrderItemIdentifiersRespon.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASProvideOrderItemIdentifiersRespon.getExample();
        response = (OASProvideOrderItemIdentifiersRespon) api.provideOrderItemIdentifiers(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASProvideOrderItemIdentifiersRespon.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASProvideOrderItemIdentifiersRespon.getExample();
        response = (OASProvideOrderItemIdentifiersRespon) api.provideOrderItemIdentifiers(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASProvideOrderItemIdentifiersRespon.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASProvideOrderItemIdentifiersRespon.getExample();
        response = (OASProvideOrderItemIdentifiersRespon) api.provideOrderItemIdentifiers(params);
        System.assertEquals(expectedResponse, response);
    }

    /**
     * Включение буста продаж и установка ставок
     *
     * Запускает буст продаж — создает и включает кампанию, добавляет в нее товары и назначает на них ставки.\n\n{% cut &quot;Как в кабинете выглядит кампания, созданная через API&quot; %}\n\n![](../../_images/api-boost.png)\n\n{% endcut %}\n\nПри первом использовании запроса Маркет: создаст единую на все магазины бизнес-аккаунта кампанию, добавит в нее товары с указанными ставками, включит для них ценовую стратегию и запустит продвижение. Повторное использование запроса позволит обновить ставки на товары в этой кампании или добавить новые. Подробнее о ценовой стратегии читайте в [Справке Маркета для продавцов](https://yandex.ru/support/marketplace/marketing/campaigns.html#price-strategy).\n\nЕсли товара с указанным SKU нет, он будет проигнорирован. Если в будущем в каталоге появится товар с таким SKU, он автоматически будет добавлен в кампанию с указанной ставкой.\n\nЗапрос всегда работает с одной и той же созданной через API кампанией. Если в кабинете удалить ее, при следующем выполнении запроса Маркет создаст новую. Другими кампаниями управлять через API не получится. У созданной через API кампании всегда наибольший приоритет над остальными — изменить его нельзя.\n\nВыполнение запроса включает кампанию и ценовую стратегию, если они были отключены.\n\nВнести другие изменения в созданную через API кампанию можно в кабинете:\n\n* выключить или включить кампанию;\n* изменить ее название;\n* выключить или включить ценовую стратегию.\n\nЧтобы остановить продвижение отдельных товаров и удалить их из кампании, передайте для них нулевую ставку в параметре &#x60;bid&#x60;.\n\nПодробнее о том, как работает буст продаж, читайте в [Справке Маркета для продавцов](https://yandex.ru/support/marketplace/marketing/campaigns.html).\n\n{% note info &quot;𝓠 Как посмотреть расходы на буст продаж?&quot; %}\n\n𝓐 Фактические расходы на буст указаны в отчете по заказам ([POST campaigns/{campaignId}/stats/orders](../../reference/stats/getOrdersStats.md)). Сумма содержится в поле &#x60;bidFee&#x60;.\n\n{% endnote %}\n\nВ одном запросе может быть максимум 1500 товаров.\n\n|**⚙️ Лимит:** 1000 запросов в минуту|\n|-|\n
     */
    @isTest
    private static void putBidsForBusinessTest() {
        HttpResponse res = new HttpResponse();
        res.setStatusCode(200);
        res.setStatus('OK');
        Test.setMock(HttpCalloutMock.class, new OASResponseMock(res));

        Map<String, Object> params = new Map<String, Object>{
            'businessId' => 2147483648L,
            'oaSPutSkuBidsRequest' => ''
        };

        OASClient client;
        OASFbsApi api;
        OASEmptyApiResponse response;
        OASEmptyApiResponse expectedResponse;
        String js = '';

        client = new OASClient();
        api = new OASFbsApi(client);

        js = JSON.serialize(OASEmptyApiResponse.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASEmptyApiResponse.getExample();
        response = (OASEmptyApiResponse) api.putBidsForBusiness(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASEmptyApiResponse.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASEmptyApiResponse.getExample();
        response = (OASEmptyApiResponse) api.putBidsForBusiness(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASEmptyApiResponse.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASEmptyApiResponse.getExample();
        response = (OASEmptyApiResponse) api.putBidsForBusiness(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASEmptyApiResponse.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASEmptyApiResponse.getExample();
        response = (OASEmptyApiResponse) api.putBidsForBusiness(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASEmptyApiResponse.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASEmptyApiResponse.getExample();
        response = (OASEmptyApiResponse) api.putBidsForBusiness(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASEmptyApiResponse.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASEmptyApiResponse.getExample();
        response = (OASEmptyApiResponse) api.putBidsForBusiness(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASEmptyApiResponse.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASEmptyApiResponse.getExample();
        response = (OASEmptyApiResponse) api.putBidsForBusiness(params);
        System.assertEquals(expectedResponse, response);
    }

    /**
     * Включение буста продаж и установка ставок для магазина
     *
     * Запускает буст продаж в указанном магазине — создает и включает кампанию, добавляет в нее товары и назначает на них ставки.\n\nПри первом использовании запроса Маркет: создаст кампанию, добавит в нее товары с указанными ставками для заданного магазина, включит для них ценовую стратегию и запустит продвижение. Повторное использование запроса позволит обновить ставки на товары в этой кампании или добавить новые. Подробнее о ценовой стратегии читайте в [Справке Маркета для продавцов](https://yandex.ru/support/marketplace/marketing/campaigns.html#price-strategy).\n\nЕсли товара с указанным SKU нет, он будет проигнорирован. Если в будущем в каталоге появится товар с таким SKU, он автоматически будет добавлен в кампанию с указанной ставкой.\n\nЗапрос всегда работает с одной и той же кампанией, созданной через этот запрос или [PUT businesses/{businessId}/bids](/reference/bids/putBidsForBusiness). Если в кабинете удалить ее, при следующем выполнении запроса Маркет создаст новую. У созданной через API кампании всегда наибольший приоритет над остальными — изменить его нельзя.\n\nВыполнение запроса включает кампанию и ценовую стратегию, если они были отключены.\n\nВнести другие изменения в созданную через API кампанию можно в кабинете:\n\n* выключить или включить кампанию;\n* изменить ее название;\n* выключить или включить ценовую стратегию.\n\nЧтобы остановить продвижение отдельных товаров и удалить их из кампании, передайте для них нулевую ставку в параметре &#x60;bid&#x60;.\n\nПодробнее о том, как работает буст продаж, читайте в [Справке Маркета для продавцов](https://yandex.ru/support/marketplace/marketing/campaigns.html).\n\n{% note info &quot;𝓠 Как посмотреть расходы на буст продаж?&quot; %}\n\n𝓐 Фактические расходы на буст указаны в отчете по заказам ([POST campaigns/{campaignId}/stats/orders](../../reference/stats/getOrdersStats.md)). Сумма содержится в поле &#x60;bidFee&#x60;.\n\n{% endnote %}\n\nВ одном запросе может быть максимум 1500 товаров.\n\n|**⚙️ Лимит:** 1000 запросов в минуту|\n|-|\n
     */
    @isTest
    private static void putBidsForCampaignTest() {
        HttpResponse res = new HttpResponse();
        res.setStatusCode(200);
        res.setStatus('OK');
        Test.setMock(HttpCalloutMock.class, new OASResponseMock(res));

        Map<String, Object> params = new Map<String, Object>{
            'campaignId' => 2147483648L,
            'oaSPutSkuBidsRequest' => ''
        };

        OASClient client;
        OASFbsApi api;
        OASEmptyApiResponse response;
        OASEmptyApiResponse expectedResponse;
        String js = '';

        client = new OASClient();
        api = new OASFbsApi(client);

        js = JSON.serialize(OASEmptyApiResponse.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASEmptyApiResponse.getExample();
        response = (OASEmptyApiResponse) api.putBidsForCampaign(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASEmptyApiResponse.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASEmptyApiResponse.getExample();
        response = (OASEmptyApiResponse) api.putBidsForCampaign(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASEmptyApiResponse.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASEmptyApiResponse.getExample();
        response = (OASEmptyApiResponse) api.putBidsForCampaign(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASEmptyApiResponse.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASEmptyApiResponse.getExample();
        response = (OASEmptyApiResponse) api.putBidsForCampaign(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASEmptyApiResponse.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASEmptyApiResponse.getExample();
        response = (OASEmptyApiResponse) api.putBidsForCampaign(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASEmptyApiResponse.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASEmptyApiResponse.getExample();
        response = (OASEmptyApiResponse) api.putBidsForCampaign(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASEmptyApiResponse.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASEmptyApiResponse.getExample();
        response = (OASEmptyApiResponse) api.putBidsForCampaign(params);
        System.assertEquals(expectedResponse, response);
    }

    /**
     * Сообщить, что прайс-лист обновился
     *
     * {% note warning &quot;&quot; %}\n\nЭтот метод устарел. Не используйте его.\n\n{% endnote %}\n\nПозволяет сообщить, что магазин обновил прайс-лист. После этого Маркет начнет обновление данных на сервисе.\n1. Магазин обновляет прайс-лист, ссылку на который он указал в кабинете.\n2. Магазин отправляет Маркету запрос методом &#x60;POST campaigns/{campaignId}/feeds/{feedId}/refresh&#x60;.\n3. Маркет начинает обновление данных магазина на сервисе.\n\n{% note alert %}\n\nЗапрос работает только для включенных магазинов. Если магазин выключен, данные на Маркете не обновятся, даже если HTTP-код — &#x60;200 OK&#x60;. Проверить статус магазина можно с помощью базовых запросов или на странице бизнес-аккаунта.\n\n{% endnote %}\n\n|**⚙️ Лимит:** 3 запроса в час для одного прайс-листа|\n|-|\n
     */
    @isTest
    private static void refreshFeedTest() {
        HttpResponse res = new HttpResponse();
        res.setStatusCode(200);
        res.setStatus('OK');
        Test.setMock(HttpCalloutMock.class, new OASResponseMock(res));

        Map<String, Object> params = new Map<String, Object>{
            'campaignId' => 2147483648L,
            'feedId' => 2147483648L
        };

        OASClient client;
        OASFbsApi api;
        OASEmptyApiResponse response;
        OASEmptyApiResponse expectedResponse;
        String js = '';

        client = new OASClient();
        api = new OASFbsApi(client);

        js = JSON.serialize(OASEmptyApiResponse.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASEmptyApiResponse.getExample();
        response = (OASEmptyApiResponse) api.refreshFeed(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASEmptyApiResponse.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASEmptyApiResponse.getExample();
        response = (OASEmptyApiResponse) api.refreshFeed(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASEmptyApiResponse.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASEmptyApiResponse.getExample();
        response = (OASEmptyApiResponse) api.refreshFeed(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASEmptyApiResponse.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASEmptyApiResponse.getExample();
        response = (OASEmptyApiResponse) api.refreshFeed(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASEmptyApiResponse.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASEmptyApiResponse.getExample();
        response = (OASEmptyApiResponse) api.refreshFeed(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASEmptyApiResponse.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASEmptyApiResponse.getExample();
        response = (OASEmptyApiResponse) api.refreshFeed(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASEmptyApiResponse.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASEmptyApiResponse.getExample();
        response = (OASEmptyApiResponse) api.refreshFeed(params);
        System.assertEquals(expectedResponse, response);
    }

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
        OASFbsApi api;
        OASGetRegionWithChildrenResponse response;
        OASGetRegionWithChildrenResponse expectedResponse;
        String js = '';

        client = new OASClient();
        api = new OASFbsApi(client);

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
        OASFbsApi api;
        OASGetRegionsResponse response;
        OASGetRegionsResponse expectedResponse;
        String js = '';

        client = new OASClient();
        api = new OASFbsApi(client);

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
        OASFbsApi api;
        OASGetRegionsResponse response;
        OASGetRegionsResponse expectedResponse;
        String js = '';

        client = new OASClient();
        api = new OASFbsApi(client);

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

    /**
     * Получение информации о нескольких отгрузках
     *
     * Возвращает информацию об отгрузках по заданным параметрам:\n\n* дате;\n* статусу;\n* идентификаторам заказов.\n\nРезультаты возвращаются постранично.\n|**⚙️ Лимит:** 100 запросов в час|\n|-|\n
     */
    @isTest
    private static void searchShipmentsTest() {
        HttpResponse res = new HttpResponse();
        res.setStatusCode(200);
        res.setStatus('OK');
        Test.setMock(HttpCalloutMock.class, new OASResponseMock(res));

        Map<String, Object> params = new Map<String, Object>{
            'campaignId' => 2147483648L,
            'oaSSearchShipmentsRequest' => '',
            'pageToken' => eyBuZXh0SWQ6IDIzNDIgfQ==,
            'r_limit' => 20
        };

        OASClient client;
        OASFbsApi api;
        OASSearchShipmentsResponse response;
        OASSearchShipmentsResponse expectedResponse;
        String js = '';

        client = new OASClient();
        api = new OASFbsApi(client);

        js = JSON.serialize(OASSearchShipmentsResponse.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASSearchShipmentsResponse.getExample();
        response = (OASSearchShipmentsResponse) api.searchShipments(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASSearchShipmentsResponse.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASSearchShipmentsResponse.getExample();
        response = (OASSearchShipmentsResponse) api.searchShipments(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASSearchShipmentsResponse.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASSearchShipmentsResponse.getExample();
        response = (OASSearchShipmentsResponse) api.searchShipments(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASSearchShipmentsResponse.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASSearchShipmentsResponse.getExample();
        response = (OASSearchShipmentsResponse) api.searchShipments(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASSearchShipmentsResponse.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASSearchShipmentsResponse.getExample();
        response = (OASSearchShipmentsResponse) api.searchShipments(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASSearchShipmentsResponse.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASSearchShipmentsResponse.getExample();
        response = (OASSearchShipmentsResponse) api.searchShipments(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASSearchShipmentsResponse.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASSearchShipmentsResponse.getExample();
        response = (OASSearchShipmentsResponse) api.searchShipments(params);
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
        OASFbsApi api;
        OASEmptyApiResponse response;
        OASEmptyApiResponse expectedResponse;
        String js = '';

        client = new OASClient();
        api = new OASFbsApi(client);

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
        OASFbsApi api;
        OASEmptyApiResponse response;
        OASEmptyApiResponse expectedResponse;
        String js = '';

        client = new OASClient();
        api = new OASFbsApi(client);

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

    /**
     * Изменение параметров прайс-листа
     *
     * {% note warning &quot;&quot; %}\n\nЭтот метод устарел. Не используйте его.\n\n{% endnote %}\n\nПозволяет магазину изменить параметры прайс-листа.\n\nЧтобы отредактировать параметр прайс-листа, передайте в теле запроса: &#x60;name&#x60; (название параметра) и &#x60;value&#x60; (значение параметра).\n\nЧтобы отменить установленное значение, передайте в теле запроса: &#x60;name&#x60; (название параметра) и &#x60;delete&#x3D;true&#x60; (удалить значение).\n\n|**⚙️ Лимит:** 3 запроса в час для одного прайс-листа|\n|-|\n
     */
    @isTest
    private static void setFeedParamsTest() {
        HttpResponse res = new HttpResponse();
        res.setStatusCode(200);
        res.setStatus('OK');
        Test.setMock(HttpCalloutMock.class, new OASResponseMock(res));

        Map<String, Object> params = new Map<String, Object>{
            'campaignId' => 2147483648L,
            'feedId' => 2147483648L,
            'oaSSetFeedParamsRequest' => ''
        };

        OASClient client;
        OASFbsApi api;
        OASEmptyApiResponse response;
        OASEmptyApiResponse expectedResponse;
        String js = '';

        client = new OASClient();
        api = new OASFbsApi(client);

        js = JSON.serialize(OASEmptyApiResponse.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASEmptyApiResponse.getExample();
        response = (OASEmptyApiResponse) api.setFeedParams(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASEmptyApiResponse.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASEmptyApiResponse.getExample();
        response = (OASEmptyApiResponse) api.setFeedParams(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASEmptyApiResponse.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASEmptyApiResponse.getExample();
        response = (OASEmptyApiResponse) api.setFeedParams(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASEmptyApiResponse.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASEmptyApiResponse.getExample();
        response = (OASEmptyApiResponse) api.setFeedParams(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASEmptyApiResponse.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASEmptyApiResponse.getExample();
        response = (OASEmptyApiResponse) api.setFeedParams(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASEmptyApiResponse.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASEmptyApiResponse.getExample();
        response = (OASEmptyApiResponse) api.setFeedParams(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASEmptyApiResponse.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASEmptyApiResponse.getExample();
        response = (OASEmptyApiResponse) api.setFeedParams(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASEmptyApiResponse.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASEmptyApiResponse.getExample();
        response = (OASEmptyApiResponse) api.setFeedParams(params);
        System.assertEquals(expectedResponse, response);
    }

    /**
     * Подготовка заказа
     *
     * {% note tip &quot;Подходит и для DBS&quot; %}\n\nЗапрос предназначен для работы с FBS-заказами, но вы можете использовать его для обработки DBS-заказов, если это удобно.\n\n{% endnote %}\n\nПозволяет выполнить три операции:\n\n* передать Маркету информацию о распределении товаров по коробкам;\n* передать Маркету коды маркировки для товаров;\n* удалить товар из заказа, если его не оказалось на складе.\n\nЕсли нужно что-то поправить в переданных данных, просто повторите запрос — это можно делать сколько угодно раз до перевода заказа в статус **Готов к отгрузке**. ⚠️ Если вы меняете раскладку уже после печати и расклейки ярлыков, не забудье перепечатать их и наклеить заново.\n\n## Как передать информацию о распределении товаров\n\nВ этом запросе вам нужно передать Маркету список коробок и указать, какие именно товары лежат в каждой из них. Коробки могут быть двух типов:\n\n* **Содержащие товары целиком.** Такая коробка может содержать сколько угодно единиц любых товаров.\n\n* **Содержащие часть товара.** Такие коробки содержат по одной части одного товара. Например, одна содержит внешний блок кондиционера, а другая — внутренний блок.\n\n⚠️ Одна коробка не может содержать и товары целиком, и части товаров.\n\n## Как передавать коды маркировки\n\nЕсли в заказе есть товары, подлежащие маркировке, в запросе нужно передать соответствующие уникальные коды. [Что такое маркировка?](https://yandex.ru/support/marketplace/orders/cz.html)\n\nПринимаются коды следующих типов:\n\n* Коды «Честного знака».\n* УИН для ювелирных изделий.\n* РНПТ и ГТД для импортных прослеживаемых товаров.\n\nДля каждой позиции в заказе, требующей маркировки, нужно передать список кодов — по одному для каждой единицы товара. Например, если в заказе две пары тапочек и одна пара туфель, получится список из двух кодов для первой позиции и список из одного кода для второй.\n\nЕсли товар едет в нескольких коробках, код маркировки нужно передать для каждой из них.\n\n## Как удалить товар из заказа\n\nЧтобы удалить товар из заказа:\n\n1. Добавьте в запрос &#x60;allowRemove: true&#x60;.\n2. Передайте распределение по коробкам без товара, который нужно удалить.\n\n{% note warning &quot;Удаление нельзя отменить&quot; %}\n\nЭта операция необратима: покупатель сразу получит уведомление, а состав заказа изменится.\n\n{% endnote %}\n\nЧтобы удалить позицию целиком, не передавайте соответствующий &#x60;OrderBoxLayoutItemDTO&#x60;. Чтобы уменьшить количество товара, передайте уменьшенное значение в поле &#x60;fullCount&#x60;.\n\nНельзя удалить или уменьшить количество товара, если он:\n\n* добавлен по акции;\n* составляет 99% стоимости заказа;\n* единственный товар в заказе.\n\nЕсли вы не можете отгрузить такой товар, отмените заказ. Для этого отправьте запрос методом [PUT campaigns/{campaignId}/orders/{orderId}/status](../../reference/orders/updateOrderStatus.md) и передайте статус заказа &#x60;CANCELLED&#x60; с причиной отмены &#x60;SHOP_FAILED&#x60;.\n\n{% note info &quot;Увеличить заказ нельзя&quot; %}\n\nС помощью запроса нельзя увеличить количество одинаковых товаров, добавить новые товары в заказ или заменить один товар другим.\n\n{% endnote %}\n\n## Примеры\n\n{% cut &quot;Товар умещается в коробку&quot; %}\n\nВот как будет выглядеть запрос, если в одной коробке едут:\n\n  * три единицы одного товара, требующего маркировки;\n  * одна единица другого товара, не требущего маркировки.\n\n  &#x60;&#x60;&#x60;json\n  {\n      &quot;boxes&quot;: [\n          {\n              &quot;items&quot;: [\n                  {\n                      &quot;id&quot;: 123456,\n                      &quot;fullCount&quot;: 3,\n                      &quot;instances&quot;: [\n                          {\n                              &quot;cis&quot;: &quot;01030410947874432155Qbag!\u001d93Zjqw&quot;\n                          },\n                          {\n                              &quot;cis&quot;: &quot;010304109478gftJ14545762!\u001dhGt264&quot;\n                          },\n                          {\n                              &quot;cis&quot;: &quot;010304109478fRs28323ks23!\u001dhet201&quot;\n                          }\n                      ]\n                  },\n                  {\n                      &quot;id&quot;: 654321,\n                      &quot;fullCount&quot;: 1\n                  }\n              ]\n          }\n      ]\n  }\n  &#x60;&#x60;&#x60;\n\n{% endcut %}\n\n{% cut &quot;Товар едет в разных коробках&quot; %}\n\nВот как будет выглядеть запрос, если товар едет в двух коробках:\n\n  &#x60;&#x60;&#x60;json\n  {\n      &quot;boxes&quot;: [\n          {\n              &quot;items&quot;: [\n                  {\n                      &quot;id&quot;: 123456,\n                      &quot;partialCount&quot;: {\n                          &quot;current&quot;: 1,\n                          &quot;total&quot;: 2\n                      },\n                      &quot;instances&quot;: [\n                          {\n                              &quot;cis&quot;: &quot;01030410947874432155Qbag!\u001d93Zjqw&quot;\n                          }\n                      ]\n                  }\n              ]\n          },\n          {\n              &quot;items&quot;: [\n                  {\n                      &quot;id&quot;: 123456,\n                      &quot;partialCount&quot;: {\n                          &quot;current&quot;: 2,\n                          &quot;total&quot;: 2\n                      },\n                      &quot;instances&quot;: [\n                          {\n                              &quot;cis&quot;: &quot;01030410947874432155Qbag!\u001d93Zjqw&quot;\n                          }\n                      ]\n                  }\n              ]\n          }\n      ]\n  }\n  &#x60;&#x60;&#x60;\n\n{% endcut %}\n\n{% cut &quot;Одинаковые товары, где каждый едет в нескольких коробках&quot; %}\n\nВот как будет выглядеть запрос, если каждый из двух одинаковых товаров едет в двух коробках:\n\n  &#x60;&#x60;&#x60;json\n  {\n      &quot;boxes&quot;: [\n          {\n              &quot;items&quot;: [\n                  {\n                      &quot;id&quot;: 123456,\n                      &quot;partialCount&quot;: {\n                          &quot;current&quot;: 1,\n                          &quot;total&quot;: 2\n                      },\n                      &quot;instances&quot;: [\n                          {\n                              &quot;cis&quot;: &quot;01030410947874432155Qbag!\u001d93Zjqw&quot;\n                          }\n                      ]\n                  }\n              ]\n          },\n          {\n              &quot;items&quot;: [\n                  {\n                      &quot;id&quot;: 123456,\n                      &quot;partialCount&quot;: {\n                          &quot;current&quot;: 2,\n                          &quot;total&quot;: 2\n                      },\n                      &quot;instances&quot;: [\n                          {\n                              &quot;cis&quot;: &quot;01030410947874432155Qbag!\u001d93Zjqw&quot;\n                          }\n                      ]\n                  }\n              ]\n          },\n          {\n              &quot;items&quot;: [\n                  {\n                      &quot;id&quot;: 123456,\n                      &quot;partialCount&quot;: {\n                          &quot;current&quot;: 1,\n                          &quot;total&quot;: 2\n                      },\n                      &quot;instances&quot;: [\n                          {\n                              &quot;cis&quot;: &quot;01030410947874432155Qbag!\u001d93Zjqw&quot;\n                          }\n                      ]\n                  }\n              ]\n          },\n          {\n              &quot;items&quot;: [\n                  {\n                      &quot;id&quot;: 123456,\n                      &quot;partialCount&quot;: {\n                          &quot;current&quot;: 2,\n                          &quot;total&quot;: 2\n                      },\n                      &quot;instances&quot;: [\n                          {\n                              &quot;cis&quot;: &quot;01030410947874432155Qbag!\u001d93Zjqw&quot;\n                          }\n                      ]\n                  }\n              ]\n          }\n      ]\n  }\n  &#x60;&#x60;&#x60;\n\n{% endcut %}\n\n|**⚙️ Лимит:** 1 000 000 запросов в час|\n|-|\n
     */
    @isTest
    private static void setOrderBoxLayoutTest() {
        HttpResponse res = new HttpResponse();
        res.setStatusCode(200);
        res.setStatus('OK');
        Test.setMock(HttpCalloutMock.class, new OASResponseMock(res));

        Map<String, Object> params = new Map<String, Object>{
            'campaignId' => 2147483648L,
            'orderId' => 2147483648L,
            'oaSSetOrderBoxLayoutRequest' => ''
        };

        OASClient client;
        OASFbsApi api;
        OASSetOrderBoxLayoutResponse response;
        OASSetOrderBoxLayoutResponse expectedResponse;
        String js = '';

        client = new OASClient();
        api = new OASFbsApi(client);

        js = JSON.serialize(OASSetOrderBoxLayoutResponse.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASSetOrderBoxLayoutResponse.getExample();
        response = (OASSetOrderBoxLayoutResponse) api.setOrderBoxLayout(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASSetOrderBoxLayoutResponse.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASSetOrderBoxLayoutResponse.getExample();
        response = (OASSetOrderBoxLayoutResponse) api.setOrderBoxLayout(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASSetOrderBoxLayoutResponse.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASSetOrderBoxLayoutResponse.getExample();
        response = (OASSetOrderBoxLayoutResponse) api.setOrderBoxLayout(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASSetOrderBoxLayoutResponse.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASSetOrderBoxLayoutResponse.getExample();
        response = (OASSetOrderBoxLayoutResponse) api.setOrderBoxLayout(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASSetOrderBoxLayoutResponse.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASSetOrderBoxLayoutResponse.getExample();
        response = (OASSetOrderBoxLayoutResponse) api.setOrderBoxLayout(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASSetOrderBoxLayoutResponse.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASSetOrderBoxLayoutResponse.getExample();
        response = (OASSetOrderBoxLayoutResponse) api.setOrderBoxLayout(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASSetOrderBoxLayoutResponse.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASSetOrderBoxLayoutResponse.getExample();
        response = (OASSetOrderBoxLayoutResponse) api.setOrderBoxLayout(params);
        System.assertEquals(expectedResponse, response);
    }

    /**
     * Передача количества грузовых мест в заказе
     *
     * {% note warning &quot;Этот запрос только для DBS&quot; %}\n\nЕсли вы работаете по модели FBS, пользуйтесь [PUT campaigns/{campaignId}/orders/{orderId}/boxes](../../reference/orders/setOrderBoxLayout.md).\n\n{% endnote %}\n\nОтгружаемый Маркету заказ может не влезть в одну коробку или упаковку — в этом случае получается, что он занимает несколько грузовых мест.\n\nКоличество грузовых мест нужно обязательно передавать Маркету, если оно не равно 1. Это делается перед переводом его в статус **Готов к отгрузке**. Подробно о том, что в какой момент нужно передавать, рассказано в [пошаговой инструкции](../../step-by-step/fbs.md).\n\nМетод устроен немного нестандартно: количество задается длиной массива пустых объектов.\n\nРаньше метод требовал передачи большего количества данных. Запросы, оформленные по старому образцу, работают, но лучше делать по-новому.\n\n{% cut &quot;Как было раньше&quot; %}\n\nСтруктура тела PUT-запроса:\n\n&#x60;&#x60;&#x60;\n{\n  &quot;boxes&quot;:\n  [\n    {\n      &quot;fulfilmentId&quot;: &quot;{string}&quot;,\n      &quot;weight&quot;: {int64},\n      &quot;width&quot;: {int64},\n      &quot;height&quot;: {int64},\n      &quot;depth&quot;: {int64},\n      &quot;items&quot;:\n      [\n        {\n          &quot;id&quot;: {int64},\n          &quot;count&quot;: {int32}\n        },\n        ...\n      ]\n    },\n    ...\n  ]\n}\n&#x60;&#x60;&#x60;\n| **Параметр**  | **Тип**  | **Значение**  |\n| ----------- | ----------- | ----------- |\n| &#x60;boxes&#x60;       |           | Список грузовых мест.       |\n\n**Параметры, вложенные в &#x60;boxes&#x60;**\n| **Параметр**  | **Тип**  | **Значение**  |\n| ----------- | ----------- | ----------- |\n| &#x60;fulfilmentId&#x60;       |  String   | Идентификатор грузового места в информационной системе магазина. Сформируйте идентификатор по шаблону: &#x60;номер заказа на Маркете-номер грузового места&#x60;. Например, &#x60;7206821‑1, 7206821‑2&#x60; и т. д. |\n| &#x60;weight&#x60;       | Int64        | Масса брутто грузового места (суммарная масса упаковки и содержимого) в граммах. |\n| &#x60;width&#x60;       | Int64   | Ширина грузового места в сантиметрах.       |\n| &#x60;height&#x60;       | Int64   | Высота грузового места в сантиметрах.       |\n| &#x60;depth&#x60;       | Int64   | Глубина грузового места в сантиметрах.        |\n| &#x60;items&#x60;       | Int64   | Список товаров в грузовом месте.       |\n\n**Параметры, вложенные в &#x60;items&#x60;**\n| **Параметр**  | **Тип**  | **Значение**  |\n| ----------- | ----------- | ----------- |\n| &#x60;id&#x60;       | Int64     | Идентификатор товара в рамках заказа.   |\n| &#x60;count&#x60;    | Int32     | Количество единиц товара в грузовом месте.       |\n\n{% endcut %}\n\n|**⚙️ Лимит:** 1 000 000 запросов в час|\n|-|\n
     */
    @isTest
    private static void setOrderShipmentBoxesTest() {
        HttpResponse res = new HttpResponse();
        res.setStatusCode(200);
        res.setStatus('OK');
        Test.setMock(HttpCalloutMock.class, new OASResponseMock(res));

        Map<String, Object> params = new Map<String, Object>{
            'campaignId' => 2147483648L,
            'orderId' => 2147483648L,
            'shipmentId' => 2147483648L,
            'oaSSetOrderShipmentBoxesRequest' => ''
        };

        OASClient client;
        OASFbsApi api;
        OASSetOrderShipmentBoxesResponse response;
        OASSetOrderShipmentBoxesResponse expectedResponse;
        String js = '';

        client = new OASClient();
        api = new OASFbsApi(client);

        js = JSON.serialize(OASSetOrderShipmentBoxesResponse.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASSetOrderShipmentBoxesResponse.getExample();
        response = (OASSetOrderShipmentBoxesResponse) api.setOrderShipmentBoxes(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASSetOrderShipmentBoxesResponse.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASSetOrderShipmentBoxesResponse.getExample();
        response = (OASSetOrderShipmentBoxesResponse) api.setOrderShipmentBoxes(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASSetOrderShipmentBoxesResponse.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASSetOrderShipmentBoxesResponse.getExample();
        response = (OASSetOrderShipmentBoxesResponse) api.setOrderShipmentBoxes(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASSetOrderShipmentBoxesResponse.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASSetOrderShipmentBoxesResponse.getExample();
        response = (OASSetOrderShipmentBoxesResponse) api.setOrderShipmentBoxes(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASSetOrderShipmentBoxesResponse.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASSetOrderShipmentBoxesResponse.getExample();
        response = (OASSetOrderShipmentBoxesResponse) api.setOrderShipmentBoxes(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASSetOrderShipmentBoxesResponse.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASSetOrderShipmentBoxesResponse.getExample();
        response = (OASSetOrderShipmentBoxesResponse) api.setOrderShipmentBoxes(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASSetOrderShipmentBoxesResponse.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASSetOrderShipmentBoxesResponse.getExample();
        response = (OASSetOrderShipmentBoxesResponse) api.setOrderShipmentBoxes(params);
        System.assertEquals(expectedResponse, response);
    }

    /**
     * Передача количества упаковок в отгрузке
     *
     * Передает Маркету количество коробов или палет в отгрузке для доверительной приемки. Подробнее про доверительную приемку написано в [Справке Маркета](https://yandex.ru/support/marketplace/orders/fbs/process.html#acceptance).\n\nПолучить PDF-файл с ярлыками для упаковок можно с помощью запроса [GET campaigns/{campaignId}/first-mile/shipments/{shipmentId}/pallet/labels](../../reference/shipments/downloadShipmentPalletLabels.md).\n|**⚙️ Лимит:** 200 запросов в час|\n|-|\n
     */
    @isTest
    private static void setShipmentPalletsCountTest() {
        HttpResponse res = new HttpResponse();
        res.setStatusCode(200);
        res.setStatus('OK');
        Test.setMock(HttpCalloutMock.class, new OASResponseMock(res));

        Map<String, Object> params = new Map<String, Object>{
            'campaignId' => 2147483648L,
            'shipmentId' => 2147483648L,
            'oaSSetShipmentPalletsCountRequest' => ''
        };

        OASClient client;
        OASFbsApi api;
        OASEmptyApiResponse response;
        OASEmptyApiResponse expectedResponse;
        String js = '';

        client = new OASClient();
        api = new OASFbsApi(client);

        js = JSON.serialize(OASEmptyApiResponse.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASEmptyApiResponse.getExample();
        response = (OASEmptyApiResponse) api.setShipmentPalletsCount(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASEmptyApiResponse.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASEmptyApiResponse.getExample();
        response = (OASEmptyApiResponse) api.setShipmentPalletsCount(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASEmptyApiResponse.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASEmptyApiResponse.getExample();
        response = (OASEmptyApiResponse) api.setShipmentPalletsCount(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASEmptyApiResponse.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASEmptyApiResponse.getExample();
        response = (OASEmptyApiResponse) api.setShipmentPalletsCount(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASEmptyApiResponse.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASEmptyApiResponse.getExample();
        response = (OASEmptyApiResponse) api.setShipmentPalletsCount(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASEmptyApiResponse.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASEmptyApiResponse.getExample();
        response = (OASEmptyApiResponse) api.setShipmentPalletsCount(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASEmptyApiResponse.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASEmptyApiResponse.getExample();
        response = (OASEmptyApiResponse) api.setShipmentPalletsCount(params);
        System.assertEquals(expectedResponse, response);
    }

    /**
     * Отказ от ответа на отзывы
     *
     * Пропускает отзывы — они больше не будут возвращаться в методе получения всех отзывов [POST businesses/{businessId}/goods-feedback](../../reference/goods-feedback/getGoodsFeedbacks.md).\n\n|**⚙️ Лимит:** 1 000 запросов в час|\n|-|\n
     */
    @isTest
    private static void skipGoodsFeedbacksReactionTest() {
        HttpResponse res = new HttpResponse();
        res.setStatusCode(200);
        res.setStatus('OK');
        Test.setMock(HttpCalloutMock.class, new OASResponseMock(res));

        Map<String, Object> params = new Map<String, Object>{
            'businessId' => 2147483648L,
            'oaSSkipGoodsFeedbackReactionRequest' => ''
        };

        OASClient client;
        OASFbsApi api;
        OASEmptyApiResponse response;
        OASEmptyApiResponse expectedResponse;
        String js = '';

        client = new OASClient();
        api = new OASFbsApi(client);

        js = JSON.serialize(OASEmptyApiResponse.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASEmptyApiResponse.getExample();
        response = (OASEmptyApiResponse) api.skipGoodsFeedbacksReaction(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASEmptyApiResponse.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASEmptyApiResponse.getExample();
        response = (OASEmptyApiResponse) api.skipGoodsFeedbacksReaction(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASEmptyApiResponse.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASEmptyApiResponse.getExample();
        response = (OASEmptyApiResponse) api.skipGoodsFeedbacksReaction(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASEmptyApiResponse.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASEmptyApiResponse.getExample();
        response = (OASEmptyApiResponse) api.skipGoodsFeedbacksReaction(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASEmptyApiResponse.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASEmptyApiResponse.getExample();
        response = (OASEmptyApiResponse) api.skipGoodsFeedbacksReaction(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASEmptyApiResponse.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASEmptyApiResponse.getExample();
        response = (OASEmptyApiResponse) api.skipGoodsFeedbacksReaction(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASEmptyApiResponse.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASEmptyApiResponse.getExample();
        response = (OASEmptyApiResponse) api.skipGoodsFeedbacksReaction(params);
        System.assertEquals(expectedResponse, response);
    }

    /**
     * Перенос заказов в следующую отгрузку
     *
     * Переносит указанные заказы из указанной отгрузки в следующую отгрузку. [Что такое отгрузка?](https://yandex.ru/support/marketplace/orders/fbs/process.html#ship)\n\nИспользуйте этот запрос, если не успеваете собрать и упаковать заказы вовремя.\n\n{% note warning &quot;Такие переносы снижают индекс качества магазина&quot; %}\n\nЭтот запрос предназначен для исключительных случаев. Если вы будете переносить заказы слишком часто, магазин столкнется с ограничениями. [Что за ограничения?](https://yandex.ru/support/marketplace/quality/score/fbs.html)\n\n{% endnote %}\n\nПереносить заказы можно, если до формирования отгрузки осталось больше получаса.\n\nПеренос происходит не мгновенно, а занимает несколько минут.\n\n|**⚙️ Лимит:** 200 запросов в час|\n|-|\n
     */
    @isTest
    private static void transferOrdersFromShipmentTest() {
        HttpResponse res = new HttpResponse();
        res.setStatusCode(200);
        res.setStatus('OK');
        Test.setMock(HttpCalloutMock.class, new OASResponseMock(res));

        Map<String, Object> params = new Map<String, Object>{
            'campaignId' => 2147483648L,
            'shipmentId' => 2147483648L,
            'oaSTransferOrdersFromShipmentRequest' => ''
        };

        OASClient client;
        OASFbsApi api;
        OASEmptyApiResponse response;
        OASEmptyApiResponse expectedResponse;
        String js = '';

        client = new OASClient();
        api = new OASFbsApi(client);

        js = JSON.serialize(OASEmptyApiResponse.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASEmptyApiResponse.getExample();
        response = (OASEmptyApiResponse) api.transferOrdersFromShipment(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASEmptyApiResponse.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASEmptyApiResponse.getExample();
        response = (OASEmptyApiResponse) api.transferOrdersFromShipment(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASEmptyApiResponse.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASEmptyApiResponse.getExample();
        response = (OASEmptyApiResponse) api.transferOrdersFromShipment(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASEmptyApiResponse.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASEmptyApiResponse.getExample();
        response = (OASEmptyApiResponse) api.transferOrdersFromShipment(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASEmptyApiResponse.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASEmptyApiResponse.getExample();
        response = (OASEmptyApiResponse) api.transferOrdersFromShipment(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASEmptyApiResponse.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASEmptyApiResponse.getExample();
        response = (OASEmptyApiResponse) api.transferOrdersFromShipment(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASEmptyApiResponse.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASEmptyApiResponse.getExample();
        response = (OASEmptyApiResponse) api.transferOrdersFromShipment(params);
        System.assertEquals(expectedResponse, response);
    }

    /**
     * Установка цен на товары во всех магазинах
     *
     * Устанавливает [базовые цены](*default-price). Чтобы получить рекомендации Маркета, касающиеся цен, выполните запрос [POST businesses/{businessId}/offers/recommendations](../../reference/business-assortment/getOfferRecommendations.md).\n\n{% note info &quot;Данные в каталоге обновляются не мгновенно&quot; %}\n\nЭто занимает до нескольких минут.\n\n{% endnote %}\n\n|**⚙️ Лимит:** 5000 товаров в минуту, не более 500 товаров в одном запросе|\n|-|\n
     */
    @isTest
    private static void updateBusinessPricesTest() {
        HttpResponse res = new HttpResponse();
        res.setStatusCode(200);
        res.setStatus('OK');
        Test.setMock(HttpCalloutMock.class, new OASResponseMock(res));

        Map<String, Object> params = new Map<String, Object>{
            'businessId' => 2147483648L,
            'oaSUpdateBusinessPricesRequest' => ''
        };

        OASClient client;
        OASFbsApi api;
        OASEmptyApiResponse response;
        OASEmptyApiResponse expectedResponse;
        String js = '';

        client = new OASClient();
        api = new OASFbsApi(client);

        js = JSON.serialize(OASEmptyApiResponse.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASEmptyApiResponse.getExample();
        response = (OASEmptyApiResponse) api.updateBusinessPrices(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASEmptyApiResponse.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASEmptyApiResponse.getExample();
        response = (OASEmptyApiResponse) api.updateBusinessPrices(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASEmptyApiResponse.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASEmptyApiResponse.getExample();
        response = (OASEmptyApiResponse) api.updateBusinessPrices(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASEmptyApiResponse.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASEmptyApiResponse.getExample();
        response = (OASEmptyApiResponse) api.updateBusinessPrices(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASEmptyApiResponse.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASEmptyApiResponse.getExample();
        response = (OASEmptyApiResponse) api.updateBusinessPrices(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASEmptyApiResponse.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASEmptyApiResponse.getExample();
        response = (OASEmptyApiResponse) api.updateBusinessPrices(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASEmptyApiResponse.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASEmptyApiResponse.getExample();
        response = (OASEmptyApiResponse) api.updateBusinessPrices(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASEmptyApiResponse.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASEmptyApiResponse.getExample();
        response = (OASEmptyApiResponse) api.updateBusinessPrices(params);
        System.assertEquals(expectedResponse, response);
    }

    /**
     * Изменение условий продажи товаров в магазине
     *
     * Изменяет параметры продажи товаров в конкретном магазине: доступность товара, условия доставки и самовывоза, применяемую ставку НДС.\n\n|**⚙️ Лимит:** 5000 товаров в минуту|\n|-|\n
     */
    @isTest
    private static void updateCampaignOffersTest() {
        HttpResponse res = new HttpResponse();
        res.setStatusCode(200);
        res.setStatus('OK');
        Test.setMock(HttpCalloutMock.class, new OASResponseMock(res));

        Map<String, Object> params = new Map<String, Object>{
            'campaignId' => 2147483648L,
            'oaSUpdateCampaignOffersRequest' => ''
        };

        OASClient client;
        OASFbsApi api;
        OASEmptyApiResponse response;
        OASEmptyApiResponse expectedResponse;
        String js = '';

        client = new OASClient();
        api = new OASFbsApi(client);

        js = JSON.serialize(OASEmptyApiResponse.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASEmptyApiResponse.getExample();
        response = (OASEmptyApiResponse) api.updateCampaignOffers(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASEmptyApiResponse.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASEmptyApiResponse.getExample();
        response = (OASEmptyApiResponse) api.updateCampaignOffers(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASEmptyApiResponse.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASEmptyApiResponse.getExample();
        response = (OASEmptyApiResponse) api.updateCampaignOffers(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASEmptyApiResponse.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASEmptyApiResponse.getExample();
        response = (OASEmptyApiResponse) api.updateCampaignOffers(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASEmptyApiResponse.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASEmptyApiResponse.getExample();
        response = (OASEmptyApiResponse) api.updateCampaignOffers(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASEmptyApiResponse.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASEmptyApiResponse.getExample();
        response = (OASEmptyApiResponse) api.updateCampaignOffers(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASEmptyApiResponse.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASEmptyApiResponse.getExample();
        response = (OASEmptyApiResponse) api.updateCampaignOffers(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASEmptyApiResponse.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASEmptyApiResponse.getExample();
        response = (OASEmptyApiResponse) api.updateCampaignOffers(params);
        System.assertEquals(expectedResponse, response);
    }

    /**
     * Добавление нового или изменение созданного комментария
     *
     * Добавляет новый комментарий магазина или изменяет комментарий, который магазин оставлял ранее.\n\nДля создания комментария к отзыву передайте только идентификатор отзыва &#x60;feedbackId&#x60;.\n\nЧтобы добавить комментарий к другому комментарию, передайте:\n\n* &#x60;feedbackId&#x60; — идентификатор отзыва;\n* &#x60;comment.parentId&#x60; — идентификатор родительского комментария.\n\nЧтобы изменить комментарий, передайте:\n\n* &#x60;feedbackId&#x60;— идентификатор отзыва;\n* &#x60;comment.id&#x60; — идентификатор комментария, который нужно изменить.\n\nЕсли передать одновременно &#x60;comment.parentId&#x60; и &#x60;comment.id&#x60;, будет изменен существующий комментарий.\n\n|**⚙️ Лимит:** 1 000 запросов в час|\n|-|\n
     */
    @isTest
    private static void updateGoodsFeedbackCommentTest() {
        HttpResponse res = new HttpResponse();
        res.setStatusCode(200);
        res.setStatus('OK');
        Test.setMock(HttpCalloutMock.class, new OASResponseMock(res));

        Map<String, Object> params = new Map<String, Object>{
            'businessId' => 2147483648L,
            'oaSUpdateGoodsFeedbackCommentRequest' => ''
        };

        OASClient client;
        OASFbsApi api;
        OASUpdateGoodsFeedbackCommentRespons response;
        OASUpdateGoodsFeedbackCommentRespons expectedResponse;
        String js = '';

        client = new OASClient();
        api = new OASFbsApi(client);

        js = JSON.serialize(OASUpdateGoodsFeedbackCommentRespons.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASUpdateGoodsFeedbackCommentRespons.getExample();
        response = (OASUpdateGoodsFeedbackCommentRespons) api.updateGoodsFeedbackComment(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASUpdateGoodsFeedbackCommentRespons.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASUpdateGoodsFeedbackCommentRespons.getExample();
        response = (OASUpdateGoodsFeedbackCommentRespons) api.updateGoodsFeedbackComment(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASUpdateGoodsFeedbackCommentRespons.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASUpdateGoodsFeedbackCommentRespons.getExample();
        response = (OASUpdateGoodsFeedbackCommentRespons) api.updateGoodsFeedbackComment(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASUpdateGoodsFeedbackCommentRespons.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASUpdateGoodsFeedbackCommentRespons.getExample();
        response = (OASUpdateGoodsFeedbackCommentRespons) api.updateGoodsFeedbackComment(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASUpdateGoodsFeedbackCommentRespons.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASUpdateGoodsFeedbackCommentRespons.getExample();
        response = (OASUpdateGoodsFeedbackCommentRespons) api.updateGoodsFeedbackComment(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASUpdateGoodsFeedbackCommentRespons.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASUpdateGoodsFeedbackCommentRespons.getExample();
        response = (OASUpdateGoodsFeedbackCommentRespons) api.updateGoodsFeedbackComment(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASUpdateGoodsFeedbackCommentRespons.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASUpdateGoodsFeedbackCommentRespons.getExample();
        response = (OASUpdateGoodsFeedbackCommentRespons) api.updateGoodsFeedbackComment(params);
        System.assertEquals(expectedResponse, response);
    }

    /**
     * Редактирование категорийных характеристик товара
     *
     * Редактирует характеристики товара, которые специфичны для категории, к которой он относится.\n\n{% note warning &quot;Здесь только то, что относится к конкретной категории&quot; %}\n\nЕсли вам нужно изменить основные параметры товара (название, описание, изображения, видео, производитель, штрихкод), воспользуйтесь запросом [POST businesses/{businessId}/offer-mappings/update](../../reference/business-assortment/updateOfferMappings.md).\n\n{% endnote %}\n\nЧтобы удалить характеристики, которые заданы в параметрах с типом &#x60;string&#x60;, передайте пустое значение.\n\n{% note info &quot;Данные в каталоге обновляются не мгновенно&quot; %}\n\nЭто занимает до нескольких минут.\n\n{% endnote %}\n\n|**⚙️ Лимит:** 5000 товаров в минуту|\n|-|\n
     */
    @isTest
    private static void updateOfferContentTest() {
        HttpResponse res = new HttpResponse();
        res.setStatusCode(200);
        res.setStatus('OK');
        Test.setMock(HttpCalloutMock.class, new OASResponseMock(res));

        Map<String, Object> params = new Map<String, Object>{
            'businessId' => 2147483648L,
            'oaSUpdateOfferContentRequest' => ''
        };

        OASClient client;
        OASFbsApi api;
        OASUpdateOfferContentResponse response;
        OASUpdateOfferContentResponse expectedResponse;
        String js = '';

        client = new OASClient();
        api = new OASFbsApi(client);

        js = JSON.serialize(OASUpdateOfferContentResponse.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASUpdateOfferContentResponse.getExample();
        response = (OASUpdateOfferContentResponse) api.updateOfferContent(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASUpdateOfferContentResponse.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASUpdateOfferContentResponse.getExample();
        response = (OASUpdateOfferContentResponse) api.updateOfferContent(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASUpdateOfferContentResponse.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASUpdateOfferContentResponse.getExample();
        response = (OASUpdateOfferContentResponse) api.updateOfferContent(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASUpdateOfferContentResponse.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASUpdateOfferContentResponse.getExample();
        response = (OASUpdateOfferContentResponse) api.updateOfferContent(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASUpdateOfferContentResponse.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASUpdateOfferContentResponse.getExample();
        response = (OASUpdateOfferContentResponse) api.updateOfferContent(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASUpdateOfferContentResponse.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASUpdateOfferContentResponse.getExample();
        response = (OASUpdateOfferContentResponse) api.updateOfferContent(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASUpdateOfferContentResponse.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASUpdateOfferContentResponse.getExample();
        response = (OASUpdateOfferContentResponse) api.updateOfferContent(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASUpdateOfferContentResponse.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASUpdateOfferContentResponse.getExample();
        response = (OASUpdateOfferContentResponse) api.updateOfferContent(params);
        System.assertEquals(expectedResponse, response);
    }

    /**
     * Добавление и редактирование товаров в каталоге
     *
     * {% note warning &quot;&quot; %}\n\nЭтот метод устарел. Вместо него используйте [POST businesses/{businessId}/offer-mappings/update](../../reference/business-assortment/updateOfferMappings.md).\n\n{% endnote %}\n\nДобавляет товары, указанные в запросе, в ваш каталог товаров и редактирует уже имеющиеся товары.\n\nИнформацию о товарах нужно передать в теле POST-запроса.\n\nУ каждого товара должен быть ваш SKU — уникальный код, который вы используете для идентификации товара:\n\n* Чтобы добавить в каталог новый товар, укажите в параметре &#x60;shopSku&#x60; ваш SKU, которого еще нет в каталоге.\n* Чтобы отредактировать товар из каталога, укажите в параметре &#x60;shopSku&#x60; ваш SKU этого товара в каталоге.\n\nВ обоих случаях в запросе нужно передать полное описание товара, даже если вы хотите изменить только несколько характеристик.\n\nЕсли вы знаете, какой карточке товара на Маркете соответствует ваш товар, укажите ее идентификатор (SKU на Маркете) во входном параметре mapping. Получить SKU на Маркете рекомендованной карточки товара можно с помощью запроса [POST campaigns/{campaignId}/offer-mapping-entries/suggestions](../../reference/offer-mappings/getSuggestedOfferMappingEntries.md) или через кабинет. Если SKU на Маркете не указан, сотрудники Маркета сами подберут или создадут подходящую карточку товара, либо у него появится статус &#x60;NEED_CONTENT&#x60; (нужно найти карточку или создать ее самостоятельно) в выходных данных запроса [GET campaigns/{campaignId}/offer-mapping-entries](../../reference/offer-mappings/getOfferMappingEntries.md).\n\nПеред публикацией товары проходят модерацию. Если в одном из отправленных товаров найдена ошибка, ответ на запрос будет иметь HTTP-код 400 Bad Request, и ни один из товаров не отправится на модерацию. При этом если вы не передадите все обязательные параметры для какого‑либо товара, после модерации у него появится статус &#x60;NEED_INFO&#x60; (в описании товара не хватает информации) в выходных данных запроса [GET campaigns/{campaignId}/offer-mapping-entries](../../reference/offer-mappings/getOfferMappingEntries.md).\n\nВ одном запросе можно добавить не более 500 товаров.\n\n{% note info &quot;Данные в каталоге обновляются не мгновенно&quot; %}\n\nЭто занимает до нескольких минут.\n\n{% endnote %}\n\n|**⚙️ Лимит:** 5 000 товаров в минуту|\n|-|\n
     */
    @isTest
    private static void updateOfferMappingEntriesTest() {
        HttpResponse res = new HttpResponse();
        res.setStatusCode(200);
        res.setStatus('OK');
        Test.setMock(HttpCalloutMock.class, new OASResponseMock(res));

        Map<String, Object> params = new Map<String, Object>{
            'campaignId' => 2147483648L,
            'oaSUpdateOfferMappingEntryRequest' => ''
        };

        OASClient client;
        OASFbsApi api;
        OASEmptyApiResponse response;
        OASEmptyApiResponse expectedResponse;
        String js = '';

        client = new OASClient();
        api = new OASFbsApi(client);

        js = JSON.serialize(OASEmptyApiResponse.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASEmptyApiResponse.getExample();
        response = (OASEmptyApiResponse) api.updateOfferMappingEntries(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASEmptyApiResponse.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASEmptyApiResponse.getExample();
        response = (OASEmptyApiResponse) api.updateOfferMappingEntries(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASEmptyApiResponse.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASEmptyApiResponse.getExample();
        response = (OASEmptyApiResponse) api.updateOfferMappingEntries(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASEmptyApiResponse.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASEmptyApiResponse.getExample();
        response = (OASEmptyApiResponse) api.updateOfferMappingEntries(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASEmptyApiResponse.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASEmptyApiResponse.getExample();
        response = (OASEmptyApiResponse) api.updateOfferMappingEntries(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASEmptyApiResponse.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASEmptyApiResponse.getExample();
        response = (OASEmptyApiResponse) api.updateOfferMappingEntries(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASEmptyApiResponse.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASEmptyApiResponse.getExample();
        response = (OASEmptyApiResponse) api.updateOfferMappingEntries(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASEmptyApiResponse.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASEmptyApiResponse.getExample();
        response = (OASEmptyApiResponse) api.updateOfferMappingEntries(params);
        System.assertEquals(expectedResponse, response);
    }

    /**
     * Добавление товаров в каталог и изменение информации о них
     *
     * Добавляет товары в каталог, передает их категории на Маркете и характеристики, необходимые для этих категории. Также редактирует информацию об уже имеющихся товарах.\n\nСписок категорий Маркета можно получить с помощью запроса [POST categories/tree](../../reference/categories/getCategoriesTree.md), а характеристики товаров по категориям с помощью [POST category/{categoryId}/parameters](../../reference/content/getCategoryContentParameters.md).\n\nЧтобы **добавить новый товар**, передайте его с новым идентификатором, который раньше никогда не использовался в каталоге. Старайтесь сразу передать как можно больше информации — она потребуется Маркету для подбора подходящей карточки или создания новой. Если известно, какой карточке на Маркете соответствует товар, можно сразу указать идентификатор этой карточки (**SKU на Маркете**) в поле &#x60;marketSKU&#x60;.\n\nДля **новых товаров** обязательно укажите параметры: &#x60;offerId&#x60;, &#x60;name&#x60;, &#x60;marketCategoryId&#x60; или &#x60;category&#x60;, &#x60;pictures&#x60;, &#x60;vendor&#x60;, &#x60;description&#x60;.\n\nЧтобы **отредактировать информацию о товаре**, передайте новые данные, указав в &#x60;offerId&#x60; соответствующий **ваш SKU**. Поля, в которых ничего не меняется, можно не передавать.\n\nЧтобы **удалить характеристики**, которые заданы в параметрах с типом &#x60;string&#x60;, передайте пустое значение.\n\nПараметр &#x60;offerId&#x60; должен быть **уникальным** для всех товаров, которые вы передаете.\n\n{% note warning &quot;Правила использования SKU&quot; %}\n\n* У каждого товара SKU должен быть свой.\n\n* SKU товара нельзя менять — можно только удалить товар и добавить заново с новым SKU.\n\n* Уже заданный SKU нельзя освободить и использовать заново для другого товара. Каждый товар должен получать новый идентификатор, до того никогда не использовавшийся в вашем каталоге.\n\n{% endnote %}\n\n{% note info &quot;Данные в каталоге обновляются не мгновенно&quot; %}\n\nЭто занимает до нескольких минут.\n\n{% endnote %}\n\n|**⚙️ Лимит:** 5000 товаров в минуту, не более 500 товаров в одном запросе|\n|-|\n
     */
    @isTest
    private static void updateOfferMappingsTest() {
        HttpResponse res = new HttpResponse();
        res.setStatusCode(200);
        res.setStatus('OK');
        Test.setMock(HttpCalloutMock.class, new OASResponseMock(res));

        Map<String, Object> params = new Map<String, Object>{
            'businessId' => 2147483648L,
            'oaSUpdateOfferMappingsRequest' => ''
        };

        OASClient client;
        OASFbsApi api;
        OASUpdateOfferMappingsResponse response;
        OASUpdateOfferMappingsResponse expectedResponse;
        String js = '';

        client = new OASClient();
        api = new OASFbsApi(client);

        js = JSON.serialize(OASUpdateOfferMappingsResponse.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASUpdateOfferMappingsResponse.getExample();
        response = (OASUpdateOfferMappingsResponse) api.updateOfferMappings(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASUpdateOfferMappingsResponse.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASUpdateOfferMappingsResponse.getExample();
        response = (OASUpdateOfferMappingsResponse) api.updateOfferMappings(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASUpdateOfferMappingsResponse.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASUpdateOfferMappingsResponse.getExample();
        response = (OASUpdateOfferMappingsResponse) api.updateOfferMappings(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASUpdateOfferMappingsResponse.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASUpdateOfferMappingsResponse.getExample();
        response = (OASUpdateOfferMappingsResponse) api.updateOfferMappings(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASUpdateOfferMappingsResponse.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASUpdateOfferMappingsResponse.getExample();
        response = (OASUpdateOfferMappingsResponse) api.updateOfferMappings(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASUpdateOfferMappingsResponse.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASUpdateOfferMappingsResponse.getExample();
        response = (OASUpdateOfferMappingsResponse) api.updateOfferMappings(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASUpdateOfferMappingsResponse.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASUpdateOfferMappingsResponse.getExample();
        response = (OASUpdateOfferMappingsResponse) api.updateOfferMappings(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASUpdateOfferMappingsResponse.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASUpdateOfferMappingsResponse.getExample();
        response = (OASUpdateOfferMappingsResponse) api.updateOfferMappings(params);
        System.assertEquals(expectedResponse, response);
    }

    /**
     * Удаление товара из заказа или уменьшение числа единиц
     *
     * {% note warning &quot;Этот запрос только для DBS&quot; %}\n\nЕсли вы работаете по модели FBS, пользуйтесь [PUT campaigns/{campaignId}/orders/{orderId}/boxes](../../reference/orders/setOrderBoxLayout.md).\n\n{% endnote %}\n\nИзменяет состав заказа, если позволяет выбранная служба доставки, в случаях:\n\n* покупатель уменьшил количество товара;\n* магазин не может поставить все товары в заказе.\n\nДля этого заказ должен находится в статусе &#x60;&quot;status&quot;: &quot;PROCESSING&quot;&#x60; этапа обработки &#x60;&quot;substatus&quot;: &quot;STARTED&quot;&#x60;. После передачи статуса &#x60;&quot;substatus&quot;: &quot;READY_TO_SHIP&quot;&#x60; изменить состав невозможно.\n\nЕсли одинаковых товаров несколько, для уменьшения количества передайте обновленное значение в атрибуте &#x60;count&#x60; параметра &#x60;item&#x60;.\n\nЧтобы полностью удалить товар из заказа:\n\n* передайте значение &#x60;0&#x60;; или\n* не передавайте параметр &#x60;item&#x60;.\n\nНельзя удалить или уменьшить количество товара, если он:\n\n* добавлен по акции;\n* составляет 99% стоимости заказа;\n* единственный товар в заказе.\n\nЕсли необходимо удалить такой товар, отмените заказ. Для этого отправьте запрос методом [PUT campaigns/{campaignId}/orders/{orderId}/status](../../reference/orders/updateOrderStatus.md) и передайте статус заказа &#x60;CANCELLED&#x60; с причиной отмены &#x60;SHOP_FAILED&#x60;.\n\n{% note info &quot;Увеличить заказ нельзя&quot; %}\n\nС помощью запроса нельзя увеличить количество одинаковых товаров, добавить новые товары в заказ или заменить один товар другим.\n\n{% endnote %}\n\n**Возврат денег покупателю**\n\nЕсли покупатель оплатил товар при оформлении, Маркет вернет ему деньги за удаленные из заказа товары в течение двух дней:\n\n* при оплате банковской картой — с момента, когда магазин переведет заказ в статус &#x60;SHIPPED&#x60;;\n\n* при оплате через Apple Pay или Google Pay — с момента, когда магазин удалит товар из заказа.\n\n|**⚙️ Лимит:** 1 000 000 запросов в час|\n|-|\n
     */
    @isTest
    private static void updateOrderItemsTest() {
        HttpResponse res = new HttpResponse();
        res.setStatusCode(200);
        res.setStatus('OK');
        Test.setMock(HttpCalloutMock.class, new OASResponseMock(res));

        Map<String, Object> params = new Map<String, Object>{
            'campaignId' => 2147483648L,
            'orderId' => 2147483648L,
            'oaSUpdateOrderItemRequest' => ''
        };

        OASClient client;
        OASFbsApi api;
        String js = '';

        client = new OASClient();
        api = new OASFbsApi(client);

        js = JSON.serialize();
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = ;
        response = () api.updateOrderItems(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize();
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = ;
        response = () api.updateOrderItems(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize();
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = ;
        response = () api.updateOrderItems(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize();
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = ;
        response = () api.updateOrderItems(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize();
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = ;
        response = () api.updateOrderItems(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize();
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = ;
        response = () api.updateOrderItems(params);
        System.assertEquals(expectedResponse, response);
    }

    /**
     * Изменение статуса одного заказа
     *
     * Изменяет статус заказа. Возможные изменения статусов:\n\n* Если магазин подтвердил и подготовил заказ к отправке, то заказ из статуса &#x60;&quot;status&quot;: &quot;PROCESSING&quot;&#x60; и этапа обработки &#x60;&quot;substatus&quot;: &quot;STARTED&quot;&#x60; нужно перевести в статус &#x60;&quot;status&quot;: &quot;PROCESSING&quot;&#x60; и этап обработки &#x60;&quot;substatus&quot;: &quot;READY_TO_SHIP&quot;&#x60;.\n* Если магазин подтвердил заказ, но не может его выполнить (например, товар числится в базе, но отсутствует на складе или нет нужного цвета), то заказ из статуса &#x60;&quot;status&quot;: &quot;PROCESSING&quot;&#x60; и этапа обработки &#x60;&quot;substatus&quot;: &quot;STARTED&quot;&#x60; нужно перевести в статус &#x60;&quot;status&quot;: &quot;CANCELLED&quot;&#x60; с причиной отмены заказа &#x60;&quot;substatus&quot;: &quot;SHOP_FAILED&quot;&#x60;.\n* Если магазин подготовил заказ к отгрузке, но не может его выполнить (например, последний товар был поврежден или оказался с браком), то заказ из статуса &#x60;&quot;status&quot;: &quot;PROCESSING&quot;&#x60; и этапа обработки &#x60;&quot;substatus&quot;: &quot;READY_TO_SHIP&quot;&#x60; нужно перевести в статус &#x60;&quot;status&quot;: &quot;CANCELLED&quot;&#x60; с причиной отмены заказа &#x60;&quot;substatus&quot;: &quot;SHOP_FAILED&quot;&#x60;.\n\n|**⚙️ Лимит:** 1 000 000 запросов в час|\n|-|\n
     */
    @isTest
    private static void updateOrderStatusTest() {
        HttpResponse res = new HttpResponse();
        res.setStatusCode(200);
        res.setStatus('OK');
        Test.setMock(HttpCalloutMock.class, new OASResponseMock(res));

        Map<String, Object> params = new Map<String, Object>{
            'campaignId' => 2147483648L,
            'orderId' => 2147483648L,
            'oaSUpdateOrderStatusRequest' => ''
        };

        OASClient client;
        OASFbsApi api;
        OASUpdateOrderStatusResponse response;
        OASUpdateOrderStatusResponse expectedResponse;
        String js = '';

        client = new OASClient();
        api = new OASFbsApi(client);

        js = JSON.serialize(OASUpdateOrderStatusResponse.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASUpdateOrderStatusResponse.getExample();
        response = (OASUpdateOrderStatusResponse) api.updateOrderStatus(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASUpdateOrderStatusResponse.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASUpdateOrderStatusResponse.getExample();
        response = (OASUpdateOrderStatusResponse) api.updateOrderStatus(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASUpdateOrderStatusResponse.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASUpdateOrderStatusResponse.getExample();
        response = (OASUpdateOrderStatusResponse) api.updateOrderStatus(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASUpdateOrderStatusResponse.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASUpdateOrderStatusResponse.getExample();
        response = (OASUpdateOrderStatusResponse) api.updateOrderStatus(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASUpdateOrderStatusResponse.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASUpdateOrderStatusResponse.getExample();
        response = (OASUpdateOrderStatusResponse) api.updateOrderStatus(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASUpdateOrderStatusResponse.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASUpdateOrderStatusResponse.getExample();
        response = (OASUpdateOrderStatusResponse) api.updateOrderStatus(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASUpdateOrderStatusResponse.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASUpdateOrderStatusResponse.getExample();
        response = (OASUpdateOrderStatusResponse) api.updateOrderStatus(params);
        System.assertEquals(expectedResponse, response);
    }

    /**
     * Изменение статусов нескольких заказов
     *
     * Изменяет статусы нескольких заказов.\n\nВозможные изменения статусов:\n\n* Если магазин подтвердил и подготовил заказ к отправке, то заказ из статуса &#x60;&quot;status&quot;: &quot;PROCESSING&quot;&#x60;и этапа обработки &#x60;&quot;substatus&quot;: &quot;STARTED&quot;&#x60; нужно перевести в статус &#x60;&quot;status&quot;: &quot;PROCESSING&quot;&#x60; и этап обработки &#x60;&quot;substatus&quot;: &quot;READY_TO_SHIP&quot;&#x60;.\n* Если магазин подтвердил заказ, но не может его выполнить (например, товар числится в базе, но отсутствует на складе или нет нужного цвета), то заказ из статуса &#x60;&quot;status&quot;: &quot;PROCESSING&quot;&#x60; и этапа обработки &#x60;&quot;substatus&quot;: &quot;STARTED&quot;&#x60; нужно перевести в статус &#x60;&quot;status&quot;: &quot;CANCELLED&quot;&#x60; с причиной отмены заказа &#x60;&quot;substatus&quot;: &quot;SHOP_FAILED&quot;&#x60;.\n* Если магазин подготовил заказ к отгрузке, но не может его выполнить (например, последний товар был поврежден или оказался с браком), то заказ из статуса &#x60;&quot;status&quot;: &quot;PROCESSING&quot;&#x60; и этапа обработки &#x60;&quot;substatus&quot;: &quot;READY_TO_SHIP&quot;&#x60; нужно перевести в статус &#x60;&quot;status&quot;: &quot;CANCELLED&quot;&#x60; с причиной отмены заказа &#x60;&quot;substatus&quot;: &quot;SHOP_FAILED&quot;&#x60;.\n\nМаксимальное количество заказов, у которых можно изменить статус в одном запросе, — 30.\n\n|**⚙️ Лимит:** 1 000 000 запросов в час|\n|-|\n
     */
    @isTest
    private static void updateOrderStatusesTest() {
        HttpResponse res = new HttpResponse();
        res.setStatusCode(200);
        res.setStatus('OK');
        Test.setMock(HttpCalloutMock.class, new OASResponseMock(res));

        Map<String, Object> params = new Map<String, Object>{
            'campaignId' => 2147483648L,
            'oaSUpdateOrderStatusesRequest' => ''
        };

        OASClient client;
        OASFbsApi api;
        OASUpdateOrderStatusesResponse response;
        OASUpdateOrderStatusesResponse expectedResponse;
        String js = '';

        client = new OASClient();
        api = new OASFbsApi(client);

        js = JSON.serialize(OASUpdateOrderStatusesResponse.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASUpdateOrderStatusesResponse.getExample();
        response = (OASUpdateOrderStatusesResponse) api.updateOrderStatuses(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASUpdateOrderStatusesResponse.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASUpdateOrderStatusesResponse.getExample();
        response = (OASUpdateOrderStatusesResponse) api.updateOrderStatuses(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASUpdateOrderStatusesResponse.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASUpdateOrderStatusesResponse.getExample();
        response = (OASUpdateOrderStatusesResponse) api.updateOrderStatuses(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASUpdateOrderStatusesResponse.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASUpdateOrderStatusesResponse.getExample();
        response = (OASUpdateOrderStatusesResponse) api.updateOrderStatuses(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASUpdateOrderStatusesResponse.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASUpdateOrderStatusesResponse.getExample();
        response = (OASUpdateOrderStatusesResponse) api.updateOrderStatuses(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASUpdateOrderStatusesResponse.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASUpdateOrderStatusesResponse.getExample();
        response = (OASUpdateOrderStatusesResponse) api.updateOrderStatuses(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASUpdateOrderStatusesResponse.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASUpdateOrderStatusesResponse.getExample();
        response = (OASUpdateOrderStatusesResponse) api.updateOrderStatuses(params);
        System.assertEquals(expectedResponse, response);
    }

    /**
     * Установка цен на товары в конкретном магазине
     *
     * Устанавливает цены на товары в магазине. Чтобы получить рекомендации Маркета, касающиеся цен, выполните запрос [POST businesses/{businessId}/offers/recommendations](../../reference/business-assortment/getOfferRecommendations.md).\n\n{% note warning &quot;Метод только для отдельных магазинов&quot; %}\n\nИспользуйте этот метод, только если в кабинете установлены уникальные цены в отдельных магазинах.\n\nДля управления базовыми ценами используйте [POST businesses/{businessId}/offer-prices/updates](../../reference/business-assortment/updateBusinessPrices.md).\n\n{% endnote %}\n\n{% note info &quot;Данные в каталоге обновляются не мгновенно&quot; %}\n\nЭто занимает до нескольких минут.\n\n{% endnote %}\n\n|**⚙️ Лимит:** 5000 товаров в минуту|\n|-|\n
     */
    @isTest
    private static void updatePricesTest() {
        HttpResponse res = new HttpResponse();
        res.setStatusCode(200);
        res.setStatus('OK');
        Test.setMock(HttpCalloutMock.class, new OASResponseMock(res));

        Map<String, Object> params = new Map<String, Object>{
            'campaignId' => 2147483648L,
            'oaSUpdatePricesRequest' => ''
        };

        OASClient client;
        OASFbsApi api;
        OASEmptyApiResponse response;
        OASEmptyApiResponse expectedResponse;
        String js = '';

        client = new OASClient();
        api = new OASFbsApi(client);

        js = JSON.serialize(OASEmptyApiResponse.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASEmptyApiResponse.getExample();
        response = (OASEmptyApiResponse) api.updatePrices(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASEmptyApiResponse.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASEmptyApiResponse.getExample();
        response = (OASEmptyApiResponse) api.updatePrices(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASEmptyApiResponse.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASEmptyApiResponse.getExample();
        response = (OASEmptyApiResponse) api.updatePrices(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASEmptyApiResponse.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASEmptyApiResponse.getExample();
        response = (OASEmptyApiResponse) api.updatePrices(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASEmptyApiResponse.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASEmptyApiResponse.getExample();
        response = (OASEmptyApiResponse) api.updatePrices(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASEmptyApiResponse.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASEmptyApiResponse.getExample();
        response = (OASEmptyApiResponse) api.updatePrices(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASEmptyApiResponse.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASEmptyApiResponse.getExample();
        response = (OASEmptyApiResponse) api.updatePrices(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASEmptyApiResponse.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASEmptyApiResponse.getExample();
        response = (OASEmptyApiResponse) api.updatePrices(params);
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
        OASFbsApi api;
        OASUpdatePromoOffersResponse response;
        OASUpdatePromoOffersResponse expectedResponse;
        String js = '';

        client = new OASClient();
        api = new OASFbsApi(client);

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

    /**
     * Передача информации об остатках
     *
     * Передает данные об остатках товаров на витрине.\n\nОбязательно указывайте SKU **в точности** так, как он указан в каталоге. Например, _557722_ и _0557722_ — это два разных SKU.\n\n{% note info &quot;Данные в каталоге обновляются не мгновенно&quot; %}\n\nЭто занимает до нескольких минут.\n\n{% endnote %}\n\n|**⚙️ Лимит:** 100 000 товаров в минуту|\n|-|\n
     */
    @isTest
    private static void updateStocksTest() {
        HttpResponse res = new HttpResponse();
        res.setStatusCode(200);
        res.setStatus('OK');
        Test.setMock(HttpCalloutMock.class, new OASResponseMock(res));

        Map<String, Object> params = new Map<String, Object>{
            'campaignId' => 2147483648L,
            'oaSUpdateStocksRequest' => ''
        };

        OASClient client;
        OASFbsApi api;
        OASEmptyApiResponse response;
        OASEmptyApiResponse expectedResponse;
        String js = '';

        client = new OASClient();
        api = new OASFbsApi(client);

        js = JSON.serialize(OASEmptyApiResponse.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASEmptyApiResponse.getExample();
        response = (OASEmptyApiResponse) api.updateStocks(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASEmptyApiResponse.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASEmptyApiResponse.getExample();
        response = (OASEmptyApiResponse) api.updateStocks(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASEmptyApiResponse.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASEmptyApiResponse.getExample();
        response = (OASEmptyApiResponse) api.updateStocks(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASEmptyApiResponse.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASEmptyApiResponse.getExample();
        response = (OASEmptyApiResponse) api.updateStocks(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASEmptyApiResponse.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASEmptyApiResponse.getExample();
        response = (OASEmptyApiResponse) api.updateStocks(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASEmptyApiResponse.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASEmptyApiResponse.getExample();
        response = (OASEmptyApiResponse) api.updateStocks(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASEmptyApiResponse.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASEmptyApiResponse.getExample();
        response = (OASEmptyApiResponse) api.updateStocks(params);
        System.assertEquals(expectedResponse, response);
    }
}