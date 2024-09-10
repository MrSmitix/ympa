<?php
declare(strict_types=1);

namespace App\DTO;

use Articus\DataTransfer\Annotation as DTA;

/**
 * Товар в карантине.
 */
class QuarantineOfferDTO
{
    /**
     * Ваш SKU — идентификатор товара в вашей системе.  Разрешена любая последовательность длиной до 255 знаков.  Правила использования SKU:  * У каждого товара SKU должен быть свой.  * SKU товара нельзя менять — можно только удалить товар и добавить заново с новым SKU.  * Уже заданный SKU нельзя освободить и использовать заново для другого товара. Каждый товар должен получать новый идентификатор, до того никогда не использовавшийся в вашем каталоге.  [Что такое SKU и как его назначать](https://yandex.ru/support/marketplace/assortment/add/index.html#fields)
     * @DTA\Data(field="offerId", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     * @DTA\Validator(name="Length", options={"min":1, "max":255})
     * @DTA\Validator(name="Match", options={"pattern":"/^[^\x00-\x08\x0A-\x1f\x7f]{1,255}$/"})
     */
    public ?string $offer_id = null;

    /**
     * @DTA\Data(field="currentPrice", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\BasePriceDTO::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\BasePriceDTO::class})
     */
    public ?\App\DTO\BasePriceDTO $current_price = null;

    /**
     * @DTA\Data(field="lastValidPrice", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\BasePriceDTO::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\BasePriceDTO::class})
     */
    public ?\App\DTO\BasePriceDTO $last_valid_price = null;

    /**
     * Причины попадания товара в карантин.
     * @DTA\Data(field="verdicts", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":::class})
     */
    public ?array $verdicts = null;

}
