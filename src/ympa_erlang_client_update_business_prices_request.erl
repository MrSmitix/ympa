-module(ympa_erlang_client_update_business_prices_request).

-export([encode/1]).

-export_type([ympa_erlang_client_update_business_prices_request/0]).

-type ympa_erlang_client_update_business_prices_request() ::
    #{ 'offers' := list()
     }.

encode(#{ 'offers' := Offers
        }) ->
    #{ 'offers' => Offers
     }.
