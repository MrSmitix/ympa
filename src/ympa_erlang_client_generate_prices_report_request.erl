-module(ympa_erlang_client_generate_prices_report_request).

-export([encode/1]).

-export_type([ympa_erlang_client_generate_prices_report_request/0]).

-type ympa_erlang_client_generate_prices_report_request() ::
    #{ 'businessId' => integer(),
       'campaignId' => integer(),
       'categoryIds' => list(),
       'creationDateFrom' => calendar:date(),
       'creationDateTo' => calendar:date()
     }.

encode(#{ 'businessId' := BusinessId,
          'campaignId' := CampaignId,
          'categoryIds' := CategoryIds,
          'creationDateFrom' := CreationDateFrom,
          'creationDateTo' := CreationDateTo
        }) ->
    #{ 'businessId' => BusinessId,
       'campaignId' => CampaignId,
       'categoryIds' => CategoryIds,
       'creationDateFrom' => CreationDateFrom,
       'creationDateTo' => CreationDateTo
     }.
