<?php
declare(strict_types=1);

namespace App\DTO;

use Articus\DataTransfer\Annotation as DTA;

/**
 * Информация об авторе отзыва.  Если отзыв оставлен анонимно, параметр не возвращается.
 */
class FeedbackAuthorDTO
{
    /**
     * Имя автора отзыва.
     * @DTA\Data(field="name", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     * @var string|null
     */
    public $name;

    /**
     * @DTA\Data(field="region", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\RegionDTO::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\RegionDTO::class})
     * @var \App\DTO\RegionDTO|null
     */
    public $region;

}
