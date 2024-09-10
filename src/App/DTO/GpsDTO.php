<?php
declare(strict_types=1);

namespace App\DTO;

use Articus\DataTransfer\Annotation as DTA;

/**
 * GPS-координаты широты и долготы.
 */
class GpsDTO
{
    /**
     * Широта.
     * @DTA\Data(field="latitude")
     * @DTA\Validator(name="Scalar", options={"type":"float"})
     */
    public ?float $latitude = null;

    /**
     * Долгота.
     * @DTA\Data(field="longitude")
     * @DTA\Validator(name="Scalar", options={"type":"float"})
     */
    public ?float $longitude = null;

}
