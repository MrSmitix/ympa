#tag Class
Protected Class WarehouseOfferDTO

	#tag Property, Flags = &h0
		#tag Note
			Ваш SKU — идентификатор товара в вашей системе.  Разрешена любая последовательность длиной до 255 знаков.  Правила использования SKU:  * У каждого товара SKU должен быть свой.  * SKU товара нельзя менять — можно только удалить товар и добавить заново с новым SKU.  * Уже заданный SKU нельзя освободить и использовать заново для другого товара. Каждый товар должен получать новый идентификатор, до того никогда не использовавшийся в вашем каталоге.  [Что такое SKU и как его назначать](https://yandex.ru/support/marketplace/assortment/add/index.html#fields) 
		#tag EndNote
		offerId As String
	#tag EndProperty


	#tag Property, Flags = &h0
		turnoverSummary As OpenAPIClient.Models.TurnoverDTO
	#tag EndProperty


	#tag Property, Flags = &h0
		#tag Note
			Информация об остатках.
		#tag EndNote
		stocks() As OpenAPIClient.Models.WarehouseStockDTO
	#tag EndProperty


	#tag Property, Flags = &h0
		#tag Note
			Дата и время последнего обновления информации об остатках.  Формат даты и времени: ISO 8601 со смещением относительно UTC. Например, `2023-11-21T00:42:42+03:00`. 
		#tag EndNote
		updatedAt As Date
	#tag EndProperty





	#tag ViewBehavior
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
			Name="offerId"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="String"
			EditorType=""
		#tag EndViewProperty
		#tag ViewProperty
			Name="turnoverSummary"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="TurnoverDTO"
			EditorType=""
		#tag EndViewProperty
		#tag ViewProperty
			Name="stocks"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="WarehouseStockDTO"
			EditorType=""
		#tag EndViewProperty
		#tag ViewProperty
			Name="updatedAt"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="Date"
			EditorType=""
		#tag EndViewProperty
	#tag EndViewBehavior
End Class
#tag EndClass


