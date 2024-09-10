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




from datetime import datetime
from pydantic import BaseModel, ConfigDict, Field, StrictInt, StrictStr
from typing import Any, ClassVar, Dict, List, Optional
from ympa_python_fastapi_server.models.chat_message_payload_dto import ChatMessagePayloadDTO
from ympa_python_fastapi_server.models.chat_message_sender_type import ChatMessageSenderType
try:
    from typing import Self
except ImportError:
    from typing_extensions import Self

class ChatMessageDTO(BaseModel):
    """
    Информация о сообщениях.
    """ # noqa: E501
    message_id: StrictInt = Field(description="Идентификатор сообщения.", alias="messageId")
    created_at: datetime = Field(description="Дата и время создания сообщения.  Формат даты: ISO 8601 со смещением относительно UTC. Например, `2017-11-21T00:00:00+03:00`. ", alias="createdAt")
    sender: ChatMessageSenderType
    message: Optional[StrictStr] = Field(default=None, description="Текст сообщения.  Необязательный параметр, если возвращается параметр `payload`. ")
    payload: Optional[List[ChatMessagePayloadDTO]] = Field(default=None, description="Информация о приложенных к сообщению файлах.  Необязательный параметр, если возвращается параметр `message`. ")
    __properties: ClassVar[List[str]] = ["messageId", "createdAt", "sender", "message", "payload"]

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
        """Create an instance of ChatMessageDTO from a JSON string"""
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
        # override the default output from pydantic by calling `to_dict()` of each item in payload (list)
        _items = []
        if self.payload:
            for _item in self.payload:
                if _item:
                    _items.append(_item.to_dict())
            _dict['payload'] = _items
        # set to None if payload (nullable) is None
        # and model_fields_set contains the field
        if self.payload is None and "payload" in self.model_fields_set:
            _dict['payload'] = None

        return _dict

    @classmethod
    def from_dict(cls, obj: Dict) -> Self:
        """Create an instance of ChatMessageDTO from a dict"""
        if obj is None:
            return None

        if not isinstance(obj, dict):
            return cls.model_validate(obj)

        _obj = cls.model_validate({
            "messageId": obj.get("messageId"),
            "createdAt": obj.get("createdAt"),
            "sender": obj.get("sender"),
            "message": obj.get("message"),
            "payload": [ChatMessagePayloadDTO.from_dict(_item) for _item in obj.get("payload")] if obj.get("payload") is not None else None
        })
        return _obj


