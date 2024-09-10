<?php
declare(strict_types=1);

namespace App\DTO;

use Articus\DataTransfer\Annotation as DTA;

/**
 * Информация о вознаграждениях партнеру за скидки на товар по промокодам, купонам и акциям.
 */
class OrderItemPromoDTO
{
    /**
     * @DTA\Data(field="type")
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\OrderPromoType::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\OrderPromoType::class})
     */
    public ?\App\DTO\OrderPromoType $type = null;

    /**
     * Размер пользовательской скидки в валюте покупателя.
     * @DTA\Data(field="discount", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"float"})
     */
    public ?float $discount = null;

    /**
     * Вознаграждение партнеру от Маркета за товар, проданный в рамках акции.  Передается в валюте заказа.
     * @DTA\Data(field="subsidy", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"float"})
     */
    public ?float $subsidy = null;

    /**
     * Идентификатор акции поставщика.
     * @DTA\Data(field="shopPromoId", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     */
    public ?string $shop_promo_id = null;

    /**
     * Идентификатор акции в рамках соглашения на оказание услуг по продвижению сервиса между Маркетом и партнером.  Параметр передается, только если параметр &#x60;type&#x3D;MARKET_DEAL&#x60;.
     * @DTA\Data(field="marketPromoId", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     */
    public ?string $market_promo_id = null;

}
