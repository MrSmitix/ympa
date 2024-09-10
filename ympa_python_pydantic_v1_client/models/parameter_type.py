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





class ParameterType(str, Enum):
    """
    Тип данных:  * `TEXT` — текст. * `ENUM` — список возможных значений. * `BOOLEAN` — `true` или `false`. * `NUMERIC` — число. 
    """

    """
    allowed enum values
    """
    TEXT = 'TEXT'
    ENUM = 'ENUM'
    BOOLEAN = 'BOOLEAN'
    NUMERIC = 'NUMERIC'

    @classmethod
    def from_json(cls, json_str: str) -> ParameterType:
        """Create an instance of ParameterType from a JSON string"""
        return ParameterType(json.loads(json_str))


