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

import model_day_of_week_type

type OutletWorkingScheduleItemDTO* = object
  ## Расписание работы точки продаж.
  startDay*: DayOfWeekType
  endDay*: DayOfWeekType
  startTime*: string ## Точка продаж работает c указанного часа.  Формат: `ЧЧ:ММ`. 
  endTime*: string ## Точка продаж работает до указанного часа.  Формат: `ЧЧ:ММ`. 
