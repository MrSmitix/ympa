-module(ympa_erlang_client_generate_goods_realization_report_request).

-export([encode/1]).

-export_type([ympa_erlang_client_generate_goods_realization_report_request/0]).

-type ympa_erlang_client_generate_goods_realization_report_request() ::
    #{ 'campaignId' := integer(),
       'year' := integer(),
       'month' := integer()
     }.

encode(#{ 'campaignId' := CampaignId,
          'year' := Year,
          'month' := Month
        }) ->
    #{ 'campaignId' => CampaignId,
       'year' => Year,
       'month' => Month
     }.
