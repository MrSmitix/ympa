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
     */
    public ?int $business_id = null;

    /**
     * {% note warning \&quot;\&quot; %}  Этот параметр устарел. Не используйте его.  {% endnote %}  Начало периода, включительно.
     * @DTA\Data(field="dateTimeFrom", nullable=true)
     * @DTA\Strategy(name="DateTime")
     * @DTA\Validator(name="DateTime")
     */
    public ?\DateTimeInterface $date_time_from = null;

    /**
     * {% note warning \&quot;\&quot; %}  Этот параметр устарел. Не используйте его.  {% endnote %}  Конец периода, включительно. Максимальный период — 1 год.
     * @DTA\Data(field="dateTimeTo", nullable=true)
     * @DTA\Strategy(name="DateTime")
     * @DTA\Validator(name="DateTime")
     */
    public ?\DateTimeInterface $date_time_to = null;

    /**
     * Начало периода, включительно.
     * @DTA\Data(field="dateFrom", nullable=true)
     * @DTA\Strategy(name="Date")
     * @DTA\Validator(name="Date")
     */
    public ?\DateTimeInterface $date_from = null;

    /**
     * Конец периода, включительно. Максимальный период — 1 год.
     * @DTA\Data(field="dateTo", nullable=true)
     * @DTA\Strategy(name="Date")
     * @DTA\Validator(name="Date")
     */
    public ?\DateTimeInterface $date_to = null;

    /**
     * Начальный год формирования акта.
     * @DTA\Data(field="yearFrom", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"int"})
     */
    public ?int $year_from = null;

    /**
     * Начальный номер месяца формирования акта.
     * @DTA\Data(field="monthFrom", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"int"})
     * @DTA\Validator(name="Range", options={"min":1, "max":12})
     */
    public ?int $month_from = null;

    /**
     * Конечный год формирования акта.
     * @DTA\Data(field="yearTo", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"int"})
     */
    public ?int $year_to = null;

    /**
     * Конечный номер месяца формирования акта.
     * @DTA\Data(field="monthTo", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"int"})
     * @DTA\Validator(name="Range", options={"min":1, "max":12})
     */
    public ?int $month_to = null;

    /**
     * Список моделей, которые нужны в отчете.
     * @DTA\Data(field="placementPrograms", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\Collection79::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\Collection79::class})
     */
    public ?\App\DTO\Collection79 $placement_programs = null;

    /**
     * Список ИНН, которые нужны в отчете.
     * @DTA\Data(field="inns", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\Collection80::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\Collection80::class})
     */
    public ?\App\DTO\Collection80 $inns = null;

    /**
     * Список магазинов, которые нужны в отчете.
     * @DTA\Data(field="campaignIds", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\Collection81::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\Collection81::class})
     */
    public ?\App\DTO\Collection81 $campaign_ids = null;

}
