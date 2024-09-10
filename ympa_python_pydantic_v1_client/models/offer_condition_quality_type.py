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





class OfferConditionQualityType(str, Enum):
    """
    Внешний вид товара:  * `PERFECT` — идеальный. * `EXCELLENT` — отличный. * `GOOD` — хороший. * `NOT_SPECIFIED` — не выбран. 
    """

    """
    allowed enum values
    """
    PERFECT = 'PERFECT'
    EXCELLENT = 'EXCELLENT'
    GOOD = 'GOOD'
    NOT_SPECIFIED = 'NOT_SPECIFIED'

    @classmethod
    def from_json(cls, json_str: str) -> OfferConditionQualityType:
        """Create an instance of OfferConditionQualityType from a JSON string"""
        return OfferConditionQualityType(json.loads(json_str))


