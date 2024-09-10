<?php
declare(strict_types=1);

namespace App\DTO;

use Articus\DataTransfer\Annotation as DTA;

/**
 */
class CalculateTariffsRequest
{
    /**
     * @DTA\Data(field="parameters")
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\CalculateTariffsParametersDTO::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\CalculateTariffsParametersDTO::class})
     * @var \App\DTO\CalculateTariffsParametersDTO|null
     */
    public $parameters;

    /**
     * Товары, для которых нужно рассчитать стоимость услуг.
     * @DTA\Data(field="offers")
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\Collection119::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\Collection119::class})
     * @var \App\DTO\Collection119|null
     */
    public $offers;

}
