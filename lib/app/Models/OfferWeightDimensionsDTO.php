<?php
/**
 * OfferWeightDimensionsDTO
 */
namespace app\Models;

/**
 * OfferWeightDimensionsDTO
 * @description Габариты упаковки и вес товара.  Если товар занимает несколько коробок, перед измерением размеров сложите их компактно.  ![Схема измерения многоместных грузов](../../_images/reference/boxes-measure.png)
 */
class OfferWeightDimensionsDTO {

    /** @var float $length Длина упаковки в см.*/
    public $length = 0;

    /** @var float $width Ширина упаковки в см.*/
    public $width = 0;

    /** @var float $height Высота упаковки в см.*/
    public $height = 0;

    /** @var float $weight Вес товара в кг с учетом упаковки (брутто).*/
    public $weight = 0;

}
