-module(ympa_erlang_client_feed_index_logs_record_dto).

-export([encode/1]).

-export_type([ympa_erlang_client_feed_index_logs_record_dto/0]).

-type ympa_erlang_client_feed_index_logs_record_dto() ::
    #{ 'downloadTime' => ympa_erlang_client_date_time:ympa_erlang_client_date_time(),
       'fileTime' => ympa_erlang_client_date_time:ympa_erlang_client_date_time(),
       'generationId' => integer(),
       'indexType' => ympa_erlang_client_feed_index_logs_index_type:ympa_erlang_client_feed_index_logs_index_type(),
       'publishedTime' => ympa_erlang_client_date_time:ympa_erlang_client_date_time(),
       'status' => ympa_erlang_client_feed_index_logs_status_type:ympa_erlang_client_feed_index_logs_status_type(),
       'error' => ympa_erlang_client_feed_index_logs_error_dto:ympa_erlang_client_feed_index_logs_error_dto(),
       'offers' => ympa_erlang_client_feed_index_logs_offers_dto:ympa_erlang_client_feed_index_logs_offers_dto()
     }.

encode(#{ 'downloadTime' := DownloadTime,
          'fileTime' := FileTime,
          'generationId' := GenerationId,
          'indexType' := IndexType,
          'publishedTime' := PublishedTime,
          'status' := Status,
          'error' := Error,
          'offers' := Offers
        }) ->
    #{ 'downloadTime' => DownloadTime,
       'fileTime' => FileTime,
       'generationId' => GenerationId,
       'indexType' => IndexType,
       'publishedTime' => PublishedTime,
       'status' => Status,
       'error' => Error,
       'offers' => Offers
     }.
