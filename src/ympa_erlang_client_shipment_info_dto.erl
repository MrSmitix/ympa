-module(ympa_erlang_client_shipment_info_dto).

-export([encode/1]).

-export_type([ympa_erlang_client_shipment_info_dto/0]).

-type ympa_erlang_client_shipment_info_dto() ::
    #{ 'id' => integer(),
       'planIntervalFrom' => ympa_erlang_client_date_time:ympa_erlang_client_date_time(),
       'planIntervalTo' => ympa_erlang_client_date_time:ympa_erlang_client_date_time(),
       'shipmentType' => ympa_erlang_client_shipment_type:ympa_erlang_client_shipment_type(),
       'warehouse' => ympa_erlang_client_partner_shipment_warehouse_dto:ympa_erlang_client_partner_shipment_warehouse_dto(),
       'warehouseTo' => ympa_erlang_client_partner_shipment_warehouse_dto:ympa_erlang_client_partner_shipment_warehouse_dto(),
       'externalId' => binary(),
       'deliveryService' => ympa_erlang_client_delivery_service_dto:ympa_erlang_client_delivery_service_dto(),
       'palletsCount' => ympa_erlang_client_pallets_count_dto:ympa_erlang_client_pallets_count_dto(),
       'orderIds' := ympa_erlang_client_set:ympa_erlang_client_set(),
       'draftCount' => integer(),
       'plannedCount' => integer(),
       'factCount' => integer(),
       'status' => ympa_erlang_client_shipment_status_type:ympa_erlang_client_shipment_status_type(),
       'statusDescription' => binary(),
       'statusUpdateTime' => ympa_erlang_client_date_time:ympa_erlang_client_date_time()
     }.

encode(#{ 'id' := Id,
          'planIntervalFrom' := PlanIntervalFrom,
          'planIntervalTo' := PlanIntervalTo,
          'shipmentType' := ShipmentType,
          'warehouse' := Warehouse,
          'warehouseTo' := WarehouseTo,
          'externalId' := ExternalId,
          'deliveryService' := DeliveryService,
          'palletsCount' := PalletsCount,
          'orderIds' := OrderIds,
          'draftCount' := DraftCount,
          'plannedCount' := PlannedCount,
          'factCount' := FactCount,
          'status' := Status,
          'statusDescription' := StatusDescription,
          'statusUpdateTime' := StatusUpdateTime
        }) ->
    #{ 'id' => Id,
       'planIntervalFrom' => PlanIntervalFrom,
       'planIntervalTo' => PlanIntervalTo,
       'shipmentType' => ShipmentType,
       'warehouse' => Warehouse,
       'warehouseTo' => WarehouseTo,
       'externalId' => ExternalId,
       'deliveryService' => DeliveryService,
       'palletsCount' => PalletsCount,
       'orderIds' => OrderIds,
       'draftCount' => DraftCount,
       'plannedCount' => PlannedCount,
       'factCount' => FactCount,
       'status' => Status,
       'statusDescription' => StatusDescription,
       'statusUpdateTime' => StatusUpdateTime
     }.
