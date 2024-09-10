<?php
/**
 * PromoParticipationType
 */
namespace app\Models;

/**
 * PromoParticipationType
 * @description Какие акции вернутся:  * `PARTICIPATING_NOW` — текущие и будущие акции продавца.  * `PARTICIPATED` — завершенные акции продавца за последний год. Если за год их было меньше 15, в ответе придут 15 последних акций за все время.
 */
class PromoParticipationType
{
    /**
     * Possible values of this enum
     */
    const PARTICIPATING_NOW = 'PARTICIPATING_NOW';

    const PARTICIPATED = 'PARTICIPATED';

    /**
     * Gets allowable values of the enum
     * @return string[]
     */
    public static function getAllowableEnumValues()
    {
        return [
            self::PARTICIPATING_NOW,
            self::PARTICIPATED
        ];
    }
}
