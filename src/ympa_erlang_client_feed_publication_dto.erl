-module(ympa_erlang_client_feed_publication_dto).

-export([encode/1]).

-export_type([ympa_erlang_client_feed_publication_dto/0]).

-type ympa_erlang_client_feed_publication_dto() ::
    #{ 'status' => ympa_erlang_client_feed_status_type:ympa_erlang_client_feed_status_type(),
       'full' => ympa_erlang_client_feed_publication_full_dto:ympa_erlang_client_feed_publication_full_dto(),
       'priceAndStockUpdate' => ympa_erlang_client_feed_publication_price_and_stock_update_dto:ympa_erlang_client_feed_publication_price_and_stock_update_dto()
     }.

encode(#{ 'status' := Status,
          'full' := Full,
          'priceAndStockUpdate' := PriceAndStockUpdate
        }) ->
    #{ 'status' => Status,
       'full' => Full,
       'priceAndStockUpdate' => PriceAndStockUpdate
     }.
