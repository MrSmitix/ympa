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
    public class GoodsStatsApiController : ControllerBase
    { 
        /// <summary>
        /// Отчет по товарам
        /// </summary>
        /// <remarks>Возвращает подробный отчет по товарам, которые вы разместили на Маркете. С помощью отчета вы можете узнать, например, об остатках на складе, об условиях хранения ваших товаров и т. д.  |**⚙️ Лимит:** 5000 товаров в минуту| |-| </remarks>
        /// <param name="campaignId">Идентификатор кампании в API и магазина в кабинете. Каждая кампания в API соответствует магазину в кабинете.  Чтобы узнать идентификаторы своих магазинов, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html) </param>
        /// <param name="getGoodsStatsRequest"></param>
        /// <response code="200">Отчет по товарам.</response>
        /// <response code="400">Запрос содержит неправильные данные.</response>
        /// <response code="401">В запросе не указаны данные для авторизации.</response>
        /// <response code="403">Данные для авторизации неверны или доступ к ресурсу запрещен.</response>
        /// <response code="404">Запрашиваемый ресурс не найден.</response>
        /// <response code="420">Превышено ограничение на доступ к ресурсу.</response>
        /// <response code="500">Внутренняя ошибка сервера.</response>
        [HttpPost]
        [Route("/campaigns/{campaignId}/stats/skus")]
        [Consumes("application/json")]
        [ValidateModelState]
        [SwaggerOperation("GetGoodsStats")]
        [SwaggerResponse(statusCode: 200, type: typeof(GetGoodsStatsResponse), description: "Отчет по товарам.")]
        [SwaggerResponse(statusCode: 400, type: typeof(ApiClientDataErrorResponse), description: "Запрос содержит неправильные данные.")]
        [SwaggerResponse(statusCode: 401, type: typeof(ApiUnauthorizedErrorResponse), description: "В запросе не указаны данные для авторизации.")]
        [SwaggerResponse(statusCode: 403, type: typeof(ApiForbiddenErrorResponse), description: "Данные для авторизации неверны или доступ к ресурсу запрещен.")]
        [SwaggerResponse(statusCode: 404, type: typeof(ApiNotFoundErrorResponse), description: "Запрашиваемый ресурс не найден.")]
        [SwaggerResponse(statusCode: 420, type: typeof(ApiLimitErrorResponse), description: "Превышено ограничение на доступ к ресурсу.")]
        [SwaggerResponse(statusCode: 500, type: typeof(ApiServerErrorResponse), description: "Внутренняя ошибка сервера.")]
        public virtual IActionResult GetGoodsStats([FromRoute (Name = "campaignId")][Required]long campaignId, [FromBody]GetGoodsStatsRequest getGoodsStatsRequest)
        {

            //TODO: Uncomment the next line to return response 200 or use other options such as return this.NotFound(), return this.BadRequest(..), ...
            // return StatusCode(200, default(GetGoodsStatsResponse));
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
            exampleJson = "{\n  \"result\" : {\n    \"shopSkus\" : [ {\n      \"shopSku\" : \"shopSku\",\n      \"marketSku\" : 0,\n      \"price\" : 6.027456183070403,\n      \"name\" : \"name\",\n      \"warehouses\" : [ {\n        \"name\" : \"name\",\n        \"id\" : 9,\n        \"stocks\" : [ {\n          \"count\" : 1,\n          \"type\" : \"FIT\"\n        }, {\n          \"count\" : 1,\n          \"type\" : \"FIT\"\n        } ]\n      }, {\n        \"name\" : \"name\",\n        \"id\" : 9,\n        \"stocks\" : [ {\n          \"count\" : 1,\n          \"type\" : \"FIT\"\n        }, {\n          \"count\" : 1,\n          \"type\" : \"FIT\"\n        } ]\n      } ],\n      \"weightDimensions\" : {\n        \"length\" : 5.962133916683182,\n        \"width\" : 5.637376656633329,\n        \"weight\" : 7.061401241503109,\n        \"height\" : 2.3021358869347655\n      },\n      \"categoryName\" : \"categoryName\",\n      \"categoryId\" : 1,\n      \"pictures\" : [ \"pictures\", \"pictures\" ],\n      \"tariffs\" : [ {\n        \"amount\" : 2.027123023002322,\n        \"type\" : \"AGENCY_COMMISSION\",\n        \"percent\" : 3.616076749251911,\n        \"parameters\" : [ {\n          \"name\" : \"name\",\n          \"value\" : \"value\"\n        }, {\n          \"name\" : \"name\",\n          \"value\" : \"value\"\n        } ]\n      }, {\n        \"amount\" : 2.027123023002322,\n        \"type\" : \"AGENCY_COMMISSION\",\n        \"percent\" : 3.616076749251911,\n        \"parameters\" : [ {\n          \"name\" : \"name\",\n          \"value\" : \"value\"\n        }, {\n          \"name\" : \"name\",\n          \"value\" : \"value\"\n        } ]\n      } ]\n    }, {\n      \"shopSku\" : \"shopSku\",\n      \"marketSku\" : 0,\n      \"price\" : 6.027456183070403,\n      \"name\" : \"name\",\n      \"warehouses\" : [ {\n        \"name\" : \"name\",\n        \"id\" : 9,\n        \"stocks\" : [ {\n          \"count\" : 1,\n          \"type\" : \"FIT\"\n        }, {\n          \"count\" : 1,\n          \"type\" : \"FIT\"\n        } ]\n      }, {\n        \"name\" : \"name\",\n        \"id\" : 9,\n        \"stocks\" : [ {\n          \"count\" : 1,\n          \"type\" : \"FIT\"\n        }, {\n          \"count\" : 1,\n          \"type\" : \"FIT\"\n        } ]\n      } ],\n      \"weightDimensions\" : {\n        \"length\" : 5.962133916683182,\n        \"width\" : 5.637376656633329,\n        \"weight\" : 7.061401241503109,\n        \"height\" : 2.3021358869347655\n      },\n      \"categoryName\" : \"categoryName\",\n      \"categoryId\" : 1,\n      \"pictures\" : [ \"pictures\", \"pictures\" ],\n      \"tariffs\" : [ {\n        \"amount\" : 2.027123023002322,\n        \"type\" : \"AGENCY_COMMISSION\",\n        \"percent\" : 3.616076749251911,\n        \"parameters\" : [ {\n          \"name\" : \"name\",\n          \"value\" : \"value\"\n        }, {\n          \"name\" : \"name\",\n          \"value\" : \"value\"\n        } ]\n      }, {\n        \"amount\" : 2.027123023002322,\n        \"type\" : \"AGENCY_COMMISSION\",\n        \"percent\" : 3.616076749251911,\n        \"parameters\" : [ {\n          \"name\" : \"name\",\n          \"value\" : \"value\"\n        }, {\n          \"name\" : \"name\",\n          \"value\" : \"value\"\n        } ]\n      } ]\n    } ]\n  },\n  \"status\" : \"OK\"\n}";
            exampleJson = "{\n  \"errors\" : [ {\n    \"code\" : \"code\",\n    \"message\" : \"message\"\n  }, {\n    \"code\" : \"code\",\n    \"message\" : \"message\"\n  } ],\n  \"status\" : \"OK\"\n}";
            exampleJson = "{\n  \"errors\" : [ {\n    \"code\" : \"code\",\n    \"message\" : \"message\"\n  }, {\n    \"code\" : \"code\",\n    \"message\" : \"message\"\n  } ],\n  \"status\" : \"OK\"\n}";
            exampleJson = "{\n  \"errors\" : [ {\n    \"code\" : \"code\",\n    \"message\" : \"message\"\n  }, {\n    \"code\" : \"code\",\n    \"message\" : \"message\"\n  } ],\n  \"status\" : \"OK\"\n}";
            exampleJson = "{\n  \"errors\" : [ {\n    \"code\" : \"code\",\n    \"message\" : \"message\"\n  }, {\n    \"code\" : \"code\",\n    \"message\" : \"message\"\n  } ],\n  \"status\" : \"OK\"\n}";
            exampleJson = "{\n  \"errors\" : [ {\n    \"code\" : \"code\",\n    \"message\" : \"message\"\n  }, {\n    \"code\" : \"code\",\n    \"message\" : \"message\"\n  } ],\n  \"status\" : \"OK\"\n}";
            exampleJson = "{\n  \"errors\" : [ {\n    \"code\" : \"code\",\n    \"message\" : \"message\"\n  }, {\n    \"code\" : \"code\",\n    \"message\" : \"message\"\n  } ],\n  \"status\" : \"OK\"\n}";
            
            var example = exampleJson != null
            ? JsonConvert.DeserializeObject<GetGoodsStatsResponse>(exampleJson)
            : default(GetGoodsStatsResponse);
            //TODO: Change the data returned
            return new ObjectResult(example);
        }
    }
}
