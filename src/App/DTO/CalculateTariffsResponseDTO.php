<?php
declare(strict_types=1);

namespace App\DTO;

use Articus\DataTransfer\Annotation as DTA;

/**
 * Расчет стоимости услуг.
 */
class CalculateTariffsResponseDTO
{
    /**
     * Стоимость услуг.
     * @DTA\Data(field="offers")
     * @DTA\Strategy(name="Object", options={"type":::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":::class})
     * @var \App\DTO\CalculateTariffsOfferInfoDTO[]|null
     */
    public $offers;

}
