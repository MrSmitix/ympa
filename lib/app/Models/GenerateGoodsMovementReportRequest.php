<?php
/**
 * GenerateGoodsMovementReportRequest
 */
namespace app\Models;

/**
 * GenerateGoodsMovementReportRequest
 * @description Данные, необходимые для генерации отчета.
 */
class GenerateGoodsMovementReportRequest {

    /** @var int $campaignId Идентификатор кампании.*/
    public $campaignId = 0;

    /** @var \DateTime $dateFrom Начало периода, включительно.*/
    public $dateFrom;

    /** @var \DateTime $dateTo Конец периода, включительно.*/
    public $dateTo;

    /** @var string $shopSku Ваш SKU — идентификатор товара в вашей системе.  Разрешена любая последовательность длиной до 255 знаков.  Правила использования SKU:  * У каждого товара SKU должен быть свой.  * SKU товара нельзя менять — можно только удалить товар и добавить заново с новым SKU.  * Уже заданный SKU нельзя освободить и использовать заново для другого товара. Каждый товар должен получать новый идентификатор, до того никогда не использовавшийся в вашем каталоге.  [Что такое SKU и как его назначать](https://yandex.ru/support/marketplace/assortment/add/index.html#fields)*/
    public $shopSku = "";

}
