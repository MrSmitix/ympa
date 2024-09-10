# coding: utf-8

"""
    Партнерский API Маркета

    API Яндекс Маркета помогает продавцам автоматизировать и упростить работу с маркетплейсом.  В числе возможностей интеграции:  * управление каталогом товаров и витриной,  * обработка заказов,  * изменение настроек магазина,  * получение отчетов. 

    The version of the OpenAPI document: LATEST
    Generated by OpenAPI Generator (https://openapi-generator.tech)

    Do not edit the class manually.
"""  # noqa: E501


from __future__ import annotations
import pprint
import re  # noqa: F401
import json

from datetime import date
from pydantic import BaseModel, ConfigDict, Field, StrictFloat, StrictInt, StrictStr
from typing import Any, ClassVar, Dict, List, Optional, Union
from ympa_python_client.models.orders_stats_payment_order_dto import OrdersStatsPaymentOrderDTO
from ympa_python_client.models.orders_stats_payment_source_type import OrdersStatsPaymentSourceType
from ympa_python_client.models.orders_stats_payment_type import OrdersStatsPaymentType
from typing import Optional, Set
from typing_extensions import Self

class OrdersStatsPaymentDTO(BaseModel):
    """
    Информация о денежных переводах по заказу.
    """ # noqa: E501
    id: Optional[StrictStr] = Field(default=None, description="Идентификатор денежного перевода.")
    var_date: Optional[date] = Field(default=None, description="Дата денежного перевода.  Формат даты: `ГГГГ-ММ-ДД`. ", alias="date")
    type: Optional[OrdersStatsPaymentType] = None
    source: Optional[OrdersStatsPaymentSourceType] = None
    total: Optional[Union[StrictFloat, StrictInt]] = Field(default=None, description="Сумма денежного перевода. Значение указывается в рублях независимо от способа денежного перевода. Точность — два знака после запятой. ")
    payment_order: Optional[OrdersStatsPaymentOrderDTO] = Field(default=None, alias="paymentOrder")
    __properties: ClassVar[List[str]] = ["id", "date", "type", "source", "total", "paymentOrder"]

    model_config = ConfigDict(
        populate_by_name=True,
        validate_assignment=True,
        protected_namespaces=(),
    )


    def to_str(self) -> str:
        """Returns the string representation of the model using alias"""
        return pprint.pformat(self.model_dump(by_alias=True))

    def to_json(self) -> str:
        """Returns the JSON representation of the model using alias"""
        # TODO: pydantic v2: use .model_dump_json(by_alias=True, exclude_unset=True) instead
        return json.dumps(self.to_dict())

    @classmethod
    def from_json(cls, json_str: str) -> Optional[Self]:
        """Create an instance of OrdersStatsPaymentDTO from a JSON string"""
        return cls.from_dict(json.loads(json_str))

    def to_dict(self) -> Dict[str, Any]:
        """Return the dictionary representation of the model using alias.

        This has the following differences from calling pydantic's
        `self.model_dump(by_alias=True)`:

        * `None` is only added to the output dict for nullable fields that
          were set at model initialization. Other fields with value `None`
          are ignored.
        """
        excluded_fields: Set[str] = set([
        ])

        _dict = self.model_dump(
            by_alias=True,
            exclude=excluded_fields,
            exclude_none=True,
        )
        # override the default output from pydantic by calling `to_dict()` of payment_order
        if self.payment_order:
            _dict['paymentOrder'] = self.payment_order.to_dict()
        return _dict

    @classmethod
    def from_dict(cls, obj: Optional[Dict[str, Any]]) -> Optional[Self]:
        """Create an instance of OrdersStatsPaymentDTO from a dict"""
        if obj is None:
            return None

        if not isinstance(obj, dict):
            return cls.model_validate(obj)

        _obj = cls.model_validate({
            "id": obj.get("id"),
            "date": obj.get("date"),
            "type": obj.get("type"),
            "source": obj.get("source"),
            "total": obj.get("total"),
            "paymentOrder": OrdersStatsPaymentOrderDTO.from_dict(obj["paymentOrder"]) if obj.get("paymentOrder") is not None else None
        })
        return _obj


