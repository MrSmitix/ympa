<?php
declare(strict_types=1);

namespace App\DTO;

use Articus\DataTransfer\Annotation as DTA;

/**
 * Количество палет в отгрузке.
 */
class PalletsCountDTO
{
    /**
     * Количество палет, которое заявил продавец.
     * @DTA\Data(field="planned", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"int"})
     * @var int|null
     */
    public $planned;

    /**
     * Количество палет, которое приняли в сортировочном центре.
     * @DTA\Data(field="fact", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"int"})
     * @var int|null
     */
    public $fact;

}
