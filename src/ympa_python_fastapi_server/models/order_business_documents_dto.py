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
from ympa_python_fastapi_server.models.document_dto import DocumentDTO
try:
    from typing import Self
except ImportError:
    from typing_extensions import Self

class OrderBusinessDocumentsDTO(BaseModel):
    """
    Информация о документах. 
    """ # noqa: E501
    upd: Optional[DocumentDTO] = None
    ukd: Optional[DocumentDTO] = None
    torg_twelve: Optional[DocumentDTO] = Field(default=None, alias="torgTwelve")
    sf: Optional[DocumentDTO] = None
    ksf: Optional[DocumentDTO] = None
    __properties: ClassVar[List[str]] = ["upd", "ukd", "torgTwelve", "sf", "ksf"]

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
        """Create an instance of OrderBusinessDocumentsDTO from a JSON string"""
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
        # override the default output from pydantic by calling `to_dict()` of upd
        if self.upd:
            _dict['upd'] = self.upd.to_dict()
        # override the default output from pydantic by calling `to_dict()` of ukd
        if self.ukd:
            _dict['ukd'] = self.ukd.to_dict()
        # override the default output from pydantic by calling `to_dict()` of torg_twelve
        if self.torg_twelve:
            _dict['torgTwelve'] = self.torg_twelve.to_dict()
        # override the default output from pydantic by calling `to_dict()` of sf
        if self.sf:
            _dict['sf'] = self.sf.to_dict()
        # override the default output from pydantic by calling `to_dict()` of ksf
        if self.ksf:
            _dict['ksf'] = self.ksf.to_dict()
        return _dict

    @classmethod
    def from_dict(cls, obj: Dict) -> Self:
        """Create an instance of OrderBusinessDocumentsDTO from a dict"""
        if obj is None:
            return None

        if not isinstance(obj, dict):
            return cls.model_validate(obj)

        _obj = cls.model_validate({
            "upd": DocumentDTO.from_dict(obj.get("upd")) if obj.get("upd") is not None else None,
            "ukd": DocumentDTO.from_dict(obj.get("ukd")) if obj.get("ukd") is not None else None,
            "torgTwelve": DocumentDTO.from_dict(obj.get("torgTwelve")) if obj.get("torgTwelve") is not None else None,
            "sf": DocumentDTO.from_dict(obj.get("sf")) if obj.get("sf") is not None else None,
            "ksf": DocumentDTO.from_dict(obj.get("ksf")) if obj.get("ksf") is not None else None
        })
        return _obj


