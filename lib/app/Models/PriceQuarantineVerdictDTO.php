<?php
/**
 * PriceQuarantineVerdictDTO
 */
namespace app\Models;

/**
 * PriceQuarantineVerdictDTO
 * @description Причина попадания товара в карантин.
 */
class PriceQuarantineVerdictDTO {

    /** @var string $type */
    public $type = "";

    /** @var \app\Models\PriceQuarantineVerdictParameterDTO[] $params Цена, из-за которой товар попал в карантин, и значения для сравнения. Конкретный набор параметров зависит от типа карантина.*/
    public $params = [];

}
