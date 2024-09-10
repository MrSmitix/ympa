<?php
/**
 * GoodsFeedbackDTO
 */
namespace app\Models;

/**
 * GoodsFeedbackDTO
 * @description Отзыв о товаре.
 */
class GoodsFeedbackDTO {

    /** @var int $feedbackId Идентификатор отзыва.*/
    public $feedbackId = 0;

    /** @var \DateTime $createdAt Дата и время создания отзыва.*/
    public $createdAt;

    /** @var bool $needReaction Нужен ли ответ на отзыв.*/
    public $needReaction = false;

    /** @var \app\Models\GoodsFeedbackIdentifiersDTO $identifiers */
    public $identifiers;

    /** @var string $author Имя автора отзыва.*/
    public $author = "";

    /** @var \app\Models\GoodsFeedbackDescriptionDTO $description */
    public $description;

    /** @var \app\Models\GoodsFeedbackMediaDTO $media */
    public $media;

    /** @var \app\Models\GoodsFeedbackStatisticsDTO $statistics */
    public $statistics;

}
