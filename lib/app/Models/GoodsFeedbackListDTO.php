<?php
/**
 * GoodsFeedbackListDTO
 */
namespace app\Models;

/**
 * GoodsFeedbackListDTO
 * @description Список отзывов о товарах.
 */
class GoodsFeedbackListDTO {

    /** @var \app\Models\GoodsFeedbackDTO[] $feedbacks Список отзывов.*/
    public $feedbacks = [];

    /** @var \app\Models\ForwardScrollingPagerDTO $paging */
    public $paging;

}
