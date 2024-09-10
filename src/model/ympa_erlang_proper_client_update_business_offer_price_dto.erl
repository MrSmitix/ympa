-module(ympa_erlang_proper_client_update_business_offer_price_dto).

-include("ympa_erlang_proper_client.hrl").

-export([ympa_erlang_proper_client_update_business_offer_price_dto/0]).

-export([ympa_erlang_proper_client_update_business_offer_price_dto/1]).

-export_type([ympa_erlang_proper_client_update_business_offer_price_dto/0]).

-type ympa_erlang_proper_client_update_business_offer_price_dto() ::
  [ {'offerId', binary() }
  | {'price', ympa_erlang_proper_client_update_price_with_discount_dto:ympa_erlang_proper_client_update_price_with_discount_dto() }
  ].


ympa_erlang_proper_client_update_business_offer_price_dto() ->
    ympa_erlang_proper_client_update_business_offer_price_dto([]).

ympa_erlang_proper_client_update_business_offer_price_dto(Fields) ->
  Default = [ {'offerId', binary(1, 255) }
            , {'price', ympa_erlang_proper_client_update_price_with_discount_dto:ympa_erlang_proper_client_update_price_with_discount_dto() }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

