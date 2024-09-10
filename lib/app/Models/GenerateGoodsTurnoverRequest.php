<?php
/**
 * GenerateGoodsTurnoverRequest
 */
namespace app\Models;

/**
 * GenerateGoodsTurnoverRequest
 * @description Данные, необходимые для генерации отчета.
 */
class GenerateGoodsTurnoverRequest {

    /** @var int $campaignId Идентификатор кампании.*/
    public $campaignId = 0;

    /** @var \DateTime $date Дата, за которую нужно рассчитать оборачиваемость. Если параметр не указан, используется текущая дата.*/
    public $date;

}
