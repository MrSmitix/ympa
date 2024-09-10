<?php
/**
 * ShipmentsApiInterface
 *
 * PHP version 8.1.1
 *
 * @category Class
 * @package  OpenAPI\Server
 * @author   OpenAPI Generator team
 * @link     https://github.com/openapitools/openapi-generator
 */

/**
 * Партнерский API Маркета
 *
 * API Яндекс Маркета помогает продавцам автоматизировать и упростить работу с маркетплейсом.  В числе возможностей интеграции:  * управление каталогом товаров и витриной,  * обработка заказов,  * изменение настроек магазина,  * получение отчетов.
 *
 * The version of the OpenAPI document: LATEST
 * 
 * Generated by: https://github.com/openapitools/openapi-generator.git
 *
 */

/**
 * NOTE: This class is auto generated by the openapi generator program.
 * https://github.com/openapitools/openapi-generator
 * Do not edit the class manually.
 */

namespace OpenAPI\Server\Api;

use Symfony\Component\HttpFoundation\File\UploadedFile;
use OpenAPI\Server\Model\ApiClientDataErrorResponse;
use OpenAPI\Server\Model\ApiForbiddenErrorResponse;
use OpenAPI\Server\Model\ApiLimitErrorResponse;
use OpenAPI\Server\Model\ApiNotFoundErrorResponse;
use OpenAPI\Server\Model\ApiServerErrorResponse;
use OpenAPI\Server\Model\ApiUnauthorizedErrorResponse;
use OpenAPI\Server\Model\ConfirmShipmentRequest;
use OpenAPI\Server\Model\EmptyApiResponse;
use OpenAPI\Server\Model\GetShipmentOrdersInfoResponse;
use OpenAPI\Server\Model\GetShipmentResponse;
use OpenAPI\Server\Model\SearchShipmentsRequest;
use OpenAPI\Server\Model\SearchShipmentsResponse;
use OpenAPI\Server\Model\SetShipmentPalletsCountRequest;
use OpenAPI\Server\Model\ShipmentPalletLabelPageFormatType;
use OpenAPI\Server\Model\TransferOrdersFromShipmentRequest;

/**
 * ShipmentsApiInterface Interface Doc Comment
 *
 * @category Interface
 * @package  OpenAPI\Server\Api
 * @author   OpenAPI Generator team
 * @link     https://github.com/openapitools/openapi-generator
 */
interface ShipmentsApiInterface
{

    /**
     * Sets authentication method OAuth
     *
     * @param string|null $value Value of the OAuth authentication method.
     *
     * @return void
     */
    public function setOAuth(?string $value): void;

    /**
     * Operation confirmShipment
     *
     * Подтверждение отгрузки
     *
     * @param  int $campaignId  Идентификатор кампании в API и магазина в кабинете. Каждая кампания в API соответствует магазину в кабинете.  Чтобы узнать идентификаторы своих магазинов, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html) (required)
     * @param  int $shipmentId  Идентификатор отгрузки. (required)
     * @param  ConfirmShipmentRequest|null $confirmShipmentRequest   (optional)
     * @param  int     &$responseCode    The HTTP Response Code
     * @param  array   $responseHeaders  Additional HTTP headers to return with the response ()
     *
     * @return array|object|null
     */
    public function confirmShipment(
        int $campaignId,
        int $shipmentId,
        ?ConfirmShipmentRequest $confirmShipmentRequest,
        int &$responseCode,
        array &$responseHeaders
    ): array|object|null;

    /**
     * Operation downloadShipmentAct
     *
     * Получение акта приема-передачи
     *
     * @param  int $campaignId  Идентификатор кампании в API и магазина в кабинете. Каждая кампания в API соответствует магазину в кабинете.  Чтобы узнать идентификаторы своих магазинов, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html) (required)
     * @param  int $shipmentId  Идентификатор отгрузки. (required)
     * @param  int     &$responseCode    The HTTP Response Code
     * @param  array   $responseHeaders  Additional HTTP headers to return with the response ()
     *
     * @return array|object|null
     */
    public function downloadShipmentAct(
        int $campaignId,
        int $shipmentId,
        int &$responseCode,
        array &$responseHeaders
    ): array|object|null;

    /**
     * Operation downloadShipmentDiscrepancyAct
     *
     * Получение акта расхождений
     *
     * @param  int $campaignId  Идентификатор кампании в API и магазина в кабинете. Каждая кампания в API соответствует магазину в кабинете.  Чтобы узнать идентификаторы своих магазинов, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html) (required)
     * @param  int $shipmentId  Идентификатор отгрузки. (required)
     * @param  int     &$responseCode    The HTTP Response Code
     * @param  array   $responseHeaders  Additional HTTP headers to return with the response ()
     *
     * @return array|object|null
     */
    public function downloadShipmentDiscrepancyAct(
        int $campaignId,
        int $shipmentId,
        int &$responseCode,
        array &$responseHeaders
    ): array|object|null;

    /**
     * Operation downloadShipmentInboundAct
     *
     * Получение фактического акта приема-передачи
     *
     * @param  int $campaignId  Идентификатор кампании в API и магазина в кабинете. Каждая кампания в API соответствует магазину в кабинете.  Чтобы узнать идентификаторы своих магазинов, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html) (required)
     * @param  int $shipmentId  Идентификатор отгрузки. (required)
     * @param  int     &$responseCode    The HTTP Response Code
     * @param  array   $responseHeaders  Additional HTTP headers to return with the response ()
     *
     * @return array|object|null
     */
    public function downloadShipmentInboundAct(
        int $campaignId,
        int $shipmentId,
        int &$responseCode,
        array &$responseHeaders
    ): array|object|null;

    /**
     * Operation downloadShipmentPalletLabels
     *
     * Ярлыки для доверительной приемки (FBS)
     *
     * @param  int $campaignId  Идентификатор кампании в API и магазина в кабинете. Каждая кампания в API соответствует магазину в кабинете.  Чтобы узнать идентификаторы своих магазинов, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html) (required)
     * @param  int $shipmentId  Идентификатор отгрузки. (required)
     * @param  \OpenAPI\Server\Model\ShipmentPalletLabelPageFormatType|null $format  Формат страниц PDF-файла с ярлыками:  * &#x60;A4&#x60; — по 16 ярлыков на странице. * &#x60;A8&#x60; — по одному ярлыку на странице. (optional)
     * @param  int     &$responseCode    The HTTP Response Code
     * @param  array   $responseHeaders  Additional HTTP headers to return with the response ()
     *
     * @return array|object|null
     */
    public function downloadShipmentPalletLabels(
        int $campaignId,
        int $shipmentId,
        ?\OpenAPI\Server\Model\ShipmentPalletLabelPageFormatType $format,
        int &$responseCode,
        array &$responseHeaders
    ): array|object|null;

    /**
     * Operation downloadShipmentReceptionTransferAct
     *
     * Подтверждение ближайшей отгрузки и получение акта приема-передачи для нее
     *
     * @param  int $campaignId  Идентификатор кампании в API и магазина в кабинете. Каждая кампания в API соответствует магазину в кабинете.  Чтобы узнать идентификаторы своих магазинов, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html) (required)
     * @param  int|null $warehouseId  Идентификатор склада. (optional)
     * @param  int     &$responseCode    The HTTP Response Code
     * @param  array   $responseHeaders  Additional HTTP headers to return with the response ()
     *
     * @return array|object|null
     */
    public function downloadShipmentReceptionTransferAct(
        int $campaignId,
        ?int $warehouseId,
        int &$responseCode,
        array &$responseHeaders
    ): array|object|null;

    /**
     * Operation downloadShipmentTransportationWaybill
     *
     * Получение транспортной накладной
     *
     * @param  int $campaignId  Идентификатор кампании в API и магазина в кабинете. Каждая кампания в API соответствует магазину в кабинете.  Чтобы узнать идентификаторы своих магазинов, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html) (required)
     * @param  int $shipmentId  Идентификатор отгрузки. (required)
     * @param  int     &$responseCode    The HTTP Response Code
     * @param  array   $responseHeaders  Additional HTTP headers to return with the response ()
     *
     * @return array|object|null
     */
    public function downloadShipmentTransportationWaybill(
        int $campaignId,
        int $shipmentId,
        int &$responseCode,
        array &$responseHeaders
    ): array|object|null;

    /**
     * Operation getShipment
     *
     * Получение информации об одной отгрузке
     *
     * @param  int $campaignId  Идентификатор кампании в API и магазина в кабинете. Каждая кампания в API соответствует магазину в кабинете.  Чтобы узнать идентификаторы своих магазинов, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html) (required)
     * @param  int $shipmentId  Идентификатор отгрузки. (required)
     * @param  bool $cancelledOrders  Возвращать ли отмененные заказы.  Значение по умолчанию — &#x60;true&#x60;. Если возвращать отмененные заказы не нужно, передайте значение &#x60;false&#x60;. (optional, default to true)
     * @param  int     &$responseCode    The HTTP Response Code
     * @param  array   $responseHeaders  Additional HTTP headers to return with the response ()
     *
     * @return array|object|null
     */
    public function getShipment(
        int $campaignId,
        int $shipmentId,
        bool $cancelledOrders,
        int &$responseCode,
        array &$responseHeaders
    ): array|object|null;

    /**
     * Operation getShipmentOrdersInfo
     *
     * Получение информации о возможности печати ярлыков (FBS)
     *
     * @param  int $campaignId  Идентификатор кампании в API и магазина в кабинете. Каждая кампания в API соответствует магазину в кабинете.  Чтобы узнать идентификаторы своих магазинов, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html) (required)
     * @param  int $shipmentId  Идентификатор отгрузки. (required)
     * @param  int     &$responseCode    The HTTP Response Code
     * @param  array   $responseHeaders  Additional HTTP headers to return with the response ()
     *
     * @return array|object|null
     */
    public function getShipmentOrdersInfo(
        int $campaignId,
        int $shipmentId,
        int &$responseCode,
        array &$responseHeaders
    ): array|object|null;

    /**
     * Operation searchShipments
     *
     * Получение информации о нескольких отгрузках
     *
     * @param  int $campaignId  Идентификатор кампании в API и магазина в кабинете. Каждая кампания в API соответствует магазину в кабинете.  Чтобы узнать идентификаторы своих магазинов, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html) (required)
     * @param  SearchShipmentsRequest $searchShipmentsRequest   (required)
     * @param  string|null $pageToken  Идентификатор страницы c результатами.  Если параметр не указан, возвращается первая страница.  Рекомендуется передавать значение выходного параметра &#x60;nextPageToken&#x60;, полученное при последнем запросе.  Если задан &#x60;page_token&#x60; и в запросе есть параметры &#x60;offset&#x60;, &#x60;page_number&#x60; и &#x60;page_size&#x60;, они игнорируются. (optional)
     * @param  int|null $limit  Количество значений на одной странице. (optional)
     * @param  int     &$responseCode    The HTTP Response Code
     * @param  array   $responseHeaders  Additional HTTP headers to return with the response ()
     *
     * @return array|object|null
     */
    public function searchShipments(
        int $campaignId,
        SearchShipmentsRequest $searchShipmentsRequest,
        ?string $pageToken,
        ?int $limit,
        int &$responseCode,
        array &$responseHeaders
    ): array|object|null;

    /**
     * Operation setShipmentPalletsCount
     *
     * Передача количества упаковок в отгрузке
     *
     * @param  int $campaignId  Идентификатор кампании в API и магазина в кабинете. Каждая кампания в API соответствует магазину в кабинете.  Чтобы узнать идентификаторы своих магазинов, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html) (required)
     * @param  int $shipmentId  Идентификатор отгрузки. (required)
     * @param  SetShipmentPalletsCountRequest $setShipmentPalletsCountRequest   (required)
     * @param  int     &$responseCode    The HTTP Response Code
     * @param  array   $responseHeaders  Additional HTTP headers to return with the response ()
     *
     * @return array|object|null
     */
    public function setShipmentPalletsCount(
        int $campaignId,
        int $shipmentId,
        SetShipmentPalletsCountRequest $setShipmentPalletsCountRequest,
        int &$responseCode,
        array &$responseHeaders
    ): array|object|null;

    /**
     * Operation transferOrdersFromShipment
     *
     * Перенос заказов в следующую отгрузку
     *
     * @param  int $campaignId  Идентификатор кампании в API и магазина в кабинете. Каждая кампания в API соответствует магазину в кабинете.  Чтобы узнать идентификаторы своих магазинов, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html) (required)
     * @param  int $shipmentId  Идентификатор отгрузки. (required)
     * @param  TransferOrdersFromShipmentRequest $transferOrdersFromShipmentRequest   (required)
     * @param  int     &$responseCode    The HTTP Response Code
     * @param  array   $responseHeaders  Additional HTTP headers to return with the response ()
     *
     * @return array|object|null
     */
    public function transferOrdersFromShipment(
        int $campaignId,
        int $shipmentId,
        TransferOrdersFromShipmentRequest $transferOrdersFromShipmentRequest,
        int &$responseCode,
        array &$responseHeaders
    ): array|object|null;
}
