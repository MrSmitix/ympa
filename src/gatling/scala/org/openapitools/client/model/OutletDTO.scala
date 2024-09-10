
package org.openapitools.client.model


case class OutletDTO (
    /* Название точки продаж.  */
    _name: String,
    _type: OutletType,
    /* Координаты точки продаж.  Формат: долгота, широта. Разделители: запятая и / или пробел. Например, `20.4522144, 54.7104264`.  Если параметр не передан, координаты будут определены по значениям параметров, вложенных в `address`.  */
    _coords: Option[String],
    /* Признак основной точки продаж.  Возможные значения:  * `false` — неосновная точка продаж. * `true` — основная точка продаж.  */
    _isMain: Option[Boolean],
    /* Идентификатор точки продаж, присвоенный магазином. */
    _shopOutletCode: Option[String],
    _visibility: Option[OutletVisibilityType],
    _address: OutletAddressDTO,
    /* Номера телефонов точки продаж. Передавайте в формате: `+7 (999) 999-99-99`.  */
    _phones: List[String],
    _workingSchedule: OutletWorkingScheduleDTO,
    /* Информация об условиях доставки для данной точки продаж.  Обязательный параметр, если параметр `type=DEPOT` или `type=MIXED`.  */
    _deliveryRules: Option[List[OutletDeliveryRuleDTO]],
    /* Срок хранения заказа в собственном пункте выдачи заказов. Считается в днях. */
    _storagePeriod: Option[Long]
)
object OutletDTO {
    def toStringBody(var_name: Object, var_type: Object, var_coords: Object, var_isMain: Object, var_shopOutletCode: Object, var_visibility: Object, var_address: Object, var_phones: Object, var_workingSchedule: Object, var_deliveryRules: Object, var_storagePeriod: Object) =
        s"""
        | {
        | "name":$var_name,"type":$var_type,"coords":$var_coords,"isMain":$var_isMain,"shopOutletCode":$var_shopOutletCode,"visibility":$var_visibility,"address":$var_address,"phones":$var_phones,"workingSchedule":$var_workingSchedule,"deliveryRules":$var_deliveryRules,"storagePeriod":$var_storagePeriod
        | }
        """.stripMargin
}
