-module(ympa_erlang_proper_client_promo_offer_discount_params_dto).

-include("ympa_erlang_proper_client.hrl").

-export([ympa_erlang_proper_client_promo_offer_discount_params_dto/0]).

-export([ympa_erlang_proper_client_promo_offer_discount_params_dto/1]).

-export_type([ympa_erlang_proper_client_promo_offer_discount_params_dto/0]).

-type ympa_erlang_proper_client_promo_offer_discount_params_dto() ::
  [ {'price', integer() }
  | {'promoPrice', integer() }
  | {'maxPromoPrice', integer() }
  ].


ympa_erlang_proper_client_promo_offer_discount_params_dto() ->
    ympa_erlang_proper_client_promo_offer_discount_params_dto([]).

ympa_erlang_proper_client_promo_offer_discount_params_dto(Fields) ->
  Default = [ {'price', integer() }
            , {'promoPrice', integer() }
            , {'maxPromoPrice', integer() }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

