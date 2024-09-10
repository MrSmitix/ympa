-module(ympa_erlang_proper_client_suggest_prices_result_dto).

-include("ympa_erlang_proper_client.hrl").

-export([ympa_erlang_proper_client_suggest_prices_result_dto/0]).

-export([ympa_erlang_proper_client_suggest_prices_result_dto/1]).

-export_type([ympa_erlang_proper_client_suggest_prices_result_dto/0]).

-type ympa_erlang_proper_client_suggest_prices_result_dto() ::
  [ {'offers', list(ympa_erlang_proper_client_price_suggest_offer_dto:ympa_erlang_proper_client_price_suggest_offer_dto()) }
  ].


ympa_erlang_proper_client_suggest_prices_result_dto() ->
    ympa_erlang_proper_client_suggest_prices_result_dto([]).

ympa_erlang_proper_client_suggest_prices_result_dto(Fields) ->
  Default = [ {'offers', list(ympa_erlang_proper_client_price_suggest_offer_dto:ympa_erlang_proper_client_price_suggest_offer_dto()) }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

