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

import model_forward_scrolling_pager_dto
import model_goods_feedback_comment_dto

type GoodsFeedbackCommentListDTO* = object
  ## Комментарии к отзыву.
  comments*: seq[GoodsFeedbackCommentDTO] ## Список комментариев.
  paging*: ForwardScrollingPagerDTO
