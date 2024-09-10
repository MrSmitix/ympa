-module(ympa_erlang_proper_client_goods_stats_goods_dto).

-include("ympa_erlang_proper_client.hrl").

-export([ympa_erlang_proper_client_goods_stats_goods_dto/0]).

-export([ympa_erlang_proper_client_goods_stats_goods_dto/1]).

-export_type([ympa_erlang_proper_client_goods_stats_goods_dto/0]).

-type ympa_erlang_proper_client_goods_stats_goods_dto() ::
  [ {'shopSku', binary() }
  | {'marketSku', integer() }
  | {'name', binary() }
  | {'price', integer() }
  | {'categoryId', integer() }
  | {'categoryName', binary() }
  | {'weightDimensions', ympa_erlang_proper_client_goods_stats_weight_dimensions_dto:ympa_erlang_proper_client_goods_stats_weight_dimensions_dto() }
  | {'warehouses', list(ympa_erlang_proper_client_goods_stats_warehouse_dto:ympa_erlang_proper_client_goods_stats_warehouse_dto()) }
  | {'tariffs', list(ympa_erlang_proper_client_tariff_dto:ympa_erlang_proper_client_tariff_dto()) }
  | {'pictures', list(binary()) }
  ].


ympa_erlang_proper_client_goods_stats_goods_dto() ->
    ympa_erlang_proper_client_goods_stats_goods_dto([]).

ympa_erlang_proper_client_goods_stats_goods_dto(Fields) ->
  Default = [ {'shopSku', binary(1, 255) }
            , {'marketSku', integer() }
            , {'name', binary() }
            , {'price', integer() }
            , {'categoryId', integer() }
            , {'categoryName', binary() }
            , {'weightDimensions', ympa_erlang_proper_client_goods_stats_weight_dimensions_dto:ympa_erlang_proper_client_goods_stats_weight_dimensions_dto() }
            , {'warehouses', list(ympa_erlang_proper_client_goods_stats_warehouse_dto:ympa_erlang_proper_client_goods_stats_warehouse_dto()) }
            , {'tariffs', list(ympa_erlang_proper_client_tariff_dto:ympa_erlang_proper_client_tariff_dto()) }
            , {'pictures', list(binary()) }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

