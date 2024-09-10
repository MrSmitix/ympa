<?php
/**
 * OrderItemPromoDTO
 */
namespace app\Models;

/**
 * OrderItemPromoDTO
 * @description Информация о вознаграждениях партнеру за скидки на товар по промокодам, купонам и акциям.
 */
class OrderItemPromoDTO {

    /** @var string $type */
    public $type = "";

    /** @var float $discount Размер пользовательской скидки в валюте покупателя.*/
    public $discount = 0;

    /** @var float $subsidy Вознаграждение партнеру от Маркета за товар, проданный в рамках акции.  Передается в валюте заказа.*/
    public $subsidy = 0;

    /** @var string $shopPromoId Идентификатор акции поставщика.*/
    public $shopPromoId = "";

    /** @var string $marketPromoId Идентификатор акции в рамках соглашения на оказание услуг по продвижению сервиса между Маркетом и партнером.  Параметр передается, только если параметр &#x60;type&#x3D;MARKET_DEAL&#x60;.*/
    public $marketPromoId = "";

}
