<?php
/**
 * OrderItemSubsidyDTO
 */
namespace app\Models;

/**
 * OrderItemSubsidyDTO
 * @description Общее вознаграждение партнеру за все скидки на товар:  * по промокодам, купонам и акциям; * по баллам Плюса.  Передается в валюте заказа.
 */
class OrderItemSubsidyDTO {

    /** @var string $type */
    public $type = "";

    /** @var float $amount Сумма субсидии.*/
    public $amount = 0;

}
