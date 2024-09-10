# coding: utf-8

from __future__ import absolute_import
from datetime import date, datetime  # noqa: F401

from typing import List, Dict  # noqa: F401

from app.ympa_python_blueplanet_server.models.base_model import Model
from ympa_python_blueplanet_server import util


class DeleteOffersFromArchiveDTO(Model):
    """NOTE: This class is auto generated by the swagger code generator program.

    Do not edit the class manually.
    """

    def __init__(self, not_unarchived_offer_ids: List[str]=None):  # noqa: E501
        """DeleteOffersFromArchiveDTO - a model defined in Swagger

        :param not_unarchived_offer_ids: The not_unarchived_offer_ids of this DeleteOffersFromArchiveDTO.  # noqa: E501
        :type not_unarchived_offer_ids: List[str]
        """
        self.swagger_types = {
            'not_unarchived_offer_ids': List[str]
        }

        self.attribute_map = {
            'not_unarchived_offer_ids': 'notUnarchivedOfferIds'
        }

        self._not_unarchived_offer_ids = not_unarchived_offer_ids

    @classmethod
    def from_dict(cls, dikt) -> 'DeleteOffersFromArchiveDTO':
        """Returns the dict as a model

        :param dikt: A dict.
        :type: dict
        :return: The DeleteOffersFromArchiveDTO of this DeleteOffersFromArchiveDTO.  # noqa: E501
        :rtype: DeleteOffersFromArchiveDTO
        """
        return util.deserialize_model(dikt, cls)

    @property
    def not_unarchived_offer_ids(self) -> List[str]:
        """Gets the not_unarchived_offer_ids of this DeleteOffersFromArchiveDTO.

        Список товаров, которые не удалось восстановить из архива.  # noqa: E501

        :return: The not_unarchived_offer_ids of this DeleteOffersFromArchiveDTO.
        :rtype: List[str]
        """
        return self._not_unarchived_offer_ids

    @not_unarchived_offer_ids.setter
    def not_unarchived_offer_ids(self, not_unarchived_offer_ids: List[str]):
        """Sets the not_unarchived_offer_ids of this DeleteOffersFromArchiveDTO.

        Список товаров, которые не удалось восстановить из архива.  # noqa: E501

        :param not_unarchived_offer_ids: The not_unarchived_offer_ids of this DeleteOffersFromArchiveDTO.
        :type not_unarchived_offer_ids: List[str]
        """

        self._not_unarchived_offer_ids = not_unarchived_offer_ids
