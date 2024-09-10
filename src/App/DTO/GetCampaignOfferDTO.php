<?php
declare(strict_types=1);

namespace App\DTO;

use Articus\DataTransfer\Annotation as DTA;

/**
 * Параметры размещения товара в магазине.
 */
class GetCampaignOfferDTO
{
    /**
     * Ваш SKU — идентификатор товара в вашей системе.  Разрешена любая последовательность длиной до 255 знаков.  Правила использования SKU:  * У каждого товара SKU должен быть свой.  * SKU товара нельзя менять — можно только удалить товар и добавить заново с новым SKU.  * Уже заданный SKU нельзя освободить и использовать заново для другого товара. Каждый товар должен получать новый идентификатор, до того никогда не использовавшийся в вашем каталоге.  [Что такое SKU и как его назначать](https://yandex.ru/support/marketplace/assortment/add/index.html#fields)
     * @DTA\Data(field="offerId")
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     * @DTA\Validator(name="Length", options={"min":1, "max":255})
     * @DTA\Validator(name="Match", options={"pattern":"/^[^\x00-\x08\x0A-\x1f\x7f]{1,255}$/"})
     */
    public ?string $offer_id = null;

    /**
     * @DTA\Data(field="quantum", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\QuantumDTO::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\QuantumDTO::class})
     */
    public ?\App\DTO\QuantumDTO $quantum = null;

    /**
     * Есть ли товар в продаже.
     * @DTA\Data(field="available", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"bool"})
     */
    public ?bool $available = null;

    /**
     * @DTA\Data(field="basicPrice", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\GetPriceWithDiscountDTO::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\GetPriceWithDiscountDTO::class})
     */
    public ?\App\DTO\GetPriceWithDiscountDTO $basic_price = null;

    /**
     * @DTA\Data(field="campaignPrice", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\GetPriceWithVatDTO::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\GetPriceWithVatDTO::class})
     */
    public ?\App\DTO\GetPriceWithVatDTO $campaign_price = null;

    /**
     * @DTA\Data(field="status", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\OfferCampaignStatusType::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\OfferCampaignStatusType::class})
     */
    public ?\App\DTO\OfferCampaignStatusType $status = null;

    /**
     * Ошибки, препятствующие размещению товара на витрине.
     * @DTA\Data(field="errors", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":::class})
     */
    public ?array $errors = null;

    /**
     * Предупреждения, не препятствующие размещению товара на витрине.
     * @DTA\Data(field="warnings", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":::class})
     */
    public ?array $warnings = null;

}
