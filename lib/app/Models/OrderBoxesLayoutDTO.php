<?php
/**
 * OrderBoxesLayoutDTO
 */
namespace app\Models;

/**
 * OrderBoxesLayoutDTO
 * @description Распределение товаров по коробкам.
 */
class OrderBoxesLayoutDTO {

    /** @var \app\Models\EnrichedOrderBoxLayoutDTO[] $boxes Список коробок.*/
    public $boxes = [];

}
