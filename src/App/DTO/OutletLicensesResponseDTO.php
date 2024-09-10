<?php
declare(strict_types=1);

namespace App\DTO;

use Articus\DataTransfer\Annotation as DTA;

/**
 * Ответ на запрос информации о лицензиях для точек продаж.
 */
class OutletLicensesResponseDTO
{
    /**
     * Список лицензий.
     * @DTA\Data(field="licenses")
     * @DTA\Strategy(name="Object", options={"type":::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":::class})
     * @var \App\DTO\FullOutletLicenseDTO[]|null
     */
    public $licenses;

}
