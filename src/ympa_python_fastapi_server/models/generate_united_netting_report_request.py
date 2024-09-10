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




from datetime import date, datetime
from pydantic import BaseModel, ConfigDict, Field, StrictInt, StrictStr
from typing import Any, ClassVar, Dict, List, Optional
from ympa_python_fastapi_server.models.placement_type import PlacementType
try:
    from typing import Self
except ImportError:
    from typing_extensions import Self

class GenerateUnitedNettingReportRequest(BaseModel):
    """
    Данные, необходимые для генерации отчета: идентификатор магазина, период, за который нужен отчет, а также фильтры. 
    """ # noqa: E501
    business_id: StrictInt = Field(description="Идентификатор бизнеса.", alias="businessId")
    date_time_from: Optional[datetime] = Field(default=None, description="{% note warning \"\" %}  Этот параметр устарел. Не используйте его.  {% endnote %}  Начало периода, включительно. ", alias="dateTimeFrom")
    date_time_to: Optional[datetime] = Field(default=None, description="{% note warning \"\" %}  Этот параметр устарел. Не используйте его.  {% endnote %}  Конец периода, включительно. Максимальный период — 1 год. ", alias="dateTimeTo")
    date_from: Optional[date] = Field(default=None, description="Начало периода, включительно.", alias="dateFrom")
    date_to: Optional[date] = Field(default=None, description="Конец периода, включительно. Максимальный период — 1 год.", alias="dateTo")
    bank_order_id: Optional[StrictInt] = Field(default=None, description="Номер платежного поручения.", alias="bankOrderId")
    bank_order_date_time: Optional[datetime] = Field(default=None, description="Дата платежного поручения.", alias="bankOrderDateTime")
    placement_programs: Optional[List[PlacementType]] = Field(default=None, description="Список моделей, которые нужны в отчете. ", alias="placementPrograms")
    inns: Optional[List[StrictStr]] = Field(default=None, description="Список ИНН, которые нужны в отчете.")
    campaign_ids: Optional[List[StrictInt]] = Field(default=None, description="Список магазинов, которые нужны в отчете.", alias="campaignIds")
    __properties: ClassVar[List[str]] = ["businessId", "dateTimeFrom", "dateTimeTo", "dateFrom", "dateTo", "bankOrderId", "bankOrderDateTime", "placementPrograms", "inns", "campaignIds"]

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
        """Create an instance of GenerateUnitedNettingReportRequest from a JSON string"""
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
        # set to None if placement_programs (nullable) is None
        # and model_fields_set contains the field
        if self.placement_programs is None and "placement_programs" in self.model_fields_set:
            _dict['placementPrograms'] = None

        # set to None if inns (nullable) is None
        # and model_fields_set contains the field
        if self.inns is None and "inns" in self.model_fields_set:
            _dict['inns'] = None

        # set to None if campaign_ids (nullable) is None
        # and model_fields_set contains the field
        if self.campaign_ids is None and "campaign_ids" in self.model_fields_set:
            _dict['campaignIds'] = None

        return _dict

    @classmethod
    def from_dict(cls, obj: Dict) -> Self:
        """Create an instance of GenerateUnitedNettingReportRequest from a dict"""
        if obj is None:
            return None

        if not isinstance(obj, dict):
            return cls.model_validate(obj)

        _obj = cls.model_validate({
            "businessId": obj.get("businessId"),
            "dateTimeFrom": obj.get("dateTimeFrom"),
            "dateTimeTo": obj.get("dateTimeTo"),
            "dateFrom": obj.get("dateFrom"),
            "dateTo": obj.get("dateTo"),
            "bankOrderId": obj.get("bankOrderId"),
            "bankOrderDateTime": obj.get("bankOrderDateTime"),
            "placementPrograms": obj.get("placementPrograms"),
            "inns": obj.get("inns"),
            "campaignIds": obj.get("campaignIds")
        })
        return _obj

