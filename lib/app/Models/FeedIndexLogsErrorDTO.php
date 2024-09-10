<?php
/**
 * FeedIndexLogsErrorDTO
 */
namespace app\Models;

/**
 * FeedIndexLogsErrorDTO
 * @description Информация об ошибке, произошедшей во время индексации прайс-листа.  Выводится, если во время индексации произошли ошибки (`index-log-record status=ERROR`).
 */
class FeedIndexLogsErrorDTO {

    /** @var int $httpStatusCode HTTP-код ошибки индексации прайс-листа.  Выводится, если &#x60;type&#x3D;DOWNLOAD_HTTP_ERROR&#x60;.*/
    public $httpStatusCode = 0;

    /** @var string $type */
    public $type = "";

    /** @var string $description Описание ошибки.  Выводится, если &#x60;type&#x3D;DOWNLOAD_ERROR&#x60;.*/
    public $description = "";

}
