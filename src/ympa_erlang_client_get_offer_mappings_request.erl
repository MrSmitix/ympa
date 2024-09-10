-module(ympa_erlang_client_get_offer_mappings_request).

-export([encode/1]).

-export_type([ympa_erlang_client_get_offer_mappings_request/0]).

-type ympa_erlang_client_get_offer_mappings_request() ::
    #{ 'offerIds' => list(),
       'cardStatuses' => list(),
       'categoryIds' => list(),
       'vendorNames' => list(),
       'tags' => list(),
       'archived' => boolean()
     }.

encode(#{ 'offerIds' := OfferIds,
          'cardStatuses' := CardStatuses,
          'categoryIds' := CategoryIds,
          'vendorNames' := VendorNames,
          'tags' := Tags,
          'archived' := Archived
        }) ->
    #{ 'offerIds' => OfferIds,
       'cardStatuses' => CardStatuses,
       'categoryIds' => CategoryIds,
       'vendorNames' => VendorNames,
       'tags' => Tags,
       'archived' => Archived
     }.
