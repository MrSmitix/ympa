-module(ympa_erlang_proper_client_region_dto).

-include("ympa_erlang_proper_client.hrl").

-export([ympa_erlang_proper_client_region_dto/0]).

-export([ympa_erlang_proper_client_region_dto/1]).

-export_type([ympa_erlang_proper_client_region_dto/0]).

-type ympa_erlang_proper_client_region_dto() ::
  [ {'id', integer() }
  | {'name', binary() }
  | {'type', ympa_erlang_proper_client_region_type:ympa_erlang_proper_client_region_type() }
  | {'parent', ympa_erlang_proper_client_region_dto:ympa_erlang_proper_client_region_dto() }
  | {'children', list(ympa_erlang_proper_client_region_dto:ympa_erlang_proper_client_region_dto()) }
  ].


ympa_erlang_proper_client_region_dto() ->
    ympa_erlang_proper_client_region_dto([]).

ympa_erlang_proper_client_region_dto(Fields) ->
  Default = [ {'id', integer() }
            , {'name', binary() }
            , {'type', ympa_erlang_proper_client_region_type:ympa_erlang_proper_client_region_type() }
            , {'parent', ympa_erlang_proper_client_region_dto:ympa_erlang_proper_client_region_dto() }
            , {'children', list(ympa_erlang_proper_client_region_dto:ympa_erlang_proper_client_region_dto()) }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

