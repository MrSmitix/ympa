<?php
declare(strict_types=1);

namespace App\DTO;

use Articus\DataTransfer\Annotation as DTA;

/**
 * Данные, необходимые для генерации отчета: идентификатор магазина, период, за который нужен отчет, а также фильтры.
 */
class GenerateUnitedMarketplaceServicesReportRequest
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
     * Начальный год формирования акта.
     * @DTA\Data(field="yearFrom", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"int"})
     * @var int|null
     */
    public $year_from;

    /**
     * Начальный номер месяца формирования акта.
     * @DTA\Data(field="monthFrom", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"int"})
     * @DTA\Validator(name="GreaterThan", options={"min":1, "inclusive":true})
     * @DTA\Validator(name="LessThan", options={"max":12, "inclusive":true})
     * @var int|null
     */
    public $month_from;

    /**
     * Конечный год формирования акта.
     * @DTA\Data(field="yearTo", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"int"})
     * @var int|null
     */
    public $year_to;

    /**
     * Конечный номер месяца формирования акта.
     * @DTA\Data(field="monthTo", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"int"})
     * @DTA\Validator(name="GreaterThan", options={"min":1, "inclusive":true})
     * @DTA\Validator(name="LessThan", options={"max":12, "inclusive":true})
     * @var int|null
     */
    public $month_to;

    /**
     * Список моделей, которые нужны в отчете.
     * @DTA\Data(field="placementPrograms", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\Collection79::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\Collection79::class})
     * @var \App\DTO\Collection79|null
     */
    public $placement_programs;

    /**
     * Список ИНН, которые нужны в отчете.
     * @DTA\Data(field="inns", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\Collection80::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\Collection80::class})
     * @var \App\DTO\Collection80|null
     */
    public $inns;

    /**
     * Список магазинов, которые нужны в отчете.
     * @DTA\Data(field="campaignIds", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\Collection81::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\Collection81::class})
     * @var \App\DTO\Collection81|null
     */
    public $campaign_ids;

}
