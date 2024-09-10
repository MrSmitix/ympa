-module(ympa_erlang_proper_client_order_item_instance_dto).

-include("ympa_erlang_proper_client.hrl").

-export([ympa_erlang_proper_client_order_item_instance_dto/0]).

-export([ympa_erlang_proper_client_order_item_instance_dto/1]).

-export_type([ympa_erlang_proper_client_order_item_instance_dto/0]).

-type ympa_erlang_proper_client_order_item_instance_dto() ::
  [ {'cis', binary() }
  | {'cisFull', binary() }
  | {'uin', binary() }
  | {'rnpt', binary() }
  | {'gtd', binary() }
  ].


ympa_erlang_proper_client_order_item_instance_dto() ->
    ympa_erlang_proper_client_order_item_instance_dto([]).

ympa_erlang_proper_client_order_item_instance_dto(Fields) ->
  Default = [ {'cis', binary() }
            , {'cisFull', binary() }
            , {'uin', binary() }
            , {'rnpt', binary() }
            , {'gtd', binary() }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

