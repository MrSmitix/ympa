<?php
declare(strict_types=1);

namespace App\DTO;

use Articus\DataTransfer\Annotation as DTA;

/**
 * Информация о новой цене на товар.
 */
class BaseCampaignOfferDTO
{
    /**
     * Ваш SKU — идентификатор товара в вашей системе.  Разрешена любая последовательность длиной до 255 знаков.  Правила использования SKU:  * У каждого товара SKU должен быть свой.  * SKU товара нельзя менять — можно только удалить товар и добавить заново с новым SKU.  * Уже заданный SKU нельзя освободить и использовать заново для другого товара. Каждый товар должен получать новый идентификатор, до того никогда не использовавшийся в вашем каталоге.  [Что такое SKU и как его назначать](https://yandex.ru/support/marketplace/assortment/add/index.html#fields)
     * @DTA\Data(field="offerId")
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     * @DTA\Validator(name="StringLength", options={"min":1, "max":255})
     * @DTA\Validator(name="Regex", options={"pattern":"/^[^\\x00-\\x08\\x0A-\\x1f\\x7f]{1,255}$/"})
     * @var string|null
     */
    public $offer_id;

    /**
     * @DTA\Data(field="quantum", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\QuantumDTO::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\QuantumDTO::class})
     * @var \App\DTO\QuantumDTO|null
     */
    public $quantum;

    /**
     * Есть ли товар в продаже.
     * @DTA\Data(field="available", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"bool"})
     * @var bool|null
     */
    public $available;

}