-module(ympa_erlang_client_get_quality_rating_request).

-export([encode/1]).

-export_type([ympa_erlang_client_get_quality_rating_request/0]).

-type ympa_erlang_client_get_quality_rating_request() ::
    #{ 'dateFrom' => calendar:date(),
       'dateTo' => calendar:date(),
       'campaignIds' := ympa_erlang_client_set:ympa_erlang_client_set()
     }.

encode(#{ 'dateFrom' := DateFrom,
          'dateTo' := DateTo,
          'campaignIds' := CampaignIds
        }) ->
    #{ 'dateFrom' => DateFrom,
       'dateTo' => DateTo,
       'campaignIds' => CampaignIds
     }.
