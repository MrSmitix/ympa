# coding: utf-8

import pytest
import json
from aiohttp import web

from ympa_python_aiohttp_server.models.add_offers_to_archive_request import AddOffersToArchiveRequest
from ympa_python_aiohttp_server.models.add_offers_to_archive_response import AddOffersToArchiveResponse
from ympa_python_aiohttp_server.models.api_client_data_error_response import ApiClientDataErrorResponse
from ympa_python_aiohttp_server.models.api_forbidden_error_response import ApiForbiddenErrorResponse
from ympa_python_aiohttp_server.models.api_limit_error_response import ApiLimitErrorResponse
from ympa_python_aiohttp_server.models.api_locked_error_response import ApiLockedErrorResponse
from ympa_python_aiohttp_server.models.api_not_found_error_response import ApiNotFoundErrorResponse
from ympa_python_aiohttp_server.models.api_server_error_response import ApiServerErrorResponse
from ympa_python_aiohttp_server.models.api_unauthorized_error_response import ApiUnauthorizedErrorResponse
from ympa_python_aiohttp_server.models.delete_offers_from_archive_request import DeleteOffersFromArchiveRequest
from ympa_python_aiohttp_server.models.delete_offers_from_archive_response import DeleteOffersFromArchiveResponse
from ympa_python_aiohttp_server.models.delete_offers_request import DeleteOffersRequest
from ympa_python_aiohttp_server.models.delete_offers_response import DeleteOffersResponse
from ympa_python_aiohttp_server.models.get_offer_mappings_request import GetOfferMappingsRequest
from ympa_python_aiohttp_server.models.get_offer_mappings_response import GetOfferMappingsResponse
from ympa_python_aiohttp_server.models.get_suggested_offer_mappings_request import GetSuggestedOfferMappingsRequest
from ympa_python_aiohttp_server.models.get_suggested_offer_mappings_response import GetSuggestedOfferMappingsResponse
from ympa_python_aiohttp_server.models.update_offer_mappings_request import UpdateOfferMappingsRequest
from ympa_python_aiohttp_server.models.update_offer_mappings_response import UpdateOfferMappingsResponse


pytestmark = pytest.mark.asyncio

async def test_add_offers_to_archive(client):
    """Test case for add_offers_to_archive

    Добавление товаров в архив
    """
    body = {"offerIds":[null,null,null,null,null]}
    headers = { 
        'Accept': 'application/json',
        'Content-Type': 'application/json',
        'Authorization': 'Bearer special-key',
    }
    response = await client.request(
        method='POST',
        path='/businesses/{business_id}/offer-mappings/archive'.format(business_id=56),
        headers=headers,
        json=body,
        )
    assert response.status == 200, 'Response body is : ' + (await response.read()).decode('utf-8')


pytestmark = pytest.mark.asyncio

async def test_delete_offers(client):
    """Test case for delete_offers

    Удаление товаров из каталога
    """
    body = {"offerIds":[null,null,null,null,null]}
    headers = { 
        'Accept': 'application/json',
        'Content-Type': 'application/json',
        'Authorization': 'Bearer special-key',
    }
    response = await client.request(
        method='POST',
        path='/businesses/{business_id}/offer-mappings/delete'.format(business_id=56),
        headers=headers,
        json=body,
        )
    assert response.status == 200, 'Response body is : ' + (await response.read()).decode('utf-8')


pytestmark = pytest.mark.asyncio

async def test_delete_offers_from_archive(client):
    """Test case for delete_offers_from_archive

    Удаление товаров из архива
    """
    body = {"offerIds":[null,null,null,null,null]}
    headers = { 
        'Accept': 'application/json',
        'Content-Type': 'application/json',
        'Authorization': 'Bearer special-key',
    }
    response = await client.request(
        method='POST',
        path='/businesses/{business_id}/offer-mappings/unarchive'.format(business_id=56),
        headers=headers,
        json=body,
        )
    assert response.status == 200, 'Response body is : ' + (await response.read()).decode('utf-8')


pytestmark = pytest.mark.asyncio

async def test_get_offer_mappings(client):
    """Test case for get_offer_mappings

    Информация о товарах в каталоге
    """
    body = {"archived":True,"categoryIds":[0,0],"vendorNames":["vendorNames","vendorNames"],"offerIds":[null,null,null,null,null],"cardStatuses":["HAS_CARD_CAN_NOT_UPDATE","HAS_CARD_CAN_NOT_UPDATE"],"tags":["tags","tags"]}
    params = [('page_token', 'eyBuZXh0SWQ6IDIzNDIgfQ=='),
                    ('limit', 20)]
    headers = { 
        'Accept': 'application/json',
        'Content-Type': 'application/json',
        'Authorization': 'Bearer special-key',
    }
    response = await client.request(
        method='POST',
        path='/businesses/{business_id}/offer-mappings'.format(business_id=56),
        headers=headers,
        json=body,
        params=params,
        )
    assert response.status == 200, 'Response body is : ' + (await response.read()).decode('utf-8')


pytestmark = pytest.mark.asyncio

async def test_get_suggested_offer_mappings(client):
    """Test case for get_suggested_offer_mappings

    Просмотр карточек на Маркете, которые подходят вашим товарам
    """
    body = {"offers":[{"vendor":"LEVENHUK","basicPrice":{"currencyId":"RUR","value":0.08008281904610115},"name":"Ударная дрель Makita HP1630, 710 Вт","offerId":"offerId","description":"description","category":"category","barcodes":["46012300000000","46012300000000"],"vendorCode":"VNDR-0005A"},{"vendor":"LEVENHUK","basicPrice":{"currencyId":"RUR","value":0.08008281904610115},"name":"Ударная дрель Makita HP1630, 710 Вт","offerId":"offerId","description":"description","category":"category","barcodes":["46012300000000","46012300000000"],"vendorCode":"VNDR-0005A"},{"vendor":"LEVENHUK","basicPrice":{"currencyId":"RUR","value":0.08008281904610115},"name":"Ударная дрель Makita HP1630, 710 Вт","offerId":"offerId","description":"description","category":"category","barcodes":["46012300000000","46012300000000"],"vendorCode":"VNDR-0005A"},{"vendor":"LEVENHUK","basicPrice":{"currencyId":"RUR","value":0.08008281904610115},"name":"Ударная дрель Makita HP1630, 710 Вт","offerId":"offerId","description":"description","category":"category","barcodes":["46012300000000","46012300000000"],"vendorCode":"VNDR-0005A"},{"vendor":"LEVENHUK","basicPrice":{"currencyId":"RUR","value":0.08008281904610115},"name":"Ударная дрель Makita HP1630, 710 Вт","offerId":"offerId","description":"description","category":"category","barcodes":["46012300000000","46012300000000"],"vendorCode":"VNDR-0005A"}]}
    headers = { 
        'Accept': 'application/json',
        'Content-Type': 'application/json',
        'Authorization': 'Bearer special-key',
    }
    response = await client.request(
        method='POST',
        path='/businesses/{business_id}/offer-mappings/suggestions'.format(business_id=56),
        headers=headers,
        json=body,
        )
    assert response.status == 200, 'Response body is : ' + (await response.read()).decode('utf-8')


pytestmark = pytest.mark.asyncio

async def test_update_offer_mappings(client):
    """Test case for update_offer_mappings

    Добавление товаров в каталог и изменение информации о них
    """
    body = {"offerMappings":[{"offer":{"downloadable":True,"marketCategoryId":0,"manufacturerCountries":["Россия","Россия"],"description":"description","videos":["videos","videos","videos","videos","videos"],"purchasePrice":{"currencyId":"RUR","value":0.08008281904610115},"type":"DEFAULT","pictures":["pictures","pictures"],"vendorCode":"VNDR-0005A","vendor":"LEVENHUK","basicPrice":{"discountBase":0.5962133916683182,"currencyId":"RUR","value":0.14658129805029452},"lifeTime":{"timePeriod":6,"comment":"comment","timeUnit":"HOUR"},"shelfLife":{"timePeriod":6,"comment":"comment","timeUnit":"HOUR"},"cofinancePrice":{"currencyId":"RUR","value":0.08008281904610115},"parameterValues":[{"valueId":2,"parameterId":5,"unitId":5,"value":"value"},{"valueId":2,"parameterId":5,"unitId":5,"value":"value"},{"valueId":2,"parameterId":5,"unitId":5,"value":"value"},{"valueId":2,"parameterId":5,"unitId":5,"value":"value"},{"valueId":2,"parameterId":5,"unitId":5,"value":"value"}],"barcodes":["46012300000000","46012300000000"],"params":[{"name":"Wi-Fi","value":"есть"},{"name":"Wi-Fi","value":"есть"}],"tags":["до 500 рублей","до 500 рублей"],"condition":{"reason":"reason","type":"PREOWNED","quality":"PERFECT"},"certificates":["certificates","certificates"],"boxCount":6,"additionalExpenses":{"currencyId":"RUR","value":0.08008281904610115},"name":"Ударная дрель Makita HP1630, 710 Вт","offerId":"offerId","guaranteePeriod":{"timePeriod":6,"comment":"comment","timeUnit":"HOUR"},"weightDimensions":{"length":65.55,"width":50.7,"weight":1.001,"height":20},"category":"category","customsCommodityCode":"8517610008","adult":True,"age":{"ageUnit":"YEAR","value":0.5962133916683182},"manuals":[{"title":"title","url":"url"},{"title":"title","url":"url"},{"title":"title","url":"url"},{"title":"title","url":"url"},{"title":"title","url":"url"}]},"mapping":{"marketSku":5}},{"offer":{"downloadable":True,"marketCategoryId":0,"manufacturerCountries":["Россия","Россия"],"description":"description","videos":["videos","videos","videos","videos","videos"],"purchasePrice":{"currencyId":"RUR","value":0.08008281904610115},"type":"DEFAULT","pictures":["pictures","pictures"],"vendorCode":"VNDR-0005A","vendor":"LEVENHUK","basicPrice":{"discountBase":0.5962133916683182,"currencyId":"RUR","value":0.14658129805029452},"lifeTime":{"timePeriod":6,"comment":"comment","timeUnit":"HOUR"},"shelfLife":{"timePeriod":6,"comment":"comment","timeUnit":"HOUR"},"cofinancePrice":{"currencyId":"RUR","value":0.08008281904610115},"parameterValues":[{"valueId":2,"parameterId":5,"unitId":5,"value":"value"},{"valueId":2,"parameterId":5,"unitId":5,"value":"value"},{"valueId":2,"parameterId":5,"unitId":5,"value":"value"},{"valueId":2,"parameterId":5,"unitId":5,"value":"value"},{"valueId":2,"parameterId":5,"unitId":5,"value":"value"}],"barcodes":["46012300000000","46012300000000"],"params":[{"name":"Wi-Fi","value":"есть"},{"name":"Wi-Fi","value":"есть"}],"tags":["до 500 рублей","до 500 рублей"],"condition":{"reason":"reason","type":"PREOWNED","quality":"PERFECT"},"certificates":["certificates","certificates"],"boxCount":6,"additionalExpenses":{"currencyId":"RUR","value":0.08008281904610115},"name":"Ударная дрель Makita HP1630, 710 Вт","offerId":"offerId","guaranteePeriod":{"timePeriod":6,"comment":"comment","timeUnit":"HOUR"},"weightDimensions":{"length":65.55,"width":50.7,"weight":1.001,"height":20},"category":"category","customsCommodityCode":"8517610008","adult":True,"age":{"ageUnit":"YEAR","value":0.5962133916683182},"manuals":[{"title":"title","url":"url"},{"title":"title","url":"url"},{"title":"title","url":"url"},{"title":"title","url":"url"},{"title":"title","url":"url"}]},"mapping":{"marketSku":5}},{"offer":{"downloadable":True,"marketCategoryId":0,"manufacturerCountries":["Россия","Россия"],"description":"description","videos":["videos","videos","videos","videos","videos"],"purchasePrice":{"currencyId":"RUR","value":0.08008281904610115},"type":"DEFAULT","pictures":["pictures","pictures"],"vendorCode":"VNDR-0005A","vendor":"LEVENHUK","basicPrice":{"discountBase":0.5962133916683182,"currencyId":"RUR","value":0.14658129805029452},"lifeTime":{"timePeriod":6,"comment":"comment","timeUnit":"HOUR"},"shelfLife":{"timePeriod":6,"comment":"comment","timeUnit":"HOUR"},"cofinancePrice":{"currencyId":"RUR","value":0.08008281904610115},"parameterValues":[{"valueId":2,"parameterId":5,"unitId":5,"value":"value"},{"valueId":2,"parameterId":5,"unitId":5,"value":"value"},{"valueId":2,"parameterId":5,"unitId":5,"value":"value"},{"valueId":2,"parameterId":5,"unitId":5,"value":"value"},{"valueId":2,"parameterId":5,"unitId":5,"value":"value"}],"barcodes":["46012300000000","46012300000000"],"params":[{"name":"Wi-Fi","value":"есть"},{"name":"Wi-Fi","value":"есть"}],"tags":["до 500 рублей","до 500 рублей"],"condition":{"reason":"reason","type":"PREOWNED","quality":"PERFECT"},"certificates":["certificates","certificates"],"boxCount":6,"additionalExpenses":{"currencyId":"RUR","value":0.08008281904610115},"name":"Ударная дрель Makita HP1630, 710 Вт","offerId":"offerId","guaranteePeriod":{"timePeriod":6,"comment":"comment","timeUnit":"HOUR"},"weightDimensions":{"length":65.55,"width":50.7,"weight":1.001,"height":20},"category":"category","customsCommodityCode":"8517610008","adult":True,"age":{"ageUnit":"YEAR","value":0.5962133916683182},"manuals":[{"title":"title","url":"url"},{"title":"title","url":"url"},{"title":"title","url":"url"},{"title":"title","url":"url"},{"title":"title","url":"url"}]},"mapping":{"marketSku":5}},{"offer":{"downloadable":True,"marketCategoryId":0,"manufacturerCountries":["Россия","Россия"],"description":"description","videos":["videos","videos","videos","videos","videos"],"purchasePrice":{"currencyId":"RUR","value":0.08008281904610115},"type":"DEFAULT","pictures":["pictures","pictures"],"vendorCode":"VNDR-0005A","vendor":"LEVENHUK","basicPrice":{"discountBase":0.5962133916683182,"currencyId":"RUR","value":0.14658129805029452},"lifeTime":{"timePeriod":6,"comment":"comment","timeUnit":"HOUR"},"shelfLife":{"timePeriod":6,"comment":"comment","timeUnit":"HOUR"},"cofinancePrice":{"currencyId":"RUR","value":0.08008281904610115},"parameterValues":[{"valueId":2,"parameterId":5,"unitId":5,"value":"value"},{"valueId":2,"parameterId":5,"unitId":5,"value":"value"},{"valueId":2,"parameterId":5,"unitId":5,"value":"value"},{"valueId":2,"parameterId":5,"unitId":5,"value":"value"},{"valueId":2,"parameterId":5,"unitId":5,"value":"value"}],"barcodes":["46012300000000","46012300000000"],"params":[{"name":"Wi-Fi","value":"есть"},{"name":"Wi-Fi","value":"есть"}],"tags":["до 500 рублей","до 500 рублей"],"condition":{"reason":"reason","type":"PREOWNED","quality":"PERFECT"},"certificates":["certificates","certificates"],"boxCount":6,"additionalExpenses":{"currencyId":"RUR","value":0.08008281904610115},"name":"Ударная дрель Makita HP1630, 710 Вт","offerId":"offerId","guaranteePeriod":{"timePeriod":6,"comment":"comment","timeUnit":"HOUR"},"weightDimensions":{"length":65.55,"width":50.7,"weight":1.001,"height":20},"category":"category","customsCommodityCode":"8517610008","adult":True,"age":{"ageUnit":"YEAR","value":0.5962133916683182},"manuals":[{"title":"title","url":"url"},{"title":"title","url":"url"},{"title":"title","url":"url"},{"title":"title","url":"url"},{"title":"title","url":"url"}]},"mapping":{"marketSku":5}},{"offer":{"downloadable":True,"marketCategoryId":0,"manufacturerCountries":["Россия","Россия"],"description":"description","videos":["videos","videos","videos","videos","videos"],"purchasePrice":{"currencyId":"RUR","value":0.08008281904610115},"type":"DEFAULT","pictures":["pictures","pictures"],"vendorCode":"VNDR-0005A","vendor":"LEVENHUK","basicPrice":{"discountBase":0.5962133916683182,"currencyId":"RUR","value":0.14658129805029452},"lifeTime":{"timePeriod":6,"comment":"comment","timeUnit":"HOUR"},"shelfLife":{"timePeriod":6,"comment":"comment","timeUnit":"HOUR"},"cofinancePrice":{"currencyId":"RUR","value":0.08008281904610115},"parameterValues":[{"valueId":2,"parameterId":5,"unitId":5,"value":"value"},{"valueId":2,"parameterId":5,"unitId":5,"value":"value"},{"valueId":2,"parameterId":5,"unitId":5,"value":"value"},{"valueId":2,"parameterId":5,"unitId":5,"value":"value"},{"valueId":2,"parameterId":5,"unitId":5,"value":"value"}],"barcodes":["46012300000000","46012300000000"],"params":[{"name":"Wi-Fi","value":"есть"},{"name":"Wi-Fi","value":"есть"}],"tags":["до 500 рублей","до 500 рублей"],"condition":{"reason":"reason","type":"PREOWNED","quality":"PERFECT"},"certificates":["certificates","certificates"],"boxCount":6,"additionalExpenses":{"currencyId":"RUR","value":0.08008281904610115},"name":"Ударная дрель Makita HP1630, 710 Вт","offerId":"offerId","guaranteePeriod":{"timePeriod":6,"comment":"comment","timeUnit":"HOUR"},"weightDimensions":{"length":65.55,"width":50.7,"weight":1.001,"height":20},"category":"category","customsCommodityCode":"8517610008","adult":True,"age":{"ageUnit":"YEAR","value":0.5962133916683182},"manuals":[{"title":"title","url":"url"},{"title":"title","url":"url"},{"title":"title","url":"url"},{"title":"title","url":"url"},{"title":"title","url":"url"}]},"mapping":{"marketSku":5}}],"onlyPartnerMediaContent":True}
    headers = { 
        'Accept': 'application/json',
        'Content-Type': 'application/json',
        'Authorization': 'Bearer special-key',
    }
    response = await client.request(
        method='POST',
        path='/businesses/{business_id}/offer-mappings/update'.format(business_id=56),
        headers=headers,
        json=body,
        )
    assert response.status == 200, 'Response body is : ' + (await response.read()).decode('utf-8')

