-module(ympa_erlang_client_order_item_detail_dto).

-export([encode/1]).

-export_type([ympa_erlang_client_order_item_detail_dto/0]).

-type ympa_erlang_client_order_item_detail_dto() ::
    #{ 'itemCount' => integer(),
       'itemStatus' => ympa_erlang_client_order_item_status_type:ympa_erlang_client_order_item_status_type(),
       'updateDate' => binary()
     }.

encode(#{ 'itemCount' := ItemCount,
          'itemStatus' := ItemStatus,
          'updateDate' := UpdateDate
        }) ->
    #{ 'itemCount' => ItemCount,
       'itemStatus' => ItemStatus,
       'updateDate' => UpdateDate
     }.
