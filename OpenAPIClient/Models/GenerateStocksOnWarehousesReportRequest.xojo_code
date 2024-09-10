#tag Class
Protected Class GenerateStocksOnWarehousesReportRequest

	#tag Property, Flags = &h0
		#tag Note
			Идентификатор магазина.
		#tag EndNote
		campaignId As Int64
	#tag EndProperty


	#tag Property, Flags = &h0
		#tag Note
			Фильтр по идентификаторам складов (только модель FBY). Чтобы узнать идентификатор, воспользуйтесь запросом [GET warehouses](../../reference/warehouses/getFulfillmentWarehouses.md).
		#tag EndNote
		warehouseIds() As Int64
	#tag EndProperty


	#tag Property, Flags = &h0
		#tag Note
			Фильтр по дате (для модели FBY). В отчет попадут данные за **предшествующий** дате день.
		#tag EndNote
		reportDate As Date
	#tag EndProperty


	#tag Property, Flags = &h0
		#tag Note
			Фильтр по категориям на Маркете (кроме модели FBY).
		#tag EndNote
		categoryIds() As Int64
	#tag EndProperty


	#tag Property, Flags = &h0
		#tag Note
			Фильтр по наличию остатков (кроме модели FBY).
		#tag EndNote
		hasStocks As Xoson.O.OptionalBoolean
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
			Name="campaignId"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="Int64"
			EditorType=""
		#tag EndViewProperty
		#tag ViewProperty
			Name="warehouseIds"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="Int64"
			EditorType=""
		#tag EndViewProperty
		#tag ViewProperty
			Name="reportDate"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="Date"
			EditorType=""
		#tag EndViewProperty
		#tag ViewProperty
			Name="categoryIds"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="Int64"
			EditorType=""
		#tag EndViewProperty
		#tag ViewProperty
			Name="hasStocks"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="Boolean"
			EditorType=""
		#tag EndViewProperty
	#tag EndViewBehavior
End Class
#tag EndClass


