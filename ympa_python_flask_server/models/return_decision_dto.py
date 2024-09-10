from datetime import date, datetime  # noqa: F401

from typing import List, Dict  # noqa: F401

from ympa_python_flask_server.models.base_model import Model
from ympa_python_flask_server.models.return_decision_reason_type import ReturnDecisionReasonType
from ympa_python_flask_server.models.return_decision_subreason_type import ReturnDecisionSubreasonType
from ympa_python_flask_server.models.return_decision_type import ReturnDecisionType
from ympa_python_flask_server import util

from ympa_python_flask_server.models.return_decision_reason_type import ReturnDecisionReasonType  # noqa: E501
from ympa_python_flask_server.models.return_decision_subreason_type import ReturnDecisionSubreasonType  # noqa: E501
from ympa_python_flask_server.models.return_decision_type import ReturnDecisionType  # noqa: E501

class ReturnDecisionDTO(Model):
    """NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).

    Do not edit the class manually.
    """

    def __init__(self, return_item_id=None, count=None, comment=None, reason_type=None, subreason_type=None, decision_type=None, refund_amount=None, partner_compensation=None, images=None):  # noqa: E501
        """ReturnDecisionDTO - a model defined in OpenAPI

        :param return_item_id: The return_item_id of this ReturnDecisionDTO.  # noqa: E501
        :type return_item_id: int
        :param count: The count of this ReturnDecisionDTO.  # noqa: E501
        :type count: int
        :param comment: The comment of this ReturnDecisionDTO.  # noqa: E501
        :type comment: str
        :param reason_type: The reason_type of this ReturnDecisionDTO.  # noqa: E501
        :type reason_type: ReturnDecisionReasonType
        :param subreason_type: The subreason_type of this ReturnDecisionDTO.  # noqa: E501
        :type subreason_type: ReturnDecisionSubreasonType
        :param decision_type: The decision_type of this ReturnDecisionDTO.  # noqa: E501
        :type decision_type: ReturnDecisionType
        :param refund_amount: The refund_amount of this ReturnDecisionDTO.  # noqa: E501
        :type refund_amount: int
        :param partner_compensation: The partner_compensation of this ReturnDecisionDTO.  # noqa: E501
        :type partner_compensation: int
        :param images: The images of this ReturnDecisionDTO.  # noqa: E501
        :type images: List[str]
        """
        self.openapi_types = {
            'return_item_id': int,
            'count': int,
            'comment': str,
            'reason_type': ReturnDecisionReasonType,
            'subreason_type': ReturnDecisionSubreasonType,
            'decision_type': ReturnDecisionType,
            'refund_amount': int,
            'partner_compensation': int,
            'images': List[str]
        }

        self.attribute_map = {
            'return_item_id': 'returnItemId',
            'count': 'count',
            'comment': 'comment',
            'reason_type': 'reasonType',
            'subreason_type': 'subreasonType',
            'decision_type': 'decisionType',
            'refund_amount': 'refundAmount',
            'partner_compensation': 'partnerCompensation',
            'images': 'images'
        }

        self._return_item_id = return_item_id
        self._count = count
        self._comment = comment
        self._reason_type = reason_type
        self._subreason_type = subreason_type
        self._decision_type = decision_type
        self._refund_amount = refund_amount
        self._partner_compensation = partner_compensation
        self._images = images

    @classmethod
    def from_dict(cls, dikt) -> 'ReturnDecisionDTO':
        """Returns the dict as a model

        :param dikt: A dict.
        :type: dict
        :return: The ReturnDecisionDTO of this ReturnDecisionDTO.  # noqa: E501
        :rtype: ReturnDecisionDTO
        """
        return util.deserialize_model(dikt, cls)

    @property
    def return_item_id(self) -> int:
        """Gets the return_item_id of this ReturnDecisionDTO.

        Идентификатор товара в возврате.  # noqa: E501

        :return: The return_item_id of this ReturnDecisionDTO.
        :rtype: int
        """
        return self._return_item_id

    @return_item_id.setter
    def return_item_id(self, return_item_id: int):
        """Sets the return_item_id of this ReturnDecisionDTO.

        Идентификатор товара в возврате.  # noqa: E501

        :param return_item_id: The return_item_id of this ReturnDecisionDTO.
        :type return_item_id: int
        """

        self._return_item_id = return_item_id

    @property
    def count(self) -> int:
        """Gets the count of this ReturnDecisionDTO.

        Количество единиц товара.  # noqa: E501

        :return: The count of this ReturnDecisionDTO.
        :rtype: int
        """
        return self._count

    @count.setter
    def count(self, count: int):
        """Sets the count of this ReturnDecisionDTO.

        Количество единиц товара.  # noqa: E501

        :param count: The count of this ReturnDecisionDTO.
        :type count: int
        """

        self._count = count

    @property
    def comment(self) -> str:
        """Gets the comment of this ReturnDecisionDTO.

        Комментарий.  # noqa: E501

        :return: The comment of this ReturnDecisionDTO.
        :rtype: str
        """
        return self._comment

    @comment.setter
    def comment(self, comment: str):
        """Sets the comment of this ReturnDecisionDTO.

        Комментарий.  # noqa: E501

        :param comment: The comment of this ReturnDecisionDTO.
        :type comment: str
        """

        self._comment = comment

    @property
    def reason_type(self) -> ReturnDecisionReasonType:
        """Gets the reason_type of this ReturnDecisionDTO.


        :return: The reason_type of this ReturnDecisionDTO.
        :rtype: ReturnDecisionReasonType
        """
        return self._reason_type

    @reason_type.setter
    def reason_type(self, reason_type: ReturnDecisionReasonType):
        """Sets the reason_type of this ReturnDecisionDTO.


        :param reason_type: The reason_type of this ReturnDecisionDTO.
        :type reason_type: ReturnDecisionReasonType
        """

        self._reason_type = reason_type

    @property
    def subreason_type(self) -> ReturnDecisionSubreasonType:
        """Gets the subreason_type of this ReturnDecisionDTO.


        :return: The subreason_type of this ReturnDecisionDTO.
        :rtype: ReturnDecisionSubreasonType
        """
        return self._subreason_type

    @subreason_type.setter
    def subreason_type(self, subreason_type: ReturnDecisionSubreasonType):
        """Sets the subreason_type of this ReturnDecisionDTO.


        :param subreason_type: The subreason_type of this ReturnDecisionDTO.
        :type subreason_type: ReturnDecisionSubreasonType
        """

        self._subreason_type = subreason_type

    @property
    def decision_type(self) -> ReturnDecisionType:
        """Gets the decision_type of this ReturnDecisionDTO.


        :return: The decision_type of this ReturnDecisionDTO.
        :rtype: ReturnDecisionType
        """
        return self._decision_type

    @decision_type.setter
    def decision_type(self, decision_type: ReturnDecisionType):
        """Sets the decision_type of this ReturnDecisionDTO.


        :param decision_type: The decision_type of this ReturnDecisionDTO.
        :type decision_type: ReturnDecisionType
        """

        self._decision_type = decision_type

    @property
    def refund_amount(self) -> int:
        """Gets the refund_amount of this ReturnDecisionDTO.

        Сумма возврата.  # noqa: E501

        :return: The refund_amount of this ReturnDecisionDTO.
        :rtype: int
        """
        return self._refund_amount

    @refund_amount.setter
    def refund_amount(self, refund_amount: int):
        """Sets the refund_amount of this ReturnDecisionDTO.

        Сумма возврата.  # noqa: E501

        :param refund_amount: The refund_amount of this ReturnDecisionDTO.
        :type refund_amount: int
        """

        self._refund_amount = refund_amount

    @property
    def partner_compensation(self) -> int:
        """Gets the partner_compensation of this ReturnDecisionDTO.

        Компенсация за обратную доставку.  # noqa: E501

        :return: The partner_compensation of this ReturnDecisionDTO.
        :rtype: int
        """
        return self._partner_compensation

    @partner_compensation.setter
    def partner_compensation(self, partner_compensation: int):
        """Sets the partner_compensation of this ReturnDecisionDTO.

        Компенсация за обратную доставку.  # noqa: E501

        :param partner_compensation: The partner_compensation of this ReturnDecisionDTO.
        :type partner_compensation: int
        """

        self._partner_compensation = partner_compensation

    @property
    def images(self) -> List[str]:
        """Gets the images of this ReturnDecisionDTO.

        Список хеш-кодов фотографий товара от покупателя.  # noqa: E501

        :return: The images of this ReturnDecisionDTO.
        :rtype: List[str]
        """
        return self._images

    @images.setter
    def images(self, images: List[str]):
        """Sets the images of this ReturnDecisionDTO.

        Список хеш-кодов фотографий товара от покупателя.  # noqa: E501

        :param images: The images of this ReturnDecisionDTO.
        :type images: List[str]
        """

        self._images = images
