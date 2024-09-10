#tag Class
Protected Class GetGoodsFeedbackRequest

	#tag Property, Flags = &h0
		#tag Note
			Начало периода. Не включительно.  Если параметр не указан, возвращается информация за 6 месяцев до указанной в `dateTimeTo` даты. 
		#tag EndNote
		dateTimeFrom As Date
	#tag EndProperty


	#tag Property, Flags = &h0
		#tag Note
			Конец периода. Не включительно.  Если параметр не указан, используется текущая дата. 
		#tag EndNote
		dateTimeTo As Date
	#tag EndProperty


	#tag Property, Flags = &h0
		reactionStatus As Xoson.O.OptionalString
	#tag EndProperty


	#tag Property, Flags = &h0
		#tag Note
			Оценка товара.
		#tag EndNote
		ratingValues() As Integer
	#tag EndProperty


	#tag Property, Flags = &h0
		#tag Note
			Фильтр по идентификатору модели товара.  Получить идентификатор модели можно с помощью одного из запросов:  * [POST businesses/{businessId}/offer-mappings](../../reference/business-assortment/getOfferMappings.md);  * [POST businesses/{businessId}/offer-cards](../../reference/content/getOfferCardsContentStatus.md);  * [POST models](../../reference/models/getModels.md). 
		#tag EndNote
		modelIds() As Int64
	#tag EndProperty


	#tag Property, Flags = &h0
		#tag Note
			Фильтр отзывов за баллы Плюса.
		#tag EndNote
		paid As Xoson.O.OptionalBoolean
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
			Name="dateTimeFrom"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="Date"
			EditorType=""
		#tag EndViewProperty
		#tag ViewProperty
			Name="dateTimeTo"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="Date"
			EditorType=""
		#tag EndViewProperty
		#tag ViewProperty
			Name="reactionStatus"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="FeedbackReactionStatusType"
			EditorType=""
		#tag EndViewProperty
		#tag ViewProperty
			Name="ratingValues"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="Integer"
			EditorType=""
		#tag EndViewProperty
		#tag ViewProperty
			Name="modelIds"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="Int64"
			EditorType=""
		#tag EndViewProperty
		#tag ViewProperty
			Name="paid"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="Boolean"
			EditorType=""
		#tag EndViewProperty
	#tag EndViewBehavior
End Class
#tag EndClass


