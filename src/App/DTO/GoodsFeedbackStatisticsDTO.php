<?php
declare(strict_types=1);

namespace App\DTO;

use Articus\DataTransfer\Annotation as DTA;

/**
 * Статистическая информация по отзыву.
 */
class GoodsFeedbackStatisticsDTO
{
    /**
     * Оценка товара.
     * @DTA\Data(field="rating")
     * @DTA\Validator(name="Scalar", options={"type":"int"})
     * @DTA\Validator(name="GreaterThan", options={"min":1, "inclusive":true})
     * @DTA\Validator(name="LessThan", options={"max":5, "inclusive":true})
     * @var int|null
     */
    public $rating;

    /**
     * Количество комментариев к отзыву.  Учитываются только ответы на отзывы, а не дочерние комментарии.
     * @DTA\Data(field="commentsCount")
     * @DTA\Validator(name="Scalar", options={"type":"int"})
     * @var int|null
     */
    public $comments_count;

    /**
     * Рекомендуют ли этот товар.
     * @DTA\Data(field="recommended", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"bool"})
     * @var bool|null
     */
    public $recommended;

    /**
     * Количество баллов Плюса, которое автор получил за отзыв.
     * @DTA\Data(field="paidAmount", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"int"})
     * @var int|null
     */
    public $paid_amount;

}
