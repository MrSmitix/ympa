<?php
/**
 * ConfirmPricesRequest
 */
namespace app\Models;

/**
 * ConfirmPricesRequest
 * @description Запрос на подтверждение цены.
 */
class ConfirmPricesRequest {

    /** @var string[] $offerIds Идентификаторы товаров, у которых подтверждается цена.*/
    public $offerIds = [];

}
