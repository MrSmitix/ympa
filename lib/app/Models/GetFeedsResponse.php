<?php
/**
 * GetFeedsResponse
 */
namespace app\Models;

/**
 * GetFeedsResponse
 * @description Ответ на запрос списка прайс-листов.
 */
class GetFeedsResponse {

    /** @var \app\Models\FeedDTO[] $feeds Список прайс-листов.*/
    public $feeds = [];

}
