<?php
/**
 * SetOrderShipmentBoxesRequest
 */
namespace app\Models;

/**
 * SetOrderShipmentBoxesRequest
 */
class SetOrderShipmentBoxesRequest {

    /** @var \app\Models\ParcelBoxDTO[] $boxes Список грузовых мест. Маркет определяет количество мест по длине этого списка.*/
    public $boxes = [];

}
