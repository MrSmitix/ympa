# coding: utf-8

from datetime import date, datetime

from typing import List, Dict, Type

from ympa_python_aiohttp_server.models.base_model import Model
from ympa_python_aiohttp_server.models.feed_content_dto import FeedContentDTO
from ympa_python_aiohttp_server.models.feed_download_dto import FeedDownloadDTO
from ympa_python_aiohttp_server.models.feed_placement_dto import FeedPlacementDTO
from ympa_python_aiohttp_server.models.feed_publication_dto import FeedPublicationDTO
from ympa_python_aiohttp_server import util


class FeedDTO(Model):
    """NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).

    Do not edit the class manually.
    """

    def __init__(self, id: int=None, login: str=None, name: str=None, password: str=None, upload_date: datetime=None, url: str=None, content: FeedContentDTO=None, download: FeedDownloadDTO=None, placement: FeedPlacementDTO=None, publication: FeedPublicationDTO=None):
        """FeedDTO - a model defined in OpenAPI

        :param id: The id of this FeedDTO.
        :param login: The login of this FeedDTO.
        :param name: The name of this FeedDTO.
        :param password: The password of this FeedDTO.
        :param upload_date: The upload_date of this FeedDTO.
        :param url: The url of this FeedDTO.
        :param content: The content of this FeedDTO.
        :param download: The download of this FeedDTO.
        :param placement: The placement of this FeedDTO.
        :param publication: The publication of this FeedDTO.
        """
        self.openapi_types = {
            'id': int,
            'login': str,
            'name': str,
            'password': str,
            'upload_date': datetime,
            'url': str,
            'content': FeedContentDTO,
            'download': FeedDownloadDTO,
            'placement': FeedPlacementDTO,
            'publication': FeedPublicationDTO
        }

        self.attribute_map = {
            'id': 'id',
            'login': 'login',
            'name': 'name',
            'password': 'password',
            'upload_date': 'uploadDate',
            'url': 'url',
            'content': 'content',
            'download': 'download',
            'placement': 'placement',
            'publication': 'publication'
        }

        self._id = id
        self._login = login
        self._name = name
        self._password = password
        self._upload_date = upload_date
        self._url = url
        self._content = content
        self._download = download
        self._placement = placement
        self._publication = publication

    @classmethod
    def from_dict(cls, dikt: dict) -> 'FeedDTO':
        """Returns the dict as a model

        :param dikt: A dict.
        :return: The FeedDTO of this FeedDTO.
        """
        return util.deserialize_model(dikt, cls)

    @property
    def id(self):
        """Gets the id of this FeedDTO.

        Идентификатор прайс-листа.

        :return: The id of this FeedDTO.
        :rtype: int
        """
        return self._id

    @id.setter
    def id(self, id):
        """Sets the id of this FeedDTO.

        Идентификатор прайс-листа.

        :param id: The id of this FeedDTO.
        :type id: int
        """

        self._id = id

    @property
    def login(self):
        """Gets the login of this FeedDTO.

        Логин для авторизации при скачивании прайс-листа. Параметр выводится при размещении прайс-листа на сайте магазина и в случае ограничения доступа к нему. 

        :return: The login of this FeedDTO.
        :rtype: str
        """
        return self._login

    @login.setter
    def login(self, login):
        """Sets the login of this FeedDTO.

        Логин для авторизации при скачивании прайс-листа. Параметр выводится при размещении прайс-листа на сайте магазина и в случае ограничения доступа к нему. 

        :param login: The login of this FeedDTO.
        :type login: str
        """

        self._login = login

    @property
    def name(self):
        """Gets the name of this FeedDTO.

        Имя файла, содержащего прайс-лист. Параметр выводится при размещении прайс-листа на сервере Маркета. 

        :return: The name of this FeedDTO.
        :rtype: str
        """
        return self._name

    @name.setter
    def name(self, name):
        """Sets the name of this FeedDTO.

        Имя файла, содержащего прайс-лист. Параметр выводится при размещении прайс-листа на сервере Маркета. 

        :param name: The name of this FeedDTO.
        :type name: str
        """

        self._name = name

    @property
    def password(self):
        """Gets the password of this FeedDTO.

        Пароль для авторизации при скачивании прайс-листа. Параметр выводится при размещении прайс-листа на сайте магазина и в случае ограничения доступа к нему. 

        :return: The password of this FeedDTO.
        :rtype: str
        """
        return self._password

    @password.setter
    def password(self, password):
        """Sets the password of this FeedDTO.

        Пароль для авторизации при скачивании прайс-листа. Параметр выводится при размещении прайс-листа на сайте магазина и в случае ограничения доступа к нему. 

        :param password: The password of this FeedDTO.
        :type password: str
        """

        self._password = password

    @property
    def upload_date(self):
        """Gets the upload_date of this FeedDTO.

        Дата загрузки прайс-листа на Маркет.  Формат даты: `ДД-ММ-ГГГГ`.  Параметр выводится при размещении прайс-листа на сервере Маркета. 

        :return: The upload_date of this FeedDTO.
        :rtype: datetime
        """
        return self._upload_date

    @upload_date.setter
    def upload_date(self, upload_date):
        """Sets the upload_date of this FeedDTO.

        Дата загрузки прайс-листа на Маркет.  Формат даты: `ДД-ММ-ГГГГ`.  Параметр выводится при размещении прайс-листа на сервере Маркета. 

        :param upload_date: The upload_date of this FeedDTO.
        :type upload_date: datetime
        """

        self._upload_date = upload_date

    @property
    def url(self):
        """Gets the url of this FeedDTO.

        URL прайс-листа. Параметр выводится при размещении прайс-листа на сайте магазина. 

        :return: The url of this FeedDTO.
        :rtype: str
        """
        return self._url

    @url.setter
    def url(self, url):
        """Sets the url of this FeedDTO.

        URL прайс-листа. Параметр выводится при размещении прайс-листа на сайте магазина. 

        :param url: The url of this FeedDTO.
        :type url: str
        """

        self._url = url

    @property
    def content(self):
        """Gets the content of this FeedDTO.


        :return: The content of this FeedDTO.
        :rtype: FeedContentDTO
        """
        return self._content

    @content.setter
    def content(self, content):
        """Sets the content of this FeedDTO.


        :param content: The content of this FeedDTO.
        :type content: FeedContentDTO
        """

        self._content = content

    @property
    def download(self):
        """Gets the download of this FeedDTO.


        :return: The download of this FeedDTO.
        :rtype: FeedDownloadDTO
        """
        return self._download

    @download.setter
    def download(self, download):
        """Sets the download of this FeedDTO.


        :param download: The download of this FeedDTO.
        :type download: FeedDownloadDTO
        """

        self._download = download

    @property
    def placement(self):
        """Gets the placement of this FeedDTO.


        :return: The placement of this FeedDTO.
        :rtype: FeedPlacementDTO
        """
        return self._placement

    @placement.setter
    def placement(self, placement):
        """Sets the placement of this FeedDTO.


        :param placement: The placement of this FeedDTO.
        :type placement: FeedPlacementDTO
        """

        self._placement = placement

    @property
    def publication(self):
        """Gets the publication of this FeedDTO.


        :return: The publication of this FeedDTO.
        :rtype: FeedPublicationDTO
        """
        return self._publication

    @publication.setter
    def publication(self, publication):
        """Sets the publication of this FeedDTO.


        :param publication: The publication of this FeedDTO.
        :type publication: FeedPublicationDTO
        """

        self._publication = publication
