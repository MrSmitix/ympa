-module(ympa_erlang_client_generate_goods_turnover_request).

-export([encode/1]).

-export_type([ympa_erlang_client_generate_goods_turnover_request/0]).

-type ympa_erlang_client_generate_goods_turnover_request() ::
    #{ 'campaignId' := integer(),
       'date' => calendar:date()
     }.

encode(#{ 'campaignId' := CampaignId,
          'date' := Date
        }) ->
    #{ 'campaignId' => CampaignId,
       'date' => Date
     }.
