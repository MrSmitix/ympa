<?php
/**
 * FeedPlacementDTO
 */
namespace app\Models;

/**
 * FeedPlacementDTO
 * @description Информация о размещении предложений из прайс-листа на Маркете на момент выполнения запроса.
 */
class FeedPlacementDTO {

    /** @var string $status */
    public $status = "";

    /** @var int $totalOffersCount Количество предложений из прайс-листа, которые размещаются на Яндекс Маркете в момент выполнения запроса.*/
    public $totalOffersCount = 0;

}
