-module(ympa_erlang_proper_client_update_promo_offers_request).

-include("ympa_erlang_proper_client.hrl").

-export([ympa_erlang_proper_client_update_promo_offers_request/0]).

-export([ympa_erlang_proper_client_update_promo_offers_request/1]).

-export_type([ympa_erlang_proper_client_update_promo_offers_request/0]).

-type ympa_erlang_proper_client_update_promo_offers_request() ::
  [ {'promoId', binary() }
  | {'offers', list(ympa_erlang_proper_client_update_promo_offer_dto:ympa_erlang_proper_client_update_promo_offer_dto()) }
  ].


ympa_erlang_proper_client_update_promo_offers_request() ->
    ympa_erlang_proper_client_update_promo_offers_request([]).

ympa_erlang_proper_client_update_promo_offers_request(Fields) ->
  Default = [ {'promoId', binary() }
            , {'offers', list(ympa_erlang_proper_client_update_promo_offer_dto:ympa_erlang_proper_client_update_promo_offer_dto(), 1, 500) }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

