package org.openapitools.server.model


/**
 * @param name Название точки продаж.  for example: ''null''
 * @param `type`  for example: ''null''
 * @param coords Координаты точки продаж.  Формат: долгота, широта. Разделители: запятая и / или пробел. Например, `20.4522144, 54.7104264`.  Если параметр не передан, координаты будут определены по значениям параметров, вложенных в `address`.  for example: ''null''
 * @param isMain Признак основной точки продаж.  Возможные значения:  * `false` — неосновная точка продаж. * `true` — основная точка продаж.  for example: ''null''
 * @param shopOutletCode Идентификатор точки продаж, присвоенный магазином. for example: ''null''
 * @param visibility  for example: ''null''
 * @param address  for example: ''null''
 * @param phones Номера телефонов точки продаж. Передавайте в формате: `+7 (999) 999-99-99`.  for example: ''null''
 * @param workingSchedule  for example: ''null''
 * @param deliveryRules Информация об условиях доставки для данной точки продаж.  Обязательный параметр, если параметр `type=DEPOT` или `type=MIXED`.  for example: ''null''
 * @param storagePeriod Срок хранения заказа в собственном пункте выдачи заказов. Считается в днях. for example: ''null''
*/
final case class ChangeOutletRequest (
  name: String,
  `type`: OutletType,
  coords: Option[String] = None,
  isMain: Option[Boolean] = None,
  shopOutletCode: Option[String] = None,
  visibility: Option[OutletVisibilityType] = None,
  address: OutletAddressDTO,
  phones: Seq[String],
  workingSchedule: OutletWorkingScheduleDTO,
  deliveryRules: Option[Seq[OutletDeliveryRuleDTO]] = None,
  storagePeriod: Option[Long] = None
)

