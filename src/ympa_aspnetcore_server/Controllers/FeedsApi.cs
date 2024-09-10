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
    public class FeedsApiController : ControllerBase
    { 
        /// <summary>
        /// Информация о прайс-листе
        /// </summary>
        /// <remarks>{% note warning \&quot;\&quot; %}  Этот метод устарел. Не используйте его.  {% endnote %}  Возвращает информацию о прайс-листе, размещенном на Маркете для заданного магазина. Также ресурс возвращает результаты автоматических проверок прайс-листа. |**⚙️ Лимит:** 1000 запросов в час| |-| </remarks>
        /// <param name="campaignId">Идентификатор кампании в API и магазина в кабинете. Каждая кампания в API соответствует магазину в кабинете.  Чтобы узнать идентификаторы своих магазинов, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html) </param>
        /// <param name="feedId">Идентификатор прайс-листа.</param>
        /// <response code="200">Информация о прайс-листе.</response>
        /// <response code="400">Запрос содержит неправильные данные.</response>
        /// <response code="401">В запросе не указаны данные для авторизации.</response>
        /// <response code="403">Данные для авторизации неверны или доступ к ресурсу запрещен.</response>
        /// <response code="404">Запрашиваемый ресурс не найден.</response>
        /// <response code="420">Превышено ограничение на доступ к ресурсу.</response>
        /// <response code="500">Внутренняя ошибка сервера.</response>
        [HttpGet]
        [Route("/campaigns/{campaignId}/feeds/{feedId}")]
        [ValidateModelState]
        [SwaggerOperation("GetFeed")]
        [SwaggerResponse(statusCode: 200, type: typeof(GetFeedResponse), description: "Информация о прайс-листе.")]
        [SwaggerResponse(statusCode: 400, type: typeof(ApiClientDataErrorResponse), description: "Запрос содержит неправильные данные.")]
        [SwaggerResponse(statusCode: 401, type: typeof(ApiUnauthorizedErrorResponse), description: "В запросе не указаны данные для авторизации.")]
        [SwaggerResponse(statusCode: 403, type: typeof(ApiForbiddenErrorResponse), description: "Данные для авторизации неверны или доступ к ресурсу запрещен.")]
        [SwaggerResponse(statusCode: 404, type: typeof(ApiNotFoundErrorResponse), description: "Запрашиваемый ресурс не найден.")]
        [SwaggerResponse(statusCode: 420, type: typeof(ApiLimitErrorResponse), description: "Превышено ограничение на доступ к ресурсу.")]
        [SwaggerResponse(statusCode: 500, type: typeof(ApiServerErrorResponse), description: "Внутренняя ошибка сервера.")]
        [Obsolete]
        public virtual IActionResult GetFeed([FromRoute (Name = "campaignId")][Required]long campaignId, [FromRoute (Name = "feedId")][Required]long feedId)
        {

            //TODO: Uncomment the next line to return response 200 or use other options such as return this.NotFound(), return this.BadRequest(..), ...
            // return StatusCode(200, default(GetFeedResponse));
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
            exampleJson = "{\n  \"feed\" : {\n    \"password\" : \"password\",\n    \"download\" : {\n      \"error\" : {\n        \"description\" : \"description\",\n        \"type\" : \"DOWNLOAD_ERROR\",\n        \"httpStatusCode\" : 5\n      }\n    },\n    \"uploadDate\" : \"2000-01-23T04:56:07.000+00:00\",\n    \"publication\" : {\n      \"priceAndStockUpdate\" : {\n        \"fileTime\" : \"2000-01-23T04:56:07.000+00:00\",\n        \"publishedTime\" : \"2000-01-23T04:56:07.000+00:00\"\n      },\n      \"full\" : {\n        \"fileTime\" : \"2000-01-23T04:56:07.000+00:00\",\n        \"publishedTime\" : \"2000-01-23T04:56:07.000+00:00\"\n      }\n    },\n    \"name\" : \"name\",\n    \"id\" : 0,\n    \"placement\" : {\n      \"totalOffersCount\" : 5\n    },\n    \"login\" : \"login\",\n    \"url\" : \"url\",\n    \"content\" : {\n      \"rejectedOffersCount\" : 6,\n      \"error\" : {\n        \"type\" : \"PARSE_ERROR\"\n      },\n      \"status\" : \"ERROR\",\n      \"totalOffersCount\" : 1\n    }\n  }\n}";
            exampleJson = "{\n  \"errors\" : [ {\n    \"code\" : \"code\",\n    \"message\" : \"message\"\n  }, {\n    \"code\" : \"code\",\n    \"message\" : \"message\"\n  } ],\n  \"status\" : \"OK\"\n}";
            exampleJson = "{\n  \"errors\" : [ {\n    \"code\" : \"code\",\n    \"message\" : \"message\"\n  }, {\n    \"code\" : \"code\",\n    \"message\" : \"message\"\n  } ],\n  \"status\" : \"OK\"\n}";
            exampleJson = "{\n  \"errors\" : [ {\n    \"code\" : \"code\",\n    \"message\" : \"message\"\n  }, {\n    \"code\" : \"code\",\n    \"message\" : \"message\"\n  } ],\n  \"status\" : \"OK\"\n}";
            exampleJson = "{\n  \"errors\" : [ {\n    \"code\" : \"code\",\n    \"message\" : \"message\"\n  }, {\n    \"code\" : \"code\",\n    \"message\" : \"message\"\n  } ],\n  \"status\" : \"OK\"\n}";
            exampleJson = "{\n  \"errors\" : [ {\n    \"code\" : \"code\",\n    \"message\" : \"message\"\n  }, {\n    \"code\" : \"code\",\n    \"message\" : \"message\"\n  } ],\n  \"status\" : \"OK\"\n}";
            exampleJson = "{\n  \"errors\" : [ {\n    \"code\" : \"code\",\n    \"message\" : \"message\"\n  }, {\n    \"code\" : \"code\",\n    \"message\" : \"message\"\n  } ],\n  \"status\" : \"OK\"\n}";
            
            var example = exampleJson != null
            ? JsonConvert.DeserializeObject<GetFeedResponse>(exampleJson)
            : default(GetFeedResponse);
            //TODO: Change the data returned
            return new ObjectResult(example);
        }

        /// <summary>
        /// Отчет по индексации прайс-листа
        /// </summary>
        /// <remarks>{% note warning \&quot;\&quot; %}  Этот метод устарел. Не используйте его.  {% endnote %}  Возвращает отчет по индексации прайс-листа для заданного магазина. Отчет позволяет получить статистику загрузки прайс-листа и результаты его автоматических проверок.  Данные в отчете возвращаются в порядке убывания значений параметра &#x60;generationId&#x60;.  |**⚙️ Лимит:** 1 000 запросов в час| |-| </remarks>
        /// <param name="campaignId">Идентификатор кампании в API и магазина в кабинете. Каждая кампания в API соответствует магазину в кабинете.  Чтобы узнать идентификаторы своих магазинов, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html) </param>
        /// <param name="feedId">Идентификатор прайс-листа.</param>
        /// <param name="limit">Количество значений на одной странице. </param>
        /// <param name="publishedTimeFrom">Начальная дата. Используется для фильтрации записей — по дате и времени публикации предложений на Яндекс Маркете.  Формат даты: ISO 8601 со смещением относительно UTC. Например, &#x60;2017-11-21T00:42:42+03:00&#x60;.  Значение по умолчанию: последние восемь дней со времени отправки запроса. </param>
        /// <param name="publishedTimeTo">Конечная дата. Используется для фильтрации записей — по дате и времени публикации предложений на Яндекс Маркете.  Формат даты: ISO 8601 со смещением относительно UTC. Например, &#x60;2017-11-31T00:42:42+03:00&#x60;.  Значение по умолчанию: дата и время отправки запроса.  {% note info %}  Если во время переключения между страницами выходных данных на Яндекс Маркете появятся новые результаты индексации прайс-листа, вы не получите часть данных. Чтобы этого не произошло, зафиксируйте выходные данные с помощью входного параметра &#x60;published_time_to&#x60;. Значение параметра не должно быть датой из будущего.  {% endnote %} </param>
        /// <param name="status">Статус индексации и проверки прайс-листа на соответствие техническим требованиям.  Возможные значения: * &#x60;ERROR&#x60; — произошли ошибки. * &#x60;OK&#x60; — обработан без ошибок. * &#x60;WARNING&#x60; — наблюдались некритичные проблемы. </param>
        /// <response code="200">Отчет по индексации прайс-листа.</response>
        /// <response code="400">Запрос содержит неправильные данные.</response>
        /// <response code="401">В запросе не указаны данные для авторизации.</response>
        /// <response code="403">Данные для авторизации неверны или доступ к ресурсу запрещен.</response>
        /// <response code="404">Запрашиваемый ресурс не найден.</response>
        /// <response code="420">Превышено ограничение на доступ к ресурсу.</response>
        /// <response code="500">Внутренняя ошибка сервера.</response>
        [HttpGet]
        [Route("/campaigns/{campaignId}/feeds/{feedId}/index-logs")]
        [ValidateModelState]
        [SwaggerOperation("GetFeedIndexLogs")]
        [SwaggerResponse(statusCode: 200, type: typeof(GetFeedIndexLogsResponse), description: "Отчет по индексации прайс-листа.")]
        [SwaggerResponse(statusCode: 400, type: typeof(ApiClientDataErrorResponse), description: "Запрос содержит неправильные данные.")]
        [SwaggerResponse(statusCode: 401, type: typeof(ApiUnauthorizedErrorResponse), description: "В запросе не указаны данные для авторизации.")]
        [SwaggerResponse(statusCode: 403, type: typeof(ApiForbiddenErrorResponse), description: "Данные для авторизации неверны или доступ к ресурсу запрещен.")]
        [SwaggerResponse(statusCode: 404, type: typeof(ApiNotFoundErrorResponse), description: "Запрашиваемый ресурс не найден.")]
        [SwaggerResponse(statusCode: 420, type: typeof(ApiLimitErrorResponse), description: "Превышено ограничение на доступ к ресурсу.")]
        [SwaggerResponse(statusCode: 500, type: typeof(ApiServerErrorResponse), description: "Внутренняя ошибка сервера.")]
        [Obsolete]
        public virtual IActionResult GetFeedIndexLogs([FromRoute (Name = "campaignId")][Required]long campaignId, [FromRoute (Name = "feedId")][Required]long feedId, [FromQuery (Name = "limit")]int? limit, [FromQuery (Name = "published_time_from")]DateTime? publishedTimeFrom, [FromQuery (Name = "published_time_to")]DateTime? publishedTimeTo, [FromQuery (Name = "status")]FeedIndexLogsStatusType? status)
        {

            //TODO: Uncomment the next line to return response 200 or use other options such as return this.NotFound(), return this.BadRequest(..), ...
            // return StatusCode(200, default(GetFeedIndexLogsResponse));
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
            exampleJson = "{\n  \"result\" : {\n    \"feed\" : {\n      \"id\" : 0\n    },\n    \"total\" : 2,\n    \"indexLogRecords\" : [ {\n      \"offers\" : {\n        \"rejectedCount\" : 5,\n        \"totalCount\" : 5\n      },\n      \"fileTime\" : \"2000-01-23T04:56:07.000+00:00\",\n      \"generationId\" : 6,\n      \"indexType\" : \"DIFF\",\n      \"publishedTime\" : \"2000-01-23T04:56:07.000+00:00\",\n      \"error\" : {\n        \"description\" : \"description\",\n        \"type\" : \"DOWNLOAD_ERROR\",\n        \"httpStatusCode\" : 1\n      },\n      \"downloadTime\" : \"2000-01-23T04:56:07.000+00:00\",\n      \"status\" : \"ERROR\"\n    }, {\n      \"offers\" : {\n        \"rejectedCount\" : 5,\n        \"totalCount\" : 5\n      },\n      \"fileTime\" : \"2000-01-23T04:56:07.000+00:00\",\n      \"generationId\" : 6,\n      \"indexType\" : \"DIFF\",\n      \"publishedTime\" : \"2000-01-23T04:56:07.000+00:00\",\n      \"error\" : {\n        \"description\" : \"description\",\n        \"type\" : \"DOWNLOAD_ERROR\",\n        \"httpStatusCode\" : 1\n      },\n      \"downloadTime\" : \"2000-01-23T04:56:07.000+00:00\",\n      \"status\" : \"ERROR\"\n    } ]\n  },\n  \"status\" : \"OK\"\n}";
            exampleJson = "{\n  \"errors\" : [ {\n    \"code\" : \"code\",\n    \"message\" : \"message\"\n  }, {\n    \"code\" : \"code\",\n    \"message\" : \"message\"\n  } ],\n  \"status\" : \"OK\"\n}";
            exampleJson = "{\n  \"errors\" : [ {\n    \"code\" : \"code\",\n    \"message\" : \"message\"\n  }, {\n    \"code\" : \"code\",\n    \"message\" : \"message\"\n  } ],\n  \"status\" : \"OK\"\n}";
            exampleJson = "{\n  \"errors\" : [ {\n    \"code\" : \"code\",\n    \"message\" : \"message\"\n  }, {\n    \"code\" : \"code\",\n    \"message\" : \"message\"\n  } ],\n  \"status\" : \"OK\"\n}";
            exampleJson = "{\n  \"errors\" : [ {\n    \"code\" : \"code\",\n    \"message\" : \"message\"\n  }, {\n    \"code\" : \"code\",\n    \"message\" : \"message\"\n  } ],\n  \"status\" : \"OK\"\n}";
            exampleJson = "{\n  \"errors\" : [ {\n    \"code\" : \"code\",\n    \"message\" : \"message\"\n  }, {\n    \"code\" : \"code\",\n    \"message\" : \"message\"\n  } ],\n  \"status\" : \"OK\"\n}";
            exampleJson = "{\n  \"errors\" : [ {\n    \"code\" : \"code\",\n    \"message\" : \"message\"\n  }, {\n    \"code\" : \"code\",\n    \"message\" : \"message\"\n  } ],\n  \"status\" : \"OK\"\n}";
            
            var example = exampleJson != null
            ? JsonConvert.DeserializeObject<GetFeedIndexLogsResponse>(exampleJson)
            : default(GetFeedIndexLogsResponse);
            //TODO: Change the data returned
            return new ObjectResult(example);
        }

        /// <summary>
        /// Список прайс-листов магазина
        /// </summary>
        /// <remarks>{% note warning \&quot;\&quot; %}  Этот метод устарел. Не используйте его.  {% endnote %}  Возвращает список прайс-листов, размещенных на Маркете для магазина. Также ресурс возвращает результаты автоматических проверок прайс-листов. |**⚙️ Лимит:** 1000 запросов в час| |-| </remarks>
        /// <param name="campaignId">Идентификатор кампании в API и магазина в кабинете. Каждая кампания в API соответствует магазину в кабинете.  Чтобы узнать идентификаторы своих магазинов, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html) </param>
        /// <response code="200">Список прайс-листов.</response>
        /// <response code="400">Запрос содержит неправильные данные.</response>
        /// <response code="401">В запросе не указаны данные для авторизации.</response>
        /// <response code="403">Данные для авторизации неверны или доступ к ресурсу запрещен.</response>
        /// <response code="404">Запрашиваемый ресурс не найден.</response>
        /// <response code="420">Превышено ограничение на доступ к ресурсу.</response>
        /// <response code="500">Внутренняя ошибка сервера.</response>
        [HttpGet]
        [Route("/campaigns/{campaignId}/feeds")]
        [ValidateModelState]
        [SwaggerOperation("GetFeeds")]
        [SwaggerResponse(statusCode: 200, type: typeof(GetFeedsResponse), description: "Список прайс-листов.")]
        [SwaggerResponse(statusCode: 400, type: typeof(ApiClientDataErrorResponse), description: "Запрос содержит неправильные данные.")]
        [SwaggerResponse(statusCode: 401, type: typeof(ApiUnauthorizedErrorResponse), description: "В запросе не указаны данные для авторизации.")]
        [SwaggerResponse(statusCode: 403, type: typeof(ApiForbiddenErrorResponse), description: "Данные для авторизации неверны или доступ к ресурсу запрещен.")]
        [SwaggerResponse(statusCode: 404, type: typeof(ApiNotFoundErrorResponse), description: "Запрашиваемый ресурс не найден.")]
        [SwaggerResponse(statusCode: 420, type: typeof(ApiLimitErrorResponse), description: "Превышено ограничение на доступ к ресурсу.")]
        [SwaggerResponse(statusCode: 500, type: typeof(ApiServerErrorResponse), description: "Внутренняя ошибка сервера.")]
        [Obsolete]
        public virtual IActionResult GetFeeds([FromRoute (Name = "campaignId")][Required]long campaignId)
        {

            //TODO: Uncomment the next line to return response 200 or use other options such as return this.NotFound(), return this.BadRequest(..), ...
            // return StatusCode(200, default(GetFeedsResponse));
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
            exampleJson = "{\n  \"feeds\" : [ {\n    \"password\" : \"password\",\n    \"download\" : {\n      \"error\" : {\n        \"description\" : \"description\",\n        \"type\" : \"DOWNLOAD_ERROR\",\n        \"httpStatusCode\" : 5\n      }\n    },\n    \"uploadDate\" : \"2000-01-23T04:56:07.000+00:00\",\n    \"publication\" : {\n      \"priceAndStockUpdate\" : {\n        \"fileTime\" : \"2000-01-23T04:56:07.000+00:00\",\n        \"publishedTime\" : \"2000-01-23T04:56:07.000+00:00\"\n      },\n      \"full\" : {\n        \"fileTime\" : \"2000-01-23T04:56:07.000+00:00\",\n        \"publishedTime\" : \"2000-01-23T04:56:07.000+00:00\"\n      }\n    },\n    \"name\" : \"name\",\n    \"id\" : 0,\n    \"placement\" : {\n      \"totalOffersCount\" : 5\n    },\n    \"login\" : \"login\",\n    \"url\" : \"url\",\n    \"content\" : {\n      \"rejectedOffersCount\" : 6,\n      \"error\" : {\n        \"type\" : \"PARSE_ERROR\"\n      },\n      \"status\" : \"ERROR\",\n      \"totalOffersCount\" : 1\n    }\n  }, {\n    \"password\" : \"password\",\n    \"download\" : {\n      \"error\" : {\n        \"description\" : \"description\",\n        \"type\" : \"DOWNLOAD_ERROR\",\n        \"httpStatusCode\" : 5\n      }\n    },\n    \"uploadDate\" : \"2000-01-23T04:56:07.000+00:00\",\n    \"publication\" : {\n      \"priceAndStockUpdate\" : {\n        \"fileTime\" : \"2000-01-23T04:56:07.000+00:00\",\n        \"publishedTime\" : \"2000-01-23T04:56:07.000+00:00\"\n      },\n      \"full\" : {\n        \"fileTime\" : \"2000-01-23T04:56:07.000+00:00\",\n        \"publishedTime\" : \"2000-01-23T04:56:07.000+00:00\"\n      }\n    },\n    \"name\" : \"name\",\n    \"id\" : 0,\n    \"placement\" : {\n      \"totalOffersCount\" : 5\n    },\n    \"login\" : \"login\",\n    \"url\" : \"url\",\n    \"content\" : {\n      \"rejectedOffersCount\" : 6,\n      \"error\" : {\n        \"type\" : \"PARSE_ERROR\"\n      },\n      \"status\" : \"ERROR\",\n      \"totalOffersCount\" : 1\n    }\n  } ]\n}";
            exampleJson = "{\n  \"errors\" : [ {\n    \"code\" : \"code\",\n    \"message\" : \"message\"\n  }, {\n    \"code\" : \"code\",\n    \"message\" : \"message\"\n  } ],\n  \"status\" : \"OK\"\n}";
            exampleJson = "{\n  \"errors\" : [ {\n    \"code\" : \"code\",\n    \"message\" : \"message\"\n  }, {\n    \"code\" : \"code\",\n    \"message\" : \"message\"\n  } ],\n  \"status\" : \"OK\"\n}";
            exampleJson = "{\n  \"errors\" : [ {\n    \"code\" : \"code\",\n    \"message\" : \"message\"\n  }, {\n    \"code\" : \"code\",\n    \"message\" : \"message\"\n  } ],\n  \"status\" : \"OK\"\n}";
            exampleJson = "{\n  \"errors\" : [ {\n    \"code\" : \"code\",\n    \"message\" : \"message\"\n  }, {\n    \"code\" : \"code\",\n    \"message\" : \"message\"\n  } ],\n  \"status\" : \"OK\"\n}";
            exampleJson = "{\n  \"errors\" : [ {\n    \"code\" : \"code\",\n    \"message\" : \"message\"\n  }, {\n    \"code\" : \"code\",\n    \"message\" : \"message\"\n  } ],\n  \"status\" : \"OK\"\n}";
            exampleJson = "{\n  \"errors\" : [ {\n    \"code\" : \"code\",\n    \"message\" : \"message\"\n  }, {\n    \"code\" : \"code\",\n    \"message\" : \"message\"\n  } ],\n  \"status\" : \"OK\"\n}";
            
            var example = exampleJson != null
            ? JsonConvert.DeserializeObject<GetFeedsResponse>(exampleJson)
            : default(GetFeedsResponse);
            //TODO: Change the data returned
            return new ObjectResult(example);
        }

        /// <summary>
        /// Сообщить, что прайс-лист обновился
        /// </summary>
        /// <remarks>{% note warning \&quot;\&quot; %}  Этот метод устарел. Не используйте его.  {% endnote %}  Позволяет сообщить, что магазин обновил прайс-лист. После этого Маркет начнет обновление данных на сервисе. 1. Магазин обновляет прайс-лист, ссылку на который он указал в кабинете. 2. Магазин отправляет Маркету запрос методом &#x60;POST campaigns/{campaignId}/feeds/{feedId}/refresh&#x60;. 3. Маркет начинает обновление данных магазина на сервисе.  {% note alert %}  Запрос работает только для включенных магазинов. Если магазин выключен, данные на Маркете не обновятся, даже если HTTP-код — &#x60;200 OK&#x60;. Проверить статус магазина можно с помощью базовых запросов или на странице бизнес-аккаунта.  {% endnote %}  |**⚙️ Лимит:** 3 запроса в час для одного прайс-листа| |-| </remarks>
        /// <param name="campaignId">Идентификатор кампании в API и магазина в кабинете. Каждая кампания в API соответствует магазину в кабинете.  Чтобы узнать идентификаторы своих магазинов, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html) </param>
        /// <param name="feedId">Идентификатор прайс-листа.</param>
        /// <response code="200">Пустой ответ.</response>
        /// <response code="400">Запрос содержит неправильные данные.</response>
        /// <response code="401">В запросе не указаны данные для авторизации.</response>
        /// <response code="403">Данные для авторизации неверны или доступ к ресурсу запрещен.</response>
        /// <response code="404">Запрашиваемый ресурс не найден.</response>
        /// <response code="420">Превышено ограничение на доступ к ресурсу.</response>
        /// <response code="500">Внутренняя ошибка сервера.</response>
        [HttpPost]
        [Route("/campaigns/{campaignId}/feeds/{feedId}/refresh")]
        [ValidateModelState]
        [SwaggerOperation("RefreshFeed")]
        [SwaggerResponse(statusCode: 200, type: typeof(EmptyApiResponse), description: "Пустой ответ.")]
        [SwaggerResponse(statusCode: 400, type: typeof(ApiClientDataErrorResponse), description: "Запрос содержит неправильные данные.")]
        [SwaggerResponse(statusCode: 401, type: typeof(ApiUnauthorizedErrorResponse), description: "В запросе не указаны данные для авторизации.")]
        [SwaggerResponse(statusCode: 403, type: typeof(ApiForbiddenErrorResponse), description: "Данные для авторизации неверны или доступ к ресурсу запрещен.")]
        [SwaggerResponse(statusCode: 404, type: typeof(ApiNotFoundErrorResponse), description: "Запрашиваемый ресурс не найден.")]
        [SwaggerResponse(statusCode: 420, type: typeof(ApiLimitErrorResponse), description: "Превышено ограничение на доступ к ресурсу.")]
        [SwaggerResponse(statusCode: 500, type: typeof(ApiServerErrorResponse), description: "Внутренняя ошибка сервера.")]
        [Obsolete]
        public virtual IActionResult RefreshFeed([FromRoute (Name = "campaignId")][Required]long campaignId, [FromRoute (Name = "feedId")][Required]long feedId)
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
            
            var example = exampleJson != null
            ? JsonConvert.DeserializeObject<EmptyApiResponse>(exampleJson)
            : default(EmptyApiResponse);
            //TODO: Change the data returned
            return new ObjectResult(example);
        }

        /// <summary>
        /// Изменение параметров прайс-листа
        /// </summary>
        /// <remarks>{% note warning \&quot;\&quot; %}  Этот метод устарел. Не используйте его.  {% endnote %}  Позволяет магазину изменить параметры прайс-листа.  Чтобы отредактировать параметр прайс-листа, передайте в теле запроса: &#x60;name&#x60; (название параметра) и &#x60;value&#x60; (значение параметра).  Чтобы отменить установленное значение, передайте в теле запроса: &#x60;name&#x60; (название параметра) и &#x60;delete&#x3D;true&#x60; (удалить значение).  |**⚙️ Лимит:** 3 запроса в час для одного прайс-листа| |-| </remarks>
        /// <param name="campaignId">Идентификатор кампании в API и магазина в кабинете. Каждая кампания в API соответствует магазину в кабинете.  Чтобы узнать идентификаторы своих магазинов, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html) </param>
        /// <param name="feedId">Идентификатор прайс-листа.</param>
        /// <param name="setFeedParamsRequest"></param>
        /// <response code="200">Статус выполнения операции.</response>
        /// <response code="400">Запрос содержит неправильные данные.</response>
        /// <response code="401">В запросе не указаны данные для авторизации.</response>
        /// <response code="403">Данные для авторизации неверны или доступ к ресурсу запрещен.</response>
        /// <response code="404">Запрашиваемый ресурс не найден.</response>
        /// <response code="420">Превышено ограничение на доступ к ресурсу.</response>
        /// <response code="423">К ресурсу нельзя применить указанный метод.</response>
        /// <response code="500">Внутренняя ошибка сервера.</response>
        [HttpPost]
        [Route("/campaigns/{campaignId}/feeds/{feedId}/params")]
        [Consumes("application/json")]
        [ValidateModelState]
        [SwaggerOperation("SetFeedParams")]
        [SwaggerResponse(statusCode: 200, type: typeof(EmptyApiResponse), description: "Статус выполнения операции.")]
        [SwaggerResponse(statusCode: 400, type: typeof(ApiClientDataErrorResponse), description: "Запрос содержит неправильные данные.")]
        [SwaggerResponse(statusCode: 401, type: typeof(ApiUnauthorizedErrorResponse), description: "В запросе не указаны данные для авторизации.")]
        [SwaggerResponse(statusCode: 403, type: typeof(ApiForbiddenErrorResponse), description: "Данные для авторизации неверны или доступ к ресурсу запрещен.")]
        [SwaggerResponse(statusCode: 404, type: typeof(ApiNotFoundErrorResponse), description: "Запрашиваемый ресурс не найден.")]
        [SwaggerResponse(statusCode: 420, type: typeof(ApiLimitErrorResponse), description: "Превышено ограничение на доступ к ресурсу.")]
        [SwaggerResponse(statusCode: 423, type: typeof(ApiLockedErrorResponse), description: "К ресурсу нельзя применить указанный метод.")]
        [SwaggerResponse(statusCode: 500, type: typeof(ApiServerErrorResponse), description: "Внутренняя ошибка сервера.")]
        [Obsolete]
        public virtual IActionResult SetFeedParams([FromRoute (Name = "campaignId")][Required]long campaignId, [FromRoute (Name = "feedId")][Required]long feedId, [FromBody]SetFeedParamsRequest setFeedParamsRequest)
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
    }
}
