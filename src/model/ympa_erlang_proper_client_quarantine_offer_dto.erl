-module(ympa_erlang_proper_client_quarantine_offer_dto).

-include("ympa_erlang_proper_client.hrl").

-export([ympa_erlang_proper_client_quarantine_offer_dto/0]).

-export([ympa_erlang_proper_client_quarantine_offer_dto/1]).

-export_type([ympa_erlang_proper_client_quarantine_offer_dto/0]).

-type ympa_erlang_proper_client_quarantine_offer_dto() ::
  [ {'offerId', binary() }
  | {'currentPrice', ympa_erlang_proper_client_base_price_dto:ympa_erlang_proper_client_base_price_dto() }
  | {'lastValidPrice', ympa_erlang_proper_client_base_price_dto:ympa_erlang_proper_client_base_price_dto() }
  | {'verdicts', list(ympa_erlang_proper_client_price_quarantine_verdict_dto:ympa_erlang_proper_client_price_quarantine_verdict_dto()) }
  ].


ympa_erlang_proper_client_quarantine_offer_dto() ->
    ympa_erlang_proper_client_quarantine_offer_dto([]).

ympa_erlang_proper_client_quarantine_offer_dto(Fields) ->
  Default = [ {'offerId', binary(1, 255) }
            , {'currentPrice', ympa_erlang_proper_client_base_price_dto:ympa_erlang_proper_client_base_price_dto() }
            , {'lastValidPrice', ympa_erlang_proper_client_base_price_dto:ympa_erlang_proper_client_base_price_dto() }
            , {'verdicts', list(ympa_erlang_proper_client_price_quarantine_verdict_dto:ympa_erlang_proper_client_price_quarantine_verdict_dto()) }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

