<?php
declare(strict_types=1);

namespace App\DTO;

use Articus\DataTransfer\Annotation as DTA;

/**
 * Информация о типе акции.
 */
class GetPromoMechanicsInfoDTO
{
    /**
     * @DTA\Data(field="type")
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\MechanicsType::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\MechanicsType::class})
     */
    public ?\App\DTO\MechanicsType $type = null;

    /**
     * @DTA\Data(field="promocodeInfo", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\GetPromoPromocodeInfoDTO::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\GetPromoPromocodeInfoDTO::class})
     */
    public ?\App\DTO\GetPromoPromocodeInfoDTO $promocode_info = null;

}
