<?php
/**
 * FeedIndexLogsOffersDTO
 */
namespace app\Models;

/**
 * FeedIndexLogsOffersDTO
 * @description Информация о предложениях прайс-листа.
 */
class FeedIndexLogsOffersDTO {

    /** @var int $rejectedCount Количество предложений, который не опубликованы на Маркете из-за найденных ошибок.*/
    public $rejectedCount = 0;

    /** @var int $totalCount Количество предложений в прайс-листе.*/
    public $totalCount = 0;

}
