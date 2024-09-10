<?php
/**
 * GenerateMassOrderLabelsRequest
 */
namespace app\Models;

/**
 * GenerateMassOrderLabelsRequest
 * @description Данные, необходимые для генерации файла.
 */
class GenerateMassOrderLabelsRequest {

    /** @var int $businessId Идентификатор кабинета.*/
    public $businessId = 0;

    /** @var int[] $orderIds Список идентификаторов заказов.*/
    public $orderIds = [];

}
