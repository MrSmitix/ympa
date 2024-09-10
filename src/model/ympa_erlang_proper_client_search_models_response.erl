-module(ympa_erlang_proper_client_search_models_response).

-include("ympa_erlang_proper_client.hrl").

-export([ympa_erlang_proper_client_search_models_response/0]).

-export([ympa_erlang_proper_client_search_models_response/1]).

-export_type([ympa_erlang_proper_client_search_models_response/0]).

-type ympa_erlang_proper_client_search_models_response() ::
  [ {'models', list(ympa_erlang_proper_client_model_dto:ympa_erlang_proper_client_model_dto()) }
  | {'currency', ympa_erlang_proper_client_currency_type:ympa_erlang_proper_client_currency_type() }
  | {'regionId', integer() }
  | {'pager', ympa_erlang_proper_client_flipping_pager_dto:ympa_erlang_proper_client_flipping_pager_dto() }
  ].


ympa_erlang_proper_client_search_models_response() ->
    ympa_erlang_proper_client_search_models_response([]).

ympa_erlang_proper_client_search_models_response(Fields) ->
  Default = [ {'models', list(ympa_erlang_proper_client_model_dto:ympa_erlang_proper_client_model_dto()) }
            , {'currency', ympa_erlang_proper_client_currency_type:ympa_erlang_proper_client_currency_type() }
            , {'regionId', integer() }
            , {'pager', ympa_erlang_proper_client_flipping_pager_dto:ympa_erlang_proper_client_flipping_pager_dto() }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

