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
from typing import Any, ClassVar, Dict, List, Optional
from ympa_python_client.models.api_response_status_type import ApiResponseStatusType
from ympa_python_client.models.update_offer_mapping_result_dto import UpdateOfferMappingResultDTO
from typing import Optional, Set
from typing_extensions import Self

class UpdateOfferMappingsResponse(BaseModel):
    """
    Описывает проблемы, возникшие при сохранении товара.
    """ # noqa: E501
    status: Optional[ApiResponseStatusType] = None
    results: Optional[List[UpdateOfferMappingResultDTO]] = Field(default=None, description="Ошибки и предупреждения, которые появились при обработке списка характеристик. Каждый элемент списка соответствует одному товару.  Если ошибок и предупреждений нет, поле не передается. ")
    __properties: ClassVar[List[str]] = ["status", "results"]

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
        """Create an instance of UpdateOfferMappingsResponse from a JSON string"""
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
        # override the default output from pydantic by calling `to_dict()` of each item in results (list)
        _items = []
        if self.results:
            for _item_results in self.results:
                if _item_results:
                    _items.append(_item_results.to_dict())
            _dict['results'] = _items
        # set to None if results (nullable) is None
        # and model_fields_set contains the field
        if self.results is None and "results" in self.model_fields_set:
            _dict['results'] = None

        return _dict

    @classmethod
    def from_dict(cls, obj: Optional[Dict[str, Any]]) -> Optional[Self]:
        """Create an instance of UpdateOfferMappingsResponse from a dict"""
        if obj is None:
            return None

        if not isinstance(obj, dict):
            return cls.model_validate(obj)

        _obj = cls.model_validate({
            "status": obj.get("status"),
            "results": [UpdateOfferMappingResultDTO.from_dict(_item) for _item in obj["results"]] if obj.get("results") is not None else None
        })
        return _obj


