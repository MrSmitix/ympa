<?php

/**
 * Партнерский API Маркета
 * PHP version 7.4
 *
 * @package OpenAPIServer
 * @author  OpenAPI Generator team
 * @link    https://github.com/openapitools/openapi-generator
 */

/**
 * API Яндекс Маркета помогает продавцам автоматизировать и упростить работу с маркетплейсом.  В числе возможностей интеграции:  * управление каталогом товаров и витриной,  * обработка заказов,  * изменение настроек магазина,  * получение отчетов.
 * The version of the OpenAPI document: LATEST
 * Generated by: https://github.com/openapitools/openapi-generator.git
 */

/**
 * NOTE: This class is auto generated by the openapi generator program.
 * https://github.com/openapitools/openapi-generator
 * Do not edit the class manually.
 * Extend this class with your controller. You can inject dependencies via class constructor,
 * @see https://github.com/PHP-DI/Slim-Bridge basic example.
 */
namespace OpenAPIServer\Api;

use Psr\Http\Message\ServerRequestInterface;
use Psr\Http\Message\ResponseInterface;
use Slim\Exception\HttpNotImplementedException;

/**
 * AbstractReportsApi Class Doc Comment
 *
 * @package OpenAPIServer\Api
 * @author  OpenAPI Generator team
 * @link    https://github.com/openapitools/openapi-generator
 */
abstract class AbstractReportsApi
{
    /**
     * POST generateBoostConsolidatedReport
     * Summary: Отчет по бусту продаж
     * Notes: Запускает генерацию **сводного отчета по бусту продаж** за заданный период. Отчет содержит информацию по всем кампаниям, созданным и через API, и в кабинете.  Узнать статус генерации и получить ссылку на готовый отчет можно с помощью запроса [GET reports/info/{reportId}](../../reference/reports/getReportInfo.md).  |**⚙️ Лимит:** 100 запросов в час| |-|
     * Output-Formats: [application/json]
     *
     * @param ServerRequestInterface $request  Request
     * @param ResponseInterface      $response Response
     *
     * @return ResponseInterface
     * @throws HttpNotImplementedException to force implementation class to override this method
     */
    public function generateBoostConsolidatedReport(
        ServerRequestInterface $request,
        ResponseInterface $response
    ): ResponseInterface {
        $queryParams = $request->getQueryParams();
        $format = (key_exists('format', $queryParams)) ? $queryParams['format'] : null;
        $body = $request->getParsedBody();
        $message = "How about implementing generateBoostConsolidatedReport as a POST method in OpenAPIServer\Api\ReportsApi class?";
        throw new HttpNotImplementedException($request, $message);
    }

    /**
     * POST generateCompetitorsPositionReport
     * Summary: Отчет «Конкурентная позиция»
     * Notes: Запускает генерацию **отчета «Конкурентная позиция»** за заданный период. [Что это за отчет](https://yandex.ru/support2/marketplace/ru/analytics/competitors.html)  Узнать статус генерации и получить ссылку на готовый отчет можно с помощью запроса [GET reports/info/{reportId}](../../reference/reports/getReportInfo.md).  {% note info \&quot;Значение -1 в отчете\&quot; %}  Если в CSV-файле в столбце **POSITION** стоит -1, в этот день не было заказов с товарами в указанной категории.  {% endnote %}  |**⚙️ Лимит:** 10 запросов в час| |-|
     * Output-Formats: [application/json]
     *
     * @param ServerRequestInterface $request  Request
     * @param ResponseInterface      $response Response
     *
     * @return ResponseInterface
     * @throws HttpNotImplementedException to force implementation class to override this method
     */
    public function generateCompetitorsPositionReport(
        ServerRequestInterface $request,
        ResponseInterface $response
    ): ResponseInterface {
        $queryParams = $request->getQueryParams();
        $format = (key_exists('format', $queryParams)) ? $queryParams['format'] : null;
        $body = $request->getParsedBody();
        $message = "How about implementing generateCompetitorsPositionReport as a POST method in OpenAPIServer\Api\ReportsApi class?";
        throw new HttpNotImplementedException($request, $message);
    }

    /**
     * POST generateGoodsFeedbackReport
     * Summary: Отчет по отзывам о товарах
     * Notes: Запускает генерацию **отчета по отзывам о товарах**. [Что это за отчет](https://yandex.ru/support2/marketplace/ru/marketing/plus-reviews#stat)  Узнать статус генерации и получить ссылку на готовый отчет можно с помощью запроса [GET reports/info/{reportId}](../../reference/reports/getReportInfo.md).  |**⚙️ Лимит:** 100 запросов в час| |-|
     * Output-Formats: [application/json]
     *
     * @param ServerRequestInterface $request  Request
     * @param ResponseInterface      $response Response
     *
     * @return ResponseInterface
     * @throws HttpNotImplementedException to force implementation class to override this method
     */
    public function generateGoodsFeedbackReport(
        ServerRequestInterface $request,
        ResponseInterface $response
    ): ResponseInterface {
        $queryParams = $request->getQueryParams();
        $format = (key_exists('format', $queryParams)) ? $queryParams['format'] : null;
        $body = $request->getParsedBody();
        $message = "How about implementing generateGoodsFeedbackReport as a POST method in OpenAPIServer\Api\ReportsApi class?";
        throw new HttpNotImplementedException($request, $message);
    }

    /**
     * POST generateGoodsMovementReport
     * Summary: Отчет по движению товаров
     * Notes: Запускает генерацию **отчета по движению товаров**. [Что это за отчет](https://yandex.ru/support/marketplace/analytics/reports-fby-fbs.html#flow)  Узнать статус генерации и получить ссылку на готовый отчет можно с помощью запроса [GET reports/info/{reportId}](../../reference/reports/getReportInfo.md).  |**⚙️ Лимит:** 100 запросов в час| |-|
     * Output-Formats: [application/json]
     *
     * @param ServerRequestInterface $request  Request
     * @param ResponseInterface      $response Response
     *
     * @return ResponseInterface
     * @throws HttpNotImplementedException to force implementation class to override this method
     */
    public function generateGoodsMovementReport(
        ServerRequestInterface $request,
        ResponseInterface $response
    ): ResponseInterface {
        $queryParams = $request->getQueryParams();
        $format = (key_exists('format', $queryParams)) ? $queryParams['format'] : null;
        $body = $request->getParsedBody();
        $message = "How about implementing generateGoodsMovementReport as a POST method in OpenAPIServer\Api\ReportsApi class?";
        throw new HttpNotImplementedException($request, $message);
    }

    /**
     * POST generateGoodsRealizationReport
     * Summary: Отчет по реализации
     * Notes: Запускает генерацию **отчета по реализации** за заданный период. [Что это за отчет](https://yandex.ru/support/marketplace/analytics/reports-fby-fbs.html#sales-report)  Узнать статус генерации и получить ссылку на готовый отчет можно с помощью запроса [GET reports/info/{reportId}](../../reference/reports/getReportInfo.md).  |**⚙️ Лимит:** 100 запросов в час| |-|
     * Output-Formats: [application/json]
     *
     * @param ServerRequestInterface $request  Request
     * @param ResponseInterface      $response Response
     *
     * @return ResponseInterface
     * @throws HttpNotImplementedException to force implementation class to override this method
     */
    public function generateGoodsRealizationReport(
        ServerRequestInterface $request,
        ResponseInterface $response
    ): ResponseInterface {
        $queryParams = $request->getQueryParams();
        $format = (key_exists('format', $queryParams)) ? $queryParams['format'] : null;
        $body = $request->getParsedBody();
        $message = "How about implementing generateGoodsRealizationReport as a POST method in OpenAPIServer\Api\ReportsApi class?";
        throw new HttpNotImplementedException($request, $message);
    }

    /**
     * POST generateGoodsTurnoverReport
     * Summary: Отчет по оборачиваемости
     * Notes: Запускает генерацию **отчета по оборачиваемости** за заданную дату.  [Что это за отчет](https://yandex.ru/support/marketplace/analytics/turnover.html)  Узнать статус генерации и получить ссылку на готовый отчет можно с помощью запроса [GET reports/info/{reportId}](../../reference/reports/getReportInfo.md).  |**⚙️ Лимит:** 100 запросов в час| |-|
     * Output-Formats: [application/json]
     *
     * @param ServerRequestInterface $request  Request
     * @param ResponseInterface      $response Response
     *
     * @return ResponseInterface
     * @throws HttpNotImplementedException to force implementation class to override this method
     */
    public function generateGoodsTurnoverReport(
        ServerRequestInterface $request,
        ResponseInterface $response
    ): ResponseInterface {
        $queryParams = $request->getQueryParams();
        $format = (key_exists('format', $queryParams)) ? $queryParams['format'] : null;
        $body = $request->getParsedBody();
        $message = "How about implementing generateGoodsTurnoverReport as a POST method in OpenAPIServer\Api\ReportsApi class?";
        throw new HttpNotImplementedException($request, $message);
    }

    /**
     * POST generateMassOrderLabelsReport
     * Summary: Готовые ярлыки‑наклейки на все коробки в нескольких заказах
     * Notes: Запускает генерацию PDF-файла с ярлыками для переданных заказов. Подробно о том, зачем они нужны и как выглядят, рассказано [в Справке Маркета для продавцов](https://yandex.ru/support/marketplace/orders/fbs/packaging/marking.html).  Узнать статус генерации и получить ссылку на готовый файл можно с помощью запроса [GET reports/info/{reportId}](../../reference/reports/getReportInfo.md).  |**⚙️ Лимит:** 1000 запросов в час| |-|
     * Output-Formats: [application/json]
     *
     * @param ServerRequestInterface $request  Request
     * @param ResponseInterface      $response Response
     *
     * @return ResponseInterface
     * @throws HttpNotImplementedException to force implementation class to override this method
     */
    public function generateMassOrderLabelsReport(
        ServerRequestInterface $request,
        ResponseInterface $response
    ): ResponseInterface {
        $queryParams = $request->getQueryParams();
        $format = (key_exists('format', $queryParams)) ? $queryParams['format'] : null;
        $body = $request->getParsedBody();
        $message = "How about implementing generateMassOrderLabelsReport as a POST method in OpenAPIServer\Api\ReportsApi class?";
        throw new HttpNotImplementedException($request, $message);
    }

    /**
     * POST generatePricesReport
     * Summary: Отчет «Цены на рынке»
     * Notes: Запускает генерацию **отчета «Цены на рынке»**.  Узнать статус генерации и получить ссылку на готовый отчет можно с помощью запроса [GET reports/info/{reportId}](../../reference/reports/getReportInfo.md).  |**⚙️ Лимит:** 100 запросов в час| |-|
     * Output-Formats: [application/json]
     *
     * @param ServerRequestInterface $request  Request
     * @param ResponseInterface      $response Response
     *
     * @return ResponseInterface
     * @throws HttpNotImplementedException to force implementation class to override this method
     */
    public function generatePricesReport(
        ServerRequestInterface $request,
        ResponseInterface $response
    ): ResponseInterface {
        $queryParams = $request->getQueryParams();
        $format = (key_exists('format', $queryParams)) ? $queryParams['format'] : null;
        $body = $request->getParsedBody();
        $message = "How about implementing generatePricesReport as a POST method in OpenAPIServer\Api\ReportsApi class?";
        throw new HttpNotImplementedException($request, $message);
    }

    /**
     * POST generateShelfsStatisticsReport
     * Summary: Отчет по полкам
     * Notes: Запускает генерацию **сводного отчета по полкам** — рекламным блокам с баннером или видео и набором товаров. Подробнее о них читайте [в Справке Маркета для продавцов](https://yandex.ru/support2/marketplace/ru/marketing/shelf).  Узнать статус генерации и получить ссылку на готовый отчет можно с помощью запроса [GET reports/info/{reportId}](../../reference/reports/getReportInfo.md).  |**⚙️ Лимит:** 100 запросов в час| |-|
     * Output-Formats: [application/json]
     *
     * @param ServerRequestInterface $request  Request
     * @param ResponseInterface      $response Response
     *
     * @return ResponseInterface
     * @throws HttpNotImplementedException to force implementation class to override this method
     */
    public function generateShelfsStatisticsReport(
        ServerRequestInterface $request,
        ResponseInterface $response
    ): ResponseInterface {
        $queryParams = $request->getQueryParams();
        $format = (key_exists('format', $queryParams)) ? $queryParams['format'] : null;
        $body = $request->getParsedBody();
        $message = "How about implementing generateShelfsStatisticsReport as a POST method in OpenAPIServer\Api\ReportsApi class?";
        throw new HttpNotImplementedException($request, $message);
    }

    /**
     * POST generateShipmentListDocumentReport
     * Summary: Получение листа сборки
     * Notes: Запускает генерацию **листа сборки** для отгрузки.  Узнать статус генерации и получить ссылку на готовый документ можно с помощью запроса [GET reports/info/{reportId}](../../reference/reports/getReportInfo.md).  |**⚙️ Лимит:** 100 запросов в час| |-|
     * Output-Formats: [application/json]
     *
     * @param ServerRequestInterface $request  Request
     * @param ResponseInterface      $response Response
     *
     * @return ResponseInterface
     * @throws HttpNotImplementedException to force implementation class to override this method
     */
    public function generateShipmentListDocumentReport(
        ServerRequestInterface $request,
        ResponseInterface $response
    ): ResponseInterface {
        $body = $request->getParsedBody();
        $message = "How about implementing generateShipmentListDocumentReport as a POST method in OpenAPIServer\Api\ReportsApi class?";
        throw new HttpNotImplementedException($request, $message);
    }

    /**
     * POST generateShowsSalesReport
     * Summary: Отчет «Аналитика продаж»
     * Notes: Запускает генерацию **отчета «Аналитика продаж»** за заданный период. [Что это за отчет](https://yandex.ru/support/marketplace/analytics/shows-sales.html)  Узнать статус генерации и получить ссылку на готовый отчет можно с помощью запроса [GET reports/info/{reportId}](../../reference/reports/getReportInfo.md).  |**⚙️ Лимит:** 10 запросов в час| |-|
     * Output-Formats: [application/json]
     *
     * @param ServerRequestInterface $request  Request
     * @param ResponseInterface      $response Response
     *
     * @return ResponseInterface
     * @throws HttpNotImplementedException to force implementation class to override this method
     */
    public function generateShowsSalesReport(
        ServerRequestInterface $request,
        ResponseInterface $response
    ): ResponseInterface {
        $queryParams = $request->getQueryParams();
        $format = (key_exists('format', $queryParams)) ? $queryParams['format'] : null;
        $body = $request->getParsedBody();
        $message = "How about implementing generateShowsSalesReport as a POST method in OpenAPIServer\Api\ReportsApi class?";
        throw new HttpNotImplementedException($request, $message);
    }

    /**
     * POST generateStocksOnWarehousesReport
     * Summary: Отчет по остаткам на складах
     * Notes: Запускает генерацию **отчета по остаткам на складах**. Отчет содержит данные:  * Для модели FBY — об остатках на складах Маркета. * Для остальных моделей — об остатках на соответствующем складе магазина.  Узнать статус генерации и получить ссылку на готовый отчет можно с помощью запроса [GET reports/info/{reportId}](../../reference/reports/getReportInfo.md).  |**⚙️ Лимит:** 100 запросов в час| |-|
     * Output-Formats: [application/json]
     *
     * @param ServerRequestInterface $request  Request
     * @param ResponseInterface      $response Response
     *
     * @return ResponseInterface
     * @throws HttpNotImplementedException to force implementation class to override this method
     */
    public function generateStocksOnWarehousesReport(
        ServerRequestInterface $request,
        ResponseInterface $response
    ): ResponseInterface {
        $queryParams = $request->getQueryParams();
        $format = (key_exists('format', $queryParams)) ? $queryParams['format'] : null;
        $body = $request->getParsedBody();
        $message = "How about implementing generateStocksOnWarehousesReport as a POST method in OpenAPIServer\Api\ReportsApi class?";
        throw new HttpNotImplementedException($request, $message);
    }

    /**
     * POST generateUnitedMarketplaceServicesReport
     * Summary: Отчет по стоимости услуг
     * Notes: Запускает генерацию **отчета по стоимости услуг** за заданный период. [Что это за отчет](https://yandex.ru/support/marketplace/analytics/reports.html)  Тип отчета зависит от того, какие поля заполнены в запросе:  |**Тип отчета**               |**Какие поля нужны**             | |-----------------------------|---------------------------------| |По дате начисления услуги    |&#x60;dateFrom&#x60; и &#x60;dateTo&#x60;            | |По дате формирования акта    |&#x60;year&#x60; и &#x60;month&#x60;                 |  Заказать отчеты обоих типов одним запросом нельзя.  Узнать статус генерации и получить ссылку на готовый отчет можно с помощью запроса [GET reports/info/{reportId}](../../reference/reports/getReportInfo.md).  |**⚙️ Лимит:** 100 запросов в час| |-|
     * Output-Formats: [application/json]
     *
     * @param ServerRequestInterface $request  Request
     * @param ResponseInterface      $response Response
     *
     * @return ResponseInterface
     * @throws HttpNotImplementedException to force implementation class to override this method
     */
    public function generateUnitedMarketplaceServicesReport(
        ServerRequestInterface $request,
        ResponseInterface $response
    ): ResponseInterface {
        $queryParams = $request->getQueryParams();
        $format = (key_exists('format', $queryParams)) ? $queryParams['format'] : null;
        $body = $request->getParsedBody();
        $message = "How about implementing generateUnitedMarketplaceServicesReport as a POST method in OpenAPIServer\Api\ReportsApi class?";
        throw new HttpNotImplementedException($request, $message);
    }

    /**
     * POST generateUnitedNettingReport
     * Summary: Отчет по платежам
     * Notes: Запускает генерацию **отчета по платежам** за заданный период. [Что это за отчет](https://yandex.ru/support/marketplace/analytics/transactions.html)  Узнать статус генерации и получить ссылку на готовый отчет можно с помощью запроса [GET reports/info/{reportId}](../../reference/reports/getReportInfo.md).  Тип отчета зависит от того, какие поля заполнены в запросе:  |**Тип отчета**           |**Какие поля нужны**                   | |-------------------------|---------------------------------------| |О платежах за период     |&#x60;dateFrom&#x60; и &#x60;dateTo&#x60;                  | |О платежном поручении    |&#x60;bankOrderId&#x60; и &#x60;bankOrderDateTime&#x60;    |  Заказать отчеты обоих типов одним запросом нельзя.  |**⚙️ Лимит:** 100 запросов в час| |-|
     * Output-Formats: [application/json]
     *
     * @param ServerRequestInterface $request  Request
     * @param ResponseInterface      $response Response
     *
     * @return ResponseInterface
     * @throws HttpNotImplementedException to force implementation class to override this method
     */
    public function generateUnitedNettingReport(
        ServerRequestInterface $request,
        ResponseInterface $response
    ): ResponseInterface {
        $queryParams = $request->getQueryParams();
        $format = (key_exists('format', $queryParams)) ? $queryParams['format'] : null;
        $body = $request->getParsedBody();
        $message = "How about implementing generateUnitedNettingReport as a POST method in OpenAPIServer\Api\ReportsApi class?";
        throw new HttpNotImplementedException($request, $message);
    }

    /**
     * POST generateUnitedOrdersReport
     * Summary: Отчет по заказам
     * Notes: Запускает генерацию **отчета по заказам** за заданный период. [Что это за отчет](https://yandex.ru/support/marketplace/analytics/orders.html)  {% note info \&quot;\&quot; %}  Это новый отчет. Раньше мы так называли генерацию детальной информации по заказам. [Как получить детальную информацию по заказам](../../reference/stats/getOrdersStats.md)  {% endnote %}  Узнать статус генерации и получить ссылку на готовый отчет можно с помощью запроса [GET reports/info/{reportId}](../../reference/reports/getReportInfo.md).  |**⚙️ Лимит:** 100 запросов в час| |-|
     * Output-Formats: [application/json]
     *
     * @param ServerRequestInterface $request  Request
     * @param ResponseInterface      $response Response
     *
     * @return ResponseInterface
     * @throws HttpNotImplementedException to force implementation class to override this method
     */
    public function generateUnitedOrdersReport(
        ServerRequestInterface $request,
        ResponseInterface $response
    ): ResponseInterface {
        $queryParams = $request->getQueryParams();
        $format = (key_exists('format', $queryParams)) ? $queryParams['format'] : null;
        $body = $request->getParsedBody();
        $message = "How about implementing generateUnitedOrdersReport as a POST method in OpenAPIServer\Api\ReportsApi class?";
        throw new HttpNotImplementedException($request, $message);
    }

    /**
     * GET getReportInfo
     * Summary: Получение заданного отчета
     * Notes: Возвращает статус генерации заданного отчета и, если отчет готов, ссылку для скачивания.  Чтобы воспользоваться этим запросом, вначале нужно запустить генерацию отчета. [Инструкция](../../step-by-step/reports.md)  |**⚙️ Лимит:** 100 запросов в минуту| |-|
     * Output-Formats: [application/json]
     *
     * @param ServerRequestInterface $request  Request
     * @param ResponseInterface      $response Response
     * @param string $reportId Идентификатор отчета, который вы получили после запуска генерации.
     *
     * @return ResponseInterface
     * @throws HttpNotImplementedException to force implementation class to override this method
     */
    public function getReportInfo(
        ServerRequestInterface $request,
        ResponseInterface $response,
        string $reportId
    ): ResponseInterface {
        $message = "How about implementing getReportInfo as a GET method in OpenAPIServer\Api\ReportsApi class?";
        throw new HttpNotImplementedException($request, $message);
    }
}
