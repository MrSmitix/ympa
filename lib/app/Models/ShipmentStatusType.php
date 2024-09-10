<?php
/**
 * ShipmentStatusType
 */
namespace app\Models;

/**
 * ShipmentStatusType
 * @description Статус отгрузки:  * `OUTBOUND_CREATED` — формируется. * `OUTBOUND_READY_FOR_CONFIRMATION` — можно обрабатывать. * `OUTBOUND_CONFIRMED` — подтверждена и готова к отправке. * `OUTBOUND_SIGNED` — по ней подписан электронный акт приема-передачи. * `ACCEPTED` — принята в сортировочном центре или пункте приема. * `ACCEPTED_WITH_DISCREPANCIES` — принята с расхождениями. * `FINISHED` — завершена. * `ERROR` — отменена из-за ошибки.
 */
class ShipmentStatusType
{
    /**
     * Possible values of this enum
     */
    const OUTBOUND_CREATED = 'OUTBOUND_CREATED';

    const OUTBOUND_READY_FOR_CONFIRMATION = 'OUTBOUND_READY_FOR_CONFIRMATION';

    const OUTBOUND_CONFIRMED = 'OUTBOUND_CONFIRMED';

    const OUTBOUND_SIGNED = 'OUTBOUND_SIGNED';

    const FINISHED = 'FINISHED';

    const ACCEPTED = 'ACCEPTED';

    const ACCEPTED_WITH_DISCREPANCIES = 'ACCEPTED_WITH_DISCREPANCIES';

    const ERROR = 'ERROR';

    /**
     * Gets allowable values of the enum
     * @return string[]
     */
    public static function getAllowableEnumValues()
    {
        return [
            self::OUTBOUND_CREATED,
            self::OUTBOUND_READY_FOR_CONFIRMATION,
            self::OUTBOUND_CONFIRMED,
            self::OUTBOUND_SIGNED,
            self::FINISHED,
            self::ACCEPTED,
            self::ACCEPTED_WITH_DISCREPANCIES,
            self::ERROR
        ];
    }
}
