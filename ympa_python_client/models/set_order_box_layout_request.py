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

from pydantic import BaseModel, ConfigDict, Field, StrictBool
from typing import Any, ClassVar, Dict, List, Optional
from typing_extensions import Annotated
from ympa_python_client.models.order_box_layout_dto import OrderBoxLayoutDTO
from typing import Optional, Set
from typing_extensions import Self

class SetOrderBoxLayoutRequest(BaseModel):
    """
    SetOrderBoxLayoutRequest
    """ # noqa: E501
    boxes: Annotated[List[OrderBoxLayoutDTO], Field(min_length=1)] = Field(description="Список коробок.")
    allow_remove: Optional[StrictBool] = Field(default=False, description="Передайте `true`, если вы собираетесь удалить часть товаров из заказа.", alias="allowRemove")
    __properties: ClassVar[List[str]] = ["boxes", "allowRemove"]

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
        """Create an instance of SetOrderBoxLayoutRequest from a JSON string"""
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
        # override the default output from pydantic by calling `to_dict()` of each item in boxes (list)
        _items = []
        if self.boxes:
            for _item_boxes in self.boxes:
                if _item_boxes:
                    _items.append(_item_boxes.to_dict())
            _dict['boxes'] = _items
        return _dict

    @classmethod
    def from_dict(cls, obj: Optional[Dict[str, Any]]) -> Optional[Self]:
        """Create an instance of SetOrderBoxLayoutRequest from a dict"""
        if obj is None:
            return None

        if not isinstance(obj, dict):
            return cls.model_validate(obj)

        _obj = cls.model_validate({
            "boxes": [OrderBoxLayoutDTO.from_dict(_item) for _item in obj["boxes"]] if obj.get("boxes") is not None else None,
            "allowRemove": obj.get("allowRemove") if obj.get("allowRemove") is not None else False
        })
        return _obj


