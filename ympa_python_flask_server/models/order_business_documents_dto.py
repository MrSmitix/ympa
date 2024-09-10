from datetime import date, datetime  # noqa: F401

from typing import List, Dict  # noqa: F401

from ympa_python_flask_server.models.base_model import Model
from ympa_python_flask_server.models.document_dto import DocumentDTO
from ympa_python_flask_server import util

from ympa_python_flask_server.models.document_dto import DocumentDTO  # noqa: E501

class OrderBusinessDocumentsDTO(Model):
    """NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).

    Do not edit the class manually.
    """

    def __init__(self, upd=None, ukd=None, torg_twelve=None, sf=None, ksf=None):  # noqa: E501
        """OrderBusinessDocumentsDTO - a model defined in OpenAPI

        :param upd: The upd of this OrderBusinessDocumentsDTO.  # noqa: E501
        :type upd: DocumentDTO
        :param ukd: The ukd of this OrderBusinessDocumentsDTO.  # noqa: E501
        :type ukd: DocumentDTO
        :param torg_twelve: The torg_twelve of this OrderBusinessDocumentsDTO.  # noqa: E501
        :type torg_twelve: DocumentDTO
        :param sf: The sf of this OrderBusinessDocumentsDTO.  # noqa: E501
        :type sf: DocumentDTO
        :param ksf: The ksf of this OrderBusinessDocumentsDTO.  # noqa: E501
        :type ksf: DocumentDTO
        """
        self.openapi_types = {
            'upd': DocumentDTO,
            'ukd': DocumentDTO,
            'torg_twelve': DocumentDTO,
            'sf': DocumentDTO,
            'ksf': DocumentDTO
        }

        self.attribute_map = {
            'upd': 'upd',
            'ukd': 'ukd',
            'torg_twelve': 'torgTwelve',
            'sf': 'sf',
            'ksf': 'ksf'
        }

        self._upd = upd
        self._ukd = ukd
        self._torg_twelve = torg_twelve
        self._sf = sf
        self._ksf = ksf

    @classmethod
    def from_dict(cls, dikt) -> 'OrderBusinessDocumentsDTO':
        """Returns the dict as a model

        :param dikt: A dict.
        :type: dict
        :return: The OrderBusinessDocumentsDTO of this OrderBusinessDocumentsDTO.  # noqa: E501
        :rtype: OrderBusinessDocumentsDTO
        """
        return util.deserialize_model(dikt, cls)

    @property
    def upd(self) -> DocumentDTO:
        """Gets the upd of this OrderBusinessDocumentsDTO.


        :return: The upd of this OrderBusinessDocumentsDTO.
        :rtype: DocumentDTO
        """
        return self._upd

    @upd.setter
    def upd(self, upd: DocumentDTO):
        """Sets the upd of this OrderBusinessDocumentsDTO.


        :param upd: The upd of this OrderBusinessDocumentsDTO.
        :type upd: DocumentDTO
        """

        self._upd = upd

    @property
    def ukd(self) -> DocumentDTO:
        """Gets the ukd of this OrderBusinessDocumentsDTO.


        :return: The ukd of this OrderBusinessDocumentsDTO.
        :rtype: DocumentDTO
        """
        return self._ukd

    @ukd.setter
    def ukd(self, ukd: DocumentDTO):
        """Sets the ukd of this OrderBusinessDocumentsDTO.


        :param ukd: The ukd of this OrderBusinessDocumentsDTO.
        :type ukd: DocumentDTO
        """

        self._ukd = ukd

    @property
    def torg_twelve(self) -> DocumentDTO:
        """Gets the torg_twelve of this OrderBusinessDocumentsDTO.


        :return: The torg_twelve of this OrderBusinessDocumentsDTO.
        :rtype: DocumentDTO
        """
        return self._torg_twelve

    @torg_twelve.setter
    def torg_twelve(self, torg_twelve: DocumentDTO):
        """Sets the torg_twelve of this OrderBusinessDocumentsDTO.


        :param torg_twelve: The torg_twelve of this OrderBusinessDocumentsDTO.
        :type torg_twelve: DocumentDTO
        """

        self._torg_twelve = torg_twelve

    @property
    def sf(self) -> DocumentDTO:
        """Gets the sf of this OrderBusinessDocumentsDTO.


        :return: The sf of this OrderBusinessDocumentsDTO.
        :rtype: DocumentDTO
        """
        return self._sf

    @sf.setter
    def sf(self, sf: DocumentDTO):
        """Sets the sf of this OrderBusinessDocumentsDTO.


        :param sf: The sf of this OrderBusinessDocumentsDTO.
        :type sf: DocumentDTO
        """

        self._sf = sf

    @property
    def ksf(self) -> DocumentDTO:
        """Gets the ksf of this OrderBusinessDocumentsDTO.


        :return: The ksf of this OrderBusinessDocumentsDTO.
        :rtype: DocumentDTO
        """
        return self._ksf

    @ksf.setter
    def ksf(self, ksf: DocumentDTO):
        """Sets the ksf of this OrderBusinessDocumentsDTO.


        :param ksf: The ksf of this OrderBusinessDocumentsDTO.
        :type ksf: DocumentDTO
        """

        self._ksf = ksf
