-module(ympa_erlang_client_campaign_quality_rating_dto).

-export([encode/1]).

-export_type([ympa_erlang_client_campaign_quality_rating_dto/0]).

-type ympa_erlang_client_campaign_quality_rating_dto() ::
    #{ 'campaignId' := integer(),
       'ratings' := list()
     }.

encode(#{ 'campaignId' := CampaignId,
          'ratings' := Ratings
        }) ->
    #{ 'campaignId' => CampaignId,
       'ratings' => Ratings
     }.
