#
# Партнерский API Маркета
# 
# API Яндекс Маркета помогает продавцам автоматизировать и упростить работу с маркетплейсом.  В числе возможностей интеграции:  * управление каталогом товаров и витриной,  * обработка заказов,  * изменение настроек магазина,  * получение отчетов. 
# The version of the OpenAPI document: LATEST
# 
# Generated by: https://openapi-generator.tech
#

import json
import tables

import model_outlet_address_dto
import model_outlet_delivery_rule_dto
import model_outlet_status_type
import model_outlet_type
import model_outlet_visibility_type
import model_outlet_working_schedule_dto
import model_region_dto

type FullOutletDTO* = object
  ## Информация о точке продаж.
  name*: string ## Название точки продаж. 
  `type`*: OutletType
  coords*: string ## Координаты точки продаж.  Формат: долгота, широта. Разделители: запятая и / или пробел. Например, `20.4522144, 54.7104264`.  Если параметр не передан, координаты будут определены по значениям параметров, вложенных в `address`. 
  isMain*: bool ## Признак основной точки продаж.  Возможные значения:  * `false` — неосновная точка продаж. * `true` — основная точка продаж. 
  shopOutletCode*: string ## Идентификатор точки продаж, присвоенный магазином.
  visibility*: OutletVisibilityType
  address*: OutletAddressDTO
  phones*: seq[string] ## Номера телефонов точки продаж. Передавайте в формате: `+7 (999) 999-99-99`. 
  workingSchedule*: OutletWorkingScheduleDTO
  deliveryRules*: seq[OutletDeliveryRuleDTO] ## Информация об условиях доставки для данной точки продаж.  Обязательный параметр, если параметр `type=DEPOT` или `type=MIXED`. 
  storagePeriod*: int64 ## Срок хранения заказа в собственном пункте выдачи заказов. Считается в днях.
  id*: int64 ## Идентификатор точки продаж, присвоенный Маркетом.
  status*: OutletStatusType
  region*: RegionDTO
  shopOutletId*: string ## Идентификатор точки продаж, заданный магазином.
  workingTime*: string ## Рабочее время.
  moderationReason*: string ## Статус модерации.
