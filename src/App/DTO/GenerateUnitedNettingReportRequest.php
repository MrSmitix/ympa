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
     * Номер платежного поручения.
     * @DTA\Data(field="bankOrderId", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"int"})
     */
    public ?int $bank_order_id = null;

    /**
     * Дата платежного поручения.
     * @DTA\Data(field="bankOrderDateTime", nullable=true)
     * @DTA\Strategy(name="DateTime")
     * @DTA\Validator(name="DateTime")
     */
    public ?\DateTimeInterface $bank_order_date_time = null;

    /**
     * Список моделей, которые нужны в отчете.
     * @DTA\Data(field="placementPrograms", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\Collection76::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\Collection76::class})
     */
    public ?\App\DTO\Collection76 $placement_programs = null;

    /**
     * Список ИНН, которые нужны в отчете.
     * @DTA\Data(field="inns", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\Collection77::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\Collection77::class})
     */
    public ?\App\DTO\Collection77 $inns = null;

    /**
     * Список магазинов, которые нужны в отчете.
     * @DTA\Data(field="campaignIds", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\Collection78::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\Collection78::class})
     */
    public ?\App\DTO\Collection78 $campaign_ids = null;

}
