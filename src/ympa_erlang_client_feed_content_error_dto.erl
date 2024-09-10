-module(ympa_erlang_client_feed_content_error_dto).

-export([encode/1]).

-export_type([ympa_erlang_client_feed_content_error_dto/0]).

-type ympa_erlang_client_feed_content_error_dto() ::
    #{ 'type' => ympa_erlang_client_feed_content_error_type:ympa_erlang_client_feed_content_error_type()
     }.

encode(#{ 'type' := Type
        }) ->
    #{ 'type' => Type
     }.
