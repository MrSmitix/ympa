-module(ympa_erlang_proper_client_model_dto).

-include("ympa_erlang_proper_client.hrl").

-export([ympa_erlang_proper_client_model_dto/0]).

-export([ympa_erlang_proper_client_model_dto/1]).

-export_type([ympa_erlang_proper_client_model_dto/0]).

-type ympa_erlang_proper_client_model_dto() ::
  [ {'id', integer() }
  | {'name', binary() }
  | {'prices', ympa_erlang_proper_client_model_price_dto:ympa_erlang_proper_client_model_price_dto() }
  ].


ympa_erlang_proper_client_model_dto() ->
    ympa_erlang_proper_client_model_dto([]).

ympa_erlang_proper_client_model_dto(Fields) ->
  Default = [ {'id', integer() }
            , {'name', binary() }
            , {'prices', ympa_erlang_proper_client_model_price_dto:ympa_erlang_proper_client_model_price_dto() }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

