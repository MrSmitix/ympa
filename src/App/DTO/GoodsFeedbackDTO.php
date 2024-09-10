<?php
declare(strict_types=1);

namespace App\DTO;

use Articus\DataTransfer\Annotation as DTA;

/**
 * Отзыв о товаре.
 */
class GoodsFeedbackDTO
{
    /**
     * Идентификатор отзыва.
     * @DTA\Data(field="feedbackId")
     * @DTA\Validator(name="Scalar", options={"type":"int"})
     */
    public ?int $feedback_id = null;

    /**
     * Дата и время создания отзыва.
     * @DTA\Data(field="createdAt")
     * @DTA\Strategy(name="DateTime")
     * @DTA\Validator(name="DateTime")
     */
    public ?\DateTimeInterface $created_at = null;

    /**
     * Нужен ли ответ на отзыв.
     * @DTA\Data(field="needReaction")
     * @DTA\Validator(name="Scalar", options={"type":"bool"})
     */
    public ?bool $need_reaction = null;

    /**
     * @DTA\Data(field="identifiers")
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\GoodsFeedbackIdentifiersDTO::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\GoodsFeedbackIdentifiersDTO::class})
     */
    public ?\App\DTO\GoodsFeedbackIdentifiersDTO $identifiers = null;

    /**
     * Имя автора отзыва.
     * @DTA\Data(field="author", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     */
    public ?string $author = null;

    /**
     * @DTA\Data(field="description", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\GoodsFeedbackDescriptionDTO::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\GoodsFeedbackDescriptionDTO::class})
     */
    public ?\App\DTO\GoodsFeedbackDescriptionDTO $description = null;

    /**
     * @DTA\Data(field="media", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\GoodsFeedbackMediaDTO::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\GoodsFeedbackMediaDTO::class})
     */
    public ?\App\DTO\GoodsFeedbackMediaDTO $media = null;

    /**
     * @DTA\Data(field="statistics")
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\GoodsFeedbackStatisticsDTO::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\GoodsFeedbackStatisticsDTO::class})
     */
    public ?\App\DTO\GoodsFeedbackStatisticsDTO $statistics = null;

}
