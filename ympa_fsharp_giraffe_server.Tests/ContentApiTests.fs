namespace ympa_fsharp_giraffe_server.Tests

open System
open System.Net
open System.Net.Http
open System.IO
open Microsoft.AspNetCore.Builder
open Microsoft.AspNetCore.Hosting
open Microsoft.AspNetCore.TestHost
open Microsoft.Extensions.DependencyInjection
open FSharp.Control.Tasks.V2.ContextInsensitive
open Xunit
open System.Text
open Newtonsoft
open TestHelper
open ContentApiHandlerTestsHelper
open ympa_fsharp_giraffe_server.ContentApiHandler
open ympa_fsharp_giraffe_server.ContentApiHandlerParams
open ympa_fsharp_giraffe_server.Model.ApiClientDataErrorResponse
open ympa_fsharp_giraffe_server.Model.ApiForbiddenErrorResponse
open ympa_fsharp_giraffe_server.Model.ApiLimitErrorResponse
open ympa_fsharp_giraffe_server.Model.ApiLockedErrorResponse
open ympa_fsharp_giraffe_server.Model.ApiNotFoundErrorResponse
open ympa_fsharp_giraffe_server.Model.ApiServerErrorResponse
open ympa_fsharp_giraffe_server.Model.ApiUnauthorizedErrorResponse
open ympa_fsharp_giraffe_server.Model.GetCategoryContentParametersResponse
open ympa_fsharp_giraffe_server.Model.GetOfferCardsContentStatusRequest
open ympa_fsharp_giraffe_server.Model.GetOfferCardsContentStatusResponse
open ympa_fsharp_giraffe_server.Model.UpdateOfferContentRequest
open ympa_fsharp_giraffe_server.Model.UpdateOfferContentResponse

module ContentApiHandlerTests =

  // ---------------------------------
  // Tests
  // ---------------------------------

  [<Fact>]
  let ``GetCategoryContentParameters - Списки характеристик товаров по категориям returns 200 where Список характеристик товаров из заданной категории.`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/category/{categoryId}/parameters".Replace("categoryId", "ADDME")

      HttpPost client path
        |> isStatus (enum<HttpStatusCode>(200))
        |> readText
        |> shouldEqual "TESTME"
        |> ignore
      }

  [<Fact>]
  let ``GetCategoryContentParameters - Списки характеристик товаров по категориям returns 400 where Запрос содержит неправильные данные.`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/category/{categoryId}/parameters".Replace("categoryId", "ADDME")

      HttpPost client path
        |> isStatus (enum<HttpStatusCode>(400))
        |> readText
        |> shouldEqual "TESTME"
        |> ignore
      }

  [<Fact>]
  let ``GetCategoryContentParameters - Списки характеристик товаров по категориям returns 401 where В запросе не указаны данные для авторизации.`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/category/{categoryId}/parameters".Replace("categoryId", "ADDME")

      HttpPost client path
        |> isStatus (enum<HttpStatusCode>(401))
        |> readText
        |> shouldEqual "TESTME"
        |> ignore
      }

  [<Fact>]
  let ``GetCategoryContentParameters - Списки характеристик товаров по категориям returns 403 where Данные для авторизации неверны или доступ к ресурсу запрещен.`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/category/{categoryId}/parameters".Replace("categoryId", "ADDME")

      HttpPost client path
        |> isStatus (enum<HttpStatusCode>(403))
        |> readText
        |> shouldEqual "TESTME"
        |> ignore
      }

  [<Fact>]
  let ``GetCategoryContentParameters - Списки характеристик товаров по категориям returns 404 where Запрашиваемый ресурс не найден.`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/category/{categoryId}/parameters".Replace("categoryId", "ADDME")

      HttpPost client path
        |> isStatus (enum<HttpStatusCode>(404))
        |> readText
        |> shouldEqual "TESTME"
        |> ignore
      }

  [<Fact>]
  let ``GetCategoryContentParameters - Списки характеристик товаров по категориям returns 420 where Превышено ограничение на доступ к ресурсу.`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/category/{categoryId}/parameters".Replace("categoryId", "ADDME")

      HttpPost client path
        |> isStatus (enum<HttpStatusCode>(420))
        |> readText
        |> shouldEqual "TESTME"
        |> ignore
      }

  [<Fact>]
  let ``GetCategoryContentParameters - Списки характеристик товаров по категориям returns 500 where Внутренняя ошибка сервера.`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/category/{categoryId}/parameters".Replace("categoryId", "ADDME")

      HttpPost client path
        |> isStatus (enum<HttpStatusCode>(500))
        |> readText
        |> shouldEqual "TESTME"
        |> ignore
      }

  [<Fact>]
  let ``GetOfferCardsContentStatus - Получение информации о заполненности карточек магазина returns 200 where Информация о карточках указанных товаров.`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/businesses/{businessId}/offer-cards".Replace("businessId", "ADDME") + "?pageToken=ADDME&limit=ADDME"

      // use an example requestBody provided by the spec
      let examples = Map.empty.Add("application/json", getGetOfferCardsContentStatusExample "application/json")
      // or pass a body of type GetOfferCardsContentStatusRequest
      let body = obj() :?> GetOfferCardsContentStatusRequest |> Newtonsoft.Json.JsonConvert.SerializeObject |> Encoding.UTF8.GetBytes |> MemoryStream |> StreamContent

      body
        |> HttpPost client path
        |> isStatus (enum<HttpStatusCode>(200))
        |> readText
        |> shouldEqual "TESTME"
      }

  [<Fact>]
  let ``GetOfferCardsContentStatus - Получение информации о заполненности карточек магазина returns 400 where Запрос содержит неправильные данные.`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/businesses/{businessId}/offer-cards".Replace("businessId", "ADDME") + "?pageToken=ADDME&limit=ADDME"

      // use an example requestBody provided by the spec
      let examples = Map.empty.Add("application/json", getGetOfferCardsContentStatusExample "application/json")
      // or pass a body of type GetOfferCardsContentStatusRequest
      let body = obj() :?> GetOfferCardsContentStatusRequest |> Newtonsoft.Json.JsonConvert.SerializeObject |> Encoding.UTF8.GetBytes |> MemoryStream |> StreamContent

      body
        |> HttpPost client path
        |> isStatus (enum<HttpStatusCode>(400))
        |> readText
        |> shouldEqual "TESTME"
      }

  [<Fact>]
  let ``GetOfferCardsContentStatus - Получение информации о заполненности карточек магазина returns 401 where В запросе не указаны данные для авторизации.`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/businesses/{businessId}/offer-cards".Replace("businessId", "ADDME") + "?pageToken=ADDME&limit=ADDME"

      // use an example requestBody provided by the spec
      let examples = Map.empty.Add("application/json", getGetOfferCardsContentStatusExample "application/json")
      // or pass a body of type GetOfferCardsContentStatusRequest
      let body = obj() :?> GetOfferCardsContentStatusRequest |> Newtonsoft.Json.JsonConvert.SerializeObject |> Encoding.UTF8.GetBytes |> MemoryStream |> StreamContent

      body
        |> HttpPost client path
        |> isStatus (enum<HttpStatusCode>(401))
        |> readText
        |> shouldEqual "TESTME"
      }

  [<Fact>]
  let ``GetOfferCardsContentStatus - Получение информации о заполненности карточек магазина returns 403 where Данные для авторизации неверны или доступ к ресурсу запрещен.`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/businesses/{businessId}/offer-cards".Replace("businessId", "ADDME") + "?pageToken=ADDME&limit=ADDME"

      // use an example requestBody provided by the spec
      let examples = Map.empty.Add("application/json", getGetOfferCardsContentStatusExample "application/json")
      // or pass a body of type GetOfferCardsContentStatusRequest
      let body = obj() :?> GetOfferCardsContentStatusRequest |> Newtonsoft.Json.JsonConvert.SerializeObject |> Encoding.UTF8.GetBytes |> MemoryStream |> StreamContent

      body
        |> HttpPost client path
        |> isStatus (enum<HttpStatusCode>(403))
        |> readText
        |> shouldEqual "TESTME"
      }

  [<Fact>]
  let ``GetOfferCardsContentStatus - Получение информации о заполненности карточек магазина returns 404 where Запрашиваемый ресурс не найден.`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/businesses/{businessId}/offer-cards".Replace("businessId", "ADDME") + "?pageToken=ADDME&limit=ADDME"

      // use an example requestBody provided by the spec
      let examples = Map.empty.Add("application/json", getGetOfferCardsContentStatusExample "application/json")
      // or pass a body of type GetOfferCardsContentStatusRequest
      let body = obj() :?> GetOfferCardsContentStatusRequest |> Newtonsoft.Json.JsonConvert.SerializeObject |> Encoding.UTF8.GetBytes |> MemoryStream |> StreamContent

      body
        |> HttpPost client path
        |> isStatus (enum<HttpStatusCode>(404))
        |> readText
        |> shouldEqual "TESTME"
      }

  [<Fact>]
  let ``GetOfferCardsContentStatus - Получение информации о заполненности карточек магазина returns 420 where Превышено ограничение на доступ к ресурсу.`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/businesses/{businessId}/offer-cards".Replace("businessId", "ADDME") + "?pageToken=ADDME&limit=ADDME"

      // use an example requestBody provided by the spec
      let examples = Map.empty.Add("application/json", getGetOfferCardsContentStatusExample "application/json")
      // or pass a body of type GetOfferCardsContentStatusRequest
      let body = obj() :?> GetOfferCardsContentStatusRequest |> Newtonsoft.Json.JsonConvert.SerializeObject |> Encoding.UTF8.GetBytes |> MemoryStream |> StreamContent

      body
        |> HttpPost client path
        |> isStatus (enum<HttpStatusCode>(420))
        |> readText
        |> shouldEqual "TESTME"
      }

  [<Fact>]
  let ``GetOfferCardsContentStatus - Получение информации о заполненности карточек магазина returns 500 where Внутренняя ошибка сервера.`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/businesses/{businessId}/offer-cards".Replace("businessId", "ADDME") + "?pageToken=ADDME&limit=ADDME"

      // use an example requestBody provided by the spec
      let examples = Map.empty.Add("application/json", getGetOfferCardsContentStatusExample "application/json")
      // or pass a body of type GetOfferCardsContentStatusRequest
      let body = obj() :?> GetOfferCardsContentStatusRequest |> Newtonsoft.Json.JsonConvert.SerializeObject |> Encoding.UTF8.GetBytes |> MemoryStream |> StreamContent

      body
        |> HttpPost client path
        |> isStatus (enum<HttpStatusCode>(500))
        |> readText
        |> shouldEqual "TESTME"
      }

  [<Fact>]
  let ``UpdateOfferContent - Редактирование категорийных характеристик товара returns 200 where Запрос выполнен корректно, данные обработаны.  {% note warning \&quot;Ответ 200 сам по себе не значит, что переданные значения корректны\&quot; %}  Обязательно посмотрите детали ответа: &#x60;status&#x60; и перечень ошибок, если он есть.  Даже если ошибка допущена в характеристиках всего одного товара, никакие изменения из запроса в каталог не попадут.  {% endnote %}  Если в &#x60;status&#x60; вернулось &#x60;ERROR&#x60;, убедитесь, что:  * все обязательные характеристики заполнены; * характеристики действительно существуют в указанных категориях; * значения соответствуют характеристикам; * ваши собственные значения имеют нужный тип данных.  Найти проблемы помогут поля &#x60;errors&#x60; и &#x60;warnings&#x60;. `` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/businesses/{businessId}/offer-cards/update".Replace("businessId", "ADDME")

      // use an example requestBody provided by the spec
      let examples = Map.empty.Add("application/json", getUpdateOfferContentExample "application/json")
      // or pass a body of type UpdateOfferContentRequest
      let body = obj() :?> UpdateOfferContentRequest |> Newtonsoft.Json.JsonConvert.SerializeObject |> Encoding.UTF8.GetBytes |> MemoryStream |> StreamContent

      body
        |> HttpPost client path
        |> isStatus (enum<HttpStatusCode>(200))
        |> readText
        |> shouldEqual "TESTME"
      }

  [<Fact>]
  let ``UpdateOfferContent - Редактирование категорийных характеристик товара returns 400 where Запрос содержит неправильные данные.`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/businesses/{businessId}/offer-cards/update".Replace("businessId", "ADDME")

      // use an example requestBody provided by the spec
      let examples = Map.empty.Add("application/json", getUpdateOfferContentExample "application/json")
      // or pass a body of type UpdateOfferContentRequest
      let body = obj() :?> UpdateOfferContentRequest |> Newtonsoft.Json.JsonConvert.SerializeObject |> Encoding.UTF8.GetBytes |> MemoryStream |> StreamContent

      body
        |> HttpPost client path
        |> isStatus (enum<HttpStatusCode>(400))
        |> readText
        |> shouldEqual "TESTME"
      }

  [<Fact>]
  let ``UpdateOfferContent - Редактирование категорийных характеристик товара returns 401 where В запросе не указаны данные для авторизации.`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/businesses/{businessId}/offer-cards/update".Replace("businessId", "ADDME")

      // use an example requestBody provided by the spec
      let examples = Map.empty.Add("application/json", getUpdateOfferContentExample "application/json")
      // or pass a body of type UpdateOfferContentRequest
      let body = obj() :?> UpdateOfferContentRequest |> Newtonsoft.Json.JsonConvert.SerializeObject |> Encoding.UTF8.GetBytes |> MemoryStream |> StreamContent

      body
        |> HttpPost client path
        |> isStatus (enum<HttpStatusCode>(401))
        |> readText
        |> shouldEqual "TESTME"
      }

  [<Fact>]
  let ``UpdateOfferContent - Редактирование категорийных характеристик товара returns 403 where Данные для авторизации неверны или доступ к ресурсу запрещен.`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/businesses/{businessId}/offer-cards/update".Replace("businessId", "ADDME")

      // use an example requestBody provided by the spec
      let examples = Map.empty.Add("application/json", getUpdateOfferContentExample "application/json")
      // or pass a body of type UpdateOfferContentRequest
      let body = obj() :?> UpdateOfferContentRequest |> Newtonsoft.Json.JsonConvert.SerializeObject |> Encoding.UTF8.GetBytes |> MemoryStream |> StreamContent

      body
        |> HttpPost client path
        |> isStatus (enum<HttpStatusCode>(403))
        |> readText
        |> shouldEqual "TESTME"
      }

  [<Fact>]
  let ``UpdateOfferContent - Редактирование категорийных характеристик товара returns 404 where Запрашиваемый ресурс не найден.`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/businesses/{businessId}/offer-cards/update".Replace("businessId", "ADDME")

      // use an example requestBody provided by the spec
      let examples = Map.empty.Add("application/json", getUpdateOfferContentExample "application/json")
      // or pass a body of type UpdateOfferContentRequest
      let body = obj() :?> UpdateOfferContentRequest |> Newtonsoft.Json.JsonConvert.SerializeObject |> Encoding.UTF8.GetBytes |> MemoryStream |> StreamContent

      body
        |> HttpPost client path
        |> isStatus (enum<HttpStatusCode>(404))
        |> readText
        |> shouldEqual "TESTME"
      }

  [<Fact>]
  let ``UpdateOfferContent - Редактирование категорийных характеристик товара returns 420 where Превышено ограничение на доступ к ресурсу.`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/businesses/{businessId}/offer-cards/update".Replace("businessId", "ADDME")

      // use an example requestBody provided by the spec
      let examples = Map.empty.Add("application/json", getUpdateOfferContentExample "application/json")
      // or pass a body of type UpdateOfferContentRequest
      let body = obj() :?> UpdateOfferContentRequest |> Newtonsoft.Json.JsonConvert.SerializeObject |> Encoding.UTF8.GetBytes |> MemoryStream |> StreamContent

      body
        |> HttpPost client path
        |> isStatus (enum<HttpStatusCode>(420))
        |> readText
        |> shouldEqual "TESTME"
      }

  [<Fact>]
  let ``UpdateOfferContent - Редактирование категорийных характеристик товара returns 423 where К ресурсу нельзя применить указанный метод.`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/businesses/{businessId}/offer-cards/update".Replace("businessId", "ADDME")

      // use an example requestBody provided by the spec
      let examples = Map.empty.Add("application/json", getUpdateOfferContentExample "application/json")
      // or pass a body of type UpdateOfferContentRequest
      let body = obj() :?> UpdateOfferContentRequest |> Newtonsoft.Json.JsonConvert.SerializeObject |> Encoding.UTF8.GetBytes |> MemoryStream |> StreamContent

      body
        |> HttpPost client path
        |> isStatus (enum<HttpStatusCode>(423))
        |> readText
        |> shouldEqual "TESTME"
      }

  [<Fact>]
  let ``UpdateOfferContent - Редактирование категорийных характеристик товара returns 500 where Внутренняя ошибка сервера.`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/businesses/{businessId}/offer-cards/update".Replace("businessId", "ADDME")

      // use an example requestBody provided by the spec
      let examples = Map.empty.Add("application/json", getUpdateOfferContentExample "application/json")
      // or pass a body of type UpdateOfferContentRequest
      let body = obj() :?> UpdateOfferContentRequest |> Newtonsoft.Json.JsonConvert.SerializeObject |> Encoding.UTF8.GetBytes |> MemoryStream |> StreamContent

      body
        |> HttpPost client path
        |> isStatus (enum<HttpStatusCode>(500))
        |> readText
        |> shouldEqual "TESTME"
      }

