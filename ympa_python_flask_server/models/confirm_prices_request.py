from datetime import date, datetime  # noqa: F401

from typing import List, Dict  # noqa: F401

from ympa_python_flask_server.models.base_model import Model
from ympa_python_flask_server import util


class ConfirmPricesRequest(Model):
    """NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).

    Do not edit the class manually.
    """

    def __init__(self, offer_ids=None):  # noqa: E501
        """ConfirmPricesRequest - a model defined in OpenAPI

        :param offer_ids: The offer_ids of this ConfirmPricesRequest.  # noqa: E501
        :type offer_ids: List[str]
        """
        self.openapi_types = {
            'offer_ids': List[str]
        }

        self.attribute_map = {
            'offer_ids': 'offerIds'
        }

        self._offer_ids = offer_ids

    @classmethod
    def from_dict(cls, dikt) -> 'ConfirmPricesRequest':
        """Returns the dict as a model

        :param dikt: A dict.
        :type: dict
        :return: The ConfirmPricesRequest of this ConfirmPricesRequest.  # noqa: E501
        :rtype: ConfirmPricesRequest
        """
        return util.deserialize_model(dikt, cls)

    @property
    def offer_ids(self) -> List[str]:
        """Gets the offer_ids of this ConfirmPricesRequest.

        Идентификаторы товаров, у которых подтверждается цена.  # noqa: E501

        :return: The offer_ids of this ConfirmPricesRequest.
        :rtype: List[str]
        """
        return self._offer_ids

    @offer_ids.setter
    def offer_ids(self, offer_ids: List[str]):
        """Sets the offer_ids of this ConfirmPricesRequest.

        Идентификаторы товаров, у которых подтверждается цена.  # noqa: E501

        :param offer_ids: The offer_ids of this ConfirmPricesRequest.
        :type offer_ids: List[str]
        """
        if offer_ids is None:
            raise ValueError("Invalid value for `offer_ids`, must not be `None`")  # noqa: E501
        if offer_ids is not None and len(offer_ids) > 200:
            raise ValueError("Invalid value for `offer_ids`, number of items must be less than or equal to `200`")  # noqa: E501
        if offer_ids is not None and len(offer_ids) < 1:
            raise ValueError("Invalid value for `offer_ids`, number of items must be greater than or equal to `1`")  # noqa: E501

        self._offer_ids = offer_ids
