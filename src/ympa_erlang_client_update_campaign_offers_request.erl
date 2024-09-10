-module(ympa_erlang_client_update_campaign_offers_request).

-export([encode/1]).

-export_type([ympa_erlang_client_update_campaign_offers_request/0]).

-type ympa_erlang_client_update_campaign_offers_request() ::
    #{ 'offers' := list()
     }.

encode(#{ 'offers' := Offers
        }) ->
    #{ 'offers' => Offers
     }.
