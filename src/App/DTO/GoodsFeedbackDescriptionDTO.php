<?php
declare(strict_types=1);

namespace App\DTO;

use Articus\DataTransfer\Annotation as DTA;

/**
 * Текстовая часть отзыва.
 */
class GoodsFeedbackDescriptionDTO
{
    /**
     * Описание плюсов товара в отзыве.
     * @DTA\Data(field="advantages", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     * @var string|null
     */
    public $advantages;

    /**
     * Описание минусов товара в отзыве.
     * @DTA\Data(field="disadvantages", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     * @var string|null
     */
    public $disadvantages;

    /**
     * Комментарий в отзыве.
     * @DTA\Data(field="comment", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     * @var string|null
     */
    public $comment;

}
