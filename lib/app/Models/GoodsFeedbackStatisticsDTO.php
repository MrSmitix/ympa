<?php
/**
 * GoodsFeedbackStatisticsDTO
 */
namespace app\Models;

/**
 * GoodsFeedbackStatisticsDTO
 * @description Статистическая информация по отзыву.
 */
class GoodsFeedbackStatisticsDTO {

    /** @var int $rating Оценка товара.*/
    public $rating = 0;

    /** @var int $commentsCount Количество комментариев к отзыву.  Учитываются только ответы на отзывы, а не дочерние комментарии.*/
    public $commentsCount = 0;

    /** @var bool $recommended Рекомендуют ли этот товар.*/
    public $recommended = false;

    /** @var int $paidAmount Количество баллов Плюса, которое автор получил за отзыв.*/
    public $paidAmount = 0;

}
