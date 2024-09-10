<?php
/**
 * GeneratePricesReportRequest
 */
namespace app\Models;

/**
 * GeneratePricesReportRequest
 * @description Данные, необходимые для генерации отчета.
 */
class GeneratePricesReportRequest {

    /** @var int $businessId Идентификатор бизнеса.  В большинстве случаев обязателен. Не указывается, если задан &#x60;campaignId&#x60;.*/
    public $businessId = 0;

    /** @var int $campaignId Идентификатор кампании.  Как правило, не используется. Передавайте только если в кабинете есть магазины с уникальными ценами и вы хотите получить отчет для них. В этом случае передавать &#x60;businessId&#x60; не нужно.*/
    public $campaignId = 0;

    /** @var int[]|null $categoryIds Фильтр по категориям на Маркете.*/
    public $categoryIds = null;

    /** @var \DateTime $creationDateFrom Фильтр по времени появления предложения — начало периода.  Формат даты: &#x60;ДД-ММ-ГГГГ&#x60;.*/
    public $creationDateFrom;

    /** @var \DateTime $creationDateTo Фильтр по времени появления предложения — окончание периода.  Формат даты: &#x60;ДД-ММ-ГГГГ&#x60;.*/
    public $creationDateTo;

}
