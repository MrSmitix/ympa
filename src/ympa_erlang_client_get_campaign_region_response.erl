-module(ympa_erlang_client_get_campaign_region_response).

-export([encode/1]).

-export_type([ympa_erlang_client_get_campaign_region_response/0]).

-type ympa_erlang_client_get_campaign_region_response() ::
    #{ 'region' => ympa_erlang_client_region_dto:ympa_erlang_client_region_dto()
     }.

encode(#{ 'region' := Region
        }) ->
    #{ 'region' => Region
     }.
