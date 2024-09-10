# coding: utf-8

from typing import Dict, List  # noqa: F401
import importlib
import pkgutil

from ympa_python_fastapi_server.apis.content_api_base import BaseContentApi
import openapi_server.impl

from fastapi import (  # noqa: F401
    APIRouter,
    Body,
    Cookie,
    Depends,
    Form,
    Header,
    HTTPException,
    Path,
    Query,
    Response,
    Security,
    status,
)

from ympa_python_fastapi_server.models.extra_models import TokenModel  # noqa: F401
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

router = APIRouter()

ns_pkg = openapi_server.impl
for _, name, _ in pkgutil.iter_modules(ns_pkg.__path__, ns_pkg.__name__ + "."):
    importlib.import_module(name)


@router.post(
    "/category/{categoryId}/parameters",
    responses={
        200: {"model": GetCategoryContentParametersResponse, "description": "Список характеристик товаров из заданной категории."},
        400: {"model": ApiClientDataErrorResponse, "description": "Запрос содержит неправильные данные."},
        401: {"model": ApiUnauthorizedErrorResponse, "description": "В запросе не указаны данные для авторизации."},
        403: {"model": ApiForbiddenErrorResponse, "description": "Данные для авторизации неверны или доступ к ресурсу запрещен."},
        404: {"model": ApiNotFoundErrorResponse, "description": "Запрашиваемый ресурс не найден."},
        420: {"model": ApiLimitErrorResponse, "description": "Превышено ограничение на доступ к ресурсу."},
        500: {"model": ApiServerErrorResponse, "description": "Внутренняя ошибка сервера."},
    },
    tags=["content","dbs","fby","fbs","express"],
    summary="Списки характеристик товаров по категориям",
    response_model_by_alias=True,
)
async def get_category_content_parameters(
    categoryId: int = Path(..., description="Идентификатор категории на Маркете.  Чтобы узнать идентификатор категории, к которой относится интересующий вас товар, воспользуйтесь запросом [POST categories/tree](../../reference/categories/getCategoriesTree.md). "),
    token_OAuth: TokenModel = Security(
        get_token_OAuth, scopes=["market:partner-api"]
    ),
) -> GetCategoryContentParametersResponse:
    """Возвращает список характеристик с допустимыми значениями для заданной категории.  |**⚙️ Лимит:** 50 категорий в минуту | |-| """
    if not BaseContentApi.subclasses:
        raise HTTPException(status_code=500, detail="Not implemented")
    return await BaseContentApi.subclasses[0]().get_category_content_parameters(categoryId)


@router.post(
    "/businesses/{businessId}/offer-cards",
    responses={
        200: {"model": GetOfferCardsContentStatusResponse, "description": "Информация о карточках указанных товаров."},
        400: {"model": ApiClientDataErrorResponse, "description": "Запрос содержит неправильные данные."},
        401: {"model": ApiUnauthorizedErrorResponse, "description": "В запросе не указаны данные для авторизации."},
        403: {"model": ApiForbiddenErrorResponse, "description": "Данные для авторизации неверны или доступ к ресурсу запрещен."},
        404: {"model": ApiNotFoundErrorResponse, "description": "Запрашиваемый ресурс не найден."},
        420: {"model": ApiLimitErrorResponse, "description": "Превышено ограничение на доступ к ресурсу."},
        500: {"model": ApiServerErrorResponse, "description": "Внутренняя ошибка сервера."},
    },
    tags=["content","dbs","fby","fbs","express"],
    summary="Получение информации о заполненности карточек магазина",
    response_model_by_alias=True,
)
async def get_offer_cards_content_status(
    businessId: int = Path(..., description="Идентификатор кабинета. Чтобы узнать идентификатор, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md#businessdto).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html) "),
    page_token: str = Query(None, description="Идентификатор страницы c результатами.  Если параметр не указан, возвращается первая страница.  Рекомендуется передавать значение выходного параметра &#x60;nextPageToken&#x60;, полученное при последнем запросе.  Если задан &#x60;page_token&#x60; и в запросе есть параметры &#x60;offset&#x60;, &#x60;page_number&#x60; и &#x60;page_size&#x60;, они игнорируются. ", alias="page_token"),
    limit: int = Query(None, description="Количество значений на одной странице. ", alias="limit"),
    get_offer_cards_content_status_request: GetOfferCardsContentStatusRequest = Body(None, description=""),
    token_OAuth: TokenModel = Security(
        get_token_OAuth, scopes=["market:partner-api"]
    ),
) -> GetOfferCardsContentStatusResponse:
    """Возвращает сведения о состоянии контента для заданных товаров:  * создана ли карточка товара и в каком она статусе; * заполненность карточки в процентах; * переданные характеристики товаров; * есть ли ошибки или предупреждения, связанные с контентом; * рекомендации по заполнению карточки.  |**⚙️ Лимит:** 600 запросов в минуту| |-| """
    if not BaseContentApi.subclasses:
        raise HTTPException(status_code=500, detail="Not implemented")
    return await BaseContentApi.subclasses[0]().get_offer_cards_content_status(businessId, page_token, limit, get_offer_cards_content_status_request)


@router.post(
    "/businesses/{businessId}/offer-cards/update",
    responses={
        200: {"model": UpdateOfferContentResponse, "description": "Запрос выполнен корректно, данные обработаны.  {% note warning \&quot;Ответ 200 сам по себе не значит, что переданные значения корректны\&quot; %}  Обязательно посмотрите детали ответа: &#x60;status&#x60; и перечень ошибок, если он есть.  Даже если ошибка допущена в характеристиках всего одного товара, никакие изменения из запроса в каталог не попадут.  {% endnote %}  Если в &#x60;status&#x60; вернулось &#x60;ERROR&#x60;, убедитесь, что:  * все обязательные характеристики заполнены; * характеристики действительно существуют в указанных категориях; * значения соответствуют характеристикам; * ваши собственные значения имеют нужный тип данных.  Найти проблемы помогут поля &#x60;errors&#x60; и &#x60;warnings&#x60;. "},
        400: {"model": ApiClientDataErrorResponse, "description": "Запрос содержит неправильные данные."},
        401: {"model": ApiUnauthorizedErrorResponse, "description": "В запросе не указаны данные для авторизации."},
        403: {"model": ApiForbiddenErrorResponse, "description": "Данные для авторизации неверны или доступ к ресурсу запрещен."},
        404: {"model": ApiNotFoundErrorResponse, "description": "Запрашиваемый ресурс не найден."},
        420: {"model": ApiLimitErrorResponse, "description": "Превышено ограничение на доступ к ресурсу."},
        423: {"model": ApiLockedErrorResponse, "description": "К ресурсу нельзя применить указанный метод."},
        500: {"model": ApiServerErrorResponse, "description": "Внутренняя ошибка сервера."},
    },
    tags=["content","dbs","fby","fbs","express"],
    summary="Редактирование категорийных характеристик товара",
    response_model_by_alias=True,
)
async def update_offer_content(
    businessId: int = Path(..., description="Идентификатор кабинета. Чтобы узнать идентификатор, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md#businessdto).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html) "),
    update_offer_content_request: UpdateOfferContentRequest = Body(None, description=""),
    token_OAuth: TokenModel = Security(
        get_token_OAuth, scopes=["market:partner-api"]
    ),
) -> UpdateOfferContentResponse:
    """Редактирует характеристики товара, которые специфичны для категории, к которой он относится.  {% note warning \&quot;Здесь только то, что относится к конкретной категории\&quot; %}  Если вам нужно изменить основные параметры товара (название, описание, изображения, видео, производитель, штрихкод), воспользуйтесь запросом [POST businesses/{businessId}/offer-mappings/update](../../reference/business-assortment/updateOfferMappings.md).  {% endnote %}  Чтобы удалить характеристики, которые заданы в параметрах с типом &#x60;string&#x60;, передайте пустое значение.  {% note info \&quot;Данные в каталоге обновляются не мгновенно\&quot; %}  Это занимает до нескольких минут.  {% endnote %}  |**⚙️ Лимит:** 5000 товаров в минуту| |-| """
    if not BaseContentApi.subclasses:
        raise HTTPException(status_code=500, detail="Not implemented")
    return await BaseContentApi.subclasses[0]().update_offer_content(businessId, update_offer_content_request)
