
package org.openapitools.client.model


case class FullOutletDTO (
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
    _storagePeriod: Option[Long],
    /* Идентификатор точки продаж, присвоенный Маркетом. */
    _id: Option[Long],
    _status: Option[OutletStatusType],
    _region: Option[RegionDTO],
    /* Идентификатор точки продаж, заданный магазином. */
    _shopOutletId: Option[String],
    /* Рабочее время. */
    _workingTime: Option[String],
    /* Статус модерации. */
    _moderationReason: Option[String]
)
object FullOutletDTO {
    def toStringBody(var_name: Object, var_type: Object, var_coords: Object, var_isMain: Object, var_shopOutletCode: Object, var_visibility: Object, var_address: Object, var_phones: Object, var_workingSchedule: Object, var_deliveryRules: Object, var_storagePeriod: Object, var_id: Object, var_status: Object, var_region: Object, var_shopOutletId: Object, var_workingTime: Object, var_moderationReason: Object) =
        s"""
        | {
        | "name":$var_name,"type":$var_type,"coords":$var_coords,"isMain":$var_isMain,"shopOutletCode":$var_shopOutletCode,"visibility":$var_visibility,"address":$var_address,"phones":$var_phones,"workingSchedule":$var_workingSchedule,"deliveryRules":$var_deliveryRules,"storagePeriod":$var_storagePeriod,"id":$var_id,"status":$var_status,"region":$var_region,"shopOutletId":$var_shopOutletId,"workingTime":$var_workingTime,"moderationReason":$var_moderationReason
        | }
        """.stripMargin
}
