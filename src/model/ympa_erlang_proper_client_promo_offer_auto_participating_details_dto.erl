-module(ympa_erlang_proper_client_promo_offer_auto_participating_details_dto).

-include("ympa_erlang_proper_client.hrl").

-export([ympa_erlang_proper_client_promo_offer_auto_participating_details_dto/0]).

-export([ympa_erlang_proper_client_promo_offer_auto_participating_details_dto/1]).

-export_type([ympa_erlang_proper_client_promo_offer_auto_participating_details_dto/0]).

-type ympa_erlang_proper_client_promo_offer_auto_participating_details_dto() ::
  [ {'campaignIds', list(integer()) }
  ].


ympa_erlang_proper_client_promo_offer_auto_participating_details_dto() ->
    ympa_erlang_proper_client_promo_offer_auto_participating_details_dto([]).

ympa_erlang_proper_client_promo_offer_auto_participating_details_dto(Fields) ->
  Default = [ {'campaignIds', list(integer()) }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

