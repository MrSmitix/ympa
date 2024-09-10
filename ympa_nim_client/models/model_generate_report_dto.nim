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


type GenerateReportDTO* = object
  ## Идентификатор, который понадобится для отслеживания статуса генерации и получения готового отчета.
  reportId*: string ## Идентификатор, который понадобится для отслеживания статуса генерации и получения готового отчета.
  estimatedGenerationTime*: int64 ## Ожидаемая продолжительность генерации в миллисекундах.