<?php
/**
 * OfferConditionType
 */
namespace app\Models;

/**
 * OfferConditionType
 * @description Тип уценки:  * `PREOWNED` —  бывший в употреблении товар, раньше принадлежал другому человеку. * `SHOWCASESAMPLE` — витринный образец. * `REFURBISHED` — повторная продажа товара. * `REDUCTION` — товар с дефектами. * `RENOVATED` — восстановленный товар. * `NOT_SPECIFIED` — не выбран.  `REFURBISHED` — специальное значение для одежды, обуви и аксессуаров. Используется только для уцененных товаров из этой категории. Другие значения для одежды, обуви и аксессуаров не используются.
 */
class OfferConditionType
{
    /**
     * Possible values of this enum
     */
    const PREOWNED = 'PREOWNED';

    const SHOWCASESAMPLE = 'SHOWCASESAMPLE';

    const REFURBISHED = 'REFURBISHED';

    const REDUCTION = 'REDUCTION';

    const RENOVATED = 'RENOVATED';

    const NOT_SPECIFIED = 'NOT_SPECIFIED';

    /**
     * Gets allowable values of the enum
     * @return string[]
     */
    public static function getAllowableEnumValues()
    {
        return [
            self::PREOWNED,
            self::SHOWCASESAMPLE,
            self::REFURBISHED,
            self::REDUCTION,
            self::RENOVATED,
            self::NOT_SPECIFIED
        ];
    }
}
