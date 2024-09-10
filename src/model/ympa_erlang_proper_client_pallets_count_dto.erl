-module(ympa_erlang_proper_client_pallets_count_dto).

-include("ympa_erlang_proper_client.hrl").

-export([ympa_erlang_proper_client_pallets_count_dto/0]).

-export([ympa_erlang_proper_client_pallets_count_dto/1]).

-export_type([ympa_erlang_proper_client_pallets_count_dto/0]).

-type ympa_erlang_proper_client_pallets_count_dto() ::
  [ {'planned', integer() }
  | {'fact', integer() }
  ].


ympa_erlang_proper_client_pallets_count_dto() ->
    ympa_erlang_proper_client_pallets_count_dto([]).

ympa_erlang_proper_client_pallets_count_dto(Fields) ->
  Default = [ {'planned', integer() }
            , {'fact', integer() }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

