#tag Class
Protected Class ReturnsApi
	#tag Method, Flags = &h0
		Sub GetReturn(, campaignId As Int64, orderId As Int64, returnId As Int64)
		  // Operation getReturn
		  // Информация о невыкупе или возврате
		  // - 
		  // - parameter campaignId: (path) Идентификатор кампании в API и магазина в кабинете. Каждая кампания в API соответствует магазину в кабинете.  Чтобы узнать идентификаторы своих магазинов, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html)  
		  // - parameter orderId: (path) Идентификатор заказа. 
		  // - parameter returnId: (path) Идентификатор возврата. 
		  //
		  // Invokes ReturnsApiCallbackHandler.GetReturnCallback(GetReturnResponse) on completion. 
		  //
		  // - GET /campaigns/{campaignId}/orders/{orderId}/returns/{returnId}
		  // - Получает информацию по одному невыкупу или возврату.  |**⚙️ Лимит:** 10 000 запросов в час| |-| 
		  // - defaultResponse: Nil
		  //
		  // - OAuth:
		  //   - type: oauth2
		  //   - name: OAuth
		  //
		  
		  Dim localVarHTTPSocket As New HTTPSecureSocket
		  Me.PrivateFuncPrepareSocket(localVarHTTPSocket)
		  
		  
		  
		  


		  Dim localVarPath As String = "/campaigns/{campaignId}/orders/{orderId}/returns/{returnId}"
		  
		  Dim localVarPathStringcampaignId As String = campaignId.ToString
		  
		  localVarPath = localVarPath.ReplaceAllB("{campaignId}", localVarPathStringcampaignId)
		  Dim localVarPathStringorderId As String = orderId.ToString
		  
		  localVarPath = localVarPath.ReplaceAllB("{orderId}", localVarPathStringorderId)
		  Dim localVarPathStringreturnId As String = returnId.ToString
		  
		  localVarPath = localVarPath.ReplaceAllB("{returnId}", localVarPathStringreturnId)
		  
		  
		  AddHandler localVarHTTPSocket.PageReceived, addressof me.GetReturn_handler
		  AddHandler localVarHTTPSocket.Error, addressof Me.GetReturn_error
		  
		  
		  localVarHTTPSocket.SendRequest("GET", Me.BasePath + localVarPath)
		  if localVarHTTPSocket.LastErrorCode <> 0 then
		    Dim localVarException As New OpenAPIClient.OpenAPIClientException(localVarHTTPSocket.LastErrorCode)
			Raise localVarException
		  end if
		  
		End Sub
	#tag EndMethod

	#tag Method, Flags = &h21
		Private Function GetReturnPrivateFuncDeserializeResponse(HTTPStatus As Integer, Headers As InternetHeaders, error As OpenAPIClient.OpenAPIClientException, Content As String, ByRef outData As OpenAPIClient.Models.GetReturnResponse) As Boolean
		  Dim contentType As String = Headers.Value("Content-Type")
		  Dim contentEncoding As TextEncoding = OpenAPIClient.EncodingFromContentType(contentType)
		  Content = DefineEncoding(Content, contentEncoding)
		  
		  If HTTPStatus > 199 and HTTPStatus < 300 then
		    If contentType.LeftB(16) = "application/json" then
		      
			  outData = New OpenAPIClient.Models.GetReturnResponse
			  Try
		        Xoson.fromJSON(outData, Content.toText())

		      Catch e As JSONException
		        error.Message = error.Message + " with JSON parse exception: " + e.Message
		        error.ErrorNumber = kErrorInvalidJSON
		        Return False
		        
		      Catch e As Xojo.Data.InvalidJSONException
		        error.Message = error.Message + " with Xojo.Data.JSON parse exception: " + e.Message
		        error.ErrorNumber = kErrorInvalidJSON
		        Return False
		        
		      Catch e As Xoson.XosonException
		        error.Message = error.Message + " with Xoson parse exception: " + e.Message
		        error.ErrorNumber = kErrorXosonProblem
		        Return False

		      End Try
		      
		      
		    ElseIf contentType.LeftB(19) = "multipart/form-data" then
		      error.Message = "Unsupported media type: " + contentType
		      error.ErrorNumber = kErrorUnsupportedMediaType
		      Return False

		    ElseIf contentType.LeftB(33) = "application/x-www-form-urlencoded" then
		      error.Message = "Unsupported media type: " + contentType
		      error.ErrorNumber = kErrorUnsupportedMediaType
		      Return False

		    Else
		      error.Message = "Unsupported media type: " + contentType
		      error.ErrorNumber = kErrorUnsupportedMediaType
		      Return False

		    End If
		  Else
		    error.Message = error.Message + ". " + Content
			error.ErrorNumber = kErrorHTTPFail
		    Return False
		  End If
		  
		  Return True
		End Function
	#tag EndMethod

	#tag Method, Flags = &h21
		Private Sub GetReturn_error(sender As HTTPSecureSocket, Code As Integer)
		  If sender <> nil Then sender.Close()

		  Dim error As New OpenAPIClient.OpenAPIClientException(Code)
		  Dim data As OpenAPIClient.Models.GetReturnResponse
		  CallbackHandler.GetReturnCallback(error, data)
		End Sub
	#tag EndMethod

	#tag Method, Flags = &h21
		Private Sub GetReturn_handler(sender As HTTPSecureSocket, URL As String, HTTPStatus As Integer, Headers As InternetHeaders, Content As String)
		  #Pragma Unused URL
		  

		  If sender <> nil Then sender.Close()
		  
		  Dim error As New OpenAPIClient.OpenAPIClientException(HTTPStatus, "", Content)
		  
		  Dim data As OpenAPIClient.Models.GetReturnResponse
		  Call GetReturnPrivateFuncDeserializeResponse(HTTPStatus, Headers, error, Content, data)
		  
		  CallbackHandler.GetReturnCallback(error, data)
		End Sub
	#tag EndMethod




	#tag Method, Flags = &h0
		Sub GetReturnApplication(downloadToFile As FolderItem, campaignId As Int64, orderId As Int64, returnId As Int64)
		  // Operation getReturnApplication
		  // Получение заявления на возврат
		  // - parameter downloadToFile: The writable, non-existing path in the filesystem where the response body should be stored.
		  // - parameter campaignId: (path) Идентификатор кампании в API и магазина в кабинете. Каждая кампания в API соответствует магазину в кабинете.  Чтобы узнать идентификаторы своих магазинов, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html)  
		  // - parameter orderId: (path) Идентификатор заказа. 
		  // - parameter returnId: (path) Идентификатор возврата. 
		  //
		  // Invokes ReturnsApiCallbackHandler.GetReturnApplicationCallback(FolderItem) on completion. 
		  //
		  // - GET /campaigns/{campaignId}/orders/{orderId}/returns/{returnId}/application
		  // - Загружает заявление покупателя на возврат товара.  |**⚙️ Лимит:** 10 000 запросов в час| |-| 
		  // - defaultResponse: Sample
		  //
		  // - OAuth:
		  //   - type: oauth2
		  //   - name: OAuth
		  //
		  
		  Dim localVarHTTPSocket As New HTTPSecureSocket
		  Me.PrivateFuncPrepareSocket(localVarHTTPSocket)
		  
		  
		  
		  


		  Dim localVarPath As String = "/campaigns/{campaignId}/orders/{orderId}/returns/{returnId}/application"
		  
		  Dim localVarPathStringcampaignId As String = campaignId.ToString
		  
		  localVarPath = localVarPath.ReplaceAllB("{campaignId}", localVarPathStringcampaignId)
		  Dim localVarPathStringorderId As String = orderId.ToString
		  
		  localVarPath = localVarPath.ReplaceAllB("{orderId}", localVarPathStringorderId)
		  Dim localVarPathStringreturnId As String = returnId.ToString
		  
		  localVarPath = localVarPath.ReplaceAllB("{returnId}", localVarPathStringreturnId)
		  
		  AddHandler localVarHTTPSocket.DownloadComplete, addressof me.GetReturnApplication_handler
		  AddHandler localVarHTTPSocket.ReceiveProgress, addressof Me.GetReturnApplication_progress
		  
		  
		  
		  localVarHTTPSocket.SendRequest("GET", Me.BasePath + localVarPath, downloadToFile)
		  if localVarHTTPSocket.LastErrorCode <> 0 then
		    Dim localVarException As New OpenAPIClient.OpenAPIClientException(localVarHTTPSocket.LastErrorCode)
			Raise localVarException
		  end if
		  
		End Sub
	#tag EndMethod


	#tag Method, Flags = &h21
		Private Sub GetReturnApplication_error(sender As HTTPSecureSocket, Code As Integer)
		  If sender <> nil Then sender.Close()

		  Dim error As New OpenAPIClient.OpenAPIClientException(Code)
		  Dim file As FolderItem
		  CallbackHandler.GetReturnApplicationCallback(error, file)
		End Sub
	#tag EndMethod

	#tag Method, Flags = &h21
		Private Sub GetReturnApplication_handler(sender As HTTPSecureSocket, URL As String, HTTPStatus As Integer, Headers As InternetHeaders, File As FolderItem)
		  #Pragma Unused URL
		  #Pragma Unused Headers

		  If sender <> nil Then sender.Close()
		  
		  Dim error As New OpenAPIClient.OpenAPIClientException(HTTPStatus, "", "")
		  
		  
		  
		  CallbackHandler.GetReturnApplicationCallback(error, File)
		End Sub
	#tag EndMethod

	#tag Method, Flags = &h21
		Private Sub GetReturnApplication_progress(sender As HTTPSecureSocket, BytesReceived As Integer, TotalBytes As Integer, NewData As String)
		  CallbackHandler.GetReturnApplicationDownloadProgress(BytesReceived, TotalBytes)
		End Sub
	#tag EndMethod


	#tag Method, Flags = &h0
		Sub GetReturnPhoto(downloadToFile As FolderItem, campaignId As Int64, orderId As Int64, returnId As Int64, itemId As Int64, imageHash As String)
		  // Operation getReturnPhoto
		  // Получение фотографии возврата
		  // - parameter downloadToFile: The writable, non-existing path in the filesystem where the response body should be stored.
		  // - parameter campaignId: (path) Идентификатор кампании в API и магазина в кабинете. Каждая кампания в API соответствует магазину в кабинете.  Чтобы узнать идентификаторы своих магазинов, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html)  
		  // - parameter orderId: (path) Идентификатор заказа. 
		  // - parameter returnId: (path) Идентификатор возврата. 
		  // - parameter itemId: (path) Идентификатор товара в возврате. 
		  // - parameter imageHash: (path) Хеш ссылки изображения для загрузки. 
		  //
		  // Invokes ReturnsApiCallbackHandler.GetReturnPhotoCallback(FolderItem) on completion. 
		  //
		  // - GET /campaigns/{campaignId}/orders/{orderId}/returns/{returnId}/decision/{itemId}/image/{imageHash}
		  // - Получает фотографии, которые покупатель приложил к заявлению на возврат товара.  |**⚙️ Лимит:** 10 000 запросов в час| |-| 
		  // - defaultResponse: Sample
		  //
		  // - OAuth:
		  //   - type: oauth2
		  //   - name: OAuth
		  //
		  
		  Dim localVarHTTPSocket As New HTTPSecureSocket
		  Me.PrivateFuncPrepareSocket(localVarHTTPSocket)
		  
		  
		  
		  


		  Dim localVarPath As String = "/campaigns/{campaignId}/orders/{orderId}/returns/{returnId}/decision/{itemId}/image/{imageHash}"
		  
		  Dim localVarPathStringcampaignId As String = campaignId.ToString
		  
		  localVarPath = localVarPath.ReplaceAllB("{campaignId}", localVarPathStringcampaignId)
		  Dim localVarPathStringorderId As String = orderId.ToString
		  
		  localVarPath = localVarPath.ReplaceAllB("{orderId}", localVarPathStringorderId)
		  Dim localVarPathStringreturnId As String = returnId.ToString
		  
		  localVarPath = localVarPath.ReplaceAllB("{returnId}", localVarPathStringreturnId)
		  Dim localVarPathStringitemId As String = itemId.ToString
		  
		  localVarPath = localVarPath.ReplaceAllB("{itemId}", localVarPathStringitemId)
		  Dim localVarPathStringimageHash As String = imageHash
		  
		  localVarPath = localVarPath.ReplaceAllB("{imageHash}", localVarPathStringimageHash)
		  
		  AddHandler localVarHTTPSocket.DownloadComplete, addressof me.GetReturnPhoto_handler
		  AddHandler localVarHTTPSocket.ReceiveProgress, addressof Me.GetReturnPhoto_progress
		  
		  
		  
		  localVarHTTPSocket.SendRequest("GET", Me.BasePath + localVarPath, downloadToFile)
		  if localVarHTTPSocket.LastErrorCode <> 0 then
		    Dim localVarException As New OpenAPIClient.OpenAPIClientException(localVarHTTPSocket.LastErrorCode)
			Raise localVarException
		  end if
		  
		End Sub
	#tag EndMethod


	#tag Method, Flags = &h21
		Private Sub GetReturnPhoto_error(sender As HTTPSecureSocket, Code As Integer)
		  If sender <> nil Then sender.Close()

		  Dim error As New OpenAPIClient.OpenAPIClientException(Code)
		  Dim file As FolderItem
		  CallbackHandler.GetReturnPhotoCallback(error, file)
		End Sub
	#tag EndMethod

	#tag Method, Flags = &h21
		Private Sub GetReturnPhoto_handler(sender As HTTPSecureSocket, URL As String, HTTPStatus As Integer, Headers As InternetHeaders, File As FolderItem)
		  #Pragma Unused URL
		  #Pragma Unused Headers

		  If sender <> nil Then sender.Close()
		  
		  Dim error As New OpenAPIClient.OpenAPIClientException(HTTPStatus, "", "")
		  
		  
		  
		  CallbackHandler.GetReturnPhotoCallback(error, File)
		End Sub
	#tag EndMethod

	#tag Method, Flags = &h21
		Private Sub GetReturnPhoto_progress(sender As HTTPSecureSocket, BytesReceived As Integer, TotalBytes As Integer, NewData As String)
		  CallbackHandler.GetReturnPhotoDownloadProgress(BytesReceived, TotalBytes)
		End Sub
	#tag EndMethod


	#tag Method, Flags = &h0
		Sub GetReturns(, campaignId As Int64, Optional pageToken As Xoson.O.OptionalString, Optional limit As Xoson.O.OptionalInteger, orderIds() As Int64, statuses() As RefundStatusType, type As OpenAPIClient.Models.ReturnTypeOptional, Optional fromDate As Date, Optional toDate As Date, Optional fromDate2 As Date, Optional toDate2 As Date)
		  // Operation getReturns
		  // Список невыкупов и возвратов
		  // - 
		  // - parameter campaignId: (path) Идентификатор кампании в API и магазина в кабинете. Каждая кампания в API соответствует магазину в кабинете.  Чтобы узнать идентификаторы своих магазинов, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html)  
		  // - parameter pageToken: (query) Идентификатор страницы c результатами.  Если параметр не указан, возвращается первая страница.  Рекомендуется передавать значение выходного параметра &#x60;nextPageToken&#x60;, полученное при последнем запросе.  Если задан &#x60;page_token&#x60; и в запросе есть параметры &#x60;offset&#x60;, &#x60;page_number&#x60; и &#x60;page_size&#x60;, они игнорируются.  (optional, default to Sample)
		  // - parameter limit: (query) Количество значений на одной странице.  (optional, default to 0)
		  // - parameter orderIds: (query) Идентификаторы заказов — для фильтрации результатов.  Несколько идентификаторов перечисляются через запятую без пробела. Максимальное количество идентификаторов — 50.  (optional, default to Nil)
		  // - parameter statuses: (query) Статусы возвратов или невыкупов — для фильтрации результатов.  Несколько статусов перечисляются через запятую.  (optional, default to Nil)
		  // - parameter type: (query) Тип заказа для фильтрации:  * &#x60;RETURN&#x60; — возврат.  * &#x60;UNREDEEMED&#x60; — невыкуп.  Если не указывать, в ответе будут и возвраты, и невыкупы.  (optional, default to Nil)
		  // - parameter fromDate: (query) Начальная дата для фильтрации возвратов или невыкупов по дате обновления.  Формат: &#x60;ГГГГ-ММ-ДД&#x60;.  (optional, default to Nil)
		  // - parameter toDate: (query) Конечная дата для фильтрации возвратов или невыкупов по дате обновления.  Формат: &#x60;ГГГГ-ММ-ДД&#x60;.  (optional, default to Nil)
		  // - parameter fromDate2: (query) {% note warning &quot;&quot; %}  Этот параметр устарел. Вместо него используйте &#x60;fromDate&#x60;.  {% endnote %}  Начальная дата для фильтрации возвратов или невыкупов по дате обновления.  (optional, default to Nil)
		  // - parameter toDate2: (query) {% note warning &quot;&quot; %}  Этот параметр устарел. Вместо него используйте &#x60;toDate&#x60;.  {% endnote %}  Конечная дата для фильтрации возвратов или невыкупов по дате обновления.  (optional, default to Nil)
		  //
		  // Invokes ReturnsApiCallbackHandler.GetReturnsCallback(GetReturnsResponse) on completion. 
		  //
		  // - GET /campaigns/{campaignId}/returns
		  // - Получает список невыкупов и возвратов.  Чтобы получить информацию по одному возврату или невыкупу, выполните запрос [GET campaigns/{campaignId}/orders/{orderId}/returns/{returnId}](../../reference/orders/getReturn.md).  |**⚙️ Лимит:** 10 000 запросов в час| |-| 
		  // - defaultResponse: Nil
		  //
		  // - OAuth:
		  //   - type: oauth2
		  //   - name: OAuth
		  //
		  
		  Dim localVarHTTPSocket As New HTTPSecureSocket
		  Me.PrivateFuncPrepareSocket(localVarHTTPSocket)
		  
		  Dim localVarQueryParams As String = "?"
		  If pageToken <> nil Then localVarQueryParams = localVarQueryParams + EncodeURLComponent("page_token") + "=" + EncodeURLComponent(pageToken)
		  
		  If limit <> nil Then localVarQueryParams = localVarQueryParams + "&" + EncodeURLComponent("limit") + "=" + EncodeURLComponent(limit.ToString)
		  
		  
		  Dim localVarQueryStringsorderIds() As String
		  For Each localVarItemorderIds As Int64 in orderIds
		    Dim encodedParameter As String = EncodeURLComponent(localVarItemorderIds.ToString)
		    localVarQueryStringsorderIds.Append(encodedParameter)
		  Next
		  
		  Dim localVarQueryStringorderIds As String
		  Select Case ""
		    Case "form"
			  localVarQueryStringorderIds = "inner=" + Join(localVarQueryStringsorderIds, ",")
		    Case "spaceDelimited"
		      localVarQueryStringorderIds = "inner=" + Join(localVarQueryStringsorderIds, " ")
		    Case "pipeDelimited"
		      localVarQueryStringorderIds = "inner=" + Join(localVarQueryStringsorderIds, "|")
		    Case "deepObject"
		      Raise New OpenAPIClient.OpenAPIClientException(kErrorUnsupportedFeature, "deepObject query parameters are not supported")
		  End Select
		  If localVarQueryStringsorderIds.Ubound() > -1 Then localVarQueryParams = localVarQueryParams + "&"  + EncodeURLComponent("inner") + "=" + EncodeURLComponent(localVarQueryStringorderIds)
		  
		  Dim localVarQueryStringsstatuses() As String
		  For Each localVarItemstatuses As RefundStatusType in statuses
		    Dim encodedParameter As String = EncodeURLComponent(Xoson.toJSON(localVarItemstatuses))
		    localVarQueryStringsstatuses.Append(encodedParameter)
		  Next
		  
		  Dim localVarQueryStringstatuses As String
		  Select Case ""
		    Case "form"
			  localVarQueryStringstatuses = "inner=" + Join(localVarQueryStringsstatuses, ",")
		    Case "spaceDelimited"
		      localVarQueryStringstatuses = "inner=" + Join(localVarQueryStringsstatuses, " ")
		    Case "pipeDelimited"
		      localVarQueryStringstatuses = "inner=" + Join(localVarQueryStringsstatuses, "|")
		    Case "deepObject"
		      Raise New OpenAPIClient.OpenAPIClientException(kErrorUnsupportedFeature, "deepObject query parameters are not supported")
		  End Select
		  If localVarQueryStringsstatuses.Ubound() > -1 Then localVarQueryParams = localVarQueryParams + "&"  + EncodeURLComponent("inner") + "=" + EncodeURLComponent(localVarQueryStringstatuses)
		  If type <> nil Then localVarQueryParams = localVarQueryParams + "&" + EncodeURLComponent("type") + "=" + EncodeURLComponent(Xoson.toJSON(type))
		  
		  If fromDate <> nil Then localVarQueryParams = localVarQueryParams + "&" + EncodeURLComponent("fromDate") + "=" + EncodeURLComponent(fromDate.ToRFC3339)
		  
		  If toDate <> nil Then localVarQueryParams = localVarQueryParams + "&" + EncodeURLComponent("toDate") + "=" + EncodeURLComponent(toDate.ToRFC3339)
		  
		  If fromDate2 <> nil Then localVarQueryParams = localVarQueryParams + "&" + EncodeURLComponent("from_date") + "=" + EncodeURLComponent(fromDate2.ToRFC3339)
		  
		  If toDate2 <> nil Then localVarQueryParams = localVarQueryParams + "&" + EncodeURLComponent("to_date") + "=" + EncodeURLComponent(toDate2.ToRFC3339)
		  

		  
		  


		  Dim localVarPath As String = "/campaigns/{campaignId}/returns"
		  
		  Dim localVarPathStringcampaignId As String = campaignId.ToString
		  
		  localVarPath = localVarPath.ReplaceAllB("{campaignId}", localVarPathStringcampaignId)
		  
		  
		  AddHandler localVarHTTPSocket.PageReceived, addressof me.GetReturns_handler
		  AddHandler localVarHTTPSocket.Error, addressof Me.GetReturns_error
		  
		  
		  localVarHTTPSocket.SendRequest("GET", Me.BasePath + localVarPath + localVarQueryParams)
		  if localVarHTTPSocket.LastErrorCode <> 0 then
		    Dim localVarException As New OpenAPIClient.OpenAPIClientException(localVarHTTPSocket.LastErrorCode)
			Raise localVarException
		  end if
		  
		End Sub
	#tag EndMethod

	#tag Method, Flags = &h21
		Private Function GetReturnsPrivateFuncDeserializeResponse(HTTPStatus As Integer, Headers As InternetHeaders, error As OpenAPIClient.OpenAPIClientException, Content As String, ByRef outData As OpenAPIClient.Models.GetReturnsResponse) As Boolean
		  Dim contentType As String = Headers.Value("Content-Type")
		  Dim contentEncoding As TextEncoding = OpenAPIClient.EncodingFromContentType(contentType)
		  Content = DefineEncoding(Content, contentEncoding)
		  
		  If HTTPStatus > 199 and HTTPStatus < 300 then
		    If contentType.LeftB(16) = "application/json" then
		      
			  outData = New OpenAPIClient.Models.GetReturnsResponse
			  Try
		        Xoson.fromJSON(outData, Content.toText())

		      Catch e As JSONException
		        error.Message = error.Message + " with JSON parse exception: " + e.Message
		        error.ErrorNumber = kErrorInvalidJSON
		        Return False
		        
		      Catch e As Xojo.Data.InvalidJSONException
		        error.Message = error.Message + " with Xojo.Data.JSON parse exception: " + e.Message
		        error.ErrorNumber = kErrorInvalidJSON
		        Return False
		        
		      Catch e As Xoson.XosonException
		        error.Message = error.Message + " with Xoson parse exception: " + e.Message
		        error.ErrorNumber = kErrorXosonProblem
		        Return False

		      End Try
		      
		      
		    ElseIf contentType.LeftB(19) = "multipart/form-data" then
		      error.Message = "Unsupported media type: " + contentType
		      error.ErrorNumber = kErrorUnsupportedMediaType
		      Return False

		    ElseIf contentType.LeftB(33) = "application/x-www-form-urlencoded" then
		      error.Message = "Unsupported media type: " + contentType
		      error.ErrorNumber = kErrorUnsupportedMediaType
		      Return False

		    Else
		      error.Message = "Unsupported media type: " + contentType
		      error.ErrorNumber = kErrorUnsupportedMediaType
		      Return False

		    End If
		  Else
		    error.Message = error.Message + ". " + Content
			error.ErrorNumber = kErrorHTTPFail
		    Return False
		  End If
		  
		  Return True
		End Function
	#tag EndMethod

	#tag Method, Flags = &h21
		Private Sub GetReturns_error(sender As HTTPSecureSocket, Code As Integer)
		  If sender <> nil Then sender.Close()

		  Dim error As New OpenAPIClient.OpenAPIClientException(Code)
		  Dim data As OpenAPIClient.Models.GetReturnsResponse
		  CallbackHandler.GetReturnsCallback(error, data)
		End Sub
	#tag EndMethod

	#tag Method, Flags = &h21
		Private Sub GetReturns_handler(sender As HTTPSecureSocket, URL As String, HTTPStatus As Integer, Headers As InternetHeaders, Content As String)
		  #Pragma Unused URL
		  

		  If sender <> nil Then sender.Close()
		  
		  Dim error As New OpenAPIClient.OpenAPIClientException(HTTPStatus, "", Content)
		  
		  Dim data As OpenAPIClient.Models.GetReturnsResponse
		  Call GetReturnsPrivateFuncDeserializeResponse(HTTPStatus, Headers, error, Content, data)
		  
		  CallbackHandler.GetReturnsCallback(error, data)
		End Sub
	#tag EndMethod




	#tag Method, Flags = &h0
		Sub SetReturnDecision(, campaignId As Int64, orderId As Int64, returnId As Int64, setReturnDecisionRequest As OpenAPIClient.Models.SetReturnDecisionRequest)
		  // Operation setReturnDecision
		  // Принятие или изменение решения по возврату
		  // - 
		  // - parameter campaignId: (path) Идентификатор кампании в API и магазина в кабинете. Каждая кампания в API соответствует магазину в кабинете.  Чтобы узнать идентификаторы своих магазинов, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html)  
		  // - parameter orderId: (path) Идентификатор заказа. 
		  // - parameter returnId: (path) Идентификатор возврата. 
		  // - parameter setReturnDecisionRequest: (body)  
		  //
		  // Invokes ReturnsApiCallbackHandler.SetReturnDecisionCallback(EmptyApiResponse) on completion. 
		  //
		  // - POST /campaigns/{campaignId}/orders/{orderId}/returns/{returnId}/decision
		  // - Выбирает решение по возврату от покупателя. После этого для подтверждения решения нужно выполнить запрос [POST campaigns/{campaignId}/orders/{orderId}/returns/{returnId}/decision/submit](../../reference/orders/submitReturnDecision.md).  |**⚙️ Лимит:** 10 000 запросов в час| |-| 
		  // - defaultResponse: Nil
		  //
		  // - OAuth:
		  //   - type: oauth2
		  //   - name: OAuth
		  //
		  
		  Dim localVarHTTPSocket As New HTTPSecureSocket
		  Me.PrivateFuncPrepareSocket(localVarHTTPSocket)
		  localVarHTTPSocket.SetRequestContent(Xoson.toJSON(setReturnDecisionRequest), "application/json")
		  
		  
		  


		  Dim localVarPath As String = "/campaigns/{campaignId}/orders/{orderId}/returns/{returnId}/decision"
		  
		  Dim localVarPathStringcampaignId As String = campaignId.ToString
		  
		  localVarPath = localVarPath.ReplaceAllB("{campaignId}", localVarPathStringcampaignId)
		  Dim localVarPathStringorderId As String = orderId.ToString
		  
		  localVarPath = localVarPath.ReplaceAllB("{orderId}", localVarPathStringorderId)
		  Dim localVarPathStringreturnId As String = returnId.ToString
		  
		  localVarPath = localVarPath.ReplaceAllB("{returnId}", localVarPathStringreturnId)
		  
		  
		  AddHandler localVarHTTPSocket.PageReceived, addressof me.SetReturnDecision_handler
		  AddHandler localVarHTTPSocket.Error, addressof Me.SetReturnDecision_error
		  
		  
		  localVarHTTPSocket.SendRequest("POST", Me.BasePath + localVarPath)
		  if localVarHTTPSocket.LastErrorCode <> 0 then
		    Dim localVarException As New OpenAPIClient.OpenAPIClientException(localVarHTTPSocket.LastErrorCode)
			Raise localVarException
		  end if
		  
		End Sub
	#tag EndMethod

	#tag Method, Flags = &h21
		Private Function SetReturnDecisionPrivateFuncDeserializeResponse(HTTPStatus As Integer, Headers As InternetHeaders, error As OpenAPIClient.OpenAPIClientException, Content As String, ByRef outData As OpenAPIClient.Models.EmptyApiResponse) As Boolean
		  Dim contentType As String = Headers.Value("Content-Type")
		  Dim contentEncoding As TextEncoding = OpenAPIClient.EncodingFromContentType(contentType)
		  Content = DefineEncoding(Content, contentEncoding)
		  
		  If HTTPStatus > 199 and HTTPStatus < 300 then
		    If contentType.LeftB(16) = "application/json" then
		      
			  outData = New OpenAPIClient.Models.EmptyApiResponse
			  Try
		        Xoson.fromJSON(outData, Content.toText())

		      Catch e As JSONException
		        error.Message = error.Message + " with JSON parse exception: " + e.Message
		        error.ErrorNumber = kErrorInvalidJSON
		        Return False
		        
		      Catch e As Xojo.Data.InvalidJSONException
		        error.Message = error.Message + " with Xojo.Data.JSON parse exception: " + e.Message
		        error.ErrorNumber = kErrorInvalidJSON
		        Return False
		        
		      Catch e As Xoson.XosonException
		        error.Message = error.Message + " with Xoson parse exception: " + e.Message
		        error.ErrorNumber = kErrorXosonProblem
		        Return False

		      End Try
		      
		      
		    ElseIf contentType.LeftB(19) = "multipart/form-data" then
		      error.Message = "Unsupported media type: " + contentType
		      error.ErrorNumber = kErrorUnsupportedMediaType
		      Return False

		    ElseIf contentType.LeftB(33) = "application/x-www-form-urlencoded" then
		      error.Message = "Unsupported media type: " + contentType
		      error.ErrorNumber = kErrorUnsupportedMediaType
		      Return False

		    Else
		      error.Message = "Unsupported media type: " + contentType
		      error.ErrorNumber = kErrorUnsupportedMediaType
		      Return False

		    End If
		  Else
		    error.Message = error.Message + ". " + Content
			error.ErrorNumber = kErrorHTTPFail
		    Return False
		  End If
		  
		  Return True
		End Function
	#tag EndMethod

	#tag Method, Flags = &h21
		Private Sub SetReturnDecision_error(sender As HTTPSecureSocket, Code As Integer)
		  If sender <> nil Then sender.Close()

		  Dim error As New OpenAPIClient.OpenAPIClientException(Code)
		  Dim data As OpenAPIClient.Models.EmptyApiResponse
		  CallbackHandler.SetReturnDecisionCallback(error, data)
		End Sub
	#tag EndMethod

	#tag Method, Flags = &h21
		Private Sub SetReturnDecision_handler(sender As HTTPSecureSocket, URL As String, HTTPStatus As Integer, Headers As InternetHeaders, Content As String)
		  #Pragma Unused URL
		  

		  If sender <> nil Then sender.Close()
		  
		  Dim error As New OpenAPIClient.OpenAPIClientException(HTTPStatus, "", Content)
		  
		  Dim data As OpenAPIClient.Models.EmptyApiResponse
		  Call SetReturnDecisionPrivateFuncDeserializeResponse(HTTPStatus, Headers, error, Content, data)
		  
		  CallbackHandler.SetReturnDecisionCallback(error, data)
		End Sub
	#tag EndMethod




	#tag Method, Flags = &h0
		Sub SubmitReturnDecision(, campaignId As Int64, orderId As Int64, returnId As Int64)
		  // Operation submitReturnDecision
		  // Подтверждение решения по возврату
		  // - 
		  // - parameter campaignId: (path) Идентификатор кампании в API и магазина в кабинете. Каждая кампания в API соответствует магазину в кабинете.  Чтобы узнать идентификаторы своих магазинов, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html)  
		  // - parameter orderId: (path) Идентификатор заказа. 
		  // - parameter returnId: (path) Идентификатор возврата. 
		  //
		  // Invokes ReturnsApiCallbackHandler.SubmitReturnDecisionCallback(EmptyApiResponse) on completion. 
		  //
		  // - POST /campaigns/{campaignId}/orders/{orderId}/returns/{returnId}/decision/submit
		  // - Подтверждает выбранное решение по возврату, отправленное в запросе [POST campaigns/{campaignId}/orders/{orderId}/returns/{returnId}/decision](../../reference/orders/setReturnDecision.md).  |**⚙️ Лимит:** 10 000 запросов в час| |-| 
		  // - defaultResponse: Nil
		  //
		  // - OAuth:
		  //   - type: oauth2
		  //   - name: OAuth
		  //
		  
		  Dim localVarHTTPSocket As New HTTPSecureSocket
		  Me.PrivateFuncPrepareSocket(localVarHTTPSocket)
		  
		  
		  
		  


		  Dim localVarPath As String = "/campaigns/{campaignId}/orders/{orderId}/returns/{returnId}/decision/submit"
		  
		  Dim localVarPathStringcampaignId As String = campaignId.ToString
		  
		  localVarPath = localVarPath.ReplaceAllB("{campaignId}", localVarPathStringcampaignId)
		  Dim localVarPathStringorderId As String = orderId.ToString
		  
		  localVarPath = localVarPath.ReplaceAllB("{orderId}", localVarPathStringorderId)
		  Dim localVarPathStringreturnId As String = returnId.ToString
		  
		  localVarPath = localVarPath.ReplaceAllB("{returnId}", localVarPathStringreturnId)
		  
		  
		  AddHandler localVarHTTPSocket.PageReceived, addressof me.SubmitReturnDecision_handler
		  AddHandler localVarHTTPSocket.Error, addressof Me.SubmitReturnDecision_error
		  
		  
		  localVarHTTPSocket.SendRequest("POST", Me.BasePath + localVarPath)
		  if localVarHTTPSocket.LastErrorCode <> 0 then
		    Dim localVarException As New OpenAPIClient.OpenAPIClientException(localVarHTTPSocket.LastErrorCode)
			Raise localVarException
		  end if
		  
		End Sub
	#tag EndMethod

	#tag Method, Flags = &h21
		Private Function SubmitReturnDecisionPrivateFuncDeserializeResponse(HTTPStatus As Integer, Headers As InternetHeaders, error As OpenAPIClient.OpenAPIClientException, Content As String, ByRef outData As OpenAPIClient.Models.EmptyApiResponse) As Boolean
		  Dim contentType As String = Headers.Value("Content-Type")
		  Dim contentEncoding As TextEncoding = OpenAPIClient.EncodingFromContentType(contentType)
		  Content = DefineEncoding(Content, contentEncoding)
		  
		  If HTTPStatus > 199 and HTTPStatus < 300 then
		    If contentType.LeftB(16) = "application/json" then
		      
			  outData = New OpenAPIClient.Models.EmptyApiResponse
			  Try
		        Xoson.fromJSON(outData, Content.toText())

		      Catch e As JSONException
		        error.Message = error.Message + " with JSON parse exception: " + e.Message
		        error.ErrorNumber = kErrorInvalidJSON
		        Return False
		        
		      Catch e As Xojo.Data.InvalidJSONException
		        error.Message = error.Message + " with Xojo.Data.JSON parse exception: " + e.Message
		        error.ErrorNumber = kErrorInvalidJSON
		        Return False
		        
		      Catch e As Xoson.XosonException
		        error.Message = error.Message + " with Xoson parse exception: " + e.Message
		        error.ErrorNumber = kErrorXosonProblem
		        Return False

		      End Try
		      
		      
		    ElseIf contentType.LeftB(19) = "multipart/form-data" then
		      error.Message = "Unsupported media type: " + contentType
		      error.ErrorNumber = kErrorUnsupportedMediaType
		      Return False

		    ElseIf contentType.LeftB(33) = "application/x-www-form-urlencoded" then
		      error.Message = "Unsupported media type: " + contentType
		      error.ErrorNumber = kErrorUnsupportedMediaType
		      Return False

		    Else
		      error.Message = "Unsupported media type: " + contentType
		      error.ErrorNumber = kErrorUnsupportedMediaType
		      Return False

		    End If
		  Else
		    error.Message = error.Message + ". " + Content
			error.ErrorNumber = kErrorHTTPFail
		    Return False
		  End If
		  
		  Return True
		End Function
	#tag EndMethod

	#tag Method, Flags = &h21
		Private Sub SubmitReturnDecision_error(sender As HTTPSecureSocket, Code As Integer)
		  If sender <> nil Then sender.Close()

		  Dim error As New OpenAPIClient.OpenAPIClientException(Code)
		  Dim data As OpenAPIClient.Models.EmptyApiResponse
		  CallbackHandler.SubmitReturnDecisionCallback(error, data)
		End Sub
	#tag EndMethod

	#tag Method, Flags = &h21
		Private Sub SubmitReturnDecision_handler(sender As HTTPSecureSocket, URL As String, HTTPStatus As Integer, Headers As InternetHeaders, Content As String)
		  #Pragma Unused URL
		  

		  If sender <> nil Then sender.Close()
		  
		  Dim error As New OpenAPIClient.OpenAPIClientException(HTTPStatus, "", Content)
		  
		  Dim data As OpenAPIClient.Models.EmptyApiResponse
		  Call SubmitReturnDecisionPrivateFuncDeserializeResponse(HTTPStatus, Headers, error, Content, data)
		  
		  CallbackHandler.SubmitReturnDecisionCallback(error, data)
		End Sub
	#tag EndMethod






	#tag Method, Flags = &h21
		Private Function AuthenticationRequired(Realm As String, Headers As InternetHeaders, ByRef Name As String, ByRef Password As String) As Boolean
		  #Pragma Unused Realm
		  #Pragma Unused Headers
		  Name = Me.BasicAuthUser
		  Password = Me.BasicAuthPassword
		  Return True
		End Function
	#tag EndMethod

	#tag Method, Flags = &h21
		Private Sub PrivateFuncPrepareSocket(socket As HTTPSecureSocket)
		  socket.Secure = Me.useHTTPS
		  socket.ConnectionType = SSLSocket.TLSv12
		  socket.Port = Me.Port
		  socket.RequestHeaders.Delete("Accept")
		  socket.RequestHeaders.AppendHeader("Accept", "text/plain")
		  socket.RequestHeaders.AppendHeader("Accept", "application/json")
		  socket.RequestHeaders.AppendHeader("Content-Type", "application/json")

		  If Me.AdditionalHeaders <> Nil Then
		    For Each HeaderName As Variant In Me.AdditionalHeaders.Keys
		      Dim headerValueS As Variant = additionalHeaders.Value(HeaderName)
		      If headerValueS.IsArray Then
		        If headerValueS.ArrayElementType = Variant.TypeString Then
		          Dim values() As String = headerValueS
		          For Each value As String In values
		            socket.RequestHeaders.AppendHeader(HeaderName, value)
		          Next
		        Else
		          Raise New OpenAPIClient.OpenAPIClientException(kErrorInternal, "AdditionalHeaders only support Strings and String arrays as values.")
		        End If
		      Else
		        socket.RequestHeaders.AppendHeader(HeaderName, headerValueS.StringValue)
		      End If
		    Next
		  End If
		End Sub
	#tag EndMethod



	#tag Property, Flags = &h0
		AdditionalHeaders As Dictionary
	#tag EndProperty

	#tag Property, Flags = &h0
		BasePath As String = "https://api.partner.market.yandex.ru"
	#tag EndProperty

	#tag Property, Flags = &h0
		BasicAuthPassword As String
	#tag EndProperty

	#tag Property, Flags = &h0
		BasicAuthUser As String
	#tag EndProperty

	#tag Property, Flags = &h0
		CallbackHandler As OpenAPIClient.APIs.ReturnsApiCallbackHandler
	#tag EndProperty

	#tag Property, Flags = &h0
		Host As String = ""
	#tag EndProperty

	#tag Property, Flags = &h0
		Port As Integer
	#tag EndProperty

	#tag Property, Flags = &h0
		UseHTTPS As Boolean = true
	#tag EndProperty


	#tag ViewBehavior
		#tag ViewProperty
			Name="Name"
			Visible=true
			Group="ID"
			InitialValue=""
			Type="String"
			EditorType=""
		#tag EndViewProperty
		#tag ViewProperty
			Name="Index"
			Visible=true
			Group="ID"
			InitialValue="-2147483648"
			Type="Integer"
			EditorType=""
		#tag EndViewProperty
		#tag ViewProperty
			Name="Super"
			Visible=true
			Group="ID"
			InitialValue=""
			Type="String"
			EditorType=""
		#tag EndViewProperty
		#tag ViewProperty
			Name="Left"
			Visible=true
			Group="Position"
			InitialValue="0"
			Type="Integer"
			EditorType=""
		#tag EndViewProperty
		#tag ViewProperty
			Name="Top"
			Visible=true
			Group="Position"
			InitialValue="0"
			Type="Integer"
			EditorType=""
		#tag EndViewProperty
		#tag ViewProperty
			Name="BasePath"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="String"
			EditorType="MultiLineEditor"
		#tag EndViewProperty
		#tag ViewProperty
			Name="BasicAuthUser"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="String"
			EditorType="MultiLineEditor"
		#tag EndViewProperty
		#tag ViewProperty
			Name="BasicAuthPassword"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="String"
			EditorType="MultiLineEditor"
		#tag EndViewProperty
		#tag ViewProperty
			Name="UseHTTPS"
			Visible=false
			Group="Behavior"
			InitialValue="true"
			Type="Boolean"
			EditorType=""
		#tag EndViewProperty
		#tag ViewProperty
			Name="Port"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="Integer"
			EditorType=""
		#tag EndViewProperty
		#tag ViewProperty
			Name="Host"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="String"
			EditorType="MultiLineEditor"
		#tag EndViewProperty
	#tag EndViewBehavior
End Class
#tag EndClass
