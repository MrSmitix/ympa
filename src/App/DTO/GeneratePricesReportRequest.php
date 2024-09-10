<?php
declare(strict_types=1);

namespace App\DTO;

use Articus\DataTransfer\Annotation as DTA;

/**
 * Данные, необходимые для генерации отчета.
 */
class GeneratePricesReportRequest
{
    /**
     * Идентификатор бизнеса.  В большинстве случаев обязателен. Не указывается, если задан &#x60;campaignId&#x60;.
     * @DTA\Data(field="businessId", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"int"})
     * @var int|null
     */
    public $business_id;

    /**
     * Идентификатор кампании.  Как правило, не используется. Передавайте только если в кабинете есть магазины с уникальными ценами и вы хотите получить отчет для них. В этом случае передавать &#x60;businessId&#x60; не нужно.
     * @DTA\Data(field="campaignId", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"int"})
     * @var int|null
     */
    public $campaign_id;

    /**
     * Фильтр по категориям на Маркете.
     * @DTA\Data(field="categoryIds", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\Collection83::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\Collection83::class})
     * @var \App\DTO\Collection83|null
     */
    public $category_ids;

    /**
     * Фильтр по времени появления предложения — начало периода.  Формат даты: &#x60;ДД-ММ-ГГГГ&#x60;.
     * @DTA\Data(field="creationDateFrom", nullable=true)
     * @DTA\Strategy(name="Date")
     * @DTA\Validator(name="Date")
     * @var \DateTime|null
     */
    public $creation_date_from;

    /**
     * Фильтр по времени появления предложения — окончание периода.  Формат даты: &#x60;ДД-ММ-ГГГГ&#x60;.
     * @DTA\Data(field="creationDateTo", nullable=true)
     * @DTA\Strategy(name="Date")
     * @DTA\Validator(name="Date")
     * @var \DateTime|null
     */
    public $creation_date_to;

}
