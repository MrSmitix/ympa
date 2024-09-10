-module(ympa_erlang_client_delete_campaign_offers_request).

-export([encode/1]).

-export_type([ympa_erlang_client_delete_campaign_offers_request/0]).

-type ympa_erlang_client_delete_campaign_offers_request() ::
    #{ 'offerIds' := list()
     }.

encode(#{ 'offerIds' := OfferIds
        }) ->
    #{ 'offerIds' => OfferIds
     }.
