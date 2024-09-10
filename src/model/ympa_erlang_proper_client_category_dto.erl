-module(ympa_erlang_proper_client_category_dto).

-include("ympa_erlang_proper_client.hrl").

-export([ympa_erlang_proper_client_category_dto/0]).

-export([ympa_erlang_proper_client_category_dto/1]).

-export_type([ympa_erlang_proper_client_category_dto/0]).

-type ympa_erlang_proper_client_category_dto() ::
  [ {'id', integer() }
  | {'name', binary() }
  | {'children', list(ympa_erlang_proper_client_category_dto:ympa_erlang_proper_client_category_dto()) }
  ].


ympa_erlang_proper_client_category_dto() ->
    ympa_erlang_proper_client_category_dto([]).

ympa_erlang_proper_client_category_dto(Fields) ->
  Default = [ {'id', integer() }
            , {'name', binary() }
            , {'children', list(ympa_erlang_proper_client_category_dto:ympa_erlang_proper_client_category_dto()) }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

