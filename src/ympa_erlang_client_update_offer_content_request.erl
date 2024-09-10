-module(ympa_erlang_client_update_offer_content_request).

-export([encode/1]).

-export_type([ympa_erlang_client_update_offer_content_request/0]).

-type ympa_erlang_client_update_offer_content_request() ::
    #{ 'offersContent' := list()
     }.

encode(#{ 'offersContent' := OffersContent
        }) ->
    #{ 'offersContent' => OffersContent
     }.
