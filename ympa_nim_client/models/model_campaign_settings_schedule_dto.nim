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

import model_campaign_settings_time_period_dto

type CampaignSettingsScheduleDTO* = object
  ## Расписание работы службы доставки в своем регионе.
  availableOnHolidays*: bool ## Признак работы службы доставки в государственные праздники. Возможные значения. * `false` — служба доставки не работает в праздничные дни. * `true` — служба доставки работает в праздничные дни. 
  customHolidays*: seq[string] ## Список дней, в которые служба доставки не работает. Дни магазин указал в кабинете продавца на Маркете.
  customWorkingDays*: seq[string] ## Список выходных и праздничных дней, в которые служба доставки работает. Дни магазин указал в кабинете продавца на Маркете.
  period*: CampaignSettingsTimePeriodDTO
  totalHolidays*: seq[string] ## Итоговый список нерабочих дней службы доставки. Список рассчитывается с учетом выходных, нерабочих дней и государственных праздников. Информацию по ним магазин указывает в кабинете продавца на Маркете.
  weeklyHolidays*: seq[int] ## Список выходных дней недели и государственных праздников.