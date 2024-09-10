<?php
/**
 * FeedDownloadErrorType
 */
namespace app\Models;

/**
 * FeedDownloadErrorType
 * @description Тип ошибки загрузки прайс-листа.  Возможные значения:  * `DOWNLOAD_ERROR` — ошибка загрузки прайс-листа. Например, проблема с DNS-сервером или обрыв интернет-соединения.   Проблема описана в параметре `description`.  * `DOWNLOAD_HTTP_ERROR` — Яндекс Маркет передал запрос на получение прайс-листа и получил в ответ HTTP-код, отличный от 2xx.  HTTP-код выведен в параметре `httpStatusCode`.
 */
class FeedDownloadErrorType
{
    /**
     * Possible values of this enum
     */
    const ERROR = 'DOWNLOAD_ERROR';

    const HTTP_ERROR = 'DOWNLOAD_HTTP_ERROR';

    /**
     * Gets allowable values of the enum
     * @return string[]
     */
    public static function getAllowableEnumValues()
    {
        return [
            self::ERROR,
            self::HTTP_ERROR
        ];
    }
}
