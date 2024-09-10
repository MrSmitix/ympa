<?php
/**
 * SkipGoodsFeedbackReactionRequest
 */
namespace app\Models;

/**
 * SkipGoodsFeedbackReactionRequest
 * @description Идентификаторы отзывов.
 */
class SkipGoodsFeedbackReactionRequest {

    /** @var int[] $feedbackIds Список идентификаторов отзывов, на которые магазин не будет отвечать.*/
    public $feedbackIds = [];

}
