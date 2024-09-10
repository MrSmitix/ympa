<?php
declare(strict_types=1);

namespace App\DTO;

use Articus\DataTransfer\Annotation as DTA;

/**
 * Фото и видео.
 */
class GoodsFeedbackMediaDTO
{
    /**
     * Ссылки на фото.
     * @DTA\Data(field="photos", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":::class})
     * @var string[]|null
     */
    public $photos;

    /**
     * Ссылки на видео.
     * @DTA\Data(field="videos", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":::class})
     * @var string[]|null
     */
    public $videos;

}
