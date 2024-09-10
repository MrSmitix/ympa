/*
 * Партнерский API Маркета
 *
 * API Яндекс Маркета помогает продавцам автоматизировать и упростить работу с маркетплейсом.  В числе возможностей интеграции:  * управление каталогом товаров и витриной,  * обработка заказов,  * изменение настроек магазина,  * получение отчетов. 
 *
 * The version of the OpenAPI document: LATEST
 * 
 * Generated by: https://openapi-generator.tech
 */

using System;
using System.Collections.Generic;
using System.ComponentModel.DataAnnotations;
using Microsoft.AspNetCore.Authorization;
using Microsoft.AspNetCore.Mvc;
using Microsoft.AspNetCore.Http;
using Swashbuckle.AspNetCore.Annotations;
using Swashbuckle.AspNetCore.SwaggerGen;
using Newtonsoft.Json;
using ympa_aspnetcore_server.Attributes;
using ympa_aspnetcore_server.Models;

namespace ympa_aspnetcore_server.Controllers
{ 
    /// <summary>
    /// 
    /// </summary>
    [ApiController]
    public class PriceQuarantineApiController : ControllerBase
    { 
        /// <summary>
        /// Удаление товара из карантина по цене в кабинете
        /// </summary>
        /// <remarks>Подтверждает основную цену на товары, которые попали в карантин, и удаляет их из карантина.  Основная цена задается в каталоге и действует во всех магазинах кабинета.  Товар попадает в карантин, если его цена меняется слишком резко. [Как настроить карантин](https://yandex.ru/support/marketplace/assortment/operations/prices.html#quarantine)  Чтобы увидеть список товаров, которые попали в карантин, используйте запрос [POST businesses/{businessId}/price-quarantine](getBusinessQuarantineOffers.md).  |**⚙️ Лимит:** 5000 товаров в минуту, не более 200 товаров в одном запросе| |-| </remarks>
        /// <param name="businessId">Идентификатор кабинета. Чтобы узнать идентификатор, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md#businessdto).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html) </param>
        /// <param name="confirmPricesRequest"></param>
        /// <response code="200">Ответ 200 обозначает, что цены подтверждены.</response>
        /// <response code="400">Запрос содержит неправильные данные.</response>
        /// <response code="401">В запросе не указаны данные для авторизации.</response>
        /// <response code="403">Данные для авторизации неверны или доступ к ресурсу запрещен.</response>
        /// <response code="404">Запрашиваемый ресурс не найден.</response>
        /// <response code="420">Превышено ограничение на доступ к ресурсу.</response>
        /// <response code="423">К ресурсу нельзя применить указанный метод.</response>
        /// <response code="500">Внутренняя ошибка сервера.</response>
        [HttpPost]
        [Route("/businesses/{businessId}/price-quarantine/confirm")]
        [Consumes("application/json")]
        [ValidateModelState]
        [SwaggerOperation("ConfirmBusinessPrices")]
        [SwaggerResponse(statusCode: 200, type: typeof(EmptyApiResponse), description: "Ответ 200 обозначает, что цены подтверждены.")]
        [SwaggerResponse(statusCode: 400, type: typeof(ApiClientDataErrorResponse), description: "Запрос содержит неправильные данные.")]
        [SwaggerResponse(statusCode: 401, type: typeof(ApiUnauthorizedErrorResponse), description: "В запросе не указаны данные для авторизации.")]
        [SwaggerResponse(statusCode: 403, type: typeof(ApiForbiddenErrorResponse), description: "Данные для авторизации неверны или доступ к ресурсу запрещен.")]
        [SwaggerResponse(statusCode: 404, type: typeof(ApiNotFoundErrorResponse), description: "Запрашиваемый ресурс не найден.")]
        [SwaggerResponse(statusCode: 420, type: typeof(ApiLimitErrorResponse), description: "Превышено ограничение на доступ к ресурсу.")]
        [SwaggerResponse(statusCode: 423, type: typeof(ApiLockedErrorResponse), description: "К ресурсу нельзя применить указанный метод.")]
        [SwaggerResponse(statusCode: 500, type: typeof(ApiServerErrorResponse), description: "Внутренняя ошибка сервера.")]
        public virtual IActionResult ConfirmBusinessPrices([FromRoute (Name = "businessId")][Required]long businessId, [FromBody]ConfirmPricesRequest confirmPricesRequest)
        {

            //TODO: Uncomment the next line to return response 200 or use other options such as return this.NotFound(), return this.BadRequest(..), ...
            // return StatusCode(200, default(EmptyApiResponse));
            //TODO: Uncomment the next line to return response 400 or use other options such as return this.NotFound(), return this.BadRequest(..), ...
            // return StatusCode(400, default(ApiClientDataErrorResponse));
            //TODO: Uncomment the next line to return response 401 or use other options such as return this.NotFound(), return this.BadRequest(..), ...
            // return StatusCode(401, default(ApiUnauthorizedErrorResponse));
            //TODO: Uncomment the next line to return response 403 or use other options such as return this.NotFound(), return this.BadRequest(..), ...
            // return StatusCode(403, default(ApiForbiddenErrorResponse));
            //TODO: Uncomment the next line to return response 404 or use other options such as return this.NotFound(), return this.BadRequest(..), ...
            // return StatusCode(404, default(ApiNotFoundErrorResponse));
            //TODO: Uncomment the next line to return response 420 or use other options such as return this.NotFound(), return this.BadRequest(..), ...
            // return StatusCode(420, default(ApiLimitErrorResponse));
            //TODO: Uncomment the next line to return response 423 or use other options such as return this.NotFound(), return this.BadRequest(..), ...
            // return StatusCode(423, default(ApiLockedErrorResponse));
            //TODO: Uncomment the next line to return response 500 or use other options such as return this.NotFound(), return this.BadRequest(..), ...
            // return StatusCode(500, default(ApiServerErrorResponse));
            string exampleJson = null;
            exampleJson = "{\n  \"status\" : \"OK\"\n}";
            exampleJson = "{\n  \"errors\" : [ {\n    \"code\" : \"code\",\n    \"message\" : \"message\"\n  }, {\n    \"code\" : \"code\",\n    \"message\" : \"message\"\n  } ],\n  \"status\" : \"OK\"\n}";
            exampleJson = "{\n  \"errors\" : [ {\n    \"code\" : \"code\",\n    \"message\" : \"message\"\n  }, {\n    \"code\" : \"code\",\n    \"message\" : \"message\"\n  } ],\n  \"status\" : \"OK\"\n}";
            exampleJson = "{\n  \"errors\" : [ {\n    \"code\" : \"code\",\n    \"message\" : \"message\"\n  }, {\n    \"code\" : \"code\",\n    \"message\" : \"message\"\n  } ],\n  \"status\" : \"OK\"\n}";
            exampleJson = "{\n  \"errors\" : [ {\n    \"code\" : \"code\",\n    \"message\" : \"message\"\n  }, {\n    \"code\" : \"code\",\n    \"message\" : \"message\"\n  } ],\n  \"status\" : \"OK\"\n}";
            exampleJson = "{\n  \"errors\" : [ {\n    \"code\" : \"code\",\n    \"message\" : \"message\"\n  }, {\n    \"code\" : \"code\",\n    \"message\" : \"message\"\n  } ],\n  \"status\" : \"OK\"\n}";
            exampleJson = "{\n  \"errors\" : [ {\n    \"code\" : \"code\",\n    \"message\" : \"message\"\n  }, {\n    \"code\" : \"code\",\n    \"message\" : \"message\"\n  } ],\n  \"status\" : \"OK\"\n}";
            exampleJson = "{\n  \"errors\" : [ {\n    \"code\" : \"code\",\n    \"message\" : \"message\"\n  }, {\n    \"code\" : \"code\",\n    \"message\" : \"message\"\n  } ],\n  \"status\" : \"OK\"\n}";
            
            var example = exampleJson != null
            ? JsonConvert.DeserializeObject<EmptyApiResponse>(exampleJson)
            : default(EmptyApiResponse);
            //TODO: Change the data returned
            return new ObjectResult(example);
        }

        /// <summary>
        /// Удаление товара из карантина по цене в магазине
        /// </summary>
        /// <remarks>Подтверждает в заданном магазине цену на товары, которые попали в карантин, и удаляет их из карантина.  Товар попадает в карантин, если его цена меняется слишком резко. [Как настроить карантин](https://yandex.ru/support/marketplace/assortment/operations/prices.html#quarantine)  Чтобы увидеть список товаров, которые попали в карантин, используйте запрос [POST campaigns/{campaignId}/price-quarantine](getCampaignQuarantineOffers.md).  |**⚙️ Лимит:** 5000 товаров в минуту| |-| </remarks>
        /// <param name="campaignId">Идентификатор кампании в API и магазина в кабинете. Каждая кампания в API соответствует магазину в кабинете.  Чтобы узнать идентификаторы своих магазинов, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html) </param>
        /// <param name="confirmPricesRequest"></param>
        /// <response code="200">Ответ 200 обозначает, что цены подтверждены.</response>
        /// <response code="400">Запрос содержит неправильные данные.</response>
        /// <response code="401">В запросе не указаны данные для авторизации.</response>
        /// <response code="403">Данные для авторизации неверны или доступ к ресурсу запрещен.</response>
        /// <response code="404">Запрашиваемый ресурс не найден.</response>
        /// <response code="420">Превышено ограничение на доступ к ресурсу.</response>
        /// <response code="423">К ресурсу нельзя применить указанный метод.</response>
        /// <response code="500">Внутренняя ошибка сервера.</response>
        [HttpPost]
        [Route("/campaigns/{campaignId}/price-quarantine/confirm")]
        [Consumes("application/json")]
        [ValidateModelState]
        [SwaggerOperation("ConfirmCampaignPrices")]
        [SwaggerResponse(statusCode: 200, type: typeof(EmptyApiResponse), description: "Ответ 200 обозначает, что цены подтверждены.")]
        [SwaggerResponse(statusCode: 400, type: typeof(ApiClientDataErrorResponse), description: "Запрос содержит неправильные данные.")]
        [SwaggerResponse(statusCode: 401, type: typeof(ApiUnauthorizedErrorResponse), description: "В запросе не указаны данные для авторизации.")]
        [SwaggerResponse(statusCode: 403, type: typeof(ApiForbiddenErrorResponse), description: "Данные для авторизации неверны или доступ к ресурсу запрещен.")]
        [SwaggerResponse(statusCode: 404, type: typeof(ApiNotFoundErrorResponse), description: "Запрашиваемый ресурс не найден.")]
        [SwaggerResponse(statusCode: 420, type: typeof(ApiLimitErrorResponse), description: "Превышено ограничение на доступ к ресурсу.")]
        [SwaggerResponse(statusCode: 423, type: typeof(ApiLockedErrorResponse), description: "К ресурсу нельзя применить указанный метод.")]
        [SwaggerResponse(statusCode: 500, type: typeof(ApiServerErrorResponse), description: "Внутренняя ошибка сервера.")]
        public virtual IActionResult ConfirmCampaignPrices([FromRoute (Name = "campaignId")][Required]long campaignId, [FromBody]ConfirmPricesRequest confirmPricesRequest)
        {

            //TODO: Uncomment the next line to return response 200 or use other options such as return this.NotFound(), return this.BadRequest(..), ...
            // return StatusCode(200, default(EmptyApiResponse));
            //TODO: Uncomment the next line to return response 400 or use other options such as return this.NotFound(), return this.BadRequest(..), ...
            // return StatusCode(400, default(ApiClientDataErrorResponse));
            //TODO: Uncomment the next line to return response 401 or use other options such as return this.NotFound(), return this.BadRequest(..), ...
            // return StatusCode(401, default(ApiUnauthorizedErrorResponse));
            //TODO: Uncomment the next line to return response 403 or use other options such as return this.NotFound(), return this.BadRequest(..), ...
            // return StatusCode(403, default(ApiForbiddenErrorResponse));
            //TODO: Uncomment the next line to return response 404 or use other options such as return this.NotFound(), return this.BadRequest(..), ...
            // return StatusCode(404, default(ApiNotFoundErrorResponse));
            //TODO: Uncomment the next line to return response 420 or use other options such as return this.NotFound(), return this.BadRequest(..), ...
            // return StatusCode(420, default(ApiLimitErrorResponse));
            //TODO: Uncomment the next line to return response 423 or use other options such as return this.NotFound(), return this.BadRequest(..), ...
            // return StatusCode(423, default(ApiLockedErrorResponse));
            //TODO: Uncomment the next line to return response 500 or use other options such as return this.NotFound(), return this.BadRequest(..), ...
            // return StatusCode(500, default(ApiServerErrorResponse));
            string exampleJson = null;
            exampleJson = "{\n  \"status\" : \"OK\"\n}";
            exampleJson = "{\n  \"errors\" : [ {\n    \"code\" : \"code\",\n    \"message\" : \"message\"\n  }, {\n    \"code\" : \"code\",\n    \"message\" : \"message\"\n  } ],\n  \"status\" : \"OK\"\n}";
            exampleJson = "{\n  \"errors\" : [ {\n    \"code\" : \"code\",\n    \"message\" : \"message\"\n  }, {\n    \"code\" : \"code\",\n    \"message\" : \"message\"\n  } ],\n  \"status\" : \"OK\"\n}";
            exampleJson = "{\n  \"errors\" : [ {\n    \"code\" : \"code\",\n    \"message\" : \"message\"\n  }, {\n    \"code\" : \"code\",\n    \"message\" : \"message\"\n  } ],\n  \"status\" : \"OK\"\n}";
            exampleJson = "{\n  \"errors\" : [ {\n    \"code\" : \"code\",\n    \"message\" : \"message\"\n  }, {\n    \"code\" : \"code\",\n    \"message\" : \"message\"\n  } ],\n  \"status\" : \"OK\"\n}";
            exampleJson = "{\n  \"errors\" : [ {\n    \"code\" : \"code\",\n    \"message\" : \"message\"\n  }, {\n    \"code\" : \"code\",\n    \"message\" : \"message\"\n  } ],\n  \"status\" : \"OK\"\n}";
            exampleJson = "{\n  \"errors\" : [ {\n    \"code\" : \"code\",\n    \"message\" : \"message\"\n  }, {\n    \"code\" : \"code\",\n    \"message\" : \"message\"\n  } ],\n  \"status\" : \"OK\"\n}";
            exampleJson = "{\n  \"errors\" : [ {\n    \"code\" : \"code\",\n    \"message\" : \"message\"\n  }, {\n    \"code\" : \"code\",\n    \"message\" : \"message\"\n  } ],\n  \"status\" : \"OK\"\n}";
            
            var example = exampleJson != null
            ? JsonConvert.DeserializeObject<EmptyApiResponse>(exampleJson)
            : default(EmptyApiResponse);
            //TODO: Change the data returned
            return new ObjectResult(example);
        }

        /// <summary>
        /// Список товаров, находящихся в карантине по цене в кабинете
        /// </summary>
        /// <remarks>Возвращает список товаров, которые находятся в карантине по **основной цене**. Основная цена задается в каталоге и действует во всех магазинах кабинета.  Проверьте цену каждого из товаров, который попал в карантин. Если ошибки нет и цена правильная, подтвердите ее с помощью запроса [POST businesses/{businessId}/price-quarantine/confirm](../../reference/business-assortment/confirmBusinessPrices.md). Если цена в самом деле ошибочная, установите верную с помощью запроса [POST businesses/{businessId}/offer-prices/updates](../../reference/business-assortment/updateBusinessPrices.md).  {% note info \&quot;𝓠 Что такое карантин?\&quot; %}  𝓐 Товар попадает в карантин, если его цена меняется слишком резко или слишком сильно отличается от рыночной. [Подробнее](https://yandex.ru/support/marketplace/assortment/operations/prices.html#quarantine)  {% endnote %}  В запросе можно использовать фильтры.  Результаты возвращаются постранично.  |**⚙️ Лимит:** 5000 товаров в минуту, не более 500 товаров в одном запросе| |-| </remarks>
        /// <param name="businessId">Идентификатор кабинета. Чтобы узнать идентификатор, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md#businessdto).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html) </param>
        /// <param name="getQuarantineOffersRequest"></param>
        /// <param name="pageToken">Идентификатор страницы c результатами.  Если параметр не указан, возвращается первая страница.  Рекомендуется передавать значение выходного параметра &#x60;nextPageToken&#x60;, полученное при последнем запросе.  Если задан &#x60;page_token&#x60; и в запросе есть параметры &#x60;offset&#x60;, &#x60;page_number&#x60; и &#x60;page_size&#x60;, они игнорируются. </param>
        /// <param name="limit">Количество значений на одной странице. </param>
        /// <response code="200">Список товаров в карантине.</response>
        /// <response code="400">Запрос содержит неправильные данные.</response>
        /// <response code="401">В запросе не указаны данные для авторизации.</response>
        /// <response code="403">Данные для авторизации неверны или доступ к ресурсу запрещен.</response>
        /// <response code="404">Запрашиваемый ресурс не найден.</response>
        /// <response code="420">Превышено ограничение на доступ к ресурсу.</response>
        /// <response code="500">Внутренняя ошибка сервера.</response>
        [HttpPost]
        [Route("/businesses/{businessId}/price-quarantine")]
        [Consumes("application/json")]
        [ValidateModelState]
        [SwaggerOperation("GetBusinessQuarantineOffers")]
        [SwaggerResponse(statusCode: 200, type: typeof(GetQuarantineOffersResponse), description: "Список товаров в карантине.")]
        [SwaggerResponse(statusCode: 400, type: typeof(ApiClientDataErrorResponse), description: "Запрос содержит неправильные данные.")]
        [SwaggerResponse(statusCode: 401, type: typeof(ApiUnauthorizedErrorResponse), description: "В запросе не указаны данные для авторизации.")]
        [SwaggerResponse(statusCode: 403, type: typeof(ApiForbiddenErrorResponse), description: "Данные для авторизации неверны или доступ к ресурсу запрещен.")]
        [SwaggerResponse(statusCode: 404, type: typeof(ApiNotFoundErrorResponse), description: "Запрашиваемый ресурс не найден.")]
        [SwaggerResponse(statusCode: 420, type: typeof(ApiLimitErrorResponse), description: "Превышено ограничение на доступ к ресурсу.")]
        [SwaggerResponse(statusCode: 500, type: typeof(ApiServerErrorResponse), description: "Внутренняя ошибка сервера.")]
        public virtual IActionResult GetBusinessQuarantineOffers([FromRoute (Name = "businessId")][Required]long businessId, [FromBody]GetQuarantineOffersRequest getQuarantineOffersRequest, [FromQuery (Name = "page_token")]string pageToken, [FromQuery (Name = "limit")]int? limit)
        {

            //TODO: Uncomment the next line to return response 200 or use other options such as return this.NotFound(), return this.BadRequest(..), ...
            // return StatusCode(200, default(GetQuarantineOffersResponse));
            //TODO: Uncomment the next line to return response 400 or use other options such as return this.NotFound(), return this.BadRequest(..), ...
            // return StatusCode(400, default(ApiClientDataErrorResponse));
            //TODO: Uncomment the next line to return response 401 or use other options such as return this.NotFound(), return this.BadRequest(..), ...
            // return StatusCode(401, default(ApiUnauthorizedErrorResponse));
            //TODO: Uncomment the next line to return response 403 or use other options such as return this.NotFound(), return this.BadRequest(..), ...
            // return StatusCode(403, default(ApiForbiddenErrorResponse));
            //TODO: Uncomment the next line to return response 404 or use other options such as return this.NotFound(), return this.BadRequest(..), ...
            // return StatusCode(404, default(ApiNotFoundErrorResponse));
            //TODO: Uncomment the next line to return response 420 or use other options such as return this.NotFound(), return this.BadRequest(..), ...
            // return StatusCode(420, default(ApiLimitErrorResponse));
            //TODO: Uncomment the next line to return response 500 or use other options such as return this.NotFound(), return this.BadRequest(..), ...
            // return StatusCode(500, default(ApiServerErrorResponse));
            string exampleJson = null;
            exampleJson = "{\n  \"result\" : {\n    \"offers\" : [ {\n      \"verdicts\" : [ {\n        \"type\" : \"PRICE_CHANGE\",\n        \"params\" : [ {\n          \"name\" : \"CURRENT_PRICE\",\n          \"value\" : \"value\"\n        }, {\n          \"name\" : \"CURRENT_PRICE\",\n          \"value\" : \"value\"\n        } ]\n      }, {\n        \"type\" : \"PRICE_CHANGE\",\n        \"params\" : [ {\n          \"name\" : \"CURRENT_PRICE\",\n          \"value\" : \"value\"\n        }, {\n          \"name\" : \"CURRENT_PRICE\",\n          \"value\" : \"value\"\n        } ]\n      } ],\n      \"offerId\" : \"offerId\",\n      \"currentPrice\" : {\n        \"value\" : 0.9301444243932576\n      },\n      \"lastValidPrice\" : {\n        \"value\" : 0.9301444243932576\n      }\n    }, {\n      \"verdicts\" : [ {\n        \"type\" : \"PRICE_CHANGE\",\n        \"params\" : [ {\n          \"name\" : \"CURRENT_PRICE\",\n          \"value\" : \"value\"\n        }, {\n          \"name\" : \"CURRENT_PRICE\",\n          \"value\" : \"value\"\n        } ]\n      }, {\n        \"type\" : \"PRICE_CHANGE\",\n        \"params\" : [ {\n          \"name\" : \"CURRENT_PRICE\",\n          \"value\" : \"value\"\n        }, {\n          \"name\" : \"CURRENT_PRICE\",\n          \"value\" : \"value\"\n        } ]\n      } ],\n      \"offerId\" : \"offerId\",\n      \"currentPrice\" : {\n        \"value\" : 0.9301444243932576\n      },\n      \"lastValidPrice\" : {\n        \"value\" : 0.9301444243932576\n      }\n    } ],\n    \"paging\" : {\n      \"prevPageToken\" : \"prevPageToken\",\n      \"nextPageToken\" : \"nextPageToken\"\n    }\n  },\n  \"status\" : \"OK\"\n}";
            exampleJson = "{\n  \"errors\" : [ {\n    \"code\" : \"code\",\n    \"message\" : \"message\"\n  }, {\n    \"code\" : \"code\",\n    \"message\" : \"message\"\n  } ],\n  \"status\" : \"OK\"\n}";
            exampleJson = "{\n  \"errors\" : [ {\n    \"code\" : \"code\",\n    \"message\" : \"message\"\n  }, {\n    \"code\" : \"code\",\n    \"message\" : \"message\"\n  } ],\n  \"status\" : \"OK\"\n}";
            exampleJson = "{\n  \"errors\" : [ {\n    \"code\" : \"code\",\n    \"message\" : \"message\"\n  }, {\n    \"code\" : \"code\",\n    \"message\" : \"message\"\n  } ],\n  \"status\" : \"OK\"\n}";
            exampleJson = "{\n  \"errors\" : [ {\n    \"code\" : \"code\",\n    \"message\" : \"message\"\n  }, {\n    \"code\" : \"code\",\n    \"message\" : \"message\"\n  } ],\n  \"status\" : \"OK\"\n}";
            exampleJson = "{\n  \"errors\" : [ {\n    \"code\" : \"code\",\n    \"message\" : \"message\"\n  }, {\n    \"code\" : \"code\",\n    \"message\" : \"message\"\n  } ],\n  \"status\" : \"OK\"\n}";
            exampleJson = "{\n  \"errors\" : [ {\n    \"code\" : \"code\",\n    \"message\" : \"message\"\n  }, {\n    \"code\" : \"code\",\n    \"message\" : \"message\"\n  } ],\n  \"status\" : \"OK\"\n}";
            
            var example = exampleJson != null
            ? JsonConvert.DeserializeObject<GetQuarantineOffersResponse>(exampleJson)
            : default(GetQuarantineOffersResponse);
            //TODO: Change the data returned
            return new ObjectResult(example);
        }

        /// <summary>
        /// Список товаров, находящихся в карантине по цене в магазине
        /// </summary>
        /// <remarks>Возвращает список товаров, которые находятся в карантине по цене, установленной в заданном магазине.  Проверьте цену каждого из товаров, который попал в карантин. Если ошибки нет и цена правильная, подтвердите ее с помощью запроса [POST campaigns/{campaignId}/price-quarantine/confirm](../../reference/assortment/confirmCampaignPrices.md). Если цена в самом деле ошибочная, установите верную с помощью запроса [POST campaigns/{campaignId}/offer-prices/updates](../../reference/assortment/updatePrices.md).  {% note info \&quot;𝓠 Что такое карантин?\&quot; %}  𝓐 Товар попадает в карантин, если его цена меняется слишком резко или слишком сильно отличается от рыночной. [Подробнее](https://yandex.ru/support/marketplace/assortment/operations/prices.html#quarantine)  {% endnote %}  В запросе можно использовать фильтры.  Результаты возвращаются постранично.  |**⚙️ Лимит:** 5000 товаров в минуту| |-| </remarks>
        /// <param name="campaignId">Идентификатор кампании в API и магазина в кабинете. Каждая кампания в API соответствует магазину в кабинете.  Чтобы узнать идентификаторы своих магазинов, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html) </param>
        /// <param name="getQuarantineOffersRequest"></param>
        /// <param name="pageToken">Идентификатор страницы c результатами.  Если параметр не указан, возвращается первая страница.  Рекомендуется передавать значение выходного параметра &#x60;nextPageToken&#x60;, полученное при последнем запросе.  Если задан &#x60;page_token&#x60; и в запросе есть параметры &#x60;offset&#x60;, &#x60;page_number&#x60; и &#x60;page_size&#x60;, они игнорируются. </param>
        /// <param name="limit">Количество значений на одной странице. </param>
        /// <response code="200">Список товаров в карантине.</response>
        /// <response code="400">Запрос содержит неправильные данные.</response>
        /// <response code="401">В запросе не указаны данные для авторизации.</response>
        /// <response code="403">Данные для авторизации неверны или доступ к ресурсу запрещен.</response>
        /// <response code="404">Запрашиваемый ресурс не найден.</response>
        /// <response code="420">Превышено ограничение на доступ к ресурсу.</response>
        /// <response code="500">Внутренняя ошибка сервера.</response>
        [HttpPost]
        [Route("/campaigns/{campaignId}/price-quarantine")]
        [Consumes("application/json")]
        [ValidateModelState]
        [SwaggerOperation("GetCampaignQuarantineOffers")]
        [SwaggerResponse(statusCode: 200, type: typeof(GetQuarantineOffersResponse), description: "Список товаров в карантине.")]
        [SwaggerResponse(statusCode: 400, type: typeof(ApiClientDataErrorResponse), description: "Запрос содержит неправильные данные.")]
        [SwaggerResponse(statusCode: 401, type: typeof(ApiUnauthorizedErrorResponse), description: "В запросе не указаны данные для авторизации.")]
        [SwaggerResponse(statusCode: 403, type: typeof(ApiForbiddenErrorResponse), description: "Данные для авторизации неверны или доступ к ресурсу запрещен.")]
        [SwaggerResponse(statusCode: 404, type: typeof(ApiNotFoundErrorResponse), description: "Запрашиваемый ресурс не найден.")]
        [SwaggerResponse(statusCode: 420, type: typeof(ApiLimitErrorResponse), description: "Превышено ограничение на доступ к ресурсу.")]
        [SwaggerResponse(statusCode: 500, type: typeof(ApiServerErrorResponse), description: "Внутренняя ошибка сервера.")]
        public virtual IActionResult GetCampaignQuarantineOffers([FromRoute (Name = "campaignId")][Required]long campaignId, [FromBody]GetQuarantineOffersRequest getQuarantineOffersRequest, [FromQuery (Name = "page_token")]string pageToken, [FromQuery (Name = "limit")]int? limit)
        {

            //TODO: Uncomment the next line to return response 200 or use other options such as return this.NotFound(), return this.BadRequest(..), ...
            // return StatusCode(200, default(GetQuarantineOffersResponse));
            //TODO: Uncomment the next line to return response 400 or use other options such as return this.NotFound(), return this.BadRequest(..), ...
            // return StatusCode(400, default(ApiClientDataErrorResponse));
            //TODO: Uncomment the next line to return response 401 or use other options such as return this.NotFound(), return this.BadRequest(..), ...
            // return StatusCode(401, default(ApiUnauthorizedErrorResponse));
            //TODO: Uncomment the next line to return response 403 or use other options such as return this.NotFound(), return this.BadRequest(..), ...
            // return StatusCode(403, default(ApiForbiddenErrorResponse));
            //TODO: Uncomment the next line to return response 404 or use other options such as return this.NotFound(), return this.BadRequest(..), ...
            // return StatusCode(404, default(ApiNotFoundErrorResponse));
            //TODO: Uncomment the next line to return response 420 or use other options such as return this.NotFound(), return this.BadRequest(..), ...
            // return StatusCode(420, default(ApiLimitErrorResponse));
            //TODO: Uncomment the next line to return response 500 or use other options such as return this.NotFound(), return this.BadRequest(..), ...
            // return StatusCode(500, default(ApiServerErrorResponse));
            string exampleJson = null;
            exampleJson = "{\n  \"result\" : {\n    \"offers\" : [ {\n      \"verdicts\" : [ {\n        \"type\" : \"PRICE_CHANGE\",\n        \"params\" : [ {\n          \"name\" : \"CURRENT_PRICE\",\n          \"value\" : \"value\"\n        }, {\n          \"name\" : \"CURRENT_PRICE\",\n          \"value\" : \"value\"\n        } ]\n      }, {\n        \"type\" : \"PRICE_CHANGE\",\n        \"params\" : [ {\n          \"name\" : \"CURRENT_PRICE\",\n          \"value\" : \"value\"\n        }, {\n          \"name\" : \"CURRENT_PRICE\",\n          \"value\" : \"value\"\n        } ]\n      } ],\n      \"offerId\" : \"offerId\",\n      \"currentPrice\" : {\n        \"value\" : 0.9301444243932576\n      },\n      \"lastValidPrice\" : {\n        \"value\" : 0.9301444243932576\n      }\n    }, {\n      \"verdicts\" : [ {\n        \"type\" : \"PRICE_CHANGE\",\n        \"params\" : [ {\n          \"name\" : \"CURRENT_PRICE\",\n          \"value\" : \"value\"\n        }, {\n          \"name\" : \"CURRENT_PRICE\",\n          \"value\" : \"value\"\n        } ]\n      }, {\n        \"type\" : \"PRICE_CHANGE\",\n        \"params\" : [ {\n          \"name\" : \"CURRENT_PRICE\",\n          \"value\" : \"value\"\n        }, {\n          \"name\" : \"CURRENT_PRICE\",\n          \"value\" : \"value\"\n        } ]\n      } ],\n      \"offerId\" : \"offerId\",\n      \"currentPrice\" : {\n        \"value\" : 0.9301444243932576\n      },\n      \"lastValidPrice\" : {\n        \"value\" : 0.9301444243932576\n      }\n    } ],\n    \"paging\" : {\n      \"prevPageToken\" : \"prevPageToken\",\n      \"nextPageToken\" : \"nextPageToken\"\n    }\n  },\n  \"status\" : \"OK\"\n}";
            exampleJson = "{\n  \"errors\" : [ {\n    \"code\" : \"code\",\n    \"message\" : \"message\"\n  }, {\n    \"code\" : \"code\",\n    \"message\" : \"message\"\n  } ],\n  \"status\" : \"OK\"\n}";
            exampleJson = "{\n  \"errors\" : [ {\n    \"code\" : \"code\",\n    \"message\" : \"message\"\n  }, {\n    \"code\" : \"code\",\n    \"message\" : \"message\"\n  } ],\n  \"status\" : \"OK\"\n}";
            exampleJson = "{\n  \"errors\" : [ {\n    \"code\" : \"code\",\n    \"message\" : \"message\"\n  }, {\n    \"code\" : \"code\",\n    \"message\" : \"message\"\n  } ],\n  \"status\" : \"OK\"\n}";
            exampleJson = "{\n  \"errors\" : [ {\n    \"code\" : \"code\",\n    \"message\" : \"message\"\n  }, {\n    \"code\" : \"code\",\n    \"message\" : \"message\"\n  } ],\n  \"status\" : \"OK\"\n}";
            exampleJson = "{\n  \"errors\" : [ {\n    \"code\" : \"code\",\n    \"message\" : \"message\"\n  }, {\n    \"code\" : \"code\",\n    \"message\" : \"message\"\n  } ],\n  \"status\" : \"OK\"\n}";
            exampleJson = "{\n  \"errors\" : [ {\n    \"code\" : \"code\",\n    \"message\" : \"message\"\n  }, {\n    \"code\" : \"code\",\n    \"message\" : \"message\"\n  } ],\n  \"status\" : \"OK\"\n}";
            
            var example = exampleJson != null
            ? JsonConvert.DeserializeObject<GetQuarantineOffersResponse>(exampleJson)
            : default(GetQuarantineOffersResponse);
            //TODO: Change the data returned
            return new ObjectResult(example);
        }
    }
}
