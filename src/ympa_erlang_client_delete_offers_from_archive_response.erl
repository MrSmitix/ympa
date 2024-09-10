-module(ympa_erlang_client_delete_offers_from_archive_response).

-export([encode/1]).

-export_type([ympa_erlang_client_delete_offers_from_archive_response/0]).

-type ympa_erlang_client_delete_offers_from_archive_response() ::
    #{ 'status' => ympa_erlang_client_api_response_status_type:ympa_erlang_client_api_response_status_type(),
       'result' => ympa_erlang_client_delete_offers_from_archive_dto:ympa_erlang_client_delete_offers_from_archive_dto()
     }.

encode(#{ 'status' := Status,
          'result' := Result
        }) ->
    #{ 'status' => Status,
       'result' => Result
     }.
