<?php
/**
 * GoodsFeedbackIdentifiersDTO
 */
namespace app\Models;

/**
 * GoodsFeedbackIdentifiersDTO
 * @description Идентификаторы, которые связаны с отзывом.
 */
class GoodsFeedbackIdentifiersDTO {

    /** @var int $orderId Идентификатор заказа на Маркете.*/
    public $orderId = 0;

    /** @var int $modelId Идентификатор модели товара.*/
    public $modelId = 0;

}
