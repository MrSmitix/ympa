<?php
/**
 * GenerateUnitedMarketplaceServicesReportRequest
 */
namespace app\Models;

/**
 * GenerateUnitedMarketplaceServicesReportRequest
 * @description Данные, необходимые для генерации отчета: идентификатор магазина, период, за который нужен отчет, а также фильтры.
 */
class GenerateUnitedMarketplaceServicesReportRequest {

    /** @var int $businessId Идентификатор бизнеса.*/
    public $businessId = 0;

    /** @var \DateTime $dateTimeFrom {% note warning \&quot;\&quot; %}  Этот параметр устарел. Не используйте его.  {% endnote %}  Начало периода, включительно.*/
    public $dateTimeFrom;

    /** @var \DateTime $dateTimeTo {% note warning \&quot;\&quot; %}  Этот параметр устарел. Не используйте его.  {% endnote %}  Конец периода, включительно. Максимальный период — 1 год.*/
    public $dateTimeTo;

    /** @var \DateTime $dateFrom Начало периода, включительно.*/
    public $dateFrom;

    /** @var \DateTime $dateTo Конец периода, включительно. Максимальный период — 1 год.*/
    public $dateTo;

    /** @var int $yearFrom Начальный год формирования акта.*/
    public $yearFrom = 0;

    /** @var int $monthFrom Начальный номер месяца формирования акта.*/
    public $monthFrom = 0;

    /** @var int $yearTo Конечный год формирования акта.*/
    public $yearTo = 0;

    /** @var int $monthTo Конечный номер месяца формирования акта.*/
    public $monthTo = 0;

    /** @var \app\Models\PlacementType[]|null $placementPrograms Список моделей, которые нужны в отчете.*/
    public $placementPrograms = null;

    /** @var string[]|null $inns Список ИНН, которые нужны в отчете.*/
    public $inns = null;

    /** @var int[]|null $campaignIds Список магазинов, которые нужны в отчете.*/
    public $campaignIds = null;

}
