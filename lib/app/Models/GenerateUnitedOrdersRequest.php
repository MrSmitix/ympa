<?php
/**
 * GenerateUnitedOrdersRequest
 */
namespace app\Models;

/**
 * GenerateUnitedOrdersRequest
 * @description Данные, необходимые для генерации отчета.
 */
class GenerateUnitedOrdersRequest {

    /** @var int $businessId Идентификатор бизнеса.*/
    public $businessId = 0;

    /** @var \DateTime $dateFrom Начало периода, включительно.*/
    public $dateFrom;

    /** @var \DateTime $dateTo Конец периода, включительно. Максимальный период — 1 год.*/
    public $dateTo;

    /** @var int[]|null $campaignIds Список магазинов, которые нужны в отчете.*/
    public $campaignIds = null;

    /** @var string $promoId Идентификатор акции, товары из которой нужны в отчете.*/
    public $promoId = "";

}
