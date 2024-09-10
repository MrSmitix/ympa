<?php
/**
 * FeedIndexLogsErrorType
 */
namespace app\Models;

/**
 * FeedIndexLogsErrorType
 * @description Тип ошибки индексации прайс-листа.  Возможные значения:  * `DOWNLOAD_ERROR` — ошибка загрузки прайс-листа. Например, проблема с DNS-сервером или обрыв интернет-соединения.    Проблема описана в параметре `description`.  * `DOWNLOAD_HTTP_ERROR` — Маркет передал запрос на получение прайс-листа и получил в ответ HTTP-код, отличный от 2xx.    HTTP-код выведен в параметре `httpStatusCode`.  * `PARSE_ERROR` — ошибка при проверке прайс-листа, не связанная с форматом YML. Например, прайс-лист пустой или его не удалось разархивировать.  * `PARSE_XML_ERROR` — несоответствие техническим требованиям формата YML. Например, элементы и их значения описаны некорректно.  * `TOO_MANY_REJECTED_OFFERS` — более чем в половине предложений из прайс-листа найдены ошибки. Все предложения из прайс-листа не будут опубликованы на Маркете.
 */
class FeedIndexLogsErrorType
{
    /**
     * Possible values of this enum
     */
    const DOWNLOAD_ERROR = 'DOWNLOAD_ERROR';

    const DOWNLOAD_HTTP_ERROR = 'DOWNLOAD_HTTP_ERROR';

    const PARSE_ERROR = 'PARSE_ERROR';

    const PARSE_XML_ERROR = 'PARSE_XML_ERROR';

    const TOO_MANY_REJECTED_OFFERS = 'TOO_MANY_REJECTED_OFFERS';

    const NOT_INDEXED = 'NOT_INDEXED';

    /**
     * Gets allowable values of the enum
     * @return string[]
     */
    public static function getAllowableEnumValues()
    {
        return [
            self::DOWNLOAD_ERROR,
            self::DOWNLOAD_HTTP_ERROR,
            self::PARSE_ERROR,
            self::PARSE_XML_ERROR,
            self::TOO_MANY_REJECTED_OFFERS,
            self::NOT_INDEXED
        ];
    }
}
