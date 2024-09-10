<?php
/**
 * OfferProcessingStatusType
 */
namespace app\Models;

/**
 * OfferProcessingStatusType
 * @description Статус публикации товара:  * `READY` — товар прошел модерацию. Чтобы разместить его на Маркете, установите для него цену. * `IN_WORK` — товар проходит модерацию. Это занимает несколько дней. * `NEED_CONTENT` — для товара без SKU на Маркете `marketSku` нужно найти карточку самостоятельно (через API или кабинет продавца на Маркете) или создать ее, если товар еще не продается на Маркете. * `NEED_INFO` — товар не прошел модерацию из-за ошибок или недостающих сведений в описании товара. Информация о причинах отклонения возвращается в параметре `notes`. * `REJECTED` — товар не прошел модерацию, так как Маркет не планирует размещать подобные товары. * `SUSPENDED` — товар не прошел модерацию, так как Маркет пока не размещает подобные товары.
 */
class OfferProcessingStatusType
{
    /**
     * Possible values of this enum
     */
    const UNKNOWN = 'UNKNOWN';

    const READY = 'READY';

    const IN_WORK = 'IN_WORK';

    const NEED_INFO = 'NEED_INFO';

    const NEED_MAPPING = 'NEED_MAPPING';

    const NEED_CONTENT = 'NEED_CONTENT';

    const CONTENT_PROCESSING = 'CONTENT_PROCESSING';

    const SUSPENDED = 'SUSPENDED';

    const REJECTED = 'REJECTED';

    const REVIEW = 'REVIEW';

    const CREATE_ERROR = 'CREATE_ERROR';

    const UPDATE_ERROR = 'UPDATE_ERROR';

    /**
     * Gets allowable values of the enum
     * @return string[]
     */
    public static function getAllowableEnumValues()
    {
        return [
            self::UNKNOWN,
            self::READY,
            self::IN_WORK,
            self::NEED_INFO,
            self::NEED_MAPPING,
            self::NEED_CONTENT,
            self::CONTENT_PROCESSING,
            self::SUSPENDED,
            self::REJECTED,
            self::REVIEW,
            self::CREATE_ERROR,
            self::UPDATE_ERROR
        ];
    }
}
