-module(ympa_erlang_client_promo_offer_auto_participating_details_dto).

-export([encode/1]).

-export_type([ympa_erlang_client_promo_offer_auto_participating_details_dto/0]).

-type ympa_erlang_client_promo_offer_auto_participating_details_dto() ::
    #{ 'campaignIds' => list()
     }.

encode(#{ 'campaignIds' := CampaignIds
        }) ->
    #{ 'campaignIds' => CampaignIds
     }.
