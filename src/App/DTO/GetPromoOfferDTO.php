<?php
declare(strict_types=1);

namespace App\DTO;

use Articus\DataTransfer\Annotation as DTA;

/**
 * Товар, который участвует или может участвовать в акции.
 */
class GetPromoOfferDTO
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
     * @DTA\Data(field="status")
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\PromoOfferParticipationStatusType::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\PromoOfferParticipationStatusType::class})
     */
    public ?\App\DTO\PromoOfferParticipationStatusType $status = null;

    /**
     * @DTA\Data(field="params")
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\PromoOfferParamsDTO::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\PromoOfferParamsDTO::class})
     */
    public ?\App\DTO\PromoOfferParamsDTO $params = null;

    /**
     * @DTA\Data(field="autoParticipatingDetails", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\PromoOfferAutoParticipatingDetailsDTO::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\PromoOfferAutoParticipatingDetailsDTO::class})
     */
    public ?\App\DTO\PromoOfferAutoParticipatingDetailsDTO $auto_participating_details = null;

}
