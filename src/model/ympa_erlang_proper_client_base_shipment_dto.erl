-module(ympa_erlang_proper_client_base_shipment_dto).

-include("ympa_erlang_proper_client.hrl").

-export([ympa_erlang_proper_client_base_shipment_dto/0]).

-export([ympa_erlang_proper_client_base_shipment_dto/1]).

-export_type([ympa_erlang_proper_client_base_shipment_dto/0]).

-type ympa_erlang_proper_client_base_shipment_dto() ::
  [ {'id', integer() }
  | {'planIntervalFrom', datetime() }
  | {'planIntervalTo', datetime() }
  | {'shipmentType', ympa_erlang_proper_client_shipment_type:ympa_erlang_proper_client_shipment_type() }
  | {'warehouse', ympa_erlang_proper_client_partner_shipment_warehouse_dto:ympa_erlang_proper_client_partner_shipment_warehouse_dto() }
  | {'warehouseTo', ympa_erlang_proper_client_partner_shipment_warehouse_dto:ympa_erlang_proper_client_partner_shipment_warehouse_dto() }
  | {'externalId', binary() }
  | {'deliveryService', ympa_erlang_proper_client_delivery_service_dto:ympa_erlang_proper_client_delivery_service_dto() }
  | {'palletsCount', ympa_erlang_proper_client_pallets_count_dto:ympa_erlang_proper_client_pallets_count_dto() }
  | {'orderIds', list(integer()) }
  | {'draftCount', integer() }
  | {'plannedCount', integer() }
  | {'factCount', integer() }
  ].


ympa_erlang_proper_client_base_shipment_dto() ->
    ympa_erlang_proper_client_base_shipment_dto([]).

ympa_erlang_proper_client_base_shipment_dto(Fields) ->
  Default = [ {'id', integer() }
            , {'planIntervalFrom', datetime() }
            , {'planIntervalTo', datetime() }
            , {'shipmentType', ympa_erlang_proper_client_shipment_type:ympa_erlang_proper_client_shipment_type() }
            , {'warehouse', ympa_erlang_proper_client_partner_shipment_warehouse_dto:ympa_erlang_proper_client_partner_shipment_warehouse_dto() }
            , {'warehouseTo', ympa_erlang_proper_client_partner_shipment_warehouse_dto:ympa_erlang_proper_client_partner_shipment_warehouse_dto() }
            , {'externalId', binary() }
            , {'deliveryService', ympa_erlang_proper_client_delivery_service_dto:ympa_erlang_proper_client_delivery_service_dto() }
            , {'palletsCount', ympa_erlang_proper_client_pallets_count_dto:ympa_erlang_proper_client_pallets_count_dto() }
            , {'orderIds', list(integer()) }
            , {'draftCount', integer() }
            , {'plannedCount', integer() }
            , {'factCount', integer() }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

