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




from pydantic import BaseModel, ConfigDict, Field, StrictInt, StrictStr
from typing import Any, ClassVar, Dict, List, Optional
from typing_extensions import Annotated
try:
    from typing import Self
except ImportError:
    from typing_extensions import Self

class OutletAddressDTO(BaseModel):
    """
    Адрес точки продаж. 
    """ # noqa: E501
    region_id: StrictInt = Field(description="Идентификатор региона.  Идентификатор можно получить c помощью запроса [GET regions](../../reference/regions/searchRegionsByName.md).  {% note alert %}  При создании и редактировании точек продаж можно указывать только регионы типов `TOWN` (город), `CITY` (крупный город) и `REPUBLIC_AREA` (район субъекта федерации). Тип региона указан в выходных параметрах type запросов [GET regions](../../reference/regions/searchRegionsByName.md) и [GET regions/{regionId}](../../reference/regions/searchRegionsById.md).  {% endnote %} ", alias="regionId")
    street: Optional[Annotated[str, Field(strict=True, max_length=512)]] = Field(default=None, description="Улица.")
    number: Optional[Annotated[str, Field(strict=True, max_length=256)]] = Field(default=None, description="Номер дома.")
    building: Optional[Annotated[str, Field(strict=True, max_length=16)]] = Field(default=None, description="Номер строения.")
    estate: Optional[Annotated[str, Field(strict=True, max_length=16)]] = Field(default=None, description="Номер владения.")
    block: Optional[Annotated[str, Field(strict=True, max_length=16)]] = Field(default=None, description="Номер корпуса.")
    additional: Optional[StrictStr] = Field(default=None, description="Дополнительная информация.")
    km: Optional[StrictInt] = Field(default=None, description="Порядковый номер километра дороги, на котором располагается точка продаж, если отсутствует улица.")
    city: Optional[Annotated[str, Field(strict=True, max_length=200)]] = Field(default=None, description="{% note warning \"\" %}  Этот параметр устарел. Не используйте его. Город или населенный пункт возвращается в параметре `regionId`.  {% endnote %} ")
    __properties: ClassVar[List[str]] = ["regionId", "street", "number", "building", "estate", "block", "additional", "km", "city"]

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
        """Create an instance of OutletAddressDTO from a JSON string"""
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
        return _dict

    @classmethod
    def from_dict(cls, obj: Dict) -> Self:
        """Create an instance of OutletAddressDTO from a dict"""
        if obj is None:
            return None

        if not isinstance(obj, dict):
            return cls.model_validate(obj)

        _obj = cls.model_validate({
            "regionId": obj.get("regionId"),
            "street": obj.get("street"),
            "number": obj.get("number"),
            "building": obj.get("building"),
            "estate": obj.get("estate"),
            "block": obj.get("block"),
            "additional": obj.get("additional"),
            "km": obj.get("km"),
            "city": obj.get("city")
        })
        return _obj

