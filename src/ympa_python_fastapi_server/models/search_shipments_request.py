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
from pydantic import BaseModel, ConfigDict, Field, StrictBool, StrictInt
from typing import Any, ClassVar, Dict, List, Optional
from typing_extensions import Annotated
from ympa_python_fastapi_server.models.shipment_status_type import ShipmentStatusType
try:
    from typing import Self
except ImportError:
    from typing_extensions import Self

class SearchShipmentsRequest(BaseModel):
    """
    Запрос информации об отгрузках.
    """ # noqa: E501
    date_from: date = Field(description="Начальная дата для фильтрации по дате отгрузки (включительно).  Формат даты: `ДД-ММ-ГГГГ`. ", alias="dateFrom")
    date_to: date = Field(description="Конечная дата для фильтрации по дате отгрузки (включительно).  Формат даты: `ДД-ММ-ГГГГ`. ", alias="dateTo")
    statuses: Optional[Annotated[List[ShipmentStatusType], Field(min_length=1)]] = Field(default=None, description="Список статусов отгрузок.")
    order_ids: Optional[Annotated[List[StrictInt], Field(min_length=1)]] = Field(default=None, description="Список идентификаторов заказов из отгрузок.", alias="orderIds")
    cancelled_orders: Optional[StrictBool] = Field(default=True, description="Возвращать ли отмененные заказы.  Значение по умолчанию — `true`. Если возвращать отмененные заказы не нужно, передайте значение `false`. ", alias="cancelledOrders")
    __properties: ClassVar[List[str]] = ["dateFrom", "dateTo", "statuses", "orderIds", "cancelledOrders"]

    model_config = {
        "populate_by_name": True,
        "validate_assignment": True,
        "protected_namespaces": (),
    }


    def to_str(self) -> str:
        """Returns the string representation of the model using alias"""
        return pprint.pformat(self.model_dump(by_alias=True))

    def to_json(self) -> str:
        """Returns the JSON representation of the model using alias"""
        # TODO: pydantic v2: use .model_dump_json(by_alias=True, exclude_unset=True) instead
        return json.dumps(self.to_dict())

    @classmethod
    def from_json(cls, json_str: str) -> Self:
        """Create an instance of SearchShipmentsRequest from a JSON string"""
        return cls.from_dict(json.loads(json_str))

    def to_dict(self) -> Dict[str, Any]:
        """Return the dictionary representation of the model using alias.

        This has the following differences from calling pydantic's
        `self.model_dump(by_alias=True)`:

        * `None` is only added to the output dict for nullable fields that
          were set at model initialization. Other fields with value `None`
          are ignored.
        """
        _dict = self.model_dump(
            by_alias=True,
            exclude={
            },
            exclude_none=True,
        )
        # set to None if statuses (nullable) is None
        # and model_fields_set contains the field
        if self.statuses is None and "statuses" in self.model_fields_set:
            _dict['statuses'] = None

        # set to None if order_ids (nullable) is None
        # and model_fields_set contains the field
        if self.order_ids is None and "order_ids" in self.model_fields_set:
            _dict['orderIds'] = None

        return _dict

    @classmethod
    def from_dict(cls, obj: Dict) -> Self:
        """Create an instance of SearchShipmentsRequest from a dict"""
        if obj is None:
            return None

        if not isinstance(obj, dict):
            return cls.model_validate(obj)

        _obj = cls.model_validate({
            "dateFrom": obj.get("dateFrom"),
            "dateTo": obj.get("dateTo"),
            "statuses": obj.get("statuses"),
            "orderIds": obj.get("orderIds"),
            "cancelledOrders": obj.get("cancelledOrders") if obj.get("cancelledOrders") is not None else True
        })
        return _obj


