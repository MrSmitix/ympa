@isTest
private class OASReportsApiTest {
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
        OASReportsApi api;
        OASGenerateReportResponse response;
        OASGenerateReportResponse expectedResponse;
        String js = '';

        client = new OASClient();
        api = new OASReportsApi(client);

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
        OASReportsApi api;
        OASGenerateReportResponse response;
        OASGenerateReportResponse expectedResponse;
        String js = '';

        client = new OASClient();
        api = new OASReportsApi(client);

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
        OASReportsApi api;
        OASGenerateReportResponse response;
        OASGenerateReportResponse expectedResponse;
        String js = '';

        client = new OASClient();
        api = new OASReportsApi(client);

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
     * Отчет по движению товаров
     *
     * Запускает генерацию **отчета по движению товаров**. [Что это за отчет](https://yandex.ru/support/marketplace/analytics/reports-fby-fbs.html#flow)\n\nУзнать статус генерации и получить ссылку на готовый отчет можно с помощью запроса [GET reports/info/{reportId}](../../reference/reports/getReportInfo.md).\n\n|**⚙️ Лимит:** 100 запросов в час|\n|-|\n
     */
    @isTest
    private static void generateGoodsMovementReportTest() {
        HttpResponse res = new HttpResponse();
        res.setStatusCode(200);
        res.setStatus('OK');
        Test.setMock(HttpCalloutMock.class, new OASResponseMock(res));

        Map<String, Object> params = new Map<String, Object>{
            'oaSGenerateGoodsMovementReportReques' => '',
            'format' => ''
        };

        OASClient client;
        OASReportsApi api;
        OASGenerateReportResponse response;
        OASGenerateReportResponse expectedResponse;
        String js = '';

        client = new OASClient();
        api = new OASReportsApi(client);

        js = JSON.serialize(OASGenerateReportResponse.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASGenerateReportResponse.getExample();
        response = (OASGenerateReportResponse) api.generateGoodsMovementReport(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASGenerateReportResponse.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASGenerateReportResponse.getExample();
        response = (OASGenerateReportResponse) api.generateGoodsMovementReport(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASGenerateReportResponse.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASGenerateReportResponse.getExample();
        response = (OASGenerateReportResponse) api.generateGoodsMovementReport(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASGenerateReportResponse.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASGenerateReportResponse.getExample();
        response = (OASGenerateReportResponse) api.generateGoodsMovementReport(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASGenerateReportResponse.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASGenerateReportResponse.getExample();
        response = (OASGenerateReportResponse) api.generateGoodsMovementReport(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASGenerateReportResponse.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASGenerateReportResponse.getExample();
        response = (OASGenerateReportResponse) api.generateGoodsMovementReport(params);
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
        OASReportsApi api;
        OASGenerateReportResponse response;
        OASGenerateReportResponse expectedResponse;
        String js = '';

        client = new OASClient();
        api = new OASReportsApi(client);

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
     * Отчет по оборачиваемости
     *
     * Запускает генерацию **отчета по оборачиваемости** за заданную дату.  [Что это за отчет](https://yandex.ru/support/marketplace/analytics/turnover.html)\n\nУзнать статус генерации и получить ссылку на готовый отчет можно с помощью запроса [GET reports/info/{reportId}](../../reference/reports/getReportInfo.md).\n\n|**⚙️ Лимит:** 100 запросов в час|\n|-|\n
     */
    @isTest
    private static void generateGoodsTurnoverReportTest() {
        HttpResponse res = new HttpResponse();
        res.setStatusCode(200);
        res.setStatus('OK');
        Test.setMock(HttpCalloutMock.class, new OASResponseMock(res));

        Map<String, Object> params = new Map<String, Object>{
            'oaSGenerateGoodsTurnoverRequest' => '',
            'format' => ''
        };

        OASClient client;
        OASReportsApi api;
        OASGenerateReportResponse response;
        OASGenerateReportResponse expectedResponse;
        String js = '';

        client = new OASClient();
        api = new OASReportsApi(client);

        js = JSON.serialize(OASGenerateReportResponse.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASGenerateReportResponse.getExample();
        response = (OASGenerateReportResponse) api.generateGoodsTurnoverReport(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASGenerateReportResponse.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASGenerateReportResponse.getExample();
        response = (OASGenerateReportResponse) api.generateGoodsTurnoverReport(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASGenerateReportResponse.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASGenerateReportResponse.getExample();
        response = (OASGenerateReportResponse) api.generateGoodsTurnoverReport(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASGenerateReportResponse.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASGenerateReportResponse.getExample();
        response = (OASGenerateReportResponse) api.generateGoodsTurnoverReport(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASGenerateReportResponse.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASGenerateReportResponse.getExample();
        response = (OASGenerateReportResponse) api.generateGoodsTurnoverReport(params);
        System.assertEquals(expectedResponse, response);


        js = JSON.serialize(OASGenerateReportResponse.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASGenerateReportResponse.getExample();
        response = (OASGenerateReportResponse) api.generateGoodsTurnoverReport(params);
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
        OASReportsApi api;
        OASGenerateReportResponse response;
        OASGenerateReportResponse expectedResponse;
        String js = '';

        client = new OASClient();
        api = new OASReportsApi(client);

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
        OASReportsApi api;
        OASGenerateReportResponse response;
        OASGenerateReportResponse expectedResponse;
        String js = '';

        client = new OASClient();
        api = new OASReportsApi(client);

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
        OASReportsApi api;
        OASGenerateReportResponse response;
        OASGenerateReportResponse expectedResponse;
        String js = '';

        client = new OASClient();
        api = new OASReportsApi(client);

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
        OASReportsApi api;
        OASGenerateReportResponse response;
        OASGenerateReportResponse expectedResponse;
        String js = '';

        client = new OASClient();
        api = new OASReportsApi(client);

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
        OASReportsApi api;
        OASGenerateReportResponse response;
        OASGenerateReportResponse expectedResponse;
        String js = '';

        client = new OASClient();
        api = new OASReportsApi(client);

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
        OASReportsApi api;
        OASGenerateReportResponse response;
        OASGenerateReportResponse expectedResponse;
        String js = '';

        client = new OASClient();
        api = new OASReportsApi(client);

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
        OASReportsApi api;
        OASGenerateReportResponse response;
        OASGenerateReportResponse expectedResponse;
        String js = '';

        client = new OASClient();
        api = new OASReportsApi(client);

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
        OASReportsApi api;
        OASGenerateReportResponse response;
        OASGenerateReportResponse expectedResponse;
        String js = '';

        client = new OASClient();
        api = new OASReportsApi(client);

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
        OASReportsApi api;
        OASGenerateReportResponse response;
        OASGenerateReportResponse expectedResponse;
        String js = '';

        client = new OASClient();
        api = new OASReportsApi(client);

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
        OASReportsApi api;
        OASGetReportInfoResponse response;
        OASGetReportInfoResponse expectedResponse;
        String js = '';

        client = new OASClient();
        api = new OASReportsApi(client);

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
}