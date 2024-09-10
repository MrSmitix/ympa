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
     */
    public ?string $advantages = null;

    /**
     * Описание минусов товара в отзыве.
     * @DTA\Data(field="disadvantages", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     */
    public ?string $disadvantages = null;

    /**
     * Комментарий в отзыве.
     * @DTA\Data(field="comment", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     */
    public ?string $comment = null;

}
