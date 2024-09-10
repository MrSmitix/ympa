#tag Class
Protected Class OrderLabelsApi
	#tag Method, Flags = &h0
		Sub GenerateOrderLabel(downloadToFile As FolderItem, campaignId As Int64, orderId As Int64, shipmentId As Int64, boxId As Int64, format As OpenAPIClient.Models.PageFormatTypeOptional)
		  // Operation generateOrderLabel
		  // Готовый ярлык‑наклейка для коробки в заказе
		  // - parameter downloadToFile: The writable, non-existing path in the filesystem where the response body should be stored.
		  // - parameter campaignId: (path) Идентификатор кампании в API и магазина в кабинете. Каждая кампания в API соответствует магазину в кабинете.  Чтобы узнать идентификаторы своих магазинов, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html)  
		  // - parameter orderId: (path) Идентификатор заказа. 
		  // - parameter shipmentId: (path) Идентификатор грузоместа. 
		  // - parameter boxId: (path) Идентификатор коробки. 
		  // - parameter format: (query) Настройка размещения ярлыков на странице. Если параметра нет, возвращается PDF с ярлыками формата A6. (optional, default to Nil)
		  //
		  // Invokes OrderLabelsApiCallbackHandler.GenerateOrderLabelCallback(FolderItem) on completion. 
		  //
		  // - GET /campaigns/{campaignId}/orders/{orderId}/delivery/shipments/{shipmentId}/boxes/{boxId}/label
		  // - Формирует ярлык‑наклейку для коробки в заказе и возвращает ярлык в PDF‑файле.  |**⚙️ Лимит:** 1 000 000 запросов в час| |-| 
		  // - defaultResponse: Sample
		  //
		  // - OAuth:
		  //   - type: oauth2
		  //   - name: OAuth
		  //
		  
		  Dim localVarHTTPSocket As New HTTPSecureSocket
		  Me.PrivateFuncPrepareSocket(localVarHTTPSocket)
		  
		  Dim localVarQueryParams As String = "?"
		  If format <> nil Then localVarQueryParams = localVarQueryParams + EncodeURLComponent("format") + "=" + EncodeURLComponent(Xoson.toJSON(format))
		  

		  
		  


		  Dim localVarPath As String = "/campaigns/{campaignId}/orders/{orderId}/delivery/shipments/{shipmentId}/boxes/{boxId}/label"
		  
		  Dim localVarPathStringcampaignId As String = campaignId.ToString
		  
		  localVarPath = localVarPath.ReplaceAllB("{campaignId}", localVarPathStringcampaignId)
		  Dim localVarPathStringorderId As String = orderId.ToString
		  
		  localVarPath = localVarPath.ReplaceAllB("{orderId}", localVarPathStringorderId)
		  Dim localVarPathStringshipmentId As String = shipmentId.ToString
		  
		  localVarPath = localVarPath.ReplaceAllB("{shipmentId}", localVarPathStringshipmentId)
		  Dim localVarPathStringboxId As String = boxId.ToString
		  
		  localVarPath = localVarPath.ReplaceAllB("{boxId}", localVarPathStringboxId)
		  
		  AddHandler localVarHTTPSocket.DownloadComplete, addressof me.GenerateOrderLabel_handler
		  AddHandler localVarHTTPSocket.ReceiveProgress, addressof Me.GenerateOrderLabel_progress
		  
		  
		  
		  localVarHTTPSocket.SendRequest("GET", Me.BasePath + localVarPath + localVarQueryParams, downloadToFile)
		  if localVarHTTPSocket.LastErrorCode <> 0 then
		    Dim localVarException As New OpenAPIClient.OpenAPIClientException(localVarHTTPSocket.LastErrorCode)
			Raise localVarException
		  end if
		  
		End Sub
	#tag EndMethod


	#tag Method, Flags = &h21
		Private Sub GenerateOrderLabel_error(sender As HTTPSecureSocket, Code As Integer)
		  If sender <> nil Then sender.Close()

		  Dim error As New OpenAPIClient.OpenAPIClientException(Code)
		  Dim file As FolderItem
		  CallbackHandler.GenerateOrderLabelCallback(error, file)
		End Sub
	#tag EndMethod

	#tag Method, Flags = &h21
		Private Sub GenerateOrderLabel_handler(sender As HTTPSecureSocket, URL As String, HTTPStatus As Integer, Headers As InternetHeaders, File As FolderItem)
		  #Pragma Unused URL
		  #Pragma Unused Headers

		  If sender <> nil Then sender.Close()
		  
		  Dim error As New OpenAPIClient.OpenAPIClientException(HTTPStatus, "", "")
		  
		  
		  
		  CallbackHandler.GenerateOrderLabelCallback(error, File)
		End Sub
	#tag EndMethod

	#tag Method, Flags = &h21
		Private Sub GenerateOrderLabel_progress(sender As HTTPSecureSocket, BytesReceived As Integer, TotalBytes As Integer, NewData As String)
		  CallbackHandler.GenerateOrderLabelDownloadProgress(BytesReceived, TotalBytes)
		End Sub
	#tag EndMethod


	#tag Method, Flags = &h0
		Sub GenerateOrderLabels(downloadToFile As FolderItem, campaignId As Int64, orderId As Int64, format As OpenAPIClient.Models.PageFormatTypeOptional)
		  // Operation generateOrderLabels
		  // Готовые ярлыки‑наклейки на все коробки в одном заказе
		  // - parameter downloadToFile: The writable, non-existing path in the filesystem where the response body should be stored.
		  // - parameter campaignId: (path) Идентификатор кампании в API и магазина в кабинете. Каждая кампания в API соответствует магазину в кабинете.  Чтобы узнать идентификаторы своих магазинов, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html)  
		  // - parameter orderId: (path) Идентификатор заказа. 
		  // - parameter format: (query) Настройка размещения ярлыков на странице. Если параметра нет, возвращается PDF с ярлыками формата A6. (optional, default to Nil)
		  //
		  // Invokes OrderLabelsApiCallbackHandler.GenerateOrderLabelsCallback(FolderItem) on completion. 
		  //
		  // - GET /campaigns/{campaignId}/orders/{orderId}/delivery/labels
		  // - Возвращает PDF-файл с ярлыками, которые нужно наклеить на коробки перед отгрузкой. Подробно о том, зачем они нужны и как выглядят, рассказано [в Справке Маркета для продавцов](https://yandex.ru/support/marketplace/orders/fbs/packaging/marking.html).  На вход нужно передать идентификатор заказа и один необязательный параметр, который управляет версткой PDF-файла.  |**⚙️ Лимит:** 1 000 000 запросов в час| |-| 
		  // - defaultResponse: Sample
		  //
		  // - OAuth:
		  //   - type: oauth2
		  //   - name: OAuth
		  //
		  
		  Dim localVarHTTPSocket As New HTTPSecureSocket
		  Me.PrivateFuncPrepareSocket(localVarHTTPSocket)
		  
		  Dim localVarQueryParams As String = "?"
		  If format <> nil Then localVarQueryParams = localVarQueryParams + EncodeURLComponent("format") + "=" + EncodeURLComponent(Xoson.toJSON(format))
		  

		  
		  


		  Dim localVarPath As String = "/campaigns/{campaignId}/orders/{orderId}/delivery/labels"
		  
		  Dim localVarPathStringcampaignId As String = campaignId.ToString
		  
		  localVarPath = localVarPath.ReplaceAllB("{campaignId}", localVarPathStringcampaignId)
		  Dim localVarPathStringorderId As String = orderId.ToString
		  
		  localVarPath = localVarPath.ReplaceAllB("{orderId}", localVarPathStringorderId)
		  
		  AddHandler localVarHTTPSocket.DownloadComplete, addressof me.GenerateOrderLabels_handler
		  AddHandler localVarHTTPSocket.ReceiveProgress, addressof Me.GenerateOrderLabels_progress
		  
		  
		  
		  localVarHTTPSocket.SendRequest("GET", Me.BasePath + localVarPath + localVarQueryParams, downloadToFile)
		  if localVarHTTPSocket.LastErrorCode <> 0 then
		    Dim localVarException As New OpenAPIClient.OpenAPIClientException(localVarHTTPSocket.LastErrorCode)
			Raise localVarException
		  end if
		  
		End Sub
	#tag EndMethod


	#tag Method, Flags = &h21
		Private Sub GenerateOrderLabels_error(sender As HTTPSecureSocket, Code As Integer)
		  If sender <> nil Then sender.Close()

		  Dim error As New OpenAPIClient.OpenAPIClientException(Code)
		  Dim file As FolderItem
		  CallbackHandler.GenerateOrderLabelsCallback(error, file)
		End Sub
	#tag EndMethod

	#tag Method, Flags = &h21
		Private Sub GenerateOrderLabels_handler(sender As HTTPSecureSocket, URL As String, HTTPStatus As Integer, Headers As InternetHeaders, File As FolderItem)
		  #Pragma Unused URL
		  #Pragma Unused Headers

		  If sender <> nil Then sender.Close()
		  
		  Dim error As New OpenAPIClient.OpenAPIClientException(HTTPStatus, "", "")
		  
		  
		  
		  CallbackHandler.GenerateOrderLabelsCallback(error, File)
		End Sub
	#tag EndMethod

	#tag Method, Flags = &h21
		Private Sub GenerateOrderLabels_progress(sender As HTTPSecureSocket, BytesReceived As Integer, TotalBytes As Integer, NewData As String)
		  CallbackHandler.GenerateOrderLabelsDownloadProgress(BytesReceived, TotalBytes)
		End Sub
	#tag EndMethod


	#tag Method, Flags = &h0
		Sub GetOrderLabelsData(, campaignId As Int64, orderId As Int64)
		  // Operation getOrderLabelsData
		  // Данные для самостоятельного изготовления ярлыков
		  // - 
		  // - parameter campaignId: (path) Идентификатор кампании в API и магазина в кабинете. Каждая кампания в API соответствует магазину в кабинете.  Чтобы узнать идентификаторы своих магазинов, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html)  
		  // - parameter orderId: (path) Идентификатор заказа. 
		  //
		  // Invokes OrderLabelsApiCallbackHandler.GetOrderLabelsDataCallback(GetOrderLabelsDataResponse) on completion. 
		  //
		  // - GET /campaigns/{campaignId}/orders/{orderId}/delivery/labels/data
		  // - Возвращает информацию на ярлыках, которые клеятся на коробки в заказе.  |**⚙️ Лимит:** 1 000 000 запросов в час| |-| 
		  // - defaultResponse: Nil
		  //
		  // - OAuth:
		  //   - type: oauth2
		  //   - name: OAuth
		  //
		  
		  Dim localVarHTTPSocket As New HTTPSecureSocket
		  Me.PrivateFuncPrepareSocket(localVarHTTPSocket)
		  
		  
		  
		  


		  Dim localVarPath As String = "/campaigns/{campaignId}/orders/{orderId}/delivery/labels/data"
		  
		  Dim localVarPathStringcampaignId As String = campaignId.ToString
		  
		  localVarPath = localVarPath.ReplaceAllB("{campaignId}", localVarPathStringcampaignId)
		  Dim localVarPathStringorderId As String = orderId.ToString
		  
		  localVarPath = localVarPath.ReplaceAllB("{orderId}", localVarPathStringorderId)
		  
		  
		  AddHandler localVarHTTPSocket.PageReceived, addressof me.GetOrderLabelsData_handler
		  AddHandler localVarHTTPSocket.Error, addressof Me.GetOrderLabelsData_error
		  
		  
		  localVarHTTPSocket.SendRequest("GET", Me.BasePath + localVarPath)
		  if localVarHTTPSocket.LastErrorCode <> 0 then
		    Dim localVarException As New OpenAPIClient.OpenAPIClientException(localVarHTTPSocket.LastErrorCode)
			Raise localVarException
		  end if
		  
		End Sub
	#tag EndMethod

	#tag Method, Flags = &h21
		Private Function GetOrderLabelsDataPrivateFuncDeserializeResponse(HTTPStatus As Integer, Headers As InternetHeaders, error As OpenAPIClient.OpenAPIClientException, Content As String, ByRef outData As OpenAPIClient.Models.GetOrderLabelsDataResponse) As Boolean
		  Dim contentType As String = Headers.Value("Content-Type")
		  Dim contentEncoding As TextEncoding = OpenAPIClient.EncodingFromContentType(contentType)
		  Content = DefineEncoding(Content, contentEncoding)
		  
		  If HTTPStatus > 199 and HTTPStatus < 300 then
		    If contentType.LeftB(16) = "application/json" then
		      
			  outData = New OpenAPIClient.Models.GetOrderLabelsDataResponse
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
		Private Sub GetOrderLabelsData_error(sender As HTTPSecureSocket, Code As Integer)
		  If sender <> nil Then sender.Close()

		  Dim error As New OpenAPIClient.OpenAPIClientException(Code)
		  Dim data As OpenAPIClient.Models.GetOrderLabelsDataResponse
		  CallbackHandler.GetOrderLabelsDataCallback(error, data)
		End Sub
	#tag EndMethod

	#tag Method, Flags = &h21
		Private Sub GetOrderLabelsData_handler(sender As HTTPSecureSocket, URL As String, HTTPStatus As Integer, Headers As InternetHeaders, Content As String)
		  #Pragma Unused URL
		  

		  If sender <> nil Then sender.Close()
		  
		  Dim error As New OpenAPIClient.OpenAPIClientException(HTTPStatus, "", Content)
		  
		  Dim data As OpenAPIClient.Models.GetOrderLabelsDataResponse
		  Call GetOrderLabelsDataPrivateFuncDeserializeResponse(HTTPStatus, Headers, error, Content, data)
		  
		  CallbackHandler.GetOrderLabelsDataCallback(error, data)
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
		CallbackHandler As OpenAPIClient.APIs.OrderLabelsApiCallbackHandler
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
