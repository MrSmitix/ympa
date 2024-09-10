<?php
/**
 * FeedDownloadErrorDTO
 */
namespace app\Models;

/**
 * FeedDownloadErrorDTO
 * @description Информация об ошибке при загрузке прайс-листа. Выводится, если параметр `download status=ERROR`.
 */
class FeedDownloadErrorDTO {

    /** @var int $httpStatusCode HTTP-код ошибки индексации прайс-листа. Выводится, если &#x60;type&#x3D;DOWNLOAD_HTTP_ERROR&#x60;.*/
    public $httpStatusCode = 0;

    /** @var string $type */
    public $type = "";

    /** @var string $description Описание ошибки. Выводится, если &#x60;type&#x3D;DOWNLOAD_ERROR&#x60;.*/
    public $description = "";

}
