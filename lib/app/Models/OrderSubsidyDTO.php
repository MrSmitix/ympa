<?php
/**
 * OrderSubsidyDTO
 */
namespace app\Models;

/**
 * OrderSubsidyDTO
 * @description Общее вознаграждение партнеру за DBS-доставку и все скидки на товар:  * по промокодам, купонам и акциям; * по баллам Плюса; * по доставке (DBS).  Передается в валюте заказа.
 */
class OrderSubsidyDTO {

    /** @var string $type */
    public $type = "";

    /** @var float $amount Сумма субсидии.*/
    public $amount = 0;

}
