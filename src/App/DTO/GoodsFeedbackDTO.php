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
     * @var int|null
     */
    public $feedback_id;

    /**
     * Дата и время создания отзыва.
     * @DTA\Data(field="createdAt")
     * @DTA\Strategy(name="DateTime")
     * @DTA\Validator(name="Date", options={"format": \DateTime::RFC3339})
     * @var \DateTime|null
     */
    public $created_at;

    /**
     * Нужен ли ответ на отзыв.
     * @DTA\Data(field="needReaction")
     * @DTA\Validator(name="Scalar", options={"type":"bool"})
     * @var bool|null
     */
    public $need_reaction;

    /**
     * @DTA\Data(field="identifiers")
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\GoodsFeedbackIdentifiersDTO::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\GoodsFeedbackIdentifiersDTO::class})
     * @var \App\DTO\GoodsFeedbackIdentifiersDTO|null
     */
    public $identifiers;

    /**
     * Имя автора отзыва.
     * @DTA\Data(field="author", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     * @var string|null
     */
    public $author;

    /**
     * @DTA\Data(field="description", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\GoodsFeedbackDescriptionDTO::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\GoodsFeedbackDescriptionDTO::class})
     * @var \App\DTO\GoodsFeedbackDescriptionDTO|null
     */
    public $description;

    /**
     * @DTA\Data(field="media", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\GoodsFeedbackMediaDTO::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\GoodsFeedbackMediaDTO::class})
     * @var \App\DTO\GoodsFeedbackMediaDTO|null
     */
    public $media;

    /**
     * @DTA\Data(field="statistics")
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\GoodsFeedbackStatisticsDTO::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\GoodsFeedbackStatisticsDTO::class})
     * @var \App\DTO\GoodsFeedbackStatisticsDTO|null
     */
    public $statistics;

}
