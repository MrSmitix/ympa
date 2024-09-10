-module(ympa_erlang_client_feed_download_dto).

-export([encode/1]).

-export_type([ympa_erlang_client_feed_download_dto/0]).

-type ympa_erlang_client_feed_download_dto() ::
    #{ 'status' => ympa_erlang_client_feed_status_type:ympa_erlang_client_feed_status_type(),
       'error' => ympa_erlang_client_feed_download_error_dto:ympa_erlang_client_feed_download_error_dto()
     }.

encode(#{ 'status' := Status,
          'error' := Error
        }) ->
    #{ 'status' => Status,
       'error' => Error
     }.
