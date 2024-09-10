-module(ympa_erlang_proper_client_delivery_service_dto).

-include("ympa_erlang_proper_client.hrl").

-export([ympa_erlang_proper_client_delivery_service_dto/0]).

-export([ympa_erlang_proper_client_delivery_service_dto/1]).

-export_type([ympa_erlang_proper_client_delivery_service_dto/0]).

-type ympa_erlang_proper_client_delivery_service_dto() ::
  [ {'id', integer() }
  | {'name', binary() }
  ].


ympa_erlang_proper_client_delivery_service_dto() ->
    ympa_erlang_proper_client_delivery_service_dto([]).

ympa_erlang_proper_client_delivery_service_dto(Fields) ->
  Default = [ {'id', integer() }
            , {'name', binary() }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

