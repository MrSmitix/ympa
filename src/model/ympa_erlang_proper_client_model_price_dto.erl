-module(ympa_erlang_proper_client_model_price_dto).

-include("ympa_erlang_proper_client.hrl").

-export([ympa_erlang_proper_client_model_price_dto/0]).

-export([ympa_erlang_proper_client_model_price_dto/1]).

-export_type([ympa_erlang_proper_client_model_price_dto/0]).

-type ympa_erlang_proper_client_model_price_dto() ::
  [ {'avg', integer() }
  | {'max', integer() }
  | {'min', integer() }
  ].


ympa_erlang_proper_client_model_price_dto() ->
    ympa_erlang_proper_client_model_price_dto([]).

ympa_erlang_proper_client_model_price_dto(Fields) ->
  Default = [ {'avg', integer() }
            , {'max', integer() }
            , {'min', integer() }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

