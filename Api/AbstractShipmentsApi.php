<?php

/**
 * Партнерский API Маркета
 * PHP version 8.x
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

namespace OpenAPIServer\Api;


abstract class AbstractShipmentsApi
{

    /**
     * Operation confirmShipment
     *
     * Path: `/campaigns/{campaignId}/first-mile/shipments/{shipmentId}/confirm`
     *
     * Подтверждение отгрузки
     *
     * @param int $campaignId Идентификатор кампании в API и магазина в кабинете. Каждая кампания в API соответствует магазину в кабинете.  Чтобы узнать идентификаторы своих магазинов, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html) (required)
     * @param int $shipmentId Идентификатор отгрузки. (required)
     * @param ?\OpenAPIServer\Model\ConfirmShipmentRequest $confirmShipmentRequest  (optional)
     *
     * @return \OpenAPIServer\Model\EmptyApiResponse|null
     */
    public function confirmShipment(int $campaignId, int $shipmentId, ?\OpenAPIServer\Model\ConfirmShipmentRequest $confirmShipmentRequest): \OpenAPIServer\Model\EmptyApiResponse|null
    {
        throw new \Exception('Not implemented');
    }

    /**
     * Operation confirmShipment (stream)
     *
     * Path: `/campaigns/{campaignId}/first-mile/shipments/{shipmentId}/confirm`
     *
     * Подтверждение отгрузки
     *
     * @param int $campaignId Идентификатор кампании в API и магазина в кабинете. Каждая кампания в API соответствует магазину в кабинете.  Чтобы узнать идентификаторы своих магазинов, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html) (required)
     * @param int $shipmentId Идентификатор отгрузки. (required)
     * @param ?\OpenAPIServer\Model\ConfirmShipmentRequest $confirmShipmentRequest  (optional)
     *
     */
    public function confirmShipmentStream(int $campaignId, int $shipmentId, ?\OpenAPIServer\Model\ConfirmShipmentRequest $confirmShipmentRequest): void
    {
        throw new \Exception('Not implemented');
    }
    /**
     * Operation downloadShipmentAct
     *
     * Path: `/campaigns/{campaignId}/first-mile/shipments/{shipmentId}/act`
     *
     * Получение акта приема-передачи
     *
     * @param int $campaignId Идентификатор кампании в API и магазина в кабинете. Каждая кампания в API соответствует магазину в кабинете.  Чтобы узнать идентификаторы своих магазинов, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html) (required)
     * @param int $shipmentId Идентификатор отгрузки. (required)
     *
     * @return void
     */
    public function downloadShipmentAct(int $campaignId, int $shipmentId): void
    {
        throw new \Exception('Not implemented');
    }

    /**
     * Operation downloadShipmentAct (stream)
     *
     * Path: `/campaigns/{campaignId}/first-mile/shipments/{shipmentId}/act`
     *
     * Получение акта приема-передачи
     *
     * @param int $campaignId Идентификатор кампании в API и магазина в кабинете. Каждая кампания в API соответствует магазину в кабинете.  Чтобы узнать идентификаторы своих магазинов, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html) (required)
     * @param int $shipmentId Идентификатор отгрузки. (required)
     *
     */
    public function downloadShipmentActStream(int $campaignId, int $shipmentId): void
    {
        throw new \Exception('Not implemented');
    }
    /**
     * Operation downloadShipmentDiscrepancyAct
     *
     * Path: `/campaigns/{campaignId}/first-mile/shipments/{shipmentId}/discrepancy-act`
     *
     * Получение акта расхождений
     *
     * @param int $campaignId Идентификатор кампании в API и магазина в кабинете. Каждая кампания в API соответствует магазину в кабинете.  Чтобы узнать идентификаторы своих магазинов, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html) (required)
     * @param int $shipmentId Идентификатор отгрузки. (required)
     *
     * @return void
     */
    public function downloadShipmentDiscrepancyAct(int $campaignId, int $shipmentId): void
    {
        throw new \Exception('Not implemented');
    }

    /**
     * Operation downloadShipmentDiscrepancyAct (stream)
     *
     * Path: `/campaigns/{campaignId}/first-mile/shipments/{shipmentId}/discrepancy-act`
     *
     * Получение акта расхождений
     *
     * @param int $campaignId Идентификатор кампании в API и магазина в кабинете. Каждая кампания в API соответствует магазину в кабинете.  Чтобы узнать идентификаторы своих магазинов, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html) (required)
     * @param int $shipmentId Идентификатор отгрузки. (required)
     *
     */
    public function downloadShipmentDiscrepancyActStream(int $campaignId, int $shipmentId): void
    {
        throw new \Exception('Not implemented');
    }
    /**
     * Operation downloadShipmentInboundAct
     *
     * Path: `/campaigns/{campaignId}/first-mile/shipments/{shipmentId}/inbound-act`
     *
     * Получение фактического акта приема-передачи
     *
     * @param int $campaignId Идентификатор кампании в API и магазина в кабинете. Каждая кампания в API соответствует магазину в кабинете.  Чтобы узнать идентификаторы своих магазинов, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html) (required)
     * @param int $shipmentId Идентификатор отгрузки. (required)
     *
     * @return void
     */
    public function downloadShipmentInboundAct(int $campaignId, int $shipmentId): void
    {
        throw new \Exception('Not implemented');
    }

    /**
     * Operation downloadShipmentInboundAct (stream)
     *
     * Path: `/campaigns/{campaignId}/first-mile/shipments/{shipmentId}/inbound-act`
     *
     * Получение фактического акта приема-передачи
     *
     * @param int $campaignId Идентификатор кампании в API и магазина в кабинете. Каждая кампания в API соответствует магазину в кабинете.  Чтобы узнать идентификаторы своих магазинов, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html) (required)
     * @param int $shipmentId Идентификатор отгрузки. (required)
     *
     */
    public function downloadShipmentInboundActStream(int $campaignId, int $shipmentId): void
    {
        throw new \Exception('Not implemented');
    }
    /**
     * Operation downloadShipmentPalletLabels
     *
     * Path: `/campaigns/{campaignId}/first-mile/shipments/{shipmentId}/pallet/labels`
     *
     * Ярлыки для доверительной приемки (FBS)
     *
     * @param int $campaignId Идентификатор кампании в API и магазина в кабинете. Каждая кампания в API соответствует магазину в кабинете.  Чтобы узнать идентификаторы своих магазинов, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html) (required)
     * @param int $shipmentId Идентификатор отгрузки. (required)
     * @param  $format Формат страниц PDF-файла с ярлыками:  * &#x60;A4&#x60; — по 16 ярлыков на странице. * &#x60;A8&#x60; — по одному ярлыку на странице. (optional)
     *
     * @return void
     */
    public function downloadShipmentPalletLabels(int $campaignId, int $shipmentId,  $format): void
    {
        throw new \Exception('Not implemented');
    }

    /**
     * Operation downloadShipmentPalletLabels (stream)
     *
     * Path: `/campaigns/{campaignId}/first-mile/shipments/{shipmentId}/pallet/labels`
     *
     * Ярлыки для доверительной приемки (FBS)
     *
     * @param int $campaignId Идентификатор кампании в API и магазина в кабинете. Каждая кампания в API соответствует магазину в кабинете.  Чтобы узнать идентификаторы своих магазинов, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html) (required)
     * @param int $shipmentId Идентификатор отгрузки. (required)
     * @param  $format Формат страниц PDF-файла с ярлыками:  * &#x60;A4&#x60; — по 16 ярлыков на странице. * &#x60;A8&#x60; — по одному ярлыку на странице. (optional)
     *
     */
    public function downloadShipmentPalletLabelsStream(int $campaignId, int $shipmentId,  $format): void
    {
        throw new \Exception('Not implemented');
    }
    /**
     * Operation downloadShipmentReceptionTransferAct
     *
     * Path: `/campaigns/{campaignId}/shipments/reception-transfer-act`
     *
     * Подтверждение ближайшей отгрузки и получение акта приема-передачи для нее
     *
     * @param int $campaignId Идентификатор кампании в API и магазина в кабинете. Каждая кампания в API соответствует магазину в кабинете.  Чтобы узнать идентификаторы своих магазинов, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html) (required)
     * @param ?int $warehouseId Идентификатор склада. (optional)
     *
     * @return void
     */
    public function downloadShipmentReceptionTransferAct(int $campaignId, ?int $warehouseId): void
    {
        throw new \Exception('Not implemented');
    }

    /**
     * Operation downloadShipmentReceptionTransferAct (stream)
     *
     * Path: `/campaigns/{campaignId}/shipments/reception-transfer-act`
     *
     * Подтверждение ближайшей отгрузки и получение акта приема-передачи для нее
     *
     * @param int $campaignId Идентификатор кампании в API и магазина в кабинете. Каждая кампания в API соответствует магазину в кабинете.  Чтобы узнать идентификаторы своих магазинов, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html) (required)
     * @param ?int $warehouseId Идентификатор склада. (optional)
     *
     */
    public function downloadShipmentReceptionTransferActStream(int $campaignId, ?int $warehouseId): void
    {
        throw new \Exception('Not implemented');
    }
    /**
     * Operation downloadShipmentTransportationWaybill
     *
     * Path: `/campaigns/{campaignId}/first-mile/shipments/{shipmentId}/transportation-waybill`
     *
     * Получение транспортной накладной
     *
     * @param int $campaignId Идентификатор кампании в API и магазина в кабинете. Каждая кампания в API соответствует магазину в кабинете.  Чтобы узнать идентификаторы своих магазинов, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html) (required)
     * @param int $shipmentId Идентификатор отгрузки. (required)
     *
     * @return void
     */
    public function downloadShipmentTransportationWaybill(int $campaignId, int $shipmentId): void
    {
        throw new \Exception('Not implemented');
    }

    /**
     * Operation downloadShipmentTransportationWaybill (stream)
     *
     * Path: `/campaigns/{campaignId}/first-mile/shipments/{shipmentId}/transportation-waybill`
     *
     * Получение транспортной накладной
     *
     * @param int $campaignId Идентификатор кампании в API и магазина в кабинете. Каждая кампания в API соответствует магазину в кабинете.  Чтобы узнать идентификаторы своих магазинов, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html) (required)
     * @param int $shipmentId Идентификатор отгрузки. (required)
     *
     */
    public function downloadShipmentTransportationWaybillStream(int $campaignId, int $shipmentId): void
    {
        throw new \Exception('Not implemented');
    }
    /**
     * Operation getShipment
     *
     * Path: `/campaigns/{campaignId}/first-mile/shipments/{shipmentId}`
     *
     * Получение информации об одной отгрузке
     *
     * @param int $campaignId Идентификатор кампании в API и магазина в кабинете. Каждая кампания в API соответствует магазину в кабинете.  Чтобы узнать идентификаторы своих магазинов, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html) (required)
     * @param int $shipmentId Идентификатор отгрузки. (required)
     * @param ?bool $cancelledOrders Возвращать ли отмененные заказы.  Значение по умолчанию — &#x60;true&#x60;. Если возвращать отмененные заказы не нужно, передайте значение &#x60;false&#x60;. (optional, default to true)
     *
     * @return \OpenAPIServer\Model\GetShipmentResponse|null
     */
    public function getShipment(int $campaignId, int $shipmentId, ?bool $cancelledOrders): \OpenAPIServer\Model\GetShipmentResponse|null
    {
        throw new \Exception('Not implemented');
    }

    /**
     * Operation getShipment (stream)
     *
     * Path: `/campaigns/{campaignId}/first-mile/shipments/{shipmentId}`
     *
     * Получение информации об одной отгрузке
     *
     * @param int $campaignId Идентификатор кампании в API и магазина в кабинете. Каждая кампания в API соответствует магазину в кабинете.  Чтобы узнать идентификаторы своих магазинов, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html) (required)
     * @param int $shipmentId Идентификатор отгрузки. (required)
     * @param ?bool $cancelledOrders Возвращать ли отмененные заказы.  Значение по умолчанию — &#x60;true&#x60;. Если возвращать отмененные заказы не нужно, передайте значение &#x60;false&#x60;. (optional, default to true)
     *
     */
    public function getShipmentStream(int $campaignId, int $shipmentId, ?bool $cancelledOrders): void
    {
        throw new \Exception('Not implemented');
    }
    /**
     * Operation getShipmentOrdersInfo
     *
     * Path: `/campaigns/{campaignId}/first-mile/shipments/{shipmentId}/orders/info`
     *
     * Получение информации о возможности печати ярлыков (FBS)
     *
     * @param int $campaignId Идентификатор кампании в API и магазина в кабинете. Каждая кампания в API соответствует магазину в кабинете.  Чтобы узнать идентификаторы своих магазинов, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html) (required)
     * @param int $shipmentId Идентификатор отгрузки. (required)
     *
     * @return \OpenAPIServer\Model\GetShipmentOrdersInfoResponse|null
     */
    public function getShipmentOrdersInfo(int $campaignId, int $shipmentId): \OpenAPIServer\Model\GetShipmentOrdersInfoResponse|null
    {
        throw new \Exception('Not implemented');
    }

    /**
     * Operation getShipmentOrdersInfo (stream)
     *
     * Path: `/campaigns/{campaignId}/first-mile/shipments/{shipmentId}/orders/info`
     *
     * Получение информации о возможности печати ярлыков (FBS)
     *
     * @param int $campaignId Идентификатор кампании в API и магазина в кабинете. Каждая кампания в API соответствует магазину в кабинете.  Чтобы узнать идентификаторы своих магазинов, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html) (required)
     * @param int $shipmentId Идентификатор отгрузки. (required)
     *
     */
    public function getShipmentOrdersInfoStream(int $campaignId, int $shipmentId): void
    {
        throw new \Exception('Not implemented');
    }
    /**
     * Operation searchShipments
     *
     * Path: `/campaigns/{campaignId}/first-mile/shipments`
     *
     * Получение информации о нескольких отгрузках
     *
     * @param int $campaignId Идентификатор кампании в API и магазина в кабинете. Каждая кампания в API соответствует магазину в кабинете.  Чтобы узнать идентификаторы своих магазинов, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html) (required)
     * @param \OpenAPIServer\Model\SearchShipmentsRequest $searchShipmentsRequest  (required)
     * @param ?string $pageToken Идентификатор страницы c результатами.  Если параметр не указан, возвращается первая страница.  Рекомендуется передавать значение выходного параметра &#x60;nextPageToken&#x60;, полученное при последнем запросе.  Если задан &#x60;page_token&#x60; и в запросе есть параметры &#x60;offset&#x60;, &#x60;page_number&#x60; и &#x60;page_size&#x60;, они игнорируются. (optional)
     * @param ?int $limit Количество значений на одной странице. (optional)
     *
     * @return \OpenAPIServer\Model\SearchShipmentsResponse|null
     */
    public function searchShipments(int $campaignId, \OpenAPIServer\Model\SearchShipmentsRequest $searchShipmentsRequest, ?string $pageToken, ?int $limit): \OpenAPIServer\Model\SearchShipmentsResponse|null
    {
        throw new \Exception('Not implemented');
    }

    /**
     * Operation searchShipments (stream)
     *
     * Path: `/campaigns/{campaignId}/first-mile/shipments`
     *
     * Получение информации о нескольких отгрузках
     *
     * @param int $campaignId Идентификатор кампании в API и магазина в кабинете. Каждая кампания в API соответствует магазину в кабинете.  Чтобы узнать идентификаторы своих магазинов, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html) (required)
     * @param \OpenAPIServer\Model\SearchShipmentsRequest $searchShipmentsRequest  (required)
     * @param ?string $pageToken Идентификатор страницы c результатами.  Если параметр не указан, возвращается первая страница.  Рекомендуется передавать значение выходного параметра &#x60;nextPageToken&#x60;, полученное при последнем запросе.  Если задан &#x60;page_token&#x60; и в запросе есть параметры &#x60;offset&#x60;, &#x60;page_number&#x60; и &#x60;page_size&#x60;, они игнорируются. (optional)
     * @param ?int $limit Количество значений на одной странице. (optional)
     *
     */
    public function searchShipmentsStream(int $campaignId, \OpenAPIServer\Model\SearchShipmentsRequest $searchShipmentsRequest, ?string $pageToken, ?int $limit): void
    {
        throw new \Exception('Not implemented');
    }
    /**
     * Operation setShipmentPalletsCount
     *
     * Path: `/campaigns/{campaignId}/first-mile/shipments/{shipmentId}/pallets`
     *
     * Передача количества упаковок в отгрузке
     *
     * @param int $campaignId Идентификатор кампании в API и магазина в кабинете. Каждая кампания в API соответствует магазину в кабинете.  Чтобы узнать идентификаторы своих магазинов, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html) (required)
     * @param int $shipmentId Идентификатор отгрузки. (required)
     * @param \OpenAPIServer\Model\SetShipmentPalletsCountRequest $setShipmentPalletsCountRequest  (required)
     *
     * @return \OpenAPIServer\Model\EmptyApiResponse|null
     */
    public function setShipmentPalletsCount(int $campaignId, int $shipmentId, \OpenAPIServer\Model\SetShipmentPalletsCountRequest $setShipmentPalletsCountRequest): \OpenAPIServer\Model\EmptyApiResponse|null
    {
        throw new \Exception('Not implemented');
    }

    /**
     * Operation setShipmentPalletsCount (stream)
     *
     * Path: `/campaigns/{campaignId}/first-mile/shipments/{shipmentId}/pallets`
     *
     * Передача количества упаковок в отгрузке
     *
     * @param int $campaignId Идентификатор кампании в API и магазина в кабинете. Каждая кампания в API соответствует магазину в кабинете.  Чтобы узнать идентификаторы своих магазинов, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html) (required)
     * @param int $shipmentId Идентификатор отгрузки. (required)
     * @param \OpenAPIServer\Model\SetShipmentPalletsCountRequest $setShipmentPalletsCountRequest  (required)
     *
     */
    public function setShipmentPalletsCountStream(int $campaignId, int $shipmentId, \OpenAPIServer\Model\SetShipmentPalletsCountRequest $setShipmentPalletsCountRequest): void
    {
        throw new \Exception('Not implemented');
    }
    /**
     * Operation transferOrdersFromShipment
     *
     * Path: `/campaigns/{campaignId}/first-mile/shipments/{shipmentId}/orders/transfer`
     *
     * Перенос заказов в следующую отгрузку
     *
     * @param int $campaignId Идентификатор кампании в API и магазина в кабинете. Каждая кампания в API соответствует магазину в кабинете.  Чтобы узнать идентификаторы своих магазинов, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html) (required)
     * @param int $shipmentId Идентификатор отгрузки. (required)
     * @param \OpenAPIServer\Model\TransferOrdersFromShipmentRequest $transferOrdersFromShipmentRequest  (required)
     *
     * @return \OpenAPIServer\Model\EmptyApiResponse|null
     */
    public function transferOrdersFromShipment(int $campaignId, int $shipmentId, \OpenAPIServer\Model\TransferOrdersFromShipmentRequest $transferOrdersFromShipmentRequest): \OpenAPIServer\Model\EmptyApiResponse|null
    {
        throw new \Exception('Not implemented');
    }

    /**
     * Operation transferOrdersFromShipment (stream)
     *
     * Path: `/campaigns/{campaignId}/first-mile/shipments/{shipmentId}/orders/transfer`
     *
     * Перенос заказов в следующую отгрузку
     *
     * @param int $campaignId Идентификатор кампании в API и магазина в кабинете. Каждая кампания в API соответствует магазину в кабинете.  Чтобы узнать идентификаторы своих магазинов, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html) (required)
     * @param int $shipmentId Идентификатор отгрузки. (required)
     * @param \OpenAPIServer\Model\TransferOrdersFromShipmentRequest $transferOrdersFromShipmentRequest  (required)
     *
     */
    public function transferOrdersFromShipmentStream(int $campaignId, int $shipmentId, \OpenAPIServer\Model\TransferOrdersFromShipmentRequest $transferOrdersFromShipmentRequest): void
    {
        throw new \Exception('Not implemented');
    }
}
