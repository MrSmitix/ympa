<?php
declare(strict_types=1);

namespace App\DTO;

use Articus\DataTransfer\Annotation as DTA;

/**
 * Данные, необходимые для генерации отчета.
 */
class GenerateShowsSalesReportRequest
{
    /**
     * Идентификатор бизнеса.  Указывается, если нужно составить отчет по всем магазинам бизнеса. В запросе обязательно должен быть либо &#x60;businessID&#x60;, либо &#x60;campaignId&#x60;, но не оба сразу.
     * @DTA\Data(field="businessId", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"int"})
     * @var int|null
     */
    public $business_id;

    /**
     * Идентификатор кампании.  Указывается, если нужно составить отчет по конкретному магазину. В запросе обязательно должен быть либо &#x60;businessID&#x60;, либо &#x60;campaignId&#x60;, но не оба сразу.
     * @DTA\Data(field="campaignId", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"int"})
     * @var int|null
     */
    public $campaign_id;

    /**
     * Начало периода, включительно.
     * @DTA\Data(field="dateFrom")
     * @DTA\Strategy(name="Date")
     * @DTA\Validator(name="Date")
     * @var \DateTime|null
     */
    public $date_from;

    /**
     * Конец периода, включительно.
     * @DTA\Data(field="dateTo")
     * @DTA\Strategy(name="Date")
     * @DTA\Validator(name="Date")
     * @var \DateTime|null
     */
    public $date_to;

    /**
     * @DTA\Data(field="grouping")
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\ShowsSalesGroupingType::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\ShowsSalesGroupingType::class})
     * @var \App\DTO\ShowsSalesGroupingType|null
     */
    public $grouping;

}
