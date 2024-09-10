-module(ympa_erlang_client_update_offer_mapping_entry_request).

-export([encode/1]).

-export_type([ympa_erlang_client_update_offer_mapping_entry_request/0]).

-type ympa_erlang_client_update_offer_mapping_entry_request() ::
    #{ 'offerMappingEntries' := list()
     }.

encode(#{ 'offerMappingEntries' := OfferMappingEntries
        }) ->
    #{ 'offerMappingEntries' => OfferMappingEntries
     }.
