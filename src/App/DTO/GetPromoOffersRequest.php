<?php
declare(strict_types=1);

namespace App\DTO;

use Articus\DataTransfer\Annotation as DTA;

/**
 * Получение списка товаров, которые участвуют или могут участвовать в акции.
 */
class GetPromoOffersRequest
{
    /**
     * Идентификатор акции.
     * @DTA\Data(field="promoId")
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     * @var string|null
     */
    public $promo_id;

    /**
     * @DTA\Data(field="statusType", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\PromoOfferParticipationStatusFilterType::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\PromoOfferParticipationStatusFilterType::class})
     * @var \App\DTO\PromoOfferParticipationStatusFilterType|null
     */
    public $status_type;

}
