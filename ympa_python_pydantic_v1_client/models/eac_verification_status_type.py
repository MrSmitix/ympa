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





class EacVerificationStatusType(str, Enum):
    """
    Статус проверки кода подтверждения:  * `ACCEPTED` — код верный. * `REJECTED` — код неверный. * `NEED_UPDATE` — Маркет отправит новый код. Значение возвращается, если превышено количество попыток отправки кода. 
    """

    """
    allowed enum values
    """
    ACCEPTED = 'ACCEPTED'
    REJECTED = 'REJECTED'
    NEED_UPDATE = 'NEED_UPDATE'

    @classmethod
    def from_json(cls, json_str: str) -> EacVerificationStatusType:
        """Create an instance of EacVerificationStatusType from a JSON string"""
        return EacVerificationStatusType(json.loads(json_str))


