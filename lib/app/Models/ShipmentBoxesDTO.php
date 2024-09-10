<?php
/**
 * ShipmentBoxesDTO
 */
namespace app\Models;

/**
 * ShipmentBoxesDTO
 * @description В ответе Маркет возвращает переданный вами список грузовых мест. Не обращайте на это поле внимания.
 */
class ShipmentBoxesDTO {

    /** @var \app\Models\ParcelBoxDTO[] $boxes Список грузовых мест. Маркет определил количество мест по длине этого списка.*/
    public $boxes = [];

}
