#tag Class
Protected Class ShipmentsApi
	#tag Method, Flags = &h0
		Sub ConfirmShipment(, campaignId As Int64, shipmentId As Int64, Optional confirmShipmentRequest As OpenAPIClient.Models.ConfirmShipmentRequest)
		  // Operation confirmShipment
		  // Подтверждение отгрузки
		  // - 
		  // - parameter campaignId: (path) Идентификатор кампании в API и магазина в кабинете. Каждая кампания в API соответствует магазину в кабинете.  Чтобы узнать идентификаторы своих магазинов, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html)  
		  // - parameter shipmentId: (path) Идентификатор отгрузки. 
		  // - parameter confirmShipmentRequest: (body)  (optional)
		  //
		  // Invokes ShipmentsApiCallbackHandler.ConfirmShipmentCallback(EmptyApiResponse) on completion. 
		  //
		  // - POST /campaigns/{campaignId}/first-mile/shipments/{shipmentId}/confirm
		  // - Подтверждает отгрузку товаров в сортировочный центр или пункт приема заказов. |**⚙️ Лимит:** 100 запросов в час| |-| 
		  // - defaultResponse: Nil
		  //
		  // - OAuth:
		  //   - type: oauth2
		  //   - name: OAuth
		  //
		  
		  Dim localVarHTTPSocket As New HTTPSecureSocket
		  Me.PrivateFuncPrepareSocket(localVarHTTPSocket)
		  localVarHTTPSocket.SetRequestContent(Xoson.toJSON(confirmShipmentRequest), "application/json")
		  
		  
		  


		  Dim localVarPath As String = "/campaigns/{campaignId}/first-mile/shipments/{shipmentId}/confirm"
		  
		  Dim localVarPathStringcampaignId As String = campaignId.ToString
		  
		  localVarPath = localVarPath.ReplaceAllB("{campaignId}", localVarPathStringcampaignId)
		  Dim localVarPathStringshipmentId As String = shipmentId.ToString
		  
		  localVarPath = localVarPath.ReplaceAllB("{shipmentId}", localVarPathStringshipmentId)
		  
		  
		  AddHandler localVarHTTPSocket.PageReceived, addressof me.ConfirmShipment_handler
		  AddHandler localVarHTTPSocket.Error, addressof Me.ConfirmShipment_error
		  
		  
		  localVarHTTPSocket.SendRequest("POST", Me.BasePath + localVarPath)
		  if localVarHTTPSocket.LastErrorCode <> 0 then
		    Dim localVarException As New OpenAPIClient.OpenAPIClientException(localVarHTTPSocket.LastErrorCode)
			Raise localVarException
		  end if
		  
		End Sub
	#tag EndMethod

	#tag Method, Flags = &h21
		Private Function ConfirmShipmentPrivateFuncDeserializeResponse(HTTPStatus As Integer, Headers As InternetHeaders, error As OpenAPIClient.OpenAPIClientException, Content As String, ByRef outData As OpenAPIClient.Models.EmptyApiResponse) As Boolean
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
		Private Sub ConfirmShipment_error(sender As HTTPSecureSocket, Code As Integer)
		  If sender <> nil Then sender.Close()

		  Dim error As New OpenAPIClient.OpenAPIClientException(Code)
		  Dim data As OpenAPIClient.Models.EmptyApiResponse
		  CallbackHandler.ConfirmShipmentCallback(error, data)
		End Sub
	#tag EndMethod

	#tag Method, Flags = &h21
		Private Sub ConfirmShipment_handler(sender As HTTPSecureSocket, URL As String, HTTPStatus As Integer, Headers As InternetHeaders, Content As String)
		  #Pragma Unused URL
		  

		  If sender <> nil Then sender.Close()
		  
		  Dim error As New OpenAPIClient.OpenAPIClientException(HTTPStatus, "", Content)
		  
		  Dim data As OpenAPIClient.Models.EmptyApiResponse
		  Call ConfirmShipmentPrivateFuncDeserializeResponse(HTTPStatus, Headers, error, Content, data)
		  
		  CallbackHandler.ConfirmShipmentCallback(error, data)
		End Sub
	#tag EndMethod




	#tag Method, Flags = &h0
		Sub DownloadShipmentAct(downloadToFile As FolderItem, campaignId As Int64, shipmentId As Int64)
		  // Operation downloadShipmentAct
		  // Получение акта приема-передачи
		  // - parameter downloadToFile: The writable, non-existing path in the filesystem where the response body should be stored.
		  // - parameter campaignId: (path) Идентификатор кампании в API и магазина в кабинете. Каждая кампания в API соответствует магазину в кабинете.  Чтобы узнать идентификаторы своих магазинов, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html)  
		  // - parameter shipmentId: (path) Идентификатор отгрузки. 
		  //
		  // Invokes ShipmentsApiCallbackHandler.DownloadShipmentActCallback(FolderItem) on completion. 
		  //
		  // - GET /campaigns/{campaignId}/first-mile/shipments/{shipmentId}/act
		  // - {% note warning "Экспресс‑доставка" %}  Если ваш магазин подключен к экспресс‑доставке и вы отгружаете заказы курьерам Яндекс Go, подготавливать акт приема‑передачи не нужно.  {% endnote %}  Запрос формирует акт приема-передачи заказов, входящих в отгрузку, и возвращает акт в формате PDF. В акте содержатся собранные и готовые к отправке заказы.  При формировании акта Маркет автоматически находит и подставляет в шаблон следующие данные:  {% cut "Данные, из которых Маркет формирует акт" %}  | **Данные в акте**                                         | **Описание**                                                                                                                                                                                                                                                         | | --------------------------------------------------------- | -------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------- | | Дата                                                      | Дата запроса.                                                                                                                                                                                                                                                        | | Отправитель                                               | Название вашего юридического лица, указанное в кабинете продавца на Маркете.                                                                                                                                                                                         | | Исполнитель                                               | Название юридического лица сортировочного центра или службы доставки.                                                                                                                                                                                                | | № отправления в системе заказчика                         | Ваш идентификатор заказа, который вы указали в ответе на запрос [POST order/accept](../../pushapi/reference/orderAccept.md) от Маркета.                                                                                                                              | | № отправления в системе исполнителя (субподрядчика)       | Идентификатор заказа на Маркете, как в выходных данных запроса [GET campaigns/{campaignId}/orders](../../reference/orders/getOrders.md).                                                                                                                             | | Объявленная ценность                                      | Общая сумма заказа без учета стоимости доставки, как в выходных данных запроса [GET campaigns/{campaignId}/orders](../../reference/orders/getOrders.md) или [GET campaigns/{campaignId}/orders/{orderId}](../../reference/orders/getOrder.md).                       | | Вес                                                       | Масса брутто грузового места (суммарная масса упаковки и содержимого), как в выходных данных запроса [GET campaigns/{campaignId}/orders](../../reference/orders/getOrders.md) или [GET campaigns/{campaignId}/orders/{orderId}](../../reference/orders/getOrder.md). | | Количество мест                                           | Количество грузовых мест в заказе, как в выходных данных запроса [GET campaigns/{campaignId}/orders](../../reference/orders/getOrders.md) или [GET campaigns/{campaignId}/orders/{orderId}](../../reference/orders/getOrder.md).                                     |  {% endcut %}  Остальные поля нужно заполнить самостоятельно в распечатанном акте. |**⚙️ Лимит:** 100 запросов в час| |-| 
		  // - defaultResponse: Sample
		  //
		  // - OAuth:
		  //   - type: oauth2
		  //   - name: OAuth
		  //
		  
		  Dim localVarHTTPSocket As New HTTPSecureSocket
		  Me.PrivateFuncPrepareSocket(localVarHTTPSocket)
		  
		  
		  
		  


		  Dim localVarPath As String = "/campaigns/{campaignId}/first-mile/shipments/{shipmentId}/act"
		  
		  Dim localVarPathStringcampaignId As String = campaignId.ToString
		  
		  localVarPath = localVarPath.ReplaceAllB("{campaignId}", localVarPathStringcampaignId)
		  Dim localVarPathStringshipmentId As String = shipmentId.ToString
		  
		  localVarPath = localVarPath.ReplaceAllB("{shipmentId}", localVarPathStringshipmentId)
		  
		  AddHandler localVarHTTPSocket.DownloadComplete, addressof me.DownloadShipmentAct_handler
		  AddHandler localVarHTTPSocket.ReceiveProgress, addressof Me.DownloadShipmentAct_progress
		  
		  
		  
		  localVarHTTPSocket.SendRequest("GET", Me.BasePath + localVarPath, downloadToFile)
		  if localVarHTTPSocket.LastErrorCode <> 0 then
		    Dim localVarException As New OpenAPIClient.OpenAPIClientException(localVarHTTPSocket.LastErrorCode)
			Raise localVarException
		  end if
		  
		End Sub
	#tag EndMethod


	#tag Method, Flags = &h21
		Private Sub DownloadShipmentAct_error(sender As HTTPSecureSocket, Code As Integer)
		  If sender <> nil Then sender.Close()

		  Dim error As New OpenAPIClient.OpenAPIClientException(Code)
		  Dim file As FolderItem
		  CallbackHandler.DownloadShipmentActCallback(error, file)
		End Sub
	#tag EndMethod

	#tag Method, Flags = &h21
		Private Sub DownloadShipmentAct_handler(sender As HTTPSecureSocket, URL As String, HTTPStatus As Integer, Headers As InternetHeaders, File As FolderItem)
		  #Pragma Unused URL
		  #Pragma Unused Headers

		  If sender <> nil Then sender.Close()
		  
		  Dim error As New OpenAPIClient.OpenAPIClientException(HTTPStatus, "", "")
		  
		  
		  
		  CallbackHandler.DownloadShipmentActCallback(error, File)
		End Sub
	#tag EndMethod

	#tag Method, Flags = &h21
		Private Sub DownloadShipmentAct_progress(sender As HTTPSecureSocket, BytesReceived As Integer, TotalBytes As Integer, NewData As String)
		  CallbackHandler.DownloadShipmentActDownloadProgress(BytesReceived, TotalBytes)
		End Sub
	#tag EndMethod


	#tag Method, Flags = &h0
		Sub DownloadShipmentDiscrepancyAct(downloadToFile As FolderItem, campaignId As Int64, shipmentId As Int64)
		  // Operation downloadShipmentDiscrepancyAct
		  // Получение акта расхождений
		  // - parameter downloadToFile: The writable, non-existing path in the filesystem where the response body should be stored.
		  // - parameter campaignId: (path) Идентификатор кампании в API и магазина в кабинете. Каждая кампания в API соответствует магазину в кабинете.  Чтобы узнать идентификаторы своих магазинов, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html)  
		  // - parameter shipmentId: (path) Идентификатор отгрузки. 
		  //
		  // Invokes ShipmentsApiCallbackHandler.DownloadShipmentDiscrepancyActCallback(FolderItem) on completion. 
		  //
		  // - GET /campaigns/{campaignId}/first-mile/shipments/{shipmentId}/discrepancy-act
		  // - Возвращает акт расхождений для заданной отгрузки. |**⚙️ Лимит:** 200 запросов в час| |-| 
		  // - defaultResponse: Sample
		  //
		  // - OAuth:
		  //   - type: oauth2
		  //   - name: OAuth
		  //
		  
		  Dim localVarHTTPSocket As New HTTPSecureSocket
		  Me.PrivateFuncPrepareSocket(localVarHTTPSocket)
		  
		  
		  
		  


		  Dim localVarPath As String = "/campaigns/{campaignId}/first-mile/shipments/{shipmentId}/discrepancy-act"
		  
		  Dim localVarPathStringcampaignId As String = campaignId.ToString
		  
		  localVarPath = localVarPath.ReplaceAllB("{campaignId}", localVarPathStringcampaignId)
		  Dim localVarPathStringshipmentId As String = shipmentId.ToString
		  
		  localVarPath = localVarPath.ReplaceAllB("{shipmentId}", localVarPathStringshipmentId)
		  
		  AddHandler localVarHTTPSocket.DownloadComplete, addressof me.DownloadShipmentDiscrepancyAct_handler
		  AddHandler localVarHTTPSocket.ReceiveProgress, addressof Me.DownloadShipmentDiscrepancyAct_progress
		  
		  
		  
		  localVarHTTPSocket.SendRequest("GET", Me.BasePath + localVarPath, downloadToFile)
		  if localVarHTTPSocket.LastErrorCode <> 0 then
		    Dim localVarException As New OpenAPIClient.OpenAPIClientException(localVarHTTPSocket.LastErrorCode)
			Raise localVarException
		  end if
		  
		End Sub
	#tag EndMethod


	#tag Method, Flags = &h21
		Private Sub DownloadShipmentDiscrepancyAct_error(sender As HTTPSecureSocket, Code As Integer)
		  If sender <> nil Then sender.Close()

		  Dim error As New OpenAPIClient.OpenAPIClientException(Code)
		  Dim file As FolderItem
		  CallbackHandler.DownloadShipmentDiscrepancyActCallback(error, file)
		End Sub
	#tag EndMethod

	#tag Method, Flags = &h21
		Private Sub DownloadShipmentDiscrepancyAct_handler(sender As HTTPSecureSocket, URL As String, HTTPStatus As Integer, Headers As InternetHeaders, File As FolderItem)
		  #Pragma Unused URL
		  #Pragma Unused Headers

		  If sender <> nil Then sender.Close()
		  
		  Dim error As New OpenAPIClient.OpenAPIClientException(HTTPStatus, "", "")
		  
		  
		  
		  CallbackHandler.DownloadShipmentDiscrepancyActCallback(error, File)
		End Sub
	#tag EndMethod

	#tag Method, Flags = &h21
		Private Sub DownloadShipmentDiscrepancyAct_progress(sender As HTTPSecureSocket, BytesReceived As Integer, TotalBytes As Integer, NewData As String)
		  CallbackHandler.DownloadShipmentDiscrepancyActDownloadProgress(BytesReceived, TotalBytes)
		End Sub
	#tag EndMethod


	#tag Method, Flags = &h0
		Sub DownloadShipmentInboundAct(downloadToFile As FolderItem, campaignId As Int64, shipmentId As Int64)
		  // Operation downloadShipmentInboundAct
		  // Получение фактического акта приема-передачи
		  // - parameter downloadToFile: The writable, non-existing path in the filesystem where the response body should be stored.
		  // - parameter campaignId: (path) Идентификатор кампании в API и магазина в кабинете. Каждая кампания в API соответствует магазину в кабинете.  Чтобы узнать идентификаторы своих магазинов, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html)  
		  // - parameter shipmentId: (path) Идентификатор отгрузки. 
		  //
		  // Invokes ShipmentsApiCallbackHandler.DownloadShipmentInboundActCallback(FolderItem) on completion. 
		  //
		  // - GET /campaigns/{campaignId}/first-mile/shipments/{shipmentId}/inbound-act
		  // - Возвращает фактический акт приема-передачи для заданной отгрузки.  Такой акт становится доступен спустя несколько часов после завершения отгрузки. Он может понадобиться, если после отгрузки обнаружатся расхождения.  |**⚙️ Лимит:** 200 запросов в час| |-| 
		  // - defaultResponse: Sample
		  //
		  // - OAuth:
		  //   - type: oauth2
		  //   - name: OAuth
		  //
		  
		  Dim localVarHTTPSocket As New HTTPSecureSocket
		  Me.PrivateFuncPrepareSocket(localVarHTTPSocket)
		  
		  
		  
		  


		  Dim localVarPath As String = "/campaigns/{campaignId}/first-mile/shipments/{shipmentId}/inbound-act"
		  
		  Dim localVarPathStringcampaignId As String = campaignId.ToString
		  
		  localVarPath = localVarPath.ReplaceAllB("{campaignId}", localVarPathStringcampaignId)
		  Dim localVarPathStringshipmentId As String = shipmentId.ToString
		  
		  localVarPath = localVarPath.ReplaceAllB("{shipmentId}", localVarPathStringshipmentId)
		  
		  AddHandler localVarHTTPSocket.DownloadComplete, addressof me.DownloadShipmentInboundAct_handler
		  AddHandler localVarHTTPSocket.ReceiveProgress, addressof Me.DownloadShipmentInboundAct_progress
		  
		  
		  
		  localVarHTTPSocket.SendRequest("GET", Me.BasePath + localVarPath, downloadToFile)
		  if localVarHTTPSocket.LastErrorCode <> 0 then
		    Dim localVarException As New OpenAPIClient.OpenAPIClientException(localVarHTTPSocket.LastErrorCode)
			Raise localVarException
		  end if
		  
		End Sub
	#tag EndMethod


	#tag Method, Flags = &h21
		Private Sub DownloadShipmentInboundAct_error(sender As HTTPSecureSocket, Code As Integer)
		  If sender <> nil Then sender.Close()

		  Dim error As New OpenAPIClient.OpenAPIClientException(Code)
		  Dim file As FolderItem
		  CallbackHandler.DownloadShipmentInboundActCallback(error, file)
		End Sub
	#tag EndMethod

	#tag Method, Flags = &h21
		Private Sub DownloadShipmentInboundAct_handler(sender As HTTPSecureSocket, URL As String, HTTPStatus As Integer, Headers As InternetHeaders, File As FolderItem)
		  #Pragma Unused URL
		  #Pragma Unused Headers

		  If sender <> nil Then sender.Close()
		  
		  Dim error As New OpenAPIClient.OpenAPIClientException(HTTPStatus, "", "")
		  
		  
		  
		  CallbackHandler.DownloadShipmentInboundActCallback(error, File)
		End Sub
	#tag EndMethod

	#tag Method, Flags = &h21
		Private Sub DownloadShipmentInboundAct_progress(sender As HTTPSecureSocket, BytesReceived As Integer, TotalBytes As Integer, NewData As String)
		  CallbackHandler.DownloadShipmentInboundActDownloadProgress(BytesReceived, TotalBytes)
		End Sub
	#tag EndMethod


	#tag Method, Flags = &h0
		Sub DownloadShipmentPalletLabels(downloadToFile As FolderItem, campaignId As Int64, shipmentId As Int64, format As OpenAPIClient.Models.ShipmentPalletLabelPageFormatTypeOptional)
		  // Operation downloadShipmentPalletLabels
		  // Ярлыки для доверительной приемки (FBS)
		  // - parameter downloadToFile: The writable, non-existing path in the filesystem where the response body should be stored.
		  // - parameter campaignId: (path) Идентификатор кампании в API и магазина в кабинете. Каждая кампания в API соответствует магазину в кабинете.  Чтобы узнать идентификаторы своих магазинов, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html)  
		  // - parameter shipmentId: (path) Идентификатор отгрузки. 
		  // - parameter format: (query) Формат страниц PDF-файла с ярлыками:  * &#x60;A4&#x60; — по 16 ярлыков на странице. * &#x60;A8&#x60; — по одному ярлыку на странице.  (optional, default to Nil)
		  //
		  // Invokes ShipmentsApiCallbackHandler.DownloadShipmentPalletLabelsCallback(FolderItem) on completion. 
		  //
		  // - GET /campaigns/{campaignId}/first-mile/shipments/{shipmentId}/pallet/labels
		  // - PDF-файл с ярлыками на каждый короб или палету в отгрузке для доверительной приемки. Подробнее про доверительную приемку написано в [Справке Маркета](https://yandex.ru/support/marketplace/orders/fbs/process.html#acceptance).  Распечатайте по несколько копий каждого ярлыка: на одну тару нужно наклеить минимум 2 ярлыка с разных сторон.  Количество упаковок в отгрузке задается в запросе [PUT campaigns/{campaignId}/first-mile/shipments/{shipmentId}/pallets](../../reference/shipments/setShipmentPalletsCount.md). |**⚙️ Лимит:** 200 запросов в час| |-| 
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
		  

		  
		  


		  Dim localVarPath As String = "/campaigns/{campaignId}/first-mile/shipments/{shipmentId}/pallet/labels"
		  
		  Dim localVarPathStringcampaignId As String = campaignId.ToString
		  
		  localVarPath = localVarPath.ReplaceAllB("{campaignId}", localVarPathStringcampaignId)
		  Dim localVarPathStringshipmentId As String = shipmentId.ToString
		  
		  localVarPath = localVarPath.ReplaceAllB("{shipmentId}", localVarPathStringshipmentId)
		  
		  AddHandler localVarHTTPSocket.DownloadComplete, addressof me.DownloadShipmentPalletLabels_handler
		  AddHandler localVarHTTPSocket.ReceiveProgress, addressof Me.DownloadShipmentPalletLabels_progress
		  
		  
		  
		  localVarHTTPSocket.SendRequest("GET", Me.BasePath + localVarPath + localVarQueryParams, downloadToFile)
		  if localVarHTTPSocket.LastErrorCode <> 0 then
		    Dim localVarException As New OpenAPIClient.OpenAPIClientException(localVarHTTPSocket.LastErrorCode)
			Raise localVarException
		  end if
		  
		End Sub
	#tag EndMethod


	#tag Method, Flags = &h21
		Private Sub DownloadShipmentPalletLabels_error(sender As HTTPSecureSocket, Code As Integer)
		  If sender <> nil Then sender.Close()

		  Dim error As New OpenAPIClient.OpenAPIClientException(Code)
		  Dim file As FolderItem
		  CallbackHandler.DownloadShipmentPalletLabelsCallback(error, file)
		End Sub
	#tag EndMethod

	#tag Method, Flags = &h21
		Private Sub DownloadShipmentPalletLabels_handler(sender As HTTPSecureSocket, URL As String, HTTPStatus As Integer, Headers As InternetHeaders, File As FolderItem)
		  #Pragma Unused URL
		  #Pragma Unused Headers

		  If sender <> nil Then sender.Close()
		  
		  Dim error As New OpenAPIClient.OpenAPIClientException(HTTPStatus, "", "")
		  
		  
		  
		  CallbackHandler.DownloadShipmentPalletLabelsCallback(error, File)
		End Sub
	#tag EndMethod

	#tag Method, Flags = &h21
		Private Sub DownloadShipmentPalletLabels_progress(sender As HTTPSecureSocket, BytesReceived As Integer, TotalBytes As Integer, NewData As String)
		  CallbackHandler.DownloadShipmentPalletLabelsDownloadProgress(BytesReceived, TotalBytes)
		End Sub
	#tag EndMethod


	#tag Method, Flags = &h0
		Sub DownloadShipmentReceptionTransferAct(downloadToFile As FolderItem, campaignId As Int64, Optional warehouseId As Xoson.O.OptionalInteger)
		  // Operation downloadShipmentReceptionTransferAct
		  // Подтверждение ближайшей отгрузки и получение акта приема-передачи для нее
		  // - parameter downloadToFile: The writable, non-existing path in the filesystem where the response body should be stored.
		  // - parameter campaignId: (path) Идентификатор кампании в API и магазина в кабинете. Каждая кампания в API соответствует магазину в кабинете.  Чтобы узнать идентификаторы своих магазинов, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html)  
		  // - parameter warehouseId: (query) Идентификатор склада. (optional, default to 0)
		  //
		  // Invokes ShipmentsApiCallbackHandler.DownloadShipmentReceptionTransferActCallback(FolderItem) on completion. 
		  //
		  // - GET /campaigns/{campaignId}/shipments/reception-transfer-act
		  // - Запрос подтверждает ближайшую отгрузку и возвращает акт приема-передачи в формате PDF.  {% note warning "Экспресс‑доставка" %}  Если ваш магазин подключен к экспресс‑доставке и вы отгружаете заказы курьерам [Яндекс Go](https://go.yandex/), подготавливать акт приема‑передачи не нужно.  {% endnote %}  В акт входят собранные и готовые к отправке заказы, которые отгружаются в сортировочный центр или пункт приема или курьерам Маркета.  При формировании акта Маркет автоматически находит и подставляет в шаблон следующие данные:  {% cut "Данные, из которых Маркет формирует акт" %}  | **Данные в акте**                                   | **Описание**                                                                                                                                                                                                                                                         | | --------------------------------------------------- | -------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------- | | Отправитель                                         | Название вашего юридического лица, указанное в кабинете продавца на Маркете.                                                                                                                                                                                         | | Исполнитель                                         | Название юридического лица сортировочного центра или службы доставки.                                                                                                                                                                                                | | № отправления в системе заказчика                   | Ваш идентификатор заказа, который вы указали в ответе на запрос [POST order/accept](../../pushapi/reference/orderAccept.md) от Маркета.                                                                                                                              | | № отправления в системе исполнителя (субподрядчика) | Идентификатор заказа на Маркете, как в выходных данных запроса [GET campaigns/{campaignId}/orders](../../reference/orders/getOrders.md).                                                                                                                             | | Объявленная ценность                                | Общая сумма заказа без учета стоимости доставки, как в выходных данных запроса [GET campaigns/{campaignId}/orders](../../reference/orders/getOrders.md) или [GET campaigns/{campaignId}/orders/{orderId}](../../reference/orders/getOrder.md).                       | | Стоимость всех товаров в заказе                     | Стоимость всех заказанных товаров.                                                                                                                                                                                                                                   | | Вес                                                 | Масса брутто грузового места (суммарная масса упаковки и содержимого), как в выходных данных запроса [GET campaigns/{campaignId}/orders](../../reference/orders/getOrders.md) или [GET campaigns/{campaignId}/orders/{orderId}](../../reference/orders/getOrder.md). | | Количество мест                                     | Количество грузовых мест в заказе, как в выходных данных запроса [GET campaigns/{campaignId}/orders](../../reference/orders/getOrders.md) или [GET campaigns/{campaignId}/orders/{orderId}](../../reference/orders/getOrder.md).                                     |  {% endcut %}  Остальные поля нужно заполнить самостоятельно в распечатанном акте. |**⚙️ Лимит:** 100 запросов в час| |-| 
		  // - defaultResponse: Sample
		  //
		  // - OAuth:
		  //   - type: oauth2
		  //   - name: OAuth
		  //
		  
		  Dim localVarHTTPSocket As New HTTPSecureSocket
		  Me.PrivateFuncPrepareSocket(localVarHTTPSocket)
		  
		  Dim localVarQueryParams As String = "?"
		  If warehouseId <> nil Then localVarQueryParams = localVarQueryParams + EncodeURLComponent("warehouse_id") + "=" + EncodeURLComponent(warehouseId.ToString)
		  

		  
		  


		  Dim localVarPath As String = "/campaigns/{campaignId}/shipments/reception-transfer-act"
		  
		  Dim localVarPathStringcampaignId As String = campaignId.ToString
		  
		  localVarPath = localVarPath.ReplaceAllB("{campaignId}", localVarPathStringcampaignId)
		  
		  AddHandler localVarHTTPSocket.DownloadComplete, addressof me.DownloadShipmentReceptionTransferAct_handler
		  AddHandler localVarHTTPSocket.ReceiveProgress, addressof Me.DownloadShipmentReceptionTransferAct_progress
		  
		  
		  
		  localVarHTTPSocket.SendRequest("GET", Me.BasePath + localVarPath + localVarQueryParams, downloadToFile)
		  if localVarHTTPSocket.LastErrorCode <> 0 then
		    Dim localVarException As New OpenAPIClient.OpenAPIClientException(localVarHTTPSocket.LastErrorCode)
			Raise localVarException
		  end if
		  
		End Sub
	#tag EndMethod


	#tag Method, Flags = &h21
		Private Sub DownloadShipmentReceptionTransferAct_error(sender As HTTPSecureSocket, Code As Integer)
		  If sender <> nil Then sender.Close()

		  Dim error As New OpenAPIClient.OpenAPIClientException(Code)
		  Dim file As FolderItem
		  CallbackHandler.DownloadShipmentReceptionTransferActCallback(error, file)
		End Sub
	#tag EndMethod

	#tag Method, Flags = &h21
		Private Sub DownloadShipmentReceptionTransferAct_handler(sender As HTTPSecureSocket, URL As String, HTTPStatus As Integer, Headers As InternetHeaders, File As FolderItem)
		  #Pragma Unused URL
		  #Pragma Unused Headers

		  If sender <> nil Then sender.Close()
		  
		  Dim error As New OpenAPIClient.OpenAPIClientException(HTTPStatus, "", "")
		  
		  
		  
		  CallbackHandler.DownloadShipmentReceptionTransferActCallback(error, File)
		End Sub
	#tag EndMethod

	#tag Method, Flags = &h21
		Private Sub DownloadShipmentReceptionTransferAct_progress(sender As HTTPSecureSocket, BytesReceived As Integer, TotalBytes As Integer, NewData As String)
		  CallbackHandler.DownloadShipmentReceptionTransferActDownloadProgress(BytesReceived, TotalBytes)
		End Sub
	#tag EndMethod


	#tag Method, Flags = &h0
		Sub DownloadShipmentTransportationWaybill(downloadToFile As FolderItem, campaignId As Int64, shipmentId As Int64)
		  // Operation downloadShipmentTransportationWaybill
		  // Получение транспортной накладной
		  // - parameter downloadToFile: The writable, non-existing path in the filesystem where the response body should be stored.
		  // - parameter campaignId: (path) Идентификатор кампании в API и магазина в кабинете. Каждая кампания в API соответствует магазину в кабинете.  Чтобы узнать идентификаторы своих магазинов, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html)  
		  // - parameter shipmentId: (path) Идентификатор отгрузки. 
		  //
		  // Invokes ShipmentsApiCallbackHandler.DownloadShipmentTransportationWaybillCallback(FolderItem) on completion. 
		  //
		  // - GET /campaigns/{campaignId}/first-mile/shipments/{shipmentId}/transportation-waybill
		  // - Возвращает транспортную накладную для заданной отгрузки.  Транспортная накладная понадобится, если вы отгружаете товары непосредственно со своего склада. [Подробно об этом способе отгрузки](https://yandex.ru/support/marketplace/orders/fbs/settings/shipment.html#at-your-warehouse)  |**⚙️ Лимит:** 200 запросов в час| |-| 
		  // - defaultResponse: Sample
		  //
		  // - OAuth:
		  //   - type: oauth2
		  //   - name: OAuth
		  //
		  
		  Dim localVarHTTPSocket As New HTTPSecureSocket
		  Me.PrivateFuncPrepareSocket(localVarHTTPSocket)
		  
		  
		  
		  


		  Dim localVarPath As String = "/campaigns/{campaignId}/first-mile/shipments/{shipmentId}/transportation-waybill"
		  
		  Dim localVarPathStringcampaignId As String = campaignId.ToString
		  
		  localVarPath = localVarPath.ReplaceAllB("{campaignId}", localVarPathStringcampaignId)
		  Dim localVarPathStringshipmentId As String = shipmentId.ToString
		  
		  localVarPath = localVarPath.ReplaceAllB("{shipmentId}", localVarPathStringshipmentId)
		  
		  AddHandler localVarHTTPSocket.DownloadComplete, addressof me.DownloadShipmentTransportationWaybill_handler
		  AddHandler localVarHTTPSocket.ReceiveProgress, addressof Me.DownloadShipmentTransportationWaybill_progress
		  
		  
		  
		  localVarHTTPSocket.SendRequest("GET", Me.BasePath + localVarPath, downloadToFile)
		  if localVarHTTPSocket.LastErrorCode <> 0 then
		    Dim localVarException As New OpenAPIClient.OpenAPIClientException(localVarHTTPSocket.LastErrorCode)
			Raise localVarException
		  end if
		  
		End Sub
	#tag EndMethod


	#tag Method, Flags = &h21
		Private Sub DownloadShipmentTransportationWaybill_error(sender As HTTPSecureSocket, Code As Integer)
		  If sender <> nil Then sender.Close()

		  Dim error As New OpenAPIClient.OpenAPIClientException(Code)
		  Dim file As FolderItem
		  CallbackHandler.DownloadShipmentTransportationWaybillCallback(error, file)
		End Sub
	#tag EndMethod

	#tag Method, Flags = &h21
		Private Sub DownloadShipmentTransportationWaybill_handler(sender As HTTPSecureSocket, URL As String, HTTPStatus As Integer, Headers As InternetHeaders, File As FolderItem)
		  #Pragma Unused URL
		  #Pragma Unused Headers

		  If sender <> nil Then sender.Close()
		  
		  Dim error As New OpenAPIClient.OpenAPIClientException(HTTPStatus, "", "")
		  
		  
		  
		  CallbackHandler.DownloadShipmentTransportationWaybillCallback(error, File)
		End Sub
	#tag EndMethod

	#tag Method, Flags = &h21
		Private Sub DownloadShipmentTransportationWaybill_progress(sender As HTTPSecureSocket, BytesReceived As Integer, TotalBytes As Integer, NewData As String)
		  CallbackHandler.DownloadShipmentTransportationWaybillDownloadProgress(BytesReceived, TotalBytes)
		End Sub
	#tag EndMethod


	#tag Method, Flags = &h0
		Sub GetShipment(, campaignId As Int64, shipmentId As Int64, Optional cancelledOrders As Xoson.O.OptionalBoolean)
		  // Operation getShipment
		  // Получение информации об одной отгрузке
		  // - 
		  // - parameter campaignId: (path) Идентификатор кампании в API и магазина в кабинете. Каждая кампания в API соответствует магазину в кабинете.  Чтобы узнать идентификаторы своих магазинов, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html)  
		  // - parameter shipmentId: (path) Идентификатор отгрузки. 
		  // - parameter cancelledOrders: (query) Возвращать ли отмененные заказы.  Значение по умолчанию — &#x60;true&#x60;. Если возвращать отмененные заказы не нужно, передайте значение &#x60;false&#x60;.  (optional, default to true)
		  //
		  // Invokes ShipmentsApiCallbackHandler.GetShipmentCallback(GetShipmentResponse) on completion. 
		  //
		  // - GET /campaigns/{campaignId}/first-mile/shipments/{shipmentId}
		  // - Возвращает информацию об отгрузке по ее идентификатору. |**⚙️ Лимит:** 100 запросов в час| |-| 
		  // - defaultResponse: Nil
		  //
		  // - OAuth:
		  //   - type: oauth2
		  //   - name: OAuth
		  //
		  
		  Dim localVarHTTPSocket As New HTTPSecureSocket
		  Me.PrivateFuncPrepareSocket(localVarHTTPSocket)
		  
		  Dim localVarQueryParams As String = "?"
		  If cancelledOrders <> nil Then localVarQueryParams = localVarQueryParams + EncodeURLComponent("cancelledOrders") + "=" + EncodeURLComponent(cancelledOrders.ToString)
		  

		  
		  


		  Dim localVarPath As String = "/campaigns/{campaignId}/first-mile/shipments/{shipmentId}"
		  
		  Dim localVarPathStringcampaignId As String = campaignId.ToString
		  
		  localVarPath = localVarPath.ReplaceAllB("{campaignId}", localVarPathStringcampaignId)
		  Dim localVarPathStringshipmentId As String = shipmentId.ToString
		  
		  localVarPath = localVarPath.ReplaceAllB("{shipmentId}", localVarPathStringshipmentId)
		  
		  
		  AddHandler localVarHTTPSocket.PageReceived, addressof me.GetShipment_handler
		  AddHandler localVarHTTPSocket.Error, addressof Me.GetShipment_error
		  
		  
		  localVarHTTPSocket.SendRequest("GET", Me.BasePath + localVarPath + localVarQueryParams)
		  if localVarHTTPSocket.LastErrorCode <> 0 then
		    Dim localVarException As New OpenAPIClient.OpenAPIClientException(localVarHTTPSocket.LastErrorCode)
			Raise localVarException
		  end if
		  
		End Sub
	#tag EndMethod

	#tag Method, Flags = &h21
		Private Function GetShipmentPrivateFuncDeserializeResponse(HTTPStatus As Integer, Headers As InternetHeaders, error As OpenAPIClient.OpenAPIClientException, Content As String, ByRef outData As OpenAPIClient.Models.GetShipmentResponse) As Boolean
		  Dim contentType As String = Headers.Value("Content-Type")
		  Dim contentEncoding As TextEncoding = OpenAPIClient.EncodingFromContentType(contentType)
		  Content = DefineEncoding(Content, contentEncoding)
		  
		  If HTTPStatus > 199 and HTTPStatus < 300 then
		    If contentType.LeftB(16) = "application/json" then
		      
			  outData = New OpenAPIClient.Models.GetShipmentResponse
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
		Private Sub GetShipment_error(sender As HTTPSecureSocket, Code As Integer)
		  If sender <> nil Then sender.Close()

		  Dim error As New OpenAPIClient.OpenAPIClientException(Code)
		  Dim data As OpenAPIClient.Models.GetShipmentResponse
		  CallbackHandler.GetShipmentCallback(error, data)
		End Sub
	#tag EndMethod

	#tag Method, Flags = &h21
		Private Sub GetShipment_handler(sender As HTTPSecureSocket, URL As String, HTTPStatus As Integer, Headers As InternetHeaders, Content As String)
		  #Pragma Unused URL
		  

		  If sender <> nil Then sender.Close()
		  
		  Dim error As New OpenAPIClient.OpenAPIClientException(HTTPStatus, "", Content)
		  
		  Dim data As OpenAPIClient.Models.GetShipmentResponse
		  Call GetShipmentPrivateFuncDeserializeResponse(HTTPStatus, Headers, error, Content, data)
		  
		  CallbackHandler.GetShipmentCallback(error, data)
		End Sub
	#tag EndMethod




	#tag Method, Flags = &h0
		Sub GetShipmentOrdersInfo(, campaignId As Int64, shipmentId As Int64)
		  // Operation getShipmentOrdersInfo
		  // Получение информации о возможности печати ярлыков (FBS)
		  // - 
		  // - parameter campaignId: (path) Идентификатор кампании в API и магазина в кабинете. Каждая кампания в API соответствует магазину в кабинете.  Чтобы узнать идентификаторы своих магазинов, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html)  
		  // - parameter shipmentId: (path) Идентификатор отгрузки. 
		  //
		  // Invokes ShipmentsApiCallbackHandler.GetShipmentOrdersInfoCallback(GetShipmentOrdersInfoResponse) on completion. 
		  //
		  // - GET /campaigns/{campaignId}/first-mile/shipments/{shipmentId}/orders/info
		  // - Возвращает информацию о возможности печати ярлыков-наклеек для заказов в отгрузке. |**⚙️ Лимит:** 100 запросов в час| |-| 
		  // - defaultResponse: Nil
		  //
		  // - OAuth:
		  //   - type: oauth2
		  //   - name: OAuth
		  //
		  
		  Dim localVarHTTPSocket As New HTTPSecureSocket
		  Me.PrivateFuncPrepareSocket(localVarHTTPSocket)
		  
		  
		  
		  


		  Dim localVarPath As String = "/campaigns/{campaignId}/first-mile/shipments/{shipmentId}/orders/info"
		  
		  Dim localVarPathStringcampaignId As String = campaignId.ToString
		  
		  localVarPath = localVarPath.ReplaceAllB("{campaignId}", localVarPathStringcampaignId)
		  Dim localVarPathStringshipmentId As String = shipmentId.ToString
		  
		  localVarPath = localVarPath.ReplaceAllB("{shipmentId}", localVarPathStringshipmentId)
		  
		  
		  AddHandler localVarHTTPSocket.PageReceived, addressof me.GetShipmentOrdersInfo_handler
		  AddHandler localVarHTTPSocket.Error, addressof Me.GetShipmentOrdersInfo_error
		  
		  
		  localVarHTTPSocket.SendRequest("GET", Me.BasePath + localVarPath)
		  if localVarHTTPSocket.LastErrorCode <> 0 then
		    Dim localVarException As New OpenAPIClient.OpenAPIClientException(localVarHTTPSocket.LastErrorCode)
			Raise localVarException
		  end if
		  
		End Sub
	#tag EndMethod

	#tag Method, Flags = &h21
		Private Function GetShipmentOrdersInfoPrivateFuncDeserializeResponse(HTTPStatus As Integer, Headers As InternetHeaders, error As OpenAPIClient.OpenAPIClientException, Content As String, ByRef outData As OpenAPIClient.Models.GetShipmentOrdersInfoResponse) As Boolean
		  Dim contentType As String = Headers.Value("Content-Type")
		  Dim contentEncoding As TextEncoding = OpenAPIClient.EncodingFromContentType(contentType)
		  Content = DefineEncoding(Content, contentEncoding)
		  
		  If HTTPStatus > 199 and HTTPStatus < 300 then
		    If contentType.LeftB(16) = "application/json" then
		      
			  outData = New OpenAPIClient.Models.GetShipmentOrdersInfoResponse
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
		Private Sub GetShipmentOrdersInfo_error(sender As HTTPSecureSocket, Code As Integer)
		  If sender <> nil Then sender.Close()

		  Dim error As New OpenAPIClient.OpenAPIClientException(Code)
		  Dim data As OpenAPIClient.Models.GetShipmentOrdersInfoResponse
		  CallbackHandler.GetShipmentOrdersInfoCallback(error, data)
		End Sub
	#tag EndMethod

	#tag Method, Flags = &h21
		Private Sub GetShipmentOrdersInfo_handler(sender As HTTPSecureSocket, URL As String, HTTPStatus As Integer, Headers As InternetHeaders, Content As String)
		  #Pragma Unused URL
		  

		  If sender <> nil Then sender.Close()
		  
		  Dim error As New OpenAPIClient.OpenAPIClientException(HTTPStatus, "", Content)
		  
		  Dim data As OpenAPIClient.Models.GetShipmentOrdersInfoResponse
		  Call GetShipmentOrdersInfoPrivateFuncDeserializeResponse(HTTPStatus, Headers, error, Content, data)
		  
		  CallbackHandler.GetShipmentOrdersInfoCallback(error, data)
		End Sub
	#tag EndMethod




	#tag Method, Flags = &h0
		Sub SearchShipments(, campaignId As Int64, searchShipmentsRequest As OpenAPIClient.Models.SearchShipmentsRequest, Optional pageToken As Xoson.O.OptionalString, Optional limit As Xoson.O.OptionalInteger)
		  // Operation searchShipments
		  // Получение информации о нескольких отгрузках
		  // - 
		  // - parameter campaignId: (path) Идентификатор кампании в API и магазина в кабинете. Каждая кампания в API соответствует магазину в кабинете.  Чтобы узнать идентификаторы своих магазинов, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html)  
		  // - parameter searchShipmentsRequest: (body)  
		  // - parameter pageToken: (query) Идентификатор страницы c результатами.  Если параметр не указан, возвращается первая страница.  Рекомендуется передавать значение выходного параметра &#x60;nextPageToken&#x60;, полученное при последнем запросе.  Если задан &#x60;page_token&#x60; и в запросе есть параметры &#x60;offset&#x60;, &#x60;page_number&#x60; и &#x60;page_size&#x60;, они игнорируются.  (optional, default to Sample)
		  // - parameter limit: (query) Количество значений на одной странице.  (optional, default to 0)
		  //
		  // Invokes ShipmentsApiCallbackHandler.SearchShipmentsCallback(SearchShipmentsResponse) on completion. 
		  //
		  // - PUT /campaigns/{campaignId}/first-mile/shipments
		  // - Возвращает информацию об отгрузках по заданным параметрам:  * дате; * статусу; * идентификаторам заказов.  Результаты возвращаются постранично. |**⚙️ Лимит:** 100 запросов в час| |-| 
		  // - defaultResponse: Nil
		  //
		  // - OAuth:
		  //   - type: oauth2
		  //   - name: OAuth
		  //
		  
		  Dim localVarHTTPSocket As New HTTPSecureSocket
		  Me.PrivateFuncPrepareSocket(localVarHTTPSocket)
		  localVarHTTPSocket.SetRequestContent(Xoson.toJSON(searchShipmentsRequest), "application/json")
		  Dim localVarQueryParams As String = "?"
		  If pageToken <> nil Then localVarQueryParams = localVarQueryParams + EncodeURLComponent("page_token") + "=" + EncodeURLComponent(pageToken)
		  
		  If limit <> nil Then localVarQueryParams = localVarQueryParams + "&" + EncodeURLComponent("limit") + "=" + EncodeURLComponent(limit.ToString)
		  

		  
		  


		  Dim localVarPath As String = "/campaigns/{campaignId}/first-mile/shipments"
		  
		  Dim localVarPathStringcampaignId As String = campaignId.ToString
		  
		  localVarPath = localVarPath.ReplaceAllB("{campaignId}", localVarPathStringcampaignId)
		  
		  
		  AddHandler localVarHTTPSocket.PageReceived, addressof me.SearchShipments_handler
		  AddHandler localVarHTTPSocket.Error, addressof Me.SearchShipments_error
		  
		  
		  localVarHTTPSocket.SendRequest("PUT", Me.BasePath + localVarPath + localVarQueryParams)
		  if localVarHTTPSocket.LastErrorCode <> 0 then
		    Dim localVarException As New OpenAPIClient.OpenAPIClientException(localVarHTTPSocket.LastErrorCode)
			Raise localVarException
		  end if
		  
		End Sub
	#tag EndMethod

	#tag Method, Flags = &h21
		Private Function SearchShipmentsPrivateFuncDeserializeResponse(HTTPStatus As Integer, Headers As InternetHeaders, error As OpenAPIClient.OpenAPIClientException, Content As String, ByRef outData As OpenAPIClient.Models.SearchShipmentsResponse) As Boolean
		  Dim contentType As String = Headers.Value("Content-Type")
		  Dim contentEncoding As TextEncoding = OpenAPIClient.EncodingFromContentType(contentType)
		  Content = DefineEncoding(Content, contentEncoding)
		  
		  If HTTPStatus > 199 and HTTPStatus < 300 then
		    If contentType.LeftB(16) = "application/json" then
		      
			  outData = New OpenAPIClient.Models.SearchShipmentsResponse
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
		Private Sub SearchShipments_error(sender As HTTPSecureSocket, Code As Integer)
		  If sender <> nil Then sender.Close()

		  Dim error As New OpenAPIClient.OpenAPIClientException(Code)
		  Dim data As OpenAPIClient.Models.SearchShipmentsResponse
		  CallbackHandler.SearchShipmentsCallback(error, data)
		End Sub
	#tag EndMethod

	#tag Method, Flags = &h21
		Private Sub SearchShipments_handler(sender As HTTPSecureSocket, URL As String, HTTPStatus As Integer, Headers As InternetHeaders, Content As String)
		  #Pragma Unused URL
		  

		  If sender <> nil Then sender.Close()
		  
		  Dim error As New OpenAPIClient.OpenAPIClientException(HTTPStatus, "", Content)
		  
		  Dim data As OpenAPIClient.Models.SearchShipmentsResponse
		  Call SearchShipmentsPrivateFuncDeserializeResponse(HTTPStatus, Headers, error, Content, data)
		  
		  CallbackHandler.SearchShipmentsCallback(error, data)
		End Sub
	#tag EndMethod




	#tag Method, Flags = &h0
		Sub SetShipmentPalletsCount(, campaignId As Int64, shipmentId As Int64, setShipmentPalletsCountRequest As OpenAPIClient.Models.SetShipmentPalletsCountRequest)
		  // Operation setShipmentPalletsCount
		  // Передача количества упаковок в отгрузке
		  // - 
		  // - parameter campaignId: (path) Идентификатор кампании в API и магазина в кабинете. Каждая кампания в API соответствует магазину в кабинете.  Чтобы узнать идентификаторы своих магазинов, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html)  
		  // - parameter shipmentId: (path) Идентификатор отгрузки. 
		  // - parameter setShipmentPalletsCountRequest: (body)  
		  //
		  // Invokes ShipmentsApiCallbackHandler.SetShipmentPalletsCountCallback(EmptyApiResponse) on completion. 
		  //
		  // - PUT /campaigns/{campaignId}/first-mile/shipments/{shipmentId}/pallets
		  // - Передает Маркету количество коробов или палет в отгрузке для доверительной приемки. Подробнее про доверительную приемку написано в [Справке Маркета](https://yandex.ru/support/marketplace/orders/fbs/process.html#acceptance).  Получить PDF-файл с ярлыками для упаковок можно с помощью запроса [GET campaigns/{campaignId}/first-mile/shipments/{shipmentId}/pallet/labels](../../reference/shipments/downloadShipmentPalletLabels.md). |**⚙️ Лимит:** 200 запросов в час| |-| 
		  // - defaultResponse: Nil
		  //
		  // - OAuth:
		  //   - type: oauth2
		  //   - name: OAuth
		  //
		  
		  Dim localVarHTTPSocket As New HTTPSecureSocket
		  Me.PrivateFuncPrepareSocket(localVarHTTPSocket)
		  localVarHTTPSocket.SetRequestContent(Xoson.toJSON(setShipmentPalletsCountRequest), "application/json")
		  
		  
		  


		  Dim localVarPath As String = "/campaigns/{campaignId}/first-mile/shipments/{shipmentId}/pallets"
		  
		  Dim localVarPathStringcampaignId As String = campaignId.ToString
		  
		  localVarPath = localVarPath.ReplaceAllB("{campaignId}", localVarPathStringcampaignId)
		  Dim localVarPathStringshipmentId As String = shipmentId.ToString
		  
		  localVarPath = localVarPath.ReplaceAllB("{shipmentId}", localVarPathStringshipmentId)
		  
		  
		  AddHandler localVarHTTPSocket.PageReceived, addressof me.SetShipmentPalletsCount_handler
		  AddHandler localVarHTTPSocket.Error, addressof Me.SetShipmentPalletsCount_error
		  
		  
		  localVarHTTPSocket.SendRequest("PUT", Me.BasePath + localVarPath)
		  if localVarHTTPSocket.LastErrorCode <> 0 then
		    Dim localVarException As New OpenAPIClient.OpenAPIClientException(localVarHTTPSocket.LastErrorCode)
			Raise localVarException
		  end if
		  
		End Sub
	#tag EndMethod

	#tag Method, Flags = &h21
		Private Function SetShipmentPalletsCountPrivateFuncDeserializeResponse(HTTPStatus As Integer, Headers As InternetHeaders, error As OpenAPIClient.OpenAPIClientException, Content As String, ByRef outData As OpenAPIClient.Models.EmptyApiResponse) As Boolean
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
		Private Sub SetShipmentPalletsCount_error(sender As HTTPSecureSocket, Code As Integer)
		  If sender <> nil Then sender.Close()

		  Dim error As New OpenAPIClient.OpenAPIClientException(Code)
		  Dim data As OpenAPIClient.Models.EmptyApiResponse
		  CallbackHandler.SetShipmentPalletsCountCallback(error, data)
		End Sub
	#tag EndMethod

	#tag Method, Flags = &h21
		Private Sub SetShipmentPalletsCount_handler(sender As HTTPSecureSocket, URL As String, HTTPStatus As Integer, Headers As InternetHeaders, Content As String)
		  #Pragma Unused URL
		  

		  If sender <> nil Then sender.Close()
		  
		  Dim error As New OpenAPIClient.OpenAPIClientException(HTTPStatus, "", Content)
		  
		  Dim data As OpenAPIClient.Models.EmptyApiResponse
		  Call SetShipmentPalletsCountPrivateFuncDeserializeResponse(HTTPStatus, Headers, error, Content, data)
		  
		  CallbackHandler.SetShipmentPalletsCountCallback(error, data)
		End Sub
	#tag EndMethod




	#tag Method, Flags = &h0
		Sub TransferOrdersFromShipment(, campaignId As Int64, shipmentId As Int64, transferOrdersFromShipmentRequest As OpenAPIClient.Models.TransferOrdersFromShipmentRequest)
		  // Operation transferOrdersFromShipment
		  // Перенос заказов в следующую отгрузку
		  // - 
		  // - parameter campaignId: (path) Идентификатор кампании в API и магазина в кабинете. Каждая кампания в API соответствует магазину в кабинете.  Чтобы узнать идентификаторы своих магазинов, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html)  
		  // - parameter shipmentId: (path) Идентификатор отгрузки. 
		  // - parameter transferOrdersFromShipmentRequest: (body)  
		  //
		  // Invokes ShipmentsApiCallbackHandler.TransferOrdersFromShipmentCallback(EmptyApiResponse) on completion. 
		  //
		  // - POST /campaigns/{campaignId}/first-mile/shipments/{shipmentId}/orders/transfer
		  // - Переносит указанные заказы из указанной отгрузки в следующую отгрузку. [Что такое отгрузка?](https://yandex.ru/support/marketplace/orders/fbs/process.html#ship)  Используйте этот запрос, если не успеваете собрать и упаковать заказы вовремя.  {% note warning "Такие переносы снижают индекс качества магазина" %}  Этот запрос предназначен для исключительных случаев. Если вы будете переносить заказы слишком часто, магазин столкнется с ограничениями. [Что за ограничения?](https://yandex.ru/support/marketplace/quality/score/fbs.html)  {% endnote %}  Переносить заказы можно, если до формирования отгрузки осталось больше получаса.  Перенос происходит не мгновенно, а занимает несколько минут.  |**⚙️ Лимит:** 200 запросов в час| |-| 
		  // - defaultResponse: Nil
		  //
		  // - OAuth:
		  //   - type: oauth2
		  //   - name: OAuth
		  //
		  
		  Dim localVarHTTPSocket As New HTTPSecureSocket
		  Me.PrivateFuncPrepareSocket(localVarHTTPSocket)
		  localVarHTTPSocket.SetRequestContent(Xoson.toJSON(transferOrdersFromShipmentRequest), "application/json")
		  
		  
		  


		  Dim localVarPath As String = "/campaigns/{campaignId}/first-mile/shipments/{shipmentId}/orders/transfer"
		  
		  Dim localVarPathStringcampaignId As String = campaignId.ToString
		  
		  localVarPath = localVarPath.ReplaceAllB("{campaignId}", localVarPathStringcampaignId)
		  Dim localVarPathStringshipmentId As String = shipmentId.ToString
		  
		  localVarPath = localVarPath.ReplaceAllB("{shipmentId}", localVarPathStringshipmentId)
		  
		  
		  AddHandler localVarHTTPSocket.PageReceived, addressof me.TransferOrdersFromShipment_handler
		  AddHandler localVarHTTPSocket.Error, addressof Me.TransferOrdersFromShipment_error
		  
		  
		  localVarHTTPSocket.SendRequest("POST", Me.BasePath + localVarPath)
		  if localVarHTTPSocket.LastErrorCode <> 0 then
		    Dim localVarException As New OpenAPIClient.OpenAPIClientException(localVarHTTPSocket.LastErrorCode)
			Raise localVarException
		  end if
		  
		End Sub
	#tag EndMethod

	#tag Method, Flags = &h21
		Private Function TransferOrdersFromShipmentPrivateFuncDeserializeResponse(HTTPStatus As Integer, Headers As InternetHeaders, error As OpenAPIClient.OpenAPIClientException, Content As String, ByRef outData As OpenAPIClient.Models.EmptyApiResponse) As Boolean
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
		Private Sub TransferOrdersFromShipment_error(sender As HTTPSecureSocket, Code As Integer)
		  If sender <> nil Then sender.Close()

		  Dim error As New OpenAPIClient.OpenAPIClientException(Code)
		  Dim data As OpenAPIClient.Models.EmptyApiResponse
		  CallbackHandler.TransferOrdersFromShipmentCallback(error, data)
		End Sub
	#tag EndMethod

	#tag Method, Flags = &h21
		Private Sub TransferOrdersFromShipment_handler(sender As HTTPSecureSocket, URL As String, HTTPStatus As Integer, Headers As InternetHeaders, Content As String)
		  #Pragma Unused URL
		  

		  If sender <> nil Then sender.Close()
		  
		  Dim error As New OpenAPIClient.OpenAPIClientException(HTTPStatus, "", Content)
		  
		  Dim data As OpenAPIClient.Models.EmptyApiResponse
		  Call TransferOrdersFromShipmentPrivateFuncDeserializeResponse(HTTPStatus, Headers, error, Content, data)
		  
		  CallbackHandler.TransferOrdersFromShipmentCallback(error, data)
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
		CallbackHandler As OpenAPIClient.APIs.ShipmentsApiCallbackHandler
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
