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
open OffersApiHandlerTestsHelper
open ympa_fsharp_giraffe_server.OffersApiHandler
open ympa_fsharp_giraffe_server.OffersApiHandlerParams
open ympa_fsharp_giraffe_server.Model.ApiClientDataErrorResponse
open ympa_fsharp_giraffe_server.Model.ApiForbiddenErrorResponse
open ympa_fsharp_giraffe_server.Model.ApiLimitErrorResponse
open ympa_fsharp_giraffe_server.Model.ApiLockedErrorResponse
open ympa_fsharp_giraffe_server.Model.ApiNotFoundErrorResponse
open ympa_fsharp_giraffe_server.Model.ApiServerErrorResponse
open ympa_fsharp_giraffe_server.Model.ApiUnauthorizedErrorResponse
open ympa_fsharp_giraffe_server.Model.CurrencyType
open ympa_fsharp_giraffe_server.Model.DeleteCampaignOffersRequest
open ympa_fsharp_giraffe_server.Model.DeleteCampaignOffersResponse
open ympa_fsharp_giraffe_server.Model.EmptyApiResponse
open ympa_fsharp_giraffe_server.Model.GetAllOffersResponse
open ympa_fsharp_giraffe_server.Model.GetCampaignOffersRequest
open ympa_fsharp_giraffe_server.Model.GetCampaignOffersResponse
open ympa_fsharp_giraffe_server.Model.GetOfferRecommendationsRequest
open ympa_fsharp_giraffe_server.Model.GetOfferRecommendationsResponse
open ympa_fsharp_giraffe_server.Model.GetOffersResponse
open ympa_fsharp_giraffe_server.Model.UpdateCampaignOffersRequest

module OffersApiHandlerTests =

  // ---------------------------------
  // Tests
  // ---------------------------------

  [<Fact>]
  let ``DeleteCampaignOffers - Удаление товаров из ассортимента магазина returns 200 where Если удалось удалить не все товары, с ответом 200 вернется список тех, что были в запросе, но остались в магазине.`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/campaigns/{campaignId}/offers/delete".Replace("campaignId", "ADDME")

      // use an example requestBody provided by the spec
      let examples = Map.empty.Add("application/json", getDeleteCampaignOffersExample "application/json")
      // or pass a body of type DeleteCampaignOffersRequest
      let body = obj() :?> DeleteCampaignOffersRequest |> Newtonsoft.Json.JsonConvert.SerializeObject |> Encoding.UTF8.GetBytes |> MemoryStream |> StreamContent

      body
        |> HttpPost client path
        |> isStatus (enum<HttpStatusCode>(200))
        |> readText
        |> shouldEqual "TESTME"
      }

  [<Fact>]
  let ``DeleteCampaignOffers - Удаление товаров из ассортимента магазина returns 400 where Запрос содержит неправильные данные.`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/campaigns/{campaignId}/offers/delete".Replace("campaignId", "ADDME")

      // use an example requestBody provided by the spec
      let examples = Map.empty.Add("application/json", getDeleteCampaignOffersExample "application/json")
      // or pass a body of type DeleteCampaignOffersRequest
      let body = obj() :?> DeleteCampaignOffersRequest |> Newtonsoft.Json.JsonConvert.SerializeObject |> Encoding.UTF8.GetBytes |> MemoryStream |> StreamContent

      body
        |> HttpPost client path
        |> isStatus (enum<HttpStatusCode>(400))
        |> readText
        |> shouldEqual "TESTME"
      }

  [<Fact>]
  let ``DeleteCampaignOffers - Удаление товаров из ассортимента магазина returns 401 where В запросе не указаны данные для авторизации.`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/campaigns/{campaignId}/offers/delete".Replace("campaignId", "ADDME")

      // use an example requestBody provided by the spec
      let examples = Map.empty.Add("application/json", getDeleteCampaignOffersExample "application/json")
      // or pass a body of type DeleteCampaignOffersRequest
      let body = obj() :?> DeleteCampaignOffersRequest |> Newtonsoft.Json.JsonConvert.SerializeObject |> Encoding.UTF8.GetBytes |> MemoryStream |> StreamContent

      body
        |> HttpPost client path
        |> isStatus (enum<HttpStatusCode>(401))
        |> readText
        |> shouldEqual "TESTME"
      }

  [<Fact>]
  let ``DeleteCampaignOffers - Удаление товаров из ассортимента магазина returns 403 where Данные для авторизации неверны или доступ к ресурсу запрещен.`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/campaigns/{campaignId}/offers/delete".Replace("campaignId", "ADDME")

      // use an example requestBody provided by the spec
      let examples = Map.empty.Add("application/json", getDeleteCampaignOffersExample "application/json")
      // or pass a body of type DeleteCampaignOffersRequest
      let body = obj() :?> DeleteCampaignOffersRequest |> Newtonsoft.Json.JsonConvert.SerializeObject |> Encoding.UTF8.GetBytes |> MemoryStream |> StreamContent

      body
        |> HttpPost client path
        |> isStatus (enum<HttpStatusCode>(403))
        |> readText
        |> shouldEqual "TESTME"
      }

  [<Fact>]
  let ``DeleteCampaignOffers - Удаление товаров из ассортимента магазина returns 404 where Запрашиваемый ресурс не найден.`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/campaigns/{campaignId}/offers/delete".Replace("campaignId", "ADDME")

      // use an example requestBody provided by the spec
      let examples = Map.empty.Add("application/json", getDeleteCampaignOffersExample "application/json")
      // or pass a body of type DeleteCampaignOffersRequest
      let body = obj() :?> DeleteCampaignOffersRequest |> Newtonsoft.Json.JsonConvert.SerializeObject |> Encoding.UTF8.GetBytes |> MemoryStream |> StreamContent

      body
        |> HttpPost client path
        |> isStatus (enum<HttpStatusCode>(404))
        |> readText
        |> shouldEqual "TESTME"
      }

  [<Fact>]
  let ``DeleteCampaignOffers - Удаление товаров из ассортимента магазина returns 420 where Превышено ограничение на доступ к ресурсу.`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/campaigns/{campaignId}/offers/delete".Replace("campaignId", "ADDME")

      // use an example requestBody provided by the spec
      let examples = Map.empty.Add("application/json", getDeleteCampaignOffersExample "application/json")
      // or pass a body of type DeleteCampaignOffersRequest
      let body = obj() :?> DeleteCampaignOffersRequest |> Newtonsoft.Json.JsonConvert.SerializeObject |> Encoding.UTF8.GetBytes |> MemoryStream |> StreamContent

      body
        |> HttpPost client path
        |> isStatus (enum<HttpStatusCode>(420))
        |> readText
        |> shouldEqual "TESTME"
      }

  [<Fact>]
  let ``DeleteCampaignOffers - Удаление товаров из ассортимента магазина returns 423 where К ресурсу нельзя применить указанный метод.`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/campaigns/{campaignId}/offers/delete".Replace("campaignId", "ADDME")

      // use an example requestBody provided by the spec
      let examples = Map.empty.Add("application/json", getDeleteCampaignOffersExample "application/json")
      // or pass a body of type DeleteCampaignOffersRequest
      let body = obj() :?> DeleteCampaignOffersRequest |> Newtonsoft.Json.JsonConvert.SerializeObject |> Encoding.UTF8.GetBytes |> MemoryStream |> StreamContent

      body
        |> HttpPost client path
        |> isStatus (enum<HttpStatusCode>(423))
        |> readText
        |> shouldEqual "TESTME"
      }

  [<Fact>]
  let ``DeleteCampaignOffers - Удаление товаров из ассортимента магазина returns 500 where Внутренняя ошибка сервера.`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/campaigns/{campaignId}/offers/delete".Replace("campaignId", "ADDME")

      // use an example requestBody provided by the spec
      let examples = Map.empty.Add("application/json", getDeleteCampaignOffersExample "application/json")
      // or pass a body of type DeleteCampaignOffersRequest
      let body = obj() :?> DeleteCampaignOffersRequest |> Newtonsoft.Json.JsonConvert.SerializeObject |> Encoding.UTF8.GetBytes |> MemoryStream |> StreamContent

      body
        |> HttpPost client path
        |> isStatus (enum<HttpStatusCode>(500))
        |> readText
        |> shouldEqual "TESTME"
      }

  [<Fact>]
  let ``GetAllOffers - Все предложения магазина returns 200 where Предложения магазина.`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/campaigns/{campaignId}/offers/all".Replace("campaignId", "ADDME") + "?feedId=ADDME&chunk=ADDME"

      HttpGet client path
        |> isStatus (enum<HttpStatusCode>(200))
        |> readText
        |> shouldEqual "TESTME"
        |> ignore
      }

  [<Fact>]
  let ``GetAllOffers - Все предложения магазина returns 400 where Запрос содержит неправильные данные.`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/campaigns/{campaignId}/offers/all".Replace("campaignId", "ADDME") + "?feedId=ADDME&chunk=ADDME"

      HttpGet client path
        |> isStatus (enum<HttpStatusCode>(400))
        |> readText
        |> shouldEqual "TESTME"
        |> ignore
      }

  [<Fact>]
  let ``GetAllOffers - Все предложения магазина returns 401 where В запросе не указаны данные для авторизации.`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/campaigns/{campaignId}/offers/all".Replace("campaignId", "ADDME") + "?feedId=ADDME&chunk=ADDME"

      HttpGet client path
        |> isStatus (enum<HttpStatusCode>(401))
        |> readText
        |> shouldEqual "TESTME"
        |> ignore
      }

  [<Fact>]
  let ``GetAllOffers - Все предложения магазина returns 403 where Данные для авторизации неверны или доступ к ресурсу запрещен.`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/campaigns/{campaignId}/offers/all".Replace("campaignId", "ADDME") + "?feedId=ADDME&chunk=ADDME"

      HttpGet client path
        |> isStatus (enum<HttpStatusCode>(403))
        |> readText
        |> shouldEqual "TESTME"
        |> ignore
      }

  [<Fact>]
  let ``GetAllOffers - Все предложения магазина returns 404 where Запрашиваемый ресурс не найден.`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/campaigns/{campaignId}/offers/all".Replace("campaignId", "ADDME") + "?feedId=ADDME&chunk=ADDME"

      HttpGet client path
        |> isStatus (enum<HttpStatusCode>(404))
        |> readText
        |> shouldEqual "TESTME"
        |> ignore
      }

  [<Fact>]
  let ``GetAllOffers - Все предложения магазина returns 420 where Превышено ограничение на доступ к ресурсу.`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/campaigns/{campaignId}/offers/all".Replace("campaignId", "ADDME") + "?feedId=ADDME&chunk=ADDME"

      HttpGet client path
        |> isStatus (enum<HttpStatusCode>(420))
        |> readText
        |> shouldEqual "TESTME"
        |> ignore
      }

  [<Fact>]
  let ``GetAllOffers - Все предложения магазина returns 500 where Внутренняя ошибка сервера.`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/campaigns/{campaignId}/offers/all".Replace("campaignId", "ADDME") + "?feedId=ADDME&chunk=ADDME"

      HttpGet client path
        |> isStatus (enum<HttpStatusCode>(500))
        |> readText
        |> shouldEqual "TESTME"
        |> ignore
      }

  [<Fact>]
  let ``GetCampaignOffers - Информация о товарах, которые размещены в заданном магазине returns 200 where Список товаров, размещенных в заданном магазине.`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/campaigns/{campaignId}/offers".Replace("campaignId", "ADDME") + "?pageToken=ADDME&limit=ADDME"

      // use an example requestBody provided by the spec
      let examples = Map.empty.Add("application/json", getGetCampaignOffersExample "application/json")
      // or pass a body of type GetCampaignOffersRequest
      let body = obj() :?> GetCampaignOffersRequest |> Newtonsoft.Json.JsonConvert.SerializeObject |> Encoding.UTF8.GetBytes |> MemoryStream |> StreamContent

      body
        |> HttpPost client path
        |> isStatus (enum<HttpStatusCode>(200))
        |> readText
        |> shouldEqual "TESTME"
      }

  [<Fact>]
  let ``GetCampaignOffers - Информация о товарах, которые размещены в заданном магазине returns 400 where Запрос содержит неправильные данные.`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/campaigns/{campaignId}/offers".Replace("campaignId", "ADDME") + "?pageToken=ADDME&limit=ADDME"

      // use an example requestBody provided by the spec
      let examples = Map.empty.Add("application/json", getGetCampaignOffersExample "application/json")
      // or pass a body of type GetCampaignOffersRequest
      let body = obj() :?> GetCampaignOffersRequest |> Newtonsoft.Json.JsonConvert.SerializeObject |> Encoding.UTF8.GetBytes |> MemoryStream |> StreamContent

      body
        |> HttpPost client path
        |> isStatus (enum<HttpStatusCode>(400))
        |> readText
        |> shouldEqual "TESTME"
      }

  [<Fact>]
  let ``GetCampaignOffers - Информация о товарах, которые размещены в заданном магазине returns 401 where В запросе не указаны данные для авторизации.`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/campaigns/{campaignId}/offers".Replace("campaignId", "ADDME") + "?pageToken=ADDME&limit=ADDME"

      // use an example requestBody provided by the spec
      let examples = Map.empty.Add("application/json", getGetCampaignOffersExample "application/json")
      // or pass a body of type GetCampaignOffersRequest
      let body = obj() :?> GetCampaignOffersRequest |> Newtonsoft.Json.JsonConvert.SerializeObject |> Encoding.UTF8.GetBytes |> MemoryStream |> StreamContent

      body
        |> HttpPost client path
        |> isStatus (enum<HttpStatusCode>(401))
        |> readText
        |> shouldEqual "TESTME"
      }

  [<Fact>]
  let ``GetCampaignOffers - Информация о товарах, которые размещены в заданном магазине returns 403 where Данные для авторизации неверны или доступ к ресурсу запрещен.`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/campaigns/{campaignId}/offers".Replace("campaignId", "ADDME") + "?pageToken=ADDME&limit=ADDME"

      // use an example requestBody provided by the spec
      let examples = Map.empty.Add("application/json", getGetCampaignOffersExample "application/json")
      // or pass a body of type GetCampaignOffersRequest
      let body = obj() :?> GetCampaignOffersRequest |> Newtonsoft.Json.JsonConvert.SerializeObject |> Encoding.UTF8.GetBytes |> MemoryStream |> StreamContent

      body
        |> HttpPost client path
        |> isStatus (enum<HttpStatusCode>(403))
        |> readText
        |> shouldEqual "TESTME"
      }

  [<Fact>]
  let ``GetCampaignOffers - Информация о товарах, которые размещены в заданном магазине returns 404 where Запрашиваемый ресурс не найден.`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/campaigns/{campaignId}/offers".Replace("campaignId", "ADDME") + "?pageToken=ADDME&limit=ADDME"

      // use an example requestBody provided by the spec
      let examples = Map.empty.Add("application/json", getGetCampaignOffersExample "application/json")
      // or pass a body of type GetCampaignOffersRequest
      let body = obj() :?> GetCampaignOffersRequest |> Newtonsoft.Json.JsonConvert.SerializeObject |> Encoding.UTF8.GetBytes |> MemoryStream |> StreamContent

      body
        |> HttpPost client path
        |> isStatus (enum<HttpStatusCode>(404))
        |> readText
        |> shouldEqual "TESTME"
      }

  [<Fact>]
  let ``GetCampaignOffers - Информация о товарах, которые размещены в заданном магазине returns 420 where Превышено ограничение на доступ к ресурсу.`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/campaigns/{campaignId}/offers".Replace("campaignId", "ADDME") + "?pageToken=ADDME&limit=ADDME"

      // use an example requestBody provided by the spec
      let examples = Map.empty.Add("application/json", getGetCampaignOffersExample "application/json")
      // or pass a body of type GetCampaignOffersRequest
      let body = obj() :?> GetCampaignOffersRequest |> Newtonsoft.Json.JsonConvert.SerializeObject |> Encoding.UTF8.GetBytes |> MemoryStream |> StreamContent

      body
        |> HttpPost client path
        |> isStatus (enum<HttpStatusCode>(420))
        |> readText
        |> shouldEqual "TESTME"
      }

  [<Fact>]
  let ``GetCampaignOffers - Информация о товарах, которые размещены в заданном магазине returns 500 where Внутренняя ошибка сервера.`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/campaigns/{campaignId}/offers".Replace("campaignId", "ADDME") + "?pageToken=ADDME&limit=ADDME"

      // use an example requestBody provided by the spec
      let examples = Map.empty.Add("application/json", getGetCampaignOffersExample "application/json")
      // or pass a body of type GetCampaignOffersRequest
      let body = obj() :?> GetCampaignOffersRequest |> Newtonsoft.Json.JsonConvert.SerializeObject |> Encoding.UTF8.GetBytes |> MemoryStream |> StreamContent

      body
        |> HttpPost client path
        |> isStatus (enum<HttpStatusCode>(500))
        |> readText
        |> shouldEqual "TESTME"
      }

  [<Fact>]
  let ``GetOfferRecommendations - Рекомендации Маркета, касающиеся цен returns 200 where Список товаров с рекомендациями.`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/businesses/{businessId}/offers/recommendations".Replace("businessId", "ADDME") + "?pageToken=ADDME&limit=ADDME"

      // use an example requestBody provided by the spec
      let examples = Map.empty.Add("application/json", getGetOfferRecommendationsExample "application/json")
      // or pass a body of type GetOfferRecommendationsRequest
      let body = obj() :?> GetOfferRecommendationsRequest |> Newtonsoft.Json.JsonConvert.SerializeObject |> Encoding.UTF8.GetBytes |> MemoryStream |> StreamContent

      body
        |> HttpPost client path
        |> isStatus (enum<HttpStatusCode>(200))
        |> readText
        |> shouldEqual "TESTME"
      }

  [<Fact>]
  let ``GetOfferRecommendations - Рекомендации Маркета, касающиеся цен returns 400 where Запрос содержит неправильные данные.`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/businesses/{businessId}/offers/recommendations".Replace("businessId", "ADDME") + "?pageToken=ADDME&limit=ADDME"

      // use an example requestBody provided by the spec
      let examples = Map.empty.Add("application/json", getGetOfferRecommendationsExample "application/json")
      // or pass a body of type GetOfferRecommendationsRequest
      let body = obj() :?> GetOfferRecommendationsRequest |> Newtonsoft.Json.JsonConvert.SerializeObject |> Encoding.UTF8.GetBytes |> MemoryStream |> StreamContent

      body
        |> HttpPost client path
        |> isStatus (enum<HttpStatusCode>(400))
        |> readText
        |> shouldEqual "TESTME"
      }

  [<Fact>]
  let ``GetOfferRecommendations - Рекомендации Маркета, касающиеся цен returns 401 where В запросе не указаны данные для авторизации.`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/businesses/{businessId}/offers/recommendations".Replace("businessId", "ADDME") + "?pageToken=ADDME&limit=ADDME"

      // use an example requestBody provided by the spec
      let examples = Map.empty.Add("application/json", getGetOfferRecommendationsExample "application/json")
      // or pass a body of type GetOfferRecommendationsRequest
      let body = obj() :?> GetOfferRecommendationsRequest |> Newtonsoft.Json.JsonConvert.SerializeObject |> Encoding.UTF8.GetBytes |> MemoryStream |> StreamContent

      body
        |> HttpPost client path
        |> isStatus (enum<HttpStatusCode>(401))
        |> readText
        |> shouldEqual "TESTME"
      }

  [<Fact>]
  let ``GetOfferRecommendations - Рекомендации Маркета, касающиеся цен returns 403 where Данные для авторизации неверны или доступ к ресурсу запрещен.`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/businesses/{businessId}/offers/recommendations".Replace("businessId", "ADDME") + "?pageToken=ADDME&limit=ADDME"

      // use an example requestBody provided by the spec
      let examples = Map.empty.Add("application/json", getGetOfferRecommendationsExample "application/json")
      // or pass a body of type GetOfferRecommendationsRequest
      let body = obj() :?> GetOfferRecommendationsRequest |> Newtonsoft.Json.JsonConvert.SerializeObject |> Encoding.UTF8.GetBytes |> MemoryStream |> StreamContent

      body
        |> HttpPost client path
        |> isStatus (enum<HttpStatusCode>(403))
        |> readText
        |> shouldEqual "TESTME"
      }

  [<Fact>]
  let ``GetOfferRecommendations - Рекомендации Маркета, касающиеся цен returns 404 where Запрашиваемый ресурс не найден.`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/businesses/{businessId}/offers/recommendations".Replace("businessId", "ADDME") + "?pageToken=ADDME&limit=ADDME"

      // use an example requestBody provided by the spec
      let examples = Map.empty.Add("application/json", getGetOfferRecommendationsExample "application/json")
      // or pass a body of type GetOfferRecommendationsRequest
      let body = obj() :?> GetOfferRecommendationsRequest |> Newtonsoft.Json.JsonConvert.SerializeObject |> Encoding.UTF8.GetBytes |> MemoryStream |> StreamContent

      body
        |> HttpPost client path
        |> isStatus (enum<HttpStatusCode>(404))
        |> readText
        |> shouldEqual "TESTME"
      }

  [<Fact>]
  let ``GetOfferRecommendations - Рекомендации Маркета, касающиеся цен returns 420 where Превышено ограничение на доступ к ресурсу.`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/businesses/{businessId}/offers/recommendations".Replace("businessId", "ADDME") + "?pageToken=ADDME&limit=ADDME"

      // use an example requestBody provided by the spec
      let examples = Map.empty.Add("application/json", getGetOfferRecommendationsExample "application/json")
      // or pass a body of type GetOfferRecommendationsRequest
      let body = obj() :?> GetOfferRecommendationsRequest |> Newtonsoft.Json.JsonConvert.SerializeObject |> Encoding.UTF8.GetBytes |> MemoryStream |> StreamContent

      body
        |> HttpPost client path
        |> isStatus (enum<HttpStatusCode>(420))
        |> readText
        |> shouldEqual "TESTME"
      }

  [<Fact>]
  let ``GetOfferRecommendations - Рекомендации Маркета, касающиеся цен returns 500 where Внутренняя ошибка сервера.`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/businesses/{businessId}/offers/recommendations".Replace("businessId", "ADDME") + "?pageToken=ADDME&limit=ADDME"

      // use an example requestBody provided by the spec
      let examples = Map.empty.Add("application/json", getGetOfferRecommendationsExample "application/json")
      // or pass a body of type GetOfferRecommendationsRequest
      let body = obj() :?> GetOfferRecommendationsRequest |> Newtonsoft.Json.JsonConvert.SerializeObject |> Encoding.UTF8.GetBytes |> MemoryStream |> StreamContent

      body
        |> HttpPost client path
        |> isStatus (enum<HttpStatusCode>(500))
        |> readText
        |> shouldEqual "TESTME"
      }

  [<Fact>]
  let ``GetOffers - Предложения магазина returns 200 where Предложения магазина.`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/campaigns/{campaignId}/offers".Replace("campaignId", "ADDME") + "?query=ADDME&feedId=ADDME&shopCategoryId=ADDME&currency=ADDME&matched=ADDME&page=ADDME&pageSize=ADDME"

      HttpGet client path
        |> isStatus (enum<HttpStatusCode>(200))
        |> readText
        |> shouldEqual "TESTME"
        |> ignore
      }

  [<Fact>]
  let ``GetOffers - Предложения магазина returns 400 where Запрос содержит неправильные данные.`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/campaigns/{campaignId}/offers".Replace("campaignId", "ADDME") + "?query=ADDME&feedId=ADDME&shopCategoryId=ADDME&currency=ADDME&matched=ADDME&page=ADDME&pageSize=ADDME"

      HttpGet client path
        |> isStatus (enum<HttpStatusCode>(400))
        |> readText
        |> shouldEqual "TESTME"
        |> ignore
      }

  [<Fact>]
  let ``GetOffers - Предложения магазина returns 401 where В запросе не указаны данные для авторизации.`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/campaigns/{campaignId}/offers".Replace("campaignId", "ADDME") + "?query=ADDME&feedId=ADDME&shopCategoryId=ADDME&currency=ADDME&matched=ADDME&page=ADDME&pageSize=ADDME"

      HttpGet client path
        |> isStatus (enum<HttpStatusCode>(401))
        |> readText
        |> shouldEqual "TESTME"
        |> ignore
      }

  [<Fact>]
  let ``GetOffers - Предложения магазина returns 403 where Данные для авторизации неверны или доступ к ресурсу запрещен.`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/campaigns/{campaignId}/offers".Replace("campaignId", "ADDME") + "?query=ADDME&feedId=ADDME&shopCategoryId=ADDME&currency=ADDME&matched=ADDME&page=ADDME&pageSize=ADDME"

      HttpGet client path
        |> isStatus (enum<HttpStatusCode>(403))
        |> readText
        |> shouldEqual "TESTME"
        |> ignore
      }

  [<Fact>]
  let ``GetOffers - Предложения магазина returns 404 where Запрашиваемый ресурс не найден.`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/campaigns/{campaignId}/offers".Replace("campaignId", "ADDME") + "?query=ADDME&feedId=ADDME&shopCategoryId=ADDME&currency=ADDME&matched=ADDME&page=ADDME&pageSize=ADDME"

      HttpGet client path
        |> isStatus (enum<HttpStatusCode>(404))
        |> readText
        |> shouldEqual "TESTME"
        |> ignore
      }

  [<Fact>]
  let ``GetOffers - Предложения магазина returns 420 where Превышено ограничение на доступ к ресурсу.`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/campaigns/{campaignId}/offers".Replace("campaignId", "ADDME") + "?query=ADDME&feedId=ADDME&shopCategoryId=ADDME&currency=ADDME&matched=ADDME&page=ADDME&pageSize=ADDME"

      HttpGet client path
        |> isStatus (enum<HttpStatusCode>(420))
        |> readText
        |> shouldEqual "TESTME"
        |> ignore
      }

  [<Fact>]
  let ``GetOffers - Предложения магазина returns 500 where Внутренняя ошибка сервера.`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/campaigns/{campaignId}/offers".Replace("campaignId", "ADDME") + "?query=ADDME&feedId=ADDME&shopCategoryId=ADDME&currency=ADDME&matched=ADDME&page=ADDME&pageSize=ADDME"

      HttpGet client path
        |> isStatus (enum<HttpStatusCode>(500))
        |> readText
        |> shouldEqual "TESTME"
        |> ignore
      }

  [<Fact>]
  let ``UpdateCampaignOffers - Изменение условий продажи товаров в магазине returns 200 where Ответ 200 обозначает, что новые параметры получены Маркетом и скоро вступят в силу.`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/campaigns/{campaignId}/offers/update".Replace("campaignId", "ADDME")

      // use an example requestBody provided by the spec
      let examples = Map.empty.Add("application/json", getUpdateCampaignOffersExample "application/json")
      // or pass a body of type UpdateCampaignOffersRequest
      let body = obj() :?> UpdateCampaignOffersRequest |> Newtonsoft.Json.JsonConvert.SerializeObject |> Encoding.UTF8.GetBytes |> MemoryStream |> StreamContent

      body
        |> HttpPost client path
        |> isStatus (enum<HttpStatusCode>(200))
        |> readText
        |> shouldEqual "TESTME"
      }

  [<Fact>]
  let ``UpdateCampaignOffers - Изменение условий продажи товаров в магазине returns 400 where Запрос содержит неправильные данные.`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/campaigns/{campaignId}/offers/update".Replace("campaignId", "ADDME")

      // use an example requestBody provided by the spec
      let examples = Map.empty.Add("application/json", getUpdateCampaignOffersExample "application/json")
      // or pass a body of type UpdateCampaignOffersRequest
      let body = obj() :?> UpdateCampaignOffersRequest |> Newtonsoft.Json.JsonConvert.SerializeObject |> Encoding.UTF8.GetBytes |> MemoryStream |> StreamContent

      body
        |> HttpPost client path
        |> isStatus (enum<HttpStatusCode>(400))
        |> readText
        |> shouldEqual "TESTME"
      }

  [<Fact>]
  let ``UpdateCampaignOffers - Изменение условий продажи товаров в магазине returns 401 where В запросе не указаны данные для авторизации.`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/campaigns/{campaignId}/offers/update".Replace("campaignId", "ADDME")

      // use an example requestBody provided by the spec
      let examples = Map.empty.Add("application/json", getUpdateCampaignOffersExample "application/json")
      // or pass a body of type UpdateCampaignOffersRequest
      let body = obj() :?> UpdateCampaignOffersRequest |> Newtonsoft.Json.JsonConvert.SerializeObject |> Encoding.UTF8.GetBytes |> MemoryStream |> StreamContent

      body
        |> HttpPost client path
        |> isStatus (enum<HttpStatusCode>(401))
        |> readText
        |> shouldEqual "TESTME"
      }

  [<Fact>]
  let ``UpdateCampaignOffers - Изменение условий продажи товаров в магазине returns 403 where Данные для авторизации неверны или доступ к ресурсу запрещен.`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/campaigns/{campaignId}/offers/update".Replace("campaignId", "ADDME")

      // use an example requestBody provided by the spec
      let examples = Map.empty.Add("application/json", getUpdateCampaignOffersExample "application/json")
      // or pass a body of type UpdateCampaignOffersRequest
      let body = obj() :?> UpdateCampaignOffersRequest |> Newtonsoft.Json.JsonConvert.SerializeObject |> Encoding.UTF8.GetBytes |> MemoryStream |> StreamContent

      body
        |> HttpPost client path
        |> isStatus (enum<HttpStatusCode>(403))
        |> readText
        |> shouldEqual "TESTME"
      }

  [<Fact>]
  let ``UpdateCampaignOffers - Изменение условий продажи товаров в магазине returns 404 where Запрашиваемый ресурс не найден.`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/campaigns/{campaignId}/offers/update".Replace("campaignId", "ADDME")

      // use an example requestBody provided by the spec
      let examples = Map.empty.Add("application/json", getUpdateCampaignOffersExample "application/json")
      // or pass a body of type UpdateCampaignOffersRequest
      let body = obj() :?> UpdateCampaignOffersRequest |> Newtonsoft.Json.JsonConvert.SerializeObject |> Encoding.UTF8.GetBytes |> MemoryStream |> StreamContent

      body
        |> HttpPost client path
        |> isStatus (enum<HttpStatusCode>(404))
        |> readText
        |> shouldEqual "TESTME"
      }

  [<Fact>]
  let ``UpdateCampaignOffers - Изменение условий продажи товаров в магазине returns 420 where Превышено ограничение на доступ к ресурсу.`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/campaigns/{campaignId}/offers/update".Replace("campaignId", "ADDME")

      // use an example requestBody provided by the spec
      let examples = Map.empty.Add("application/json", getUpdateCampaignOffersExample "application/json")
      // or pass a body of type UpdateCampaignOffersRequest
      let body = obj() :?> UpdateCampaignOffersRequest |> Newtonsoft.Json.JsonConvert.SerializeObject |> Encoding.UTF8.GetBytes |> MemoryStream |> StreamContent

      body
        |> HttpPost client path
        |> isStatus (enum<HttpStatusCode>(420))
        |> readText
        |> shouldEqual "TESTME"
      }

  [<Fact>]
  let ``UpdateCampaignOffers - Изменение условий продажи товаров в магазине returns 423 where К ресурсу нельзя применить указанный метод.`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/campaigns/{campaignId}/offers/update".Replace("campaignId", "ADDME")

      // use an example requestBody provided by the spec
      let examples = Map.empty.Add("application/json", getUpdateCampaignOffersExample "application/json")
      // or pass a body of type UpdateCampaignOffersRequest
      let body = obj() :?> UpdateCampaignOffersRequest |> Newtonsoft.Json.JsonConvert.SerializeObject |> Encoding.UTF8.GetBytes |> MemoryStream |> StreamContent

      body
        |> HttpPost client path
        |> isStatus (enum<HttpStatusCode>(423))
        |> readText
        |> shouldEqual "TESTME"
      }

  [<Fact>]
  let ``UpdateCampaignOffers - Изменение условий продажи товаров в магазине returns 500 where Внутренняя ошибка сервера.`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/campaigns/{campaignId}/offers/update".Replace("campaignId", "ADDME")

      // use an example requestBody provided by the spec
      let examples = Map.empty.Add("application/json", getUpdateCampaignOffersExample "application/json")
      // or pass a body of type UpdateCampaignOffersRequest
      let body = obj() :?> UpdateCampaignOffersRequest |> Newtonsoft.Json.JsonConvert.SerializeObject |> Encoding.UTF8.GetBytes |> MemoryStream |> StreamContent

      body
        |> HttpPost client path
        |> isStatus (enum<HttpStatusCode>(500))
        |> readText
        |> shouldEqual "TESTME"
      }

