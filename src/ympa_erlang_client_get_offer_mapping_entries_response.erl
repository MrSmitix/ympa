-module(ympa_erlang_client_get_offer_mapping_entries_response).

-export([encode/1]).

-export_type([ympa_erlang_client_get_offer_mapping_entries_response/0]).

-type ympa_erlang_client_get_offer_mapping_entries_response() ::
    #{ 'status' => ympa_erlang_client_api_response_status_type:ympa_erlang_client_api_response_status_type(),
       'result' => ympa_erlang_client_offer_mapping_entries_dto:ympa_erlang_client_offer_mapping_entries_dto()
     }.

encode(#{ 'status' := Status,
          'result' := Result
        }) ->
    #{ 'status' => Status,
       'result' => Result
     }.
