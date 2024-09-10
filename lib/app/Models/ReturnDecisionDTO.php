<?php
/**
 * ReturnDecisionDTO
 */
namespace app\Models;

/**
 * ReturnDecisionDTO
 * @description Решения по возвратам.
 */
class ReturnDecisionDTO {

    /** @var int $returnItemId Идентификатор товара в возврате.*/
    public $returnItemId = 0;

    /** @var int $count Количество единиц товара.*/
    public $count = 0;

    /** @var string $comment Комментарий.*/
    public $comment = "";

    /** @var string $reasonType */
    public $reasonType = "";

    /** @var string $subreasonType */
    public $subreasonType = "";

    /** @var string $decisionType */
    public $decisionType = "";

    /** @var int $refundAmount Сумма возврата.*/
    public $refundAmount = 0;

    /** @var int $partnerCompensation Компенсация за обратную доставку.*/
    public $partnerCompensation = 0;

    /** @var string[]|null $images Список хеш-кодов фотографий товара от покупателя.*/
    public $images = null;

}
