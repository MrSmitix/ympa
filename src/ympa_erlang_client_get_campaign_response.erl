-module(ympa_erlang_client_get_campaign_response).

-export([encode/1]).

-export_type([ympa_erlang_client_get_campaign_response/0]).

-type ympa_erlang_client_get_campaign_response() ::
    #{ 'campaign' => ympa_erlang_client_campaign_dto:ympa_erlang_client_campaign_dto()
     }.

encode(#{ 'campaign' := Campaign
        }) ->
    #{ 'campaign' => Campaign
     }.
