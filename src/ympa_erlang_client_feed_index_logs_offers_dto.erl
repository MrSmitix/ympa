-module(ympa_erlang_client_feed_index_logs_offers_dto).

-export([encode/1]).

-export_type([ympa_erlang_client_feed_index_logs_offers_dto/0]).

-type ympa_erlang_client_feed_index_logs_offers_dto() ::
    #{ 'rejectedCount' => integer(),
       'totalCount' => integer()
     }.

encode(#{ 'rejectedCount' := RejectedCount,
          'totalCount' := TotalCount
        }) ->
    #{ 'rejectedCount' => RejectedCount,
       'totalCount' => TotalCount
     }.
