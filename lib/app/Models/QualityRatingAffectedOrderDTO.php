<?php
/**
 * QualityRatingAffectedOrderDTO
 */
namespace app\Models;

/**
 * QualityRatingAffectedOrderDTO
 * @description Информация о заказе, который повлиял на индекс качества.
 */
class QualityRatingAffectedOrderDTO {

    /** @var int $orderId Идентификатор заказа.*/
    public $orderId = 0;

    /** @var string $description Описание проблемы.*/
    public $description = "";

    /** @var string $componentType */
    public $componentType = "";

}
