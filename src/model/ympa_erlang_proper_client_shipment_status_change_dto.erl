-module(ympa_erlang_proper_client_shipment_status_change_dto).

-include("ympa_erlang_proper_client.hrl").

-export([ympa_erlang_proper_client_shipment_status_change_dto/0]).

-export([ympa_erlang_proper_client_shipment_status_change_dto/1]).

-export_type([ympa_erlang_proper_client_shipment_status_change_dto/0]).

-type ympa_erlang_proper_client_shipment_status_change_dto() ::
  [ {'status', ympa_erlang_proper_client_shipment_status_type:ympa_erlang_proper_client_shipment_status_type() }
  | {'description', binary() }
  | {'updateTime', datetime() }
  ].


ympa_erlang_proper_client_shipment_status_change_dto() ->
    ympa_erlang_proper_client_shipment_status_change_dto([]).

ympa_erlang_proper_client_shipment_status_change_dto(Fields) ->
  Default = [ {'status', ympa_erlang_proper_client_shipment_status_type:ympa_erlang_proper_client_shipment_status_type() }
            , {'description', binary() }
            , {'updateTime', datetime() }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

