-module(ympa_erlang_proper_client_get_promo_dto).

-include("ympa_erlang_proper_client.hrl").

-export([ympa_erlang_proper_client_get_promo_dto/0]).

-export([ympa_erlang_proper_client_get_promo_dto/1]).

-export_type([ympa_erlang_proper_client_get_promo_dto/0]).

-type ympa_erlang_proper_client_get_promo_dto() ::
  [ {'id', binary() }
  | {'name', binary() }
  | {'period', ympa_erlang_proper_client_promo_period_dto:ympa_erlang_proper_client_promo_period_dto() }
  | {'participating', boolean() }
  | {'assortmentInfo', ympa_erlang_proper_client_get_promo_assortment_info_dto:ympa_erlang_proper_client_get_promo_assortment_info_dto() }
  | {'mechanicsInfo', ympa_erlang_proper_client_get_promo_mechanics_info_dto:ympa_erlang_proper_client_get_promo_mechanics_info_dto() }
  | {'bestsellerInfo', ympa_erlang_proper_client_get_promo_bestseller_info_dto:ympa_erlang_proper_client_get_promo_bestseller_info_dto() }
  | {'channels', list(ympa_erlang_proper_client_channel_type:ympa_erlang_proper_client_channel_type()) }
  | {'constraints', ympa_erlang_proper_client_get_promo_constraints_dto:ympa_erlang_proper_client_get_promo_constraints_dto() }
  ].


ympa_erlang_proper_client_get_promo_dto() ->
    ympa_erlang_proper_client_get_promo_dto([]).

ympa_erlang_proper_client_get_promo_dto(Fields) ->
  Default = [ {'id', binary() }
            , {'name', binary() }
            , {'period', ympa_erlang_proper_client_promo_period_dto:ympa_erlang_proper_client_promo_period_dto() }
            , {'participating', boolean() }
            , {'assortmentInfo', ympa_erlang_proper_client_get_promo_assortment_info_dto:ympa_erlang_proper_client_get_promo_assortment_info_dto() }
            , {'mechanicsInfo', ympa_erlang_proper_client_get_promo_mechanics_info_dto:ympa_erlang_proper_client_get_promo_mechanics_info_dto() }
            , {'bestsellerInfo', ympa_erlang_proper_client_get_promo_bestseller_info_dto:ympa_erlang_proper_client_get_promo_bestseller_info_dto() }
            , {'channels', list(ympa_erlang_proper_client_channel_type:ympa_erlang_proper_client_channel_type()) }
            , {'constraints', ympa_erlang_proper_client_get_promo_constraints_dto:ympa_erlang_proper_client_get_promo_constraints_dto() }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

