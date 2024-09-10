-module(ympa_erlang_client_feed_publication_price_and_stock_update_dto).

-export([encode/1]).

-export_type([ympa_erlang_client_feed_publication_price_and_stock_update_dto/0]).

-type ympa_erlang_client_feed_publication_price_and_stock_update_dto() ::
    #{ 'fileTime' => ympa_erlang_client_date_time:ympa_erlang_client_date_time(),
       'publishedTime' => ympa_erlang_client_date_time:ympa_erlang_client_date_time()
     }.

encode(#{ 'fileTime' := FileTime,
          'publishedTime' := PublishedTime
        }) ->
    #{ 'fileTime' => FileTime,
       'publishedTime' => PublishedTime
     }.
