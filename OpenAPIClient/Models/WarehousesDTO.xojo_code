#tag Class
Protected Class WarehousesDTO

	#tag Property, Flags = &h0
		#tag Note
			Список складов, не входящих в группы.
		#tag EndNote
		warehouses() As OpenAPIClient.Models.WarehouseDTO
	#tag EndProperty


	#tag Property, Flags = &h0
		#tag Note
			Список групп складов.
		#tag EndNote
		warehouseGroups() As OpenAPIClient.Models.WarehouseGroupDTO
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
			Name="warehouses"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="WarehouseDTO"
			EditorType=""
		#tag EndViewProperty
		#tag ViewProperty
			Name="warehouseGroups"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="WarehouseGroupDTO"
			EditorType=""
		#tag EndViewProperty
	#tag EndViewBehavior
End Class
#tag EndClass


