-module(ympa_erlang_client_get_campaign_offers_request).

-export([encode/1]).

-export_type([ympa_erlang_client_get_campaign_offers_request/0]).

-type ympa_erlang_client_get_campaign_offers_request() ::
    #{ 'offerIds' => list(),
       'statuses' => list(),
       'categoryIds' => list(),
       'vendorNames' => list(),
       'tags' => list()
     }.

encode(#{ 'offerIds' := OfferIds,
          'statuses' := Statuses,
          'categoryIds' := CategoryIds,
          'vendorNames' := VendorNames,
          'tags' := Tags
        }) ->
    #{ 'offerIds' => OfferIds,
       'statuses' => Statuses,
       'categoryIds' => CategoryIds,
       'vendorNames' => VendorNames,
       'tags' => Tags
     }.
