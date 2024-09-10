-module(ympa_erlang_proper_client_price_suggest_dto).

-include("ympa_erlang_proper_client.hrl").

-export([ympa_erlang_proper_client_price_suggest_dto/0]).

-export([ympa_erlang_proper_client_price_suggest_dto/1]).

-export_type([ympa_erlang_proper_client_price_suggest_dto/0]).

-type ympa_erlang_proper_client_price_suggest_dto() ::
  [ {'type', ympa_erlang_proper_client_price_suggest_type:ympa_erlang_proper_client_price_suggest_type() }
  | {'price', integer() }
  ].


ympa_erlang_proper_client_price_suggest_dto() ->
    ympa_erlang_proper_client_price_suggest_dto([]).

ympa_erlang_proper_client_price_suggest_dto(Fields) ->
  Default = [ {'type', ympa_erlang_proper_client_price_suggest_type:ympa_erlang_proper_client_price_suggest_type() }
            , {'price', integer() }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

