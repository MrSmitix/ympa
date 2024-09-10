<?php
declare(strict_types=1);

namespace App\DTO;

use Articus\DataTransfer\Annotation as DTA;

/**
 * Предупреждение, которое появилось при добавлении товара в акцию или изменении его цен.
 */
class PromoOfferUpdateWarningDTO
{
    /**
     * @DTA\Data(field="code")
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\PromoOfferUpdateWarningCodeType::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\PromoOfferUpdateWarningCodeType::class})
     */
    public ?\App\DTO\PromoOfferUpdateWarningCodeType $code = null;

    /**
     * Идентификаторы магазинов в кабинете, для которых получены предупреждения.  Не возвращается, если предупреждения действуют для всех магазинов в кабинете.
     * @DTA\Data(field="campaignIds", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":::class})
     */
    public ?array $campaign_ids = null;

}
