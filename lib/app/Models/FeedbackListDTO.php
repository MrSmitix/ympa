<?php
/**
 * FeedbackListDTO
 */
namespace app\Models;

/**
 * FeedbackListDTO
 * @description Отзывы пользователей Яндекс Маркета об указанном магазине.
 */
class FeedbackListDTO {

    /** @var \app\Models\ScrollingPagerDTO $paging */
    public $paging;

    /** @var \app\Models\FeedbackDTO[] $feedbackList Список отзывов.  Содержит не более 20 отзывов.*/
    public $feedbackList = [];

}
