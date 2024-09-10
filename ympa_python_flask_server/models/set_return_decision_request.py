from datetime import date, datetime  # noqa: F401

from typing import List, Dict  # noqa: F401

from ympa_python_flask_server.models.base_model import Model
from ympa_python_flask_server.models.return_request_decision_type import ReturnRequestDecisionType
from ympa_python_flask_server import util

from ympa_python_flask_server.models.return_request_decision_type import ReturnRequestDecisionType  # noqa: E501

class SetReturnDecisionRequest(Model):
    """NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).

    Do not edit the class manually.
    """

    def __init__(self, return_item_id=None, decision_type=None, comment=None):  # noqa: E501
        """SetReturnDecisionRequest - a model defined in OpenAPI

        :param return_item_id: The return_item_id of this SetReturnDecisionRequest.  # noqa: E501
        :type return_item_id: int
        :param decision_type: The decision_type of this SetReturnDecisionRequest.  # noqa: E501
        :type decision_type: ReturnRequestDecisionType
        :param comment: The comment of this SetReturnDecisionRequest.  # noqa: E501
        :type comment: str
        """
        self.openapi_types = {
            'return_item_id': int,
            'decision_type': ReturnRequestDecisionType,
            'comment': str
        }

        self.attribute_map = {
            'return_item_id': 'returnItemId',
            'decision_type': 'decisionType',
            'comment': 'comment'
        }

        self._return_item_id = return_item_id
        self._decision_type = decision_type
        self._comment = comment

    @classmethod
    def from_dict(cls, dikt) -> 'SetReturnDecisionRequest':
        """Returns the dict as a model

        :param dikt: A dict.
        :type: dict
        :return: The SetReturnDecisionRequest of this SetReturnDecisionRequest.  # noqa: E501
        :rtype: SetReturnDecisionRequest
        """
        return util.deserialize_model(dikt, cls)

    @property
    def return_item_id(self) -> int:
        """Gets the return_item_id of this SetReturnDecisionRequest.

        Идентификатор товара в возврате.  # noqa: E501

        :return: The return_item_id of this SetReturnDecisionRequest.
        :rtype: int
        """
        return self._return_item_id

    @return_item_id.setter
    def return_item_id(self, return_item_id: int):
        """Sets the return_item_id of this SetReturnDecisionRequest.

        Идентификатор товара в возврате.  # noqa: E501

        :param return_item_id: The return_item_id of this SetReturnDecisionRequest.
        :type return_item_id: int
        """
        if return_item_id is None:
            raise ValueError("Invalid value for `return_item_id`, must not be `None`")  # noqa: E501

        self._return_item_id = return_item_id

    @property
    def decision_type(self) -> ReturnRequestDecisionType:
        """Gets the decision_type of this SetReturnDecisionRequest.


        :return: The decision_type of this SetReturnDecisionRequest.
        :rtype: ReturnRequestDecisionType
        """
        return self._decision_type

    @decision_type.setter
    def decision_type(self, decision_type: ReturnRequestDecisionType):
        """Sets the decision_type of this SetReturnDecisionRequest.


        :param decision_type: The decision_type of this SetReturnDecisionRequest.
        :type decision_type: ReturnRequestDecisionType
        """
        if decision_type is None:
            raise ValueError("Invalid value for `decision_type`, must not be `None`")  # noqa: E501

        self._decision_type = decision_type

    @property
    def comment(self) -> str:
        """Gets the comment of this SetReturnDecisionRequest.

        Комментарий к решению. Укажите:  * для `REFUND_MONEY_INCLUDING_SHIPMENT`— стоимость обратной пересылки;  * для `REPAIR` — когда вы устраните недостатки товара;  * для `DECLINE_REFUND` — причину отказа;  * для `OTHER_DECISION` — какое решение вы предлагаете.   # noqa: E501

        :return: The comment of this SetReturnDecisionRequest.
        :rtype: str
        """
        return self._comment

    @comment.setter
    def comment(self, comment: str):
        """Sets the comment of this SetReturnDecisionRequest.

        Комментарий к решению. Укажите:  * для `REFUND_MONEY_INCLUDING_SHIPMENT`— стоимость обратной пересылки;  * для `REPAIR` — когда вы устраните недостатки товара;  * для `DECLINE_REFUND` — причину отказа;  * для `OTHER_DECISION` — какое решение вы предлагаете.   # noqa: E501

        :param comment: The comment of this SetReturnDecisionRequest.
        :type comment: str
        """

        self._comment = comment
