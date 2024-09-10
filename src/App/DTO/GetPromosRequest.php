<?php
declare(strict_types=1);

namespace App\DTO;

use Articus\DataTransfer\Annotation as DTA;

/**
 * Фильтры для получения списка акций.
 */
class GetPromosRequest
{
    /**
     * @DTA\Data(field="participation", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\PromoParticipationType::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\PromoParticipationType::class})
     * @var \App\DTO\PromoParticipationType|null
     */
    public $participation;

    /**
     * @DTA\Data(field="mechanics", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\MechanicsType::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\MechanicsType::class})
     * @var \App\DTO\MechanicsType|null
     */
    public $mechanics;

}
