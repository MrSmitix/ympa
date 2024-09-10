-module(ympa_erlang_proper_client_update_promo_offer_params_dto).

-include("ympa_erlang_proper_client.hrl").

-export([ympa_erlang_proper_client_update_promo_offer_params_dto/0]).

-export([ympa_erlang_proper_client_update_promo_offer_params_dto/1]).

-export_type([ympa_erlang_proper_client_update_promo_offer_params_dto/0]).

-type ympa_erlang_proper_client_update_promo_offer_params_dto() ::
  [ {'discountParams', ympa_erlang_proper_client_update_promo_offer_discount_params_dto:ympa_erlang_proper_client_update_promo_offer_discount_params_dto() }
  ].


ympa_erlang_proper_client_update_promo_offer_params_dto() ->
    ympa_erlang_proper_client_update_promo_offer_params_dto([]).

ympa_erlang_proper_client_update_promo_offer_params_dto(Fields) ->
  Default = [ {'discountParams', ympa_erlang_proper_client_update_promo_offer_discount_params_dto:ympa_erlang_proper_client_update_promo_offer_discount_params_dto() }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

