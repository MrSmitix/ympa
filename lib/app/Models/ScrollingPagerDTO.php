<?php
/**
 * ScrollingPagerDTO
 */
namespace app\Models;

/**
 * ScrollingPagerDTO
 * @description Информация о страницах результатов.
 */
class ScrollingPagerDTO {

    /** @var string $nextPageToken Идентификатор следующей страницы результатов.*/
    public $nextPageToken = "";

    /** @var string $prevPageToken Идентификатор предыдущей страницы результатов.*/
    public $prevPageToken = "";

}
