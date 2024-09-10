
package org.openapitools.client.model


case class CampaignSettingsScheduleDTO (
    /* Признак работы службы доставки в государственные праздники. Возможные значения. * `false` — служба доставки не работает в праздничные дни. * `true` — служба доставки работает в праздничные дни.  */
    _availableOnHolidays: Option[Boolean],
    /* Список дней, в которые служба доставки не работает. Дни магазин указал в кабинете продавца на Маркете. */
    _customHolidays: List[String],
    /* Список выходных и праздничных дней, в которые служба доставки работает. Дни магазин указал в кабинете продавца на Маркете. */
    _customWorkingDays: List[String],
    _period: Option[CampaignSettingsTimePeriodDTO],
    /* Итоговый список нерабочих дней службы доставки. Список рассчитывается с учетом выходных, нерабочих дней и государственных праздников. Информацию по ним магазин указывает в кабинете продавца на Маркете. */
    _totalHolidays: List[String],
    /* Список выходных дней недели и государственных праздников. */
    _weeklyHolidays: List[Integer]
)
object CampaignSettingsScheduleDTO {
    def toStringBody(var_availableOnHolidays: Object, var_customHolidays: Object, var_customWorkingDays: Object, var_period: Object, var_totalHolidays: Object, var_weeklyHolidays: Object) =
        s"""
        | {
        | "availableOnHolidays":$var_availableOnHolidays,"customHolidays":$var_customHolidays,"customWorkingDays":$var_customWorkingDays,"period":$var_period,"totalHolidays":$var_totalHolidays,"weeklyHolidays":$var_weeklyHolidays
        | }
        """.stripMargin
}
