#tag Class
Protected Class GetOfferCardsContentStatusRequest

	#tag Property, Flags = &h0
		#tag Note
			Идентификаторы товаров, информация о которых нужна. <br><br> ⚠️ Не используйте это поле одновременно с фильтрами по статусам карточек, категориям, брендам или тегам. Если вы хотите воспользоваться фильтрами, оставьте поле пустым. 
		#tag EndNote
		offerIds() As String
	#tag EndProperty


	#tag Property, Flags = &h0
		#tag Note
			Фильтр по статусам карточек.  [Что такое карточка товара](https://yandex.ru/support/marketplace/assortment/content/index.html) 
		#tag EndNote
		cardStatuses() As OfferCardStatusType
	#tag EndProperty


	#tag Property, Flags = &h0
		#tag Note
			Фильтр по категориям на Маркете.
		#tag EndNote
		categoryIds() As Integer
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
			Name="offerIds"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="String"
			EditorType=""
		#tag EndViewProperty
		#tag ViewProperty
			Name="cardStatuses"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="OfferCardStatusType"
			EditorType=""
		#tag EndViewProperty
		#tag ViewProperty
			Name="categoryIds"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="Integer"
			EditorType=""
		#tag EndViewProperty
	#tag EndViewBehavior
End Class
#tag EndClass


