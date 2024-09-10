-module(ympa_erlang_proper_client_suggest_offer_price_dto).

-include("ympa_erlang_proper_client.hrl").

-export([ympa_erlang_proper_client_suggest_offer_price_dto/0]).

-export([ympa_erlang_proper_client_suggest_offer_price_dto/1]).

-export_type([ympa_erlang_proper_client_suggest_offer_price_dto/0]).

-type ympa_erlang_proper_client_suggest_offer_price_dto() ::
  [ {'offerId', binary() }
  | {'marketSku', integer() }
  ].


ympa_erlang_proper_client_suggest_offer_price_dto() ->
    ympa_erlang_proper_client_suggest_offer_price_dto([]).

ympa_erlang_proper_client_suggest_offer_price_dto(Fields) ->
  Default = [ {'offerId', binary(1, 255) }
            , {'marketSku', integer() }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

