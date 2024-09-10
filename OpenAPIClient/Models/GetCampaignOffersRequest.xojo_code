#tag Class
Protected Class GetCampaignOffersRequest

	#tag Property, Flags = &h0
		#tag Note
			Идентификаторы товаров, информация о которых нужна.  {% note warning "Такой список возвращается только целиком" %}  Не используйте это поле одновременно с фильтрами по статусам карточек, категориям, брендам или тегам. Если вы хотите воспользоваться фильтрами, оставьте поле пустым.  Если вы запрашиваете информацию по конкретным SKU, не заполняйте:  * `page_token` * `limit`  {% endnote %}    
		#tag EndNote
		offerIds() As String
	#tag EndProperty


	#tag Property, Flags = &h0
		#tag Note
			Фильтр по статусам товаров. 
		#tag EndNote
		statuses() As OfferCampaignStatusType
	#tag EndProperty


	#tag Property, Flags = &h0
		#tag Note
			Фильтр по категориям на Маркете.
		#tag EndNote
		categoryIds() As Integer
	#tag EndProperty


	#tag Property, Flags = &h0
		#tag Note
			Фильтр по брендам.
		#tag EndNote
		vendorNames() As String
	#tag EndProperty


	#tag Property, Flags = &h0
		#tag Note
			Фильтр по тегам.
		#tag EndNote
		tags() As String
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
			Name="statuses"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="OfferCampaignStatusType"
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
		#tag ViewProperty
			Name="vendorNames"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="String"
			EditorType=""
		#tag EndViewProperty
		#tag ViewProperty
			Name="tags"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="String"
			EditorType=""
		#tag EndViewProperty
	#tag EndViewBehavior
End Class
#tag EndClass


