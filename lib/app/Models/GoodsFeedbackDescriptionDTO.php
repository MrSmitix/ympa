<?php
/**
 * GoodsFeedbackDescriptionDTO
 */
namespace app\Models;

/**
 * GoodsFeedbackDescriptionDTO
 * @description Текстовая часть отзыва.
 */
class GoodsFeedbackDescriptionDTO {

    /** @var string $advantages Описание плюсов товара в отзыве.*/
    public $advantages = "";

    /** @var string $disadvantages Описание минусов товара в отзыве.*/
    public $disadvantages = "";

    /** @var string $comment Комментарий в отзыве.*/
    public $comment = "";

}
