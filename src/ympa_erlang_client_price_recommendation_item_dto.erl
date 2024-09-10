-module(ympa_erlang_client_price_recommendation_item_dto).

-export([encode/1]).

-export_type([ympa_erlang_client_price_recommendation_item_dto/0]).

-type ympa_erlang_client_price_recommendation_item_dto() ::
    #{ 'campaignId' := integer(),
       'price' := integer()
     }.

encode(#{ 'campaignId' := CampaignId,
          'price' := Price
        }) ->
    #{ 'campaignId' => CampaignId,
       'price' => Price
     }.
