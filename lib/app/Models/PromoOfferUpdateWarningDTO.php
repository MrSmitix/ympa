<?php
/**
 * PromoOfferUpdateWarningDTO
 */
namespace app\Models;

/**
 * PromoOfferUpdateWarningDTO
 * @description Предупреждение, которое появилось при добавлении товара в акцию или изменении его цен.
 */
class PromoOfferUpdateWarningDTO {

    /** @var string $code */
    public $code = "";

    /** @var int[]|null $campaignIds Идентификаторы магазинов в кабинете, для которых получены предупреждения.  Не возвращается, если предупреждения действуют для всех магазинов в кабинете.*/
    public $campaignIds = null;

}
