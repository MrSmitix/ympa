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





class OfferMappingErrorType(str, Enum):
    """
    Типы ошибок:  * `UNKNOWN_CATEGORY` — указана неизвестная категория. * `CATEGORY_MISMATCH` — указана категория, которая не совпадает с категорией товара. * `EMPTY_MARKET_CATEGORY` — не указана категория Маркета при передаче характеристик категории. * `UNKNOWN_PARAMETER` — передана характеристика, которой нет среди характеристик категории. * `UNEXPECTED_BOOLEAN_VALUE` — вместо boolean-значения передано что-то другое. * `NUMBER_FORMAT` — передана строка, не обозначающая число, вместо числа. * `VALUE_BLANK` — передано пустое значение. * `INVALID_UNIT_ID` — передана единица измерения, недопустимая для характеристики. * `INVALID_GROUP_ID_LENGTH` — в названии превышено допустимое значение символов — 255. * `INVALID_GROUP_ID_CHARACTERS` — переданы [недопустимые символы](*ascii-code). * `INVALID_PICKER_URL` — передана ссылка на изображение для миниатюры, которой нет в переданных ссылках на изображение товара. 
    """

    """
    allowed enum values
    """
    UNKNOWN_CATEGORY = 'UNKNOWN_CATEGORY'
    CATEGORY_MISMATCH = 'CATEGORY_MISMATCH'
    EMPTY_MARKET_CATEGORY = 'EMPTY_MARKET_CATEGORY'
    UNKNOWN_PARAMETER = 'UNKNOWN_PARAMETER'
    UNEXPECTED_BOOLEAN_VALUE = 'UNEXPECTED_BOOLEAN_VALUE'
    NUMBER_FORMAT = 'NUMBER_FORMAT'
    VALUE_BLANK = 'VALUE_BLANK'
    INVALID_UNIT_ID = 'INVALID_UNIT_ID'
    INVALID_GROUP_ID_LENGTH = 'INVALID_GROUP_ID_LENGTH'
    INVALID_GROUP_ID_CHARACTERS = 'INVALID_GROUP_ID_CHARACTERS'
    INVALID_PICKER_URL = 'INVALID_PICKER_URL'

    @classmethod
    def from_json(cls, json_str: str) -> OfferMappingErrorType:
        """Create an instance of OfferMappingErrorType from a JSON string"""
        return OfferMappingErrorType(json.loads(json_str))


