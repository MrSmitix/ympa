-module(ympa_erlang_client_extension_shipment_dto).

-export([encode/1]).

-export_type([ympa_erlang_client_extension_shipment_dto/0]).

-type ympa_erlang_client_extension_shipment_dto() ::
    #{ 'currentStatus' => ympa_erlang_client_shipment_status_change_dto:ympa_erlang_client_shipment_status_change_dto(),
       'availableActions' := ympa_erlang_client_set:ympa_erlang_client_set()
     }.

encode(#{ 'currentStatus' := CurrentStatus,
          'availableActions' := AvailableActions
        }) ->
    #{ 'currentStatus' => CurrentStatus,
       'availableActions' => AvailableActions
     }.
