-module(ympa_erlang_client_orders_shipment_info_dto).

-export([encode/1]).

-export_type([ympa_erlang_client_orders_shipment_info_dto/0]).

-type ympa_erlang_client_orders_shipment_info_dto() ::
    #{ 'orderIdsWithLabels' := ympa_erlang_client_set:ympa_erlang_client_set(),
       'orderIdsWithoutLabels' := ympa_erlang_client_set:ympa_erlang_client_set()
     }.

encode(#{ 'orderIdsWithLabels' := OrderIdsWithLabels,
          'orderIdsWithoutLabels' := OrderIdsWithoutLabels
        }) ->
    #{ 'orderIdsWithLabels' => OrderIdsWithLabels,
       'orderIdsWithoutLabels' => OrderIdsWithoutLabels
     }.
