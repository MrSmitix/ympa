-module(ympa_erlang_proper_client_order_track_dto).

-include("ympa_erlang_proper_client.hrl").

-export([ympa_erlang_proper_client_order_track_dto/0]).

-export([ympa_erlang_proper_client_order_track_dto/1]).

-export_type([ympa_erlang_proper_client_order_track_dto/0]).

-type ympa_erlang_proper_client_order_track_dto() ::
  [ {'trackCode', binary() }
  | {'deliveryServiceId', integer() }
  ].


ympa_erlang_proper_client_order_track_dto() ->
    ympa_erlang_proper_client_order_track_dto([]).

ympa_erlang_proper_client_order_track_dto(Fields) ->
  Default = [ {'trackCode', binary() }
            , {'deliveryServiceId', integer() }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

