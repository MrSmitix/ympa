-module(ympa_erlang_client_feed_download_error_dto).

-export([encode/1]).

-export_type([ympa_erlang_client_feed_download_error_dto/0]).

-type ympa_erlang_client_feed_download_error_dto() ::
    #{ 'httpStatusCode' => integer(),
       'type' => ympa_erlang_client_feed_download_error_type:ympa_erlang_client_feed_download_error_type(),
       'description' => binary()
     }.

encode(#{ 'httpStatusCode' := HttpStatusCode,
          'type' := Type,
          'description' := Description
        }) ->
    #{ 'httpStatusCode' => HttpStatusCode,
       'type' => Type,
       'description' => Description
     }.
