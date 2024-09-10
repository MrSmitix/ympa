# coding: utf-8

from typing import Dict, List  # noqa: F401
import importlib
import pkgutil

from ympa_python_fastapi_server.apis.business_offer_mappings_api_base import BaseBusinessOfferMappingsApi
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
from ympa_python_fastapi_server.models.add_offers_to_archive_request import AddOffersToArchiveRequest
from ympa_python_fastapi_server.models.add_offers_to_archive_response import AddOffersToArchiveResponse
from ympa_python_fastapi_server.models.api_client_data_error_response import ApiClientDataErrorResponse
from ympa_python_fastapi_server.models.api_forbidden_error_response import ApiForbiddenErrorResponse
from ympa_python_fastapi_server.models.api_limit_error_response import ApiLimitErrorResponse
from ympa_python_fastapi_server.models.api_locked_error_response import ApiLockedErrorResponse
from ympa_python_fastapi_server.models.api_not_found_error_response import ApiNotFoundErrorResponse
from ympa_python_fastapi_server.models.api_server_error_response import ApiServerErrorResponse
from ympa_python_fastapi_server.models.api_unauthorized_error_response import ApiUnauthorizedErrorResponse
from ympa_python_fastapi_server.models.delete_offers_from_archive_request import DeleteOffersFromArchiveRequest
from ympa_python_fastapi_server.models.delete_offers_from_archive_response import DeleteOffersFromArchiveResponse
from ympa_python_fastapi_server.models.delete_offers_request import DeleteOffersRequest
from ympa_python_fastapi_server.models.delete_offers_response import DeleteOffersResponse
from ympa_python_fastapi_server.models.get_offer_mappings_request import GetOfferMappingsRequest
from ympa_python_fastapi_server.models.get_offer_mappings_response import GetOfferMappingsResponse
from ympa_python_fastapi_server.models.get_suggested_offer_mappings_request import GetSuggestedOfferMappingsRequest
from ympa_python_fastapi_server.models.get_suggested_offer_mappings_response import GetSuggestedOfferMappingsResponse
from ympa_python_fastapi_server.models.update_offer_mappings_request import UpdateOfferMappingsRequest
from ympa_python_fastapi_server.models.update_offer_mappings_response import UpdateOfferMappingsResponse
from ympa_python_fastapi_server.security_api import get_token_OAuth

router = APIRouter()

ns_pkg = openapi_server.impl
for _, name, _ in pkgutil.iter_modules(ns_pkg.__path__, ns_pkg.__name__ + "."):
    importlib.import_module(name)


@router.post(
    "/businesses/{businessId}/offer-mappings/archive",
    responses={
        200: {"model": AddOffersToArchiveResponse, "description": "Если некоторые товары добавить в архив не удалось, в ответе 200 будет их список.  Список успешно добавленных товаров не возвращается. "},
        400: {"model": ApiClientDataErrorResponse, "description": "Запрос содержит неправильные данные."},
        401: {"model": ApiUnauthorizedErrorResponse, "description": "В запросе не указаны данные для авторизации."},
        403: {"model": ApiForbiddenErrorResponse, "description": "Данные для авторизации неверны или доступ к ресурсу запрещен."},
        404: {"model": ApiNotFoundErrorResponse, "description": "Запрашиваемый ресурс не найден."},
        420: {"model": ApiLimitErrorResponse, "description": "Превышено ограничение на доступ к ресурсу."},
        423: {"model": ApiLockedErrorResponse, "description": "К ресурсу нельзя применить указанный метод."},
        500: {"model": ApiServerErrorResponse, "description": "Внутренняя ошибка сервера."},
    },
    tags=["business-offer-mappings","dbs","fby","fbs","express"],
    summary="Добавление товаров в архив",
    response_model_by_alias=True,
)
async def add_offers_to_archive(
    businessId: int = Path(..., description="Идентификатор кабинета. Чтобы узнать идентификатор, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md#businessdto).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html) "),
    add_offers_to_archive_request: AddOffersToArchiveRequest = Body(None, description=""),
    token_OAuth: TokenModel = Security(
        get_token_OAuth, scopes=["market:partner-api"]
    ),
) -> AddOffersToArchiveResponse:
    """Помещает товары в архив. Товары, помещенные в архив, скрыты с витрины во всех магазинах кабинета.  {% note warning \&quot;В архив нельзя отправить товар, который хранится на складе Маркета\&quot; %}  Вначале такой товар нужно распродать или вывезти.  {% endnote %}  |**⚙️ Лимит:** 5000 товаров в минуту, не более 200 товаров в одном запросе| |-| """
    if not BaseBusinessOfferMappingsApi.subclasses:
        raise HTTPException(status_code=500, detail="Not implemented")
    return await BaseBusinessOfferMappingsApi.subclasses[0]().add_offers_to_archive(businessId, add_offers_to_archive_request)


@router.post(
    "/businesses/{businessId}/offer-mappings/delete",
    responses={
        200: {"model": DeleteOffersResponse, "description": "Если удалось удалить не все товары, с ответом 200 вернется список тех, что были в запросе, но остались в магазине."},
        400: {"model": ApiClientDataErrorResponse, "description": "Запрос содержит неправильные данные."},
        401: {"model": ApiUnauthorizedErrorResponse, "description": "В запросе не указаны данные для авторизации."},
        403: {"model": ApiForbiddenErrorResponse, "description": "Данные для авторизации неверны или доступ к ресурсу запрещен."},
        404: {"model": ApiNotFoundErrorResponse, "description": "Запрашиваемый ресурс не найден."},
        420: {"model": ApiLimitErrorResponse, "description": "Превышено ограничение на доступ к ресурсу."},
        423: {"model": ApiLockedErrorResponse, "description": "К ресурсу нельзя применить указанный метод."},
        500: {"model": ApiServerErrorResponse, "description": "Внутренняя ошибка сервера."},
    },
    tags=["business-offer-mappings","dbs","fby","fbs","express"],
    summary="Удаление товаров из каталога",
    response_model_by_alias=True,
)
async def delete_offers(
    businessId: int = Path(..., description="Идентификатор кабинета. Чтобы узнать идентификатор, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md#businessdto).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html) "),
    delete_offers_request: DeleteOffersRequest = Body(None, description=""),
    token_OAuth: TokenModel = Security(
        get_token_OAuth, scopes=["market:partner-api"]
    ),
) -> DeleteOffersResponse:
    """Удаляет товары из каталога.  |**⚙️ Лимит:** 5000 товаров в минуту, не более 200 товаров в одном запросе| |-| """
    if not BaseBusinessOfferMappingsApi.subclasses:
        raise HTTPException(status_code=500, detail="Not implemented")
    return await BaseBusinessOfferMappingsApi.subclasses[0]().delete_offers(businessId, delete_offers_request)


@router.post(
    "/businesses/{businessId}/offer-mappings/unarchive",
    responses={
        200: {"model": DeleteOffersFromArchiveResponse, "description": "Если некоторые товары восстановить из архива не удалось, в ответе 200 будет их список.  Список успешно восстановленных товаров не возвращается. "},
        400: {"model": ApiClientDataErrorResponse, "description": "Запрос содержит неправильные данные."},
        401: {"model": ApiUnauthorizedErrorResponse, "description": "В запросе не указаны данные для авторизации."},
        403: {"model": ApiForbiddenErrorResponse, "description": "Данные для авторизации неверны или доступ к ресурсу запрещен."},
        404: {"model": ApiNotFoundErrorResponse, "description": "Запрашиваемый ресурс не найден."},
        420: {"model": ApiLimitErrorResponse, "description": "Превышено ограничение на доступ к ресурсу."},
        423: {"model": ApiLockedErrorResponse, "description": "К ресурсу нельзя применить указанный метод."},
        500: {"model": ApiServerErrorResponse, "description": "Внутренняя ошибка сервера."},
    },
    tags=["business-offer-mappings","dbs","fby","fbs","express"],
    summary="Удаление товаров из архива",
    response_model_by_alias=True,
)
async def delete_offers_from_archive(
    businessId: int = Path(..., description="Идентификатор кабинета. Чтобы узнать идентификатор, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md#businessdto).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html) "),
    delete_offers_from_archive_request: DeleteOffersFromArchiveRequest = Body(None, description=""),
    token_OAuth: TokenModel = Security(
        get_token_OAuth, scopes=["market:partner-api"]
    ),
) -> DeleteOffersFromArchiveResponse:
    """Восстанавливает товары из архива.  |**⚙️ Лимит:** 5000 товаров в минуту, не более 200 товаров в одном запросе| |-| """
    if not BaseBusinessOfferMappingsApi.subclasses:
        raise HTTPException(status_code=500, detail="Not implemented")
    return await BaseBusinessOfferMappingsApi.subclasses[0]().delete_offers_from_archive(businessId, delete_offers_from_archive_request)


@router.post(
    "/businesses/{businessId}/offer-mappings",
    responses={
        200: {"model": GetOfferMappingsResponse, "description": "Информация о товарах в каталоге."},
        400: {"model": ApiClientDataErrorResponse, "description": "Запрос содержит неправильные данные."},
        401: {"model": ApiUnauthorizedErrorResponse, "description": "В запросе не указаны данные для авторизации."},
        403: {"model": ApiForbiddenErrorResponse, "description": "Данные для авторизации неверны или доступ к ресурсу запрещен."},
        404: {"model": ApiNotFoundErrorResponse, "description": "Запрашиваемый ресурс не найден."},
        420: {"model": ApiLimitErrorResponse, "description": "Превышено ограничение на доступ к ресурсу."},
        500: {"model": ApiServerErrorResponse, "description": "Внутренняя ошибка сервера."},
    },
    tags=["business-offer-mappings","dbs","fby","fbs","express"],
    summary="Информация о товарах в каталоге",
    response_model_by_alias=True,
)
async def get_offer_mappings(
    businessId: int = Path(..., description="Идентификатор кабинета. Чтобы узнать идентификатор, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md#businessdto).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html) "),
    page_token: str = Query(None, description="Идентификатор страницы c результатами.  Если параметр не указан, возвращается первая страница.  Рекомендуется передавать значение выходного параметра &#x60;nextPageToken&#x60;, полученное при последнем запросе.  Если задан &#x60;page_token&#x60; и в запросе есть параметры &#x60;offset&#x60;, &#x60;page_number&#x60; и &#x60;page_size&#x60;, они игнорируются. ", alias="page_token"),
    limit: int = Query(None, description="Количество значений на одной странице. ", alias="limit"),
    get_offer_mappings_request: GetOfferMappingsRequest = Body(None, description=""),
    token_OAuth: TokenModel = Security(
        get_token_OAuth, scopes=["market:partner-api"]
    ),
) -> GetOfferMappingsResponse:
    """Возвращает список товаров в каталоге, их категории на Маркете и характеристики каждого товара.  Можно использовать тремя способами: * задать список интересующих SKU; * задать фильтр — в этом случае результаты возвращаются постранично; * не передавать тело запроса, чтобы получить список всех товаров в каталоге.  |**⚙️ Лимит:** 600 запросов в минуту, не более 200 товаров в одном запросе| |-| """
    if not BaseBusinessOfferMappingsApi.subclasses:
        raise HTTPException(status_code=500, detail="Not implemented")
    return await BaseBusinessOfferMappingsApi.subclasses[0]().get_offer_mappings(businessId, page_token, limit, get_offer_mappings_request)


@router.post(
    "/businesses/{businessId}/offer-mappings/suggestions",
    responses={
        200: {"model": GetSuggestedOfferMappingsResponse, "description": "Подобранные карточки на Маркете.  По результатам проверки товара полученная через этот запрос карточка может быть заменена на другую. "},
        400: {"model": ApiClientDataErrorResponse, "description": "Запрос содержит неправильные данные."},
        401: {"model": ApiUnauthorizedErrorResponse, "description": "В запросе не указаны данные для авторизации."},
        403: {"model": ApiForbiddenErrorResponse, "description": "Данные для авторизации неверны или доступ к ресурсу запрещен."},
        404: {"model": ApiNotFoundErrorResponse, "description": "Запрашиваемый ресурс не найден."},
        420: {"model": ApiLimitErrorResponse, "description": "Превышено ограничение на доступ к ресурсу."},
        500: {"model": ApiServerErrorResponse, "description": "Внутренняя ошибка сервера."},
    },
    tags=["business-offer-mappings","dbs","fby","fbs","express"],
    summary="Просмотр карточек на Маркете, которые подходят вашим товарам",
    response_model_by_alias=True,
)
async def get_suggested_offer_mappings(
    businessId: int = Path(..., description="Идентификатор кабинета. Чтобы узнать идентификатор, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md#businessdto).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html) "),
    get_suggested_offer_mappings_request: GetSuggestedOfferMappingsRequest = Body(None, description=""),
    token_OAuth: TokenModel = Security(
        get_token_OAuth, scopes=["market:partner-api"]
    ),
) -> GetSuggestedOfferMappingsResponse:
    """Возвращает идентификаторы карточек на Маркете, которые соответствуют товарам с заданными параметрами.  Пользоваться этим запросом необязательно: он просто помогает заранее убедиться, что Маркет верно определяет карточки по предоставленным вами данным.  **Как пользоваться запросом**  1. Передайте Маркету список товаров, которые нужно проверить. 2. В ответ вы получите список SKU на Маркете с расшифровкой: названием, идентификатором модели, категорией. 3. Если расшифровки мало, вы можете открыть карточку. Для этого перейдите по ссылке вида &#x60;https://market.yandex.ru/product/&lt;marketModelId&gt;?sku&#x3D;&lt;marketSku&gt;&#x60;. 4. Если карточка соответствует товару, значит его можно добавлять в каталог с теми данными, что вы указали. Если карточка определилась неправильно — проверьте данные о товаре. Возможно, их нужно уточнить или дополнить. Кроме того, на этапе добавления товара вы можете указать &#x60;marketSKU&#x60;, который ему подходит по вашему мнению.  {% note info \&quot;𝓠 Как определить &#x60;marketSku&#x60; товара, найденного на Маркете?\&quot; %}  𝓐 Он есть в адресе страницы товара — расположен после &#x60;sku&#x3D;&#x60;.  Например, &#x60;https://market.yandex.ru/product--yandex-kniga/484830016?sku&#x3D;484830016&#x60;  {% endnote %}  |**⚙️ Лимит:** 100 000 товаров в час| |-| """
    if not BaseBusinessOfferMappingsApi.subclasses:
        raise HTTPException(status_code=500, detail="Not implemented")
    return await BaseBusinessOfferMappingsApi.subclasses[0]().get_suggested_offer_mappings(businessId, get_suggested_offer_mappings_request)


@router.post(
    "/businesses/{businessId}/offer-mappings/update",
    responses={
        200: {"model": UpdateOfferMappingsResponse, "description": "Все обязательные поля товаров заполнены, поэтому новые товары и внесенные изменения сохранены в каталоге. "},
        400: {"model": ApiClientDataErrorResponse, "description": "Запрос содержит неправильные данные."},
        401: {"model": ApiUnauthorizedErrorResponse, "description": "В запросе не указаны данные для авторизации."},
        403: {"model": ApiForbiddenErrorResponse, "description": "Данные для авторизации неверны или доступ к ресурсу запрещен."},
        404: {"model": ApiNotFoundErrorResponse, "description": "Запрашиваемый ресурс не найден."},
        420: {"model": ApiLimitErrorResponse, "description": "Превышено ограничение на доступ к ресурсу."},
        423: {"model": ApiLockedErrorResponse, "description": "К ресурсу нельзя применить указанный метод."},
        500: {"model": ApiServerErrorResponse, "description": "Внутренняя ошибка сервера."},
    },
    tags=["business-offer-mappings","dbs","fby","fbs","express"],
    summary="Добавление товаров в каталог и изменение информации о них",
    response_model_by_alias=True,
)
async def update_offer_mappings(
    businessId: int = Path(..., description="Идентификатор кабинета. Чтобы узнать идентификатор, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md#businessdto).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html) "),
    update_offer_mappings_request: UpdateOfferMappingsRequest = Body(None, description=""),
    token_OAuth: TokenModel = Security(
        get_token_OAuth, scopes=["market:partner-api"]
    ),
) -> UpdateOfferMappingsResponse:
    """Добавляет товары в каталог, передает их категории на Маркете и характеристики, необходимые для этих категории. Также редактирует информацию об уже имеющихся товарах.  Список категорий Маркета можно получить с помощью запроса [POST categories/tree](../../reference/categories/getCategoriesTree.md), а характеристики товаров по категориям с помощью [POST category/{categoryId}/parameters](../../reference/content/getCategoryContentParameters.md).  Чтобы **добавить новый товар**, передайте его с новым идентификатором, который раньше никогда не использовался в каталоге. Старайтесь сразу передать как можно больше информации — она потребуется Маркету для подбора подходящей карточки или создания новой. Если известно, какой карточке на Маркете соответствует товар, можно сразу указать идентификатор этой карточки (**SKU на Маркете**) в поле &#x60;marketSKU&#x60;.  Для **новых товаров** обязательно укажите параметры: &#x60;offerId&#x60;, &#x60;name&#x60;, &#x60;marketCategoryId&#x60; или &#x60;category&#x60;, &#x60;pictures&#x60;, &#x60;vendor&#x60;, &#x60;description&#x60;.  Чтобы **отредактировать информацию о товаре**, передайте новые данные, указав в &#x60;offerId&#x60; соответствующий **ваш SKU**. Поля, в которых ничего не меняется, можно не передавать.  Чтобы **удалить характеристики**, которые заданы в параметрах с типом &#x60;string&#x60;, передайте пустое значение.  Параметр &#x60;offerId&#x60; должен быть **уникальным** для всех товаров, которые вы передаете.  {% note warning \&quot;Правила использования SKU\&quot; %}  * У каждого товара SKU должен быть свой.  * SKU товара нельзя менять — можно только удалить товар и добавить заново с новым SKU.  * Уже заданный SKU нельзя освободить и использовать заново для другого товара. Каждый товар должен получать новый идентификатор, до того никогда не использовавшийся в вашем каталоге.  {% endnote %}  {% note info \&quot;Данные в каталоге обновляются не мгновенно\&quot; %}  Это занимает до нескольких минут.  {% endnote %}  |**⚙️ Лимит:** 5000 товаров в минуту, не более 500 товаров в одном запросе| |-| """
    if not BaseBusinessOfferMappingsApi.subclasses:
        raise HTTPException(status_code=500, detail="Not implemented")
    return await BaseBusinessOfferMappingsApi.subclasses[0]().update_offer_mappings(businessId, update_offer_mappings_request)
