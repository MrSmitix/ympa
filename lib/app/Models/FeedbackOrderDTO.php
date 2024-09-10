<?php
/**
 * FeedbackOrderDTO
 */
namespace app\Models;

/**
 * FeedbackOrderDTO
 * @description Информация о заказе, указанная в отзыве.
 */
class FeedbackOrderDTO {

    /** @var string $shopOrderId Номер заказа, указанный в отзыве.*/
    public $shopOrderId = "";

    /** @var string $delivery */
    public $delivery = "";

}
