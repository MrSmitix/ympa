<?php
declare(strict_types=1);

namespace App\DTO;

use Articus\DataTransfer\Annotation as DTA;

/**
 * Информация об акциях Маркета.
 */
class GetPromosResultDTO
{
    /**
     * Акции Маркета.
     * @DTA\Data(field="promos")
     * @DTA\Strategy(name="Object", options={"type":::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":::class})
     */
    public ?array $promos = null;

}
