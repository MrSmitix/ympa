-module(ympa_erlang_client_update_offer_mappings_request).

-export([encode/1]).

-export_type([ympa_erlang_client_update_offer_mappings_request/0]).

-type ympa_erlang_client_update_offer_mappings_request() ::
    #{ 'offerMappings' := list(),
       'onlyPartnerMediaContent' => boolean()
     }.

encode(#{ 'offerMappings' := OfferMappings,
          'onlyPartnerMediaContent' := OnlyPartnerMediaContent
        }) ->
    #{ 'offerMappings' => OfferMappings,
       'onlyPartnerMediaContent' => OnlyPartnerMediaContent
     }.
