-module(ympa_erlang_proper_client_extension_shipment_dto).

-include("ympa_erlang_proper_client.hrl").

-export([ympa_erlang_proper_client_extension_shipment_dto/0]).

-export([ympa_erlang_proper_client_extension_shipment_dto/1]).

-export_type([ympa_erlang_proper_client_extension_shipment_dto/0]).

-type ympa_erlang_proper_client_extension_shipment_dto() ::
  [ {'currentStatus', ympa_erlang_proper_client_shipment_status_change_dto:ympa_erlang_proper_client_shipment_status_change_dto() }
  | {'availableActions', list(ympa_erlang_proper_client_shipment_action_type:ympa_erlang_proper_client_shipment_action_type()) }
  ].


ympa_erlang_proper_client_extension_shipment_dto() ->
    ympa_erlang_proper_client_extension_shipment_dto([]).

ympa_erlang_proper_client_extension_shipment_dto(Fields) ->
  Default = [ {'currentStatus', ympa_erlang_proper_client_shipment_status_change_dto:ympa_erlang_proper_client_shipment_status_change_dto() }
            , {'availableActions', list(ympa_erlang_proper_client_shipment_action_type:ympa_erlang_proper_client_shipment_action_type()) }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

