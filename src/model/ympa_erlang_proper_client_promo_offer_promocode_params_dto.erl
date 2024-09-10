-module(ympa_erlang_proper_client_promo_offer_promocode_params_dto).

-include("ympa_erlang_proper_client.hrl").

-export([ympa_erlang_proper_client_promo_offer_promocode_params_dto/0]).

-export([ympa_erlang_proper_client_promo_offer_promocode_params_dto/1]).

-export_type([ympa_erlang_proper_client_promo_offer_promocode_params_dto/0]).

-type ympa_erlang_proper_client_promo_offer_promocode_params_dto() ::
  [ {'maxPrice', integer() }
  ].


ympa_erlang_proper_client_promo_offer_promocode_params_dto() ->
    ympa_erlang_proper_client_promo_offer_promocode_params_dto([]).

ympa_erlang_proper_client_promo_offer_promocode_params_dto(Fields) ->
  Default = [ {'maxPrice', integer() }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

