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




from pydantic import BaseModel, ConfigDict, Field
from typing import Any, ClassVar, Dict, List
from ympa_python_fastapi_server.models.warehouse_dto import WarehouseDTO
from ympa_python_fastapi_server.models.warehouse_group_dto import WarehouseGroupDTO
try:
    from typing import Self
except ImportError:
    from typing_extensions import Self

class WarehousesDTO(BaseModel):
    """
    Информация о складах и группах складов.
    """ # noqa: E501
    warehouses: List[WarehouseDTO] = Field(description="Список складов, не входящих в группы.")
    warehouse_groups: List[WarehouseGroupDTO] = Field(description="Список групп складов.", alias="warehouseGroups")
    __properties: ClassVar[List[str]] = ["warehouses", "warehouseGroups"]

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
        """Create an instance of WarehousesDTO from a JSON string"""
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
        # override the default output from pydantic by calling `to_dict()` of each item in warehouses (list)
        _items = []
        if self.warehouses:
            for _item in self.warehouses:
                if _item:
                    _items.append(_item.to_dict())
            _dict['warehouses'] = _items
        # override the default output from pydantic by calling `to_dict()` of each item in warehouse_groups (list)
        _items = []
        if self.warehouse_groups:
            for _item in self.warehouse_groups:
                if _item:
                    _items.append(_item.to_dict())
            _dict['warehouseGroups'] = _items
        return _dict

    @classmethod
    def from_dict(cls, obj: Dict) -> Self:
        """Create an instance of WarehousesDTO from a dict"""
        if obj is None:
            return None

        if not isinstance(obj, dict):
            return cls.model_validate(obj)

        _obj = cls.model_validate({
            "warehouses": [WarehouseDTO.from_dict(_item) for _item in obj.get("warehouses")] if obj.get("warehouses") is not None else None,
            "warehouseGroups": [WarehouseGroupDTO.from_dict(_item) for _item in obj.get("warehouseGroups")] if obj.get("warehouseGroups") is not None else None
        })
        return _obj


