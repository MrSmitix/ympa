-module(ympa_erlang_client_goods_stats_dto).

-export([encode/1]).

-export_type([ympa_erlang_client_goods_stats_dto/0]).

-type ympa_erlang_client_goods_stats_dto() ::
    #{ 'shopSkus' := list()
     }.

encode(#{ 'shopSkus' := ShopSkus
        }) ->
    #{ 'shopSkus' => ShopSkus
     }.
