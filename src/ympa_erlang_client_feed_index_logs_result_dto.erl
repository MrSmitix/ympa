-module(ympa_erlang_client_feed_index_logs_result_dto).

-export([encode/1]).

-export_type([ympa_erlang_client_feed_index_logs_result_dto/0]).

-type ympa_erlang_client_feed_index_logs_result_dto() ::
    #{ 'feed' => ympa_erlang_client_feed_index_logs_feed_dto:ympa_erlang_client_feed_index_logs_feed_dto(),
       'indexLogRecords' := list(),
       'total' => integer()
     }.

encode(#{ 'feed' := Feed,
          'indexLogRecords' := IndexLogRecords,
          'total' := Total
        }) ->
    #{ 'feed' => Feed,
       'indexLogRecords' => IndexLogRecords,
       'total' => Total
     }.
