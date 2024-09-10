-module(ympa_erlang_proper_client_get_promo_assortment_info_dto).

-include("ympa_erlang_proper_client.hrl").

-export([ympa_erlang_proper_client_get_promo_assortment_info_dto/0]).

-export([ympa_erlang_proper_client_get_promo_assortment_info_dto/1]).

-export_type([ympa_erlang_proper_client_get_promo_assortment_info_dto/0]).

-type ympa_erlang_proper_client_get_promo_assortment_info_dto() ::
  [ {'activeOffers', integer() }
  | {'potentialOffers', integer() }
  | {'processing', boolean() }
  ].


ympa_erlang_proper_client_get_promo_assortment_info_dto() ->
    ympa_erlang_proper_client_get_promo_assortment_info_dto([]).

ympa_erlang_proper_client_get_promo_assortment_info_dto(Fields) ->
  Default = [ {'activeOffers', integer() }
            , {'potentialOffers', integer() }
            , {'processing', boolean() }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

