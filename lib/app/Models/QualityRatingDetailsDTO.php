<?php
/**
 * QualityRatingDetailsDTO
 */
namespace app\Models;

/**
 * QualityRatingDetailsDTO
 * @description Информация о заказах, которые повлияли на индекс качества.
 */
class QualityRatingDetailsDTO {

    /** @var \app\Models\QualityRatingAffectedOrderDTO[] $affectedOrders Список заказов, которые повлияли на индекс качества.*/
    public $affectedOrders = [];

}
