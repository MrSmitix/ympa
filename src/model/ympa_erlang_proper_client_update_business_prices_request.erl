-module(ympa_erlang_proper_client_update_business_prices_request).

-include("ympa_erlang_proper_client.hrl").

-export([ympa_erlang_proper_client_update_business_prices_request/0]).

-export([ympa_erlang_proper_client_update_business_prices_request/1]).

-export_type([ympa_erlang_proper_client_update_business_prices_request/0]).

-type ympa_erlang_proper_client_update_business_prices_request() ::
  [ {'offers', list(ympa_erlang_proper_client_update_business_offer_price_dto:ympa_erlang_proper_client_update_business_offer_price_dto()) }
  ].


ympa_erlang_proper_client_update_business_prices_request() ->
    ympa_erlang_proper_client_update_business_prices_request([]).

ympa_erlang_proper_client_update_business_prices_request(Fields) ->
  Default = [ {'offers', list(ympa_erlang_proper_client_update_business_offer_price_dto:ympa_erlang_proper_client_update_business_offer_price_dto(), 1, 500) }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

