-module(ympa_erlang_proper_client_delete_promo_offers_result_dto).

-include("ympa_erlang_proper_client.hrl").

-export([ympa_erlang_proper_client_delete_promo_offers_result_dto/0]).

-export([ympa_erlang_proper_client_delete_promo_offers_result_dto/1]).

-export_type([ympa_erlang_proper_client_delete_promo_offers_result_dto/0]).

-type ympa_erlang_proper_client_delete_promo_offers_result_dto() ::
  [ {'rejectedOffers', list(ympa_erlang_proper_client_rejected_promo_offer_delete_dto:ympa_erlang_proper_client_rejected_promo_offer_delete_dto()) }
  ].


ympa_erlang_proper_client_delete_promo_offers_result_dto() ->
    ympa_erlang_proper_client_delete_promo_offers_result_dto([]).

ympa_erlang_proper_client_delete_promo_offers_result_dto(Fields) ->
  Default = [ {'rejectedOffers', list(ympa_erlang_proper_client_rejected_promo_offer_delete_dto:ympa_erlang_proper_client_rejected_promo_offer_delete_dto()) }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

