-module(ympa_erlang_client_get_goods_stats_request).

-export([encode/1]).

-export_type([ympa_erlang_client_get_goods_stats_request/0]).

-type ympa_erlang_client_get_goods_stats_request() ::
    #{ 'shopSkus' := ympa_erlang_client_set:ympa_erlang_client_set()
     }.

encode(#{ 'shopSkus' := ShopSkus
        }) ->
    #{ 'shopSkus' => ShopSkus
     }.
