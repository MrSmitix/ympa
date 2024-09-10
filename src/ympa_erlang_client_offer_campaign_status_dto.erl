-module(ympa_erlang_client_offer_campaign_status_dto).

-export([encode/1]).

-export_type([ympa_erlang_client_offer_campaign_status_dto/0]).

-type ympa_erlang_client_offer_campaign_status_dto() ::
    #{ 'campaignId' := integer(),
       'status' := ympa_erlang_client_offer_campaign_status_type:ympa_erlang_client_offer_campaign_status_type()
     }.

encode(#{ 'campaignId' := CampaignId,
          'status' := Status
        }) ->
    #{ 'campaignId' => CampaignId,
       'status' => Status
     }.
