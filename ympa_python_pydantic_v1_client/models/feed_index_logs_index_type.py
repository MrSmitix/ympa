# coding: utf-8

"""
    Партнерский API Маркета

    API Яндекс Маркета помогает продавцам автоматизировать и упростить работу с маркетплейсом.  В числе возможностей интеграции:  * управление каталогом товаров и витриной,  * обработка заказов,  * изменение настроек магазина,  * получение отчетов. 

    The version of the OpenAPI document: LATEST
    Generated by OpenAPI Generator (https://openapi-generator.tech)

    Do not edit the class manually.
"""  # noqa: E501


import json
import pprint
import re  # noqa: F401
from aenum import Enum, no_arg





class FeedIndexLogsIndexType(str, Enum):
    """
    Тип обновления.  Возможные значения:  * `DIFF` — частичное обновление данных на Яндекс Маркете (например, обновление цен ранее опубликованных предложений и публикация новых). * `FAST_PRICE` — только обновление цен ранее опубликованных предложений. * `FULL` — полное обновление данных на Яндекс Маркете. 
    """

    """
    allowed enum values
    """
    DIFF = 'DIFF'
    FAST_PRICE = 'FAST_PRICE'
    FULL = 'FULL'

    @classmethod
    def from_json(cls, json_str: str) -> FeedIndexLogsIndexType:
        """Create an instance of FeedIndexLogsIndexType from a JSON string"""
        return FeedIndexLogsIndexType(json.loads(json_str))


