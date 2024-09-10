<?php
/**
 * FeedContentErrorType
 */
namespace app\Models;

/**
 * FeedContentErrorType
 * @description Тип ошибки в содержимом прайс-листа.  Возможные значения:  * `PARSE_ERROR` — ошибка при проверке прайс-листа, не связанная с форматом YML. Например, прайс-лист пустой или его не удалось разархивировать. * `PARSE_XML_ERROR` — несоответствие техническим требованиям формата YML. Например, элементы и их значения описаны некорректно. * `TOO_MANY_REJECTED_OFFERS` — более чем в половине предложений из прайс-листа найдены ошибки. Все предложения из прайс-листа не будут опубликованы на Маркете.
 */
class FeedContentErrorType
{
    /**
     * Possible values of this enum
     */
    const PARSE_ERROR = 'PARSE_ERROR';

    const PARSE_XML_ERROR = 'PARSE_XML_ERROR';

    const TOO_MANY_REJECTED_OFFERS = 'TOO_MANY_REJECTED_OFFERS';

    /**
     * Gets allowable values of the enum
     * @return string[]
     */
    public static function getAllowableEnumValues()
    {
        return [
            self::PARSE_ERROR,
            self::PARSE_XML_ERROR,
            self::TOO_MANY_REJECTED_OFFERS
        ];
    }
}
