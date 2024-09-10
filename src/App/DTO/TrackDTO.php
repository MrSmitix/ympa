<?php
declare(strict_types=1);

namespace App\DTO;

use Articus\DataTransfer\Annotation as DTA;

/**
 * Информация о трек-номерах.
 */
class TrackDTO
{
    /**
     * Трек-код почтового отправления.
     * @DTA\Data(field="trackCode", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     */
    public ?string $track_code = null;

}
