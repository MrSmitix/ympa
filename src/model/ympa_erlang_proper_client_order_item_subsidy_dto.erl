-module(ympa_erlang_proper_client_order_item_subsidy_dto).

-include("ympa_erlang_proper_client.hrl").

-export([ympa_erlang_proper_client_order_item_subsidy_dto/0]).

-export([ympa_erlang_proper_client_order_item_subsidy_dto/1]).

-export_type([ympa_erlang_proper_client_order_item_subsidy_dto/0]).

-type ympa_erlang_proper_client_order_item_subsidy_dto() ::
  [ {'type', ympa_erlang_proper_client_order_item_subsidy_type:ympa_erlang_proper_client_order_item_subsidy_type() }
  | {'amount', integer() }
  ].


ympa_erlang_proper_client_order_item_subsidy_dto() ->
    ympa_erlang_proper_client_order_item_subsidy_dto([]).

ympa_erlang_proper_client_order_item_subsidy_dto(Fields) ->
  Default = [ {'type', ympa_erlang_proper_client_order_item_subsidy_type:ympa_erlang_proper_client_order_item_subsidy_type() }
            , {'amount', integer() }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

