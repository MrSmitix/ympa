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
open ChatsApiHandlerTestsHelper
open ympa_fsharp_giraffe_server.ChatsApiHandler
open ympa_fsharp_giraffe_server.ChatsApiHandlerParams
open ympa_fsharp_giraffe_server.Model.ApiClientDataErrorResponse
open ympa_fsharp_giraffe_server.Model.ApiForbiddenErrorResponse
open ympa_fsharp_giraffe_server.Model.ApiLimitErrorResponse
open ympa_fsharp_giraffe_server.Model.ApiNotFoundErrorResponse
open ympa_fsharp_giraffe_server.Model.ApiServerErrorResponse
open ympa_fsharp_giraffe_server.Model.ApiUnauthorizedErrorResponse
open ympa_fsharp_giraffe_server.Model.CreateChatRequest
open ympa_fsharp_giraffe_server.Model.CreateChatResponse
open ympa_fsharp_giraffe_server.Model.EmptyApiResponse
open ympa_fsharp_giraffe_server.Model.GetChatHistoryRequest
open ympa_fsharp_giraffe_server.Model.GetChatHistoryResponse
open ympa_fsharp_giraffe_server.Model.GetChatsRequest
open ympa_fsharp_giraffe_server.Model.GetChatsResponse
open ympa_fsharp_giraffe_server.Model.SendMessageToChatRequest

module ChatsApiHandlerTests =

  // ---------------------------------
  // Tests
  // ---------------------------------

  [<Fact>]
  let ``CreateChat - Создание нового чата с покупателем returns 200 where Все получилось: чат создан. `` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/businesses/{businessId}/chats/new".Replace("businessId", "ADDME")

      // use an example requestBody provided by the spec
      let examples = Map.empty.Add("application/json", getCreateChatExample "application/json")
      // or pass a body of type CreateChatRequest
      let body = obj() :?> CreateChatRequest |> Newtonsoft.Json.JsonConvert.SerializeObject |> Encoding.UTF8.GetBytes |> MemoryStream |> StreamContent

      body
        |> HttpPost client path
        |> isStatus (enum<HttpStatusCode>(200))
        |> readText
        |> shouldEqual "TESTME"
      }

  [<Fact>]
  let ``CreateChat - Создание нового чата с покупателем returns 400 where Запрос содержит неправильные данные.`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/businesses/{businessId}/chats/new".Replace("businessId", "ADDME")

      // use an example requestBody provided by the spec
      let examples = Map.empty.Add("application/json", getCreateChatExample "application/json")
      // or pass a body of type CreateChatRequest
      let body = obj() :?> CreateChatRequest |> Newtonsoft.Json.JsonConvert.SerializeObject |> Encoding.UTF8.GetBytes |> MemoryStream |> StreamContent

      body
        |> HttpPost client path
        |> isStatus (enum<HttpStatusCode>(400))
        |> readText
        |> shouldEqual "TESTME"
      }

  [<Fact>]
  let ``CreateChat - Создание нового чата с покупателем returns 401 where В запросе не указаны данные для авторизации.`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/businesses/{businessId}/chats/new".Replace("businessId", "ADDME")

      // use an example requestBody provided by the spec
      let examples = Map.empty.Add("application/json", getCreateChatExample "application/json")
      // or pass a body of type CreateChatRequest
      let body = obj() :?> CreateChatRequest |> Newtonsoft.Json.JsonConvert.SerializeObject |> Encoding.UTF8.GetBytes |> MemoryStream |> StreamContent

      body
        |> HttpPost client path
        |> isStatus (enum<HttpStatusCode>(401))
        |> readText
        |> shouldEqual "TESTME"
      }

  [<Fact>]
  let ``CreateChat - Создание нового чата с покупателем returns 403 where Данные для авторизации неверны или доступ к ресурсу запрещен.`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/businesses/{businessId}/chats/new".Replace("businessId", "ADDME")

      // use an example requestBody provided by the spec
      let examples = Map.empty.Add("application/json", getCreateChatExample "application/json")
      // or pass a body of type CreateChatRequest
      let body = obj() :?> CreateChatRequest |> Newtonsoft.Json.JsonConvert.SerializeObject |> Encoding.UTF8.GetBytes |> MemoryStream |> StreamContent

      body
        |> HttpPost client path
        |> isStatus (enum<HttpStatusCode>(403))
        |> readText
        |> shouldEqual "TESTME"
      }

  [<Fact>]
  let ``CreateChat - Создание нового чата с покупателем returns 404 where Запрашиваемый ресурс не найден.`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/businesses/{businessId}/chats/new".Replace("businessId", "ADDME")

      // use an example requestBody provided by the spec
      let examples = Map.empty.Add("application/json", getCreateChatExample "application/json")
      // or pass a body of type CreateChatRequest
      let body = obj() :?> CreateChatRequest |> Newtonsoft.Json.JsonConvert.SerializeObject |> Encoding.UTF8.GetBytes |> MemoryStream |> StreamContent

      body
        |> HttpPost client path
        |> isStatus (enum<HttpStatusCode>(404))
        |> readText
        |> shouldEqual "TESTME"
      }

  [<Fact>]
  let ``CreateChat - Создание нового чата с покупателем returns 420 where Превышено ограничение на доступ к ресурсу.`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/businesses/{businessId}/chats/new".Replace("businessId", "ADDME")

      // use an example requestBody provided by the spec
      let examples = Map.empty.Add("application/json", getCreateChatExample "application/json")
      // or pass a body of type CreateChatRequest
      let body = obj() :?> CreateChatRequest |> Newtonsoft.Json.JsonConvert.SerializeObject |> Encoding.UTF8.GetBytes |> MemoryStream |> StreamContent

      body
        |> HttpPost client path
        |> isStatus (enum<HttpStatusCode>(420))
        |> readText
        |> shouldEqual "TESTME"
      }

  [<Fact>]
  let ``CreateChat - Создание нового чата с покупателем returns 500 where Внутренняя ошибка сервера.`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/businesses/{businessId}/chats/new".Replace("businessId", "ADDME")

      // use an example requestBody provided by the spec
      let examples = Map.empty.Add("application/json", getCreateChatExample "application/json")
      // or pass a body of type CreateChatRequest
      let body = obj() :?> CreateChatRequest |> Newtonsoft.Json.JsonConvert.SerializeObject |> Encoding.UTF8.GetBytes |> MemoryStream |> StreamContent

      body
        |> HttpPost client path
        |> isStatus (enum<HttpStatusCode>(500))
        |> readText
        |> shouldEqual "TESTME"
      }

  [<Fact>]
  let ``GetChatHistory - Получение истории сообщений в чате returns 200 where История сообщений успешно получена. `` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/businesses/{businessId}/chats/history".Replace("businessId", "ADDME") + "?chatId=ADDME&pageToken=ADDME&limit=ADDME"

      // use an example requestBody provided by the spec
      let examples = Map.empty.Add("application/json", getGetChatHistoryExample "application/json")
      // or pass a body of type GetChatHistoryRequest
      let body = obj() :?> GetChatHistoryRequest |> Newtonsoft.Json.JsonConvert.SerializeObject |> Encoding.UTF8.GetBytes |> MemoryStream |> StreamContent

      body
        |> HttpPost client path
        |> isStatus (enum<HttpStatusCode>(200))
        |> readText
        |> shouldEqual "TESTME"
      }

  [<Fact>]
  let ``GetChatHistory - Получение истории сообщений в чате returns 400 where Запрос содержит неправильные данные.`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/businesses/{businessId}/chats/history".Replace("businessId", "ADDME") + "?chatId=ADDME&pageToken=ADDME&limit=ADDME"

      // use an example requestBody provided by the spec
      let examples = Map.empty.Add("application/json", getGetChatHistoryExample "application/json")
      // or pass a body of type GetChatHistoryRequest
      let body = obj() :?> GetChatHistoryRequest |> Newtonsoft.Json.JsonConvert.SerializeObject |> Encoding.UTF8.GetBytes |> MemoryStream |> StreamContent

      body
        |> HttpPost client path
        |> isStatus (enum<HttpStatusCode>(400))
        |> readText
        |> shouldEqual "TESTME"
      }

  [<Fact>]
  let ``GetChatHistory - Получение истории сообщений в чате returns 401 where В запросе не указаны данные для авторизации.`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/businesses/{businessId}/chats/history".Replace("businessId", "ADDME") + "?chatId=ADDME&pageToken=ADDME&limit=ADDME"

      // use an example requestBody provided by the spec
      let examples = Map.empty.Add("application/json", getGetChatHistoryExample "application/json")
      // or pass a body of type GetChatHistoryRequest
      let body = obj() :?> GetChatHistoryRequest |> Newtonsoft.Json.JsonConvert.SerializeObject |> Encoding.UTF8.GetBytes |> MemoryStream |> StreamContent

      body
        |> HttpPost client path
        |> isStatus (enum<HttpStatusCode>(401))
        |> readText
        |> shouldEqual "TESTME"
      }

  [<Fact>]
  let ``GetChatHistory - Получение истории сообщений в чате returns 403 where Данные для авторизации неверны или доступ к ресурсу запрещен.`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/businesses/{businessId}/chats/history".Replace("businessId", "ADDME") + "?chatId=ADDME&pageToken=ADDME&limit=ADDME"

      // use an example requestBody provided by the spec
      let examples = Map.empty.Add("application/json", getGetChatHistoryExample "application/json")
      // or pass a body of type GetChatHistoryRequest
      let body = obj() :?> GetChatHistoryRequest |> Newtonsoft.Json.JsonConvert.SerializeObject |> Encoding.UTF8.GetBytes |> MemoryStream |> StreamContent

      body
        |> HttpPost client path
        |> isStatus (enum<HttpStatusCode>(403))
        |> readText
        |> shouldEqual "TESTME"
      }

  [<Fact>]
  let ``GetChatHistory - Получение истории сообщений в чате returns 404 where Запрашиваемый ресурс не найден.`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/businesses/{businessId}/chats/history".Replace("businessId", "ADDME") + "?chatId=ADDME&pageToken=ADDME&limit=ADDME"

      // use an example requestBody provided by the spec
      let examples = Map.empty.Add("application/json", getGetChatHistoryExample "application/json")
      // or pass a body of type GetChatHistoryRequest
      let body = obj() :?> GetChatHistoryRequest |> Newtonsoft.Json.JsonConvert.SerializeObject |> Encoding.UTF8.GetBytes |> MemoryStream |> StreamContent

      body
        |> HttpPost client path
        |> isStatus (enum<HttpStatusCode>(404))
        |> readText
        |> shouldEqual "TESTME"
      }

  [<Fact>]
  let ``GetChatHistory - Получение истории сообщений в чате returns 420 where Превышено ограничение на доступ к ресурсу.`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/businesses/{businessId}/chats/history".Replace("businessId", "ADDME") + "?chatId=ADDME&pageToken=ADDME&limit=ADDME"

      // use an example requestBody provided by the spec
      let examples = Map.empty.Add("application/json", getGetChatHistoryExample "application/json")
      // or pass a body of type GetChatHistoryRequest
      let body = obj() :?> GetChatHistoryRequest |> Newtonsoft.Json.JsonConvert.SerializeObject |> Encoding.UTF8.GetBytes |> MemoryStream |> StreamContent

      body
        |> HttpPost client path
        |> isStatus (enum<HttpStatusCode>(420))
        |> readText
        |> shouldEqual "TESTME"
      }

  [<Fact>]
  let ``GetChatHistory - Получение истории сообщений в чате returns 500 where Внутренняя ошибка сервера.`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/businesses/{businessId}/chats/history".Replace("businessId", "ADDME") + "?chatId=ADDME&pageToken=ADDME&limit=ADDME"

      // use an example requestBody provided by the spec
      let examples = Map.empty.Add("application/json", getGetChatHistoryExample "application/json")
      // or pass a body of type GetChatHistoryRequest
      let body = obj() :?> GetChatHistoryRequest |> Newtonsoft.Json.JsonConvert.SerializeObject |> Encoding.UTF8.GetBytes |> MemoryStream |> StreamContent

      body
        |> HttpPost client path
        |> isStatus (enum<HttpStatusCode>(500))
        |> readText
        |> shouldEqual "TESTME"
      }

  [<Fact>]
  let ``GetChats - Получение доступных чатов returns 200 where Список чатов. `` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/businesses/{businessId}/chats".Replace("businessId", "ADDME") + "?pageToken=ADDME&limit=ADDME"

      // use an example requestBody provided by the spec
      let examples = Map.empty.Add("application/json", getGetChatsExample "application/json")
      // or pass a body of type GetChatsRequest
      let body = obj() :?> GetChatsRequest |> Newtonsoft.Json.JsonConvert.SerializeObject |> Encoding.UTF8.GetBytes |> MemoryStream |> StreamContent

      body
        |> HttpPost client path
        |> isStatus (enum<HttpStatusCode>(200))
        |> readText
        |> shouldEqual "TESTME"
      }

  [<Fact>]
  let ``GetChats - Получение доступных чатов returns 400 where Запрос содержит неправильные данные.`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/businesses/{businessId}/chats".Replace("businessId", "ADDME") + "?pageToken=ADDME&limit=ADDME"

      // use an example requestBody provided by the spec
      let examples = Map.empty.Add("application/json", getGetChatsExample "application/json")
      // or pass a body of type GetChatsRequest
      let body = obj() :?> GetChatsRequest |> Newtonsoft.Json.JsonConvert.SerializeObject |> Encoding.UTF8.GetBytes |> MemoryStream |> StreamContent

      body
        |> HttpPost client path
        |> isStatus (enum<HttpStatusCode>(400))
        |> readText
        |> shouldEqual "TESTME"
      }

  [<Fact>]
  let ``GetChats - Получение доступных чатов returns 401 where В запросе не указаны данные для авторизации.`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/businesses/{businessId}/chats".Replace("businessId", "ADDME") + "?pageToken=ADDME&limit=ADDME"

      // use an example requestBody provided by the spec
      let examples = Map.empty.Add("application/json", getGetChatsExample "application/json")
      // or pass a body of type GetChatsRequest
      let body = obj() :?> GetChatsRequest |> Newtonsoft.Json.JsonConvert.SerializeObject |> Encoding.UTF8.GetBytes |> MemoryStream |> StreamContent

      body
        |> HttpPost client path
        |> isStatus (enum<HttpStatusCode>(401))
        |> readText
        |> shouldEqual "TESTME"
      }

  [<Fact>]
  let ``GetChats - Получение доступных чатов returns 403 where Данные для авторизации неверны или доступ к ресурсу запрещен.`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/businesses/{businessId}/chats".Replace("businessId", "ADDME") + "?pageToken=ADDME&limit=ADDME"

      // use an example requestBody provided by the spec
      let examples = Map.empty.Add("application/json", getGetChatsExample "application/json")
      // or pass a body of type GetChatsRequest
      let body = obj() :?> GetChatsRequest |> Newtonsoft.Json.JsonConvert.SerializeObject |> Encoding.UTF8.GetBytes |> MemoryStream |> StreamContent

      body
        |> HttpPost client path
        |> isStatus (enum<HttpStatusCode>(403))
        |> readText
        |> shouldEqual "TESTME"
      }

  [<Fact>]
  let ``GetChats - Получение доступных чатов returns 404 where Запрашиваемый ресурс не найден.`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/businesses/{businessId}/chats".Replace("businessId", "ADDME") + "?pageToken=ADDME&limit=ADDME"

      // use an example requestBody provided by the spec
      let examples = Map.empty.Add("application/json", getGetChatsExample "application/json")
      // or pass a body of type GetChatsRequest
      let body = obj() :?> GetChatsRequest |> Newtonsoft.Json.JsonConvert.SerializeObject |> Encoding.UTF8.GetBytes |> MemoryStream |> StreamContent

      body
        |> HttpPost client path
        |> isStatus (enum<HttpStatusCode>(404))
        |> readText
        |> shouldEqual "TESTME"
      }

  [<Fact>]
  let ``GetChats - Получение доступных чатов returns 420 where Превышено ограничение на доступ к ресурсу.`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/businesses/{businessId}/chats".Replace("businessId", "ADDME") + "?pageToken=ADDME&limit=ADDME"

      // use an example requestBody provided by the spec
      let examples = Map.empty.Add("application/json", getGetChatsExample "application/json")
      // or pass a body of type GetChatsRequest
      let body = obj() :?> GetChatsRequest |> Newtonsoft.Json.JsonConvert.SerializeObject |> Encoding.UTF8.GetBytes |> MemoryStream |> StreamContent

      body
        |> HttpPost client path
        |> isStatus (enum<HttpStatusCode>(420))
        |> readText
        |> shouldEqual "TESTME"
      }

  [<Fact>]
  let ``GetChats - Получение доступных чатов returns 500 where Внутренняя ошибка сервера.`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/businesses/{businessId}/chats".Replace("businessId", "ADDME") + "?pageToken=ADDME&limit=ADDME"

      // use an example requestBody provided by the spec
      let examples = Map.empty.Add("application/json", getGetChatsExample "application/json")
      // or pass a body of type GetChatsRequest
      let body = obj() :?> GetChatsRequest |> Newtonsoft.Json.JsonConvert.SerializeObject |> Encoding.UTF8.GetBytes |> MemoryStream |> StreamContent

      body
        |> HttpPost client path
        |> isStatus (enum<HttpStatusCode>(500))
        |> readText
        |> shouldEqual "TESTME"
      }

  [<Fact>]
  let ``SendFileToChat - Отправка файла в чат returns 200 where Пустой ответ. Означает, что файл отправлен.`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/businesses/{businessId}/chats/file/send".Replace("businessId", "ADDME") + "?chatId=ADDME"

      // use an example requestBody provided by the spec
      let examples = Map.empty.Add("multipart/form-data", getSendFileToChatExample "multipart/form-data")
      // or pass a form
      let body = obj()  |> Newtonsoft.Json.JsonConvert.SerializeObject |> Encoding.UTF8.GetBytes |> MemoryStream |> StreamContent

      body
        |> HttpPost client path
        |> isStatus (enum<HttpStatusCode>(200))
        |> readText
        |> shouldEqual "TESTME"
      }

  [<Fact>]
  let ``SendFileToChat - Отправка файла в чат returns 400 where Запрос содержит неправильные данные.`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/businesses/{businessId}/chats/file/send".Replace("businessId", "ADDME") + "?chatId=ADDME"

      // use an example requestBody provided by the spec
      let examples = Map.empty.Add("multipart/form-data", getSendFileToChatExample "multipart/form-data")
      // or pass a form
      let body = obj()  |> Newtonsoft.Json.JsonConvert.SerializeObject |> Encoding.UTF8.GetBytes |> MemoryStream |> StreamContent

      body
        |> HttpPost client path
        |> isStatus (enum<HttpStatusCode>(400))
        |> readText
        |> shouldEqual "TESTME"
      }

  [<Fact>]
  let ``SendFileToChat - Отправка файла в чат returns 401 where В запросе не указаны данные для авторизации.`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/businesses/{businessId}/chats/file/send".Replace("businessId", "ADDME") + "?chatId=ADDME"

      // use an example requestBody provided by the spec
      let examples = Map.empty.Add("multipart/form-data", getSendFileToChatExample "multipart/form-data")
      // or pass a form
      let body = obj()  |> Newtonsoft.Json.JsonConvert.SerializeObject |> Encoding.UTF8.GetBytes |> MemoryStream |> StreamContent

      body
        |> HttpPost client path
        |> isStatus (enum<HttpStatusCode>(401))
        |> readText
        |> shouldEqual "TESTME"
      }

  [<Fact>]
  let ``SendFileToChat - Отправка файла в чат returns 403 where Данные для авторизации неверны или доступ к ресурсу запрещен.`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/businesses/{businessId}/chats/file/send".Replace("businessId", "ADDME") + "?chatId=ADDME"

      // use an example requestBody provided by the spec
      let examples = Map.empty.Add("multipart/form-data", getSendFileToChatExample "multipart/form-data")
      // or pass a form
      let body = obj()  |> Newtonsoft.Json.JsonConvert.SerializeObject |> Encoding.UTF8.GetBytes |> MemoryStream |> StreamContent

      body
        |> HttpPost client path
        |> isStatus (enum<HttpStatusCode>(403))
        |> readText
        |> shouldEqual "TESTME"
      }

  [<Fact>]
  let ``SendFileToChat - Отправка файла в чат returns 404 where Запрашиваемый ресурс не найден.`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/businesses/{businessId}/chats/file/send".Replace("businessId", "ADDME") + "?chatId=ADDME"

      // use an example requestBody provided by the spec
      let examples = Map.empty.Add("multipart/form-data", getSendFileToChatExample "multipart/form-data")
      // or pass a form
      let body = obj()  |> Newtonsoft.Json.JsonConvert.SerializeObject |> Encoding.UTF8.GetBytes |> MemoryStream |> StreamContent

      body
        |> HttpPost client path
        |> isStatus (enum<HttpStatusCode>(404))
        |> readText
        |> shouldEqual "TESTME"
      }

  [<Fact>]
  let ``SendFileToChat - Отправка файла в чат returns 420 where Превышено ограничение на доступ к ресурсу.`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/businesses/{businessId}/chats/file/send".Replace("businessId", "ADDME") + "?chatId=ADDME"

      // use an example requestBody provided by the spec
      let examples = Map.empty.Add("multipart/form-data", getSendFileToChatExample "multipart/form-data")
      // or pass a form
      let body = obj()  |> Newtonsoft.Json.JsonConvert.SerializeObject |> Encoding.UTF8.GetBytes |> MemoryStream |> StreamContent

      body
        |> HttpPost client path
        |> isStatus (enum<HttpStatusCode>(420))
        |> readText
        |> shouldEqual "TESTME"
      }

  [<Fact>]
  let ``SendFileToChat - Отправка файла в чат returns 500 where Внутренняя ошибка сервера.`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/businesses/{businessId}/chats/file/send".Replace("businessId", "ADDME") + "?chatId=ADDME"

      // use an example requestBody provided by the spec
      let examples = Map.empty.Add("multipart/form-data", getSendFileToChatExample "multipart/form-data")
      // or pass a form
      let body = obj()  |> Newtonsoft.Json.JsonConvert.SerializeObject |> Encoding.UTF8.GetBytes |> MemoryStream |> StreamContent

      body
        |> HttpPost client path
        |> isStatus (enum<HttpStatusCode>(500))
        |> readText
        |> shouldEqual "TESTME"
      }

  [<Fact>]
  let ``SendMessageToChat - Отправка сообщения в чат returns 200 where Пустой ответ. Означает, что сообщение отправлено.`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/businesses/{businessId}/chats/message".Replace("businessId", "ADDME") + "?chatId=ADDME"

      // use an example requestBody provided by the spec
      let examples = Map.empty.Add("application/json", getSendMessageToChatExample "application/json")
      // or pass a body of type SendMessageToChatRequest
      let body = obj() :?> SendMessageToChatRequest |> Newtonsoft.Json.JsonConvert.SerializeObject |> Encoding.UTF8.GetBytes |> MemoryStream |> StreamContent

      body
        |> HttpPost client path
        |> isStatus (enum<HttpStatusCode>(200))
        |> readText
        |> shouldEqual "TESTME"
      }

  [<Fact>]
  let ``SendMessageToChat - Отправка сообщения в чат returns 400 where Запрос содержит неправильные данные.`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/businesses/{businessId}/chats/message".Replace("businessId", "ADDME") + "?chatId=ADDME"

      // use an example requestBody provided by the spec
      let examples = Map.empty.Add("application/json", getSendMessageToChatExample "application/json")
      // or pass a body of type SendMessageToChatRequest
      let body = obj() :?> SendMessageToChatRequest |> Newtonsoft.Json.JsonConvert.SerializeObject |> Encoding.UTF8.GetBytes |> MemoryStream |> StreamContent

      body
        |> HttpPost client path
        |> isStatus (enum<HttpStatusCode>(400))
        |> readText
        |> shouldEqual "TESTME"
      }

  [<Fact>]
  let ``SendMessageToChat - Отправка сообщения в чат returns 401 where В запросе не указаны данные для авторизации.`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/businesses/{businessId}/chats/message".Replace("businessId", "ADDME") + "?chatId=ADDME"

      // use an example requestBody provided by the spec
      let examples = Map.empty.Add("application/json", getSendMessageToChatExample "application/json")
      // or pass a body of type SendMessageToChatRequest
      let body = obj() :?> SendMessageToChatRequest |> Newtonsoft.Json.JsonConvert.SerializeObject |> Encoding.UTF8.GetBytes |> MemoryStream |> StreamContent

      body
        |> HttpPost client path
        |> isStatus (enum<HttpStatusCode>(401))
        |> readText
        |> shouldEqual "TESTME"
      }

  [<Fact>]
  let ``SendMessageToChat - Отправка сообщения в чат returns 403 where Данные для авторизации неверны или доступ к ресурсу запрещен.`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/businesses/{businessId}/chats/message".Replace("businessId", "ADDME") + "?chatId=ADDME"

      // use an example requestBody provided by the spec
      let examples = Map.empty.Add("application/json", getSendMessageToChatExample "application/json")
      // or pass a body of type SendMessageToChatRequest
      let body = obj() :?> SendMessageToChatRequest |> Newtonsoft.Json.JsonConvert.SerializeObject |> Encoding.UTF8.GetBytes |> MemoryStream |> StreamContent

      body
        |> HttpPost client path
        |> isStatus (enum<HttpStatusCode>(403))
        |> readText
        |> shouldEqual "TESTME"
      }

  [<Fact>]
  let ``SendMessageToChat - Отправка сообщения в чат returns 404 where Запрашиваемый ресурс не найден.`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/businesses/{businessId}/chats/message".Replace("businessId", "ADDME") + "?chatId=ADDME"

      // use an example requestBody provided by the spec
      let examples = Map.empty.Add("application/json", getSendMessageToChatExample "application/json")
      // or pass a body of type SendMessageToChatRequest
      let body = obj() :?> SendMessageToChatRequest |> Newtonsoft.Json.JsonConvert.SerializeObject |> Encoding.UTF8.GetBytes |> MemoryStream |> StreamContent

      body
        |> HttpPost client path
        |> isStatus (enum<HttpStatusCode>(404))
        |> readText
        |> shouldEqual "TESTME"
      }

  [<Fact>]
  let ``SendMessageToChat - Отправка сообщения в чат returns 420 where Превышено ограничение на доступ к ресурсу.`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/businesses/{businessId}/chats/message".Replace("businessId", "ADDME") + "?chatId=ADDME"

      // use an example requestBody provided by the spec
      let examples = Map.empty.Add("application/json", getSendMessageToChatExample "application/json")
      // or pass a body of type SendMessageToChatRequest
      let body = obj() :?> SendMessageToChatRequest |> Newtonsoft.Json.JsonConvert.SerializeObject |> Encoding.UTF8.GetBytes |> MemoryStream |> StreamContent

      body
        |> HttpPost client path
        |> isStatus (enum<HttpStatusCode>(420))
        |> readText
        |> shouldEqual "TESTME"
      }

  [<Fact>]
  let ``SendMessageToChat - Отправка сообщения в чат returns 500 where Внутренняя ошибка сервера.`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/businesses/{businessId}/chats/message".Replace("businessId", "ADDME") + "?chatId=ADDME"

      // use an example requestBody provided by the spec
      let examples = Map.empty.Add("application/json", getSendMessageToChatExample "application/json")
      // or pass a body of type SendMessageToChatRequest
      let body = obj() :?> SendMessageToChatRequest |> Newtonsoft.Json.JsonConvert.SerializeObject |> Encoding.UTF8.GetBytes |> MemoryStream |> StreamContent

      body
        |> HttpPost client path
        |> isStatus (enum<HttpStatusCode>(500))
        |> readText
        |> shouldEqual "TESTME"
      }

