# # OrdersStatsOrderDTO

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **int** | Идентификатор заказа. | [optional]
**creation_date** | **\DateTime** | Дата создания заказа.  Формат даты: &#x60;ГГГГ-ММ-ДД&#x60;. | [optional]
**status_update_date** | **\DateTime** | Дата и время, когда статус заказа был изменен в последний раз.  Формат даты и времени: ISO 8601. Например, &#x60;2017-11-21T00:00:00&#x60;. Часовой пояс — UTC+03:00 (Москва). | [optional]
**status** | [**\OpenAPI\Client\Model\OrderStatsStatusType**](OrderStatsStatusType.md) |  | [optional]
**partner_order_id** | **string** | Идентификатор заказа в информационной системе магазина. | [optional]
**payment_type** | [**\OpenAPI\Client\Model\OrdersStatsOrderPaymentType**](OrdersStatsOrderPaymentType.md) |  | [optional]
**fake** | **bool** | Тип заказа:  * &#x60;false&#x60; — настоящий заказ покупателя.  * &#x60;true&#x60; — [тестовый](../../pushapi/concepts/sandbox.md) заказ Маркета. | [optional]
**delivery_region** | [**\OpenAPI\Client\Model\OrdersStatsDeliveryRegionDTO**](OrdersStatsDeliveryRegionDTO.md) |  | [optional]
**items** | [**\OpenAPI\Client\Model\OrdersStatsItemDTO[]**](OrdersStatsItemDTO.md) | Список товаров в заказе после возможных изменений. |
**initial_items** | [**\OpenAPI\Client\Model\OrdersStatsItemDTO[]**](OrdersStatsItemDTO.md) | Список товаров в заказе до изменений. | [optional]
**payments** | [**\OpenAPI\Client\Model\OrdersStatsPaymentDTO[]**](OrdersStatsPaymentDTO.md) | Информация о денежных переводах по заказу. |
**commissions** | [**\OpenAPI\Client\Model\OrdersStatsCommissionDTO[]**](OrdersStatsCommissionDTO.md) | Информация о комиссиях за заказ. |

[[Back to Model list]](../../README.md#models) [[Back to API list]](../../README.md#endpoints) [[Back to README]](../../README.md)
