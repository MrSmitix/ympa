<?php
declare(strict_types=1);

namespace App\DTO;

use Articus\DataTransfer\Annotation as DTA;

/**
 * Описание товаров, которые участвуют в акции.
 */
class UpdatePromoOfferDTO
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
     * @DTA\Data(field="params", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\UpdatePromoOfferParamsDTO::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\UpdatePromoOfferParamsDTO::class})
     */
    public ?\App\DTO\UpdatePromoOfferParamsDTO $params = null;

}
