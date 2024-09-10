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
     * @DTA\Validator(name="Range", options={"min":1, "max":5})
     */
    public ?int $rating = null;

    /**
     * Количество комментариев к отзыву.  Учитываются только ответы на отзывы, а не дочерние комментарии.
     * @DTA\Data(field="commentsCount")
     * @DTA\Validator(name="Scalar", options={"type":"int"})
     */
    public ?int $comments_count = null;

    /**
     * Рекомендуют ли этот товар.
     * @DTA\Data(field="recommended", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"bool"})
     */
    public ?bool $recommended = null;

    /**
     * Количество баллов Плюса, которое автор получил за отзыв.
     * @DTA\Data(field="paidAmount", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"int"})
     */
    public ?int $paid_amount = null;

}
