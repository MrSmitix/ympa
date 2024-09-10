-module(ympa_erlang_proper_client_price_suggest_offer_dto).

-include("ympa_erlang_proper_client.hrl").

-export([ympa_erlang_proper_client_price_suggest_offer_dto/0]).

-export([ympa_erlang_proper_client_price_suggest_offer_dto/1]).

-export_type([ympa_erlang_proper_client_price_suggest_offer_dto/0]).

-type ympa_erlang_proper_client_price_suggest_offer_dto() ::
  [ {'marketSku', integer() }
  | {'offerId', binary() }
  | {'priceSuggestion', list(ympa_erlang_proper_client_price_suggest_dto:ympa_erlang_proper_client_price_suggest_dto()) }
  ].


ympa_erlang_proper_client_price_suggest_offer_dto() ->
    ympa_erlang_proper_client_price_suggest_offer_dto([]).

ympa_erlang_proper_client_price_suggest_offer_dto(Fields) ->
  Default = [ {'marketSku', integer() }
            , {'offerId', binary(1, 255) }
            , {'priceSuggestion', list(ympa_erlang_proper_client_price_suggest_dto:ympa_erlang_proper_client_price_suggest_dto()) }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

