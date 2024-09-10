-module(ympa_erlang_client_shipment_dto).

-export([encode/1]).

-export_type([ympa_erlang_client_shipment_dto/0]).

-type ympa_erlang_client_shipment_dto() ::
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
       'currentStatus' => ympa_erlang_client_shipment_status_change_dto:ympa_erlang_client_shipment_status_change_dto(),
       'availableActions' := ympa_erlang_client_set:ympa_erlang_client_set()
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
          'currentStatus' := CurrentStatus,
          'availableActions' := AvailableActions
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
       'currentStatus' => CurrentStatus,
       'availableActions' => AvailableActions
     }.
