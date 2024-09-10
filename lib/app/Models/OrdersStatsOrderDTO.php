<?php
/**
 * OrdersStatsOrderDTO
 */
namespace app\Models;

/**
 * OrdersStatsOrderDTO
 * @description Информация о заказе.
 */
class OrdersStatsOrderDTO {

    /** @var int $id Идентификатор заказа.*/
    public $id = 0;

    /** @var \DateTime $creationDate Дата создания заказа.  Формат даты: &#x60;ГГГГ-ММ-ДД&#x60;.*/
    public $creationDate;

    /** @var \DateTime $statusUpdateDate Дата и время, когда статус заказа был изменен в последний раз.  Формат даты и времени: ISO 8601. Например, &#x60;2017-11-21T00:00:00&#x60;. Часовой пояс — UTC+03:00 (Москва).*/
    public $statusUpdateDate;

    /** @var string $status */
    public $status = "";

    /** @var string $partnerOrderId Идентификатор заказа в информационной системе магазина.*/
    public $partnerOrderId = "";

    /** @var string $paymentType */
    public $paymentType = "";

    /** @var bool $fake Тип заказа:  * &#x60;false&#x60; — настоящий заказ покупателя.  * &#x60;true&#x60; — [тестовый](../../pushapi/concepts/sandbox.md) заказ Маркета.*/
    public $fake = false;

    /** @var \app\Models\OrdersStatsDeliveryRegionDTO $deliveryRegion */
    public $deliveryRegion;

    /** @var \app\Models\OrdersStatsItemDTO[] $items Список товаров в заказе после возможных изменений.*/
    public $items = [];

    /** @var \app\Models\OrdersStatsItemDTO[]|null $initialItems Список товаров в заказе до изменений.*/
    public $initialItems = null;

    /** @var \app\Models\OrdersStatsPaymentDTO[] $payments Информация о денежных переводах по заказу.*/
    public $payments = [];

    /** @var \app\Models\OrdersStatsCommissionDTO[] $commissions Информация о комиссиях за заказ.*/
    public $commissions = [];

}
