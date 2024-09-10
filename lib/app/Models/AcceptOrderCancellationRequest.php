<?php
/**
 * AcceptOrderCancellationRequest
 */
namespace app\Models;

/**
 * AcceptOrderCancellationRequest
 */
class AcceptOrderCancellationRequest {

    /** @var bool $accepted Решение об отмене заказа:  * &#x60;true&#x60; — заказ отменяется, служба доставки узнала об отмене до передачи заказа покупателю. * &#x60;false&#x60; — заказ не отменяется, так как он уже доставлен покупателю курьером или передан в пункт выдачи заказов.*/
    public $accepted = false;

    /** @var string $reason */
    public $reason = "";

}
