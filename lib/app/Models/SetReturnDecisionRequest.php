<?php
/**
 * SetReturnDecisionRequest
 */
namespace app\Models;

/**
 * SetReturnDecisionRequest
 * @description Решения по позиции в возврате.
 */
class SetReturnDecisionRequest {

    /** @var int $returnItemId Идентификатор товара в возврате.*/
    public $returnItemId = 0;

    /** @var string $decisionType */
    public $decisionType = "";

    /** @var string $comment Комментарий к решению. Укажите:  * для &#x60;REFUND_MONEY_INCLUDING_SHIPMENT&#x60;— стоимость обратной пересылки;  * для &#x60;REPAIR&#x60; — когда вы устраните недостатки товара;  * для &#x60;DECLINE_REFUND&#x60; — причину отказа;  * для &#x60;OTHER_DECISION&#x60; — какое решение вы предлагаете.*/
    public $comment = "";

}
