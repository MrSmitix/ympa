<?php
/**
 * GenerateShowsSalesReportRequest
 */
namespace app\Models;

/**
 * GenerateShowsSalesReportRequest
 * @description Данные, необходимые для генерации отчета.
 */
class GenerateShowsSalesReportRequest {

    /** @var int $businessId Идентификатор бизнеса.  Указывается, если нужно составить отчет по всем магазинам бизнеса. В запросе обязательно должен быть либо &#x60;businessID&#x60;, либо &#x60;campaignId&#x60;, но не оба сразу.*/
    public $businessId = 0;

    /** @var int $campaignId Идентификатор кампании.  Указывается, если нужно составить отчет по конкретному магазину. В запросе обязательно должен быть либо &#x60;businessID&#x60;, либо &#x60;campaignId&#x60;, но не оба сразу.*/
    public $campaignId = 0;

    /** @var \DateTime $dateFrom Начало периода, включительно.*/
    public $dateFrom;

    /** @var \DateTime $dateTo Конец периода, включительно.*/
    public $dateTo;

    /** @var string $grouping */
    public $grouping = "";

}
