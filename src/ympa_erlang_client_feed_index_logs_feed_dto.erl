-module(ympa_erlang_client_feed_index_logs_feed_dto).

-export([encode/1]).

-export_type([ympa_erlang_client_feed_index_logs_feed_dto/0]).

-type ympa_erlang_client_feed_index_logs_feed_dto() ::
    #{ 'id' => integer()
     }.

encode(#{ 'id' := Id
        }) ->
    #{ 'id' => Id
     }.
