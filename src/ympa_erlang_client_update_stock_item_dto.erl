-module(ympa_erlang_client_update_stock_item_dto).

-export([encode/1]).

-export_type([ympa_erlang_client_update_stock_item_dto/0]).

-type ympa_erlang_client_update_stock_item_dto() ::
    #{ 'count' := integer(),
       'updatedAt' => ympa_erlang_client_date_time:ympa_erlang_client_date_time()
     }.

encode(#{ 'count' := Count,
          'updatedAt' := UpdatedAt
        }) ->
    #{ 'count' => Count,
       'updatedAt' => UpdatedAt
     }.
