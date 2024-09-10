<?php
/**
 * ParcelDTO
 */
namespace app\Models;

/**
 * ParcelDTO
 * @description Информация о грузовых местах в заказе.
 */
class ParcelDTO {

    /** @var \app\Models\ParcelBoxDTO[] $boxes Список грузовых мест. Маркет определяет количество мест по длине этого списка.*/
    public $boxes = [];

}
