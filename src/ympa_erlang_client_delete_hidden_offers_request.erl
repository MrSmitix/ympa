-module(ympa_erlang_client_delete_hidden_offers_request).

-export([encode/1]).

-export_type([ympa_erlang_client_delete_hidden_offers_request/0]).

-type ympa_erlang_client_delete_hidden_offers_request() ::
    #{ 'hiddenOffers' := list()
     }.

encode(#{ 'hiddenOffers' := HiddenOffers
        }) ->
    #{ 'hiddenOffers' => HiddenOffers
     }.
