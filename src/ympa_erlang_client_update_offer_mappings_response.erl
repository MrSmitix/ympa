-module(ympa_erlang_client_update_offer_mappings_response).

-export([encode/1]).

-export_type([ympa_erlang_client_update_offer_mappings_response/0]).

-type ympa_erlang_client_update_offer_mappings_response() ::
    #{ 'status' => ympa_erlang_client_api_response_status_type:ympa_erlang_client_api_response_status_type(),
       'results' => list()
     }.

encode(#{ 'status' := Status,
          'results' := Results
        }) ->
    #{ 'status' => Status,
       'results' => Results
     }.
