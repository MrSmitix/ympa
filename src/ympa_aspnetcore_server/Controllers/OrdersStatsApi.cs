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
    public class OrdersStatsApiController : ControllerBase
    { 
        /// <summary>
        /// Детальная информация по заказам
        /// </summary>
        /// <remarks>Возвращает информацию по заказам на Маркете, в которых есть ваши товары. С помощью нее вы можете собрать статистику по вашим заказам и узнать, например, какие из товаров чаще всего возвращаются покупателями, какие, наоборот, пользуются большим спросом, какая комиссия начисляется за заказы и т. п.  {% note info \&quot;\&quot; %}  Раньше генерация детальной информации по заказам называлась **Отчет по заказам**. Сейчас это новый отчет. [Подробнее об отчете](../../reference/reports/generateUnitedOrdersReport.md)  {% endnote %}  В одном запросе можно получить информацию не более чем по 200 заказам.  |**⚙️ Лимит:** 1 000 000 запросов в час| |-| </remarks>
        /// <param name="campaignId">Идентификатор кампании в API и магазина в кабинете. Каждая кампания в API соответствует магазину в кабинете.  Чтобы узнать идентификаторы своих магазинов, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html) </param>
        /// <param name="pageToken">Идентификатор страницы c результатами.  Если параметр не указан, возвращается первая страница.  Рекомендуется передавать значение выходного параметра &#x60;nextPageToken&#x60;, полученное при последнем запросе.  Если задан &#x60;page_token&#x60; и в запросе есть параметры &#x60;offset&#x60;, &#x60;page_number&#x60; и &#x60;page_size&#x60;, они игнорируются. </param>
        /// <param name="limit">Количество значений на одной странице. </param>
        /// <param name="getOrdersStatsRequest"></param>
        /// <response code="200">Информация по заказам.</response>
        /// <response code="400">Запрос содержит неправильные данные.</response>
        /// <response code="401">В запросе не указаны данные для авторизации.</response>
        /// <response code="403">Данные для авторизации неверны или доступ к ресурсу запрещен.</response>
        /// <response code="404">Запрашиваемый ресурс не найден.</response>
        /// <response code="420">Превышено ограничение на доступ к ресурсу.</response>
        /// <response code="500">Внутренняя ошибка сервера.</response>
        [HttpPost]
        [Route("/campaigns/{campaignId}/stats/orders")]
        [Consumes("application/json")]
        [ValidateModelState]
        [SwaggerOperation("GetOrdersStats")]
        [SwaggerResponse(statusCode: 200, type: typeof(GetOrdersStatsResponse), description: "Информация по заказам.")]
        [SwaggerResponse(statusCode: 400, type: typeof(ApiClientDataErrorResponse), description: "Запрос содержит неправильные данные.")]
        [SwaggerResponse(statusCode: 401, type: typeof(ApiUnauthorizedErrorResponse), description: "В запросе не указаны данные для авторизации.")]
        [SwaggerResponse(statusCode: 403, type: typeof(ApiForbiddenErrorResponse), description: "Данные для авторизации неверны или доступ к ресурсу запрещен.")]
        [SwaggerResponse(statusCode: 404, type: typeof(ApiNotFoundErrorResponse), description: "Запрашиваемый ресурс не найден.")]
        [SwaggerResponse(statusCode: 420, type: typeof(ApiLimitErrorResponse), description: "Превышено ограничение на доступ к ресурсу.")]
        [SwaggerResponse(statusCode: 500, type: typeof(ApiServerErrorResponse), description: "Внутренняя ошибка сервера.")]
        public virtual IActionResult GetOrdersStats([FromRoute (Name = "campaignId")][Required]long campaignId, [FromQuery (Name = "page_token")]string pageToken, [FromQuery (Name = "limit")]int? limit, [FromBody]GetOrdersStatsRequest getOrdersStatsRequest)
        {

            //TODO: Uncomment the next line to return response 200 or use other options such as return this.NotFound(), return this.BadRequest(..), ...
            // return StatusCode(200, default(GetOrdersStatsResponse));
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
            exampleJson = "{\n  \"result\" : {\n    \"orders\" : [ {\n      \"partnerOrderId\" : \"partnerOrderId\",\n      \"commissions\" : [ {\n        \"actual\" : 1.2315135367772556,\n        \"type\" : \"FEE\"\n      }, {\n        \"actual\" : 1.2315135367772556,\n        \"type\" : \"FEE\"\n      } ],\n      \"statusUpdateDate\" : \"2000-01-23T04:56:07.000+00:00\",\n      \"payments\" : [ {\n        \"date\" : \"2000-01-23\",\n        \"total\" : 7.386281948385884,\n        \"paymentOrder\" : {\n          \"date\" : \"2000-01-23\",\n          \"id\" : \"id\"\n        },\n        \"id\" : \"id\",\n        \"source\" : \"BUYER\",\n        \"type\" : \"PAYMENT\"\n      }, {\n        \"date\" : \"2000-01-23\",\n        \"total\" : 7.386281948385884,\n        \"paymentOrder\" : {\n          \"date\" : \"2000-01-23\",\n          \"id\" : \"id\"\n        },\n        \"id\" : \"id\",\n        \"source\" : \"BUYER\",\n        \"type\" : \"PAYMENT\"\n      } ],\n      \"fake\" : true,\n      \"deliveryRegion\" : {\n        \"name\" : \"name\",\n        \"id\" : 6\n      },\n      \"id\" : 0,\n      \"creationDate\" : \"2000-01-23\",\n      \"items\" : [ {\n        \"cofinanceValue\" : 4.145608029883936,\n        \"initialCount\" : 3,\n        \"offerName\" : \"offerName\",\n        \"shopSku\" : \"shopSku\",\n        \"cisList\" : [ \"cisList\", \"cisList\" ],\n        \"marketSku\" : 1,\n        \"count\" : 5,\n        \"bidFee\" : 570,\n        \"cofinanceThreshold\" : 2.027123023002322,\n        \"details\" : [ {\n          \"updateDate\" : \"2000-01-23\",\n          \"stockType\" : \"FIT\",\n          \"itemStatus\" : \"REJECTED\",\n          \"itemCount\" : 9\n        }, {\n          \"updateDate\" : \"2000-01-23\",\n          \"stockType\" : \"FIT\",\n          \"itemStatus\" : \"REJECTED\",\n          \"itemCount\" : 9\n        } ],\n        \"prices\" : [ {\n          \"total\" : 2.3021358869347655,\n          \"costPerItem\" : 5.637376656633329,\n          \"type\" : \"BUYER\"\n        }, {\n          \"total\" : 2.3021358869347655,\n          \"costPerItem\" : 5.637376656633329,\n          \"type\" : \"BUYER\"\n        } ],\n        \"warehouse\" : {\n          \"name\" : \"name\",\n          \"id\" : 7\n        }\n      }, {\n        \"cofinanceValue\" : 4.145608029883936,\n        \"initialCount\" : 3,\n        \"offerName\" : \"offerName\",\n        \"shopSku\" : \"shopSku\",\n        \"cisList\" : [ \"cisList\", \"cisList\" ],\n        \"marketSku\" : 1,\n        \"count\" : 5,\n        \"bidFee\" : 570,\n        \"cofinanceThreshold\" : 2.027123023002322,\n        \"details\" : [ {\n          \"updateDate\" : \"2000-01-23\",\n          \"stockType\" : \"FIT\",\n          \"itemStatus\" : \"REJECTED\",\n          \"itemCount\" : 9\n        }, {\n          \"updateDate\" : \"2000-01-23\",\n          \"stockType\" : \"FIT\",\n          \"itemStatus\" : \"REJECTED\",\n          \"itemCount\" : 9\n        } ],\n        \"prices\" : [ {\n          \"total\" : 2.3021358869347655,\n          \"costPerItem\" : 5.637376656633329,\n          \"type\" : \"BUYER\"\n        }, {\n          \"total\" : 2.3021358869347655,\n          \"costPerItem\" : 5.637376656633329,\n          \"type\" : \"BUYER\"\n        } ],\n        \"warehouse\" : {\n          \"name\" : \"name\",\n          \"id\" : 7\n        }\n      } ],\n      \"initialItems\" : [ {\n        \"cofinanceValue\" : 4.145608029883936,\n        \"initialCount\" : 3,\n        \"offerName\" : \"offerName\",\n        \"shopSku\" : \"shopSku\",\n        \"cisList\" : [ \"cisList\", \"cisList\" ],\n        \"marketSku\" : 1,\n        \"count\" : 5,\n        \"bidFee\" : 570,\n        \"cofinanceThreshold\" : 2.027123023002322,\n        \"details\" : [ {\n          \"updateDate\" : \"2000-01-23\",\n          \"stockType\" : \"FIT\",\n          \"itemStatus\" : \"REJECTED\",\n          \"itemCount\" : 9\n        }, {\n          \"updateDate\" : \"2000-01-23\",\n          \"stockType\" : \"FIT\",\n          \"itemStatus\" : \"REJECTED\",\n          \"itemCount\" : 9\n        } ],\n        \"prices\" : [ {\n          \"total\" : 2.3021358869347655,\n          \"costPerItem\" : 5.637376656633329,\n          \"type\" : \"BUYER\"\n        }, {\n          \"total\" : 2.3021358869347655,\n          \"costPerItem\" : 5.637376656633329,\n          \"type\" : \"BUYER\"\n        } ],\n        \"warehouse\" : {\n          \"name\" : \"name\",\n          \"id\" : 7\n        }\n      }, {\n        \"cofinanceValue\" : 4.145608029883936,\n        \"initialCount\" : 3,\n        \"offerName\" : \"offerName\",\n        \"shopSku\" : \"shopSku\",\n        \"cisList\" : [ \"cisList\", \"cisList\" ],\n        \"marketSku\" : 1,\n        \"count\" : 5,\n        \"bidFee\" : 570,\n        \"cofinanceThreshold\" : 2.027123023002322,\n        \"details\" : [ {\n          \"updateDate\" : \"2000-01-23\",\n          \"stockType\" : \"FIT\",\n          \"itemStatus\" : \"REJECTED\",\n          \"itemCount\" : 9\n        }, {\n          \"updateDate\" : \"2000-01-23\",\n          \"stockType\" : \"FIT\",\n          \"itemStatus\" : \"REJECTED\",\n          \"itemCount\" : 9\n        } ],\n        \"prices\" : [ {\n          \"total\" : 2.3021358869347655,\n          \"costPerItem\" : 5.637376656633329,\n          \"type\" : \"BUYER\"\n        }, {\n          \"total\" : 2.3021358869347655,\n          \"costPerItem\" : 5.637376656633329,\n          \"type\" : \"BUYER\"\n        } ],\n        \"warehouse\" : {\n          \"name\" : \"name\",\n          \"id\" : 7\n        }\n      } ],\n      \"status\" : \"CANCELLED_BEFORE_PROCESSING\",\n      \"paymentType\" : \"CREDIT\"\n    }, {\n      \"partnerOrderId\" : \"partnerOrderId\",\n      \"commissions\" : [ {\n        \"actual\" : 1.2315135367772556,\n        \"type\" : \"FEE\"\n      }, {\n        \"actual\" : 1.2315135367772556,\n        \"type\" : \"FEE\"\n      } ],\n      \"statusUpdateDate\" : \"2000-01-23T04:56:07.000+00:00\",\n      \"payments\" : [ {\n        \"date\" : \"2000-01-23\",\n        \"total\" : 7.386281948385884,\n        \"paymentOrder\" : {\n          \"date\" : \"2000-01-23\",\n          \"id\" : \"id\"\n        },\n        \"id\" : \"id\",\n        \"source\" : \"BUYER\",\n        \"type\" : \"PAYMENT\"\n      }, {\n        \"date\" : \"2000-01-23\",\n        \"total\" : 7.386281948385884,\n        \"paymentOrder\" : {\n          \"date\" : \"2000-01-23\",\n          \"id\" : \"id\"\n        },\n        \"id\" : \"id\",\n        \"source\" : \"BUYER\",\n        \"type\" : \"PAYMENT\"\n      } ],\n      \"fake\" : true,\n      \"deliveryRegion\" : {\n        \"name\" : \"name\",\n        \"id\" : 6\n      },\n      \"id\" : 0,\n      \"creationDate\" : \"2000-01-23\",\n      \"items\" : [ {\n        \"cofinanceValue\" : 4.145608029883936,\n        \"initialCount\" : 3,\n        \"offerName\" : \"offerName\",\n        \"shopSku\" : \"shopSku\",\n        \"cisList\" : [ \"cisList\", \"cisList\" ],\n        \"marketSku\" : 1,\n        \"count\" : 5,\n        \"bidFee\" : 570,\n        \"cofinanceThreshold\" : 2.027123023002322,\n        \"details\" : [ {\n          \"updateDate\" : \"2000-01-23\",\n          \"stockType\" : \"FIT\",\n          \"itemStatus\" : \"REJECTED\",\n          \"itemCount\" : 9\n        }, {\n          \"updateDate\" : \"2000-01-23\",\n          \"stockType\" : \"FIT\",\n          \"itemStatus\" : \"REJECTED\",\n          \"itemCount\" : 9\n        } ],\n        \"prices\" : [ {\n          \"total\" : 2.3021358869347655,\n          \"costPerItem\" : 5.637376656633329,\n          \"type\" : \"BUYER\"\n        }, {\n          \"total\" : 2.3021358869347655,\n          \"costPerItem\" : 5.637376656633329,\n          \"type\" : \"BUYER\"\n        } ],\n        \"warehouse\" : {\n          \"name\" : \"name\",\n          \"id\" : 7\n        }\n      }, {\n        \"cofinanceValue\" : 4.145608029883936,\n        \"initialCount\" : 3,\n        \"offerName\" : \"offerName\",\n        \"shopSku\" : \"shopSku\",\n        \"cisList\" : [ \"cisList\", \"cisList\" ],\n        \"marketSku\" : 1,\n        \"count\" : 5,\n        \"bidFee\" : 570,\n        \"cofinanceThreshold\" : 2.027123023002322,\n        \"details\" : [ {\n          \"updateDate\" : \"2000-01-23\",\n          \"stockType\" : \"FIT\",\n          \"itemStatus\" : \"REJECTED\",\n          \"itemCount\" : 9\n        }, {\n          \"updateDate\" : \"2000-01-23\",\n          \"stockType\" : \"FIT\",\n          \"itemStatus\" : \"REJECTED\",\n          \"itemCount\" : 9\n        } ],\n        \"prices\" : [ {\n          \"total\" : 2.3021358869347655,\n          \"costPerItem\" : 5.637376656633329,\n          \"type\" : \"BUYER\"\n        }, {\n          \"total\" : 2.3021358869347655,\n          \"costPerItem\" : 5.637376656633329,\n          \"type\" : \"BUYER\"\n        } ],\n        \"warehouse\" : {\n          \"name\" : \"name\",\n          \"id\" : 7\n        }\n      } ],\n      \"initialItems\" : [ {\n        \"cofinanceValue\" : 4.145608029883936,\n        \"initialCount\" : 3,\n        \"offerName\" : \"offerName\",\n        \"shopSku\" : \"shopSku\",\n        \"cisList\" : [ \"cisList\", \"cisList\" ],\n        \"marketSku\" : 1,\n        \"count\" : 5,\n        \"bidFee\" : 570,\n        \"cofinanceThreshold\" : 2.027123023002322,\n        \"details\" : [ {\n          \"updateDate\" : \"2000-01-23\",\n          \"stockType\" : \"FIT\",\n          \"itemStatus\" : \"REJECTED\",\n          \"itemCount\" : 9\n        }, {\n          \"updateDate\" : \"2000-01-23\",\n          \"stockType\" : \"FIT\",\n          \"itemStatus\" : \"REJECTED\",\n          \"itemCount\" : 9\n        } ],\n        \"prices\" : [ {\n          \"total\" : 2.3021358869347655,\n          \"costPerItem\" : 5.637376656633329,\n          \"type\" : \"BUYER\"\n        }, {\n          \"total\" : 2.3021358869347655,\n          \"costPerItem\" : 5.637376656633329,\n          \"type\" : \"BUYER\"\n        } ],\n        \"warehouse\" : {\n          \"name\" : \"name\",\n          \"id\" : 7\n        }\n      }, {\n        \"cofinanceValue\" : 4.145608029883936,\n        \"initialCount\" : 3,\n        \"offerName\" : \"offerName\",\n        \"shopSku\" : \"shopSku\",\n        \"cisList\" : [ \"cisList\", \"cisList\" ],\n        \"marketSku\" : 1,\n        \"count\" : 5,\n        \"bidFee\" : 570,\n        \"cofinanceThreshold\" : 2.027123023002322,\n        \"details\" : [ {\n          \"updateDate\" : \"2000-01-23\",\n          \"stockType\" : \"FIT\",\n          \"itemStatus\" : \"REJECTED\",\n          \"itemCount\" : 9\n        }, {\n          \"updateDate\" : \"2000-01-23\",\n          \"stockType\" : \"FIT\",\n          \"itemStatus\" : \"REJECTED\",\n          \"itemCount\" : 9\n        } ],\n        \"prices\" : [ {\n          \"total\" : 2.3021358869347655,\n          \"costPerItem\" : 5.637376656633329,\n          \"type\" : \"BUYER\"\n        }, {\n          \"total\" : 2.3021358869347655,\n          \"costPerItem\" : 5.637376656633329,\n          \"type\" : \"BUYER\"\n        } ],\n        \"warehouse\" : {\n          \"name\" : \"name\",\n          \"id\" : 7\n        }\n      } ],\n      \"status\" : \"CANCELLED_BEFORE_PROCESSING\",\n      \"paymentType\" : \"CREDIT\"\n    } ],\n    \"paging\" : {\n      \"nextPageToken\" : \"nextPageToken\"\n    }\n  },\n  \"status\" : \"OK\"\n}";
            exampleJson = "{\n  \"errors\" : [ {\n    \"code\" : \"code\",\n    \"message\" : \"message\"\n  }, {\n    \"code\" : \"code\",\n    \"message\" : \"message\"\n  } ],\n  \"status\" : \"OK\"\n}";
            exampleJson = "{\n  \"errors\" : [ {\n    \"code\" : \"code\",\n    \"message\" : \"message\"\n  }, {\n    \"code\" : \"code\",\n    \"message\" : \"message\"\n  } ],\n  \"status\" : \"OK\"\n}";
            exampleJson = "{\n  \"errors\" : [ {\n    \"code\" : \"code\",\n    \"message\" : \"message\"\n  }, {\n    \"code\" : \"code\",\n    \"message\" : \"message\"\n  } ],\n  \"status\" : \"OK\"\n}";
            exampleJson = "{\n  \"errors\" : [ {\n    \"code\" : \"code\",\n    \"message\" : \"message\"\n  }, {\n    \"code\" : \"code\",\n    \"message\" : \"message\"\n  } ],\n  \"status\" : \"OK\"\n}";
            exampleJson = "{\n  \"errors\" : [ {\n    \"code\" : \"code\",\n    \"message\" : \"message\"\n  }, {\n    \"code\" : \"code\",\n    \"message\" : \"message\"\n  } ],\n  \"status\" : \"OK\"\n}";
            exampleJson = "{\n  \"errors\" : [ {\n    \"code\" : \"code\",\n    \"message\" : \"message\"\n  }, {\n    \"code\" : \"code\",\n    \"message\" : \"message\"\n  } ],\n  \"status\" : \"OK\"\n}";
            
            var example = exampleJson != null
            ? JsonConvert.DeserializeObject<GetOrdersStatsResponse>(exampleJson)
            : default(GetOrdersStatsResponse);
            //TODO: Change the data returned
            return new ObjectResult(example);
        }
    }
}
