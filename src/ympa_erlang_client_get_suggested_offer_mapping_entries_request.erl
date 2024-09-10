-module(ympa_erlang_client_get_suggested_offer_mapping_entries_request).

-export([encode/1]).

-export_type([ympa_erlang_client_get_suggested_offer_mapping_entries_request/0]).

-type ympa_erlang_client_get_suggested_offer_mapping_entries_request() ::
    #{ 'offers' := list()
     }.

encode(#{ 'offers' := Offers
        }) ->
    #{ 'offers' => Offers
     }.
