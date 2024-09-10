-module(ympa_erlang_proper_client_return_item_dto).

-include("ympa_erlang_proper_client.hrl").

-export([ympa_erlang_proper_client_return_item_dto/0]).

-export([ympa_erlang_proper_client_return_item_dto/1]).

-export_type([ympa_erlang_proper_client_return_item_dto/0]).

-type ympa_erlang_proper_client_return_item_dto() ::
  [ {'marketSku', integer() }
  | {'shopSku', binary() }
  | {'count', integer() }
  | {'decisions', list(ympa_erlang_proper_client_return_decision_dto:ympa_erlang_proper_client_return_decision_dto()) }
  | {'instances', list(ympa_erlang_proper_client_return_instance_dto:ympa_erlang_proper_client_return_instance_dto()) }
  | {'tracks', list(ympa_erlang_proper_client_track_dto:ympa_erlang_proper_client_track_dto()) }
  ].


ympa_erlang_proper_client_return_item_dto() ->
    ympa_erlang_proper_client_return_item_dto([]).

ympa_erlang_proper_client_return_item_dto(Fields) ->
  Default = [ {'marketSku', integer() }
            , {'shopSku', binary(1, 255) }
            , {'count', integer() }
            , {'decisions', list(ympa_erlang_proper_client_return_decision_dto:ympa_erlang_proper_client_return_decision_dto()) }
            , {'instances', list(ympa_erlang_proper_client_return_instance_dto:ympa_erlang_proper_client_return_instance_dto()) }
            , {'tracks', list(ympa_erlang_proper_client_track_dto:ympa_erlang_proper_client_track_dto()) }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

