# coding: utf-8

from typing import ClassVar, Dict, List, Tuple  # noqa: F401

from ympa_python_fastapi_server.models.api_client_data_error_response import ApiClientDataErrorResponse
from ympa_python_fastapi_server.models.api_forbidden_error_response import ApiForbiddenErrorResponse
from ympa_python_fastapi_server.models.api_limit_error_response import ApiLimitErrorResponse
from ympa_python_fastapi_server.models.api_locked_error_response import ApiLockedErrorResponse
from ympa_python_fastapi_server.models.api_not_found_error_response import ApiNotFoundErrorResponse
from ympa_python_fastapi_server.models.api_server_error_response import ApiServerErrorResponse
from ympa_python_fastapi_server.models.api_unauthorized_error_response import ApiUnauthorizedErrorResponse
from ympa_python_fastapi_server.models.get_category_content_parameters_response import GetCategoryContentParametersResponse
from ympa_python_fastapi_server.models.get_offer_cards_content_status_request import GetOfferCardsContentStatusRequest
from ympa_python_fastapi_server.models.get_offer_cards_content_status_response import GetOfferCardsContentStatusResponse
from ympa_python_fastapi_server.models.update_offer_content_request import UpdateOfferContentRequest
from ympa_python_fastapi_server.models.update_offer_content_response import UpdateOfferContentResponse
from ympa_python_fastapi_server.security_api import get_token_OAuth

class BaseContentApi:
    subclasses: ClassVar[Tuple] = ()

    def __init_subclass__(cls, **kwargs):
        super().__init_subclass__(**kwargs)
        BaseContentApi.subclasses = BaseContentApi.subclasses + (cls,)
    async def get_category_content_parameters(
        self,
        categoryId: int,
    ) -> GetCategoryContentParametersResponse:
        """Возвращает список характеристик с допустимыми значениями для заданной категории.  |**⚙️ Лимит:** 50 категорий в минуту | |-| """
        ...


    async def get_offer_cards_content_status(
        self,
        businessId: int,
        page_token: str,
        limit: int,
        get_offer_cards_content_status_request: GetOfferCardsContentStatusRequest,
    ) -> GetOfferCardsContentStatusResponse:
        """Возвращает сведения о состоянии контента для заданных товаров:  * создана ли карточка товара и в каком она статусе; * заполненность карточки в процентах; * переданные характеристики товаров; * есть ли ошибки или предупреждения, связанные с контентом; * рекомендации по заполнению карточки.  |**⚙️ Лимит:** 600 запросов в минуту| |-| """
        ...


    async def update_offer_content(
        self,
        businessId: int,
        update_offer_content_request: UpdateOfferContentRequest,
    ) -> UpdateOfferContentResponse:
        """Редактирует характеристики товара, которые специфичны для категории, к которой он относится.  {% note warning \&quot;Здесь только то, что относится к конкретной категории\&quot; %}  Если вам нужно изменить основные параметры товара (название, описание, изображения, видео, производитель, штрихкод), воспользуйтесь запросом [POST businesses/{businessId}/offer-mappings/update](../../reference/business-assortment/updateOfferMappings.md).  {% endnote %}  Чтобы удалить характеристики, которые заданы в параметрах с типом &#x60;string&#x60;, передайте пустое значение.  {% note info \&quot;Данные в каталоге обновляются не мгновенно\&quot; %}  Это занимает до нескольких минут.  {% endnote %}  |**⚙️ Лимит:** 5000 товаров в минуту| |-| """
        ...
