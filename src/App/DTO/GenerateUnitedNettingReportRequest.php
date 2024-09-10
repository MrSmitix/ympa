<?php
declare(strict_types=1);

namespace App\DTO;

use Articus\DataTransfer\Annotation as DTA;

/**
 * Данные, необходимые для генерации отчета: идентификатор магазина, период, за который нужен отчет, а также фильтры.
 */
class GenerateUnitedNettingReportRequest
{
    /**
     * Идентификатор бизнеса.
     * @DTA\Data(field="businessId")
     * @DTA\Validator(name="Scalar", options={"type":"int"})
     * @var int|null
     */
    public $business_id;

    /**
     * {% note warning \&quot;\&quot; %}  Этот параметр устарел. Не используйте его.  {% endnote %}  Начало периода, включительно.
     * @DTA\Data(field="dateTimeFrom", nullable=true)
     * @DTA\Strategy(name="DateTime")
     * @DTA\Validator(name="Date", options={"format": \DateTime::RFC3339})
     * @var \DateTime|null
     */
    public $date_time_from;

    /**
     * {% note warning \&quot;\&quot; %}  Этот параметр устарел. Не используйте его.  {% endnote %}  Конец периода, включительно. Максимальный период — 1 год.
     * @DTA\Data(field="dateTimeTo", nullable=true)
     * @DTA\Strategy(name="DateTime")
     * @DTA\Validator(name="Date", options={"format": \DateTime::RFC3339})
     * @var \DateTime|null
     */
    public $date_time_to;

    /**
     * Начало периода, включительно.
     * @DTA\Data(field="dateFrom", nullable=true)
     * @DTA\Strategy(name="Date")
     * @DTA\Validator(name="Date")
     * @var \DateTime|null
     */
    public $date_from;

    /**
     * Конец периода, включительно. Максимальный период — 1 год.
     * @DTA\Data(field="dateTo", nullable=true)
     * @DTA\Strategy(name="Date")
     * @DTA\Validator(name="Date")
     * @var \DateTime|null
     */
    public $date_to;

    /**
     * Номер платежного поручения.
     * @DTA\Data(field="bankOrderId", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"int"})
     * @var int|null
     */
    public $bank_order_id;

    /**
     * Дата платежного поручения.
     * @DTA\Data(field="bankOrderDateTime", nullable=true)
     * @DTA\Strategy(name="DateTime")
     * @DTA\Validator(name="Date", options={"format": \DateTime::RFC3339})
     * @var \DateTime|null
     */
    public $bank_order_date_time;

    /**
     * Список моделей, которые нужны в отчете.
     * @DTA\Data(field="placementPrograms", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\Collection76::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\Collection76::class})
     * @var \App\DTO\Collection76|null
     */
    public $placement_programs;

    /**
     * Список ИНН, которые нужны в отчете.
     * @DTA\Data(field="inns", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\Collection77::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\Collection77::class})
     * @var \App\DTO\Collection77|null
     */
    public $inns;

    /**
     * Список магазинов, которые нужны в отчете.
     * @DTA\Data(field="campaignIds", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\Collection78::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\Collection78::class})
     * @var \App\DTO\Collection78|null
     */
    public $campaign_ids;

}
