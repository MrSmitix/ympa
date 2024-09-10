-module(ympa_erlang_client_campaigns_quality_rating_dto).

-export([encode/1]).

-export_type([ympa_erlang_client_campaigns_quality_rating_dto/0]).

-type ympa_erlang_client_campaigns_quality_rating_dto() ::
    #{ 'campaignRatings' := list()
     }.

encode(#{ 'campaignRatings' := CampaignRatings
        }) ->
    #{ 'campaignRatings' => CampaignRatings
     }.
