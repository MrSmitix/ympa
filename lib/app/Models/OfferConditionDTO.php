<?php
/**
 * OfferConditionDTO
 */
namespace app\Models;

/**
 * OfferConditionDTO
 * @description Состояние уцененного товара.
 */
class OfferConditionDTO {

    /** @var string $type */
    public $type = "";

    /** @var string $quality */
    public $quality = "";

    /** @var string $reason Описание товара. Подробно опишите дефекты, насколько они заметны и где их искать.*/
    public $reason = "";

}
