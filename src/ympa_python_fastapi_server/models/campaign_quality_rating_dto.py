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




from pydantic import BaseModel, ConfigDict, Field, StrictInt
from typing import Any, ClassVar, Dict, List
from ympa_python_fastapi_server.models.quality_rating_dto import QualityRatingDTO
try:
    from typing import Self
except ImportError:
    from typing_extensions import Self

class CampaignQualityRatingDTO(BaseModel):
    """
    Информация об индексе качества магазина.
    """ # noqa: E501
    campaign_id: StrictInt = Field(description="Идентификатор магазина.", alias="campaignId")
    ratings: List[QualityRatingDTO] = Field(description="Список значений индекса качества.")
    __properties: ClassVar[List[str]] = ["campaignId", "ratings"]

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
        """Create an instance of CampaignQualityRatingDTO from a JSON string"""
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
        # override the default output from pydantic by calling `to_dict()` of each item in ratings (list)
        _items = []
        if self.ratings:
            for _item in self.ratings:
                if _item:
                    _items.append(_item.to_dict())
            _dict['ratings'] = _items
        return _dict

    @classmethod
    def from_dict(cls, obj: Dict) -> Self:
        """Create an instance of CampaignQualityRatingDTO from a dict"""
        if obj is None:
            return None

        if not isinstance(obj, dict):
            return cls.model_validate(obj)

        _obj = cls.model_validate({
            "campaignId": obj.get("campaignId"),
            "ratings": [QualityRatingDTO.from_dict(_item) for _item in obj.get("ratings")] if obj.get("ratings") is not None else None
        })
        return _obj

